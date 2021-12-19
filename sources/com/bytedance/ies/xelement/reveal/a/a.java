package com.bytedance.ies.xelement.reveal.a;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37429a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(22505);
    }

    public static int a(Context context, int i2) {
        l.c(context, "");
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        return (int) (((float) i2) / (((float) resources.getDisplayMetrics().densityDpi) / 160.0f));
    }
}
