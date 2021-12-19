package com.ss.android.ugc.aweme.dsp.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.homepage.ui.view.FlippableViewPagerExt;
import h.f.b.l;

public final class e implements a, b {

    /* renamed from: a  reason: collision with root package name */
    private final a f84026a;

    /* renamed from: b  reason: collision with root package name */
    private final FlippableViewPagerExt f84027b;

    static {
        Covode.recordClassIndex(52397);
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.b
    public final int a() {
        return this.f84027b.getCurrentItemCompat();
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.b
    public final void a(boolean z) {
        this.f84027b.f99523a = z;
    }

    public e(a aVar, FlippableViewPagerExt flippableViewPagerExt) {
        l.d(aVar, "");
        l.d(flippableViewPagerExt, "");
        this.f84026a = aVar;
        this.f84027b = flippableViewPagerExt;
    }

    @Override // com.ss.android.ugc.aweme.dsp.ui.a.b
    public final void a(int i2, boolean z) {
        this.f84027b.a(i2, z);
    }
}
