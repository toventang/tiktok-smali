package com.ss.ttvideoengine.h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class l {
    static {
        Covode.recordClassIndex(101613);
    }

    static Map<String, Long> a(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        if (!(TextUtils.isEmpty(str) || (split = str.split(";|:")) == null || split.length == 0)) {
            for (int i2 = 0; i2 < split.length - 1; i2 += 2) {
                try {
                    hashMap.put(split[i2], Long.valueOf(Long.parseLong(split[i2 + 1])));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return hashMap;
    }

    static void a(Map map, String str, float f2) {
        if (f2 != Float.MIN_VALUE) {
            map.put(str, Float.valueOf(f2));
        }
    }

    static void a(Map map, String str, int i2) {
        if (i2 != Integer.MIN_VALUE) {
            map.put(str, Integer.valueOf(i2));
        }
    }

    static void a(Map map, String str, long j2) {
        if (j2 != -2147483648L) {
            map.put(str, Long.valueOf(j2));
        }
    }

    static void a(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    static void a(Map map, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put(str, arrayList);
        }
    }
}
