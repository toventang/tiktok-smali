package com.bytedance.android.ecommerce.f;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.a.c;
import com.bytedance.android.ecommerce.a.d;
import com.bytedance.android.ecommerce.i.a;
import com.bytedance.covode.number.Covode;

public final class b implements a {
    static {
        Covode.recordClassIndex(3389);
    }

    @Override // com.bytedance.android.ecommerce.i.a
    public final d a(c... cVarArr) {
        d dVar = new d();
        dVar.f6948a = true;
        String str = cVarArr[0].f6943i;
        String str2 = cVarArr[1].f6943i;
        String str3 = cVarArr[2].f6943i;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        boolean isEmpty3 = TextUtils.isEmpty(str3);
        if ((isEmpty || isEmpty2 || isEmpty3) && (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3))) {
            dVar.f6948a = false;
            dVar.a("invalid_billing_address", new String[0]);
        } else if (!TextUtils.isEmpty(str3) && str3.length() > 300) {
            dVar.f6948a = false;
            dVar.a("invalid_post_code", new String[0]);
        }
        return dVar;
    }
}
