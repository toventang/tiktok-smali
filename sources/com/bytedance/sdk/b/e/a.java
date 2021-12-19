package com.bytedance.sdk.b.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.b.b.b;
import com.bytedance.sdk.b.b.c;
import com.ss.android.ugc.aweme.bf.d;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f43605b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f43606a;

    static {
        Covode.recordClassIndex(26693);
    }

    private a() {
        Context c2 = com.bytedance.sdk.b.a.c();
        if (c2 != null) {
            this.f43606a = d.a(c2, "mobile_data_sdk_storage", 0);
        }
    }

    public final b c() {
        String b2 = b("free_flow_entity_string");
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        try {
            return b.a(b2);
        } catch (Exception e2) {
            com.bytedance.sdk.b.c.a.d(e2.getMessage());
            return null;
        }
    }

    public static a a() {
        MethodCollector.i(3380);
        if (f43605b == null) {
            synchronized (a.class) {
                try {
                    if (f43605b == null) {
                        f43605b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3380);
                    throw th;
                }
            }
        }
        a aVar = f43605b;
        MethodCollector.o(3380);
        return aVar;
    }

    public final c b() {
        SharedPreferences sharedPreferences = this.f43606a;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("mobile_status_string", "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    return c.a(string);
                } catch (Exception e2) {
                    com.bytedance.sdk.b.c.a.d(e2.getMessage());
                }
            }
        }
        return null;
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            a("free_flow_entity_string", str);
        }
    }

    public final String b(String str) {
        SharedPreferences sharedPreferences = this.f43606a;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(str, "");
        }
        return "";
    }

    public final int c(String str) {
        SharedPreferences sharedPreferences = this.f43606a;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt(str, -1);
        }
        return -1;
    }

    public final void a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f43606a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }
}
