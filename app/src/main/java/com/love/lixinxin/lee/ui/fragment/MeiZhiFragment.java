package com.love.lixinxin.lee.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.jude.easyrecyclerview.EasyRecyclerView;
import com.love.lixinxin.lee.R;
import com.love.lixinxin.lee.bean.MeiZhiBean;
import com.love.lixinxin.lee.retrofit.LeeRetrofit;
import com.love.lixinxin.lee.retrofit.LeeService;
import com.love.lixinxin.lee.ui.adapter.MeiZhiAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


public class MeiZhiFragment extends Fragment {

    @BindView(R.id.easyRecyclerView)
    EasyRecyclerView mEasyRecyclerView;

    private MeiZhiAdapter mAdapter;
    private List<MeiZhiBean.ResultsBean> resultsBeanList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resultsBeanList = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_meizhi, container, false);
        ButterKnife.bind(rootView, getActivity());
        initView();
        initData();
        return rootView;
    }

    private void initView() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        // mEasyRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
    }

    private void initData() {
        mAdapter = new MeiZhiAdapter(getContext());
        //    mEasyRecyclerView.setAdapter(new MeiZhiAdapter(getContext()));
        getData("福利", 20, 1);
    }


    private void getData(String type, int count, int page) {

        LeeRetrofit.getRetrofit()
                .create(LeeService.class)
                .getMeiZhi(type, count, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MeiZhiBean>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                    }

                    @Override
                    public void onNext(MeiZhiBean meiZhiBean) {
                        resultsBeanList = meiZhiBean.getResults();
                        Toast.makeText(getActivity(), "" + resultsBeanList.size(), Toast.LENGTH_LONG).show();
                        // mAdapter.addAll(resultsBeanList);
                    }
                });
    }

}
