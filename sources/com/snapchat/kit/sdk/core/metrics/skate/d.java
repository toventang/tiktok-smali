package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.a.e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f57235a;

    /* renamed from: b  reason: collision with root package name */
    private final Random f57236b;

    static {
        Covode.recordClassIndex(35778);
    }

    private float c() {
        float nextFloat = this.f57236b.nextFloat();
        this.f57235a.edit().putFloat("com.snapchat.kit.sdk.core.metrics.skate.deviceSampleValue", nextFloat).apply();
        return nextFloat;
    }

    /* access modifiers changed from: package-private */
    public final double b() {
        float c2;
        if (!this.f57235a.contains("com.snapchat.kit.sdk.core.metrics.skate.deviceSampleValue")) {
            c2 = c();
        } else {
            try {
                return (double) this.f57235a.getFloat("com.snapchat.kit.sdk.core.metrics.skate.deviceSampleValue", 0.99999f);
            } catch (ClassCastException unused) {
                c2 = c();
            }
        }
        return (double) c2;
    }

    public final com.snapchat.kit.sdk.core.a.d a() {
        try {
            long j2 = this.f57235a.getLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateDay", -1);
            long j3 = this.f57235a.getLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateMonth", -1);
            long j4 = this.f57235a.getLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateYear", -1);
            int i2 = this.f57235a.getInt("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateCount", -1);
            if (j2 < 1 || j2 > 31 || j3 < 1 || j3 > 12 || j4 < 2020 || i2 <= 0) {
                return null;
            }
            return new com.snapchat.kit.sdk.core.a.d(new e(j2, j3, j4), i2);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    private void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.snapchat.kit.sdk.SnapLogin", "LOGIN");
        hashMap.put("com.snapchat.kit.sdk.Bitmoji", "BITMOJI");
        hashMap.put("com.snapchat.kit.sdk.SnapCreative", "CREATIVE");
        hashMap.put("com.snapchat.kit.sdk.SnapStoryKit", "STORY");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (String str : hashMap.keySet()) {
            try {
                Class<?> cls = Class.forName(str);
                Object obj = hashMap.get(str);
                arrayList.add(obj);
                try {
                    hashMap2.put(obj, cls.getMethod("getVersion", new Class[0]).invoke(null, new Object[0]));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    hashMap2.put(obj, "0.0.0");
                }
            } catch (ClassNotFoundException unused2) {
            }
        }
        this.f57235a.edit().putString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVersions", new JSONObject(hashMap2).toString()).apply();
        this.f57235a.edit().putString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVariants", TextUtils.join(",", arrayList)).apply();
    }

    d(SharedPreferences sharedPreferences, Random random) {
        this.f57235a = sharedPreferences;
        this.f57236b = random;
        d();
    }
}
