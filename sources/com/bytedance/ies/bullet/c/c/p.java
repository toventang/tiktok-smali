package com.bytedance.ies.bullet.c.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.w;
import java.util.LinkedHashMap;
import java.util.Map;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f32047a = new p();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f32048b;

    private p() {
    }

    static {
        Covode.recordClassIndex(18784);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("com.bytedance.ies.bullet.kit.rn.IRnKitApi", "com.bytedance.ies.bullet.kit.rn.RnKitApi");
        linkedHashMap.put("com.bytedance.ies.bullet.kit.lynx.ILynxKitApi", "com.bytedance.ies.bullet.kit.lynx.LynxKitApi");
        linkedHashMap.put("com.bytedance.ies.bullet.kit.web.IWebKitApi", "com.bytedance.ies.bullet.kit.web.WebKitApi");
        f32048b = linkedHashMap;
    }

    public static d<m, e, i, g> a(String str) {
        String str2 = "";
        l.c(str, str2);
        try {
            String str3 = f32048b.get(str);
            if (str3 != null) {
                str2 = str3;
            }
            Object newInstance = Class.forName(str2).newInstance();
            if (newInstance != null) {
                return (d) newInstance;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (Throwable unused) {
            return null;
        }
    }
}
