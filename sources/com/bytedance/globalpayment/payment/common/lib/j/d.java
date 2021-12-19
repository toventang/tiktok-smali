package com.bytedance.globalpayment.payment.common.lib.j;

import android.util.Pair;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;

public final class d {
    static {
        Covode.recordClassIndex(17753);
    }

    public static String a(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(l.a(arrayList, "UTF-8"));
        return sb.toString();
    }
}
