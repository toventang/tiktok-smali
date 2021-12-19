package com.ss.android.ugc.aweme.ecommerce.cart;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f84676a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(52869);
    }

    public static String a(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() == 2 || num.intValue() == 3) {
            return "confirm";
        }
        if (num.intValue() == 0) {
            return "add_to_cart";
        }
        return null;
    }

    public static void a(Context context, IPdpStarter.PdpEnterParam pdpEnterParam, String str, String str2) {
        HashMap<String, Object> hashMap;
        HashMap<String, Object> hashMap2;
        String str3 = null;
        if (pdpEnterParam != null) {
            hashMap = pdpEnterParam.getTrackParams();
            hashMap2 = pdpEnterParam.getRequestParams();
            str3 = pdpEnterParam.getChainKey();
        } else {
            hashMap = null;
            hashMap2 = null;
        }
        a(context, hashMap, hashMap2, str3, str, str2);
    }

    public static void a(Context context, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, String str, String str2, String str3) {
        if (context != null && str3 != null && str3.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            if (str2 != null) {
                linkedHashMap.put("page_name", str2);
            }
            linkedHashMap.put("entrance_name", "cart");
            linkedHashMap.put("entrance_link", str3);
            c.a("rd_page_entrance_click", linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (str2 != null) {
                if (hashMap != null) {
                    hashMap.put("previous_page", str2);
                }
                linkedHashMap2.put("previous_page", str2);
            }
            if (hashMap != null) {
                linkedHashMap2.put("trackParams", hashMap);
            }
            if (hashMap2 != null) {
                linkedHashMap2.put("requestParams", hashMap2);
            }
            if (str != null) {
                linkedHashMap2.put("chainKey", str);
            }
            j.a(context, str3, linkedHashMap2, false).open();
        }
    }
}
