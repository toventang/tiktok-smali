package com.bytedance.android.live.liveinteract.cohost.a.d;

import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.a.d.d;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class s implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f10149a;

    static {
        Covode.recordClassIndex(5329);
    }

    s(d dVar) {
        this.f10149a = dVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        d dVar = this.f10149a;
        dVar.a((Throwable) obj);
        if (!dVar.f10120d.a(k.CONNECTION_SUCCEED)) {
            ((d.a) dVar.y).a(208);
        }
    }
}
