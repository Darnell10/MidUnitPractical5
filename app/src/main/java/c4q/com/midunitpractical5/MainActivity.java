package c4q.com.midunitpractical5;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Whos This?";
    private UserService userService;
    private ImageView userimage;
    private Button refreshButton;
    private String userUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userimage = findViewById(R.id.user_image);
        refreshButton = findViewById(R.id.new_user);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://randomuser.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        userService = retrofit.create(UserService.class);

        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<UserModel> user = userService.getUser();
                user.enqueue(new Callback<UserModel>() {
                    @Override
                    public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                        Log.d(TAG, "onResponse" + response.body());
                        userUrl = response.body().toString();
                        Picasso.with(getApplicationContext())
                                .load(response.body().toString())
                                .into(userimage);

                    }

                    @Override
                    public void onFailure(Call<UserModel> call, Throwable t) {
                        Log.d(TAG, "On Response" + t.toString());

                    }
                });
            }
        });

        if (savedInstanceState != null) {
            String savedUser = savedInstanceState.getString("savedUser");
            Picasso.with(getApplicationContext())
                    .load(savedUser)
                    .into(userimage);
        } else {
            refreshButton.callOnClick();
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("saveduser", userUrl);
    }
}
