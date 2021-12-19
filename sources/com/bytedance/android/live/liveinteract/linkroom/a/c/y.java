package com.bytedance.android.live.liveinteract.linkroom.a.c;

import com.bytedance.android.live.liveinteract.api.b.e;
import com.bytedance.android.live.liveinteract.api.g;
import com.bytedance.android.live.liveinteract.linkroom.a.c.b;
import com.bytedance.android.livesdk.model.message.d.c.d;
import com.bytedance.covode.number.Covode;
import h.f.a.a;
import h.z;

final /* synthetic */ class y implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b.AnonymousClass1 f10534a;

    /* renamed from: b  reason: collision with root package name */
    private final d f10535b;

    static {
        Covode.recordClassIndex(5615);
    }

    y(b.AnonymousClass1 r1, d dVar) {
        this.f10534a = r1;
        this.f10535b = dVar;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        b.AnonymousClass1 r6 = this.f10534a;
        d dVar = this.f10535b;
        if (b.this.w != null) {
            b.this.w.c(g.class, new e(true, ""));
        }
        ((b.a) b.this.y).a(dVar);
        return z.f158842a;
    }
}
