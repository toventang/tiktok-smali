package com.ss.android.ugc.aweme.effect;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;
import dmt.av.video.p;

final /* synthetic */ class bd implements a {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88864a;

    /* renamed from: b  reason: collision with root package name */
    private final p f88865b;

    /* renamed from: c  reason: collision with root package name */
    private final long f88866c;

    static {
        Covode.recordClassIndex(55899);
    }

    bd(ac acVar, p pVar, long j2) {
        this.f88864a = acVar;
        this.f88865b = pVar;
        this.f88866c = j2;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        ac acVar = this.f88864a;
        p pVar = this.f88865b;
        acVar.f88787j.a(pVar.f156925a[0], this.f88866c, pVar.f156933i, pVar.f156932h);
        acVar.x.a(true, true, (a<Void>) null);
    }
}
