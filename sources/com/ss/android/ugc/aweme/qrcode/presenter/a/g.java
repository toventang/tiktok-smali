package com.ss.android.ugc.aweme.qrcode.presenter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;

final /* synthetic */ class g implements IMovieReuseService.b {

    /* renamed from: a  reason: collision with root package name */
    private final c f119794a;

    static {
        Covode.recordClassIndex(77830);
    }

    g(c cVar) {
        this.f119794a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IMovieReuseService.b
    public final void a(int i2, Boolean bool) {
        c cVar = this.f119794a;
        if (cVar.f119762b == null) {
            return;
        }
        if (bool.booleanValue()) {
            cVar.f119762b.e();
            cVar.f119762b.b();
            cVar.f119762b.c();
            return;
        }
        cVar.f119762b.b();
        if (i2 == 0) {
            cVar.f119762b.a(200);
        } else if (i2 == -1) {
            cVar.f119762b.a(0);
        } else {
            cVar.f119762b.a(1500);
        }
    }
}
