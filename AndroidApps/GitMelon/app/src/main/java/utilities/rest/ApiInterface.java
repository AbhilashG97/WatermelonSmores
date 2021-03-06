package utilities.rest;

import java.util.ArrayList;

import github.abhilashg97com.gitmelon.objects.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by AbhilashG97 on 15/03/2018.
 */

public interface ApiInterface {

    @GET("users/{user}/repos")
    Call<ArrayList<Repository>> getRepositories(@Path("user") String user);

}
