package com.bytedance.android.ecommerce.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o;
import java.util.HashMap;

public final class a {
    static {
        Covode.recordClassIndex(3401);
    }

    public static String a(n nVar, String str) {
        if (nVar == null || !nVar.a(str)) {
            return null;
        }
        k i2 = nVar.i(str);
        if (i2.a() != o.String) {
            return null;
        }
        try {
            return i2.e();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(Object obj, b.AbstractC0814b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("data", obj);
        bVar.a(hashMap);
    }

    public static void a(String str, b.AbstractC0814b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", 0);
        hashMap.put("error_msg", str);
        bVar.a(hashMap);
    }

    public static void a(int i2, int i3, String str, b.AbstractC0814b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(i2));
        hashMap.put("detail_code", Integer.valueOf(i3));
        hashMap.put("message", str);
        hashMap.put("msg", "code:" + i2 + " detailCode:" + i3 + " msg:" + str);
        bVar.a(hashMap);
    }
}
