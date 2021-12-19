package com.ss.android.ugc.aweme.net.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.network.partner.a;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.e;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.ss.android.common.applog.q;
import h.f.b.l;
import h.m.p;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d implements b.e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f112366a = new d();

    private d() {
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    static {
        Covode.recordClassIndex(72210);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.e
    public final void a(f fVar, a aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        if (fVar.f35268a) {
            e eVar = fVar.f35269b.f35298f;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            q.b(linkedHashMap, true);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                eVar.a((String) entry.getKey(), (String) entry.getValue());
            }
            if (((Boolean) com.ss.android.ugc.aweme.net.d.a.f112283a.getValue()).booleanValue() && p.b(fVar.f35269b.f35297e.a(), "/aweme/", false)) {
                fVar.f35270c.a("force_tt_hpack_optimization", "true");
            }
        }
    }
}
