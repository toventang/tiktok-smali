package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.a;

final /* synthetic */ class p implements IAccountService.g {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f114575a;

    static {
        Covode.recordClassIndex(73759);
    }

    p(Bundle bundle) {
        this.f114575a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        a.C1369a.a(this.f114575a);
    }
}
