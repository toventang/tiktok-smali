package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.util.b;
import com.ss.android.ugc.aweme.compliance.api.a;

final /* synthetic */ class j implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f104783a;

    static {
        Covode.recordClassIndex(67192);
    }

    j(Bundle bundle) {
        this.f104783a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f104783a;
        if (bundle == null) {
            bundle = bundle2;
        }
        a.h().b();
        if (!cj.g().toRecoverDeletedAccount("enter_from_login_ui_routine")) {
            a.C1369a.a(bundle);
        }
    }
}
