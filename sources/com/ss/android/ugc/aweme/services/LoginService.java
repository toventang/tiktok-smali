package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.apiguard.ApiGuardService;
import com.ss.android.ugc.aweme.account.base.a.a;
import com.ss.android.ugc.aweme.account.bean.d;
import com.ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.aa;
import com.ss.android.ugc.aweme.account.login.ab;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.login.recover.f;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity;
import com.ss.android.ugc.aweme.account.login.s;
import com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity;
import com.ss.android.ugc.aweme.account.login.v;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.n.h;
import com.ss.android.ugc.aweme.account.n.j;
import com.ss.android.ugc.aweme.account.ui.RecoverDeletedAccountActivity;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.bx;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.user.c;
import com.ss.android.ugc.aweme.utils.bo;
import com.ss.android.ugc.aweme.utils.bt;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginService extends BaseLoginService implements au {
    private Dialog mLoginDialog;

    static {
        Covode.recordClassIndex(79514);
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.bo
    public Class<? extends Activity> getPushLoginActivityClass() {
        return PushLoginActivity.class;
    }

    public void retryLogin() {
        retryLogin(false);
    }

    static final /* synthetic */ void lambda$null$0$LoginService() {
        cj.a(1, 3, (Object) "");
        cj.i();
    }

    @Override // com.ss.android.ugc.aweme.bo
    public boolean isEnableMultiAccountLogin() {
        if (!b.a().a(true, "enable_multi_account_login", true) || com.ss.android.ugc.aweme.account.b.g().isChildrenMode()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.mLoginDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mLoginDialog = null;
        }
        Dialog dialog2 = this.mLoginDialog;
        if (dialog2 != null && dialog2.isShowing()) {
            this.mLoginDialog.dismiss();
            this.mLoginDialog = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.bo
    public List<d> getAllSupportedLoginPlatform() {
        LinkedList linkedList = new LinkedList(super.getAllSupportedLoginPlatform());
        linkedList.add(new d("Email", 2131231097, "email"));
        linkedList.addAll(h.a(v.values()));
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.services.LoginService$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 79519(0x1369f, float:1.1143E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName[] r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.services.LoginService.AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName = r2
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.THIRD_PARTY     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.services.LoginService.AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_NUMBER_PASS     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.services.LoginService.AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_SMS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.services.LoginService.AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.EMAIL_PASS     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.services.LoginService.AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.aweme.account.login.model.LoginMethodName r0 = com.ss.android.ugc.aweme.account.login.model.LoginMethodName.USER_NAME_PASS     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.LoginService.AnonymousClass1.<clinit>():void");
        }
    }

    public boolean isLoginActivity(Activity activity) {
        return activity instanceof SignUpOrLoginActivity;
    }

    public void openPrivacyPolicy(Activity activity) {
        bt.a(a.b(activity));
    }

    public static boolean com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(Context context) {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void retryLogin(boolean z) {
        new Handler().postDelayed(new LoginService$$Lambda$2(this, z), 300);
    }

    public static boolean com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable_1(Context context) {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo = com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo(context);
        j.f107229h = com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
        return com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_I18nLancet_isNetworkAvailableTwo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$retryLogin$3$LoginService(boolean z) {
        q.b(new BaseLoginMethod());
        if (getLoginParam() != null) {
            getLoginParam().f62397d.putBoolean("from_third_party_login", z);
            showLoginAndRegisterView(getLoginParam());
        }
    }

    @Override // com.ss.android.ugc.aweme.bo
    public boolean toRecoverDeletedAccount(String str) {
        if (!cj.f().isUserCancelled()) {
            return false;
        }
        ((bf) com.ss.android.ugc.aweme.a.a(bf.class)).f().a();
        Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
        Intent intent = new Intent(a2, RecoverDeletedAccountActivity.class);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        com.ss.android.ugc.tiktok.security.a.a.a(intent, a2);
        a2.startActivity(intent);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.bo
    public void showLoginAndRegisterView(IAccountService.c cVar) {
        super.showLoginAndRegisterView(cVar);
        if (cVar.f62394a != null && !cVar.f62394a.isFinishing()) {
            ApiGuardService.createIApiGuardServicebyMonsterPlugin(false).initializeApiGuard();
            boolean z = cVar.f62397d.getBoolean("is_fullscreen_dialog");
            s.f63678a = cVar.f62397d.getString("enter_method", "");
            s.f63679b = cVar.f62397d.getString("enter_from", "");
            if (!com.ss.android.ugc.aweme.compliance.api.a.h().c() || z) {
                showLoginAndRegisterViewInner(cVar);
                return;
            }
            Activity activity = cVar.f62394a;
            Bundle bundle = cVar.f62397d;
            l.d(activity, "");
            l.d(bundle, "");
            com.ss.android.ugc.aweme.account.login.a aVar = new com.ss.android.ugc.aweme.account.login.a(activity, bundle);
            Window window = aVar.getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.flags |= 2;
                window.setAttributes(attributes);
                window.setWindowAnimations(R.style.uh);
            }
            aVar.show();
            this.mLoginDialog = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.bo
    public void showLoginView(IAccountService.c cVar) {
        super.showLoginView(cVar);
        r.a("click_login", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", s.f63678a).f62575a);
        IFeed0VVManagerService iFeed0VVManagerService = (IFeed0VVManagerService) com.ss.android.ugc.aweme.a.a(IFeed0VVManagerService.class);
        if (iFeed0VVManagerService != null) {
            iFeed0VVManagerService.a("click_login");
            iFeed0VVManagerService.b("LOGIN");
        }
        SmartRoute c2 = com.ss.android.ugc.aweme.account.n.m.c(cVar.f62394a);
        if (TextUtils.isEmpty(cVar.f62397d.getString("enter_type"))) {
            cVar.f62397d.putString("enter_type", "click_login");
        }
        ApiGuardService.createIApiGuardServicebyMonsterPlugin(false).initializeApiGuard();
        c2.withParam(cVar.f62397d);
        c2.open();
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void uploadAccountNum(boolean z) {
        LoginService g2 = cj.g();
        l.b(g2, "");
        if (g2.isEnableMultiAccountLogin()) {
            if (com.ss.android.ugc.aweme.account.n.j.f65181e == 0) {
                SharedPreferences a2 = com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), com.ss.android.ugc.aweme.account.n.j.f65177a, 0);
                com.ss.android.ugc.aweme.account.n.j.f65180d = a2.getInt(com.ss.android.ugc.aweme.account.n.j.f65178b, 0);
                com.ss.android.ugc.aweme.account.n.j.f65181e = a2.getLong(com.ss.android.ugc.aweme.account.n.j.f65179c, 0);
            }
            if (!cj.d()) {
                return;
            }
            if (!bo.a(com.ss.android.ugc.aweme.account.n.j.f65181e) || com.ss.android.ugc.aweme.account.n.j.f65180d != com.ss.android.ugc.aweme.account.b.g().allUidList().size()) {
                com.ss.android.ugc.aweme.account.n.j.f65180d = com.ss.android.ugc.aweme.account.b.g().allUidList().size();
                Calendar instance = Calendar.getInstance();
                l.b(instance, "");
                Date time = instance.getTime();
                l.b(time, "");
                com.ss.android.ugc.aweme.account.n.j.f65181e = time.getTime();
                com.ss.android.ugc.aweme.bf.d.a(com.bytedance.ies.ugc.appcontext.d.a(), com.ss.android.ugc.aweme.account.n.j.f65177a, 0).edit().putInt(com.ss.android.ugc.aweme.account.n.j.f65178b, com.ss.android.ugc.aweme.account.n.j.f65180d).putLong(com.ss.android.ugc.aweme.account.n.j.f65179c, com.ss.android.ugc.aweme.account.n.j.f65181e).apply();
                com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("account_num", com.ss.android.ugc.aweme.account.n.j.f65180d);
                IAccountUserService e2 = cj.f71084b.e();
                List<String> allUidList = e2.allUidList();
                l.b(allUidList, "");
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = allUidList.iterator();
                while (it.hasNext()) {
                    c findSignificanUserInfo = e2.findSignificanUserInfo(it.next());
                    if (findSignificanUserInfo != null) {
                        arrayList.add(findSignificanUserInfo);
                    }
                }
                r.a("multi_account_status", a3.a("user_ids", n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, j.a.C1452a.f65183a, 30)).f66730a);
            }
        }
    }

    public void showLoginAndRegisterViewInner(IAccountService.c cVar) {
        boolean z;
        boolean z2;
        BaseLoginMethod d2;
        int i2;
        boolean z3 = cVar.f62397d.getBoolean("is_fullscreen_dialog");
        if (cVar.f62397d.getBoolean("force_use_default_login_method", false) || z3) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = cVar.f62397d.getBoolean("show_login_page_first", MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowLoginTabFirst());
        boolean z5 = cVar.f62397d.getBoolean("is_disable_animation", false);
        List<BaseLoginMethod> a2 = q.a(cj.f71084b.e().allUidList());
        if (!cj.f71084b.k().isOneKeyLoginExprimentEnable() || com.bytedance.common.utility.collection.b.a((Collection) a2) || z3) {
            z2 = false;
        } else {
            z2 = true;
        }
        Serializable serializable = cVar.f62397d.getSerializable("extra_param");
        if (serializable == null) {
            serializable = new HashMap();
            cVar.f62397d.putSerializable("extra_param", serializable);
        }
        Map map = (Map) serializable;
        map.put("params_for_special", "uc_login");
        if (!cVar.f62397d.getBoolean("from_third_party_login") && !z2) {
            BaseLoginMethod d3 = q.d();
            LoginMethodName loginMethodName = d3.getLoginMethodName();
            if (loginMethodName == LoginMethodName.DEFAULT || z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            map.put("login_last_time", Integer.valueOf(i2 ^ 1));
            if (i2 == 0) {
                com.ss.android.ugc.aweme.account.a.b.a a3 = I18nSignUpActivity.a.a(s.f63679b, s.f63678a, "click_login", map);
                if (loginMethodName == LoginMethodName.THIRD_PARTY) {
                    a3.a(((TPLoginMethod) d3).getPlatform() + "_is_show", 1);
                } else {
                    a3.a("phone_email_show", 1);
                }
                r.a("login_notify", a3.f62575a);
            }
        }
        if (z2) {
            if (q.c() && !q.b()) {
                cVar.f62397d.putString("enter_method", "reinstall");
            }
            cVar.f62397d.putString("enter_type", "click_login");
            LoginMethodListActivity.a.a(cVar.f62394a, cVar.f62397d, a2, LoginService$$Lambda$0.$instance);
            com.ss.android.ugc.aweme.base.utils.m.a(LoginService$$Lambda$1.$instance);
            return;
        }
        if (z) {
            d2 = new BaseLoginMethod();
        } else {
            d2 = q.d();
        }
        if (d2.getLoginMethodName() == LoginMethodName.THIRD_PARTY) {
            if (q.c() && !q.b()) {
                cVar.f62397d.putString("enter_method", "reinstall");
            }
            TPLoginMethod tPLoginMethod = (TPLoginMethod) d2;
            if (ab.a(tPLoginMethod.getPlatform(), false, cVar.f62395b) == null) {
                if (TextUtils.isEmpty(cVar.f62397d.getString("enter_type"))) {
                    cVar.f62397d.putString("enter_type", "click_login");
                }
                Activity activity = cVar.f62394a;
                Bundle bundle = cVar.f62397d;
                l.d(activity, "");
                l.d(bundle, "");
                l.d(tPLoginMethod, "");
                aa aaVar = new aa(activity, bundle, tPLoginMethod);
                Window window = aaVar.getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.gravity = 80;
                    attributes.flags |= 2;
                    window.setAttributes(attributes);
                    window.setWindowAnimations(R.style.uh);
                }
                aaVar.show();
                this.mLoginDialog = aaVar;
                return;
            }
        } else {
            cVar.f62397d.putBoolean("has_callBack", false);
            if (loginByMethod(cVar.f62394a, cVar.f62397d, d2)) {
                return;
            }
        }
        I18nSignUpActivity.a.a(cVar.f62394a, cVar.f62397d, z4, cVar.f62397d.getBoolean("need_callback", false), z5);
    }

    public static void com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Activity activity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void openCountryListActivity(Activity activity, ax axVar) {
        Intent intent = new Intent(activity, MusCountryListActivity.class);
        MusCountryListActivity.f64078g = axVar;
        com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void saveDTicket(String str, String str2) {
        if (str == null) {
            str = "";
        }
        l.d(str2, "");
        l.d("d_ticket", "");
        l.d(str, "");
        if (!TextUtils.isEmpty(str2)) {
            Keva.getRepo("aweme_user_config__".concat(String.valueOf(str2))).storeString("d_ticket", str);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.BaseLoginService, com.ss.android.ugc.aweme.bo
    public void loginByPlatform(IAccountService.c cVar, d dVar) {
        k kVar;
        LoginMethodName loginMethodName;
        super.loginByPlatform(cVar, dVar);
        if (cVar.f62395b.equals("find_account")) {
            try {
                JSONObject jSONObject = new JSONObject(cVar.f62397d.getString("jsb_parmas"));
                jSONObject.optString("uid", "");
                String optString = jSONObject.optString("nickname", "");
                String optString2 = jSONObject.optString("email", "");
                String optString3 = jSONObject.optString("mobile", "");
                String optString4 = jSONObject.optString("not_login_ticket", "");
                Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("is_safe", false));
                String str = dVar.f62897c;
                f.b bVar = new f.b("", optString, optString2, optString3, null, optString4, valueOf.booleanValue(), valueOf.booleanValue());
                cVar.f62397d.putString("args_email", optString2);
                cVar.f62397d.putString("enter_from", "find_account");
                cVar.f62397d.putString("enter_method", "find_account");
                cVar.f62397d.putSerializable("recover_account_data", bVar);
                cVar.f62397d.putInt("current_scene", com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT.getValue());
                cVar.f62397d.putString("previous_uid", new g().getCurUserId());
                if (valueOf.booleanValue() && !optString4.isEmpty() && "mobile".equals(str)) {
                    cVar.f62397d.putInt("next_page", k.PHONE_SMS_LOGIN.getValue());
                    cVar.f62397d.putInt("current_scene", com.ss.android.ugc.aweme.account.login.v2.base.j.RECOVER_ACCOUNT.getValue());
                    cVar.f62397d.putInt("next_page", k.PHONE_SMS_LOGIN.getValue());
                    cVar.f62397d.putBoolean("email_should_add_email", true);
                } else if ("mobile".equals(str)) {
                    cVar.f62397d.putInt("next_page", k.PHONE_EMAIL_LOGIN.getValue());
                    cVar.f62397d.putInt("child_page", k.INPUT_PHONE_LOGIN.getValue());
                } else if ("email".equals(str)) {
                    cVar.f62397d.putInt("next_page", k.PHONE_EMAIL_LOGIN.getValue());
                    cVar.f62397d.putInt("child_page", k.INPUT_EMAIL_LOGIN.getValue());
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (cVar.f62397d.getBoolean("is_login", true)) {
            if (TextUtils.equals(dVar.f62897c, "mobile")) {
                loginMethodName = LoginMethodName.PHONE_SMS;
            } else if (TextUtils.equals(dVar.f62897c, "email")) {
                loginMethodName = LoginMethodName.EMAIL_PASS;
            }
            if (loginMethodName != null) {
                loginByMethodName(cVar.f62394a, cVar.f62397d, loginMethodName, null);
                return;
            }
        }
        String str2 = dVar.f62897c;
        str2.hashCode();
        if (str2.equals("mobile") || str2.equals("email")) {
            SmartRoute b2 = com.ss.android.ugc.aweme.account.n.m.b(cVar.f62394a);
            if (TextUtils.equals(dVar.f62897c, "mobile")) {
                kVar = k.INPUT_PHONE_SIGN_UP;
            } else {
                kVar = k.INPUT_EMAIL_SIGN_UP;
            }
            SmartRoute withParam = b2.withParam("child_page", kVar.getValue());
            if (TextUtils.isEmpty(cVar.f62397d.getString("enter_type"))) {
                cVar.f62397d.putString("enter_type", "click_login");
            }
            withParam.withParam(cVar.f62397d);
            withParam.open();
            return;
        }
        if (TextUtils.isEmpty(cVar.f62397d.getString("enter_type"))) {
            cVar.f62397d.putString("enter_type", "click_login");
        }
        ab.a(cVar.f62394a, dVar.f62897c, new com.ss.android.ugc.aweme.account.login.v2.base.h(cVar.f62397d.getString("enter_from", ""), cVar.f62397d.getString("enter_method", ""), "click_login", cVar.f62397d));
    }

    public void openFeedback(Activity activity, String str, String str2) {
        com.ss.android.ugc.aweme.account.n.g.a(activity, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.bo
    public void switchAccount(c cVar, Bundle bundle, bx bxVar) {
        com.ss.android.ugc.aweme.account.j.a.a(cVar.f142345a, bundle, false, false, bxVar);
    }

    static final /* synthetic */ void lambda$showLoginAndRegisterViewInner$1$LoginService(int i2, int i3, Object obj) {
        cj.a(10, 4, "");
        if (i3 != 1) {
            com.ss.android.ugc.aweme.base.utils.m.a(LoginService$$Lambda$3.$instance, 200);
        } else if (i2 == com.ss.android.ugc.aweme.account.login.v2.base.j.ONE_KEY_LOGIN.getValue()) {
            cj.a(1, 1, (Object) "");
            cj.a(cj.f());
        }
    }

    public boolean loginByMethod(Activity activity, Bundle bundle, BaseLoginMethod baseLoginMethod) {
        String platform;
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        int i2 = AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[loginMethodName.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3) {
                bundle.putSerializable("auto_fill_phone_number", ((PhoneLoginMethod) baseLoginMethod).getPhoneNumber());
            } else if (i2 == 4 || i2 == 5) {
                bundle.putSerializable("auto_fill_account_name", ((AccountPassLoginMethod) baseLoginMethod).getName());
            }
            platform = "";
        } else {
            platform = ((TPLoginMethod) baseLoginMethod).getPlatform();
        }
        return loginByMethodName(activity, bundle, loginMethodName, platform);
    }

    private boolean loginByMethodName(Activity activity, Bundle bundle, LoginMethodName loginMethodName, String str) {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$android$ugc$aweme$account$login$model$LoginMethodName[loginMethodName.ordinal()];
        if (i2 == 1) {
            ab.a(activity, str, new com.ss.android.ugc.aweme.account.login.v2.base.h(bundle.getString("enter_from", ""), bundle.getString("enter_method", ""), "click_login", bundle));
            return true;
        } else if (i2 == 2 || i2 == 3) {
            SmartRoute withParam = com.ss.android.ugc.aweme.account.n.m.c(activity).withParam("child_page", k.INPUT_PHONE_LOGIN.getValue());
            if (TextUtils.isEmpty(bundle.getString("enter_type"))) {
                bundle.putString("enter_type", "click_login");
            }
            withParam.withParam(bundle);
            withParam.open();
            return true;
        } else if (i2 != 4 && i2 != 5) {
            return false;
        } else {
            SmartRoute withParam2 = com.ss.android.ugc.aweme.account.n.m.c(activity).withParam("child_page", k.INPUT_EMAIL_LOGIN.getValue());
            if (TextUtils.isEmpty(bundle.getString("enter_type"))) {
                bundle.putString("enter_type", "click_login");
            }
            withParam2.withParam(bundle);
            withParam2.open();
            return true;
        }
    }

    private void onThirdPartyLoginClick(Context context, String str, Bundle bundle, String str2, String str3) {
        if (!com_ss_android_ugc_aweme_services_LoginService_com_ss_android_ugc_aweme_lancet_IPCCacheLancet_isNetworkAvailable_1(context)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.de8).a();
            return;
        }
        com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", str2).a("enter_from", str3).a("platform", str).a("enter_type", "click_login");
        String str4 = "";
        if (bundle != null) {
            String string = bundle.getString("group_id");
            if (!TextUtils.isEmpty(string)) {
                str4 = string;
            }
        }
        r.a("login_submit", a2.a("group_id", str4).a("log_pb", com.ss.android.ugc.aweme.account.k.c.a(bundle)).f62575a);
        if (str != null) {
            com.ss.android.ugc.aweme.account.k.d dVar = new com.ss.android.ugc.aweme.account.k.d();
            dVar.f63120b = str2;
            dVar.f63121c = str;
            dVar.a();
            Intent intent = new Intent(context, AuthorizeActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("platform", str);
            intent.putExtra("enter_from", str3);
            intent.putExtra("enter_method", str2);
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 1001);
            }
            com.ss.android.ugc.aweme.account.login.k.a(str, str3, str2);
        }
    }
}
