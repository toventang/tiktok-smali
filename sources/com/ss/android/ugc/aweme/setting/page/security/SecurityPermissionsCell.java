package com.ss.android.ugc.aweme.setting.page.security;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.page.base.RightTextCell;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class SecurityPermissionsCell extends RightTextCell<d> {

    /* renamed from: b  reason: collision with root package name */
    private final h f122542b = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(80390);
    }

    static final class a extends m implements h.f.a.a<SecurityViewModel> {
        final /* synthetic */ SecurityPermissionsCell this$0;

        static {
            Covode.recordClassIndex(80391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SecurityPermissionsCell securityPermissionsCell) {
            super(0);
            this.this$0 = securityPermissionsCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SecurityViewModel invoke() {
            return PowerCell.b(this.this$0, SecurityViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.RightTextCell
    public final void onClick(View view) {
        l.d(view, "");
        SecurityViewModel securityViewModel = (SecurityViewModel) this.f122542b.getValue();
        if (securityViewModel != null) {
            securityViewModel.f122549b = true;
        }
        r.a("enter_manage_apps_permissions", new d().a("previous_page", "security and login").a("setting_security", "settings_security").f66730a);
        SmartRouter.buildRoute(((RightTextCell) this).f122434a, "//authmanagement").open();
    }
}
