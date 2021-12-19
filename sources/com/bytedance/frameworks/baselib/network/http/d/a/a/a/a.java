package com.bytedance.frameworks.baselib.network.http.d.a.a.a;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f29104a = a.class.getSimpleName();

    static {
        Covode.recordClassIndex(17038);
    }

    public static String a(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2));
            if (i2 != list.size() - 1) {
                sb.append(',');
            }
        }
        return sb.toString();
    }

    public static boolean a(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            if (charArray.length > 0 && charArray.length <= 255) {
                for (char c2 : charArray) {
                    if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '.' || c2 == '-'))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
