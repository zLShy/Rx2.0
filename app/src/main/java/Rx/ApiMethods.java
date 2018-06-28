package Rx;


import android.support.annotation.MainThread;

import bean.Movie;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Created by zhangli on 2018/6/27.
 */

public class ApiMethods {

    public static void ApiSubscribe(Observable observable, Observer observer) {
        observable.subscribeOn(Schedulers.io()).unsubscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).
                subscribe(observer);
    }

    /**
     * 获取电影目录
     */

    public static void getTop(Observer<Response<ResponseBody>> observer, int start, int count) {
        ApiSubscribe(RetrifitUtils.getApiService().getTopMovie(start,count),observer);
    }
}
