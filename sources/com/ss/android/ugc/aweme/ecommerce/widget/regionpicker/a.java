package com.ss.android.ugc.aweme.ecommerce.widget.regionpicker;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f87618a;

    /* renamed from: b  reason: collision with root package name */
    public String f87619b;

    /* renamed from: c  reason: collision with root package name */
    public long f87620c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final String f87621d;

    static {
        Covode.recordClassIndex(55080);
    }

    public a(String str) {
        this.f87621d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f87618a = linkedHashMap;
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "shipping_address");
        linkedHashMap.put("previous_page", "shipping_address");
        this.f87619b = "shipping_address";
        if (str != null) {
            linkedHashMap.put("page_info", str);
        }
    }
}
