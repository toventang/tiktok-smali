package com.ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import com.ss.android.ugc.aweme.utils.ai;
import h.f.b.l;
import java.util.Objects;

public final class SecurityAlertsCell extends RightTextCell<a> {
    static {
        Covode.recordClassIndex(80375);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void a() {
        a aVar;
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null && (aVar = (a) this.f34234d) != null) {
            commonItemView.setRightIconRes(aVar.f122550e);
        }
    }

    static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SecurityAlertsCell f122532a;

        static {
            Covode.recordClassIndex(80376);
        }

        a(SecurityAlertsCell securityAlertsCell) {
            this.f122532a = securityAlertsCell;
        }

        @Override // b.g
        public final Object then(i<Boolean> iVar) {
            if (!ai.a(iVar)) {
                return null;
            }
            l.b(iVar, "");
            Boolean d2 = iVar.d();
            l.b(d2, "");
            if (d2.booleanValue()) {
                a aVar = (a) this.f122532a.f34234d;
                if (aVar != null) {
                    aVar.f122550e = 2131233735;
                }
                this.f122532a.a();
            }
            return null;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void a(Object obj) {
        super.k();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsItem");
        this.f34234d = (a) obj;
        b.a();
        b.f62864a.m().getSafeInfo().a(new a(this), i.f4826c, null);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        l.d(view, "");
        super.onClick(view);
        String a2 = SettingsManager.a().a("security_center", "");
        l.b(a2, "");
        r.onEventV3("click_security_alert");
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(a2);
        gVar.a("lang", LocalServiceImpl.a().a(((RightTextCell) this).f122434a));
        gVar.a("locale", com.ss.android.ugc.aweme.i18n.language.a.b());
        gVar.a("aid", d.n);
        gVar.a("alerts_direct", 1);
        gVar.a("enter_from", "setting_security");
        SmartRouter.buildRoute(((RightTextCell) this).f122434a, "aweme://webview").withParam("url", gVar.a()).withParam("hide_nav_bar", true).open();
    }
}
