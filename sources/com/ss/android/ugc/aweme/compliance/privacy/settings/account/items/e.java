package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.ss.android.ugc.aweme.fe.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public final PrivacySettingViewModel f77544a;

    /* renamed from: b  reason: collision with root package name */
    private final h f77545b = i.a((h.f.a.a) a.f77548a);

    /* renamed from: c  reason: collision with root package name */
    private final int f77546c = R.string.nd;

    /* renamed from: d  reason: collision with root package name */
    private final int f77547d = R.raw.icon_bubble_ellipsis_right;

    static {
        Covode.recordClassIndex(47988);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean c() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean d() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return (o) this.f77545b.getValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77546c;
    }

    static final class a extends m implements h.f.a.a<o> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77548a = new a();

        static {
            Covode.recordClassIndex(47989);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ o invoke() {
            return b.a(0, UGCMonitor.EVENT_COMMENT);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer h() {
        return Integer.valueOf(this.f77547d);
    }

    public e(PrivacySettingViewModel privacySettingViewModel) {
        l.d(privacySettingViewModel, "");
        this.f77544a = privacySettingViewModel;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        l.d(context, "");
        r.a("enter_comment_permission", new d().a("enter_from", "privacy_and_safety_settings").a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        r.a("enter_comment_filter", new d().a("enter_from", "privacy_and_safety_settings").f66730a);
        Boolean a2 = e.a.f91018a.a("filter_comment_manager_visible_" + com.ss.android.ugc.aweme.compliance.privacy.a.a.a(), (Boolean) true);
        d a3 = new d().a("enter_from", "privacy_setting");
        l.b(a2, "");
        r.a("enter_filter_comment", a3.a("is_show_management", a2.booleanValue() ? 1 : 0).f66730a);
        SmartRouter.buildRoute(context, "//commentcontrol/setting").open(3);
    }
}
