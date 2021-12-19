package com.ss.android.ugc.aweme.sticker.presenter.handler;

import androidx.appcompat.app.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import h.f.b.l;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    private final d f135393a;

    /* renamed from: b  reason: collision with root package name */
    private final h f135394b;

    static {
        Covode.recordClassIndex(88446);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(b bVar, a aVar) {
        l.d(bVar, "");
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        this.f135394b.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void b(a aVar) {
        l.d(aVar, "");
        this.f135394b.a(this.f135393a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(a aVar) {
        l.d(aVar, "");
        return g.v(aVar.f135378a);
    }

    public i(d dVar, h hVar) {
        l.d(dVar, "");
        l.d(hVar, "");
        this.f135393a = dVar;
        this.f135394b = hVar;
    }
}
