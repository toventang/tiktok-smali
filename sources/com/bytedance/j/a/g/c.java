package com.bytedance.j.a.g;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39059a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(23912);
    }

    public static float a(Context context, float f2) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }
}
