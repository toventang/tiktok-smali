package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final o f77533a;

    /* renamed from: b  reason: collision with root package name */
    private final int f77534b = R.string.etm;

    /* renamed from: c  reason: collision with root package name */
    private final int f77535c = R.raw.icon_block;

    static {
        Covode.recordClassIndex(47983);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return this.f77533a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77534b;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77535c);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_blocked_accounts", new d().a("enter_from", "privacy_and_safety_settings").f66730a);
        r.onEvent(new MobClick().setEventName("black_list").setLabelName("message"));
        SmartRouter.buildRoute(context, "//setting/blocklist").open();
    }
}
