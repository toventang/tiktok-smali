package com.ss.android.ugc.aweme.ecommerce.pdp.repository;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.c;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.utils.dg;
import f.a.e.e.e.au;
import f.a.t;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class c extends com.bytedance.jedi.a.j.b implements a {

    /* renamed from: b  reason: collision with root package name */
    static final HashMap<String, d> f86563b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static final c f86564c = new c();

    /* renamed from: d  reason: collision with root package name */
    private static final e f86565d = new e();

    /* renamed from: e  reason: collision with root package name */
    private static final h.h f86566e = h.i.a((h.f.a.a) k.f86588a);

    /* renamed from: f  reason: collision with root package name */
    private static final h.h f86567f = h.i.a((h.f.a.a) j.f86587a);

    /* renamed from: g  reason: collision with root package name */
    private static long f86568g;

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f86572a = new b();

        static {
            Covode.recordClassIndex(54234);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final h f86585a = new h();

        static {
            Covode.recordClassIndex(54240);
        }

        h() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final i f86586a = new i();

        static {
            Covode.recordClassIndex(54241);
        }

        i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private c() {
    }

    static final class j extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f86587a = new j();

        static {
            Covode.recordClassIndex(54242);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.a invoke() {
            return new com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.a();
        }
    }

    static final class k extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f86588a = new k();

        static {
            Covode.recordClassIndex(54243);
        }

        k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.b invoke() {
            return new com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.b();
        }
    }

    static {
        Covode.recordClassIndex(54231);
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f86569a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f86570b;

        static {
            Covode.recordClassIndex(54232);
        }

        a(d dVar, String str) {
            this.f86569a = dVar;
            this.f86570b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f86569a.f86593d = (ProductPackStruct) obj;
            if (com.ss.android.ugc.aweme.ecommerce.ab.j.a() > 0) {
                com.ss.android.ugc.aweme.base.m.f68150a.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.repository.c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f86571a;

                    static {
                        Covode.recordClassIndex(54233);
                    }

                    {
                        this.f86571a = r1;
                    }

                    public final void run() {
                        c.f86563b.remove(this.f86571a.f86570b);
                    }
                }, (long) com.ss.android.ugc.aweme.ecommerce.ab.j.a());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final void a(String str) {
        l.d(str, "");
        f86563b.remove(str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final void b(IPdpStarter.PdpEnterParam pdpEnterParam) {
        l.d(pdpEnterParam, "");
        if (SystemClock.elapsedRealtime() - f86568g > 300000) {
            d unused = a(pdpEnterParam, false, 1, false, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$c  reason: collision with other inner class name */
    static final class C2088c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f86573a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b f86574b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f86575c;

        static {
            Covode.recordClassIndex(54235);
        }

        C2088c(String str, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar, String str2) {
            this.f86573a = str;
            this.f86574b = bVar;
            this.f86575c = str2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar;
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar2 = (com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b) obj;
            l.d(bVar2, "");
            if (!l.a((Object) this.f86573a, (Object) "tt_pdp_dynamic") || (bVar = this.f86574b) == null) {
                String str = this.f86575c;
                l.b(str, "");
                c.a(str, bVar2);
                return bVar2;
            }
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b a2 = bVar.a(bVar2);
            String str2 = this.f86575c;
            l.b(str2, "");
            c.a(str2, a2);
            return a2;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86581a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f86582b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f86583c;

        static {
            Covode.recordClassIndex(54238);
        }

        f(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i2) {
            this.f86581a = pdpEnterParam;
            this.f86582b = z;
            this.f86583c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ecommerce.track.d.f87534a = System.currentTimeMillis();
            com.ss.android.ugc.aweme.ecommerce.track.d.a(this.f86581a.getTrackParams(), com.ss.android.ugc.aweme.ecommerce.pdp.b.a(this.f86581a.getTrackParams()), this.f86582b, "/api/v1/shop/product_info/get", this.f86583c, "product_detail");
            com.ss.android.ugc.aweme.ecommerce.track.d.a(this.f86581a, this.f86582b, this.f86583c);
        }
    }

    static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f86584a = new g();

        static {
            Covode.recordClassIndex(54239);
        }

        g() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List<ProductPackStruct> list;
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar = (com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b) obj;
            l.d(bVar, "");
            T t = bVar.data;
            if (t != null) {
                list = t.f86678a;
            } else {
                list = null;
            }
            c.a((com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a) bVar.data);
            if (bVar.isCodeOK() && list != null && !list.isEmpty()) {
                return bVar;
            }
            throw new IPdpStarter.b(bVar.code, bVar.message, bVar);
        }
    }

    public static void a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a aVar) {
        if (!(aVar == null || aVar.f86678a == null || aVar.f86678a.isEmpty())) {
            for (ProductPackStruct productPackStruct : aVar.f86678a) {
                productPackStruct.r = aVar.f86679b;
                productPackStruct.z = aVar.f86682e;
                productPackStruct.y = aVar.f86681d;
                productPackStruct.A = aVar.f86683f;
            }
        }
    }

    private static Map<String, Object> c(IPdpStarter.PdpEnterParam pdpEnterParam) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (!(trackParams == null || (obj = trackParams.get("author_id")) == null)) {
            l.b(obj, "");
            linkedHashMap.put("kol_id", obj);
        }
        linkedHashMap.put("promotion_response_style", 1);
        return linkedHashMap;
    }

    static final class d<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86576a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f86577b;

        static {
            Covode.recordClassIndex(54236);
        }

        d(IPdpStarter.PdpEnterParam pdpEnterParam, int i2) {
            this.f86576a = pdpEnterParam;
            this.f86577b = i2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List<ProductPackStruct> list;
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar = (com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b) obj;
            l.d(bVar, "");
            T t = bVar.data;
            if (t != null) {
                list = t.f86678a;
            } else {
                list = null;
            }
            c.a((com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a) bVar.data);
            if (!bVar.isCodeOK() || list == null || list.isEmpty() || !h.a.i.a(ProductPackStruct.B, ((ProductPackStruct) n.g((List) list)).f86639c)) {
                throw new IPdpStarter.b(bVar.code, bVar.message, bVar);
            }
            com.ss.android.ugc.aweme.ecommerce.track.d.f87537d.a(this.f86576a, this.f86577b);
            ProductPackStruct productPackStruct = (ProductPackStruct) n.g((List) list);
            if (!(productPackStruct.o == null || productPackStruct.f86638b == null)) {
                com.ss.android.ugc.aweme.ecommerce.pdp.c a2 = c.a.a(productPackStruct.f86638b);
                FlashSale flashSale = productPackStruct.o;
                l.d(flashSale, "");
                a2.f86426e.post(new c.b(a2, flashSale));
            }
            if (bVar.data.f86680c != null) {
                productPackStruct.u = bVar.data.f86680c;
            }
            return productPackStruct;
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f86579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f86580c;

        static {
            Covode.recordClassIndex(54237);
        }

        e(IPdpStarter.PdpEnterParam pdpEnterParam, int i2, String str) {
            this.f86578a = pdpEnterParam;
            this.f86579b = i2;
            this.f86580c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                boolean r0 = r6 instanceof com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.b
                if (r0 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.ss.android.ugc.aweme.ecommerce.track.d.f87537d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f86578a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$b r6 = (com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.b) r6
                int r0 = r6.getCode()
                java.lang.String r1 = java.lang.String.valueOf(r0)
                int r0 = r5.f86579b
                r4.a(r3, r2, r1, r0)
            L_0x0021:
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.ecommerce.pdp.repository.d> r1 = com.ss.android.ugc.aweme.ecommerce.pdp.repository.c.f86563b
                java.lang.String r0 = r5.f86580c
                r1.remove(r0)
                return
            L_0x0029:
                java.lang.String r1 = ""
                h.f.b.l.b(r6, r1)
                java.lang.Integer r0 = com.ss.android.ugc.aweme.ecommerce.util.k.a(r6)
                if (r0 != 0) goto L_0x004a
            L_0x0034:
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.ss.android.ugc.aweme.ecommerce.track.d.f87537d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f86578a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r1 = r1.toString()
                int r0 = r5.f86579b
                r4.a(r3, r2, r1, r0)
                goto L_0x0021
            L_0x004a:
                r1 = r0
                goto L_0x0034
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c.e.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final t<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> a(IPdpStarter.PdpEnterParam pdpEnterParam) {
        l.d(pdpEnterParam, "");
        Object clone = pdpEnterParam.getRequestParams().clone();
        Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, 0.0f, null, false, false, false, null, 2046, null);
        copy$default.getRequestParams().put("template", "tt_sku_selection");
        Object obj = copy$default.getRequestParams().get("product_id");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (Object obj2 : list) {
                copy$default.getRequestParams().put("product_source_info", ag.c(v.a(obj2, Integer.valueOf(IPdpStarter.a.a(pdpEnterParam.getTrackParams())))));
                arrayList.add(z.f158842a);
            }
        }
        copy$default.getRequestParams().putAll(c(pdpEnterParam));
        t<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> a2 = au.a(((com.bytedance.jedi.a.f.a) f86567f.getValue()).c(copy$default).b(f.a.h.a.b(f.a.k.a.f158006c)).a(1).d(g.f86584a).a(h.f86585a).c(i.f86586a), au.f157490e).f(f.a.e.b.a.f157191d).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }

    public static void a(String str, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar) {
        if (bVar.a()) {
            f86565d.a(str, bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final d a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i2, boolean z2, Boolean bool) {
        String str;
        int i3;
        Object obj;
        int a2;
        long longValue;
        l.d(pdpEnterParam, "");
        Object clone = pdpEnterParam.getRequestParams().clone();
        Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, 0.0f, null, false, false, false, null, 2046, null);
        String b2 = dg.a().b(copy$default.getRequestParams());
        e eVar = f86565d;
        l.b(b2, "");
        com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b a3 = eVar.b(b2);
        if (!l.a((Object) bool, (Object) true) ? a3 == null || !a3.a() || a3.b() : a3 == null) {
            str = "tt_pdp_full";
        } else {
            str = "tt_pdp_dynamic";
        }
        copy$default.getRequestParams().put("template", str);
        Object obj2 = copy$default.getRequestParams().get("product_id");
        List list = null;
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (!(list2 == null || (obj = list2.get(0)) == null)) {
            if (copy$default.getProductEnterContext() != null) {
                Object obj3 = copy$default.getProductEnterContext().get(obj);
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                if (((Map) obj3).get("enter_source_type") != null) {
                    Object obj4 = copy$default.getProductEnterContext().get(obj);
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    Object obj5 = ((Map) obj4).get("enter_source_type");
                    if (obj5 == null) {
                        l.b();
                    }
                    Class<?> cls = obj5.getClass();
                    if (l.a(cls, Integer.class)) {
                        a2 = ((Integer) obj5).intValue();
                    } else if (l.a(cls, Short.class)) {
                        a2 = ((Short) obj5).shortValue();
                    } else {
                        if (l.a(cls, Long.class)) {
                            longValue = ((Long) obj5).longValue();
                        } else if (l.a(cls, Integer.TYPE)) {
                            a2 = ((Integer) obj5).intValue();
                        } else if (l.a(cls, Short.TYPE)) {
                            a2 = ((Short) obj5).shortValue();
                        } else if (l.a(cls, Long.TYPE)) {
                            longValue = ((Long) obj5).longValue();
                        } else {
                            a2 = 0;
                        }
                        a2 = (int) longValue;
                    }
                    copy$default.getRequestParams().put("product_source_info", ag.c(v.a(obj, Integer.valueOf(a2))));
                }
            }
            a2 = IPdpStarter.a.a(pdpEnterParam.getTrackParams());
            copy$default.getRequestParams().put("product_source_info", ag.c(v.a(obj, Integer.valueOf(a2))));
        }
        HashMap<String, Object> requestParams = copy$default.getRequestParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj6 = copy$default.getRequestParams().get("product_id");
        if (obj6 instanceof List) {
            list = obj6;
        }
        List list3 = list;
        if (list3 != null) {
            for (Object obj7 : list3) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (i2 != 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                linkedHashMap2.put("req_type", Integer.valueOf(i3));
                if (!(copy$default.getProductEnterContext() == null || copy$default.getProductEnterContext().get(obj7) == null)) {
                    Object obj8 = copy$default.getProductEnterContext().get(obj7);
                    Objects.requireNonNull(obj8, "null cannot be cast to non-null type kotlin.collections.Map<out kotlin.String, kotlin.Any>");
                    linkedHashMap2.putAll((Map) obj8);
                }
                linkedHashMap.put(obj7, linkedHashMap2);
            }
        }
        requestParams.put("product_enter_context", linkedHashMap);
        copy$default.getRequestParams().putAll(c(pdpEnterParam));
        HashMap<String, d> hashMap = f86563b;
        d dVar = hashMap.get(b2);
        if (dVar != null) {
            if (z2) {
                hashMap.remove(b2);
            }
            return dVar;
        }
        t a4 = au.a(((com.bytedance.jedi.a.f.a) f86566e.getValue()).c(copy$default).b(f.a.h.a.b(f.a.k.a.f158006c)).a(1).d(new C2088c(str, a3, b2)).d(new d(copy$default, i2)).a(new e(copy$default, i2, b2)).c(new f(copy$default, z, i2)), au.f157490e).f(f.a.e.b.a.f157191d).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a4, "");
        d dVar2 = new d(b2, i2, a4, (byte) 0);
        a4.a(new a(dVar2, b2), b.f86572a);
        f86568g = SystemClock.elapsedRealtime();
        if (!z && !z2) {
            hashMap.put(b2, dVar2);
        }
        return dVar2;
    }
}
