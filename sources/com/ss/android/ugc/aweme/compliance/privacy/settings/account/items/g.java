package com.ss.android.ugc.aweme.compliance.privacy.settings.account.items;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77554a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final o f77555b;

    /* renamed from: c  reason: collision with root package name */
    private final int f77556c = R.string.fo_;

    /* renamed from: d  reason: collision with root package name */
    private final int f77557d = R.string.foa;

    static {
        Covode.recordClassIndex(47992);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47993);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final o e() {
        return this.f77555b;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final int f() {
        return this.f77556c;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.f, com.ss.android.ugc.aweme.compliance.privacy.settings.account.a.i, com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final boolean d() {
        return com.ss.android.ugc.aweme.compliance.privacy.settings.a.b();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.b
    public final Integer g() {
        return Integer.valueOf(this.f77557d);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.a
    public final void a(Context context) {
        String str;
        l.d(context, "");
        r.a("enter_data_download", new d().a("enter_from", "personalization_data").f66730a);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (g2.isLogin() || !GuestModeServiceImpl.d().c()) {
            str = "https://www.tiktok.com/falcon/rn/export_data/?enter_from=settings&hide_nav_bar=1";
        } else {
            str = "https://www.tiktok.com/web-inapp/download-your-data/guest?hide_nav_bar=1&should_full_screen=1";
        }
        buildRoute.withParam("url", str).withParam("hide_nav_bar", true).open();
    }
}
