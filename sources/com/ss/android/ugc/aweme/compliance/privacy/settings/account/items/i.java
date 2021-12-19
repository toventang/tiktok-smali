package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
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
import h.h;

public final class i extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77563a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77564b = h.i.a((h.f.a.a) a.f77567a);

    /* renamed from: c  reason: collision with root package name */
    private final int f77565c = R.string.eu3;

    /* renamed from: d  reason: collision with root package name */
    private final int f77566d = R.raw.icon_two_person;

    static {
        Covode.recordClassIndex(47996);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return (o) this.f77564b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77565c;
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77567a = new a();

        static {
            Covode.recordClassIndex(47997);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return b.a(0, "following_visibility");
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77566d);
    }

    public i(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77563a = privacySettingViewModel;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        SmartRouter.buildRoute(context, "//privacy/following_visibility").open(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        r.a("click_following_list_setting", new d().a("enter_from", "privacy_setting").f66730a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h r7, int r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.i.a(com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.h, int):void");
    }
}
