package com.ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.a;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.v2.a.v;
import com.ss.android.ugc.aweme.account.login.v2.base.g;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import h.f.b.l;
import java.util.Map;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static final ab f63327a = new ab();

    private ab() {
    }

    static {
        Covode.recordClassIndex(39025);
    }

    public static void a(Activity activity, Intent intent) {
        l.d(activity, "");
        if (intent != null) {
            activity.startActivityForResult(intent, 1001);
        }
    }

    public static l a(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str == null) {
            l.b();
        }
        if (str2 == null) {
            str2 = "";
        }
        p pVar = new p(str, z, str2);
        if (pVar.a()) {
            return pVar;
        }
        return null;
    }

    public static void a(Activity activity, String str, g gVar) {
        l.d(activity, "");
        l.d(str, "");
        l.d(gVar, "");
        Intent a2 = a(activity, false, str, gVar);
        if (a2 != null) {
            activity.startActivityForResult(a2, 1001);
        }
    }

    public static Intent a(Activity activity, boolean z, String str, g gVar) {
        l.d(activity, "");
        l.d(str, "");
        l.d(gVar, "");
        l a2 = a(str, z, gVar.W_());
        if (a2 != null) {
            a2.a(activity);
            return null;
        }
        v.a((Boolean) null, str, gVar, false, (Map) null, false, 56);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) a.a(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.a("Mob.Event.LOGIN_SUBMIT_".concat(String.valueOf(str)));
            iFeed0VVManagerService.b("LOGIN");
        }
        Intent intent = new Intent(activity, AuthorizeActivity.class);
        Bundle aa_ = gVar.aa_();
        if (aa_ != null) {
            intent.putExtras(aa_);
        }
        intent.putExtra("platform", str).putExtra("enter_from", gVar.W_()).putExtra("enter_method", gVar.X_());
        k.a(str, gVar.W_(), gVar.X_());
        return intent;
    }
}
