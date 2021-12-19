package com.ss.android.ugc.aweme.ecommercelive.business.common.b;

import com.bytedance.android.livesdk.ab.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ecommercelive.framework.b.a;
import com.ss.ugc.effectplatform.util.u;
import h.f.b.l;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f87978a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final HashSet<String> f87979b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private static final HashSet<String> f87980c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    private static final HashSet<String> f87981d = new HashSet<>();

    private b() {
    }

    static {
        Covode.recordClassIndex(55310);
    }

    public static void a(d dVar) {
        if (!u.a(e.o())) {
            dVar.a("rec_content_id", e.o());
            dVar.a("rec_content_type", e.p());
        }
    }

    public static d a(a aVar) {
        l.d(aVar, "");
        d dVar = new d();
        String c2 = aVar.c("author_id");
        if (c2 == null) {
            c2 = "";
        }
        d a2 = dVar.a("author_id", c2).a("EVENT_ORIGIN_FEATURE", "TEMAI");
        String c3 = aVar.c("product_id");
        if (c3 == null) {
            c3 = "";
        }
        d a3 = a2.a("product_id", c3);
        String c4 = aVar.c("product_source");
        if (c4 == null) {
            c4 = "";
        }
        d a4 = a3.a("product_source", c4);
        String c5 = aVar.c("source_from");
        if (c5 == null) {
            c5 = "";
        }
        d a5 = a4.a("source_from", c5);
        String c6 = aVar.c("source");
        if (c6 == null) {
            c6 = "";
        }
        d a6 = a5.a("source", c6);
        String c7 = aVar.c("room_id");
        if (c7 == null) {
            c7 = "";
        }
        d a7 = a6.a("room_id", c7);
        String c8 = aVar.c("enter_from_merge");
        if (c8 == null) {
            c8 = "";
        }
        d a8 = a7.a("enter_from_merge", c8);
        String c9 = aVar.c("enter_method");
        if (c9 == null) {
            c9 = "";
        }
        d a9 = a8.a("enter_method", c9);
        String c10 = aVar.c("action_type");
        if (c10 == null) {
            c10 = "";
        }
        d a10 = a9.a("action_type", c10);
        String c11 = aVar.c("carrier_type");
        if (c11 == null) {
            c11 = "";
        }
        d a11 = a10.a("carrier_type", c11);
        String c12 = aVar.c("page_type");
        if (c12 == null) {
            c12 = "";
        }
        d a12 = a11.a("page_type", c12);
        String c13 = aVar.c("anchor_show_type");
        if (c13 == null) {
            c13 = "";
        }
        d a13 = a12.a("anchor_show_type", c13);
        String c14 = aVar.c("follow_status");
        if (c14 == null) {
            c14 = "-1";
        }
        d a14 = a13.a("follow_status", c14);
        String c15 = aVar.c("entrance_form");
        if (c15 == null) {
            c15 = "";
        }
        d a15 = a14.a("entrance_form", c15);
        String c16 = aVar.c("page_name");
        if (c16 == null) {
            c16 = "";
        }
        d a16 = a15.a("page_name", c16);
        String c17 = aVar.c("is_ad");
        if (c17 == null) {
            c17 = "";
        }
        d a17 = a16.a("is_ad", c17);
        String c18 = aVar.c("request_id");
        if (c18 == null) {
            c18 = "";
        }
        d a18 = a17.a("request_id", c18);
        String c19 = aVar.c("search_id");
        if (c19 == null) {
            c19 = "";
        }
        d a19 = a18.a("search_id", c19);
        String c20 = aVar.c("search_result_id");
        if (c20 == null) {
            c20 = "";
        }
        d a20 = a19.a("search_result_id", c20);
        l.b(a20, "");
        return a20;
    }

    public static void a(a aVar, String str, Boolean bool, Map<String, String> map, Map<String, String> map2, String str2, String str3, String str4) {
        l.d(aVar, "");
        d a2 = a(aVar).a("item_order", aVar.c("item_order"));
        if (aVar.a("campaign_id")) {
            a2.a("campaign_id", aVar.c("campaign_id"));
        }
        if (aVar.a("campaign_type")) {
            a2.a("campaign_type", aVar.c("campaign_type"));
        }
        if (aVar.a("campaign_channel")) {
            a2.a("campaign_channel", aVar.c("campaign_channel"));
        }
        if (aVar.a("campaign_user_tag")) {
            a2.a("campaign_user_tag", aVar.c("campaign_user_tag"));
        }
        if (str3 != null) {
            a2.a("flashsale_status", str3);
        }
        if (str4 != null) {
            a2.a("countdown_type", str4);
        }
        l.b(a2, "");
        a(a2);
        a2.a(map);
        a2.a(map2);
        r.a("livesdk_tiktokec_product_entrance_show", a2.f66730a);
        if (l.a((Object) bool, (Object) true)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (str2 != null) {
                hashMap.put("refer", str2);
            }
            HashMap hashMap2 = new HashMap();
            if (str != null) {
                hashMap2.put("room_id", str);
            }
            com.bytedance.android.livesdk.utils.a.a("live_ad", "othershow", hashMap, hashMap2);
        }
    }

    public static void b(a aVar, String str, Boolean bool, Map<String, String> map, Map<String, String> map2, String str2, String str3, String str4) {
        l.d(aVar, "");
        d a2 = a(aVar).a("item_order", aVar.c("item_order"));
        if (aVar.a("campaign_id")) {
            a2.a("campaign_id", aVar.c("campaign_id"));
        }
        if (aVar.a("campaign_type")) {
            a2.a("campaign_type", aVar.c("campaign_type"));
        }
        if (aVar.a("campaign_channel")) {
            a2.a("campaign_channel", aVar.c("campaign_channel"));
        }
        if (aVar.a("campaign_user_tag")) {
            a2.a("campaign_user_tag", aVar.c("campaign_user_tag"));
        }
        if (str3 != null) {
            a2.a("flashsale_status", str3);
        }
        if (str4 != null) {
            a2.a("countdown_type", str4);
        }
        l.b(a2, "");
        a(a2);
        a2.a(map);
        a2.a(map2);
        r.a("livesdk_tiktokec_product_entrance_click", a2.f66730a);
        if (l.a((Object) bool, (Object) true)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("refer", str2);
            HashMap hashMap2 = new HashMap();
            if (str != null) {
                hashMap2.put("room_id", str);
            }
            com.bytedance.android.livesdk.utils.a.a("live_ad", "otherclick", hashMap, hashMap2);
        }
    }

    public static void a(a aVar, String str, Boolean bool, Map<String, String> map, Map<String, String> map2, String str2, String str3, String str4, String str5) {
        l.d(aVar, "");
        d a2 = a(aVar).a("item_order", aVar.c("item_order"));
        String c2 = aVar.c("list_skin_type");
        if (c2 == null) {
            c2 = "";
        }
        d a3 = a2.a("list_skin_type", c2);
        String c3 = aVar.c("product_skin_type");
        if (c3 == null) {
            c3 = "";
        }
        d a4 = a3.a("product_skin_type", c3);
        if (aVar.a("campaign_id")) {
            a4.a("campaign_id", aVar.c("campaign_id"));
        }
        if (aVar.a("campaign_type")) {
            a4.a("campaign_type", aVar.c("campaign_type"));
        }
        if (aVar.a("campaign_channel")) {
            a4.a("campaign_channel", aVar.c("campaign_channel"));
        }
        if (aVar.a("campaign_user_tag")) {
            a4.a("campaign_user_tag", aVar.c("campaign_user_tag"));
        }
        if (str3 != null) {
            a4.a("flashsale_status", str3);
        }
        if (str4 != null) {
            a4.a("countdown_type", str4);
        }
        if (str5 != null) {
            a4.a("is_sold_out", str5);
        }
        l.b(a4, "");
        a(a4);
        a4.a(map);
        a4.a(map2);
        r.a("livesdk_tiktokec_product_show", a4.f66730a);
        if (l.a((Object) bool, (Object) true)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("refer", str2);
            HashMap hashMap2 = new HashMap();
            if (str != null) {
                hashMap2.put("room_id", str);
            }
            com.bytedance.android.livesdk.utils.a.a("live_ad", "othershow", hashMap, hashMap2);
        }
    }
}
