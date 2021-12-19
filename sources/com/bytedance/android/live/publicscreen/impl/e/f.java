package com.bytedance.android.live.publicscreen.impl.e;

import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class f extends g {

    /* renamed from: b  reason: collision with root package name */
    public long f12320b;

    /* renamed from: c  reason: collision with root package name */
    public long f12321c;

    /* renamed from: d  reason: collision with root package name */
    public long f12322d;

    static {
        Covode.recordClassIndex(6780);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b, com.bytedance.android.live.publicscreen.impl.e.g
    public final void b() {
        super.b();
        this.f12320b = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b, com.bytedance.android.live.publicscreen.impl.e.g
    public void a(h hVar, long j2) {
        l.d(hVar, "");
        super.a(hVar, j2);
        if (j2 == 0) {
            this.f12322d = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.e.c, com.bytedance.android.live.publicscreen.impl.e.b
    public final void b(h hVar, long j2) {
        l.d(hVar, "");
        super.b(hVar, j2);
        if (j2 == 0) {
            this.f12321c = System.currentTimeMillis();
        }
    }
}
