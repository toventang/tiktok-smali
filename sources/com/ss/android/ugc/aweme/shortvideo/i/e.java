package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.b.d;
import com.ss.android.ugc.aweme.port.in.g;
import h.f.b.l;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final a f128555a;

    static {
        Covode.recordClassIndex(84289);
    }

    @Override // com.bytedance.creativex.recorder.filter.b.d
    public final String b() {
        return this.f128555a.a();
    }

    @Override // com.bytedance.creativex.recorder.filter.b.d
    public final boolean c() {
        return this.f128555a.b();
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final boolean a() {
        return g.a().e().getDisableFilter(false);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final int a(int i2) {
        return this.f128555a.a(i2);
    }

    public e(a aVar) {
        l.d(aVar, "");
        this.f128555a = aVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.b.d
    public final void a(String str) {
        l.d(str, "");
        this.f128555a.a(str);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final void a(boolean z) {
        g.a().e().setDisableFilter(z);
    }

    @Override // com.bytedance.creativex.recorder.filter.a.j
    public final void a(int i2, int i3) {
        this.f128555a.a(i2, i3);
    }
}
