package com.ss.android.ugc.trill.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.accountsdk.k;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.base.d.d;
import com.ss.android.ugc.d.a.c;

public final class b extends k {
    static {
        Covode.recordClassIndex(98945);
    }

    public b(f fVar) {
        super(fVar);
    }

    @Override // com.ss.android.ugc.aweme.app.accountsdk.k, com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        super.onResult(i2, i3, obj);
        if (i2 == 12 && i3 == 1) {
            c.a(new d());
        }
    }
}
