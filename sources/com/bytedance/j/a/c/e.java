package com.bytedance.j.a.c;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import h.f.b.l;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Application f38995a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f38996b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f38997c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f38998d = new e();

    /* renamed from: e  reason: collision with root package name */
    private static final String f38999e;

    private e() {
    }

    public static Application a() {
        Application application = f38995a;
        if (application == null) {
            l.a("context");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(23872);
        l.a((Object) LynxEnv.b(), "");
        String g2 = LynxEnv.g();
        l.a((Object) g2, "");
        f38999e = g2;
    }
}
