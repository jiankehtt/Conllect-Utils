package com.htt.androidutils.adpterView;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public abstract class CommonAdpter<T> extends BaseAdapter {
    protected Context context;
    protected List<T> datas;
    private final int layoutId;
    
    
    public CommonAdpter(Context context,List<T> datas,int layoutId) {
        this.context = context;
        this.datas = datas;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public T getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = ViewHolder.get(context, convertView, parent, layoutId, position);
        convertView(holder, getItem(position));
        return holder.getConvertView();
    }

    /**
     * 
     * @description 视图和数据绑定处理
     * @param holder
     * @param bean
     * @author 胡同涛
     * @date 2015-8-26 下午12:03:03
     */
    public abstract void convertView(ViewHolder holder, T bean);

}
