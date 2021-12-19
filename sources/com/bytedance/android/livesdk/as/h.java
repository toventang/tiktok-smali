package com.bytedance.android.livesdk.as;

import com.bytedance.android.livesdk.as.g;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.b.a;

final /* synthetic */ class h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f14089a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f14090b;

    static {
        Covode.recordClassIndex(7816);
    }

    h(g.a aVar, Object obj) {
        this.f14089a = aVar;
        this.f14090b = obj;
    }

    @Override // com.ss.ugc.live.sdk.msg.b.a
    public final byte[] a() {
        return this.f14089a.a(this.f14090b);
    }
}
