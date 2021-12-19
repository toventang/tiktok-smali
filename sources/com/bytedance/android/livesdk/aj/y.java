package com.bytedance.android.livesdk.aj;

import com.bytedance.android.livesdk.aj.g;
import com.bytedance.android.livesdk.aj.v;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v.AnonymousClass1 f13918a;

    /* renamed from: b  reason: collision with root package name */
    private final g.c f13919b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13920c;

    /* renamed from: d  reason: collision with root package name */
    private final String f13921d;

    static {
        Covode.recordClassIndex(7722);
    }

    y(v.AnonymousClass1 r1, g.c cVar, int i2, String str) {
        this.f13918a = r1;
        this.f13919b = cVar;
        this.f13920c = i2;
        this.f13921d = str;
    }

    public final void run() {
        v.AnonymousClass1 r4 = this.f13918a;
        g.c cVar = this.f13919b;
        int i2 = this.f13920c;
        String str = this.f13921d;
        if (v.this.f13904c != null) {
            v.this.f13904c.a(cVar, i2, str);
        }
    }
}
