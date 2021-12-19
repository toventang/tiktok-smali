package com.bytedance.android.ecommerce.k;

import android.util.Pair;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class f {
    static {
        Covode.recordClassIndex(3433);
    }

    public static String a(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(l.a(list, "UTF-8"));
        return sb.toString();
    }
}
