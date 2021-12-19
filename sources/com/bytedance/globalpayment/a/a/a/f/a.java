package com.bytedance.globalpayment.a.a.a.f;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(17542);
    }

    public static String a(String str, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String a2 = com.bytedance.globalpayment.a.a.a.a.a().c().a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().g(), str);
        com.bytedance.globalpayment.payment.common.lib.h.a.a().f();
        if (a2 == null || !a2.contains("{the_field}") || strArr.length <= 0) {
            return a2;
        }
        return a2.replace("{the_field}", com.bytedance.globalpayment.a.a.a.a.a().c().a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().g(), strArr[0]));
    }
}
