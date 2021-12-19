package com.bytedance.android.live.wallet.c;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class c {
    static {
        Covode.recordClassIndex(7278);
    }

    public static void a(String str, HashMap<String, Object> hashMap) {
        com.bytedance.android.live.core.d.c.a(str + "_all", 0, hashMap);
    }

    public static void a(String str, int i2, int i3, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str2);
        hashMap.put("detail_code", Integer.valueOf(i3));
        com.bytedance.android.live.core.d.c.a(str + "_all", 1, hashMap);
        com.bytedance.android.live.core.d.c.a(str + "_error", 1, hashMap);
    }

    public static void a(String str, int i2, int i3, String str2, HashMap<String, Object> hashMap) {
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str2);
        hashMap.put("detail_code", Integer.valueOf(i3));
        com.bytedance.android.live.core.d.c.a(str + "_all", 1, hashMap);
        com.bytedance.android.live.core.d.c.a(str + "_error", 1, hashMap);
    }
}
