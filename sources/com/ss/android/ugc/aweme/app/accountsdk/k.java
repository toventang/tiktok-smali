package com.ss.android.ugc.aweme.app.accountsdk;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.component.f;

public class k implements IAccountService.g {

    /* renamed from: a  reason: collision with root package name */
    private f f66555a;

    static {
        Covode.recordClassIndex(40910);
    }

    public k(f fVar) {
        this.f66555a = fVar;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public void onResult(int i2, int i3, Object obj) {
        f fVar = this.f66555a;
        if (fVar != null && i2 == 1) {
            if (i3 == 1) {
                fVar.a();
            } else {
                fVar.b();
            }
        }
    }
}
