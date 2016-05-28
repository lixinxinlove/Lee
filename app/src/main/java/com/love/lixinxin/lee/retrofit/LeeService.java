package com.love.lixinxin.lee.retrofit;

import com.love.lixinxin.lee.bean.MeiZhiBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2016/5/28.
 */
public interface LeeService {
    @GET("api/data/{type}/{count}/{page}")
    Observable<MeiZhiBean> getMeiZhi(
            @Path("type") String type,
            @Path("count") int count,
            @Path("page") int page
    );
}
