package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.ss.android.vesdk.VEListener;

final /* synthetic */ class ab implements VEListener.j {

    /* renamed from: a  reason: collision with root package name */
    private final u f130031a;

    /* renamed from: b  reason: collision with root package name */
    private final VEListener.j f130032b;

    static {
        Covode.recordClassIndex(85324);
    }

    ab(u uVar, VEListener.j jVar) {
        this.f130031a = uVar;
        this.f130032b = jVar;
    }

    @Override // com.ss.android.vesdk.VEListener.j
    public final void a(int i2) {
        this.f130031a.a(this.f130032b, i2);
    }
}
