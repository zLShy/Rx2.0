package presenter;

import Rx.CallBacks;
import model.IMovieDao;
import model.MovieDao;
import view.IMovieView;

/**
 * Created by zhangli on 2018/6/27.
 */

public class MoviePresenterCompl implements IMoviePresenter {

    private IMovieView iMovieView;
    private IMovieDao iMovieDao;

    public MoviePresenterCompl(IMovieView iMovieView) {
        this.iMovieView = iMovieView;
        this.iMovieDao = new MovieDao();
    }

    @Override
    public void getMovieParm(int start, int count) {
        iMovieDao.sendGetPamera(start, count, new CallBacks() {
            @Override
            public void onSuccess(Object o) {
                iMovieView.ShowMovie(o);
            }

            @Override
            public void onFail(Object o) {
                iMovieView.ShowFail(o);
            }
        });
    }
}
