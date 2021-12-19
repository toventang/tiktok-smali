package com.ss.android.ugc.tools;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.tools.f.a;
import com.ss.android.ugc.tools.g.b;
import com.ss.android.ugc.tools.utils.g;
import com.ss.android.ugc.tools.utils.j;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Application f149146a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f149147b;

    /* renamed from: c  reason: collision with root package name */
    public static f f149148c;

    /* renamed from: d  reason: collision with root package name */
    public static com.ss.android.ugc.tools.f.c f149149d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static b f149150e = new com.ss.android.ugc.tools.g.a();

    /* renamed from: f  reason: collision with root package name */
    public static j f149151f = g.f149995a;

    /* renamed from: g  reason: collision with root package name */
    public static final c f149152g = new c();

    private c() {
    }

    public static final Application a() {
        Application application = f149146a;
        if (application == null) {
            l.a("backendContext");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(98221);
        f b2 = new com.google.gson.g().b();
        l.b(b2, "");
        f149148c = b2;
    }
}
