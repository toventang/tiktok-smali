package com.bytedance.lynx.hybrid.i;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f40996a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(25119);
    }

    public static float a(Context context, float f2) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }
}
