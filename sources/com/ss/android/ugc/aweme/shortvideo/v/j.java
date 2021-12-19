package com.ss.android.ugc.aweme.shortvideo.v;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.shortvideo.ai;
import com.ss.android.ugc.aweme.shortvideo.x;
import h.f.b.l;

public final class j extends a {

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f132496h;

    /* renamed from: i  reason: collision with root package name */
    private volatile boolean f132497i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f132498j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f132499k;

    /* renamed from: l  reason: collision with root package name */
    private volatile h f132500l;

    /* renamed from: m  reason: collision with root package name */
    private volatile h f132501m;

    static {
        Covode.recordClassIndex(86730);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final String toString() {
        return "ShoutOutSyncSynthesisPublisher";
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void d() {
        a();
        b();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void e() {
        this.f132496h = true;
        a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final synchronized void f() {
        MethodCollector.i(11659);
        this.f132497i = true;
        b();
        if (this.f132496h) {
            c();
        }
        MethodCollector.o(11659);
    }

    private final void k() {
        String str;
        if (this.f132496h && this.f132499k && this.f132497i) {
            h hVar = new h();
            hVar.f118767i = "";
            h hVar2 = this.f132500l;
            if (hVar2 != null) {
                str = hVar2.f118766h;
            } else {
                str = null;
            }
            hVar.f118766h = str;
            c(hVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void d(h hVar) {
        if (this.f132496h) {
            b(hVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void e(h hVar) {
        this.f132498j = true;
        this.f132501m = hVar;
        k();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.v.a
    public final void f(h hVar) {
        this.f132499k = true;
        this.f132500l = hVar;
        k();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(com.ss.android.ugc.aweme.shortvideo.j jVar, int i2, int i3, int i4, String str, boolean z, x<ai> xVar) {
        super(jVar, i2, i3, i4, str, z, xVar);
        l.d(jVar, "");
        l.d(xVar, "");
    }
}
