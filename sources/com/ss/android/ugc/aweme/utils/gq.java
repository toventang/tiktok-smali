package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class gq {
    static {
        Covode.recordClassIndex(93604);
    }

    public static final void a(TextView textView) {
        int i2;
        if (textView != null) {
            int i3 = Build.VERSION.SDK_INT;
            boolean a2 = gb.a(textView.getContext());
            textView.setTextDirection(2);
            if (a2) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            textView.setGravity(i2);
        }
    }
}
