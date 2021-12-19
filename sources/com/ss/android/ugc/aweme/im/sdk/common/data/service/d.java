package com.ss.android.ugc.aweme.im.sdk.common.data.service;

import android.app.Activity;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.c.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.h;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget;
import com.ss.android.ugc.aweme.im.service.j.c;
import com.ss.android.ugc.aweme.im.service.share.b;
import com.ss.android.ugc.aweme.im.service.share.b.a;
import com.ss.android.ugc.aweme.sharer.ui.e;
import h.f.b.l;
import java.util.Set;

public final class d implements c {
    static {
        Covode.recordClassIndex(65639);
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.c
    public final b a(com.ss.android.ugc.aweme.im.service.share.b.c cVar) {
        l.d(cVar, "");
        return new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.c(cVar);
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.c
    public final void a(a aVar, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        new LongPressShareWidget(aVar, bVar);
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.c
    public final b a(com.ss.android.ugc.aweme.im.service.share.b.b bVar, com.ss.android.ugc.aweme.im.service.share.a.c cVar) {
        l.d(bVar, "");
        l.d(cVar, "");
        com.bytedance.ies.im.core.api.b.a().a(a.EnumC0747a.ENTER_SHARE_PANEL);
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.b bVar2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.b(bVar, cVar);
        cVar.a(bVar2);
        com.ss.android.ugc.aweme.im.service.share.b.b bVar3 = bVar2.f103418b;
        if (!com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a() || h.a(bVar2.f103418b.f103954k) || bVar3 == null) {
            bVar2.f103418b.f103947a.setVisibility(8);
        } else {
            bVar2.f103417a = new SharePanelWidget(bVar2.f103418b, bVar2.f103419c);
        }
        return bVar2;
    }

    @Override // com.ss.android.ugc.aweme.im.service.j.c
    public final Dialog a(Activity activity, e eVar, com.ss.android.ugc.aweme.im.service.share.c cVar, int i2, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        l.d(activity, "");
        l.d(eVar, "");
        if (cVar == null) {
            return com.ss.android.ugc.aweme.im.sdk.share.ui.b.a.a(activity, eVar.f124657i, (Set) null, true, (com.ss.android.ugc.aweme.im.service.share.a.a) null, false, (com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c) null, 236);
        }
        l.d(activity, "");
        l.d(eVar, "");
        l.d(cVar, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            return new com.ss.android.ugc.aweme.im.sdk.share.ui.d.a(activity, cVar);
        }
        return new com.ss.android.ugc.aweme.im.sdk.share.ui.nested.a(activity, cVar, bVar, eVar, i2);
    }
}
