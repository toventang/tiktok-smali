package com.ss.android.ugc.aweme;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.util.b;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.compliance.api.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class v implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f143198a;

    static {
        Covode.recordClassIndex(93733);
    }

    v(Bundle bundle) {
        this.f143198a = bundle;
    }

    @Override // com.ss.android.ugc.aweme.account.util.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = this.f143198a;
        if (bundle == null) {
            bundle = bundle2;
        }
        if (Keva.getRepo("compliance_setting").getBoolean("need_to_show_ftc_age_gate_but_no_showed", false)) {
            n.a("aweme_age_gate_not_show", "", new c().a("platform", Integer.valueOf(cj.f().getLoginPlatform())).a());
        }
        a.j().a(new m(bundle));
    }
}
