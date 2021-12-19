package com.ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.login.trusted.d;
import com.ss.android.ugc.aweme.account.login.trusted.f;
import com.ss.android.ugc.aweme.account.login.trusted.g;
import com.ss.android.ugc.aweme.account.util.b;
import h.f.b.l;

final /* synthetic */ class x implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f145098a;

    static {
        Covode.recordClassIndex(94888);
    }

    x(Bundle bundle) {
        this.f145098a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f145098a;
        if (bundle == null) {
            bundle = bundle2;
        }
        k kVar = new k(bundle);
        l lVar = new l(bundle);
        l.d(kVar, "");
        l.d(lVar, "");
        if (!g.b()) {
            lVar.invoke();
            return;
        }
        if (System.currentTimeMillis() - Keva.getRepo("repo_new_version_journey").getLong("key_first_launch_time", 0) < f.a().f63712b) {
            lVar.invoke();
        } else if (System.currentTimeMillis() - Keva.getRepo("save_info_keva_repo").getLong("key_last_show_time", 0) < f.a().f63711a) {
            lVar.invoke();
        } else {
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            if (j2 == null || j2.isFinishing()) {
                lVar.invoke();
            } else if (cj.f71084b.k().getSaveLoginStatus() || !cj.f71084b.k().isOneKeyLoginExprimentEnable()) {
                lVar.invoke();
            } else {
                a aVar = a.C0732a.f33434a;
                DialogContext.a aVar2 = new DialogContext.a((m) j2);
                aVar2.f33424a = b.a.SAVE_LOGIN_INFO;
                aVar.a(aVar2.b(new d.C1428d(j2, kVar)));
            }
        }
    }
}
