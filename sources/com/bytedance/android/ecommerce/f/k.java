package com.bytedance.android.ecommerce.f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.a.c;
import com.bytedance.android.ecommerce.a.d;
import com.bytedance.android.ecommerce.i.a;
import com.bytedance.covode.number.Covode;

public final class k implements a {
    static {
        Covode.recordClassIndex(3398);
    }

    @Override // com.bytedance.android.ecommerce.i.a
    public final d a(c... cVarArr) {
        d dVar = new d();
        dVar.f6948a = true;
        c cVar = cVarArr[0];
        String str = cVar.f6943i;
        if (cVar.a() && TextUtils.isEmpty(str)) {
            dVar.f6948a = false;
            dVar.a("pipo_common_error_required_field", "pipo_common_payin_mobile_address1");
        }
        return dVar;
    }
}
