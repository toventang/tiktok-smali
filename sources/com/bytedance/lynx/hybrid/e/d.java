package com.bytedance.lynx.hybrid.e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static Application f40959a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f40960b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f40961c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f40962d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static final String f40963e;

    private d() {
    }

    public static Application a() {
        Application application = f40959a;
        if (application == null) {
            l.a("context");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(25098);
        l.a((Object) LynxEnv.b(), "");
        String g2 = LynxEnv.g();
        l.a((Object) g2, "");
        f40963e = g2;
    }
}
