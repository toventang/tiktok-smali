package com.ss.android.ugc.asve;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.context.e;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f61923a = "AS";

    /* renamed from: b  reason: collision with root package name */
    public static Application f61924b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f61925c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static e f61926d;

    private a() {
    }

    public static e a() {
        e eVar = f61926d;
        if (eVar == null) {
            l.a("context");
        }
        return eVar;
    }

    public static Application b() {
        Application application = f61924b;
        if (application == null) {
            l.a("applicationContext");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(38065);
    }

    public static void a(e eVar) {
        l.d(eVar, "");
        f61926d = eVar;
        eVar.e().mkdirs();
        e.f61973a.a();
    }
}
