package com.ss.android.ugc.aweme.share.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.share.ag;
import com.ss.android.ugc.aweme.share.i.a;
import com.ss.android.ugc.aweme.sharer.b;
import h.f.b.l;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f124082a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(81482);
    }

    public static boolean a(b bVar) {
        l.d(bVar, "");
        return b(bVar);
    }

    private static boolean b(b bVar) {
        l.d(bVar, "");
        if ((com.ss.android.ugc.aweme.share.f.b.b() || com.ss.android.ugc.aweme.share.f.b.c() || com.ss.android.ugc.aweme.share.f.b.d()) && l.a((Object) bVar.a(), (Object) "whatsapp")) {
            return true;
        }
        return false;
    }

    public static boolean a(b bVar, boolean z) {
        l.d(bVar, "");
        if (com.ss.android.ugc.aweme.share.f.b.a() && l.a((Object) bVar.a(), (Object) "whatsapp")) {
            return true;
        }
        if (b(bVar)) {
            return false;
        }
        a a2 = a.a();
        l.b(a2, "");
        List<ag> list = a2.f123566a;
        if (list == null || list.isEmpty()) {
            return z;
        }
        for (ag agVar : list) {
            l.b(agVar, "");
            if (l.a((Object) agVar.f123339a, (Object) bVar.a())) {
                if (agVar.f123341c == 0) {
                    return true;
                }
                return false;
            }
        }
        return z;
    }
}
