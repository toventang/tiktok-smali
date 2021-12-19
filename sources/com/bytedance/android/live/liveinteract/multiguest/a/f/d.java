package com.bytedance.android.live.liveinteract.multiguest.a.f;

import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.platform.common.g.i;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.interact.model.e;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f11149a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f11150b;

    static {
        Covode.recordClassIndex(5988);
    }

    d(a aVar, boolean z) {
        this.f11149a = aVar;
        this.f11150b = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f11149a;
        boolean z = this.f11150b;
        com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
        if (dVar.data != null && !((e) dVar.data).n.isEmpty()) {
            g.a.f14199a.f14198c = ((e) dVar.data).n;
        }
        ((a.b) aVar.f11898g).a((e) dVar.data, z);
        i.b(z ? 1 : 2, aVar.f11135a.getOwnerUserId(), g.a.f14199a.a(aVar.f11135a.getOwnerUserId()));
        aVar.f11138d = false;
        if (!z) {
            if (com.bytedance.android.live.liveinteract.multilive.a.c()) {
                com.bytedance.android.live.liveinteract.multilive.a.a(aVar.f11135a, aVar.f11140f, false);
            }
        } else if (com.bytedance.android.live.liveinteract.multilive.a.c()) {
            com.bytedance.android.live.liveinteract.multilive.a.a(aVar.f11135a, aVar.f11140f, true);
        }
    }
}
