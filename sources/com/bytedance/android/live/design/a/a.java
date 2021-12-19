package com.bytedance.android.live.design.a;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(4772);
    }

    public static Context a(Context context) {
        return new ContextThemeWrapper(context, (int) R.style.mu);
    }

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace((char) 65532, ' ');
    }
}
