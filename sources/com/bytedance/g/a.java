package com.bytedance.g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(17209);
    }

    public static SharedPreferences a(Context context, String str) {
        try {
            return d.a(context, str, 0);
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 24) {
                return d.a(context.createDeviceProtectedStorageContext(), str, 0);
            }
            throw new RuntimeException("abtest SharedPreferences :".concat(String.valueOf(str)));
        }
    }

    public static Map<String, Integer> b(Context context, String str) {
        SharedPreferences a2 = a(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
            if (entry.getValue() instanceof Integer) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static Map<String, String> c(Context context, String str) {
        SharedPreferences a2 = a(context, str);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, ?> entry : a2.getAll().entrySet()) {
            if (entry.getValue() instanceof String) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return concurrentHashMap;
    }

    public static JSONObject a(Context context, String str, String str2) {
        try {
            return new JSONObject(a(context, str).getString(str2, ""));
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static Set<String> b(Context context, String str, String str2) {
        return new ConcurrentSkipListSet(a(context, str).getStringSet(str2, new ConcurrentSkipListSet()));
    }

    public static void a(final Context context, final String str, final String str2, final String str3) {
        k.a(new Runnable() {
            /* class com.bytedance.g.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(17213);
            }

            public final void run() {
                if (str3 == null) {
                    a.a(context, str).edit().remove(str2).apply();
                } else {
                    a.a(context, str).edit().putString(str2, str3).apply();
                }
            }
        });
    }

    public static void a(final Context context, final String str, final String str2, final Set<String> set) {
        k.a(new Runnable() {
            /* class com.bytedance.g.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17212);
            }

            public final void run() {
                a.a(context, str).edit().putStringSet(str2, set).apply();
            }
        });
    }
}
