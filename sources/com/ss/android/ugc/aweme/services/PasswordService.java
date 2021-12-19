package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.e;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.aq;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import org.json.JSONException;
import org.json.JSONObject;

public class PasswordService extends BasePasswordService implements au {
    static {
        Covode.recordClassIndex(79532);
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, com.ss.android.ugc.aweme.br
    public void setPassword(Activity activity, Bundle bundle, IAccountService.g gVar) {
        super.setPassword(activity, bundle, gVar);
        SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam(bundle).withParam("next_page", k.CREATE_PASSWORD_FOR_PHONE.getValue()).open();
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, com.ss.android.ugc.aweme.br
    public void verifyPassword(Activity activity, String str, Bundle bundle, IAccountService.g gVar) {
        super.verifyPassword(activity, str, bundle, gVar);
        SmartRoute withParam = SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam("enter_from", str).withParam("next_page", k.VERIFY_PASSWORD.getValue());
        if (bundle != null) {
            withParam.withParam(bundle);
        }
        withParam.open();
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, com.ss.android.ugc.aweme.br
    public void changePassword(Activity activity, String str, String str2, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("enter_from", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_method", str2);
        }
        if (cj.f71084b.e().isChildrenMode()) {
            super.changePassword(activity, str, str2, bundle2, gVar);
            SmartRouter.buildRoute(activity, "//account/login/signup_or_login").withParam(bundle2).withParam("next_page", k.CHANGE_PASSWORD_FOR_CHILDREN.getValue()).open();
            return;
        }
        User f2 = cj.f();
        if (f2 != null) {
            bundle2.putBoolean("from_changePwd", true);
            String bindPhone = f2.getBindPhone();
            if (!TextUtils.isEmpty(bindPhone)) {
                e.b(bundle2, bindPhone);
                CommonFlowActivity.a.a(activity, k.PHONE_SMS_CHANGE_PASSWORD, j.CHANGE_PASSWORD, bundle2, gVar, null, false);
                return;
            }
            String email = f2.getEmail();
            if (TextUtils.isEmpty(email)) {
                cj.h().bindMobileOrEmail(activity, str, str2, bundle2, new PasswordService$$Lambda$1(this, bundle2, activity, str, str2, gVar));
            } else if (f2.isEmailVerified()) {
                e.a(bundle2, email);
                CommonFlowActivity.a.a(activity, k.EMAIL_SMS_CHANGE_PASSWORD, j.CHANGE_PASSWORD, bundle2, gVar, null, false);
            } else {
                bundle2.putBoolean("use_phone", true);
                bundle2.putBoolean("use_email", true);
                cj.h().verifyEmail(activity, str, bundle2, new PasswordService$$Lambda$0(bundle2, activity, gVar));
            }
        }
    }

    static final /* synthetic */ void lambda$changePassword$0$PasswordService(Bundle bundle, Activity activity, IAccountService.g gVar, int i2, int i3, Object obj) {
        if (i3 == 1) {
            bundle.putAll((Bundle) obj);
            CommonFlowActivity.a.a(activity, k.CHANGE_PASSWORD, j.CHANGE_PASSWORD, bundle, gVar, null, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BasePasswordService, com.ss.android.ugc.aweme.br
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, IAccountService.g gVar) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle2.putString("enter_from", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("enter_method", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            bundle2.putString("platForm", str);
        }
        CommonFlowActivity.a.a(activity, k.CHANGE_PASSWORD, j.CHANGE_PASSWORD, bundle2, gVar, null, false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$changePassword$1$PasswordService(Bundle bundle, Activity activity, String str, String str2, IAccountService.g gVar, int i2, int i3, Object obj) {
        String str3;
        if (i3 == 1) {
            if (obj instanceof aq) {
                try {
                    e.d(bundle, new JSONObject(((aq) obj).f66963b).optString("ticket", ""));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } else {
                bundle.putAll((Bundle) obj);
            }
            if (i2 == 7) {
                str3 = "phone";
            } else {
                str3 = "email";
            }
            setPasswordForMT(activity, str3, str, str2, bundle, gVar);
        }
    }
}
