package com.ss.android.ugc.aweme.account.login.v2.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.r;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.ss.android.ugc.aweme.account.login.n;
import com.ss.android.ugc.aweme.account.login.q;
import com.ss.android.ugc.aweme.account.login.recover.f;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.account.network.AccountRetrofitInetcept;
import com.ss.android.ugc.aweme.account.util.h;
import com.ss.android.ugc.aweme.account.util.p;
import com.ss.android.ugc.aweme.al.e;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IRegionMockService;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.Objects;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f64146a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f64147b = false;

    private a() {
    }

    static {
        Covode.recordClassIndex(39527);
    }

    private static String a(k kVar) {
        switch (b.f64150c[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return "mobile";
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
                return "email";
            case 17:
                return "qr_code";
            default:
                return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.a$a  reason: collision with other inner class name */
    public static final class C1438a extends m implements b<i<Bundle>, z> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ JSONObject $extra;

        static {
            Covode.recordClassIndex(39528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1438a(Activity activity, JSONObject jSONObject) {
            super(1);
            this.$activity = activity;
            this.$extra = jSONObject;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i<Bundle> iVar) {
            String str;
            l.d(iVar, "");
            this.$activity.finish();
            if (cj.d()) {
                cj.a(1, 1, (Object) "");
            }
            com.ss.android.ugc.aweme.account.f.a.a(11);
            com.ss.android.ugc.aweme.account.f.a.a(9);
            cj.a(cj.f());
            JSONObject jSONObject = this.$extra;
            if (jSONObject != null) {
                str = jSONObject.optString("enter_from");
            } else {
                str = null;
            }
            if (l.a((Object) "find_account", (Object) str)) {
                c.a(new e());
                c.a(new com.ss.android.ugc.aweme.al.c());
            }
            return z.f158842a;
        }
    }

    private static String b(k kVar) {
        switch (b.f64151d[kVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "phone_sms";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "phone_password";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return "email_or_username";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return "reset_password_for_phone";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return "qr_code_login";
            case ABRConfig.ABR_SELECT_SCENE:
                return "phone_sms_two_factor_password";
            case 15:
                return "phone_sms_two_factor_email_code";
            case 16:
                return "email_password_two_factor_email_code";
            case 17:
                return "email_password_two_factor_sms";
            default:
                return "";
        }
    }

    private static void a(Bundle bundle) {
        BaseLoginMethod baseLoginMethod;
        LoginMethodName loginMethodName;
        LoginMethodName loginMethodName2;
        if (bundle.getSerializable("recover_account_data") != null) {
            Serializable serializable = bundle.getSerializable("recover_account_data");
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.recover.RecoverVerifyAccountFragment.RecoverAccountModel");
            if (!((f.b) serializable).getNeedStoreLastMethod()) {
                q.b(new BaseLoginMethod(null, null, null, null, null, null, null, null, null, 511, null));
                return;
            }
        }
        switch (b.f64149b[k.a.a(bundle.getInt("current_page")).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                a.C1412a b2 = com.ss.android.ugc.aweme.account.login.v2.base.e.b(bundle);
                if (b2 == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, 495, null);
                    break;
                } else {
                    String b3 = cj.b();
                    l.b(b3, "");
                    baseLoginMethod = new PhoneLoginMethod(b3, LoginMethodName.PHONE_SMS, b2, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                    break;
                }
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                a.C1412a b4 = com.ss.android.ugc.aweme.account.login.v2.base.e.b(bundle);
                if (b4 == null) {
                    baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, 495, null);
                    break;
                } else {
                    String b5 = cj.b();
                    l.b(b5, "");
                    baseLoginMethod = new PhoneLoginMethod(b5, LoginMethodName.PHONE_NUMBER_PASS, b4, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                    break;
                }
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
            case 17:
                String a2 = com.ss.android.ugc.aweme.account.login.v2.base.e.a(bundle);
                if (h.a(a2)) {
                    loginMethodName = LoginMethodName.EMAIL_PASS;
                } else {
                    loginMethodName = LoginMethodName.USER_NAME_PASS;
                }
                String b6 = cj.b();
                l.b(b6, "");
                baseLoginMethod = new AccountPassLoginMethod(b6, loginMethodName, a2, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                break;
            default:
                a.C1412a b7 = com.ss.android.ugc.aweme.account.login.v2.base.e.b(bundle);
                String a3 = com.ss.android.ugc.aweme.account.login.v2.base.e.a(bundle);
                if (h.a(a3)) {
                    loginMethodName2 = LoginMethodName.EMAIL_PASS;
                } else {
                    loginMethodName2 = LoginMethodName.USER_NAME_PASS;
                }
                if (b7 == null) {
                    if (!TextUtils.isEmpty(a3)) {
                        baseLoginMethod = new BaseLoginMethod(null, null, null, null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, 495, null);
                        break;
                    } else {
                        String b8 = cj.b();
                        l.b(b8, "");
                        baseLoginMethod = new AccountPassLoginMethod(b8, loginMethodName2, a3, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                        break;
                    }
                } else {
                    String b9 = cj.b();
                    l.b(b9, "");
                    baseLoginMethod = new PhoneLoginMethod(b9, LoginMethodName.PHONE_SMS, b7, null, Long.valueOf(System.currentTimeMillis()), null, null, 104, null);
                    break;
                }
        }
        q.b(baseLoginMethod);
    }

    public static void a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, j jVar, k kVar, com.bytedance.sdk.a.n.a aVar) {
        l.d(cVar, "");
        l.d(jVar, "");
        l.d(kVar, "");
        l.d(aVar, "");
        cj.a(aVar);
        AccountRetrofitInetcept.a("");
        Bundle arguments = cVar.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        l.b(arguments, "");
        a(arguments);
        androidx.fragment.app.e activity = cVar.getActivity();
        if (activity != null) {
            r<Bundle> rVar = ((ActionResultModel) ae.a(activity, (ad.b) null).a(ActionResultModel.class)).f64699b;
            if (aVar.f43467e) {
                Bundle arguments2 = cVar.getArguments();
                if (arguments2 == null) {
                    l.b();
                }
                arguments2.putBoolean("new_user_need_set_username", true);
                if (kVar == k.EMAIL_SMS_SIGN_UP || kVar == k.CREATE_PASSWORD_FOR_EMAIL) {
                    Bundle arguments3 = cVar.getArguments();
                    if (arguments3 == null) {
                        l.b();
                    }
                    arguments3.putBoolean("new_user_need_get_recommend_username", true);
                    Bundle arguments4 = cVar.getArguments();
                    if (arguments4 == null) {
                        l.b();
                    }
                    arguments4.putString("set_username_platform", "email");
                } else {
                    Bundle arguments5 = cVar.getArguments();
                    if (arguments5 == null) {
                        l.b();
                    }
                    arguments5.putBoolean("new_user_need_set_pass_word", true);
                    Bundle arguments6 = cVar.getArguments();
                    if (arguments6 == null) {
                        l.b();
                    }
                    arguments6.putString("set_username_platform", "sms_verification");
                }
            } else if (cVar.getActivity() instanceof SignUpOrLoginActivity) {
                androidx.fragment.app.e activity2 = cVar.getActivity();
                Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                ((SignUpOrLoginActivity) activity2).f64775a = null;
                Object a2 = com.ss.android.ugc.aweme.a.a(bf.class);
                l.b(a2, "");
                if (((bf) a2).d() == 1) {
                    com.ss.android.ugc.aweme.account.agegate.util.h.a();
                }
            }
            String a3 = a(kVar);
            if (!TextUtils.isEmpty(a3)) {
                arguments.putString("platform", a3);
            }
            String b2 = b(kVar);
            if (!TextUtils.isEmpty(b2)) {
                arguments.putString("login_path", b2);
            }
            rVar.postValue(arguments);
        }
        if (p.a()) {
            ServiceManager.get().getService(IRegionMockService.class);
        }
    }

    public static void a(com.ss.android.ugc.aweme.account.login.v2.base.c cVar, int i2, String str, j jVar, k kVar, JSONObject jSONObject) {
        boolean z;
        String optString;
        String optString2;
        h hVar;
        String str2 = str;
        String str3 = "";
        l.d(cVar, str3);
        l.d(str2, str3);
        l.d(jVar, str3);
        l.d(kVar, str3);
        Bundle arguments = cVar.getArguments();
        boolean z2 = false;
        if (arguments == null || !arguments.getBoolean("from_ProAccount")) {
            z = false;
        } else {
            z = true;
        }
        if (!n.f63503a.contains(Integer.valueOf(i2)) && !n.f63504b.contains(Integer.valueOf(i2))) {
            Application application = com.ss.android.ugc.aweme.a.f62426a;
            if (cVar.V_() == k.PHONE_PASSWORD_LOGIN || cVar.V_() == k.PHONE_EMAIL_LOGIN) {
                z2 = true;
            }
            switch (i2) {
                case 1001:
                    if (z) {
                        com.ss.android.ugc.aweme.common.r.a("input_wrong_phone", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Phone Captcha").a("error_code", "2").f62575a);
                    }
                    hVar = new l(cVar, i2, str2);
                    break;
                case 1002:
                case 1003:
                    if (z) {
                        com.ss.android.ugc.aweme.common.r.a("input_wrong_phone", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Phone Captcha").a("error_code", "1").f62575a);
                    }
                    String string = application.getString(R.string.aqs);
                    l.b(string, str3);
                    hVar = new l(cVar, i2, string);
                    break;
                case 1009:
                    if (!z2) {
                        if (cVar.V_() != k.EMAIL_PASSWORD_LOGIN && cVar.V_() != k.INPUT_EMAIL_LOGIN) {
                            hVar = new l(cVar, i2, str2);
                            break;
                        } else {
                            String string2 = application.getString(R.string.aoc);
                            l.b(string2, str3);
                            hVar = new l(cVar, i2, string2);
                            break;
                        }
                    } else {
                        String string3 = application.getString(R.string.aoz);
                        l.b(string3, str3);
                        hVar = new l(cVar, i2, string3);
                        break;
                    }
                    break;
                case 1011:
                    cVar.V_();
                    switch (b.f64148a[cVar.V_().ordinal()]) {
                        case 1:
                            if (!(jSONObject == null || (optString = jSONObject.optString("sms_code_key")) == null)) {
                                str3 = optString;
                            }
                            hVar = new k(cVar, str3);
                            break;
                        case 2:
                            if (!(jSONObject == null || (optString2 = jSONObject.optString("sms_code_key")) == null)) {
                                str3 = optString2;
                            }
                            hVar = new j(cVar, str3);
                            break;
                        case 3:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            String string4 = application.getString(R.string.aoc);
                            l.b(string4, str3);
                            hVar = new l(cVar, i2, string4);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            String string5 = application.getString(R.string.apb);
                            l.b(string5, str3);
                            hVar = new l(cVar, i2, string5);
                            break;
                        default:
                            hVar = new l(cVar, i2, str2);
                            break;
                    }
                case 1023:
                    if (z) {
                        com.ss.android.ugc.aweme.common.r.a("input_wrong_email", new com.ss.android.ugc.aweme.account.a.b.a().a("page", "Input Email Captcha").a("error_code", "2").f62575a);
                    }
                    String string6 = application.getString(R.string.bmi);
                    l.b(string6, str3);
                    hVar = new l(cVar, i2, string6);
                    break;
                case 1024:
                case 1028:
                    String string7 = application.getString(R.string.are);
                    l.b(string7, str3);
                    hVar = new l(cVar, i2, string7);
                    break;
                case 1027:
                    String string8 = application.getString(R.string.arf);
                    l.b(string8, str3);
                    hVar = new l(cVar, i2, string8);
                    break;
                case 1033:
                case 1034:
                    hVar = new l(cVar, i2, str2);
                    break;
                case 1039:
                    a.C1412a b2 = com.ss.android.ugc.aweme.account.login.v2.base.e.b(cVar);
                    if (z2 && b2 != null) {
                        hVar = new m(cVar, b2, i2, jSONObject, jVar, kVar);
                        break;
                    } else {
                        hVar = new l(cVar, i2, str2);
                        break;
                    }
                case 1051:
                    String string9 = application.getString(R.string.aqn);
                    l.b(string9, str3);
                    hVar = new l(cVar, i2, string9);
                    break;
                case 1053:
                    String string10 = application.getString(R.string.h0u);
                    l.b(string10, str3);
                    hVar = new l(cVar, i2, string10);
                    break;
                case 1054:
                    String string11 = application.getString(R.string.apj);
                    l.b(string11, str3);
                    hVar = new l(cVar, i2, string11);
                    break;
                case 1075:
                case 2006:
                    if (jVar != j.RECOVER_ACCOUNT) {
                        hVar = new l(cVar, i2, str2);
                        break;
                    } else {
                        String string12 = application.getString(R.string.f_z);
                        l.b(string12, str3);
                        hVar = new l(cVar, i2, string12);
                        break;
                    }
                case 1092:
                    if (cVar.A() != j.BIND_PHONE && cVar.A() != j.MODIFY_PHONE) {
                        if (jVar != j.RECOVER_ACCOUNT) {
                            hVar = new l(cVar, i2, str2);
                            break;
                        } else {
                            String string13 = application.getString(R.string.f_z);
                            l.b(string13, str3);
                            hVar = new l(cVar, i2, string13);
                            break;
                        }
                    } else {
                        String string14 = application.getString(R.string.fo1);
                        l.b(string14, str3);
                        hVar = new l(cVar, i2, string14);
                        break;
                    }
                    break;
                case 1202:
                    String string15 = application.getString(R.string.aqx);
                    l.b(string15, str3);
                    hVar = new l(cVar, i2, string15);
                    break;
                case 1203:
                    String string16 = application.getString(R.string.d82);
                    l.b(string16, str3);
                    hVar = new l(cVar, i2, string16);
                    break;
                case 1320:
                    hVar = new d(cVar);
                    break;
                case 1356:
                    String string17 = application.getString(R.string.h1a);
                    l.b(string17, str3);
                    hVar = new l(cVar, i2, string17);
                    break;
                case 1381:
                    h hVar2 = new h(cVar, jSONObject, jVar, kVar);
                    boolean z3 = hVar2.f64164b.f64159a;
                    hVar = hVar2;
                    if (!z3) {
                        String string18 = application.getString(R.string.bpf);
                        l.b(string18, str3);
                        hVar = new l(cVar, i2, string18);
                        break;
                    }
                    break;
                case 1382:
                    String string19 = application.getString(R.string.awk);
                    l.b(string19, str3);
                    hVar = new l(cVar, i2, string19);
                    break;
                case 1383:
                    String string20 = application.getString(R.string.awl);
                    l.b(string20, str3);
                    hVar = new l(cVar, i2, string20);
                    break;
                case 1388:
                    hVar = new c(cVar, str2);
                    break;
                case 1450:
                    hVar = new n(cVar, jSONObject);
                    break;
                case 2003:
                case 2004:
                    if (cVar.A() != j.BIND_PHONE && cVar.A() != j.MODIFY_PHONE) {
                        hVar = new l(cVar, i2, str2);
                        break;
                    } else {
                        String string21 = application.getString(R.string.fo1);
                        l.b(string21, str3);
                        hVar = new l(cVar, i2, string21);
                        break;
                    }
                case 2013:
                    hVar = new e(cVar, jSONObject);
                    break;
                case 2015:
                    hVar = new i(cVar, jVar, kVar, jSONObject);
                    break;
                case 2027:
                case 2028:
                    if (TextUtils.isEmpty(str2)) {
                        str2 = application.getString(R.string.d0_);
                    }
                    l.b(str2, str3);
                    hVar = new l(cVar, i2, str2);
                    break;
                case 2037:
                    hVar = new f(cVar);
                    break;
                default:
                    hVar = new l(cVar, i2, str2);
                    break;
            }
            hVar.a();
        }
    }
}
