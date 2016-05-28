package com.love.lixinxin.lee.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.love.lixinxin.lee.bean.MeiZhiBean;
import com.love.lixinxin.lee.ui.holder.MeiZhiViewHolder;

/**
 * Created by Administrator on 2016/5/28.
 */
public class MeiZhiAdapter extends RecyclerArrayAdapter<MeiZhiBean.ResultsBean> {
    public MeiZhiAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new MeiZhiViewHolder(parent);
    }
}
