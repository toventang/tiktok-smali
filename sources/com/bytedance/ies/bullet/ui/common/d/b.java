package com.bytedance.ies.bullet.ui.common.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.bytedance.ies.bullet.service.f.a.b.d;
import com.bytedance.ies.bullet.service.f.a.b.r;
import com.bytedance.ies.bullet.service.f.a.b.t;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f33094a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(19761);
    }

    public static void b(com.bytedance.ies.bullet.service.f.a.b bVar) {
        l.c(bVar, "");
        if (l.a((Object) bVar.f32687c.b(), (Object) true)) {
            bVar.f32686b.a((Boolean) true);
        }
    }

    public static void a(com.bytedance.ies.bullet.service.f.a.b bVar) {
        boolean z;
        Boolean b2;
        Boolean b3;
        com.bytedance.ies.bullet.service.f.a.b.l lVar;
        t b4;
        t b5;
        Boolean b6;
        Boolean bool;
        Boolean b7;
        l.c(bVar, "");
        d<Boolean> dVar = bVar.z;
        if (dVar.c() && (b7 = dVar.b()) != null) {
            if (b7.booleanValue()) {
                bVar.f32690f.a(r.DARK);
            } else {
                bVar.f32690f.a(r.LIGHT);
            }
        }
        Boolean b8 = bVar.n.b();
        if (b8 != null) {
            z = b8.booleanValue();
        } else {
            z = true;
        }
        a aVar = bVar.B;
        if (!aVar.c()) {
            aVar = null;
        }
        if (!(aVar == null || (bool = (Boolean) aVar.b()) == null)) {
            boolean booleanValue = bool.booleanValue();
            if (!z || !booleanValue) {
                z = false;
            } else {
                z = true;
            }
        }
        d<Boolean> dVar2 = bVar.A;
        if (dVar2.c() && (b6 = dVar2.b()) != null) {
            boolean booleanValue2 = b6.booleanValue();
            if (!z || booleanValue2) {
                z = false;
            } else {
                z = true;
            }
        }
        bVar.n.a(Boolean.valueOf(z));
        d<Boolean> dVar3 = bVar.C;
        if (dVar3.c()) {
            bVar.f32687c.a(dVar3.b());
        }
        d<t> dVar4 = bVar.D;
        if (!dVar4.c()) {
            dVar4 = null;
        }
        if (!(dVar4 == null || (b5 = dVar4.b()) == null || b5.f32728a == -2)) {
            bVar.f32695k.a(b5);
        }
        d<t> dVar5 = bVar.E;
        if (!(!dVar5.c() || (b4 = dVar5.b()) == null || b4.f32728a == -2)) {
            bVar.f32688d.a(b4);
        }
        d<Boolean> dVar6 = bVar.F;
        if (dVar6.c() && (b3 = dVar6.b()) != null) {
            boolean booleanValue3 = b3.booleanValue();
            d<com.bytedance.ies.bullet.service.f.a.b.l> dVar7 = bVar.f32697m;
            if (booleanValue3) {
                lVar = com.bytedance.ies.bullet.service.f.a.b.l.BOTTOM;
            } else {
                lVar = com.bytedance.ies.bullet.service.f.a.b.l.AUTO;
            }
            dVar7.a(lVar);
        }
        d<Boolean> dVar8 = bVar.G;
        if (dVar8.c() && !bVar.f32685a.c() && (b2 = dVar8.b()) != null) {
            bVar.f32685a.a(Boolean.valueOf(!b2.booleanValue()));
        }
    }
}
