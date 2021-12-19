package com.ss.android.ugc.aweme.ecommerce.pdp.widget;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.cart.repository.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class PdpBottomNavBarWidget extends JediBaseWidget implements au {

    /* renamed from: h  reason: collision with root package name */
    boolean f86886h;

    /* renamed from: i  reason: collision with root package name */
    public final Fragment f86887i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f86888j;

    static {
        Covode.recordClassIndex(54452);
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return R.layout.o7;
    }

    public final PdpViewModel l() {
        return (PdpViewModel) this.f86888j.getValue();
    }

    @Override // com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ Widget $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Widget widget, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = widget;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_widget_PdpBottomNavBarWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void c() {
        super.c();
        View view = this.f46127e;
        if (view != null) {
            TuxButton tuxButton = (TuxButton) view.findViewById(R.id.a1d);
            l.b(tuxButton, "");
            tuxButton.setOnClickListener(new b(this));
            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dyd);
            l.b(tuxIconView, "");
            tuxIconView.setOnClickListener(new c(this));
        }
        f.a.b.b unused = selectSubscribe(l(), j.f86927a, new ah(), new d(this));
        f.a.b.b unused2 = selectSubscribe(l(), k.f86928a, new ah(), new e(this));
        f.a.b.b unused3 = selectSubscribe(l(), l.f86929a, new ah(), new f(this));
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86889a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpBottomNavBarWidget f86890b;

        static {
            Covode.recordClassIndex(54454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(700);
            this.f86890b = pdpBottomNavBarWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            Boolean bool;
            Context context;
            Boolean bool2;
            Integer productQuantity;
            List<SkuItem> list;
            T t;
            String str;
            ProductBase productBase;
            ProductPrice productPrice;
            HashMap<String, Object> trackParams;
            String str2;
            ProductBase productBase2;
            ProductPrice productPrice2;
            if (view != null) {
                ProductPackStruct productPackStruct = this.f86890b.l().f86303d;
                SkuPrice skuPrice = null;
                if (productPackStruct == null || (productBase2 = productPackStruct.f86641e) == null || (productPrice2 = productBase2.f86629g) == null) {
                    bool = null;
                } else {
                    bool = productPrice2.f86653d;
                }
                int i2 = 1;
                boolean a2 = l.a((Object) bool, (Object) true);
                if (this.f86890b.l().h()) {
                    PdpViewModel l2 = this.f86890b.l();
                    View view2 = this.f86890b.f86887i.getView();
                    if (view2 != null) {
                        context = view2.getContext();
                    } else {
                        context = null;
                    }
                    if (context == null) {
                        com.bytedance.services.apm.api.a.a("Open sku or osp failed. Context is NULL");
                    } else if (l2.f86305f) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        IPdpStarter.PdpEnterParam pdpEnterParam = l2.f86300a;
                        if (!(pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null)) {
                            trackParams.put("click_buynow_start_time", Long.valueOf(elapsedRealtime));
                        }
                        ProductPackStruct productPackStruct2 = l2.f86303d;
                        if (productPackStruct2 == null || (productBase = productPackStruct2.f86641e) == null || (productPrice = productBase.f86629g) == null) {
                            bool2 = null;
                        } else {
                            bool2 = productPrice.f86653d;
                        }
                        k kVar = l2.s;
                        if (kVar != null) {
                            kVar.a(bool2, l2.f86301b, elapsedRealtime);
                        }
                        k kVar2 = l2.s;
                        if (kVar2 != null) {
                            ProductPackStruct productPackStruct3 = l2.f86303d;
                            if (!(productPackStruct3 == null || (list = productPackStruct3.f86643g) == null)) {
                                Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it.next();
                                    String skuId = t.getSkuId();
                                    SkuPanelState skuPanelState = l2.f86304e;
                                    if (skuPanelState != null) {
                                        str = skuPanelState.getSkuId();
                                    } else {
                                        str = null;
                                    }
                                    if (p.a(skuId, str, false)) {
                                        break;
                                    }
                                }
                                T t2 = t;
                                if (t2 != null) {
                                    skuPrice = t2.getPrice();
                                }
                            }
                            SkuPanelState skuPanelState2 = l2.f86304e;
                            if (!(skuPanelState2 == null || (productQuantity = skuPanelState2.getProductQuantity()) == null)) {
                                i2 = productQuantity.intValue();
                            }
                            kVar2.a(skuPrice, i2);
                        }
                        Context context2 = view2.getContext();
                        l.b(context2, "");
                        l2.c(context2);
                    } else {
                        l2.a(view2, 1);
                    }
                    k kVar3 = this.f86890b.l().s;
                    if (kVar3 != null) {
                        TuxButton tuxButton = (TuxButton) view.findViewById(R.id.a1d);
                        l.b(tuxButton, "");
                        kVar3.a("buy_now", Boolean.valueOf(tuxButton.isEnabled()), Boolean.valueOf(a2));
                    }
                    k kVar4 = this.f86890b.l().s;
                    if (kVar4 != null) {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        TuxButton tuxButton2 = (TuxButton) view.findViewById(R.id.a1d);
                        l.b(tuxButton2, "");
                        String str3 = "1";
                        if (tuxButton2.isEnabled()) {
                            str2 = str3;
                        } else {
                            str2 = "0";
                        }
                        hashMap.put("is_clickable", str2);
                        if (!a2) {
                            str3 = "0";
                        }
                        hashMap.put("is_buy_with_coupon", str3);
                        kVar4.b("buy_now", hashMap);
                    }
                }
            }
        }
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86891a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpBottomNavBarWidget f86892b;

        static {
            Covode.recordClassIndex(54455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(700);
            this.f86892b = pdpBottomNavBarWidget;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            Object obj;
            HashMap<String, Object> trackParams;
            HashMap<String, Object> trackParams2;
            SellerInfo sellerInfo;
            if (view != null) {
                ProductPackStruct productPackStruct = this.f86892b.l().f86303d;
                if (productPackStruct == null || (sellerInfo = productPackStruct.f86640d) == null) {
                    str = null;
                } else {
                    str = sellerInfo.f86662f;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                IPdpStarter.PdpEnterParam pdpEnterParam = this.f86892b.l().f86300a;
                if (!(pdpEnterParam == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null)) {
                    linkedHashMap.putAll(trackParams2);
                }
                linkedHashMap.remove("page_name");
                linkedHashMap.put("previous_page", "product_detail");
                IPdpStarter.PdpEnterParam pdpEnterParam2 = this.f86892b.l().f86300a;
                if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj = trackParams.get("source_page_type")) == null) {
                    obj = "unknown";
                }
                l.b(obj, "");
                linkedHashMap.put("show_window_source", obj);
                if (str != null) {
                    String uri = j.a(str, ag.c(new h.p("enter_from", this.f86892b.l().m()), new h.p("trackParams", dg.a().b(linkedHashMap)))).build().toString();
                    l.b(uri, "");
                    SmartRouter.buildRoute(this.f86892b.a().getContext(), uri).open();
                    k kVar = this.f86892b.l().s;
                    if (kVar != null) {
                        kVar.a("show_window", (Boolean) null, (Boolean) null);
                    }
                    k kVar2 = this.f86892b.l().s;
                    if (kVar2 != null) {
                        kVar2.f86392k = true;
                    }
                }
            }
        }
    }

    public PdpBottomNavBarWidget(Fragment fragment) {
        l.d(fragment, "");
        this.f86887i = fragment;
        h.k.c a2 = h.f.b.ab.a(PdpViewModel.class);
        this.f86888j = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86897a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpBottomNavBarWidget f86898b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f86899c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.d.a f86900d;

        static {
            Covode.recordClassIndex(54460);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            HashMap<String, Object> hashMap;
            if (view != null) {
                String str = this.f86899c;
                HashMap c2 = ag.c(new h.p("enter_from", "product_detail"));
                IPdpStarter.PdpEnterParam pdpEnterParam = this.f86898b.l().f86300a;
                if (pdpEnterParam != null) {
                    hashMap = pdpEnterParam.getTrackParams();
                } else {
                    hashMap = null;
                }
                c2.put("trackParams", dg.a().b(hashMap));
                String uri = j.a(str, c2).build().toString();
                l.b(uri, "");
                SmartRouter.buildRoute(view.getContext(), uri).open();
                k kVar = this.f86898b.l().s;
                if (kVar != null) {
                    kVar.a("contact_seller", (Boolean) null, (Boolean) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(PdpBottomNavBarWidget pdpBottomNavBarWidget, String str, com.ss.android.ugc.aweme.ecommerce.pdp.d.a aVar) {
            super(700);
            this.f86898b = pdpBottomNavBarWidget;
            this.f86899c = str;
            this.f86900d = aVar;
        }
    }

    public static final class g extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86893a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpBottomNavBarWidget f86894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f86895c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AddToCartButton f86896d;

        static {
            Covode.recordClassIndex(54459);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            LinkedHashMap<String, Object> linkedHashMap;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            String str6;
            HashMap<String, Object> hashMap;
            HashMap<String, Object> hashMap2;
            Object obj;
            HashMap<String, Object> trackParams;
            SellerInfo sellerInfo;
            String str7;
            if (view != null && this.f86894b.l().h()) {
                if (this.f86895c) {
                    View view2 = this.f86894b.f46127e;
                    if (view2 != null) {
                        com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(view2);
                        AddToCartButton addToCartButton = this.f86896d;
                        if (addToCartButton != null) {
                            str7 = addToCartButton.getClickHint();
                        } else {
                            str7 = null;
                        }
                        bVar.a(str7).b();
                    }
                } else {
                    PdpViewModel l2 = this.f86894b.l();
                    View view3 = this.f86894b.f46127e;
                    if (l2.f86305f) {
                        String a2 = com.ss.android.ugc.aweme.ecommerce.sku.model.a.a(2);
                        SkuPanelState skuPanelState = l2.f86304e;
                        if (skuPanelState != null) {
                            str = skuPanelState.getSkuId();
                        } else {
                            str = null;
                        }
                        k kVar = l2.s;
                        if (kVar != null) {
                            linkedHashMap = kVar.f86382a;
                        } else {
                            linkedHashMap = null;
                        }
                        com.ss.android.ugc.aweme.ecommerce.sku.a.a.a(a2, str, 1, "add_to_cart", "product_detail", "product_detail", linkedHashMap);
                        com.ss.android.ugc.aweme.ecommerce.cart.repository.a aVar = com.ss.android.ugc.aweme.ecommerce.cart.repository.a.f84677c;
                        ProductPackStruct productPackStruct = l2.f86303d;
                        if (productPackStruct == null || (sellerInfo = productPackStruct.f86640d) == null) {
                            str2 = null;
                        } else {
                            str2 = sellerInfo.f86657a;
                        }
                        SkuPanelState skuPanelState2 = l2.f86304e;
                        if (skuPanelState2 != null) {
                            str3 = skuPanelState2.getWarehouseId();
                        } else {
                            str3 = null;
                        }
                        ProductPackStruct productPackStruct2 = l2.f86303d;
                        if (productPackStruct2 != null) {
                            str4 = productPackStruct2.f86638b;
                        } else {
                            str4 = null;
                        }
                        SkuPanelState skuPanelState3 = l2.f86304e;
                        if (skuPanelState3 != null) {
                            str5 = skuPanelState3.getSkuId();
                        } else {
                            str5 = null;
                        }
                        SkuPanelState skuPanelState4 = l2.f86304e;
                        if (skuPanelState4 != null) {
                            num = skuPanelState4.getProductQuantity();
                        } else {
                            num = null;
                        }
                        IPdpStarter.PdpEnterParam pdpEnterParam = l2.f86300a;
                        if (pdpEnterParam != null) {
                            str6 = pdpEnterParam.getChainKey();
                        } else {
                            str6 = null;
                        }
                        IPdpStarter.PdpEnterParam pdpEnterParam2 = l2.f86300a;
                        if (pdpEnterParam2 != null) {
                            hashMap = pdpEnterParam2.getTrackParams();
                        } else {
                            hashMap = null;
                        }
                        String a3 = a.C2025a.a(hashMap);
                        IPdpStarter.PdpEnterParam pdpEnterParam3 = l2.f86300a;
                        if (pdpEnterParam3 != null) {
                            hashMap2 = pdpEnterParam3.getTrackParams();
                        } else {
                            hashMap2 = null;
                        }
                        Integer valueOf = Integer.valueOf(IPdpStarter.a.a(hashMap2));
                        IPdpStarter.PdpEnterParam pdpEnterParam4 = l2.f86300a;
                        if (pdpEnterParam4 == null || (trackParams = pdpEnterParam4.getTrackParams()) == null) {
                            obj = null;
                        } else {
                            obj = trackParams.get("author_id");
                        }
                        aVar.a(new com.ss.android.ugc.aweme.ecommerce.cart.repository.a.b(str2, str3, str4, str5, num, str6, a3, valueOf, (String) obj), view3, view3, true, new PdpViewModel.a(l2, view3), new PdpViewModel.b(l2, view3)).a(new PdpViewModel.c(l2), PdpViewModel.d.f86311a);
                    } else {
                        l2.a(view3, 2);
                    }
                }
                k kVar2 = this.f86894b.l().s;
                if (kVar2 != null) {
                    kVar2.b("add_to_cart", (HashMap<String, Object>) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(PdpBottomNavBarWidget pdpBottomNavBarWidget, boolean z, AddToCartButton addToCartButton) {
            super(700);
            this.f86894b = pdpBottomNavBarWidget;
            this.f86895c = z;
            this.f86896d = addToCartButton;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ PdpBottomNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(2);
            this.this$0 = pdpBottomNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            LinearLayout linearLayout;
            LinearLayout linearLayout2;
            int intValue = num.intValue();
            l.d(iVar, "");
            if (intValue != -1) {
                View view = this.this$0.f46127e;
                if (!(view == null || (linearLayout2 = (LinearLayout) view.findViewById(R.id.d2w)) == null)) {
                    linearLayout2.setVisibility(8);
                }
            } else {
                View view2 = this.this$0.f46127e;
                if (!(view2 == null || (linearLayout = (LinearLayout) view2.findViewById(R.id.d2w)) == null)) {
                    linearLayout.setVisibility(0);
                }
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, AddToCartButton, z> {
        final /* synthetic */ PdpBottomNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(2);
            this.this$0 = pdpBottomNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.jedi.arch.i r10, com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton r11) {
            /*
            // Method dump skipped, instructions count: 241
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.widget.PdpBottomNavBarWidget.f.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, com.ss.android.ugc.aweme.ecommerce.pdp.d.a, z> {
        final /* synthetic */ PdpBottomNavBarWidget this$0;

        static {
            Covode.recordClassIndex(54457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PdpBottomNavBarWidget pdpBottomNavBarWidget) {
            super(2);
            this.this$0 = pdpBottomNavBarWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, com.ss.android.ugc.aweme.ecommerce.pdp.d.a aVar) {
            Context context;
            String str;
            String str2;
            TuxButton tuxButton;
            TuxButton tuxButton2;
            TuxButton tuxButton3;
            View view;
            TuxButton tuxButton4;
            View view2;
            TuxButton tuxButton5;
            String str3;
            TuxButton tuxButton6;
            TuxButton tuxButton7;
            TuxButton tuxButton8;
            TuxButton tuxButton9;
            TuxButton tuxButton10;
            String str4;
            com.ss.android.ugc.aweme.ecommerce.pdp.d.a aVar2 = aVar;
            l.d(iVar, "");
            if (aVar2 != null) {
                PdpBottomNavBarWidget pdpBottomNavBarWidget = this.this$0;
                View view3 = pdpBottomNavBarWidget.f46127e;
                Boolean bool = null;
                if (view3 != null) {
                    context = view3.getContext();
                } else {
                    context = null;
                }
                View view4 = pdpBottomNavBarWidget.f46127e;
                if (!(view4 == null || (tuxButton10 = (TuxButton) view4.findViewById(R.id.a1d)) == null)) {
                    if (l.a((Object) aVar2.f86447c, (Object) true)) {
                        if (context != null) {
                            str4 = context.getString(R.string.bhg);
                        } else {
                            str4 = null;
                        }
                    } else if (context != null) {
                        str4 = context.getString(R.string.bfu);
                    } else {
                        str4 = null;
                    }
                    tuxButton10.setText(str4);
                }
                if (aVar2.f86445a == 3 || aVar2.f86445a == 2) {
                    View view5 = pdpBottomNavBarWidget.f46127e;
                    if (!(view5 == null || (tuxButton9 = (TuxButton) view5.findViewById(R.id.a1d)) == null)) {
                        tuxButton9.setEnabled(false);
                    }
                    View view6 = pdpBottomNavBarWidget.f46127e;
                    if (!(view6 == null || (tuxButton8 = (TuxButton) view6.findViewById(R.id.hr)) == null)) {
                        tuxButton8.setVisibility(8);
                    }
                    if (context != null) {
                        View view7 = pdpBottomNavBarWidget.f46127e;
                        if (!(view7 == null || (tuxButton7 = (TuxButton) view7.findViewById(R.id.a1d)) == null)) {
                            tuxButton7.setBackgroundColor(androidx.core.content.b.c(context, R.color.f159922f));
                        }
                        int c2 = androidx.core.content.b.c(context, R.color.bz);
                        View view8 = pdpBottomNavBarWidget.f46127e;
                        if (!(view8 == null || (tuxButton6 = (TuxButton) view8.findViewById(R.id.a1d)) == null)) {
                            tuxButton6.setTextColor(c2);
                        }
                    }
                }
                SellerInfo sellerInfo = aVar2.f86446b;
                if (sellerInfo != null) {
                    str = sellerInfo.f86663g;
                } else {
                    str = null;
                }
                View view9 = pdpBottomNavBarWidget.f46127e;
                if (view9 != null) {
                    if (str == null || !(!p.a((CharSequence) str))) {
                        TuxIconView tuxIconView = (TuxIconView) view9.findViewById(R.id.bl2);
                        l.b(tuxIconView, "");
                        tuxIconView.setVisibility(8);
                    } else {
                        TuxIconView tuxIconView2 = (TuxIconView) view9.findViewById(R.id.bl2);
                        l.b(tuxIconView2, "");
                        tuxIconView2.setVisibility(0);
                        TuxIconView tuxIconView3 = (TuxIconView) view9.findViewById(R.id.bl2);
                        l.b(tuxIconView3, "");
                        tuxIconView3.setOnClickListener(new h(pdpBottomNavBarWidget, str, aVar2));
                    }
                    SellerInfo sellerInfo2 = aVar2.f86446b;
                    if (sellerInfo2 != null) {
                        str3 = sellerInfo2.f86663g;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null || p.a((CharSequence) aVar2.f86446b.f86663g) || aVar2.f86446b.f86658b == null || aVar2.f86446b.f86658b.length() == 0) {
                        TuxIconView tuxIconView4 = (TuxIconView) view9.findViewById(R.id.dyd);
                        l.b(tuxIconView4, "");
                        tuxIconView4.setVisibility(8);
                    } else {
                        TuxIconView tuxIconView5 = (TuxIconView) view9.findViewById(R.id.dyd);
                        l.b(tuxIconView5, "");
                        tuxIconView5.setVisibility(0);
                    }
                }
                if (!(aVar2.f86445a != 3 || (view2 = pdpBottomNavBarWidget.f46127e) == null || (tuxButton5 = (TuxButton) view2.findViewById(R.id.a1d)) == null)) {
                    tuxButton5.setText(R.string.bgs);
                }
                if (!(aVar2.f86445a != 2 || (view = pdpBottomNavBarWidget.f46127e) == null || (tuxButton4 = (TuxButton) view.findViewById(R.id.a1d)) == null)) {
                    tuxButton4.setText(R.string.bgm);
                }
                if (aVar2.f86445a == 1) {
                    View view10 = pdpBottomNavBarWidget.f46127e;
                    if (!(view10 == null || (tuxButton3 = (TuxButton) view10.findViewById(R.id.hr)) == null)) {
                        tuxButton3.setEnabled(true);
                    }
                    View view11 = pdpBottomNavBarWidget.f46127e;
                    if (!(view11 == null || (tuxButton2 = (TuxButton) view11.findViewById(R.id.a1d)) == null)) {
                        tuxButton2.setEnabled(true);
                    }
                }
                View view12 = pdpBottomNavBarWidget.f46127e;
                if (!(view12 == null || (tuxButton = (TuxButton) view12.findViewById(R.id.a1d)) == null)) {
                    bool = Boolean.valueOf(tuxButton.isEnabled());
                }
                k kVar = pdpBottomNavBarWidget.l().s;
                if (kVar != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    String str5 = "1";
                    if (bool != null) {
                        bool.booleanValue();
                        if (bool.booleanValue()) {
                            str2 = str5;
                        } else {
                            str2 = "0";
                        }
                        hashMap.put("is_clickable", str2);
                    }
                    if (!l.a((Object) aVar2.f86447c, (Object) true)) {
                        str5 = "0";
                    }
                    hashMap.put("is_buy_with_coupon", str5);
                    kVar.a("buy_now", hashMap);
                }
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, View view, AddToCartButton addToCartButton) {
        view.setOnClickListener(new g(this, z, addToCartButton));
    }
}
