package c4q.com.midunitpractical5;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by D on 1/24/18.
 */

public interface UserService {

    // https://randomuser.me/api/?nat=us&inc=name,location,cell,email,dob,picture&results=20
    @GET("api/?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<UserModel> getUser();
}
