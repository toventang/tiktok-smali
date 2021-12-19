package com.ss.android.token;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.i.a;
import com.bytedance.sdk.a.o.f;
import com.kakao.usermgmt.StringSet;
import java.net.URI;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(37590);
    }

    static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                URI uri = new URI(str);
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(uri.getHost())) {
                    sb.append(uri.getHost());
                }
                if (!TextUtils.isEmpty(uri.getPath())) {
                    sb.append(uri.getPath());
                }
                return sb.toString();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return str;
    }

    public static void a(Throwable th) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception_msg", th.getMessage());
            jSONObject.put("exception_stack_trace", Log.getStackTraceString(th));
            a.a("tt_token_exception", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, int i2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", i2);
            jSONObject.put("error_code_msg", str2);
            jSONObject.put("extra", new StringBuilder().toString());
            a.a(str, jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        int i2;
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        jSONObject.put("error_name", str);
        jSONObject.put("error_message", str2);
        int i3 = 1;
        if (f.a(com.ss.android.account.f.a().b())) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jSONObject.put("network_available", i2);
        if (com.ss.android.a.f58159a <= 0) {
            i3 = 0;
        }
        jSONObject.put("app_in_foreground", i3);
        a.a("token_config_err_v2", jSONObject);
    }

    public static void a(String str, List list, boolean z) {
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            if (list != null && !list.isEmpty()) {
                for (Object obj : list) {
                    if (obj instanceof c) {
                        if ("X-TT-LOGID".equalsIgnoreCase(((c) obj).f61014a)) {
                            str2 = ((c) obj).f61015b;
                        }
                    } else if (obj != null) {
                        sb.append(obj.toString());
                        sb.append(";");
                    }
                }
            }
            a.a("tt_token_logout", a(str), str2, sb.toString(), z);
        } catch (Exception e2) {
            a(e2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(StringSet.type, str);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("tokenSign", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("token", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("errorMsg", str4);
            }
            a.a("tt_token_decrypt_err", jSONObject);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
