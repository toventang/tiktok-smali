package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.b;
import com.ss.android.ugc.aweme.utils.in;

final /* synthetic */ class m implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f109041a;

    static {
        Covode.recordClassIndex(69830);
    }

    m(Bundle bundle) {
        this.f109041a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.b
    public final void a() {
        Bundle bundle = this.f109041a;
        if (in.d()) {
            a.m().a();
        }
        a.C1369a.a(bundle);
    }
}
