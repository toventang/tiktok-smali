package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(54149);
    }

    public static final b a(ProductPackStruct productPackStruct) {
        List list;
        l.d(productPackStruct, "");
        ProductBase productBase = productPackStruct.f86641e;
        if (productBase == null || (list = productBase.f86626d) == null) {
            list = z.INSTANCE;
        }
        return new b(list);
    }
}
