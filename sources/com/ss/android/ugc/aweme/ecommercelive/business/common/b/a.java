package com.ss.android.ugc.aweme.ecommercelive.business.common.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87977a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(55309);
    }

    public static Map<String, String> a(Map<String, String> map) {
        HashMap hashMap;
        Throwable th;
        z zVar = null;
        HashMap hashMap2 = null;
        if (map != null) {
            try {
                String str = map.get("log_extra");
                if (str != null) {
                    hashMap = new HashMap();
                    String str2 = map.get("ad_id");
                    if (str2 == null) {
                        str2 = "";
                    }
                    hashMap.put("ad_id", str2);
                    String str3 = map.get("value");
                    if (str3 == null) {
                        str3 = "";
                    }
                    hashMap.put("creative_id", str3);
                    hashMap.put("tag", "live_ad");
                    String b2 = new f().b((com.ss.android.ugc.aweme.ecommercelive.business.common.a.a) new f().a(str, com.ss.android.ugc.aweme.ecommercelive.business.common.a.a.class));
                    l.b(b2, "");
                    hashMap.put("ad_extra", b2);
                    try {
                        zVar = z.f158842a;
                        q.m223constructorimpl(zVar);
                        return hashMap;
                    } catch (Throwable th2) {
                        th = th2;
                        hashMap2 = hashMap;
                        q.m223constructorimpl(r.a(th));
                        return hashMap2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                q.m223constructorimpl(r.a(th));
                return hashMap2;
            }
        }
        hashMap = null;
        q.m223constructorimpl(zVar);
        return hashMap;
    }
}
