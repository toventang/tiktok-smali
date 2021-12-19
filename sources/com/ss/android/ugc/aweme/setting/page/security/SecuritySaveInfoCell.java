package com.ss.android.ugc.aweme.setting.page.security;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.bn;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.page.base.SwitchCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class SecuritySaveInfoCell extends SwitchCell<e> {

    static final class a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f122543a = new a();

        static {
            Covode.recordClassIndex(80393);
        }

        a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
        }
    }

    static {
        Covode.recordClassIndex(80392);
    }

    public final void a(boolean z) {
        r.a("switch_login_save", new d().a("state", z ? 1 : 0).f66730a);
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.k().updateMethodInfo("allow_one_key_login", Boolean.valueOf(z));
        com.ss.android.ugc.aweme.setting.page.base.d dVar = (com.ss.android.ugc.aweme.setting.page.base.d) this.f34234d;
        if (dVar != null) {
            dVar.f122450c = z;
        }
        a();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell
    public final void onClick(View view) {
        l.d(view, "");
        super.onClick(view);
        com.ss.android.ugc.aweme.account.b.a();
        bn k2 = com.ss.android.ugc.aweme.account.b.f62864a.k();
        if (!k2.getSaveLoginStatus()) {
            a(true);
        } else if (k2.isOneKeyLoginExprimentEnable()) {
            d dVar = new d();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            r.a("remove_login_info_notify", dVar.a("user_id", g2.getCurUserId()).f66730a);
            a.C0731a aVar = new a.C0731a(((SwitchCell) this).f122435a);
            aVar.a(R.string.fn);
            aVar.M = false;
            aVar.b(R.string.fk).b(R.string.fl, (DialogInterface.OnClickListener) a.f122543a, false).a(R.string.fm, (DialogInterface.OnClickListener) new b(this), false).a().c();
        } else {
            a(false);
        }
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SecuritySaveInfoCell f122544a;

        static {
            Covode.recordClassIndex(80394);
        }

        b(SecuritySaveInfoCell securitySaveInfoCell) {
            this.f122544a = securitySaveInfoCell;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            d dVar = new d();
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            r.a("remove_login_info_confirm", dVar.a("user_id", g2.getCurUserId()).f66730a);
            this.f122544a.a(false);
        }
    }
}
