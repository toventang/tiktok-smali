package com.ss.android.ugc.aweme.ecommerce;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.retrofit2.u;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ecommerce.ab.h;
import com.ss.android.ugc.aweme.ecommerce.ab.j;
import com.ss.android.ugc.aweme.ecommerce.ab.p;
import com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.OpenThirdPartyAppMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.jsb.PhoneCountryCodeTranslateMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.PhoneCountryCodeTranslateMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.jsb.PrefetchSchemaBulletMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.PrefetchSchemaJavaMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.UpdateNonceMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethod;
import com.ss.android.ugc.aweme.ecommerce.jsb.VerificationCheckMethodBullet;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.OrderCenterEntry;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.router.SchemaFallbackConfig;
import com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class ECommerceService implements IECommerceService {
    private final com.ss.android.ugc.aweme.ecommerce.router.g fallbackInterceptor;
    private final List<IInterceptor> interceptors;
    private final List<IInterceptor> pipeInterceptors = n.a(new com.ss.android.ugc.aweme.ecommerce.router.e());

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f84189a = new c();

        static {
            Covode.recordClassIndex(52502);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84190a = new d();

        static {
            Covode.recordClassIndex(52503);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f84192a = new f();

        static {
            Covode.recordClassIndex(52505);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(52498);
    }

    public static int com_ss_android_ugc_aweme_ecommerce_ECommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final List<IInterceptor> getEComPipeRouterInterceptors() {
        return this.pipeInterceptors;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final List<IInterceptor> getECommerceRouterInterceptors() {
        return this.interceptors;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final com.ss.android.ugc.aweme.ecommerce.service.b getOrderCenterEntry() {
        return new OrderCenterEntry();
    }

    public final com.ss.android.ugc.aweme.ecommerce.service.vo.a getCommonResource() {
        com.ss.android.ugc.aweme.ecommerce.ab.e b2 = j.b();
        return new com.ss.android.ugc.aweme.ecommerce.service.vo.a(b2.f84214c, b2.f84215d);
    }

    public ECommerceService() {
        com.ss.android.ugc.aweme.ecommerce.router.g gVar = new com.ss.android.ugc.aweme.ecommerce.router.g();
        this.fallbackInterceptor = gVar;
        this.interceptors = n.b(gVar, new com.ss.android.ugc.aweme.ecommerce.router.c(), new com.ss.android.ugc.aweme.ecommerce.router.d(), new com.ss.android.ugc.aweme.ecommerce.router.a(), new com.ss.android.ugc.aweme.ecommerce.router.f(), new com.ss.android.ugc.aweme.ecommerce.router.b());
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final g f84193a = new g();

        static {
            Covode.recordClassIndex(52506);
        }

        g() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ECommerceService.g.run():void");
        }

        static final class a extends m implements h.f.a.b<c.a, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f84194a = new a();

            static {
                Covode.recordClassIndex(52507);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(c.a aVar) {
                c.a aVar2 = aVar;
                l.d(aVar2, "");
                aVar2.b("EVENT_ORIGIN_FEATURE", "TEMAI");
                aVar2.b("page_name", "third_party_page");
                aVar2.b("tips_title", "third_party_disclaimer");
                return z.f158842a;
            }
        }
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f84182a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f84183b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f84184c;

        static {
            Covode.recordClassIndex(52499);
        }

        a(int i2, h.f.a.b bVar, Context context) {
            this.f84182a = i2;
            this.f84183b = bVar;
            this.f84184c = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ProductBaseEpt productBaseEpt;
            ProductPackStruct productPackStruct = (ProductPackStruct) obj;
            h.f.a.b bVar = this.f84183b;
            if (bVar != null) {
                ProductBase productBase = productPackStruct.f86641e;
                if (productBase != null) {
                    productBaseEpt = productBase.a();
                } else {
                    productBaseEpt = null;
                }
                bVar.invoke(productBaseEpt);
            }
        }
    }

    public static IECommerceService createIECommerceServicebyMonsterPlugin(boolean z) {
        MethodCollector.i(5385);
        Object a2 = com.ss.android.ugc.b.a(IECommerceService.class, z);
        if (a2 != null) {
            IECommerceService iECommerceService = (IECommerceService) a2;
            MethodCollector.o(5385);
            return iECommerceService;
        }
        if (com.ss.android.ugc.b.bh == null) {
            synchronized (IECommerceService.class) {
                try {
                    if (com.ss.android.ugc.b.bh == null) {
                        com.ss.android.ugc.b.bh = new ECommerceService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5385);
                    throw th;
                }
            }
        }
        ECommerceService eCommerceService = (ECommerceService) com.ss.android.ugc.b.bh;
        MethodCollector.o(5385);
        return eCommerceService;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final List<k> getJSMethods(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new PhoneCountryCodeTranslateMethodBullet(bVar));
        arrayList.add(new VerificationCheckMethodBullet(bVar));
        arrayList.add(new OpenThirdPartyAppMethodBullet(bVar));
        arrayList.add(new GetInfoByOCRMethodBullet(bVar));
        arrayList.add(new UpdateNonceMethodBullet(bVar));
        arrayList.add(new PrefetchSchemaBulletMethod(bVar));
        return arrayList;
    }

    public final boolean isFallbackContainsUri(Uri uri) {
        l.d(uri, "");
        com.ss.android.ugc.aweme.ecommerce.router.g gVar = this.fallbackInterceptor;
        l.d(uri, "");
        if (gVar.f87164a == null) {
            return false;
        }
        HashMap<String, SchemaFallbackConfig> hashMap = gVar.f87164a;
        if (hashMap == null) {
            l.a("configMap");
        }
        return hashMap.containsKey(com.ss.android.ugc.aweme.ecommerce.router.g.a(uri));
    }

    public final void updateFallbackConfig(Map<String, String> map) {
        l.d(map, "");
        HashMap<String, SchemaFallbackConfig> hashMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new SchemaFallbackConfig(entry.getKey(), entry.getValue()));
        }
        com.ss.android.ugc.aweme.ecommerce.router.g gVar = this.fallbackInterceptor;
        l.d(hashMap, "");
        gVar.f87164a = hashMap;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f84185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f84186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f84187c;

        static {
            Covode.recordClassIndex(52500);
        }

        b(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i2, h.f.a.b bVar) {
            this.f84185a = semiPdpEnterParams;
            this.f84186b = i2;
            this.f84187c = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<ProductPackStruct> list;
            h.f.a.b bVar;
            u uVar = (u) obj;
            if (j.a() > 0) {
                com.ss.android.ugc.aweme.base.m.f68150a.a(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.ECommerceService.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f84188a;

                    static {
                        Covode.recordClassIndex(52501);
                    }

                    {
                        this.f84188a = r1;
                    }

                    public final void run() {
                        com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.a(this.f84188a.f84185a.getRequestParams());
                    }
                }, (long) j.a());
            }
            T t = uVar.f42630b;
            if (t.isCodeOK()) {
                T t2 = t.data;
                ProductBaseEpt productBaseEpt = null;
                if (t2 != null && (list = t2.f86678a) != null && n.h((List) list) != null && (bVar = this.f84187c) != null) {
                    ProductBase productBase = ((ProductPackStruct) n.g((List) t.data.f86678a)).f86641e;
                    if (productBase != null) {
                        productBaseEpt = productBase.a();
                    }
                    bVar.invoke(productBaseEpt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f84191a = new e();

        static {
            Covode.recordClassIndex(52504);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<ProductPackStruct> list;
            z zVar;
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            l.b(aVar, "");
            l.d(aVar, "");
            T t = aVar.data;
            if (!(t == null || (list = t.f86678a) == null)) {
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                for (T t2 : list) {
                    String str = t2.f86638b;
                    if (str != null) {
                        com.ss.android.ugc.aweme.ecommerce.sku.c.f87392b.a(str, t2);
                        zVar = z.f158842a;
                    } else {
                        zVar = null;
                    }
                    arrayList.add(zVar);
                }
            }
        }
    }

    private final void prefetchSkuBatch(String str) {
        com.ss.android.ugc.aweme.ecommerce.ab.n nVar;
        p pVar;
        Boolean bool;
        IPdpStarter.PdpEnterParam schema2EnterParamForSku;
        if (str != null && str.length() != 0 && (nVar = h.b().f84207b) != null && (pVar = nVar.f84238a) != null && (bool = pVar.f84241a) != null && bool.booleanValue()) {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (l.a((Object) parse.getHost(), (Object) "ec") && l.a((Object) parse.getPath(), (Object) "/sku") && (schema2EnterParamForSku = schema2EnterParamForSku(str)) != null) {
                a.C2085a.a().a(schema2EnterParamForSku).a(e.f84191a, f.f84192a);
            }
        }
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParam(String str) {
        Object obj;
        Object obj2;
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (!(!l.a((Object) parse.getHost(), (Object) "ec"))) {
                if (!(!l.a((Object) parse.getPath(), (Object) "/pdp"))) {
                    try {
                        obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(parse.getQueryParameter("requestParams"), HashMap.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    try {
                        obj2 = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(parse.getQueryParameter("trackParams"), HashMap.class);
                    } catch (Exception unused2) {
                        obj2 = null;
                    }
                    HashMap hashMap2 = (HashMap) obj2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (hashMap2 != null) {
                        linkedHashMap.putAll(hashMap2);
                    }
                    linkedHashMap.remove("product_id");
                    linkedHashMap.remove("author_id");
                    if (hashMap2 != null) {
                        hashMap2.put("entrance_info", dg.a().b(linkedHashMap));
                    }
                    return new IPdpStarter.PdpEnterParam(hashMap, null, hashMap2, null, false, 0.0f, null, false, false, false, null, 2032, null);
                }
            }
            return null;
        } catch (Exception unused3) {
            com_ss_android_ugc_aweme_ecommerce_ECommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e("PdpStarterOptimized", "ParseUrl Failed");
            return null;
        }
    }

    private final IPdpStarter.PdpEnterParam schema2EnterParamForSku(String str) {
        Object obj;
        Object obj2;
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (!(!l.a((Object) parse.getHost(), (Object) "ec"))) {
                if (!(!l.a((Object) parse.getPath(), (Object) "/sku"))) {
                    try {
                        obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(parse.getQueryParameter("requestParams"), HashMap.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    try {
                        obj2 = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(parse.getQueryParameter("trackParams"), HashMap.class);
                    } catch (Exception unused2) {
                        obj2 = null;
                    }
                    HashMap hashMap2 = (HashMap) obj2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (hashMap2 != null) {
                        linkedHashMap.putAll(hashMap2);
                    }
                    linkedHashMap.remove("product_id");
                    linkedHashMap.remove("author_id");
                    if (hashMap2 != null) {
                        hashMap2.put("entrance_info", dg.a().b(linkedHashMap));
                    }
                    return new IPdpStarter.PdpEnterParam(hashMap, null, null, null, false, 0.0f, null, false, false, false, null, 2032, null);
                }
            }
            return null;
        } catch (Exception unused3) {
            com_ss_android_ugc_aweme_ecommerce_ECommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e("PdpStarterOptimized", "ParseUrl Failed");
            return null;
        }
    }

    private final SemiPdpStarter.SemiPdpEnterParams schema2SemiEnterParam(String str) {
        Object obj;
        Object obj2;
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (!(!l.a((Object) parse.getHost(), (Object) "ec"))) {
                if (!(!l.a((Object) parse.getPath(), (Object) "/semi_pdp"))) {
                    try {
                        obj = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(parse.getQueryParameter("requestParams"), HashMap.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    HashMap hashMap = (HashMap) obj;
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    try {
                        obj2 = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(parse.getQueryParameter("trackParams"), HashMap.class);
                    } catch (Exception unused2) {
                        obj2 = null;
                    }
                    HashMap hashMap2 = (HashMap) obj2;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (hashMap2 != null) {
                        linkedHashMap.putAll(hashMap2);
                    }
                    linkedHashMap.remove("product_id");
                    linkedHashMap.remove("author_id");
                    if (hashMap2 != null) {
                        hashMap2.put("entrance_info", dg.a().b(linkedHashMap));
                    }
                    return new SemiPdpStarter.SemiPdpEnterParams(hashMap, false, hashMap2);
                }
            }
            return null;
        } catch (Exception unused3) {
            com_ss_android_ugc_aweme_ecommerce_ECommerceService_com_ss_android_ugc_aweme_lancet_LogLancet_e("PdpStarterOptimized", "ParseUrl Failed");
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void postEvent(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        r.a(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void prefetchPdp(String str, Context context) {
        l.d(str, "");
        l.d(str, "");
        prefetchPdp(str, context, 1, null);
    }

    public final void preLinkPdp(String str, Context context) {
        IPdpStarter.PdpEnterParam schema2EnterParam;
        l.d(str, "");
        if (com.ss.android.ugc.aweme.ecommerce.ab.l.a() && (schema2EnterParam = schema2EnterParam(str)) != null) {
            a.C2085a.a().b(schema2EnterParam);
            if ((context instanceof Activity) && !schema2EnterParam.isPromotionPage() && !schema2EnterParam.getFullScreen()) {
                com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a((Activity) context).b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void showThirdpartyDisclaimerTips(Context context, String str) {
        if (context != null && str != null && !(!l.a((Object) "1", (Object) Uri.parse(str).getQueryParameter("outer_ecom_product")))) {
            new Handler(Looper.getMainLooper()).postDelayed(g.f84193a, 1000);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void addJSMethods(com.ss.android.sdk.webview.e eVar, WeakReference<Context> weakReference) {
        if (eVar != null) {
            eVar.a("phoneCountryCodeTranslate", new PhoneCountryCodeTranslateMethod(eVar.f60185b));
            eVar.a("verificationCheck", new VerificationCheckMethod(eVar.f60185b));
            eVar.a("openThirdPartyApp", new OpenThirdPartyAppMethod(eVar.f60185b));
            eVar.a("pipo.getInfoByOcr", new GetInfoByOCRMethod(eVar.f60185b));
            eVar.a("pipo.updateNonce", new UpdateNonceMethod(eVar.f60185b));
            eVar.a("prefetchSchema", new PrefetchSchemaJavaMethod(eVar.f60185b));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void prefetchSchema(String str, Context context) {
        String path;
        if (str != null && str.length() != 0) {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (l.a((Object) parse.getHost(), (Object) "ec") && (path = parse.getPath()) != null) {
                int hashCode = path.hashCode();
                if (hashCode != -2122208806) {
                    if (hashCode != 1511021) {
                        if (hashCode == 1514126 && path.equals("/sku")) {
                            prefetchSkuBatch(str);
                            return;
                        }
                        return;
                    } else if (!path.equals("/pdp")) {
                        return;
                    }
                } else if (!path.equals("/semi_pdp")) {
                    return;
                }
                prefetchPdp(str, context, 3, null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IECommerceService
    public final void prefetchPdp(String str, Context context, int i2, h.f.a.b<? super ProductBaseEpt, z> bVar) {
        SemiPdpStarter.SemiPdpEnterParams schema2SemiEnterParam;
        IPdpStarter.PdpEnterParam schema2EnterParam;
        l.d(str, "");
        if (com.ss.android.ugc.aweme.ecommerce.ab.l.a()) {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (!l.a((Object) parse.getHost(), (Object) "ec")) {
                return;
            }
            if (l.a((Object) parse.getPath(), (Object) "/pdp") || l.a((Object) parse.getPath(), (Object) "/semi_pdp")) {
                if (l.a((Object) parse.getPath(), (Object) "/pdp") && (schema2EnterParam = schema2EnterParam(str)) != null) {
                    a.b.a(a.C2085a.a(), schema2EnterParam, i2, false).f86592c.a(new a(i2, bVar, context), c.f84189a);
                    if ((context instanceof Activity) && !schema2EnterParam.isPromotionPage() && !schema2EnterParam.getFullScreen()) {
                        com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a((Activity) context).b();
                    }
                }
                if (l.a((Object) parse.getPath(), (Object) "/semi_pdp") && (schema2SemiEnterParam = schema2SemiEnterParam(str)) != null) {
                    com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b.a(schema2SemiEnterParam, i2).f87323a.a(new b(schema2SemiEnterParam, i2, bVar), d.f84190a);
                }
            }
        }
    }
}
