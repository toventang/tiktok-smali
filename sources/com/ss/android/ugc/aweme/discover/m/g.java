package com.ss.android.ugc.aweme.discover.m;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;

public final class g {
    static {
        Covode.recordClassIndex(50722);
    }

    public static void a(Window window, int i2) {
        ViewGroup viewGroup;
        int childCount;
        if (window != null && (childCount = (viewGroup = (ViewGroup) window.getDecorView()).getChildCount()) > 0) {
            int i3 = childCount - 1;
            if (viewGroup.getChildAt(i3).getId() == 16908335) {
                Drawable background = viewGroup.getChildAt(i3).getBackground();
                if (background instanceof ColorDrawable) {
                    ((ColorDrawable) background).setColor(i2);
                }
            }
        }
    }
}
