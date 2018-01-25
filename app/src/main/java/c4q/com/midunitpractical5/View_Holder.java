package c4q.com.midunitpractical5;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by D on 1/24/18.
 */

public class View_Holder extends RecyclerView.ViewHolder {


    private LinearLayout layout;
    private ImageView image_View;
    private TextView text_View1;
    private TextView text_View2;
    private TextView text_View3;
    private TextView text_View4;
    private TextView text_View5;
    private TextView text_View6;
    private TextView text_View7;


    public View_Holder(View itemView) {
        super(itemView);

        layout = itemView.findViewById(R.id.user_layout);
        image_View = itemView.findViewById(R.id.user_image);
        text_View1 = itemView.findViewById(R.id.user_text_1);
        text_View2 = itemView.findViewById(R.id.user_text_2);
        text_View3 = itemView.findViewById(R.id.user_text_3);
        text_View4 = itemView.findViewById(R.id.user_text_4);
        text_View5 = itemView.findViewById(R.id.user_text_5);
        text_View6 = itemView.findViewById(R.id.user_text_6);
        text_View7 = itemView.findViewById(R.id.user_text_7);


    }

    public void onBind(UserModel userModel){
        final UserModel thisUserModel = userModel;
        text_View1.setText();
    }
}
