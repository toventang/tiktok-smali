package com.facebook.a;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Patterns;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.a.a.c;
import com.facebook.internal.a.b.a;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.m;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f46883a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    static final ConcurrentHashMap<String, String> f46884b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final String f46885c = p.class.getSimpleName();

    /* renamed from: d  reason: collision with root package name */
    private static SharedPreferences f46886d;

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f46887e = new ConcurrentHashMap<>();

    static /* synthetic */ AtomicBoolean c() {
        if (a.a(p.class)) {
            return null;
        }
        try {
            return f46883a;
        } catch (Throwable th) {
            a.a(th, p.class);
            return null;
        }
    }

    static /* synthetic */ SharedPreferences d() {
        if (a.a(p.class)) {
            return null;
        }
        try {
            return f46886d;
        } catch (Throwable th) {
            a.a(th, p.class);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(28543);
    }

    public static String a() {
        if (a.a(p.class)) {
            return null;
        }
        try {
            if (!f46883a.get()) {
                b();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f46887e);
            hashMap.putAll(e());
            return ad.a(hashMap);
        } catch (Throwable th) {
            a.a(th, p.class);
            return null;
        }
    }

    private static Map<String, String> e() {
        if (a.a(p.class)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> e2 = c.e();
            for (String str : f46884b.keySet()) {
                if (e2.contains(str)) {
                    hashMap.put(str, f46884b.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            a.a(th, p.class);
            return null;
        }
    }

    public static synchronized void b() {
        synchronized (p.class) {
            MethodCollector.i(1180);
            if (a.a(p.class)) {
                MethodCollector.o(1180);
                return;
            }
            try {
                if (f46883a.get()) {
                    MethodCollector.o(1180);
                    return;
                }
                ae.a();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(m.f48921g);
                f46886d = defaultSharedPreferences;
                String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                String string2 = f46886d.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                f46887e.putAll(ad.e(string));
                f46884b.putAll(ad.e(string2));
                f46883a.set(true);
                MethodCollector.o(1180);
            } catch (Throwable th) {
                a.a(th, p.class);
                MethodCollector.o(1180);
            }
        }
    }

    static String a(String str, String str2) {
        String str3;
        if (a.a(p.class)) {
            return null;
        }
        try {
            String lowerCase = str2.trim().toLowerCase();
            if ("em".equals(str)) {
                if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                return "";
            } else if ("ph".equals(str)) {
                return lowerCase.replaceAll("[^0-9]", "");
            } else {
                if (!"ge".equals(str)) {
                    return lowerCase;
                }
                if (lowerCase.length() > 0) {
                    str3 = lowerCase.substring(0, 1);
                } else {
                    str3 = "";
                }
                if ("f".equals(str3) || "m".equals(str3)) {
                    return str3;
                }
                return "";
            }
        } catch (Throwable th) {
            a.a(th, p.class);
            return null;
        }
    }
}
