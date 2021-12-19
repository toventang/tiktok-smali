package com.ss.android.ugc.aweme.qrcode.presenter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.IMainService;

final /* synthetic */ class f implements IMainService.DownLoadFinishListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f119793a;

    static {
        Covode.recordClassIndex(77829);
    }

    f(c cVar) {
        this.f119793a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.services.IMainService.DownLoadFinishListener
    public final void doAfterDownLoad(int i2, Boolean bool) {
        c cVar = this.f119793a;
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
