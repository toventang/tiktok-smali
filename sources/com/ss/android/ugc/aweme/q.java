package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity;
import com.ss.android.ugc.aweme.account.util.b;

final /* synthetic */ class q implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f118913a;

    /* renamed from: b  reason: collision with root package name */
    private final k f118914b;

    static {
        Covode.recordClassIndex(77246);
    }

    q(Bundle bundle, k kVar) {
        this.f118913a = bundle;
        this.f118914b = kVar;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f118913a;
        k kVar = this.f118914b;
        if (bundle != null) {
            bundle2 = bundle;
        }
        Activity j2 = f.j();
        if (j2 != null) {
            CommonFlowActivity.a(j2, kVar, j.LOGIN_FLOW, bundle2, new p(bundle2), LoginActionFlowActivity.class, true);
        } else {
            a.C1369a.a(bundle2);
        }
    }
}
