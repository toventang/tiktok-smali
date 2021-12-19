package com.bytedance.android.livesdk.aj;

import com.bytedance.android.livesdk.aj.g;
import com.bytedance.android.livesdk.aj.v;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v.AnonymousClass1 f13914a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c f13915b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13916c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13917d;

    static {
        Covode.recordClassIndex(7721);
    }

    x(v.AnonymousClass1 r1, g.c cVar, int i2, String str) {
        this.f13914a = r1;
        this.f13915b = cVar;
        this.f13916c = i2;
        this.f13917d = str;
    }

    public final void run() {
        v.AnonymousClass1 r4 = this.f13914a;
        g.c cVar = this.f13915b;
        int i2 = this.f13916c;
        String str = this.f13917d;
        if (v.this.f13904c != null) {
            v.this.f13904c.a(cVar, i2, str);
        }
    }
}
