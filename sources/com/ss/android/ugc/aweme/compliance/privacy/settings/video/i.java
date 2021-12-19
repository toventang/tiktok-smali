package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.bytedance.tux.sheet.sheet.a;
import com.zhiliaoapp.musically.R;
import f.a.d.f;

final /* synthetic */ class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f77884a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f77885b;

    static {
        Covode.recordClassIndex(48271);
    }

    i(a aVar, boolean z) {
        this.f77884a = aVar;
        this.f77885b = z;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f77884a;
        boolean z = this.f77885b;
        new b(aVar.getParentFragment() instanceof a ? aVar.getParentFragment() : aVar).e(R.string.bp3).b();
        aVar.f77833h = !z;
        aVar.f77837l.a(new aw(aVar));
    }
}
