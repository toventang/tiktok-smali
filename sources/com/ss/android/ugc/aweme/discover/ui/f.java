package com.ss.android.ugc.aweme.discover.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.ui.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements f.a.d.f {

    /* renamed from: a  reason: collision with root package name */
    private final b f82585a;

    static {
        Covode.recordClassIndex(51412);
    }

    f(b bVar) {
        this.f82585a = bVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        b bVar = this.f82585a;
        b.C1932b bVar2 = (b.C1932b) obj;
        if (bVar2.f82375b && com.bytedance.ies.ugc.appcontext.f.f34637l) {
            bVar2.f82374a.h();
        }
        if (bVar.s != null) {
            bVar.s.dispose();
        }
    }
}
