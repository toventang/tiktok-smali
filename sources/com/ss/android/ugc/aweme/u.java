package com.ss.android.ugc.aweme;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.account.util.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f141620a;

    static {
        Covode.recordClassIndex(92547);
    }

    u(Bundle bundle) {
        this.f141620a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f141620a;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle.getBoolean("kids_mode_restart", false)) {
            r.onEventV3("kids_log_in");
            Context j2 = f.j();
            if (j2 == null) {
                j2 = d.a();
            }
            a.q().a(j2);
        } else if (bundle.getBoolean("need_restart", false)) {
            new Handler().postDelayed(new n(bundle), 500);
        } else {
            a.C1369a.a(bundle);
        }
    }
}
