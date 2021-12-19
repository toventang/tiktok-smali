package com.bytedance.android.livesdk.chatroom.a.c;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f14914a;

    static {
        Covode.recordClassIndex(8262);
    }

    d(a aVar) {
        this.f14914a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f14914a;
        aVar.f14901e.setVisibility(8);
        aVar.f14902f.setVisibility(8);
        i.b();
        a.a(5, "ttlive_exception", ((Throwable) obj).getStackTrace());
    }
}
