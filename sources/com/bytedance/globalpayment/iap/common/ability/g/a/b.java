package com.bytedance.globalpayment.iap.common.ability.g.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.h.a;

public class b implements com.bytedance.globalpayment.iap.common.ability.g.b.b {

    /* renamed from: a  reason: collision with root package name */
    private String f30289a = b.class.getSimpleName();

    static {
        Covode.recordClassIndex(17572);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.g.b.b
    public final void a(String str) {
        a.a().e();
        if (!TextUtils.isEmpty(str)) {
            a.a().i().d().f30539a = str;
        }
    }
}
