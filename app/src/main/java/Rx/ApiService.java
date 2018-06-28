package Rx;

import bean.Movie;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by zhangli on 2018/6/27.
 */

public interface ApiService {
    @POST("paoban/add")
    Observable<Response<ResponseBody>> getAdd(@Body String requestBody);

    @GET("top250")
    Observable<Response<ResponseBody>> getTopMovie(@Query("start") int start, @Query("count") int count);
}
