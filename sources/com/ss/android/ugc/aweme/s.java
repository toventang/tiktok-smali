package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.util.b;
import com.ss.android.ugc.aweme.compliance.api.a;

final /* synthetic */ class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f120726a;

    static {
        Covode.recordClassIndex(78656);
    }

    s(Bundle bundle) {
        this.f120726a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f120726a;
        if (bundle == null) {
            bundle = bundle2;
        }
        int i2 = bundle.getInt("kr_marketing_notification_operation", 0);
        if (i2 != 0) {
            a.n().a(i2);
        }
        a.C1369a.a(bundle);
    }
}
