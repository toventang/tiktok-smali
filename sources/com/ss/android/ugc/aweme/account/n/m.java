package com.ss.android.ugc.aweme.account.n;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import h.f.b.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f65186a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(40078);
    }

    public static final SmartRoute a(Context context) {
        l.d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/ftc").withParam("current_scene", j.SIGN_UP.getValue()).withParam("next_page", k.FTC_CREATE_ACCOUNT.getValue());
        l.b(withParam, "");
        return withParam;
    }

    public static final SmartRoute b(Context context) {
        l.d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/login/signup_or_login").withParam("current_scene", j.SIGN_UP.getValue()).withParam("next_page", k.PHONE_EMAIL_SIGN_UP.getValue());
        l.b(withParam, "");
        return withParam;
    }

    public static final SmartRoute c(Context context) {
        l.d(context, "");
        SmartRoute withParam = SmartRouter.buildRoute(context, "//account/login/signup_or_login").withParam("current_scene", j.LOGIN.getValue()).withParam("next_page", k.PHONE_EMAIL_LOGIN.getValue());
        l.b(withParam, "");
        return withParam;
    }
}
