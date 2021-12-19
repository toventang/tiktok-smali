package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.util.b;
import com.ss.android.ugc.aweme.utils.in;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f120026a;

    static {
        Covode.recordClassIndex(77997);
    }

    r(Bundle bundle) {
        this.f120026a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f120026a;
        if (bundle == null) {
            bundle = bundle2;
        }
        Activity j2 = f.j();
        if (!com.ss.android.ugc.aweme.account.b.d().a().a(j2, new o(bundle))) {
            if (in.d()) {
                bundle.putBoolean("kids_mode_restart", true);
                ((bf) a.a(bf.class)).a(j2);
            }
            a.C1369a.a(bundle);
        }
    }
}
