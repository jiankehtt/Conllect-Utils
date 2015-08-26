package com.htt.androidutils.adpterView;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder implements ViewHolderInterface {
    private final SparseArray<View> views;
    private int position;
    private final View mConvertView;
    private final Context context;

    private ViewHolder(Context context, ViewGroup parent, int layoutId, int postion) {
        this.context = context;
        this.position = postion;
        this.views = new SparseArray<View>();
        this.mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        this.mConvertView.setTag(this);
    }

    public static ViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int postion) {
        if (convertView == null) {
            return new ViewHolder(context, parent, layoutId, postion);
        } else {
            ViewHolder holder = (ViewHolder) convertView.getTag();
            holder.position = postion;
            return holder;
        }
    }

    /**
     * 
     * @description 获取布局中的具体控件
     * @param viewId
     * @return
     * @author 胡同涛
     * @date 2015-8-26 上午11:58:03
     */
    @SuppressWarnings("unchecked")
    public <T extends View> T getView(int viewId) {
        View view = views.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            views.put(viewId, view);
        }

        return (T) view;
    }

    /**
     * 
     * @description 获取itemview
     * @return
     * @author 胡同涛
     * @date 2015-8-26 上午11:46:38
     */
    public View getConvertView() {
        return mConvertView;
    }

    @Override
    public ViewHolder setText(int viewId, String text) {
        TextView tx = getView(viewId);
        tx.setText(text);
        return this;
    }

    @Override
    public ViewHolder setText(int viewId, int resId) {
        setText(viewId, context.getResources().getString(resId));
        return this;
    }

    @Override
    public ViewHolder setImageResource(int viewId, int resId) {
        ImageView view = getView(viewId);
        view.setImageResource(resId);
        return this;
    }

    @Override
    public ViewHolder setImageDrawable(int viewId, Drawable drawable) {
        ImageView view = getView(viewId);
        view.setImageDrawable(drawable);
        return this;
    }

    @Override
    public ViewHolder setSelected(int viewId, boolean selected) {
        View view = getView(viewId);
        view.setSelected(selected);
        return this;
    }

    @Override
    public ViewHolder setBackgroundColor(int viewId, int color) {
        View view = getView(viewId);
        view.setBackgroundColor(color);
        return this;
    }

    @Override
    public ViewHolder setBackgroundResource(int viewId, int resid) {
        View view = getView(viewId);
        view.setBackgroundResource(resid);
        return this;
    }

    @SuppressWarnings("deprecation")
    @Override
    public ViewHolder setBackgroundDrawable(int viewId, Drawable background) {
        View view = getView(viewId);
        view.setBackgroundDrawable(background);
        return this;
    }

    @Override
    public ViewHolder setVisibility(int viewId, int visibility) {
        View view = getView(viewId);
        view.setVisibility(visibility);
        return this;
    }

    @Override
    public void setAllViewInvisiable() {
        setViewVisiable(View.INVISIBLE);
    }

    @Override
    public void setAllViewGone() {
        setViewVisiable(View.GONE);
    }

    private void setViewVisiable(int visable) {
        for (int i = 0; i < views.size(); i++) {
            View view = views.get(views.keyAt(i));
            if (view != null) {
                view.setVisibility(visable);
            }
        }
    }

    public int getPosition() {
        return position;
    }

}
