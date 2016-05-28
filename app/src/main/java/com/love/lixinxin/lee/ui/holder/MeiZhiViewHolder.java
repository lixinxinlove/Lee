package com.love.lixinxin.lee.ui.holder;

import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.love.lixinxin.lee.R;
import com.love.lixinxin.lee.bean.MeiZhiBean;

/**
 * Created by Administrator on 2016/5/28.
 */
public class MeiZhiViewHolder extends BaseViewHolder<MeiZhiBean.ResultsBean> {
    private ImageView image;

    public MeiZhiViewHolder(ViewGroup parent) {
        super(parent, R.layout.meizhi_item);
        image = $(R.id.image);
    }

    @Override
    public void setData(MeiZhiBean.ResultsBean data) {
        super.setData(data);
        Glide.with(getContext())
                .load(data.getUrl())
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .into(image);
    }
}
