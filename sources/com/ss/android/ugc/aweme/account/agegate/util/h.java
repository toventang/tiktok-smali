package com.ss.android.ugc.aweme.account.agegate.util;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static String f62842a;

    /* renamed from: b  reason: collision with root package name */
    public static String f62843b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f62844c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<String, Integer> f62845d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public static final h f62846e = new h();

    private h() {
    }

    public static void a() {
        f62842a = null;
        f62843b = null;
    }

    static {
        Covode.recordClassIndex(38710);
    }

    public static Map<String, String> b() {
        HashMap hashMap = new HashMap();
        String str = f62842a;
        if (str != null) {
            hashMap.put("birthday", str);
        }
        String str2 = f62843b;
        if (str2 != null) {
            hashMap.put("screen_name", str2);
        }
        return hashMap;
    }

    public static int a(String str) {
        l.d(str, "");
        Integer num = f62845d.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static void a(String str, int i2) {
        l.d(str, "");
        f62845d.put(str, Integer.valueOf(i2));
    }
}
