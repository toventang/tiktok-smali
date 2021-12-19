package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.core.g.a;
import com.bytedance.covode.number.Covode;
import dmt.av.video.p;

final /* synthetic */ class af implements a {

    /* renamed from: a  reason: collision with root package name */
    private final f f97816a;

    /* renamed from: b  reason: collision with root package name */
    private final p f97817b;

    /* renamed from: c  reason: collision with root package name */
    private final long f97818c;

    static {
        Covode.recordClassIndex(62169);
    }

    af(f fVar, p pVar, long j2) {
        this.f97816a = fVar;
        this.f97817b = pVar;
        this.f97818c = j2;
    }

    @Override // androidx.core.g.a
    public final void a(Object obj) {
        f fVar = this.f97816a;
        p pVar = this.f97817b;
        fVar.f97857j.a(pVar.f156925a[0], this.f97818c, pVar.f156933i, pVar.f156932h);
        fVar.x.a(true, true, (a<Void>) null);
    }
}
