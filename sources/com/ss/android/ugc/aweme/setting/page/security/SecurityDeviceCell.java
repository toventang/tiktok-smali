package com.ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.i18n.language.a;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import com.ss.android.ugc.aweme.setting.services.e;
import h.f.b.l;

public final class SecurityDeviceCell extends RightTextCell<b> {
    static {
        Covode.recordClassIndex(80377);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void k() {
        super.k();
        View view = this.itemView;
        if (!(view instanceof CommonItemView)) {
            view = null;
        }
        CommonItemView commonItemView = (CommonItemView) view;
        if (commonItemView != null) {
            commonItemView.setRightIconRes(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        l.d(view, "");
        super.onClick(view);
        r.onEventV3("click_your_device");
        String c2 = e.f122670a.c();
        if (c2 != null) {
            g gVar = new g(c2);
            gVar.a("locale", a.b());
            gVar.a("aid", d.n);
            gVar.a("enter_from", "setting_security");
            SmartRouter.buildRoute(((RightTextCell) this).f122434a, "aweme://webview").withParam("url", gVar.a()).withParam("hide_nav_bar", true).open();
        }
    }
}
