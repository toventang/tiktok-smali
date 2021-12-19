package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class h extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77558a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f77559b = i.a((h.f.a.a) a.f77562a);

    /* renamed from: c  reason: collision with root package name */
    private final int f77560c = R.string.ng;

    /* renamed from: d  reason: collision with root package name */
    private final int f77561d = R.raw.icon_duet;

    static {
        Covode.recordClassIndex(47994);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return (o) this.f77559b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77560c;
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77562a = new a();

        static {
            Covode.recordClassIndex(47995);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return b.a(0, "duet");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77561d);
    }

    public h(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77558a = privacySettingViewModel;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_duet_permission", new d().a("enter_from", "privacy_and_safety_settings").a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        SmartRouter.buildRoute(context, "aweme://duetcontrol/setting").open(2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h r7, int r8) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.h.a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h, int):void");
    }
}
