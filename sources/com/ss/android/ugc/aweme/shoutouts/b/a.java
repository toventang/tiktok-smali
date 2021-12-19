package com.ss.android.ugc.aweme.shoutouts.b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f133119a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(87051);
    }

    public static void a(Context context) {
        l.d(context, "");
        b(context, "https://www.tiktok.com/inapp/feedback/main/?hide_nav_bar=1&id=13188&entrance=TikTok_shoutouts");
    }

    public static boolean a(User user) {
        if (user == null) {
            return false;
        }
        int i2 = user.shoutoutsStatus / 100;
        int i3 = user.shoutoutsStatus % 100;
        if (i2 == 3 && (i3 == 3 || i3 == 6 || i3 == 7)) {
            return true;
        }
        return false;
    }

    public static void b(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview/");
        if (!(context instanceof Activity)) {
            buildRoute.addFlags(268435456);
        }
        buildRoute.withParam("url", str).open();
    }

    public static void a(Context context, String str) {
        l.d(context, "");
        if (str != null) {
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (!g2.isLogin()) {
                bo b2 = b.b();
                IAccountService.d dVar = new IAccountService.d();
                dVar.f62401a = (Activity) context;
                dVar.f62405e = new C3449a(context, str);
                b2.showLoginAndRegisterView(dVar.a());
                return;
            }
            SmartRouter.buildRoute(context, "//shoutouts/detail?creator_id=" + str + "&enter_from=home_page").open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shoutouts.b.a$a  reason: collision with other inner class name */
    public static final class C3449a implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f133120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f133121b;

        static {
            Covode.recordClassIndex(87052);
        }

        C3449a(Context context, String str) {
            this.f133120a = context;
            this.f133121b = str;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i3 == 1) {
                a.a(this.f133120a, this.f133121b);
            }
        }
    }

    public static void a(Context context, Integer num, String str) {
        l.d(context, "");
        String concat = "https://www.tiktok.com/web-inapp/shoutouts/creator/dashboard/?__status_bar=true&hide_nav_bar=1&should_full_screen=1&enter_from=".concat(String.valueOf(str));
        if (num != null) {
            num.intValue();
            concat = concat + "&order_filter=" + num;
        }
        b(context, concat);
    }

    public static void a(Context context, String str, String str2) {
        l.d(context, "");
        b(context, "https://www.tiktok.com/web-inapp/shoutouts/place-order?hide_nav_bar=1&__status_bar=true&should_full_screen=1&product_id=" + str + "&enter_from=" + str2);
    }
}
