package com.bytedance.im.core.internal.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.b.a;
import com.google.gson.f;
import com.google.gson.g;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static f f38770a = new g().a(new EnumTypeAdapterFactory()).b();

    /* renamed from: b  reason: collision with root package name */
    public static f f38771b = new g().a(new EnumTypeAdapterFactory()).a(new a()).b();

    static {
        Covode.recordClassIndex(23125);
    }

    public static String a(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() > 0) {
                    return f38770a.b(map);
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static Map<String, String> a(String str) {
        try {
            return (Map) f38770a.a(str, new a<Map<String, String>>() {
                /* class com.bytedance.im.core.internal.utils.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(23126);
                }
            }.type);
        } catch (Exception unused) {
            return null;
        }
    }
}
