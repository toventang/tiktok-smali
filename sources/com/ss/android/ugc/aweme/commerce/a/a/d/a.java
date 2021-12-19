package com.ss.android.ugc.aweme.commerce.a.a.d;

import android.os.Build;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.a.a.a.c;

public final class a {
    static {
        Covode.recordClassIndex(45159);
    }

    public static void a(c cVar) {
        if (!cVar.d()) {
            throw new IllegalStateException("Viewability adsession should be active");
        }
    }

    public static boolean a(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (view.isAttachedToWindow() && view.getVisibility() == 0 && view.getAlpha() != 0.0f) {
            return true;
        }
        return false;
    }
}
