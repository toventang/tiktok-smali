package com.bytedance.tux.a.a;

import android.view.animation.Interpolator;
import androidx.core.h.b.b;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44658a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(27308);
    }

    public static Interpolator a() {
        Interpolator a2 = b.a(0.32f, 0.0f, 0.67f, 0.0f);
        l.a((Object) a2, "");
        return a2;
    }

    public static Interpolator b() {
        Interpolator a2 = b.a(0.33f, 1.0f, 0.68f, 1.0f);
        l.a((Object) a2, "");
        return a2;
    }

    public static Interpolator c() {
        Interpolator a2 = b.a(0.65f, 0.0f, 0.35f, 1.0f);
        l.a((Object) a2, "");
        return a2;
    }
}
