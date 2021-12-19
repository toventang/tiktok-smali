package com.ss.android.ttve.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f61363a;

    /* renamed from: b  reason: collision with root package name */
    public static a f61364b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static int f61365c = -1;

    public static class a {
        static {
            Covode.recordClassIndex(37779);
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(37778);
        if (Build.VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f61363a = z;
    }

    public static final int a(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    public static final int b(Context context) {
        DisplayMetrics displayMetrics;
        if (context == null || (displayMetrics = context.getResources().getDisplayMetrics()) == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    public static float a(Context context, float f2) {
        return TypedValue.applyDimension(2, f2, context.getResources().getDisplayMetrics());
    }

    public static float b(Context context, float f2) {
        return (f2 * context.getResources().getDisplayMetrics().density) + 0.5f;
    }
}
