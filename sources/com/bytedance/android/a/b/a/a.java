package com.bytedance.android.a.b.a;

import android.text.TextUtils;
import com.bytedance.android.a.a.e;
import com.bytedance.android.a.a.f;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class a {
    static {
        Covode.recordClassIndex(3217);
    }

    private static String a() {
        f fVar = e.d().f6650h;
        if (fVar != null) {
            return fVar.a();
        }
        return "";
    }

    public static Map<String, String> a(List<String> list) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        HashMap hashMap = new HashMap();
        if (list.isEmpty()) {
            a(hashMap, valueOf);
            return hashMap;
        }
        for (String str : list) {
            try {
                if (TextUtils.equals("__TS__", str) || TextUtils.equals("{TS}", str)) {
                    hashMap.put(str, valueOf);
                } else if ((TextUtils.equals("__ANDROIDID__", str) || TextUtils.equals("{ANDROIDID}", str)) && !TextUtils.isEmpty("")) {
                    String a2 = com.bytedance.android.a.a.h.f.a("");
                    if (!TextUtils.isEmpty(a2)) {
                        hashMap.put(str, a2);
                    }
                } else if ((TextUtils.equals("__ANDROIDID1__", str) || TextUtils.equals("{ANDROIDID1}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__AAID__", str) || TextUtils.equals("{AAID}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__OPENUDID__", str) || TextUtils.equals("{OPENUDID}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__OS__", str) || TextUtils.equals("{OS}", str)) && !TextUtils.isEmpty("0")) {
                    hashMap.put(str, "0");
                } else if ((TextUtils.equals("__IP__", str) || TextUtils.equals("{IP}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__UA__", str) || TextUtils.equals("{UA}", str)) && !TextUtils.isEmpty(a())) {
                    String b2 = com.bytedance.android.a.a.h.f.b(com.bytedance.android.a.a.h.f.c(a()));
                    if (!TextUtils.isEmpty(b2)) {
                        hashMap.put(str, b2);
                    }
                } else if ((TextUtils.equals("__UOO__", str) || TextUtils.equals("{UOO}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__DEVICE_ID__", str) || TextUtils.equals("{DEVICE_ID}", str)) && !TextUtils.isEmpty("")) {
                    hashMap.put(str, "");
                } else if ((TextUtils.equals("__OS_STR__", str) || TextUtils.equals("{OS_STR}", str)) && !TextUtils.isEmpty("Android")) {
                    hashMap.put(str, "Android");
                }
            } catch (Throwable unused) {
            }
        }
        a(hashMap, valueOf);
        return hashMap;
    }

    private static void a(Map<String, String> map, String str) {
        map.put("[ss_random]", String.valueOf(new Random().nextLong()));
        map.put("[ss_timestamp]", str);
    }
}
