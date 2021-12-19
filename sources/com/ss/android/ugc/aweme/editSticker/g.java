package com.ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.editSticker.d.d;
import com.ss.android.ugc.tools.view.b;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static b f88154a;

    /* renamed from: b  reason: collision with root package name */
    public static d f88155b;

    /* renamed from: c  reason: collision with root package name */
    public static final g f88156c = new g();

    /* renamed from: d  reason: collision with root package name */
    private static e f88157d;

    /* renamed from: e  reason: collision with root package name */
    private static com.ss.android.ugc.tools.b.a.d f88158e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f88159f;

    private g() {
    }

    static {
        Covode.recordClassIndex(55418);
    }

    public static final e a() {
        e eVar = f88157d;
        if (eVar == null) {
            l.a("textConfig");
        }
        return eVar;
    }

    public static final com.ss.android.ugc.tools.b.a.d b() {
        com.ss.android.ugc.tools.b.a.d dVar = f88158e;
        if (dVar == null) {
            l.a("fontEffectPlatform");
        }
        return dVar;
    }

    public static void a(e eVar, com.ss.android.ugc.tools.b.a.d dVar, b bVar, d dVar2) {
        l.d(eVar, "");
        l.d(dVar, "");
        if (!f88159f) {
            f88157d = eVar;
            f88158e = dVar;
            f88154a = bVar;
            f88155b = dVar2;
            f88159f = true;
        }
    }
}
