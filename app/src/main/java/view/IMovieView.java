package view;

/**
 * Created by zhangli on 2018/6/27.
 */

public interface IMovieView<T> {
    void ShowMovie(T t);
    void ShowFail(T t);
}
