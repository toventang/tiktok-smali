package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.j;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    private final b f128554a;

    static {
        Covode.recordClassIndex(84288);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final boolean a() {
        return g.a().e().getDisableFilter(false);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final int a(int i2) {
        return this.f128554a.a(i2);
    }

    public d(b bVar) {
        l.d(bVar, "");
        this.f128554a = bVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final void a(boolean z) {
        g.a().e().setDisableFilter(z);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final void a(int i2, int i3) {
        this.f128554a.a(i2, i3);
    }
}
