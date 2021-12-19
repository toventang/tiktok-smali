package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.track.a;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class i extends a {
    static {
        Covode.recordClassIndex(52994);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public HashMap<String, Object> a() {
        HashMap<String, Object> hashMap = new HashMap<>();
        LinkedHashMap<String, Object> linkedHashMap = h.f84785a;
        Object obj = linkedHashMap.get("source_page_type");
        if (obj != null) {
            hashMap.put("source_page_type", obj);
        }
        Object obj2 = linkedHashMap.get("anchor_show_type");
        if (obj2 != null) {
            hashMap.put("anchor_show_type", obj2);
        }
        Object obj3 = linkedHashMap.get("product_id");
        if (obj3 != null) {
            hashMap.put("product_id", obj3);
        }
        return hashMap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(str);
        l.d(str, "");
    }
}
