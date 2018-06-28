package model;

import Rx.ApiMethods;
import Rx.CallBacks;
import Rx.ProgressObserver;
import bean.Movie;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Created by zhangli on 2018/6/27.
 */

public class MovieDao implements IMovieDao {

    @Override
    public void sendGetPamera(int satrt, int count, final CallBacks callBacks) {



        ApiMethods.getTop(new ProgressObserver<Response<ResponseBody>>(new CallBacks() {
            @Override
            public void onSuccess(Object o) {
                callBacks.onSuccess(o);
            }

            @Override
            public void onFail(Object o) {
                callBacks.onFail(o);
            }
        }),satrt,count);
    }

}
