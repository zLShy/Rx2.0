package Rx;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by zhangli on 2018/6/27.
 */

public class Rx2Utils {
    /**
     * create 创建Obseravble
     * @return
     */
    public static Observable<String> CreateObserval() {
        return Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> e) throws Exception {
                if (!e.isDisposed()) {
                    e.onNext("hahah");
                    e.onNext("hehehe");
                    e.onComplete();

                }
            }
        });
    }

}
