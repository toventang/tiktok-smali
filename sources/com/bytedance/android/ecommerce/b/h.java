package com.bytedance.android.ecommerce.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.n;
import java.util.HashMap;

public class h extends a {
    static {
        Covode.recordClassIndex(3365);
    }

    @Override // com.bytedance.android.ecommerce.b.a
    public final String a() {
        return "pipoAppInfo";
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return b.a.PUBLIC;
    }

    @Override // com.bytedance.ies.xbridge.b, com.bytedance.android.ecommerce.b.a
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        super.a(nVar, bVar, eVar);
        HashMap hashMap = new HashMap();
        hashMap.put("aid", 2112);
        hashMap.put("appVersion", "1.0.0-rc.5");
        bVar.a(hashMap);
    }
}
