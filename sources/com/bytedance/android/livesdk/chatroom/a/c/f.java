package com.bytedance.android.livesdk.chatroom.a.c;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final a f14917a;

    static {
        Covode.recordClassIndex(8264);
    }

    f(a aVar) {
        this.f14917a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f14917a;
        aVar.f14903g.setVisibility(8);
        aVar.f14904h.setVisibility(8);
        i.b();
        a.a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
