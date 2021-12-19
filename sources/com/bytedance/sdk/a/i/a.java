package com.bytedance.sdk.a.i;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.b;
import com.bytedance.sdk.a.o.c;
import com.ss.android.account.f;
import java.net.URI;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(26565);
    }

    public static void a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e2) {
                e2.printStackTrace();
                return;
            }
        }
        jSONObject.put("passport-sdk-version", 19);
        jSONObject.put("result", 0);
        b(str, jSONObject);
    }

    public static void b(String str, JSONObject jSONObject) {
        c e2 = f.a().e();
        if (jSONObject != null) {
            try {
                if (!jSONObject.has("passport-sdk-version")) {
                    jSONObject.put("passport-sdk-version", 19);
                }
                jSONObject.put("params_for_special", "uc_login");
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        e2.a(str, jSONObject);
    }

    public static void a(String str, String str2, String str3, b bVar) {
        a(str, str2, str3, bVar, (JSONObject) null);
    }

    public static void a(String str, Throwable th, int i2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("urlpath", new URI(str).getPath().toLowerCase());
            if (th != null) {
                jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
                jSONObject.put("exception_msg", th.getMessage());
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("exception_msg", str2);
            }
            jSONObject.put("errorCode", i2);
            jSONObject.put("passport-sdk-version", 19);
            jSONObject.put("sdkVersion", 2);
            b("passport_net_err", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void a(String str, String str2, String str3, b bVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONException e2;
        if (bVar != null) {
            String str4 = bVar.f43075f;
            if (TextUtils.isEmpty(str4)) {
                str4 = bVar.f43076g;
            }
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("logid", bVar.f43070a);
                    if (bVar instanceof com.bytedance.sdk.a.a.a.c) {
                        String str5 = ((com.bytedance.sdk.a.a.a.c) bVar).f43080k;
                        if (!TextUtils.isEmpty(str5)) {
                            jSONObject2.put("logout_from", str5);
                        }
                    }
                } catch (JSONException e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    a(str, bVar.f43072c, str2, str3, bVar.f43071b, bVar.f43074e, str4, jSONObject2);
                    return;
                }
            } catch (JSONException e4) {
                e2 = e4;
                jSONObject2 = jSONObject;
                e2.printStackTrace();
                a(str, bVar.f43072c, str2, str3, bVar.f43071b, bVar.f43074e, str4, jSONObject2);
                return;
            }
            a(str, bVar.f43072c, str2, str3, bVar.f43071b, bVar.f43074e, str4, jSONObject2);
            return;
        }
        a(str, null, str2, str3, false, -1, null, null);
    }

    public static void a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("logid", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("urlpath", str2);
            }
            jSONObject.put("sdkVersion", 2);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("extra", str4);
            }
            jSONObject.put("passport-sdk-version", 19);
            if (z) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            jSONObject.put("user_was_login", str5);
            jSONObject.put("result", 0);
            b(str, jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static void a(String str, String str2, String str3, String str4, boolean z, int i2, String str5, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException e2) {
                e2.printStackTrace();
                return;
            }
        }
        jSONObject.put("platform", str3);
        jSONObject.put("scene", str4);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("urlpath", str2);
        }
        if (z) {
            jSONObject.put("result", 1);
        } else {
            jSONObject.put("result", 0);
            jSONObject.put("errorCode", i2);
            if (str5 != null) {
                jSONObject.put("errDesc", str5);
            }
        }
        jSONObject.put("passport-sdk-version", 19);
        jSONObject.put("sdkVersion", 2);
        b(str, jSONObject);
    }
}
