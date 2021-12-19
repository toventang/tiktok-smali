package com.ss.ugc.effectplatform.util;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.effectplatform.util.e;
import h.f.b.l;
import h.q;
import h.r;
import java.util.HashMap;
import org.json.JSONObject;

public final class d {
    static {
        Covode.recordClassIndex(102667);
    }

    public static String a(Object obj) {
        Object obj2;
        HashMap hashMap = new HashMap();
        hashMap.put("platform", 1);
        try {
            obj2 = q.m223constructorimpl(Float.valueOf(Float.parseFloat(l.a().f153977b)));
        } catch (Throwable th) {
            obj2 = q.m223constructorimpl(r.a(th));
        }
        if (q.m228isFailureimpl(obj2)) {
            obj2 = null;
        }
        Float f2 = (Float) obj2;
        if (f2 != null) {
            hashMap.put("gl_version", Float.valueOf(f2.floatValue()));
        }
        hashMap.put("gl_vendor", l.a().f153978c);
        hashMap.put("gl_renderer", l.a().f153976a);
        hashMap.put("gl_extension", l.a().f153983h);
        if (obj != null && (obj instanceof Context)) {
            e.a a2 = e.a((Context) obj);
            l.a((Object) a2, "");
            long j2 = a2.f153951a;
            if (j2 > 0) {
                hashMap.put("memory_total_size", Long.valueOf(j2));
            }
        }
        String a3 = e.a();
        l.a((Object) a3, "");
        hashMap.put("cpu_vendor", a3);
        String str = Build.VERSION.RELEASE;
        l.a((Object) str, "");
        hashMap.put("os_version", str);
        return new JSONObject(hashMap).toString();
    }
}
