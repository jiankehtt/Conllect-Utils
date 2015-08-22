package com.htt.androidutils.view;

import android.view.View;

public class ViewUtils {

    public static void makeVisible(View... views) {
        changeVisibility(View.VISIBLE, views);
    }

    public static void makeGone(View... views) {
        changeVisibility(View.GONE, views);
    }

    public static void makeInvisible(View... views) {
        changeVisibility(View.INVISIBLE, views);
    }

    private static void changeVisibility(int visibility, View... views) {
        if (views == null || views.length == 0) {
            return;
        }
        for (View v : views) {
            v.setVisibility(visibility);
        }
    }
}
