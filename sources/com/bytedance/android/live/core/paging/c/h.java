package com.bytedance.android.live.core.paging.c;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.paging.b.c;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final c f9191a;

    /* renamed from: b  reason: collision with root package name */
    private final c f9192b;

    static {
        Covode.recordClassIndex(4706);
    }

    h(c cVar, c cVar2) {
        this.f9191a = cVar;
        this.f9192b = cVar2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c cVar = this.f9191a;
        c cVar2 = this.f9192b;
        if (!cVar.f9183l.f9167h) {
            if (cVar2.f9168i) {
                a.a(3, "RxCacheDataSource", "called refresh, but paging not rebuild data source");
            }
            cVar2.f9168i = true;
            cVar.f_();
        }
    }
}
