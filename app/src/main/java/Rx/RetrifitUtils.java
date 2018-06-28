package Rx;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by zhangli on 2018/6/27.
 */

public class RetrifitUtils {

    public static String baseUrl = "http://api.douban.com/v2/movie/";
    public static ApiService apiService;



    public static ApiService getApiService() {
        if (apiService == null) {
            synchronized (RetrifitUtils.class) {
                if (apiService == null) {
                    new RetrifitUtils();
                }
            }
        }

        return apiService;
    }


    private RetrifitUtils() {
        Retrofit retrofit = new Retrofit.Builder()
//                .client(client)
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())//请求的结果转为实体类
                //适配RxJava2.0,RxJava1.x则为RxJavaCallAdapterFactory.create()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        apiService = retrofit.create(ApiService.class);
    }

}
