package com.ss.android.ugc.aweme.account.login.v2.a;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.ss.android.ugc.aweme.account.a.b.a;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.g;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.ug.i;
import h.f.b.ad;
import h.f.b.l;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public final class v {

    /* renamed from: a */
    public static final v f64273a = new v();

    private v() {
    }

    public static void a(boolean z, String str, String str2, String str3, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("set_password_response", new a().a("platform", str).a("enter_from", str2).a("enter_method", str3).a("is_success", z ? 1 : 0).a("status", z ? "success" : "fail").a("error_code", i2).f62575a);
    }

    public static /* synthetic */ void a(boolean z, String str, g gVar, com.bytedance.sdk.a.n.a aVar, Map map, boolean z2, int i2) {
        if ((i2 & 16) != 0) {
            map = null;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        a(z, str, gVar, aVar, map, z2);
    }

    public static void a(boolean z, String str, g gVar, com.bytedance.sdk.a.n.a aVar, Map<String, ? extends Object> map, boolean z2) {
        l.d(str, "");
        l.d(gVar, "");
        a aVar2 = new a();
        Map<String, Object> a2 = a(gVar.aa_());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        a(aVar2, hashMap);
        a a3 = aVar2.a("enter_method", gVar.X_()).a("enter_from", gVar.W_()).a("is_register", z ? 1 : 0).a("error_code", 0);
        long j2 = -1;
        a3.a("user_id", aVar != null ? aVar.f43463a : -1).a("gms_auto_fill", z2 ? 1 : 0);
        if (l.a((Object) str, (Object) "google_onetap")) {
            aVar2.a("enter_type", "google_onetap").a("platform", "google");
        } else {
            aVar2.a("enter_type", gVar.Y_()).a("platform", str);
        }
        Integer a4 = HybridABInfoService.b().a();
        if (a4 != null) {
            aVar2.a("is_ab_backend_resp_received", a4.intValue());
        }
        r.a("login_success", aVar2.f62575a);
        String W_ = gVar.W_();
        String X_ = gVar.X_();
        String Y_ = gVar.Y_();
        if (aVar != null) {
            j2 = aVar.f43463a;
        }
        i.a.a(z, str, W_, X_, Y_, z2, j2);
    }

    public static void a(boolean z, int i2, String str, g gVar, Map<String, ? extends Object> map, boolean z2) {
        l.d(str, "");
        l.d(gVar, "");
        a aVar = new a();
        Map<String, Object> a2 = a(gVar.aa_());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        a(aVar, hashMap);
        aVar.a("enter_method", gVar.X_()).a("enter_from", gVar.W_()).a("is_register", z ? 1 : 0).a("error_code", i2).a("gms_auto_fill", z2 ? 1 : 0);
        if (l.a((Object) str, (Object) "google_onetap")) {
            aVar.a("enter_type", "google_onetap").a("platform", "google");
        } else {
            aVar.a("enter_type", gVar.Y_()).a("platform", str);
        }
        Integer a3 = HybridABInfoService.b().a();
        if (a3 != null) {
            aVar.a("is_ab_backend_resp_received", a3.intValue());
        }
        r.a("login_failure", aVar.f62575a);
    }

    public static void a(boolean z, c cVar) {
        l.d(cVar, "");
        r.a("verify_sms_code", new a().a("enter_from", cVar.w()).a("enter_method", cVar.x()).a("status", z ? 1 : 2).f62575a);
    }

    public static void a(String str, String str2, int i2, int i3, String str3, int i4) {
        l.d(str3, "");
        r.a("gms_login_info_save_status", new a().a("platform", str).a("enter_method", str3).a("user_id", str2).a("error_code", i3).a("gms_auto_fill", i4).a("status", i2).f62575a);
    }

    public static /* synthetic */ void a(String str, String str2, String str3) {
        l.d(str3, "");
        r.a("gms_login_info_save_notify", new a().a("platform", str).a("enter_method", str3).a("gms_auto_fill", 0).a("user_id", str2).f62575a);
    }

    public static void a(String str) {
        l.d(str, "");
        r.a("gms_login_info_autofill_confirm", new a().a("platform", str).f62575a);
    }

    static {
        Covode.recordClassIndex(39597);
    }

    public static Map<String, Object> a(Bundle bundle) {
        Serializable serializable;
        Map<String, Object> map = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("extra_param");
        } else {
            serializable = null;
        }
        if (ad.g(serializable)) {
            map = serializable;
        }
        return map;
    }

    private static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            Object a2 = a(context, "phone");
            if (a2 != null) {
                String simOperatorName = ((TelephonyManager) a2).getSimOperatorName();
                l.b(simOperatorName, "");
                return simOperatorName;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8488);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8488);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public static void a(a aVar, Map<String, ? extends Object> map) {
        if (!(map == null || map.isEmpty())) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Integer) {
                    aVar.a(key, ((Number) value).intValue());
                } else if (value instanceof String) {
                    aVar.a(key, (String) value);
                } else if (value instanceof Long) {
                    aVar.a(key, ((Number) value).longValue());
                } else {
                    aVar.a(key, "");
                }
            }
        }
    }

    public static void b(int i2, String str, String str2) {
        int i3;
        l.d(str, "");
        l.d(str2, "");
        a a2 = new a().a("enter_from", str).a("enter_method", str2);
        if (i2 == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        r.a("email_code_login_result", a2.a("is_success", i3).a("error_code", i2).f62575a);
    }

    public static void a(int i2, String str, String str2) {
        int i3;
        l.d(str, "");
        l.d(str2, "");
        a a2 = new a().a("enter_from", str).a("enter_method", str2);
        if (i2 == 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        r.a("email_code_verification_result", a2.a("is_success", i3).a("error_code", i2).f62575a);
    }

    public static /* synthetic */ void b(boolean z, String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        r.a("verify_password_response", new a().a("platform", str).a("enter_from", str2).a("enter_method", str3).a("is_success", z ? 1 : 0).a("error_code", 0).f62575a);
    }

    public static void a(int i2, String str, int i3, String str2, String str3, String str4) {
        String str5;
        l.d(str, "");
        l.d(str2, "");
        a a2 = new a().a("send_method", str).a("send_reason", i3).a("send_type", str2);
        if (i2 == 0) {
            str5 = "success";
        } else {
            str5 = "fail";
        }
        a a3 = a2.a("status", str5).a("error_code", i2).a("fail_info", str3).a("params_for_special", "uc_login").a("carrier", a(com.bytedance.ies.ugc.appcontext.d.a()));
        if (!TextUtils.isEmpty(str4)) {
            try {
                Phonenumber.PhoneNumber parse = PhoneNumberUtil.getInstance().parse(str4, null);
                l.b(parse, "");
                a3.a("phone_country", parse.getCountryCode());
                a3.a("phone_number_cnt", String.valueOf(parse.getNationalNumber()).length());
            } catch (NumberParseException e2) {
                e2.printStackTrace();
            }
        }
        r.a("uc_send_sms", a3.f62575a);
    }

    public static void a(Boolean bool, String str, g gVar, boolean z, Map<String, ? extends Object> map, boolean z2) {
        l.d(str, "");
        l.d(gVar, "");
        a aVar = new a();
        Map<String, Object> a2 = a(gVar.aa_());
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (a2 != null) {
            hashMap.putAll(a2);
        }
        a(aVar, hashMap);
        aVar.a("enter_method", gVar.X_()).a("enter_from", gVar.W_()).a("log_pb", com.ss.android.ugc.aweme.account.k.c.a(gVar.aa_()));
        if (l.a((Object) str, (Object) "google_onetap")) {
            aVar.a("enter_type", "google_onetap").a("platform", "google");
        } else {
            aVar.a("enter_type", gVar.Y_()).a("platform", str);
        }
        if (bool != null) {
            aVar.a("is_register", bool.booleanValue() ? 1 : 0);
        }
        if (z) {
            aVar.a("login_from", "reset_password");
        }
        aVar.a("gms_auto_fill", z2 ? 1 : 0);
        r.a("login_submit", aVar.f62575a);
    }

    public static /* synthetic */ void a(boolean z, int i2, String str, g gVar, Map map, boolean z2, int i3) {
        if ((i3 & 16) != 0) {
            map = null;
        }
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        a(z, i2, str, gVar, map, z2);
    }

    public static /* synthetic */ void a(Boolean bool, String str, g gVar, boolean z, Map map, boolean z2, int i2) {
        Boolean bool2 = bool;
        boolean z3 = z2;
        boolean z4 = z;
        Map map2 = null;
        if ((i2 & 1) != 0) {
            bool2 = null;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        if ((i2 & 16) == 0) {
            map2 = map;
        }
        if ((i2 & 32) != 0) {
            z3 = false;
        }
        a(bool2, str, gVar, z4, map2, z3);
    }
}
