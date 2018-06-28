package Rx;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by zhangli on 2018/6/27.
 */

public class ProgressObserver<T> implements Observer<T> {

    private CallBacks mCallBacks;

    public ProgressObserver(CallBacks mCallBacks) {
        this.mCallBacks = mCallBacks;
    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T o) {
        mCallBacks.onSuccess(o);
    }

    @Override
    public void onError(Throwable e) {
        mCallBacks.onFail(e);
    }

    @Override
    public void onComplete() {

    }
}
