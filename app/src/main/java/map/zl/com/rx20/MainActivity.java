package map.zl.com.rx20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.IOException;

import Rx.CallBacks;
import Rx.ProgressObserver;
import Rx.Rx2Utils;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import okhttp3.ResponseBody;
import presenter.MoviePresenterCompl;
import retrofit2.Response;
import view.IMovieView;

public class MainActivity extends AppCompatActivity implements IMovieView {

    private static String TGA = "TGA";
    private MoviePresenterCompl moviePresenterCompl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void createOb(View view) {

//        Rx2Utils.CreateObserval().subscribe(new Observer<String>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(String s) {
//                Log.e(TGA,s);
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//                Log.e(TGA,"onCom");
//            }
//        });

        ProgressObserver po = new ProgressObserver(new CallBacks() {
            @Override
            public void onSuccess(Object o) {

            }

            @Override
            public void onFail(Object o) {

            }
        });
    }

    public void getMovie(View view) {

        moviePresenterCompl = new MoviePresenterCompl(this);
        moviePresenterCompl.getMovieParm(0,25);
    }

    @Override
    public void ShowMovie(Object o) {
        Log.e(TGA,((Response<ResponseBody>)o).code()+"==code");
        try {
            Log.e(TGA,((Response<ResponseBody>)o).body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ShowFail(Object o) {

    }
}
