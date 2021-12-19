package com.bytedance.android.ecommerce.k;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.e.c;
import com.bytedance.covode.number.Covode;

public final class j {
    static {
        Covode.recordClassIndex(3441);
    }

    public static String a(String str, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String c2 = c.f7063a.b().c(str);
        if (c2 == null || !c2.contains("{the_field}") || strArr.length <= 0) {
            return c2;
        }
        return c2.replace("{the_field}", c.f7063a.b().c(strArr[0]));
    }
}
