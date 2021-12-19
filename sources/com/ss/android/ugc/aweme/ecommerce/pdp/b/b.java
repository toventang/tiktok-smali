package com.ss.android.ugc.aweme.ecommerce.pdp.b;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;
import java.util.HashMap;
import java.util.Map;

public abstract class b extends g {
    static {
        Covode.recordClassIndex(54082);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return ag.c(v.a("module_name", "discounts"));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        l.d(str, "");
    }

    public final b a(String str) {
        if (str != null) {
            this.f87523k.put("coupon_type_id", str);
        }
        return this;
    }

    public final b b(String str) {
        if (str != null) {
            this.f87523k.put("coupon_id", str);
        }
        return this;
    }

    public final b c(String str) {
        if (str != null) {
            this.f87523k.put("coupon_name", str);
        }
        return this;
    }

    public final b a(Map<String, ? extends Object> map) {
        l.d(map, "");
        this.f87523k.putAll(map);
        return this;
    }

    public final void b(Map<String, ? extends Object> map) {
        l.d(map, "");
        this.f87523k.putAll(map);
    }
}
