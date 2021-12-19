package com.bytedance.android.livesdk.service.c.j;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a {
    static {
        Covode.recordClassIndex(12618);
    }

    public static void a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("gift_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("msg_id", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("asset_id", str4);
        }
        i.b().c("ttlive_gift", hashMap);
    }
}
