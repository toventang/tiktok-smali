package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.a;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.f;
import h.f.b.l;
import h.m.p;

public final class e implements b.e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f112367a = new e();

    private e() {
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    static {
        Covode.recordClassIndex(72211);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.e
    public final void a(f fVar, a aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        com.bytedance.ies.ugc.network.partner.b.e eVar = fVar.f35269b.f35298f;
        String a2 = eVar.a("device_id");
        if (a2 == null || p.a((CharSequence) a2)) {
            eVar.b("device_id");
        }
    }
}
