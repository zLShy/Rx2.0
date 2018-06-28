package model;

import Rx.CallBacks;

/**
 * Created by zhangli on 2018/6/27.
 */

public interface IMovieDao {
    void sendGetPamera(int satrt, int count, CallBacks callBacks);
}
