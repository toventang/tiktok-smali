package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.util.b;
import com.ss.android.ugc.aweme.compliance.api.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f144711a;

    static {
        Covode.recordClassIndex(94662);
    }

    w(Bundle bundle) {
        this.f144711a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f144711a;
        if (bundle == null) {
            bundle = bundle2;
        }
        a.n().a(f.j());
        a.C1369a.a(bundle);
    }
}
