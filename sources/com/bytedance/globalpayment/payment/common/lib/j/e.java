package com.bytedance.globalpayment.payment.common.lib.j;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30614a = e.class.getCanonicalName();

    static {
        Covode.recordClassIndex(17754);
    }

    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 2), "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(Map<String, Long> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(entry.getValue());
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
