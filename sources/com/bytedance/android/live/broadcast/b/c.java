package com.bytedance.android.live.broadcast.b;

import com.bytedance.android.live.broadcast.api.c.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f7561a;

    static {
        Covode.recordClassIndex(3731);
    }

    c(a aVar) {
        this.f7561a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b.a.a("ttlive_fetch_room_info_all", (Throwable) obj).b("pc_broadcast").a();
    }
}
