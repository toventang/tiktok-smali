package com.bytedance.android.livesdk.gifttray.c;

import com.bytedance.android.livesdk.gifttray.c.c;
import com.bytedance.android.livesdk.service.animation.b;
import com.bytedance.android.livesdk.service.c.c.d;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final c.AnonymousClass1 f18074a;

    static {
        Covode.recordClassIndex(10021);
    }

    h(c.AnonymousClass1 r1) {
        this.f18074a = r1;
    }

    public final void run() {
        c.AnonymousClass1 r3 = this.f18074a;
        d.a.C0463a.f21379a.a(99, Long.valueOf((c.this.f18053c == null || c.this.f18053c.z == null) ? 0 : c.this.f18053c.z.getId()), 1, Long.valueOf(System.currentTimeMillis() - r3.f18064a), 1);
        c.this.f18051a = b.b(c.this, c.this.f18058h);
        c.this.f18051a.start();
    }
}
