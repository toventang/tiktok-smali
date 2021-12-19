package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.covode.number.Covode;
import f.a.d.k;

final /* synthetic */ class t implements k {

    /* renamed from: a  reason: collision with root package name */
    private final c f22109a;

    static {
        Covode.recordClassIndex(13020);
    }

    t(c cVar) {
        this.f22109a = cVar;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        c cVar = this.f22109a;
        b bVar = (b) obj;
        return (bVar == null || cVar.f22059b == null || bVar.getId() != cVar.f22059b.getCurUserId()) ? false : true;
    }
}
