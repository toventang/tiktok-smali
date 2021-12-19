package com.bytedance.b.k;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f {
    static {
        Covode.recordClassIndex(15295);
    }

    public static boolean a(List<?> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static Map<String, String> b(List<Pair<String, String>> list) {
        if (a(list)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (Pair<String, String> pair : list) {
            if (!(pair == null || pair.first == null)) {
                hashMap.put(pair.first, pair.second);
            }
        }
        return hashMap;
    }

    public static String a(Object[] objArr, String str) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(str);
            }
            sb.append(obj.toString());
        }
        return sb.toString();
    }
}
