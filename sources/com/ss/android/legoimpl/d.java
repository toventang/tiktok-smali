package com.ss.android.legoimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;

final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f59632a;

    /* renamed from: b  reason: collision with root package name */
    private final c f59633b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f59634c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f59635d;

    static {
        Covode.recordClassIndex(36822);
    }

    d(long j2, c cVar, boolean z, boolean z2) {
        this.f59632a = j2;
        this.f59633b = cVar;
        this.f59634c = z;
        this.f59635d = z2;
    }

    public final void run() {
        long j2 = this.f59632a;
        c cVar = this.f59633b;
        boolean z = this.f59634c;
        boolean z2 = this.f59635d;
        s sVar = new s();
        sVar.a("duration", String.valueOf(j2));
        sVar.a("layout", cVar.a());
        sVar.a("cached", String.valueOf(z));
        sVar.a("main", String.valueOf(z2));
        r.a("inflate_getview_report", sVar.a());
    }
}
