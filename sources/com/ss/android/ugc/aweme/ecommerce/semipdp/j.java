package com.ss.android.ugc.aweme.ecommerce.semipdp;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.f.b.l;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    final LinkedHashMap<String, Object> f87313a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    long f87314b = -1;

    /* renamed from: c  reason: collision with root package name */
    final HashMap<String, Object> f87315c;

    static {
        Covode.recordClassIndex(54798);
    }

    public j(HashMap<String, Object> hashMap) {
        this.f87315c = hashMap;
    }

    public final void a(String str) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("glide_type", str);
        b("tiktokec_product_detail_page_glide", linkedHashMap);
    }

    public final void a(ProductPackStruct productPackStruct) {
        String str;
        l.d(productPackStruct, "");
        Boolean bool = productPackStruct.y;
        String str2 = "1";
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            LinkedHashMap<String, Object> linkedHashMap = this.f87313a;
            if (booleanValue) {
                str = str2;
            } else {
                str = "0";
            }
            linkedHashMap.put("is_have_address", str);
        }
        Boolean bool2 = productPackStruct.z;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            LinkedHashMap<String, Object> linkedHashMap2 = this.f87313a;
            if (!booleanValue2) {
                str2 = "0";
            }
            linkedHashMap2.put("is_have_payment_method", str2);
        }
    }

    public final void b(String str, HashMap<String, Object> hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.f87313a);
        linkedHashMap.putAll(hashMap);
        c.a(str, linkedHashMap);
    }

    public final void a(String str, String str2) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("button_name", str);
        if (str2 != null) {
            linkedHashMap.put("actionsheet_name", str2);
        }
        b("tiktokec_button_click", linkedHashMap);
    }

    public final void a(String str, HashMap<String, Object> hashMap) {
        l.d(str, "");
        l.d(hashMap, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("switch_type", str);
        linkedHashMap.putAll(hashMap);
        b("tiktokec_switch_app_result", linkedHashMap);
    }
}
