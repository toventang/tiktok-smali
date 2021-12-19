package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class r extends a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77658a;

    /* renamed from: b  reason: collision with root package name */
    private final o f77659b;

    /* renamed from: c  reason: collision with root package name */
    private final int f77660c = R.string.g5;

    static {
        Covode.recordClassIndex(48059);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return this.f77659b;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77660c;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        SmartRouter.buildRoute(context, "//setting/findcontact").withParam("currentSettingsValue", this.f77658a).open(10);
    }
}
