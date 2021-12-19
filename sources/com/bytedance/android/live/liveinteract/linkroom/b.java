package com.bytedance.android.live.liveinteract.linkroom;

import com.bytedance.android.live.publicscreen.a.e.a;
import com.bytedance.android.live.publicscreen.a.e.c;
import com.bytedance.android.live.publicscreen.a.e.d;
import com.bytedance.android.live.publicscreen.a.e.e;
import com.bytedance.android.livesdk.model.message.ak;
import com.bytedance.android.livesdk.model.message.al;
import com.bytedance.android.livesdk.model.message.ao;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements e {
    static {
        Covode.recordClassIndex(5616);
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(a aVar) {
        l.d(aVar, "");
        aVar.a(ao.class, new com.bytedance.android.live.liveinteract.match.b.e.a.a());
        aVar.a(ak.class, new com.bytedance.android.live.liveinteract.cohost.f.d.a());
        aVar.a(al.class, new com.bytedance.android.live.liveinteract.multiguest.f.d.a());
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(com.bytedance.android.live.publicscreen.a.e.b bVar) {
        l.d(bVar, "");
        bVar.a(com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_BATTLE_NOTICE.getIntType());
        bVar.a(com.bytedance.android.livesdk.model.message.a.a.LINK_CO_HOST_GUIDE.getIntType());
        bVar.a(com.bytedance.android.livesdk.model.message.a.a.LINK_AUDIENCE_NOTICE.getIntType());
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(c cVar) {
        l.d(cVar, "");
        cVar.a(ak.class, new com.bytedance.android.live.liveinteract.cohost.f.b.a());
        cVar.a(ao.class, new com.bytedance.android.live.liveinteract.match.e.b.a());
        cVar.a(al.class, new com.bytedance.android.live.liveinteract.multiguest.f.b.a());
    }

    @Override // com.bytedance.android.live.publicscreen.a.e.e
    public final void a(d dVar) {
        l.d(dVar, "");
        dVar.a(com.bytedance.android.live.liveinteract.cohost.f.e.a.class, new com.bytedance.android.live.liveinteract.cohost.f.a.a());
        dVar.a(com.bytedance.android.live.liveinteract.match.d.a.a.class, new com.bytedance.android.live.liveinteract.match.e.a.a());
        dVar.a(com.bytedance.android.live.liveinteract.multiguest.f.e.a.class, new com.bytedance.android.live.liveinteract.multiguest.f.a.a());
    }
}
