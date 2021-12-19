package com.ss.android.ad.splash.f;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static int f58985a = -1;

    private static boolean a(int i2) {
        return i2 == 0 || i2 == 8 || i2 == 4;
    }

    static {
        Covode.recordClassIndex(36490);
    }

    private static Context e(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    public static final int a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static int b(Context context) {
        if (f58985a == -1 && context != null) {
            f58985a = e(context).getResources().getDisplayMetrics().densityDpi;
        }
        return f58985a;
    }

    public static final int c(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean d(Context context) {
        try {
            if (TextUtils.equals("oppo", Build.BRAND.toLowerCase())) {
                return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static void a(View view) {
        MethodCollector.i(5104);
        if (view == null) {
            MethodCollector.o(5104);
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            MethodCollector.o(5104);
            return;
        }
        ((ViewGroup) parent).removeView(view);
        MethodCollector.o(5104);
    }

    public static float a(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static final void a(View view, int i2) {
        if (view != null && view.getVisibility() != i2 && a(i2)) {
            view.setVisibility(i2);
        }
    }

    public static void a(View view, ViewGroup viewGroup) {
        MethodCollector.i(5105);
        if (view == null || viewGroup == null) {
            MethodCollector.o(5105);
            return;
        }
        ViewParent parent = view.getParent();
        if (parent == viewGroup) {
            MethodCollector.o(5105);
            return;
        }
        if (parent != null) {
            ((ViewGroup) parent).removeView(view);
        }
        viewGroup.addView(view);
        MethodCollector.o(5105);
    }

    public static void a(boolean z, View... viewArr) {
        int i2;
        for (View view : viewArr) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a(view, i2);
        }
    }
}
