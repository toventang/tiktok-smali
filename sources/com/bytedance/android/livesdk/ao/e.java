package com.bytedance.android.livesdk.ao;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.e;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static Keva f13997a = Keva.getRepoSync("setting_from_server", 0);

    /* renamed from: b  reason: collision with root package name */
    public static boolean f13998b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f13999c = false;

    /* renamed from: d  reason: collision with root package name */
    public static f f14000d = e.a.f9628b;

    /* renamed from: e  reason: collision with root package name */
    private static JSONObject f14001e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f14002f = false;

    static {
        Covode.recordClassIndex(7768);
    }

    public static JSONObject a() {
        try {
            JSONObject jSONObject = f14001e;
            if (jSONObject == null || jSONObject.length() == 0) {
                f14001e = new JSONObject(f13997a.getString("setting_key", ""));
            }
            return f14001e;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    public static <T> T a(String str, T t) {
        try {
            if (SettingsManager.INSTANCE.contains(str)) {
                return (T) SettingsManager.INSTANCE.getValueByKey(str, t.getClass(), t);
            }
            Class<?> cls = t.getClass();
            return cls == Boolean.class ? (T) Boolean.valueOf(a().optBoolean(str, t.booleanValue())) : (cls == Integer.class || cls == Short.class) ? (T) Integer.valueOf(a().optInt(str, t.intValue())) : cls == Float.class ? (T) Float.valueOf((float) a().optDouble(str, (double) t.floatValue())) : cls == Long.class ? (T) Long.valueOf(a().optLong(str, t.longValue())) : cls == Double.class ? (T) Double.valueOf(a().optDouble(str, t.doubleValue())) : cls == String.class ? (T) a().optString(str, t) : (T) e.a.f9628b.a(a().toString(), (Type) cls);
        } catch (Exception e2) {
            String str2 = "SettingUtil#getValue exception:" + e2.getMessage() + ", setting: " + str;
            HashMap hashMap = new HashMap();
            hashMap.put("exception", str2);
            c.a("ttlive_settings_manager_monitor", 0, hashMap);
            return t;
        }
    }
}
