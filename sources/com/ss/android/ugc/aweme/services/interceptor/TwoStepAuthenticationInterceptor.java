package com.ss.android.ugc.aweme.services.interceptor;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.account.g.b;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.account.login.twostep.m;
import com.ss.android.ugc.aweme.account.login.twostep.v;
import com.ss.android.ugc.aweme.account.login.twostep.w;
import com.ss.android.ugc.aweme.account.login.v2.a.ae;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.tiktok.security.a.a;
import h.f.b.l;
import h.m.p;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import org.json.JSONObject;

public final class TwoStepAuthenticationInterceptor implements IInterceptor {
    private Integer currentErrorCode;
    public String currentUrlPath;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(79731);
            int[] iArr = new int[k.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[k.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV.ordinal()] = 1;
            iArr[k.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV.ordinal()] = 2;
            iArr[k.TWO_STEP_PHONE_VERIFY_EMAIL_CODE_2SV.ordinal()] = 3;
            iArr[k.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV.ordinal()] = 4;
            iArr[k.PUSH_VERIFY.ordinal()] = 5;
        }
    }

    static {
        Covode.recordClassIndex(79730);
    }

    public static int com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2, Throwable th) {
        return 0;
    }

    private final String getPathFromUrl(String str) {
        String str2 = null;
        try {
            str2 = new URI(str).getPath();
            return str2;
        } catch (NullPointerException e2) {
            if (!TwoStepAuthenticationInterceptorKt.DEBUG) {
                return str2;
            }
            com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_e("I18n.TwoStepInterceptor", "", e2);
            return str2;
        } catch (URISyntaxException e3) {
            if (!TwoStepAuthenticationInterceptorKt.DEBUG) {
                return str2;
            }
            com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_e("I18n.TwoStepInterceptor", "", e3);
            return str2;
        }
    }

    public final void register(j<b> jVar) {
        MethodCollector.i(10294);
        l.d(jVar, "");
        m a2 = m.a();
        TwoStepAuthenticationInterceptor$register$1 twoStepAuthenticationInterceptor$register$1 = new TwoStepAuthenticationInterceptor$register$1(jVar);
        synchronized (m.f63977a) {
            try {
                a2.f63979b = twoStepAuthenticationInterceptor$register$1;
            } finally {
                MethodCollector.o(10294);
            }
        }
    }

    public static void com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(Context context, Intent intent) {
        a.a(intent, context);
        context.startActivity(intent);
    }

    private final Integer getAuthType(Integer num, String str) {
        String optString;
        if (num != null && num.intValue() == 2020) {
            return 2;
        }
        if (num != null && num.intValue() == 2032) {
            return 1;
        }
        if (num != null && num.intValue() == 2033) {
            return 4;
        }
        if (num != null) {
            if (num.intValue() == 2025) {
                return 3;
            }
            if (num.intValue() == 2031) {
                return 5;
            }
            if (num.intValue() == 2067) {
                return 6;
            }
        }
        if (num != null && num.intValue() == 2046) {
            if (str == null) {
                str = "";
            }
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (!(optJSONObject == null || (optString = optJSONObject.optString("default_verify_way")) == null)) {
                switch (optString.hashCode()) {
                    case -797498437:
                        if (optString.equals("pwd_verify")) {
                            return 2;
                        }
                        break;
                    case 300626556:
                        if (optString.equals("email_verify")) {
                            return 4;
                        }
                        break;
                    case 312290780:
                        if (optString.equals("mobile_sms_verify")) {
                            return 1;
                        }
                        break;
                    case 961294113:
                        if (optString.equals("oauth_verify")) {
                            return 3;
                        }
                        break;
                }
            }
        }
        return null;
    }

    public final String getPlatForm(String str, Map<String, String> map, k kVar) {
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        if (str == null) {
            l.b();
        }
        if (p.a((CharSequence) str, (CharSequence) "/password/reset_by_ticket", false) || p.a((CharSequence) str, (CharSequence) "/password/reset_by_email_ticket", false)) {
            return "forgot_password";
        }
        if (p.a((CharSequence) str, (CharSequence) "/password/forced_reset_by_mobile_ticket", false)) {
            return "force_password_reset";
        }
        if (p.a((CharSequence) str, (CharSequence) "/passport/auth/login_only", false)) {
            if (map == null) {
                l.b();
            }
            String str2 = map.get("platform");
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[kVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (map == null || map.isEmpty()) {
                return "email";
            }
            if (map.containsKey("mobile")) {
                return "phone";
            }
            if (map.containsKey("email")) {
                return "email";
            }
            if (map.containsKey("username")) {
                return "handle";
            }
            if (map.containsKey("not_login_ticket")) {
                return "ticket";
            }
            return "unknown";
        } else if (i2 == 3 || i2 == 4) {
            return "sms_verification";
        } else {
            if (i2 != 5) {
                return str;
            }
            if (p.a((CharSequence) str, (CharSequence) "sms", false)) {
                return "sms_verification";
            }
            if (!p.a((CharSequence) str, (CharSequence) "user/login", false)) {
                return str;
            }
            if (map != null && !map.isEmpty()) {
                if (map.containsKey("email")) {
                    return "email";
                }
                if (map.containsKey("username")) {
                    return "username";
                }
            }
            return "unknown";
        }
    }

    public final i<b> authFor2067(Context context, j<b> jVar, String str, Map<String, String> map) {
        l.d(context, "");
        l.d(jVar, "");
        if (!(context instanceof Activity)) {
            jVar.b(new Exception("context is not Activity"));
            return jVar.f4869a;
        }
        register(jVar);
        w wVar = (w) com.ss.android.ugc.aweme.account.util.i.a(new JSONObject(str).optString("data"), w.class);
        ae.a(wVar.getVerify_ticket(), "").a(new TwoStepAuthenticationInterceptor$authFor2067$1(this, context, wVar, map), new TwoStepAuthenticationInterceptor$authFor2067$2(wVar));
        return jVar.f4869a;
    }

    private final i<b> startTwoStepAuthentication(Context context, String str, String str2, Map<String, String> map) {
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d("I18n.TwoStepInterceptor", "Starting 2-step auth, context: " + context + ", response: " + str2);
        }
        j<b> jVar = new j<>();
        if (context == null || str2 == null) {
            jVar.b(new Exception("Activity or response is null, activity: " + context + ", response: " + str2));
            return jVar.f4869a;
        }
        Integer authType = getAuthType(this.currentErrorCode, str2);
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d("I18n.TwoStepInterceptor", "Starting 2-step auth with type: ".concat(String.valueOf(authType)));
        }
        if (authType == null) {
            jVar.b(new Exception("Failed to parse error code from JSON response: ".concat(String.valueOf(str2))));
            return jVar.f4869a;
        }
        this.currentUrlPath = getPathFromUrl(str);
        Integer num = this.currentErrorCode;
        if (num != null && num.intValue() == 2046) {
            return authFor2046(context, jVar, str2, map, authType);
        }
        Integer num2 = this.currentErrorCode;
        if (num2 != null && num2.intValue() == 2067) {
            return authFor2067(context, jVar, str2, map);
        }
        register(jVar);
        Intent intent = new Intent(context, TwoStepAuthActivity.class);
        intent.putExtra("auth_type", authType.intValue());
        intent.putExtra("auth_data", str2);
        intent.putExtra("url_path", this.currentUrlPath);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(context, intent);
        return jVar.f4869a;
    }

    private final i<b> authFor2046(Context context, j<b> jVar, String str, Map<String, String> map, Integer num) {
        boolean z;
        String optString;
        if (!(context instanceof Activity)) {
            jVar.b(new Exception("context is not Activity"));
            return jVar.f4869a;
        }
        register(jVar);
        v vVar = (v) com.ss.android.ugc.aweme.account.util.i.a(new JSONObject(str).optString("data"), v.class);
        JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
        if (optJSONObject == null || (optString = optJSONObject.optString("profile_key")) == null || p.a((CharSequence) optString)) {
            z = true;
        } else {
            z = false;
        }
        ((Activity) context).runOnUiThread(new TwoStepAuthenticationInterceptor$authFor2046$1(this, map, num, !z, context, vVar, str));
        return jVar.f4869a;
    }

    @Override // com.ss.android.ugc.aweme.services.interceptor.IInterceptor
    public final Map<String, String> tryToIntercept(String str, Request request, String str2, int i2, Map<String, String> map) {
        String str3;
        androidx.c.a aVar = new androidx.c.a();
        Context j2 = f.j();
        if (j2 == null) {
            j2 = d.a();
        }
        this.currentErrorCode = Integer.valueOf(i2);
        i<b> startTwoStepAuthentication = startTwoStepAuthentication(j2, str, str2, map);
        if (startTwoStepAuthentication == null) {
            return aVar;
        }
        startTwoStepAuthentication.f();
        b d2 = startTwoStepAuthentication.d();
        if (TwoStepAuthenticationInterceptorKt.DEBUG) {
            StringBuilder append = new StringBuilder("interceptAndGetNewParams, 2-step auth result: ").append(d2);
            if (d2 != null) {
                str3 = "ticket: " + d2.f63032a + ", profileKey: " + d2.f63033b + ", errorCode: " + d2.f63034c + ", errorMessage: " + d2.f63035d;
            } else {
                str3 = null;
            }
            com_ss_android_ugc_aweme_services_interceptor_TwoStepAuthenticationInterceptor_com_ss_android_ugc_aweme_lancet_LogLancet_d("I18n.TwoStepInterceptor", append.append(str3).toString());
        }
        if (d2 == null || TextUtils.isEmpty(d2.f63032a)) {
            return aVar;
        }
        if (!TextUtils.isEmpty(d2.f63033b)) {
            aVar.put("profile_key", d2.f63033b);
        }
        aVar.put("verify_ticket", d2.f63032a);
        if (!TextUtils.isEmpty(d2.f63036e)) {
            aVar.put("sms_code_key", com.ss.android.ugc.aweme.account.util.f.a(d2.f63036e));
        }
        JSONObject a2 = new c().a("url_path", this.currentUrlPath).a("error_code", this.currentErrorCode).a();
        l.b(a2, "");
        com.ss.android.ugc.aweme.account.m.b.a("two_step_auth", 0, a2);
        return aVar;
    }
}
