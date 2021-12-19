package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class q extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77654a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77655b = i.a((h.f.a.a) a.f77657a);

    /* renamed from: c  reason: collision with root package name */
    private final int f77656c = R.string.etv;

    static {
        Covode.recordClassIndex(48057);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return (o) this.f77655b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77656c;
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77657a = new a();

        static {
            Covode.recordClassIndex(48058);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return b.a(0, "hide_search");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        SmartRouter.buildRoute(context, "//privacy/suggest_account").open();
    }

    public q(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77654a = privacySettingViewModel;
    }
}
