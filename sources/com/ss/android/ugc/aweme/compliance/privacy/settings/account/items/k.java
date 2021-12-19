package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class k extends a {

    /* renamed from: a  reason: collision with root package name */
    private final o f77574a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77575b = R.string.fmc;

    static {
        Covode.recordClassIndex(48001);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return this.f77574a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77575b;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        String str;
        l.d(context, "");
        r.a("enter_personalize_data", new d().a("enter_from", "privacy_and_safety_settings").f66730a);
        r.a("enter_personalize_data", new d().a("enter_from", "settings").f66730a);
        if (a.g().b() == 0) {
            str = "off";
        } else {
            str = "on";
        }
        r.a("show_personalization_status", new d().a("initial_status", str).f66730a);
        SmartRouter.buildRoute(context, "aweme://privacy/setting/personalization").withParam("user_data_download", com.ss.android.ugc.aweme.compliance.privacy.settings.a.b()).withParam("enter_from", "privacy_and_safety_settings").open();
    }
}
