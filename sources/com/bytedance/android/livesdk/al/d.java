package com.bytedance.android.livesdk.al;

import com.bytedance.android.livesdk.live.model.c;
import com.bytedance.android.livesdkapi.service.a;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f13947a;

    static {
        Covode.recordClassIndex(7734);
    }

    d(a aVar) {
        this.f13947a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar;
        a aVar = this.f13947a;
        com.bytedance.android.live.network.response.c cVar2 = (com.bytedance.android.live.network.response.c) obj;
        if (!h.a(cVar2.f12145b) && (cVar = (c) cVar2.f12145b.get(0)) != null) {
            aVar.a(cVar.f18687b);
        }
    }
}
