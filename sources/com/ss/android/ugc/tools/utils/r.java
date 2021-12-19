package com.ss.android.ugc.tools.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f150014a = new r();

    private r() {
    }

    static {
        Covode.recordClassIndex(98761);
    }

    public static final boolean a(View view) {
        l.d(view, "");
        if (v.e(view) == 1) {
            return true;
        }
        return false;
    }

    public static final float a(float f2) {
        Resources system = Resources.getSystem();
        l.b(system, "");
        return (f2 * system.getDisplayMetrics().density) + 0.5f;
    }

    public static final int b(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        l.b(resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    public static final boolean c(Context context) {
        l.d(context, "");
        int i2 = Build.VERSION.SDK_INT;
        Resources resources = context.getResources();
        l.b(resources, "");
        Configuration configuration = resources.getConfiguration();
        l.b(configuration, "");
        if (configuration.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final int a(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        l.b(resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    public static final float a(Context context, float f2) {
        l.d(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }

    public static final int b(Context context, float f2) {
        l.d(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        return (int) ((f2 / resources.getDisplayMetrics().density) + 0.5f);
    }
}
