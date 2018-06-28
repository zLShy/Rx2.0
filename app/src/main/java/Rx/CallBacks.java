package Rx;

/**
 * Created by zhangli on 2018/6/27.
 */

public interface CallBacks<T> {
    void onSuccess(T t);
    void onFail(T t);
}
