package com.bytedance.lynx.a.a.f;

import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f40847a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(25041);
    }

    public static final int a() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return system.getDisplayMetrics().heightPixels;
    }

    public static final int b() {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return system.getDisplayMetrics().widthPixels;
    }

    public static final int a(float f2) {
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        return (int) ((f2 * system.getDisplayMetrics().density) + 0.5f);
    }
}
