package com.ss.android.ugc.aweme.compliance.privacy.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.data.g;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77329a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(47830);
    }

    public static IAccountService f() {
        IAccountService a2 = AccountService.a();
        l.b(a2, "");
        return a2;
    }

    public static String a() {
        IAccountUserService e2;
        IAccountService a2 = AccountService.a();
        if (a2 == null || (e2 = a2.e()) == null) {
            return null;
        }
        return e2.getCurUserId();
    }

    public static boolean c() {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        User curUser = e2.getCurUser();
        l.b(curUser, "");
        return curUser.isForcePrivateAccount();
    }

    public static boolean d() {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        return e2.isLogin();
    }

    public static User e() {
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        User curUser = e2.getCurUser();
        l.b(curUser, "");
        return curUser;
    }

    public static boolean b() {
        Boolean bool;
        boolean z;
        q b2 = b.b();
        String str = null;
        if (b2 != null) {
            if (b2.f76692h == 1) {
                z = true;
            } else {
                z = false;
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = null;
        }
        IAccountUserService e2 = AccountService.a().e();
        l.b(e2, "");
        User curUser = e2.getCurUser();
        l.b(curUser, "");
        boolean isSecret = curUser.isSecret();
        boolean a2 = l.a(Boolean.valueOf(isSecret), bool);
        p[] pVarArr = new p[3];
        pVarArr[0] = v.a("fromProfile", Boolean.valueOf(isSecret));
        pVarArr[1] = v.a("fromPrivate", bool);
        LogPbBean logPbBean = g.f77401b;
        if (logPbBean != null) {
            str = logPbBean.getImprId();
        }
        pVarArr[2] = v.a("logId", str);
        com.ss.android.ugc.aweme.compliance.common.c.a.a("pri_acc_val_check", a2, ag.a(pVarArr));
        return isSecret;
    }

    public static void a(boolean z) {
        AccountService.a().e().updateCurAdAuthorization(z);
    }
}
