package com.ss.android.ugc.aweme.aabplugin.core.base;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aabplugin.core.base.a.c;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import f.a.d.f;

final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a f62489a;

    static {
        Covode.recordClassIndex(38455);
    }

    j(a aVar) {
        this.f62489a = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        a aVar = this.f62489a;
        if (aVar.f62466g == null) {
            return;
        }
        if (aVar.f62466g.f62511e == n.b.PENDING || aVar.f62466g.f62511e == n.b.RUNNING) {
            c.a(aVar.f62466g, 6, null);
        }
    }
}
