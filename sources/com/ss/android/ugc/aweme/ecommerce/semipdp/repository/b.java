package com.ss.android.ugc.aweme.ecommerce.semipdp.repository;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.semipdp.repository.SemiPdpApi;
import com.ss.android.ugc.aweme.ecommerce.track.d;
import com.ss.android.ugc.aweme.utils.dg;
import f.a.d.f;
import f.a.e.e.e.au;
import f.a.t;
import h.f.b.l;
import h.p;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final HashMap<String, a> f87325a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final b f87326b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(54812);
    }

    public static void a(HashMap<String, Object> hashMap) {
        l.d(hashMap, "");
        f87325a.remove(dg.a().b(hashMap));
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f87327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f87328b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f87329c;

        static {
            Covode.recordClassIndex(54813);
        }

        a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i2, String str) {
            this.f87327a = semiPdpEnterParams;
            this.f87328b = i2;
            this.f87329c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Integer] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                java.lang.String r1 = ""
                h.f.b.l.b(r6, r1)
                java.lang.Integer r0 = com.ss.android.ugc.aweme.ecommerce.util.k.a(r6)
                if (r0 != 0) goto L_0x002a
            L_0x000d:
                com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter$SemiPdpEnterParams r4 = r5.f87327a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r3 = java.lang.String.valueOf(r0)
                java.lang.String r2 = r1.toString()
                int r1 = r5.f87328b
                r0 = 8
                com.ss.android.ugc.aweme.ecommerce.track.d.a(r4, r3, r2, r1, r0)
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.ecommerce.semipdp.repository.a> r1 = com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.f87325a
                java.lang.String r0 = r5.f87329c
                r1.remove(r0)
                return
            L_0x002a:
                r1 = r0
                goto L_0x000d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.a.accept(java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b$b  reason: collision with other inner class name */
    public static final class C2108b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f87330a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f87331b;

        static {
            Covode.recordClassIndex(54814);
        }

        C2108b(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i2) {
            this.f87330a = semiPdpEnterParams;
            this.f87331b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t;
            u uVar = (u) obj;
            l.b(uVar, "");
            String str = null;
            if (uVar.f42629a.a()) {
                d.a(this.f87330a, (String) null, (String) null, this.f87331b, 14);
            } else {
                SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f87330a;
                com.bytedance.retrofit2.client.c cVar = uVar.f42629a;
                if (cVar != null) {
                    str = cVar.f42475c;
                }
                d.a(semiPdpEnterParams, str, String.valueOf(uVar.f42629a.f42474b), this.f87331b, 8);
            }
            T t2 = uVar.f42630b;
            if (!(t2 == null || (t = t2.data) == null || t.f86678a == null || t.f86678a.isEmpty())) {
                for (ProductPackStruct productPackStruct : t.f86678a) {
                    productPackStruct.r = t.f86679b;
                    productPackStruct.y = t.f86681d;
                    productPackStruct.z = t.f86682e;
                    productPackStruct.A = t.f86683f;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f87332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f87333b;

        static {
            Covode.recordClassIndex(54815);
        }

        c(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i2) {
            this.f87332a = semiPdpEnterParams;
            this.f87333b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Object obj2;
            d.a(this.f87332a.getTrackParams(), com.ss.android.ugc.aweme.ecommerce.pdp.b.a(this.f87332a.getTrackParams()), false, "/api/v1/shop/product_info/get", this.f87333b, "semi_product_detail");
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f87332a;
            int i2 = this.f87333b;
            l.d(semiPdpEnterParams, "");
            HashMap<String, Object> trackParams = semiPdpEnterParams.getTrackParams();
            if (trackParams == null || (obj2 = trackParams.get("click_product_start_time")) == null) {
                obj2 = -1L;
            }
            l.b(obj2, "");
            HashMap hashMap = new HashMap();
            hashMap.putAll(semiPdpEnterParams.getRequestParams());
            HashMap<String, Object> trackParams2 = semiPdpEnterParams.getTrackParams();
            if (trackParams2 == null) {
                trackParams2 = new HashMap<>();
            }
            hashMap.putAll(trackParams2);
            if ((obj2 instanceof Long) && (!l.a(obj2, (Object) -1L))) {
                hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj2).longValue()));
            }
            hashMap.put("is_retry", "no");
            hashMap.put("preload_type", Integer.valueOf(i2));
            hashMap.put("api_path", "/api/v1/shop/third_party_product_info/get");
            if (!hashMap.containsKey("page_name")) {
                hashMap.put("page_name", "semi_product_detail");
            }
            d.a("rd_tiktokec_product_detail_request_send", hashMap);
        }
    }

    public static a a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i2) {
        int i3;
        l.d(semiPdpEnterParams, "");
        String b2 = dg.a().b(semiPdpEnterParams.getRequestParams());
        a aVar = f87325a.get(b2);
        HashMap<String, Object> requestParams = semiPdpEnterParams.getRequestParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = semiPdpEnterParams.getRequestParams().get("product_id");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            for (Object obj2 : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (i2 != 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                linkedHashMap2.put("req_type", Integer.valueOf(i3));
                linkedHashMap.put(obj2, linkedHashMap2);
            }
        }
        requestParams.put("product_enter_context", linkedHashMap);
        if (aVar != null) {
            return aVar;
        }
        t<u<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a>>> b3 = SemiPdpApi.a.a(semiPdpEnterParams.getRequestParams()).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b3, "");
        t a2 = au.a(com.ss.android.ugc.aweme.ecommerce.track.b.a(b3, "semi_product_detail", new p[0]).a(new a(semiPdpEnterParams, i2, b2)).b((f) new C2108b(semiPdpEnterParams, i2)).c(new c(semiPdpEnterParams, i2)), au.f157490e).f(f.a.e.b.a.f157191d).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        a aVar2 = new a(a2);
        HashMap<String, a> hashMap = f87325a;
        l.b(b2, "");
        hashMap.put(b2, aVar2);
        return aVar2;
    }
}
