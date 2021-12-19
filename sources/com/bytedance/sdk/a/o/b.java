package com.bytedance.sdk.a.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.account.f;
import com.ss.android.ugc.aweme.bf.d;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f43476a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f43477b;

    static {
        Covode.recordClassIndex(26619);
    }

    private b() {
    }

    private SharedPreferences b() {
        Context b2;
        if (this.f43477b == null && (b2 = f.a().b()) != null) {
            this.f43477b = d.a(b2, "com_bytedance_sdk_account_utils_common_request_cache_helper", 0);
        }
        return this.f43477b;
    }

    public static b a() {
        MethodCollector.i(12542);
        if (f43476a == null) {
            synchronized (b.class) {
                try {
                    if (f43476a == null) {
                        f43476a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12542);
                    throw th;
                }
            }
        }
        b bVar = f43476a;
        MethodCollector.o(12542);
        return bVar;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new URL(str).getPath();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public final String a(String str) {
        SharedPreferences b2;
        if (TextUtils.isEmpty(str) || (b2 = b()) == null) {
            return null;
        }
        String a2 = a(str, null);
        String string = b2.getString(a2, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (System.currentTimeMillis() < jSONObject.optLong("expire_timing")) {
                return jSONObject.optString("cache_value", "");
            }
            b2.edit().putString(a2, "").apply();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static String a(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList(map.keySet());
            Collections.sort(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = map.get(it.next());
                if (str2 != null) {
                    sb.append(str2);
                }
            }
        }
        return sb.toString();
    }

    public final void a(String str, Map<String, String> map, String str2, long j2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                String a2 = a(str, map);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("expire_timing", j2);
                jSONObject.put("cache_value", str2);
                SharedPreferences b2 = b();
                if (b2 != null && System.currentTimeMillis() < j2) {
                    b2.edit().putString(a2, jSONObject.toString()).apply();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
