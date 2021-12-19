package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap<String, Object> f84785a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static long f84786b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static long f84787c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f84788d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f84789e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static long f84790f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static long f84791g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static long f84792h = -1;

    /* renamed from: i  reason: collision with root package name */
    public static int f84793i;

    /* renamed from: j  reason: collision with root package name */
    public static long f84794j = -1;

    /* renamed from: k  reason: collision with root package name */
    public static final h f84795k = new h();

    private h() {
    }

    public static void a(HashMap<String, Object> hashMap) {
        LinkedHashMap<String, Object> linkedHashMap = f84785a;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
    }

    public static /* synthetic */ void a(boolean z, String str, Boolean bool, Boolean bool2, HashMap hashMap, Long l2, String str2, String str3, int i2) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        Long l3 = l2;
        String str4 = str2;
        String str5 = null;
        if ((i2 & 4) != 0) {
            bool3 = null;
        }
        if ((i2 & 8) != 0) {
            bool4 = null;
        }
        if ((i2 & 32) != 0) {
            l3 = null;
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        if ((i2 & 128) == 0) {
            str5 = str3;
        }
        a(z, str, bool3, bool4, hashMap, l3, str4, str5, (Boolean) null);
    }

    public static void a(boolean z, String str, Boolean bool, Boolean bool2, HashMap<String, Object> hashMap, Long l2, String str2, String str3, Boolean bool3) {
        l.d(str, "");
        l.d(hashMap, "");
        if (f84786b > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - f84786b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(f84785a);
            linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("quit_type", str);
            linkedHashMap.put("stay_time", Long.valueOf(elapsedRealtime));
            if (l2 != null) {
                l2.longValue();
                linkedHashMap.put("stay_time", l2);
            }
            if (bool != null) {
                linkedHashMap.put("is_edit_address", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            if (bool2 != null) {
                linkedHashMap.put("is_edit_quantity", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
            }
            if (str2 != null) {
                linkedHashMap.put("page_name", str2);
            }
            if (str3 != null) {
                linkedHashMap.put("previous_page", str3);
            }
            if (bool3 != null) {
                bool3.booleanValue();
                linkedHashMap.put("is_fullscreen", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
            }
            linkedHashMap.putAll(hashMap);
            com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_stay_page", linkedHashMap);
        }
    }

    public static /* synthetic */ void a(String str, HashMap hashMap, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, int i2) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        if ((i2 & 128) != 0) {
            bool = null;
        }
        if ((i2 & 256) != 0) {
            bool2 = null;
        }
        if ((i2 & 512) != 0) {
            str5 = null;
        }
        l.d(str, "");
        l.d(hashMap, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f84785a);
        linkedHashMap.put("module_name", str);
        linkedHashMap.putAll(hashMap);
        if (str2 != null) {
            linkedHashMap.put("module_type", str2);
        }
        if (l.a((Object) str, (Object) "logistics") && str3 != null) {
            linkedHashMap.put("free_shipping_condition", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("pay_type", str4);
        }
        if (bool != null) {
            linkedHashMap.put("is_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_balance_shown", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (!(str5 == null || str5.length() == 0)) {
            linkedHashMap.put("pay_type_unavailable_code", str5);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_show", linkedHashMap);
    }

    public static /* synthetic */ void a(String str, HashMap hashMap, String str2, Float f2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, int i2) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            f2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            bool = null;
        }
        if ((i2 & 256) != 0) {
            bool2 = null;
        }
        if ((i2 & 512) != 0) {
            str6 = null;
        }
        l.d(str, "");
        l.d(hashMap, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f84785a);
        linkedHashMap.put("module_name", str);
        linkedHashMap.putAll(hashMap);
        if (str2 != null) {
            linkedHashMap.put("module_type", str2);
        }
        if (l.a((Object) str, (Object) "logistics")) {
            if (f2 != null) {
                linkedHashMap.put("shipping_price", f2);
            }
            if (str3 != null) {
                linkedHashMap.put("shipping_currency", str3);
            }
            if (str4 != null) {
                linkedHashMap.put("free_shipping_condition", str4);
            }
        }
        if (str5 != null) {
            linkedHashMap.put("pay_type", str5);
        }
        if (bool != null) {
            linkedHashMap.put("is_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_balance_shown", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (!(str6 == null || str6.length() == 0)) {
            linkedHashMap.put("pay_type_unavailable_code", str6);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_module_click", linkedHashMap);
    }

    public static /* synthetic */ void a(String str, String str2, HashMap hashMap, String str3, String str4, Boolean bool, String str5, Boolean bool2, int i2) {
        if ((i2 & 4) != 0) {
            hashMap = null;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            bool = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            bool2 = null;
        }
        l.d(str, "");
        l.d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f84785a);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("button_type", str2);
        if (str3 != null) {
            linkedHashMap.put("page_name", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("option_name", str4);
        }
        if (bool != null) {
            linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str5 != null) {
            linkedHashMap.put("payment_option", str5);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_option_discounted", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_click", linkedHashMap);
    }

    public static /* synthetic */ void a(String str, String str2, HashMap hashMap, String str3, String str4, Boolean bool, int i2) {
        if ((i2 & 4) != 0) {
            hashMap = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            bool = null;
        }
        l.d(str, "");
        l.d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f84785a);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("button_type", str2);
        if (str3 != null) {
            linkedHashMap.put("page_name", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("payment_option", str4);
        }
        if (bool != null) {
            linkedHashMap.put("is_option_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_button_show", linkedHashMap);
    }

    public static void a(boolean z, boolean z2, String str, boolean z3, String str2, HashMap<String, Object> hashMap, String str3, long j2, String str4, Boolean bool) {
        Object obj;
        l.d(str, "");
        l.d(str2, "");
        l.d(hashMap, "");
        l.d(str4, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f84785a);
        if (!l.a((Object) str, (Object) "")) {
            linkedHashMap.remove("product_id");
            linkedHashMap.remove("author_id");
            Object obj2 = linkedHashMap.get("entrance_info");
            HashMap hashMap2 = null;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            try {
                obj = j.a().a((String) obj2, HashMap.class);
            } catch (Exception unused) {
                obj = null;
            }
            HashMap hashMap3 = (HashMap) obj;
            if (hashMap3 != null) {
                hashMap3.remove("product_id");
                hashMap3.remove("author_id");
                hashMap2 = hashMap3;
            }
            linkedHashMap.put("entrance_info", dg.a().b(hashMap2));
        }
        linkedHashMap.put("order_id", str);
        linkedHashMap.put("is_edit_address", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_edit_quantity", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_success", Integer.valueOf(z3 ? 1 : 0));
        linkedHashMap.put("fail_reason", str2);
        if (z3) {
            linkedHashMap.put("total_time", Long.valueOf((SystemClock.elapsedRealtime() - f84787c) - f84789e));
        }
        linkedHashMap.putAll(hashMap);
        if (!(str3 == null || str3.length() == 0)) {
            linkedHashMap.put("pay_type", str3);
        }
        linkedHashMap.put("api_duration", String.valueOf(j2));
        linkedHashMap.put("cart_item_id", str4);
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_submit_order_result", linkedHashMap);
    }

    public static /* synthetic */ void a(String str, String str2, String str3, int i2) {
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        a(str, str2, str3, (String) null);
    }

    public static void a(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("popup_name", str);
        linkedHashMap.put("action_type", str2);
        if (str3 != null) {
            linkedHashMap.put("error_code", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("pay_type", str4);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_popup_click", linkedHashMap);
    }

    private static /* synthetic */ void a(boolean z, String str, boolean z2, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        a(z, (Boolean) null, str, z2);
    }

    private static void a(boolean z, Boolean bool, String str, boolean z2) {
        boolean z3 = true;
        if (!z) {
            new g(str, f84793i > 0, z2).d();
        }
        if (z2) {
            if (f84793i <= 0) {
                z3 = false;
            }
            new c(z3, z, bool, str).d();
        }
    }

    public static void a(HashMap<String, Object> hashMap, boolean z, boolean z2, String str, String str2, Integer num) {
        l.d(hashMap, "");
        long j2 = f84785a.get("click_buynow_start_time");
        if (j2 == null) {
            j2 = -1L;
        }
        l.b(j2, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_get_order_summary_result", new d(hashMap, str, str2, z, j2, num, z2));
    }

    public static void a(HashMap<String, Object> hashMap, int i2) {
        l.d(hashMap, "");
        long j2 = f84785a.get("click_buynow_start_time");
        if (j2 == null) {
            j2 = -1L;
        }
        l.b(j2, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("rd_tiktokec_enter_order_submit_duration", new a(hashMap, i2, j2));
    }

    public static void a() {
        f84793i++;
    }

    public static void b() {
        f84792h = SystemClock.elapsedRealtime() - f84791g;
    }

    public static void c() {
        new f(SystemClock.elapsedRealtime() - f84787c, f84792h, f84793i).d();
    }

    static {
        Covode.recordClassIndex(52988);
    }

    public static void a(String str) {
        l.d(str, "");
        new b(str).d();
    }

    public static void c(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_banner_show", new c(str));
    }

    public static final class b extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $actionType;
        final /* synthetic */ String $bannerId;

        static {
            Covode.recordClassIndex(52990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(1);
            this.$bannerId = str;
            this.$actionType = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            c.a.a(aVar2, h.f84785a);
            aVar2.b("banner_id", this.$bannerId);
            aVar2.b("action_type", this.$actionType);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $bannerId;

        static {
            Covode.recordClassIndex(52991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$bannerId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            c.a.a(aVar2, h.f84785a);
            aVar2.b("banner_id", this.$bannerId);
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ Object $clickBuynowStartTime;
        final /* synthetic */ int $isImageLoadSuccess;
        final /* synthetic */ HashMap $trackParams;

        static {
            Covode.recordClassIndex(52989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(HashMap hashMap, int i2, Object obj) {
            super(1);
            this.$trackParams = hashMap;
            this.$isImageLoadSuccess = i2;
            this.$clickBuynowStartTime = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            c.a.a(aVar2, this.$trackParams);
            aVar2.b("load_success", Integer.valueOf(this.$isImageLoadSuccess));
            aVar2.b("page_name", "order_submit");
            Object obj = this.$clickBuynowStartTime;
            if ((obj instanceof Long) && (!l.a(obj, (Object) -1L))) {
                aVar2.a("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.$clickBuynowStartTime).longValue()));
            }
            aVar2.b("image_load_duration", Long.valueOf(SystemClock.elapsedRealtime() - h.f84794j));
            return z.f158842a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[Catch:{ Exception -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[Catch:{ Exception -> 0x0058 }, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.lang.String r7) {
        /*
            java.lang.String r6 = ""
            h.f.b.l.d(r7, r6)
            h.m.l r0 = com.ss.android.ugc.aweme.ecommerce.track.d.f87535b     // Catch:{ Exception -> 0x0058 }
            r5 = 2
            r4 = 0
            r3 = 0
            h.m.j r0 = h.m.l.find$default(r0, r7, r3, r5, r4)     // Catch:{ Exception -> 0x0058 }
            r2 = 1
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x0038
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0058 }
            java.util.List r0 = h.m.p.b(r1, r0)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r2 = h.a.n.b(r0, r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0058 }
        L_0x0029:
            h.m.l r0 = com.ss.android.ugc.aweme.ecommerce.track.d.f87536c     // Catch:{ Exception -> 0x0058 }
            h.m.j r0 = h.m.l.find$default(r0, r7, r3, r5, r4)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = r0.b()     // Catch:{ Exception -> 0x0058 }
            if (r1 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0038:
            r2 = r4
            goto L_0x0029
        L_0x003a:
            r1 = r6
        L_0x003b:
            if (r2 == 0) goto L_0x0043
            boolean r0 = h.m.p.a(r2)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r3 = 1
        L_0x0044:
            if (r3 != 0) goto L_0x0057
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058 }
            r0.<init>()     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x0058 }
        L_0x0057:
            return r6
        L_0x0058:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h.b(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ Object $clickBuynowStartTime;
        final /* synthetic */ String $failReason;
        final /* synthetic */ boolean $firstLoad;
        final /* synthetic */ Integer $isDeliveryInfoComplete;
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ String $isSuccess;
        final /* synthetic */ HashMap $trackParams;

        static {
            Covode.recordClassIndex(52992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HashMap hashMap, String str, String str2, boolean z, Object obj, Integer num, boolean z2) {
            super(1);
            this.$trackParams = hashMap;
            this.$isSuccess = str;
            this.$failReason = str2;
            this.$isRetry = z;
            this.$clickBuynowStartTime = obj;
            this.$isDeliveryInfoComplete = num;
            this.$firstLoad = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            int i2;
            c.a aVar2 = aVar;
            String str = "";
            l.d(aVar2, str);
            aVar2.b("EVENT_ORIGIN_FEATURE", "TEMAI");
            c.a.a(aVar2, this.$trackParams);
            Object obj = this.$isSuccess;
            if (obj == null) {
                obj = str;
            }
            aVar2.b("is_success", obj);
            String str2 = this.$failReason;
            if (str2 != null) {
                str = str2;
            }
            aVar2.b("fail_reason", str);
            aVar2.b("is_retry", Integer.valueOf(this.$isRetry ? 1 : 0));
            aVar2.b("page_name", "order_submit");
            if (h.f84792h != -1) {
                aVar2.c("api_duration", Long.valueOf(h.f84792h));
            }
            Object obj2 = this.$clickBuynowStartTime;
            int i3 = 1;
            if ((obj2 instanceof Long) && (!l.a(obj2, (Object) -1L))) {
                aVar2.a("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.$clickBuynowStartTime).longValue()));
            }
            Integer num = this.$isDeliveryInfoComplete;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            aVar2.b("is_delivery_info_complete", Integer.valueOf(i2));
            if (h.f84793i > 0) {
                i3 = 2;
            } else if (this.$firstLoad) {
                i3 = 0;
            }
            aVar2.a("request_type", String.valueOf(i3));
            return z.f158842a;
        }
    }

    public static final class e extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ String $apiPath;
        final /* synthetic */ int $isCheckPassed;
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ HashMap $trackParams;

        static {
            Covode.recordClassIndex(52993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(int i2, String str, boolean z, HashMap hashMap) {
            super(1);
            this.$isCheckPassed = i2;
            this.$apiPath = str;
            this.$isRetry = z;
            this.$trackParams = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            String str;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.b("page_name", "order_submit");
            aVar2.b("is_check_passed", Integer.valueOf(this.$isCheckPassed));
            aVar2.c("api_path", this.$apiPath);
            if (this.$isRetry) {
                str = "yes";
            } else {
                str = "no";
            }
            aVar2.b("is_retry", str);
            HashMap hashMap = this.$trackParams;
            if (hashMap != null) {
                aVar2.c("anchor_show_type", hashMap.get("anchor_show_type"));
                aVar2.c("author_id", this.$trackParams.get("author_id"));
                aVar2.c("enter_from_info", this.$trackParams.get("enter_from_info"));
                aVar2.c("entrance_form", this.$trackParams.get("entrance_form"));
                aVar2.c("entrance_info", this.$trackParams.get("entrance_info"));
                aVar2.c("follow_status", this.$trackParams.get("follow_status"));
                aVar2.c("product_id", this.$trackParams.get("product_id"));
                aVar2.c("product_source", this.$trackParams.get("product_source"));
                aVar2.c("source", this.$trackParams.get("source"));
                aVar2.c("source_from", this.$trackParams.get("source_from"));
                aVar2.c("source_page_type", this.$trackParams.get("source_page_type"));
            }
            return z.f158842a;
        }
    }

    public static void a(Integer num) {
        String str;
        LinkedHashMap<String, Object> linkedHashMap = f84785a;
        Object obj = linkedHashMap.get("click_buynow_start_time");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        linkedHashMap2.put("page_name", "order_submit");
        if ((obj instanceof Long) && (!l.a(obj, (Object) -1L))) {
            linkedHashMap2.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (f84793i > 0) {
            str = "yes";
        } else {
            str = "no";
        }
        linkedHashMap2.put("is_retry", str);
        if (f84793i > 0) {
            num = 2;
        }
        linkedHashMap2.put("request_type", String.valueOf(num));
        com.ss.android.ugc.aweme.ecommerce.track.c.a("rd_tiktokec_first_bill_info_request_send", linkedHashMap2);
    }

    private static void a(String str, Boolean bool) {
        l.d(str, "");
        new d(str, bool, null).d();
    }

    public static void a(BillInfoResponse billInfoResponse, Boolean bool, String str) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (str != null) {
            a(false, b(str), z, 2);
        } else if (billInfoResponse == null) {
            a(false, "-1", z, 2);
        } else if (!billInfoResponse.isCodeOK()) {
            a(false, String.valueOf(billInfoResponse.code), z, 2);
        } else if (billInfoResponse.data == null || billInfoResponse.data.isEmpty()) {
            String str2 = billInfoResponse.message;
            if (str2 == null) {
                str2 = "-2";
            }
            a(false, (Boolean) true, str2, z);
        } else {
            a(true, (String) null, z, 6);
        }
    }

    public static /* synthetic */ void a(String str, Boolean bool, int i2) {
        if ((i2 & 2) != 0) {
            bool = null;
        }
        a(str, bool);
    }

    public static /* synthetic */ void a(String str, String str2, int i2) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        a(str, str2, (String) null);
    }

    public static void a(String str, String str2, String str3) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("popup_name", str);
        if (str2 != null) {
            linkedHashMap.put("error_code", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("pay_type", str3);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_popup_show", linkedHashMap);
    }

    private static void a(Boolean bool, HashMap<String, Object> hashMap, String str, String str2, String str3, String str4, Integer num) {
        l.d(hashMap, "");
        LinkedHashMap<String, Object> linkedHashMap = f84785a;
        Object obj = linkedHashMap.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        l.b(obj, "");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        linkedHashMap2.putAll(hashMap);
        if ((obj instanceof Long) && (!l.a(obj, (Object) -1L))) {
            linkedHashMap2.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (str != null) {
            linkedHashMap2.put("page_name", str);
        }
        if (str2 != null) {
            linkedHashMap2.put("previous_page", str2);
        }
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap2.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str3 != null) {
            linkedHashMap2.put("option_list", str3);
        }
        if (str4 != null) {
            linkedHashMap2.put("cart_item_id", str4);
        }
        if (num != null) {
            linkedHashMap2.put("osp_reload_tag", num);
        }
        com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_enter_page", linkedHashMap2);
    }

    public static /* synthetic */ void a(Boolean bool, HashMap hashMap, String str, String str2, String str3, String str4, Integer num, int i2) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Integer num2 = null;
        if ((i2 & 4) != 0) {
            str5 = null;
        }
        if ((i2 & 8) != 0) {
            str6 = null;
        }
        if ((i2 & 16) != 0) {
            str7 = null;
        }
        if ((i2 & 32) != 0) {
            str8 = null;
        }
        if ((i2 & 64) == 0) {
            num2 = num;
        }
        a(bool, hashMap, str5, str6, str7, str8, num2);
    }
}
