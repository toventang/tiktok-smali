package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.google.c.a.s;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.api.AnchorApi;
import com.ss.android.ugc.aweme.api.request.GetItemProductInfoRequest;
import com.ss.android.ugc.aweme.api.resp.EnterContext;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductPriceEpt;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.multi.k;
import com.ss.android.ugc.aweme.multi.viewmodel.ShopWindowAnchorViewModel;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m extends o implements i, j {

    /* renamed from: g  reason: collision with root package name */
    public static final a f110973g = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.multi.ui.c f110974d;

    /* renamed from: e  reason: collision with root package name */
    public ShopWindowAnchorViewModel f110975e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f110976f = true;

    /* renamed from: j  reason: collision with root package name */
    private List<k> f110977j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    private k f110978k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.app.f.d f110979l;

    /* renamed from: m  reason: collision with root package name */
    private int f110980m = 1;
    private final Runnable n = new c(this);

    static {
        Covode.recordClassIndex(71208);
    }

    @Override // com.ss.android.ugc.aweme.multi.a
    public final boolean e() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(157, new org.greenrobot.eventbus.g(m.class, "onEvent", com.ss.android.ugc.aweme.crossplatform.b.b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "webview";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71209);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.multi.d dVar) {
        com.ss.android.ugc.aweme.multi.ui.c cVar;
        l.d(dVar, "");
        if (!n() && (cVar = this.f110974d) != null) {
            String a2 = com.ss.android.ugc.aweme.multi.l.a(cVar.f111044e.b(), cVar.f111048i);
            if (a2 == null) {
                a2 = "video_multi_anchor";
            }
            ICommerceService a3 = com.ss.android.ugc.aweme.commerce.service.a.a();
            com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
            aVar.C = "TEMAI";
            aVar.K = "video_shopping_list";
            aVar.L = "video_multi_anchor";
            aVar.f73498c = cVar.f111044e.b().getAid();
            aVar.K = "video_shopping_list";
            aVar.F = cVar.f111044e.b().isAd() ? cVar.f111044e.b().getAwemeRawAdIdStr() : null;
            aVar.L = "video_multi_anchor";
            aVar.E = cVar.f111044e.b().isAd() ? 1 : 0;
            aVar.f73499d = cVar.f111044e.b().getAuthorUid();
            String c2 = cVar.f111044e.c();
            if (c2 == null) {
                c2 = "";
            }
            aVar.f73497b = c2;
            String authorUid = cVar.f111044e.b().getAuthorUid();
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, "");
            aVar.A = l.a(authorUid, createIUserServicebyMonsterPlugin.getCurrentUserID()) ? 1 : 0;
            aVar.I = com.ss.android.ugc.aweme.base.b.a(cVar.f111044e.b());
            aVar.G = a2;
            aVar.H = "video";
            a3.logCommerceEvents("tiktokec_shopping_list_show", aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(dVar, "");
        d(false);
    }

    public final void a(String str, Long l2, Integer num, List<String> list, Integer num2) {
        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        aVar.C = "TEMAI";
        aVar.f73497b = p();
        aVar.f73499d = o().getAuthorUid();
        aVar.f73498c = o().getAid();
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        aVar.R = b(arrayList);
        aVar.S = num2;
        aVar.T = num;
        aVar.r = String.valueOf(l2);
        aVar.U = str;
        a2.logCommerceEvents("rd_tiktokec_video_shopping_list_request_result", aVar);
    }

    public static final class b implements com.ss.android.ugc.aweme.multi.e {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f110981b;

        static {
            Covode.recordClassIndex(71210);
        }

        @Override // com.ss.android.ugc.aweme.multi.e
        public final String a(String str) {
            l.d(str, "");
            return "";
        }

        @Override // com.ss.android.ugc.aweme.multi.e
        public final String a() {
            return this.f110981b.a(true);
        }

        @Override // com.ss.android.ugc.aweme.multi.e
        public final String b() {
            return this.f110981b.c(true);
        }

        @Override // com.ss.android.ugc.aweme.multi.e
        public final String c() {
            return this.f110981b.b(true);
        }

        @Override // com.ss.android.ugc.aweme.multi.e
        public final String d() {
            return this.f110981b.a(false);
        }

        @Override // com.ss.android.ugc.aweme.multi.e
        public final String e() {
            return this.f110981b.c(false);
        }

        @Override // com.ss.android.ugc.aweme.multi.e
        public final String f() {
            return this.f110981b.b(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(m mVar) {
            this.f110981b = mVar;
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f110982a;

        static {
            Covode.recordClassIndex(71211);
        }

        c(m mVar) {
            this.f110982a = mVar;
        }

        public final void run() {
            this.f110982a.f110976f = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final com.ss.android.ugc.aweme.multi.e b() {
        return new b(this);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final int d() {
        return this.f110977j.size();
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new l();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.ANCHOR_SHOP_MIX.getTYPE();
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ SmartImageView $imageView;

        static {
            Covode.recordClassIndex(71214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SmartImageView smartImageView) {
            super(0);
            this.$imageView = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$imageView.setImageResource(2131232536);
            return z.f158842a;
        }
    }

    private final boolean n() {
        return a().a();
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final String g() {
        if (com.ss.android.ugc.aweme.an.a.a() && a().a()) {
            String string = a().e().getResources().getString(R.string.ewf);
            l.b(string, "");
            return string;
        } else if (!(!this.f110977j.isEmpty())) {
            return super.g();
        } else {
            Integer num = this.f110977j.get(0).f110917e;
            int type = ab.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num != null && num.intValue() == type) {
                String str = this.f110977j.get(0).f110914b.f110927d;
                if (TextUtils.isEmpty(str)) {
                    String str2 = this.f110977j.get(0).f110914b.f110926c;
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                } else if (str == null) {
                    return "";
                } else {
                    return str;
                }
            } else {
                Integer num2 = this.f110977j.get(0).f110917e;
                int type2 = ab.ANCHOR_SHOP_LINK.getTYPE();
                if (num2 != null && num2.intValue() == type2) {
                    return this.f110977j.get(0).f110915c;
                }
                return "";
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final String h() {
        if (!com.ss.android.ugc.aweme.an.a.a() || !a().a()) {
            return null;
        }
        if (!(!this.f110977j.isEmpty())) {
            return super.g();
        }
        Integer num = this.f110977j.get(0).f110917e;
        int type = ab.ANCHOR_SHOP_WINDOW.getTYPE();
        if (num != null && num.intValue() == type) {
            String str = this.f110977j.get(0).f110914b.f110927d;
            if (TextUtils.isEmpty(str)) {
                String str2 = this.f110977j.get(0).f110914b.f110926c;
                if (str2 == null) {
                    return "";
                }
                return str2;
            } else if (str == null) {
                return "";
            } else {
                return str;
            }
        } else {
            Integer num2 = this.f110977j.get(0).f110917e;
            int type2 = ab.ANCHOR_SHOP_LINK.getTYPE();
            if (num2 != null && num2.intValue() == type2) {
                return this.f110977j.get(0).f110915c;
            }
            return "";
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<List<k>, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f110983a = new d();

        static {
            Covode.recordClassIndex(71212);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(List<k> list) {
            return a(list);
        }

        public static String a(List<k> list) {
            l.d(list, "");
            if (list.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            int size = list.size() - 1;
            for (int i2 = 0; i2 < size; i2++) {
                sb.append(list.get(i2).f110917e);
                sb.append(",");
            }
            sb.append(((k) n.i((List) list)).f110917e);
            return sb.toString();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void a(SmartImageView smartImageView) {
        l.d(smartImageView, "");
        a(smartImageView, new f(smartImageView));
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(dVar, "");
        if (this.f110976f) {
            this.f110976f = false;
            com.ss.android.ugc.aweme.base.utils.m.a(this.n, 300);
            d(true);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<ProductBaseEpt, z> {
        final /* synthetic */ k $anchor$inlined;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(71215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m mVar, k kVar) {
            super(1);
            this.this$0 = mVar;
            this.$anchor$inlined = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ProductBaseEpt productBaseEpt) {
            String str;
            RecyclerView a2;
            RecyclerView.a adapter;
            ProductBaseEpt productBaseEpt2 = productBaseEpt;
            if (!this.this$0.a().a()) {
                com.ss.android.ugc.aweme.multi.m mVar = this.$anchor$inlined.f110914b;
                if (productBaseEpt2 != null) {
                    ProductPriceEpt productPriceEpt = productBaseEpt2.f87355d;
                    if (productPriceEpt == null || (str = productPriceEpt.f87357b) == null) {
                        ProductPriceEpt productPriceEpt2 = productBaseEpt2.f87355d;
                        if (productPriceEpt2 != null) {
                            str = productPriceEpt2.f87356a;
                        }
                    }
                    mVar.f110929f = str;
                    com.ss.android.ugc.aweme.multi.ui.c cVar = this.this$0.f110974d;
                    if (!(cVar == null || (a2 = cVar.a()) == null || (adapter = a2.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                }
                str = null;
                mVar.f110929f = str;
                com.ss.android.ugc.aweme.multi.ui.c cVar2 = this.this$0.f110974d;
                adapter.notifyDataSetChanged();
            }
            return z.f158842a;
        }
    }

    private static String b(List<String> list) {
        l.d(list, "");
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size() - 1;
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(list.get(i2));
            sb.append(",");
        }
        sb.append((String) n.i((List) list));
        return sb.toString();
    }

    private final List<String> a(int i2) {
        ArrayList arrayList = new ArrayList();
        List<k> list = this.f110977j;
        ArrayList<k> arrayList2 = new ArrayList();
        for (T t : list) {
            Integer num = t.f110914b.o;
            if (num != null && num.intValue() == i2) {
                arrayList2.add(t);
            }
        }
        for (k kVar : arrayList2) {
            arrayList.add(String.valueOf(kVar.f110914b.f110925b));
        }
        return arrayList;
    }

    public final String b(boolean z) {
        String str;
        boolean z2;
        Iterator<k> it = this.f110977j.iterator();
        String str2 = "";
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                str = new JSONObject(it.next().f110919g).optString("anchor_name");
            } catch (Exception unused) {
                k kVar = this.f110978k;
                if (kVar != null) {
                    str = kVar.f110915c;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            l.b(str, "");
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    str2 = str2 + str;
                    break;
                }
                str2 = str2 + str + ',';
            }
        }
        return p.b(str2, (CharSequence) ",");
    }

    /* access modifiers changed from: package-private */
    public static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f110984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f110985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f110986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Map f110987d;

        static {
            Covode.recordClassIndex(71213);
        }

        e(m mVar, long j2, List list, Map map) {
            this.f110984a = mVar;
            this.f110985b = j2;
            this.f110986c = list;
            this.f110987d = map;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            BaseResponse.ServerTimeExtra serverTimeExtra;
            List<com.ss.android.ugc.aweme.multi.m> list;
            String str;
            com.ss.android.ugc.aweme.multi.j jVar;
            com.ss.android.ugc.aweme.multi.j jVar2;
            l.b(iVar, "");
            com.ss.android.ugc.aweme.api.resp.d dVar = (com.ss.android.ugc.aweme.api.resp.d) iVar.d();
            Integer num = null;
            if (dVar != null && dVar.status_code == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                com.ss.android.ugc.aweme.api.resp.e eVar = ((com.ss.android.ugc.aweme.api.resp.d) iVar.d()).f66475a;
                if (!(eVar == null || (list = eVar.f66476a) == null)) {
                    for (T t : list) {
                        String valueOf = String.valueOf(t.f110925b);
                        com.ss.android.ugc.aweme.multi.i iVar2 = t.p;
                        if (iVar2 == null || (jVar2 = iVar2.f110910a) == null || (str = jVar2.f110912b) == null) {
                            com.ss.android.ugc.aweme.multi.i iVar3 = t.p;
                            str = (iVar3 == null || (jVar = iVar3.f110910a) == null) ? null : jVar.f110911a;
                        }
                        linkedHashMap.put(valueOf, str);
                    }
                }
                ShopWindowAnchorViewModel shopWindowAnchorViewModel = this.f110984a.f110975e;
                if (shopWindowAnchorViewModel != null) {
                    l.d(linkedHashMap, "");
                    shopWindowAnchorViewModel.f111073a.setValue(linkedHashMap);
                }
            }
            m mVar = this.f110984a;
            com.ss.android.ugc.aweme.api.resp.d dVar2 = (com.ss.android.ugc.aweme.api.resp.d) iVar.d();
            String str2 = (dVar2 == null || (serverTimeExtra = dVar2.extra) == null) ? null : serverTimeExtra.logid;
            Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - this.f110985b);
            com.ss.android.ugc.aweme.api.resp.d dVar3 = (com.ss.android.ugc.aweme.api.resp.d) iVar.d();
            if (dVar3 != null) {
                num = Integer.valueOf(dVar3.status_code);
            }
            List<String> list2 = this.f110986c;
            for (Map.Entry entry : this.f110987d.entrySet()) {
                Integer reqType = ((EnterContext) entry.getValue()).getReqType();
                if (reqType != null) {
                    mVar.a(str2, valueOf2, num, list2, reqType);
                    return z.f158842a;
                }
            }
            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
        }
    }

    private final List<k> c(AnchorCommonStruct anchorCommonStruct) {
        Exception e2;
        boolean z;
        ArrayList arrayList = new ArrayList();
        String extra = anchorCommonStruct.getExtra();
        try {
            JSONArray jSONArray = new JSONArray(extra);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String optString = jSONObject.optString("extra");
                com.ss.android.ugc.aweme.multi.m mVar = new com.ss.android.ugc.aweme.multi.m();
                l.b(optString, "");
                if (optString.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Object a2 = new com.google.gson.f().a(optString, com.ss.android.ugc.aweme.multi.m.class);
                    l.b(a2, "");
                    mVar = (com.ss.android.ugc.aweme.multi.m) a2;
                }
                String optString2 = jSONObject.optString("keyword");
                l.b(optString2, "");
                String optString3 = jSONObject.optString("id");
                l.b(optString3, "");
                Integer valueOf = Integer.valueOf(jSONObject.optInt(StringSet.type));
                Integer valueOf2 = Integer.valueOf(jSONObject.optInt("platform"));
                String optString4 = jSONObject.optString("log_extra");
                l.b(optString4, "");
                String optString5 = jSONObject.optString("schema");
                l.b(optString5, "");
                arrayList.add(new k(optString, mVar, optString2, optString3, valueOf, valueOf2, optString4, optString5));
            }
            try {
                this.f110978k = (k) n.h((List) arrayList);
                return arrayList;
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Exception e4) {
            e2 = e4;
            r.a("rd_tiktokec_shop_anchor_exception", new com.ss.android.ugc.aweme.app.f.d().a("e_stack_trace", s.b(e2)).a("extra_data", "anchor.extra : ".concat(String.valueOf(extra))).a("where", "ShopWindowAnchorMaker").f66730a);
            return new ArrayList();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final void b(AnchorCommonStruct anchorCommonStruct) {
        l.d(anchorCommonStruct, "");
        super.b(anchorCommonStruct);
        if (this.f110977j.isEmpty()) {
            this.f110977j = c(anchorCommonStruct);
        }
        List<k> list = this.f110977j;
        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        aVar.C = "TEMAI";
        aVar.H = "video";
        aVar.f73497b = p();
        aVar.f73499d = o().getAuthorUid();
        aVar.f73498c = o().getAid();
        aVar.P = d.a(list);
        aVar.Q = Integer.valueOf(list.size());
        aVar.f73500e = o().getRequestId();
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().f110914b.f110925b));
        }
        aVar.R = b(arrayList);
        a2.logCommerceEvents("rd_tiktokec_video_anchor_data_get", aVar);
    }

    private final void c(List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (true) {
            T t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Iterator<T> it2 = this.f110977j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (l.a((Object) String.valueOf(next2.f110914b.f110925b), (Object) next)) {
                    t = next2;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                Integer num = t2.f110914b.o;
                int i2 = 2;
                if (num != null) {
                    if (num.intValue() != 1) {
                        if (num.intValue() == 2) {
                            i2 = 1;
                        }
                    }
                    linkedHashMap.put(next, new EnterContext(Integer.valueOf(i2), o().getGroupId()));
                }
                i2 = 0;
                linkedHashMap.put(next, new EnterContext(Integer.valueOf(i2), o().getGroupId()));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Integer reqType = ((EnterContext) entry.getValue()).getReqType();
            if (reqType != null) {
                a(list, reqType);
                AnchorApi.a(new GetItemProductInfoRequest(list, o().getAuthorUid(), linkedHashMap)).a(new e(this, SystemClock.elapsedRealtime(), list, linkedHashMap), b.i.f4826c, null);
                return;
            }
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(com.ss.android.ugc.aweme.crossplatform.b.b bVar) {
        Integer num;
        String str;
        String str2;
        com.ss.android.ugc.aweme.multi.m mVar;
        com.ss.android.ugc.aweme.multi.m mVar2;
        com.ss.android.ugc.aweme.multi.m mVar3;
        String str3 = "";
        l.d(bVar, str3);
        k kVar = this.f110978k;
        if (kVar != null) {
            com.ss.android.ugc.aweme.multi.b a2 = a();
            String c2 = a2.c();
            Aweme b2 = a2.b();
            com.ss.android.ugc.aweme.app.f.d dVar = this.f110979l;
            if (dVar == null) {
                dVar = new com.ss.android.ugc.aweme.app.f.d();
            }
            l.b(dVar, str3);
            com.ss.android.ugc.aweme.app.f.d a3 = a(dVar, kVar).a("enter_from", c2).a("anchor_entry", kVar.f110915c);
            String authorUid = b2.getAuthorUid();
            if (authorUid == null) {
                authorUid = str3;
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", authorUid);
            String aid = b2.getAid();
            if (aid == null) {
                aid = str3;
            }
            r.a("multi_anchor_stay_time", a4.a("group_id", aid).a("duration", String.valueOf(bVar.f78592a)).a("music_id", ac.d(b2)).f66730a);
            ICommerceService a5 = com.ss.android.ugc.aweme.commerce.service.a.a();
            com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
            String p = p();
            if (p != null) {
                str3 = p;
            }
            aVar.f73497b = str3;
            aVar.f73499d = o().getAuthorUid();
            aVar.f73498c = o().getAid();
            aVar.q = b().b();
            aVar.r = String.valueOf(bVar.f78592a);
            k kVar2 = this.f110978k;
            String str4 = null;
            if (kVar2 == null || (mVar3 = kVar2.f110914b) == null) {
                num = null;
            } else {
                num = mVar3.f110932i;
            }
            aVar.y = String.valueOf(num);
            k kVar3 = this.f110978k;
            if (kVar3 == null || (mVar2 = kVar3.f110914b) == null) {
                str = null;
            } else {
                str = mVar2.f110935l;
            }
            aVar.w = str;
            k kVar4 = this.f110978k;
            if (!(kVar4 == null || (mVar = kVar4.f110914b) == null)) {
                str4 = mVar.f110934k;
            }
            aVar.x = str4;
            aVar.u = "video";
            aVar.v = "video_cart_tag";
            aVar.I = com.ss.android.ugc.aweme.base.b.a(o());
            if (a().a()) {
                str2 = "video_single_anchor";
            } else {
                str2 = "video_multi_anchor";
            }
            aVar.G = str2;
            aVar.H = "video";
            a5.logCommerceEvents("product_stay_time", aVar);
        }
        EventBus.a().b(this);
    }

    private final void d(boolean z) {
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        Integer num;
        String str2;
        com.ss.android.ugc.aweme.multi.m mVar;
        com.ss.android.ugc.aweme.multi.m mVar2;
        com.ss.android.ugc.aweme.multi.m mVar3;
        Integer num2;
        if (z) {
            com.ss.android.ugc.aweme.app.f.d dVar = this.f110979l;
            if (dVar != null) {
                o.a(this, dVar, false, false, 2);
            }
            this.f110979l = this.f110979l;
        }
        k kVar = this.f110978k;
        if (kVar != null) {
            if (z && o().isAd()) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("anchor_detail", "otherclick", o().getAwemeRawAd()).b("refer", "shop_anchor").b();
            }
            String a2 = com.ss.android.ugc.aweme.multi.l.a(o(), z);
            String str3 = "video_single_anchor";
            if (a2 == null) {
                if (a().a()) {
                    a2 = str3;
                } else {
                    a2 = "video_multi_anchor";
                }
            }
            if (hl.a(kVar.f110914b.f110933j)) {
                Integer num3 = kVar.f110917e;
                int type = ab.ANCHOR_SHOP_WINDOW.getTYPE();
                if (num3 != null && num3.intValue() == type && (num2 = kVar.f110914b.f110932i) != null && num2.intValue() == 100) {
                    com.ss.android.ugc.aweme.multi.l.a(r(), kVar, o(), a().c(), a2, z);
                } else {
                    SmartRouter.buildRoute(r(), com.ss.android.ugc.aweme.multi.l.a(kVar, o(), a().c(), a2, z)).open();
                }
            } else {
                Integer num4 = kVar.f110917e;
                int type2 = ab.ANCHOR_SHOP_WINDOW.getTYPE();
                String str4 = null;
                String str5 = "";
                if (num4 != null && num4.intValue() == type2) {
                    str = kVar.f110914b.f110936m;
                    String str6 = kVar.f110914b.f110936m;
                    if (str6 == null) {
                        str6 = str5;
                    }
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(r(), str6, str5);
                    EventBus.a(EventBus.a(), this);
                    Activity r = r();
                    com.ss.android.ugc.aweme.multi.b a3 = a();
                    if (r instanceof androidx.lifecycle.m) {
                        ((androidx.lifecycle.m) r).getLifecycle().a(new ShopWindowAnchorMaker$whenShopWindowAnchorClicked$1());
                    }
                    com.ss.android.ugc.aweme.app.f.d dVar2 = new com.ss.android.ugc.aweme.app.f.d();
                    l.b(dVar2, str5);
                    com.ss.android.ugc.aweme.app.f.d a4 = a(dVar2, kVar);
                    com.ss.android.ugc.aweme.app.f.d dVar3 = this.f110979l;
                    if (dVar3 == null || (map = dVar3.f66730a) == null) {
                        map = ag.a();
                    }
                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a(new HashMap<>(map)).a("enter_from", a3.c()).a("anchor_entry", kVar.f110915c);
                    String authorUid = a3.b().getAuthorUid();
                    if (authorUid == null) {
                        authorUid = str5;
                    }
                    com.ss.android.ugc.aweme.app.f.d a6 = a5.a("author_id", authorUid);
                    String aid = a3.b().getAid();
                    if (aid == null) {
                        aid = str5;
                    }
                    r.a("enter_multi_anchor_detail", a6.a("group_id", aid).a("music_id", ac.d(a3.b())).a("click_type", "webview").f66730a);
                    com.ss.android.ugc.aweme.app.f.d dVar4 = this.f110979l;
                    if (dVar4 == null) {
                        com.ss.android.ugc.aweme.app.f.d dVar5 = new com.ss.android.ugc.aweme.app.f.d();
                        l.b(dVar5, str5);
                        dVar4 = a(dVar5, kVar);
                    }
                    com.ss.android.ugc.aweme.app.f.d a7 = dVar4.a("enter_from", a3.c()).a("anchor_entry", kVar.f110915c);
                    String authorUid2 = a3.b().getAuthorUid();
                    if (authorUid2 == null) {
                        authorUid2 = str5;
                    }
                    com.ss.android.ugc.aweme.app.f.d a8 = a7.a("author_id", authorUid2);
                    String aid2 = a3.b().getAid();
                    if (aid2 == null) {
                        aid2 = str5;
                    }
                    r.a("multi_anchor_entrance_click", a8.a("group_id", aid2).a("music_id", ac.d(a3.b())).f66730a);
                } else {
                    str = null;
                }
                Integer num5 = kVar.f110917e;
                int type3 = ab.ANCHOR_SHOP_LINK.getTYPE();
                if (num5 != null && num5.intValue() == type3) {
                    str = kVar.f110920h;
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(r(), kVar.f110920h, str5);
                    EventBus.a(EventBus.a(), this);
                    Activity r2 = r();
                    com.ss.android.ugc.aweme.multi.b a9 = a();
                    if (r2 instanceof androidx.lifecycle.m) {
                        ((androidx.lifecycle.m) r2).getLifecycle().a(new ShopWindowAnchorMaker$whenShopLinkAnchorClicked$1());
                    }
                    com.ss.android.ugc.aweme.app.f.d dVar6 = new com.ss.android.ugc.aweme.app.f.d();
                    l.b(dVar6, str5);
                    com.ss.android.ugc.aweme.app.f.d a10 = a(dVar6, kVar);
                    com.ss.android.ugc.aweme.app.f.d dVar7 = this.f110979l;
                    if (dVar7 == null || (map2 = dVar7.f66730a) == null) {
                        map2 = ag.a();
                    }
                    com.ss.android.ugc.aweme.app.f.d a11 = a10.a(new HashMap<>(map2)).a("enter_from", a9.c()).a("anchor_entry", kVar.f110915c);
                    String authorUid3 = a9.b().getAuthorUid();
                    if (authorUid3 == null) {
                        authorUid3 = str5;
                    }
                    com.ss.android.ugc.aweme.app.f.d a12 = a11.a("author_id", authorUid3);
                    String aid3 = a9.b().getAid();
                    if (aid3 == null) {
                        aid3 = str5;
                    }
                    r.a("enter_multi_anchor_detail", a12.a("group_id", aid3).a("music_id", ac.d(a9.b())).a("click_type", "webview").f66730a);
                    com.ss.android.ugc.aweme.app.f.d dVar8 = this.f110979l;
                    if (dVar8 == null) {
                        com.ss.android.ugc.aweme.app.f.d dVar9 = new com.ss.android.ugc.aweme.app.f.d();
                        l.b(dVar9, str5);
                        dVar8 = a(dVar9, kVar);
                    }
                    com.ss.android.ugc.aweme.app.f.d a13 = dVar8.a("enter_from", a9.c()).a("anchor_entry", kVar.f110915c);
                    String authorUid4 = a9.b().getAuthorUid();
                    if (authorUid4 == null) {
                        authorUid4 = str5;
                    }
                    com.ss.android.ugc.aweme.app.f.d a14 = a13.a("author_id", authorUid4);
                    String aid4 = a9.b().getAid();
                    if (aid4 == null) {
                        aid4 = str5;
                    }
                    r.a("multi_anchor_entrance_click", a14.a("group_id", aid4).a("music_id", ac.d(a9.b())).f66730a);
                }
                ECommerceService.createIECommerceServicebyMonsterPlugin(false).showThirdpartyDisclaimerTips(r(), str);
                ICommerceService a15 = com.ss.android.ugc.aweme.commerce.service.a.a();
                com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
                String p = p();
                if (p != null) {
                    str5 = p;
                }
                aVar.f73497b = str5;
                aVar.f73499d = o().getAuthorUid();
                aVar.f73498c = o().getAid();
                aVar.q = b().b();
                aVar.u = "video";
                aVar.v = "video_cart_tag";
                k kVar2 = this.f110978k;
                if (kVar2 == null || (mVar3 = kVar2.f110914b) == null) {
                    num = null;
                } else {
                    num = mVar3.f110932i;
                }
                aVar.y = String.valueOf(num);
                k kVar3 = this.f110978k;
                if (kVar3 == null || (mVar2 = kVar3.f110914b) == null) {
                    str2 = null;
                } else {
                    str2 = mVar2.f110935l;
                }
                aVar.w = str2;
                k kVar4 = this.f110978k;
                if (!(kVar4 == null || (mVar = kVar4.f110914b) == null)) {
                    str4 = mVar.f110934k;
                }
                aVar.x = str4;
                aVar.I = com.ss.android.ugc.aweme.base.b.a(o());
                if (!a().a()) {
                    str3 = "video_multi_anchor";
                }
                aVar.G = str3;
                aVar.H = "video";
                a15.logCommerceEvents("enter_product_detail", aVar);
            }
        }
    }

    public final String a(boolean z) {
        String str;
        boolean z2;
        String str2 = "";
        for (k kVar : this.f110977j) {
            try {
                str = new JSONObject(kVar.f110919g).optString("anchor_id");
            } catch (Exception unused) {
                k kVar2 = this.f110978k;
                if (kVar2 != null) {
                    str = kVar2.f110916d;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            l.b(str, "");
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str2 = str2 + str + ',';
                continue;
            }
            if (z) {
                break;
            }
        }
        return p.b(str2, (CharSequence) ",");
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(com.ss.android.ugc.aweme.app.f.d dVar) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        Integer num2;
        Integer num3;
        String str5;
        String str6;
        Long l2;
        Integer num4;
        String str7;
        com.ss.android.ugc.aweme.multi.m mVar;
        com.ss.android.ugc.aweme.multi.m mVar2;
        com.ss.android.ugc.aweme.multi.m mVar3;
        com.ss.android.ugc.aweme.multi.m mVar4;
        com.ss.android.ugc.aweme.multi.m mVar5;
        com.ss.android.ugc.aweme.multi.m mVar6;
        com.ss.android.ugc.aweme.multi.m mVar7;
        String str8 = "";
        l.d(dVar, str8);
        super.b(dVar);
        int i2 = 0;
        String str9 = null;
        if (!n()) {
            Activity e2 = a().e();
            if (this.f110975e == null && (e2 instanceof androidx.fragment.app.e)) {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) e2;
                l.d(eVar, str8);
                androidx.lifecycle.ac a2 = ae.a(eVar, (ad.b) null).a(ShopWindowAnchorViewModel.class);
                l.b(a2, str8);
                this.f110975e = (ShopWindowAnchorViewModel) a2;
            }
            List<String> a3 = a(1);
            if (a3.size() > 0) {
                this.f110980m = 2;
                c(a3);
            }
        }
        Iterator<k> it = this.f110977j.iterator();
        while (true) {
            str = "video_single_anchor";
            if (!it.hasNext()) {
                break;
            }
            k next = it.next();
            if (com.bytedance.android.livesdk.utils.p.a(next.f110914b.n) && hk.a(next.f110914b.f110933j)) {
                Aweme o = o();
                String c2 = a().c();
                if (!a().a()) {
                    str = "video_multi_anchor";
                }
                String a4 = com.ss.android.ugc.aweme.multi.l.a(next, o, c2, str, true);
                if (a4 != null) {
                    ECommerceService.createIECommerceServicebyMonsterPlugin(false).prefetchPdp(a4, r(), 2, new g(this, next));
                }
            }
        }
        ICommerceService a5 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        String p = p();
        if (p == null) {
            p = str8;
        }
        aVar.f73497b = p;
        aVar.f73499d = o().getAuthorUid();
        aVar.f73498c = o().getAid();
        aVar.q = b().b();
        aVar.u = "video";
        aVar.v = "video_cart_tag";
        k kVar = this.f110978k;
        if (kVar == null || (mVar7 = kVar.f110914b) == null) {
            num = null;
        } else {
            num = mVar7.f110932i;
        }
        aVar.y = String.valueOf(num);
        k kVar2 = this.f110978k;
        if (kVar2 == null || (mVar6 = kVar2.f110914b) == null) {
            str2 = null;
        } else {
            str2 = mVar6.f110935l;
        }
        aVar.w = str2;
        k kVar3 = this.f110978k;
        if (kVar3 == null || (mVar5 = kVar3.f110914b) == null) {
            str3 = null;
        } else {
            str3 = mVar5.f110934k;
        }
        aVar.x = str3;
        aVar.I = com.ss.android.ugc.aweme.base.b.a(o());
        if (a().a()) {
            str4 = str;
        } else {
            str4 = "video_multi_anchor";
        }
        aVar.G = str4;
        aVar.H = "video";
        if (o().isAd()) {
            num2 = 1;
        } else {
            num2 = 0;
        }
        aVar.E = num2;
        a5.logCommerceEvents("product_anchor_show", aVar);
        ICommerceService a6 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar2 = new com.ss.android.ugc.aweme.commerce.service.a.a();
        aVar2.C = "TEMAI";
        aVar2.f73498c = o().getAid();
        aVar2.f73499d = o().getAuthorUid();
        aVar2.f73500e = o().getRequestId();
        String p2 = p();
        if (p2 == null) {
            p2 = str8;
        }
        aVar2.f73497b = p2;
        aVar2.v = "video_cart_tag";
        k kVar4 = (k) n.h((List) this.f110977j);
        if (kVar4 == null || (mVar4 = kVar4.f110914b) == null) {
            num3 = null;
        } else {
            num3 = mVar4.f110932i;
        }
        aVar2.y = String.valueOf(num3);
        k kVar5 = (k) n.h((List) this.f110977j);
        if (kVar5 == null || (mVar3 = kVar5.f110914b) == null) {
            str5 = null;
        } else {
            str5 = mVar3.f110934k;
        }
        aVar2.x = str5;
        k kVar6 = (k) n.h((List) this.f110977j);
        if (kVar6 == null || (mVar2 = kVar6.f110914b) == null) {
            str6 = null;
        } else {
            str6 = mVar2.f110935l;
        }
        aVar2.w = str6;
        k kVar7 = (k) n.h((List) this.f110977j);
        if (kVar7 == null || (mVar = kVar7.f110914b) == null) {
            l2 = null;
        } else {
            l2 = mVar.f110925b;
        }
        aVar2.z = String.valueOf(l2);
        String authorUid = o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        l.b(createIUserServicebyMonsterPlugin, str8);
        if (l.a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            num4 = 1;
        } else {
            num4 = 0;
        }
        aVar2.A = num4;
        if (a().a()) {
            str7 = "yes";
        } else {
            str7 = "no";
        }
        aVar2.B = str7;
        if (o().isAd()) {
            i2 = 1;
        }
        aVar2.E = i2;
        if (o().isAd()) {
            str9 = o().getAwemeRawAdIdStr();
        }
        aVar2.F = str9;
        aVar2.I = com.ss.android.ugc.aweme.base.b.a(o());
        if (!a().a()) {
            str = "video_multi_anchor";
        }
        aVar2.G = str;
        aVar2.H = "video";
        aVar2.f73496a = com.ss.android.ugc.aweme.multi.l.a(o(), "tiktok_video_anchor_view", aVar2.f73497b);
        if (com.ss.android.ugc.aweme.an.a.a() && a().a()) {
            str8 = "SHOP NOW";
        }
        aVar2.J = str8;
        a6.logCommerceEvents("tiktok_video_anchor_view", aVar2);
        if (o().isAd()) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", o().getAwemeRawAd()).b("refer", "shop_anchor").b();
        }
    }

    public final String c(boolean z) {
        String str;
        Integer num;
        Iterator<k> it = this.f110977j.iterator();
        String str2 = "";
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            boolean z2 = true;
            try {
                str = new JSONObject(it.next().f110919g).optString("anchor_type");
                l.b(str, "");
            } catch (Exception unused) {
                k kVar = this.f110978k;
                Integer num2 = null;
                if (kVar != null) {
                    num = kVar.f110918f;
                } else {
                    num = null;
                }
                if (num == null || num.intValue() != 1) {
                    k kVar2 = this.f110978k;
                    if (kVar2 != null) {
                        num2 = kVar2.f110918f;
                    }
                    if (num2 == null || num2.intValue() != 0) {
                        str = "";
                    }
                }
                str = "shopify";
            }
            if (str.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    str2 = str2 + str;
                    break;
                }
                str2 = str2 + str + ',';
            }
        }
        return p.b(str2, (CharSequence) ",");
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(com.ss.android.ugc.aweme.app.f.d dVar) {
        Integer num;
        String str;
        String str2;
        Long l2;
        Integer num2;
        String str3;
        String str4;
        String str5;
        com.ss.android.ugc.aweme.multi.m mVar;
        com.ss.android.ugc.aweme.multi.m mVar2;
        com.ss.android.ugc.aweme.multi.m mVar3;
        com.ss.android.ugc.aweme.multi.m mVar4;
        String str6 = "";
        l.d(dVar, str6);
        super.c(dVar);
        int i2 = 1;
        String str7 = null;
        if (!n()) {
            List<String> a2 = a(2);
            if (a2.size() > 0) {
                this.f110980m = 2;
                c(a2);
            }
        }
        ICommerceService a3 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        aVar.C = "TEMAI";
        aVar.f73498c = o().getAid();
        aVar.f73499d = o().getAuthorUid();
        aVar.f73500e = o().getRequestId();
        String p = p();
        if (p == null) {
            p = str6;
        }
        aVar.f73497b = p;
        aVar.v = "video_cart_tag";
        k kVar = (k) n.h((List) this.f110977j);
        if (kVar == null || (mVar4 = kVar.f110914b) == null) {
            num = null;
        } else {
            num = mVar4.f110932i;
        }
        aVar.y = String.valueOf(num);
        k kVar2 = (k) n.h((List) this.f110977j);
        if (kVar2 == null || (mVar3 = kVar2.f110914b) == null) {
            str = null;
        } else {
            str = mVar3.f110934k;
        }
        aVar.x = str;
        k kVar3 = (k) n.h((List) this.f110977j);
        if (kVar3 == null || (mVar2 = kVar3.f110914b) == null) {
            str2 = null;
        } else {
            str2 = mVar2.f110935l;
        }
        aVar.w = str2;
        k kVar4 = (k) n.h((List) this.f110977j);
        if (kVar4 == null || (mVar = kVar4.f110914b) == null) {
            l2 = null;
        } else {
            l2 = mVar.f110925b;
        }
        aVar.z = String.valueOf(l2);
        String authorUid = o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        l.b(createIUserServicebyMonsterPlugin, str6);
        if (l.a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            num2 = 1;
        } else {
            num2 = 0;
        }
        aVar.A = num2;
        if (a().a()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        aVar.B = str3;
        if (!o().isAd()) {
            i2 = 0;
        }
        aVar.E = i2;
        if (o().isAd()) {
            str7 = o().getAwemeRawAdIdStr();
        }
        aVar.F = str7;
        aVar.I = com.ss.android.ugc.aweme.base.b.a(o());
        if (a().a()) {
            str4 = "video_single_anchor";
        } else {
            str4 = "video_multi_anchor";
        }
        aVar.G = str4;
        aVar.H = "video";
        aVar.f73496a = com.ss.android.ugc.aweme.multi.l.a(o(), "tiktok_video_anchor_click", aVar.f73497b);
        if (com.ss.android.ugc.aweme.an.a.a() && a().a()) {
            str6 = "SHOP NOW";
        }
        aVar.J = str6;
        a3.logCommerceEvents("tiktok_video_anchor_click", aVar);
        if (o().isAd()) {
            AwemeRawAd awemeRawAd = o().getAwemeRawAd();
            if (awemeRawAd == null || awemeRawAd.getAnchorClickType() != 2) {
                str5 = "otherclick";
            } else {
                str5 = "click";
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", str5, o().getAwemeRawAd()).b("refer", "shop_anchor").b();
        }
    }

    private static com.ss.android.ugc.aweme.app.f.d a(com.ss.android.ugc.aweme.app.f.d dVar, k kVar) {
        String str = kVar.f110919g;
        if (str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                l.b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                        dVar.a(next, str2);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return dVar;
    }

    private final void a(List<String> list, Integer num) {
        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
        com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
        aVar.C = "TEMAI";
        aVar.f73497b = p();
        aVar.f73499d = o().getAuthorUid();
        aVar.f73498c = o().getAid();
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        aVar.R = b(arrayList);
        aVar.S = num;
        a2.logCommerceEvents("rd_tiktokec_video_shopping_list_request_send", aVar);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(Activity activity, Dialog dialog) {
        String str;
        String str2;
        int i2;
        int i3;
        l.d(activity, "");
        l.d(dialog, "");
        if (l.a((Object) r().getLocalClassName(), (Object) activity.getLocalClassName()) && !n()) {
            long j2 = -1;
            if (this.f110995i != -1) {
                j2 = this.f110995i;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else if (dialog.isShowing()) {
                str = "next";
            } else {
                str = "return";
            }
            com.ss.android.ugc.aweme.multi.ui.c cVar = this.f110974d;
            if (cVar != null) {
                String a2 = com.ss.android.ugc.aweme.multi.l.a(cVar.f111044e.b(), cVar.f111048i);
                if (a2 == null) {
                    a2 = "video_multi_anchor";
                }
                ICommerceService a3 = com.ss.android.ugc.aweme.commerce.service.a.a();
                com.ss.android.ugc.aweme.commerce.service.a.a aVar = new com.ss.android.ugc.aweme.commerce.service.a.a();
                aVar.C = "TEMAI";
                aVar.f73498c = cVar.f111044e.b().getAid();
                aVar.K = "video_shopping_list";
                if (cVar.f111044e.b().isAd()) {
                    str2 = cVar.f111044e.b().getAwemeRawAdIdStr();
                } else {
                    str2 = null;
                }
                aVar.F = str2;
                aVar.L = "video_multi_anchor";
                if (cVar.f111044e.b().isAd()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                aVar.E = i2;
                aVar.f73499d = cVar.f111044e.b().getAuthorUid();
                String c2 = cVar.f111044e.c();
                if (c2 == null) {
                    c2 = "";
                }
                aVar.f73497b = c2;
                String authorUid = cVar.f111044e.b().getAuthorUid();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                l.b(createIUserServicebyMonsterPlugin, "");
                if (l.a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                aVar.A = i3;
                aVar.I = com.ss.android.ugc.aweme.base.b.a(cVar.f111044e.b());
                aVar.G = a2;
                aVar.H = "video";
                aVar.M = Integer.valueOf((int) elapsedRealtime);
                aVar.N = Integer.valueOf(cVar.f111040a);
                aVar.O = str;
                a3.logCommerceEvents("tiktokec_shopping_list_staytime", aVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.a
    public final void a(ViewGroup viewGroup, Dialog dialog, com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        a(viewGroup, dVar, false);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(ViewGroup viewGroup, Dialog dialog, com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        a(viewGroup, dVar, true);
    }

    private final void a(ViewGroup viewGroup, com.ss.android.ugc.aweme.app.f.d dVar, boolean z) {
        t<Map<String, String>> tVar;
        ShopWindowAnchorViewModel shopWindowAnchorViewModel;
        t<Map<String, String>> tVar2;
        ShopWindowAnchorViewModel shopWindowAnchorViewModel2;
        t<Map<String, String>> tVar3;
        MethodCollector.i(7247);
        if (this.f110994h != null) {
            if (!(this.f110974d == null || (shopWindowAnchorViewModel = this.f110975e) == null || (tVar2 = shopWindowAnchorViewModel.f111073a) == null || !tVar2.hasObservers() || (shopWindowAnchorViewModel2 = this.f110975e) == null || (tVar3 = shopWindowAnchorViewModel2.f111073a) == null)) {
                com.ss.android.ugc.aweme.multi.ui.c cVar = this.f110974d;
                if (cVar == null) {
                    l.b();
                }
                tVar3.removeObserver(cVar);
            }
            com.ss.android.ugc.aweme.multi.b a2 = a();
            Context context = viewGroup.getContext();
            l.b(context, "");
            this.f110974d = new com.ss.android.ugc.aweme.multi.ui.c(a2, context, this.f110977j, dVar, z, this.f110980m);
            ShopWindowAnchorViewModel shopWindowAnchorViewModel3 = this.f110975e;
            if (!(shopWindowAnchorViewModel3 == null || (tVar = shopWindowAnchorViewModel3.f111073a) == null)) {
                com.ss.android.ugc.aweme.multi.ui.c cVar2 = this.f110974d;
                if (cVar2 == null) {
                    l.b();
                }
                tVar.observeForever(cVar2);
            }
            com.ss.android.ugc.aweme.multi.ui.c cVar3 = this.f110974d;
            if (cVar3 == null) {
                l.b();
            }
            viewGroup.addView(cVar3.a(), -1, -2);
        }
        MethodCollector.o(7247);
    }
}
