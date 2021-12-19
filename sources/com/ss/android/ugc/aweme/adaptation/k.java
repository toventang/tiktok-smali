package com.ss.android.ugc.aweme.adaptation;

import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import h.f.b.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f66260a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(40708);
    }

    private static int a(Context context) {
        l.d(context, "");
        if (!f.a()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            Object invoke = loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]);
            if (invoke != null) {
                return ((int[]) invoke)[1];
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.IntArray");
        } catch (Throwable unused) {
            return iArr[1];
        }
    }

    public static int a(Context context, Window window) {
        DisplayCutout displayCutout;
        l.d(context, "");
        l.d(window, "");
        if (Build.VERSION.SDK_INT >= 28) {
            View decorView = window.getDecorView();
            l.b(decorView, "");
            WindowInsets rootWindowInsets = decorView.getRootWindowInsets();
            if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                return 0;
            }
            return displayCutout.getSafeInsetTop();
        } else if (f.a()) {
            return a(context);
        } else {
            return n.e(context);
        }
    }
}
