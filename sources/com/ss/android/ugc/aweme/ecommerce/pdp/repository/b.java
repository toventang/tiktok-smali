package com.ss.android.ugc.aweme.ecommerce.pdp.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.utils.dg;
import f.a.e.e.e.au;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class b extends com.bytedance.jedi.a.j.b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f86544b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static final e f86545c = new e();

    /* renamed from: d  reason: collision with root package name */
    private static final h.h f86546d = h.i.a((h.f.a.a) i.f86562a);

    /* renamed from: e  reason: collision with root package name */
    private static final h.h f86547e = h.i.a((h.f.a.a) h.f86561a);

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, d> f86548f = new HashMap<>();

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f86559a = new f();

        static {
            Covode.recordClassIndex(54227);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final g f86560a = new g();

        static {
            Covode.recordClassIndex(54228);
        }

        g() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final void a(String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final void b(IPdpStarter.PdpEnterParam pdpEnterParam) {
        l.d(pdpEnterParam, "");
    }

    private b() {
    }

    static final class h extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f86561a = new h();

        static {
            Covode.recordClassIndex(54229);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.a invoke() {
            return new com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.a();
        }
    }

    static final class i extends m implements h.f.a.a<com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f86562a = new i();

        static {
            Covode.recordClassIndex(54230);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.b invoke() {
            return new com.ss.android.ugc.aweme.ecommerce.pdp.repository.api.b();
        }
    }

    static {
        Covode.recordClassIndex(54221);
    }

    static final class a<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f86549a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b f86550b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f86551c;

        static {
            Covode.recordClassIndex(54222);
        }

        a(String str, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar, String str2) {
            this.f86549a = str;
            this.f86550b = bVar;
            this.f86551c = str2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar;
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar2 = (com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b) obj;
            l.d(bVar2, "");
            if (!l.a((Object) this.f86549a, (Object) "tt_pdp_dynamic") || (bVar = this.f86550b) == null) {
                String str = this.f86551c;
                l.b(str, "");
                b.a(str, bVar2);
                return bVar2;
            }
            com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b a2 = bVar.a(bVar2);
            String str2 = this.f86551c;
            l.b(str2, "");
            b.a(str2, a2);
            return a2;
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f86557b;

        static {
            Covode.recordClassIndex(54225);
        }

        d(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
            this.f86556a = pdpEnterParam;
            this.f86557b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ecommerce.track.d.f87534a = System.currentTimeMillis();
            com.ss.android.ugc.aweme.ecommerce.track.d.a(this.f86556a.getTrackParams(), com.ss.android.ugc.aweme.ecommerce.pdp.b.a(this.f86556a.getTrackParams()), this.f86557b, "/api/v1/shop/product_info/get", 0, "product_detail");
            com.ss.android.ugc.aweme.ecommerce.track.d.a(this.f86556a, this.f86557b, 0);
        }
    }

    static final class e<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f86558a = new e();

        static {
            Covode.recordClassIndex(54226);
        }

        e() {
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
            b.a((com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a) bVar.data);
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
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$b  reason: collision with other inner class name */
    static final class C2087b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86552a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f86553b;

        static {
            Covode.recordClassIndex(54223);
        }

        C2087b(IPdpStarter.PdpEnterParam pdpEnterParam, int i2) {
            this.f86552a = pdpEnterParam;
            this.f86553b = i2;
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
            b.a((com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.a) bVar.data);
            if (!bVar.isCodeOK() || list == null || list.isEmpty() || !h.a.i.a(ProductPackStruct.B, ((ProductPackStruct) n.g((List) list)).f86639c)) {
                throw new IPdpStarter.b(bVar.code, bVar.message, bVar);
            }
            com.ss.android.ugc.aweme.ecommerce.track.d.f87537d.a(this.f86552a, this.f86553b);
            ProductPackStruct productPackStruct = (ProductPackStruct) n.g((List) list);
            if (bVar.data.f86680c != null) {
                productPackStruct.u = bVar.data.f86680c;
            }
            return productPackStruct;
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IPdpStarter.PdpEnterParam f86554a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f86555b;

        static {
            Covode.recordClassIndex(54224);
        }

        c(IPdpStarter.PdpEnterParam pdpEnterParam, int i2) {
            this.f86554a = pdpEnterParam;
            this.f86555b = i2;
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
                if (r0 == 0) goto L_0x0022
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.ss.android.ugc.aweme.ecommerce.track.d.f87537d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f86554a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$b r6 = (com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.b) r6
                int r0 = r6.getCode()
                java.lang.String r1 = java.lang.String.valueOf(r0)
                int r0 = r5.f86555b
                r4.a(r3, r2, r1, r0)
                return
            L_0x0022:
                java.lang.String r1 = ""
                h.f.b.l.b(r6, r1)
                java.lang.Integer r0 = com.ss.android.ugc.aweme.ecommerce.util.k.a(r6)
                if (r0 != 0) goto L_0x0043
            L_0x002d:
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.ss.android.ugc.aweme.ecommerce.track.d.f87537d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f86554a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r1 = r1.toString()
                int r0 = r5.f86555b
                r4.a(r3, r2, r1, r0)
                return
            L_0x0043:
                r1 = r0
                goto L_0x002d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b.c.accept(java.lang.Object):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final t<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> a(IPdpStarter.PdpEnterParam pdpEnterParam) {
        l.d(pdpEnterParam, "");
        Object clone = pdpEnterParam.getRequestParams().clone();
        Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, 0.0f, null, false, false, false, null, 2046, null);
        copy$default.getRequestParams().put("template", "tt_sku_selection");
        t<com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b> a2 = au.a(((com.bytedance.jedi.a.f.a) f86547e.getValue()).c(copy$default).b(f.a.h.a.b(f.a.k.a.f158006c)).a(1).d(e.f86558a).a(f.f86559a).c(g.f86560a), au.f157490e).f(f.a.e.b.a.f157191d).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }

    public static void a(String str, com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b bVar) {
        if (bVar.a()) {
            f86545c.a(str, bVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.repository.a
    public final d a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i2, boolean z2, Boolean bool) {
        String str;
        l.d(pdpEnterParam, "");
        Object clone = pdpEnterParam.getRequestParams().clone();
        Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, 0.0f, null, false, false, false, null, 2046, null);
        String b2 = dg.a().b(copy$default.getRequestParams());
        e eVar = f86545c;
        l.b(b2, "");
        com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.b a2 = eVar.b(b2);
        if (l.a((Object) bool, (Object) true) || (a2 != null && a2.a() && !a2.b())) {
            str = "tt_pdp_dynamic";
        } else {
            str = "tt_pdp_full";
        }
        copy$default.getRequestParams().put("template", str);
        String b3 = dg.a().b(copy$default.getRequestParams());
        HashMap<String, d> hashMap = f86548f;
        d dVar = hashMap.get(b3);
        if (dVar != null) {
            hashMap.remove(b3);
            return dVar;
        }
        t a3 = au.a(((com.bytedance.jedi.a.f.a) f86546d.getValue()).c(copy$default).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new a(str, a2, b2)).d(new C2087b(copy$default, i2)).a(new c(copy$default, i2)).c(new d(copy$default, z)), au.f157490e).f(f.a.e.b.a.f157191d).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a3, "");
        d dVar2 = new d(b2, 0, a3, (byte) 0);
        if (!z) {
            l.b(b3, "");
            hashMap.put(b3, dVar2);
        }
        return dVar2;
    }
}
