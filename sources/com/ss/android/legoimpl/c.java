package com.ss.android.legoimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f59629a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.nita.api.c f59630b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f59631c;

    static {
        Covode.recordClassIndex(36821);
    }

    c(long j2, com.bytedance.nita.api.c cVar, boolean z) {
        this.f59629a = j2;
        this.f59630b = cVar;
        this.f59631c = z;
    }

    public final void run() {
        long j2 = this.f59629a;
        com.bytedance.nita.api.c cVar = this.f59630b;
        boolean z = this.f59631c;
        s sVar = new s();
        sVar.a("duration", String.valueOf(j2));
        sVar.a("layout", cVar.a());
        sVar.a("main", String.valueOf(z));
        r.a("inflate_preload_report", sVar.a());
    }
}
