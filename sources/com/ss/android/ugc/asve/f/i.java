package com.ss.android.ugc.asve.f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f62091a = new i();

    private i() {
    }

    static {
        Covode.recordClassIndex(38165);
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
}
