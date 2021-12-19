package com.ss.android.ugc.aweme.account.login.authorize;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class h implements IAccountService.g {

    /* renamed from: a  reason: collision with root package name */
    private final AuthorizeActivity f63362a;

    static {
        Covode.recordClassIndex(39050);
    }

    h(AuthorizeActivity authorizeActivity) {
        this.f63362a = authorizeActivity;
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.g
    public final void onResult(int i2, int i3, Object obj) {
        AuthorizeActivity authorizeActivity = this.f63362a;
        if (i2 == 9 && i3 == 1) {
            d.a(obj instanceof Bundle ? (Bundle) obj : new Bundle(), authorizeActivity, new i(authorizeActivity));
        } else {
            new a(authorizeActivity.getBaseContext()).a(R.string.bpf).a();
        }
    }
}
