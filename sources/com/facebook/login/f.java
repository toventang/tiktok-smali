package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.a.m;
import com.facebook.internal.a.b.a;
import com.facebook.internal.e;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class f {

    /* renamed from: d  reason: collision with root package name */
    private static final ScheduledExecutorService f48906d;

    /* renamed from: a  reason: collision with root package name */
    final m f48907a;

    /* renamed from: b  reason: collision with root package name */
    private String f48908b;

    /* renamed from: c  reason: collision with root package name */
    private String f48909c;

    public final String a() {
        if (a.a(this)) {
            return null;
        }
        try {
            return this.f48908b;
        } catch (Throwable th) {
            a.a(th, this);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(29477);
        l.a a2 = l.a(o.SCHEDULED);
        a2.f79174c = 1;
        f48906d = (ScheduledExecutorService) g.a(a2.a());
    }

    static /* synthetic */ m a(f fVar) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            return fVar.f48907a;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    static Bundle a(String str) {
        if (a.a(f.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            a.a(th, f.class);
            return null;
        }
    }

    public final void a(LoginClient.Request request) {
        if (!a.a(this)) {
            try {
                Bundle a2 = a(request.f48815e);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("login_behavior", request.f48811a.toString());
                    jSONObject.put("request_code", e.b.Login.toRequestCode());
                    jSONObject.put("permissions", TextUtils.join(",", request.f48812b));
                    jSONObject.put("default_audience", request.f48813c.toString());
                    jSONObject.put("isReauthorize", request.f48816f);
                    String str = this.f48909c;
                    if (str != null) {
                        jSONObject.put("facebookVersion", str);
                    }
                    a2.putString("6_extras", jSONObject.toString());
                } catch (JSONException unused) {
                }
                this.f48907a.c();
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    f(Context context, String str) {
        PackageInfo packageInfo;
        this.f48908b = str;
        this.f48907a = new m(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f48909c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final void a(String str, String str2) {
        if (!a.a(this)) {
            try {
                a(str, str2, "");
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    public final void a(String str, String str2, String str3) {
        if (!a.a(this)) {
            try {
                Bundle a2 = a("");
                a2.putString("2_result", LoginClient.Result.a.ERROR.loggingValue);
                a2.putString("5_error_message", str2);
                a2.putString("3_method", str3);
                this.f48907a.d();
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r3 != null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, com.facebook.login.LoginClient.Result.a r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.Exception r10) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.f.a(java.lang.String, java.util.Map, com.facebook.login.LoginClient$Result$a, java.util.Map, java.lang.Exception):void");
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        if (!a.a(this)) {
            try {
                Bundle a2 = a(str);
                if (str3 != null) {
                    a2.putString("2_result", str3);
                }
                if (str4 != null) {
                    a2.putString("5_error_message", str4);
                }
                if (str5 != null) {
                    a2.putString("4_error_code", str5);
                }
                if (map != null && !map.isEmpty()) {
                    a2.putString("6_extras", new JSONObject(map).toString());
                }
                a2.putString("3_method", str2);
                this.f48907a.d();
            } catch (Throwable th) {
                a.a(th, this);
            }
        }
    }
}
