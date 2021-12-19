package com.bytedance.android.ecommerce.b;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.h.a;
import com.bytedance.android.ecommerce.k.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;
import java.util.HashMap;

public class b extends a {
    static {
        Covode.recordClassIndex(3356);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipo.encryptString";
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        super.a(nVar, bVar, eVar);
        String f2 = nVar.f("key");
        String f3 = nVar.f("origin_str");
        if (TextUtils.isEmpty(f2)) {
            a.a("key is null!", bVar);
        } else if (TextUtils.isEmpty(f3)) {
            a.a("origin_str is null!", bVar);
        } else {
            String a2 = i.a(f2, f3);
            if (a2 == null) {
                a2 = "";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("result", a2);
            a.a(hashMap, bVar);
        }
    }
}
