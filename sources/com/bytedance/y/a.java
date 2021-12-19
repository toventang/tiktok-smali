package com.bytedance.y;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f46164a = "cn-north-1";

    /* renamed from: b  reason: collision with root package name */
    public static String f46165b = "us-east-1";

    /* renamed from: c  reason: collision with root package name */
    public static String f46166c = "ap-singapore-1";

    /* renamed from: d  reason: collision with root package name */
    static String f46167d = "/vod/settings/v1";

    /* renamed from: e  reason: collision with root package name */
    public static String f46168e;

    /* renamed from: f  reason: collision with root package name */
    public static String f46169f;

    /* renamed from: g  reason: collision with root package name */
    public static String f46170g;

    /* renamed from: h  reason: collision with root package name */
    public static String f46171h;

    /* renamed from: i  reason: collision with root package name */
    public static Map<String, Object> f46172i;

    /* renamed from: j  reason: collision with root package name */
    public static Map<String, Object> f46173j;

    public static Map<String, String> a() {
        return a(f46172i);
    }

    public static Map<String, String> b() {
        return a(f46173j);
    }

    static {
        Covode.recordClassIndex(28232);
    }

    private static Map<String, String> a(Map<String, Object> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }
}
