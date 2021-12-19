package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f111948a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(71953);
    }

    public static final Dialog a(Activity activity, View view, int i2) {
        Display display;
        l.d(activity, "");
        l.d(view, "");
        Dialog dialog = new Dialog(activity, R.style.xp);
        dialog.setCancelable(true);
        dialog.setContentView(view);
        WindowManager windowManager = activity.getWindowManager();
        WindowManager.LayoutParams layoutParams = null;
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        } else {
            display = null;
        }
        Window window = dialog.getWindow();
        if (!(window == null || (layoutParams = window.getAttributes()) == null)) {
            layoutParams.x = 0;
            layoutParams.gravity = 80;
            layoutParams.windowAnimations = i2;
        }
        Point point = new Point();
        if (display != null) {
            display.getSize(point);
        }
        if (layoutParams != null) {
            layoutParams.width = point.x;
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        dialog.setCanceledOnTouchOutside(true);
        return dialog;
    }
}
