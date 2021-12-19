package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.b.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f10145a;

    static {
        Covode.recordClassIndex(5326);
    }

    p(d dVar) {
        this.f10145a = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f10145a;
        l.d("data_guest_user", "");
        l.d(obj, "");
        b.ap.put("data_guest_user", obj);
        dVar.f10119c.b(g.class, obj);
    }
}
