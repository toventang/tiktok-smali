package com.ss.android.ugc.aweme.base.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Boolean> f68130a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private static final HashMap<String, Integer> f68131b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final HashMap<String, Long> f68132c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f68133d = new HashMap<>();

    static {
        Covode.recordClassIndex(41975);
    }

    private static boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    public static boolean a(String str, String str2) {
        if (c(str, str2)) {
            return false;
        }
        return f68130a.containsKey(b(str, str2));
    }

    public static String b(String str, String str2) {
        return str + "-" + str2;
    }

    public static boolean a(String str, String str2, boolean z) {
        if (c(str, str2)) {
            return z;
        }
        String b2 = b(str, str2);
        HashMap<String, Boolean> hashMap = f68130a;
        if (hashMap.containsKey(b2)) {
            return hashMap.get(b2).booleanValue();
        }
        return d.a(com.bytedance.ies.ugc.appcontext.d.a(), str, 0).getBoolean(str2, z);
    }

    public static boolean b(String str, String str2, boolean z) {
        if (c(str, str2)) {
            return z;
        }
        String b2 = b(str, str2);
        HashMap<String, Boolean> hashMap = f68130a;
        if (hashMap.containsKey(b2)) {
            return hashMap.get(b2).booleanValue();
        }
        boolean z2 = d.a(com.bytedance.ies.ugc.appcontext.d.a(), str, 0).getBoolean(str2, z);
        hashMap.put(b2, Boolean.valueOf(z2));
        return z2;
    }
}
