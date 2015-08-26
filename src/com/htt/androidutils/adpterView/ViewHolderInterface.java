package com.htt.androidutils.adpterView;

import android.graphics.drawable.Drawable;

public interface ViewHolderInterface {

    /**
     * 
     * @description SetText处理
     * @param viewId
     * @param text
     * @return
     * @author 胡同涛
     * @date 2015-8-26 下午12:10:57
     */
    public ViewHolder setText(int viewId, String text);

    public ViewHolder setText(int viewId, int resId);

    /**
     * 
     * @description 图片处理
     * @param viewId
     * @param resId
     * @return
     * @author 胡同涛
     * @date 2015-8-26 下午12:24:21
     */
    public ViewHolder setImageResource(int viewId, int resId);

    public ViewHolder setImageDrawable(int viewId, Drawable drawable);

    /**
     * 
     * @description 选择处理
     * @param viewId
     * @param selected
     * @return
     * @author 胡同涛
     * @date 2015-8-26 下午12:24:34
     */
    public ViewHolder setSelected(int viewId, boolean selected);

    /**
     * 
     * @description 背景处理
     * @param viewId
     * @param color
     * @return
     * @author 胡同涛
     * @date 2015-8-26 下午12:31:08
     */

    public ViewHolder setBackgroundColor(int viewId, int color);

    public ViewHolder setBackgroundResource(int viewId, int resid);

    public ViewHolder setBackgroundDrawable(int viewId, Drawable background);

    /**
     * 
     * @description 控件是否可见处理
     * @param viewId
     * @param visibility
     * @return
     * @author 胡同涛
     * @date 2015-8-26 下午12:33:36
     */
    public ViewHolder setVisibility(int viewId, int visibility);

    public void setAllViewInvisiable();

    public void setAllViewGone();

}
