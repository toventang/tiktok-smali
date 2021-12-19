package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.model.message.bp;
import com.bytedance.android.livesdk.rank.impl.api.model.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f20925a;

    static {
        Covode.recordClassIndex(12384);
    }

    h(g gVar) {
        this.f20925a = gVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        g gVar = this.f20925a;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.data == null || ((b) dVar.data).f20640a == null || ((b) dVar.data).f20640a.isEmpty())) {
            gVar.f20913a.clear();
            for (bp bpVar : ((b) dVar.data).f20640a) {
                if (bpVar.f19344a) {
                    gVar.f20913a.add(bpVar);
                } else {
                    gVar.a(bpVar.f19348e, (String) null, (String) null, "hide_by_api_request");
                }
            }
            if (!gVar.f20913a.isEmpty()) {
                gVar.a(g.a(gVar.f20913a), false);
            } else {
                gVar.b(true);
            }
        }
        gVar.c();
        gVar.f20914b = false;
    }
}
