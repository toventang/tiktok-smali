package com.lynx.tasm.behavior.ui.utils;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;

public class j {
    static {
        Covode.recordClassIndex(35200);
    }

    public static void a(View view, Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        view.setBackground(drawable);
    }
}
