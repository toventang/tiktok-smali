package com.ss.android.ugc.aweme.ecommerce.pdp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonAction;
import com.ss.android.ugc.aweme.ecommerce.api.model.ButtonActionInfo;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.a;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.c;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.a;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpSelectViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.ShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescImageViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescTextViewHolder;
import com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.utils.hk;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class PdpViewModel extends JediViewModel<PdpMainState> implements IEventCenter.b {
    private final String A = "add_cart_success_tip";
    private final h.h B = h.i.a((h.f.a.a) i.f86315a);
    private int C;

    /* renamed from: a  reason: collision with root package name */
    public IPdpStarter.PdpEnterParam f86300a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f86301b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f86302c;

    /* renamed from: d  reason: collision with root package name */
    public ProductPackStruct f86303d;

    /* renamed from: e  reason: collision with root package name */
    public SkuPanelState f86304e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f86305f;

    /* renamed from: g  reason: collision with root package name */
    public DeliveryPanelStarter.PackedDeliverySelectResult f86306g;

    /* renamed from: k  reason: collision with root package name */
    public List<h.f.a.b<Float, h.z>> f86307k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f86308l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f86309m;
    public bz n;
    public bz o;
    public boolean p;
    public boolean q;
    public int r;
    public com.ss.android.ugc.aweme.ecommerce.pdp.b.k s;
    public c t;
    public h.f.a.q<? super Integer, ? super Integer, ? super Long, h.z> u;
    public boolean v = true;
    public boolean w = true;
    public boolean x;
    public f.a.b.b y;
    public l z;

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f86311a = new d();

        static {
            Covode.recordClassIndex(54018);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PdpViewModel this$0;

        static {
            Covode.recordClassIndex(54027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(PdpViewModel pdpViewModel, h.c.d dVar) {
            super(dVar);
            this.this$0 = pdpViewModel;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((h.f.a.b) null, this);
        }
    }

    static {
        Covode.recordClassIndex(54011);
    }

    private final Keva n() {
        return (Keva) this.B.getValue();
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f86313a = new g();

        static {
            Covode.recordClassIndex(54021);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f86314a = new h();

        static {
            Covode.recordClassIndex(54022);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            return h.z.f158842a;
        }
    }

    public final boolean a() {
        LogisticDTO logisticDTO;
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.f86306g;
        Boolean bool = null;
        if ((packedDeliverySelectResult != null ? packedDeliverySelectResult.f85807b : null) != null) {
            return true;
        }
        ProductPackStruct productPackStruct = this.f86303d;
        if (!(productPackStruct == null || (logisticDTO = productPackStruct.f86645i) == null)) {
            bool = logisticDTO.f85892d;
        }
        return h.f.b.l.a((Object) bool, (Object) true);
    }

    public final void a(boolean z2) {
        c(new t(z2));
        this.f86301b = z2;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        Integer valueOf;
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar;
        String str3;
        SellerInfo sellerInfo;
        ProductBase productBase;
        List<Image> list;
        ProductBase productBase2;
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2;
        CartEntry cartEntry;
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        String str4 = null;
        r4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        AddToCartButton addToCartButton = null;
        switch (str.hashCode()) {
            case -2037346338:
                if (str.equals("ec_sku_panel_operated")) {
                    SkuPanelStarter.SkuOperationParams skuOperationParams = (SkuPanelStarter.SkuOperationParams) dg.a(str2, SkuPanelStarter.SkuOperationParams.class);
                    String productId = skuOperationParams != null ? skuOperationParams.getProductId() : null;
                    ProductPackStruct productPackStruct = this.f86303d;
                    if (productPackStruct != null) {
                        str4 = productPackStruct.f86638b;
                    }
                    if (h.f.b.l.a((Object) productId, (Object) str4) && skuOperationParams != null && (valueOf = Integer.valueOf(skuOperationParams.getType())) != null) {
                        if (valueOf.intValue() == 0) {
                            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar3 = this.s;
                            if (kVar3 != null) {
                                kVar3.f86389h = true;
                                return;
                            }
                            return;
                        } else if (valueOf.intValue() == 1 && (kVar = this.s) != null) {
                            kVar.f86390i = true;
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case -1599177272:
                if (str.equals("ec_sku_panel_open")) {
                    String productId2 = ((SkuPanelStarter.SkuEnterParams) dg.a(str2, SkuPanelStarter.SkuEnterParams.class)).getProductId();
                    ProductPackStruct productPackStruct2 = this.f86303d;
                    if (h.f.b.l.a((Object) productId2, (Object) (productPackStruct2 != null ? productPackStruct2.f86638b : null))) {
                        IEventCenter a2 = EventCenter.a();
                        ProductPackStruct productPackStruct3 = this.f86303d;
                        if (productPackStruct3 == null || (str3 = productPackStruct3.f86638b) == null) {
                            str3 = "0";
                        }
                        SkuPanelState skuPanelState = this.f86304e;
                        String[] checkedSkuIds = skuPanelState != null ? skuPanelState.getCheckedSkuIds() : null;
                        SkuPanelState skuPanelState2 = this.f86304e;
                        Integer productQuantity = skuPanelState2 != null ? skuPanelState2.getProductQuantity() : null;
                        ProductPackStruct productPackStruct4 = this.f86303d;
                        List<SkuItem> list2 = productPackStruct4 != null ? productPackStruct4.f86643g : null;
                        ProductPackStruct productPackStruct5 = this.f86303d;
                        List<SaleProp> list3 = productPackStruct5 != null ? productPackStruct5.f86642f : null;
                        ProductPackStruct productPackStruct6 = this.f86303d;
                        ProductPrice productPrice = (productPackStruct6 == null || (productBase2 = productPackStruct6.f86641e) == null) ? null : productBase2.f86629g;
                        ProductPackStruct productPackStruct7 = this.f86303d;
                        Image image = (productPackStruct7 == null || (productBase = productPackStruct7.f86641e) == null || (list = productBase.f86626d) == null) ? null : (Image) h.a.n.b((List) list, 0);
                        ProductPackStruct productPackStruct8 = this.f86303d;
                        String str8 = (productPackStruct8 == null || (sellerInfo = productPackStruct8.f86640d) == null) ? null : sellerInfo.f86657a;
                        ProductPackStruct productPackStruct9 = this.f86303d;
                        if (productPackStruct9 != null) {
                            addToCartButton = productPackStruct9.q;
                        }
                        String b2 = dg.a().b(new SkuPanelStarter.SkuRenderParams(str3, checkedSkuIds, productQuantity, list2, list3, "product_detail", productPrice, image, str8, addToCartButton, this.f86303d));
                        h.f.b.l.b(b2, "");
                        a2.a("ec_send_sku_params", b2);
                        return;
                    }
                    return;
                }
                return;
            case -1229744642:
                if (str.equals("ec_live_shop_widget_on_destroy")) {
                    i();
                    return;
                }
                return;
            case -1186713444:
                if (str.equals("ec_sku_panel_state_change")) {
                    SkuPanelState skuPanelState3 = (SkuPanelState) dg.a(str2, SkuPanelState.class);
                    String productId3 = skuPanelState3 != null ? skuPanelState3.getProductId() : null;
                    ProductPackStruct productPackStruct10 = this.f86303d;
                    if (productPackStruct10 != null) {
                        str7 = productPackStruct10.f86638b;
                    }
                    if (h.f.b.l.a((Object) productId3, (Object) str7) && skuPanelState3 != null) {
                        a(skuPanelState3);
                        return;
                    }
                    return;
                }
                return;
            case -684635275:
                if (str.equals("ec_gallery_new_image_viewed")) {
                    HashMap hashMap = (HashMap) dg.a(str2, HashMap.class);
                    h.f.b.l.b(hashMap, "");
                    String valueOf2 = String.valueOf(hashMap.get("from"));
                    String valueOf3 = String.valueOf(hashMap.get("identity"));
                    String valueOf4 = String.valueOf(hashMap.get("position"));
                    ProductPackStruct productPackStruct11 = this.f86303d;
                    if (productPackStruct11 != null) {
                        str6 = productPackStruct11.f86638b;
                    }
                    if (h.f.b.l.a((Object) valueOf3, (Object) str6) && h.f.b.l.a((Object) valueOf2, (Object) "sku") && (kVar2 = this.s) != null && valueOf4 != null) {
                        kVar2.f86385d.add(valueOf4);
                        return;
                    }
                    return;
                }
                return;
            case 2018042557:
                if (str.equals("ec_cart_refresh")) {
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.a a3 = a.C2029a.a(str2);
                    Integer num = a3.f84764b;
                    if (num != null) {
                        int intValue = num.intValue();
                        ProductPackStruct productPackStruct12 = this.f86303d;
                        if (!(productPackStruct12 == null || (cartEntry = productPackStruct12.r) == null)) {
                            str5 = cartEntry.f86599a;
                        }
                        b(new CartEntry(str5, Integer.valueOf(intValue)));
                    }
                    if (a3.f84763a == 1) {
                        a(false, true);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0090, code lost:
        if (r9 == null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct r8, java.lang.Integer r9) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.a(com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct, java.lang.Integer):void");
    }

    public final void a(SkuPanelState skuPanelState) {
        this.f86304e = skuPanelState != null ? skuPanelState.clone() : null;
        c(new ab(this));
    }

    public final void a(boolean z2, boolean z3) {
        com.ss.android.ugc.aweme.ecommerce.pdp.repository.a a2 = a.C2085a.a();
        IPdpStarter.PdpEnterParam pdpEnterParam = this.f86300a;
        if (pdpEnterParam == null) {
            h.f.b.l.b();
        }
        this.y = a2.a(pdpEnterParam, z2, 0, true, true).f86592c.a(new p(this), new q(this, z3));
    }

    public final void a(Context context, a aVar, View view) {
        if (context != null && aVar != null && view != null && !k()) {
            com.bytedance.tux.tooltip.b a2 = new com.bytedance.tux.tooltip.a.b.a(context).a(aVar.f86324a).b(view).a(com.bytedance.tux.tooltip.h.BOTTOM);
            Integer a3 = com.bytedance.tux.h.d.a(context, R.attr.bl);
            com.bytedance.tux.tooltip.a.b.a aVar2 = (com.bytedance.tux.tooltip.a.b.a) a2.a(a3 != null ? a3.intValue() : -16777216).a().b();
            aVar2.f45511a.f45536f = (int) com.bytedance.common.utility.n.b(context, -1000.0f);
            aVar2.d().a();
            n().storeBoolean(this.A, true);
        }
    }

    public final void a(View view, int i2) {
        if (view == null || view.getContext() == null) {
            com.bytedance.services.apm.api.a.a("Open sku failed. Context is NULL");
            return;
        }
        SkuPanelStarter.f87363b = Long.valueOf(SystemClock.elapsedRealtime());
        this.n = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new o(this, view, i2, null), 2);
    }

    public final void a(RecyclerView recyclerView, int i2, boolean z2) {
        int intValue;
        h.f.b.l.d(recyclerView, "");
        if (!this.x) {
            int i3 = this.C;
            this.C = i3 + 1;
            if (i3 % 30 == 0 || z2) {
                boolean canScrollVertically = recyclerView.canScrollVertically(1);
                boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                if (canScrollVertically) {
                    if (!canScrollVertically2) {
                        a(0, false);
                        return;
                    }
                    RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                    Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    int k2 = ((LinearLayoutManager) layoutManager).k();
                    int i4 = Integer.MIN_VALUE;
                    int i5 = k2 + 5;
                    int i6 = 0;
                    while (k2 < i5) {
                        Integer a2 = a(recyclerView, k2);
                        if (a2 != null && (intValue = a2.intValue() - i2) > i4 && intValue < 0) {
                            i6 = k2;
                            i4 = intValue;
                        }
                        k2++;
                    }
                    RecyclerView.ViewHolder f2 = recyclerView.f(i6);
                    if (f2 != null) {
                        Class<?> cls = f2.getClass();
                        if (h.f.b.l.a(cls, PdpHeadViewHolder.class) || h.f.b.l.a(cls, PdpInfoViewHolder.class) || h.f.b.l.a(cls, PdpSelectViewHolder.class)) {
                            a(0, false);
                            return;
                        } else if (h.f.b.l.a(cls, PdpReviewViewHolder.class) || h.f.b.l.a(cls, PdpReviewHeadViewHolder.class)) {
                            a(1, false);
                            return;
                        } else if (!h.f.b.l.a(cls, ProductDescImageViewHolder.class) && !h.f.b.l.a(cls, ProductDescVideoViewHolder.class) && !h.f.b.l.a(cls, ShopProfileVH.class) && !h.f.b.l.a(cls, ProductDescTextViewHolder.class)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                a(2, false);
            }
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f86315a = new i();

        static {
            Covode.recordClassIndex(54023);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("ecom_keva_store");
        }
    }

    private static boolean o() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final int b() {
        if (this.v) {
            return hh.b();
        }
        return 0;
    }

    public final void i() {
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.s;
        if (kVar != null) {
            kVar.a("return");
        }
        c(e.f86312a);
    }

    public final void j() {
        f.a.b.b bVar = this.y;
        if (bVar != null) {
            bVar.dispose();
        }
        this.y = null;
    }

    public final boolean k() {
        return n().getBoolean(this.A, false);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        EventCenter.a().a("ec_gallery_new_image_viewed", this);
        EventCenter.a().a("ec_live_shop_widget_on_destroy", this);
        EventCenter.a().a("ec_cart_refresh", this);
    }

    public final boolean h() {
        Integer num;
        ProductPackStruct productPackStruct = this.f86303d;
        if (productPackStruct == null || (num = productPackStruct.f86639c) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ PdpMainState d() {
        return new PdpMainState(false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65535, null);
    }

    public final Object m() {
        Object obj;
        HashMap<String, Object> trackParams;
        Object obj2;
        HashMap<String, Object> trackParams2;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.f86300a;
        if (pdpEnterParam == null || (trackParams2 = pdpEnterParam.getTrackParams()) == null || (obj = trackParams2.get("source_page_type")) == null) {
            obj = "";
        }
        h.f.b.l.b(obj, "");
        if (h.f.b.l.a(obj, (Object) "live")) {
            return "live";
        }
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.f86300a;
        if (pdpEnterParam2 == null || (trackParams = pdpEnterParam2.getTrackParams()) == null || (obj2 = trackParams.get("enter_from_info")) == null) {
            return "unknown";
        }
        return obj2;
    }

    public final void g() {
        Application a2 = com.bytedance.ies.ugc.appcontext.g.a();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = o();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
            c(r.f86320a);
            h.f.b.l.b(a2, "");
            com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(a(a2));
            Context a3 = a(a2);
            h.f.b.l.b(a3, "");
            aVar.a(a3.getResources().getString(R.string.de2)).a();
            return;
        }
        this.r++;
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.s;
        if (kVar != null) {
            kVar.r = SystemClock.elapsedRealtime();
        }
        c(j.f86316a);
        a(true, false);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        h.f.a.q<? super Integer, ? super Integer, ? super Long, h.z> qVar;
        bz bzVar;
        bz bzVar2;
        super.onCleared();
        bz bzVar3 = this.n;
        if (!(bzVar3 == null || !bzVar3.b() || (bzVar2 = this.n) == null)) {
            bzVar2.a((CancellationException) null);
        }
        bz bzVar4 = this.o;
        if (!(bzVar4 == null || !bzVar4.b() || (bzVar = this.o) == null)) {
            bzVar.a((CancellationException) null);
        }
        c cVar = this.t;
        if (!(cVar == null || (qVar = this.u) == null)) {
            cVar.f86427f.remove(qVar);
        }
        j();
        EventCenter.a().b("ec_gallery_new_image_viewed", this);
        EventCenter.a().b("ec_live_shop_widget_on_destroy", this);
        EventCenter.a().a("ec_cart_refresh", this);
    }

    public final HashMap<String, Object> l() {
        HashMap<String, Object> hashMap;
        String str;
        String str2;
        String str3;
        String str4;
        ProductBase productBase;
        List<Image> list;
        Image image;
        List<String> urls;
        String str5;
        SellerInfo sellerInfo;
        ProductBase productBase2;
        SellerInfo sellerInfo2;
        h.p[] pVarArr = new h.p[6];
        IPdpStarter.PdpEnterParam pdpEnterParam = this.f86300a;
        String str6 = "";
        if (pdpEnterParam == null || (hashMap = pdpEnterParam.getTrackParams()) == null) {
            hashMap = str6;
        }
        pVarArr[0] = new h.p("track_params", hashMap);
        ProductPackStruct productPackStruct = this.f86303d;
        if (productPackStruct == null || (sellerInfo2 = productPackStruct.f86640d) == null || (str = sellerInfo2.f86658b) == null) {
            str = str6;
        }
        pVarArr[1] = new h.p("store_name", str);
        ProductPackStruct productPackStruct2 = this.f86303d;
        if (productPackStruct2 == null || (productBase2 = productPackStruct2.f86641e) == null || (str2 = productBase2.f86623a) == null) {
            str2 = str6;
        }
        pVarArr[2] = new h.p("product_name", str2);
        ProductPackStruct productPackStruct3 = this.f86303d;
        if (productPackStruct3 == null || (str3 = productPackStruct3.f86638b) == null) {
            str3 = str6;
        }
        pVarArr[3] = new h.p("product_id", str3);
        ProductPackStruct productPackStruct4 = this.f86303d;
        if (productPackStruct4 == null || (sellerInfo = productPackStruct4.f86640d) == null || (str4 = sellerInfo.f86657a) == null) {
            str4 = str6;
        }
        pVarArr[4] = new h.p("shop_id", str4);
        ProductPackStruct productPackStruct5 = this.f86303d;
        if (!(productPackStruct5 == null || (productBase = productPackStruct5.f86641e) == null || (list = productBase.f86626d) == null || (image = list.get(0)) == null || (urls = image.getUrls()) == null || (str5 = urls.get(0)) == null)) {
            str6 = str5;
        }
        pVarArr[5] = new h.p("product_image_url", str6);
        return ag.c(pVarArr);
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PdpViewModel f86317a;

        static {
            Covode.recordClassIndex(54034);
        }

        p(PdpViewModel pdpViewModel) {
            this.f86317a = pdpViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f86317a.a((ProductPackStruct) obj, (Integer) null);
            this.f86317a.j();
        }
    }

    private static Context a(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void g(h.f.a.b<? super Float, h.z> bVar) {
        h.f.b.l.d(bVar, "");
        this.f86307k.add(bVar);
    }

    public static boolean a(CartEntry cartEntry) {
        String str;
        if (cartEntry == null || (str = cartEntry.f86599a) == null) {
            return false;
        }
        return hk.a(str);
    }

    private final void b(CartEntry cartEntry) {
        Integer num;
        com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.s;
        if (kVar != null) {
            if (cartEntry != null) {
                num = cartEntry.f86600b;
            } else {
                num = null;
            }
            kVar.p = num;
        }
        ProductPackStruct productPackStruct = this.f86303d;
        if (productPackStruct != null) {
            productPackStruct.r = cartEntry;
        }
        c(new w(cartEntry));
    }

    static boolean d(Context context) {
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    public final void c(Context context) {
        com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.x.a(context, this.f86303d, this.f86306g, this.f86304e, this.f86300a, this.f86301b, new k(this, context));
    }

    public static final class n extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ PdpViewModel this$0;

        static {
            Covode.recordClassIndex(54029);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(PdpViewModel pdpViewModel, Context context, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = pdpViewModel;
            this.$context = context;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new n(this.this$0, this.$context, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((n) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
            final /* synthetic */ DeliveryPanelStarter.PackedDeliverySelectResult $result$inlined;
            final /* synthetic */ n this$0;

            static {
                Covode.recordClassIndex(54030);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n nVar, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult) {
                super(1);
                this.this$0 = nVar;
                this.$result$inlined = packedDeliverySelectResult;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                PdpMainState pdpMainState2 = pdpMainState;
                h.f.b.l.d(pdpMainState2, "");
                return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, this.this$0.this$0.a(this.this$0.this$0.f86303d, false), 0.0f, 0, null, 0, false, null, null, null, null, null, 65503, null);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b extends h.c.b.a.k implements h.f.a.b<h.c.d<? super DeliveryPanelStarter.PackedDeliverySelectResult>, Object> {
            int label;
            final /* synthetic */ n this$0;

            static {
                Covode.recordClassIndex(54031);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(n nVar, h.c.d dVar) {
                super(1, dVar);
                this.this$0 = nVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<h.z> create(h.c.d<?> dVar) {
                h.f.b.l.d(dVar, "");
                return new b(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final Object invoke(h.c.d<? super DeliveryPanelStarter.PackedDeliverySelectResult> dVar) {
                return ((b) create(dVar)).invokeSuspend(h.z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                String str;
                Integer num;
                List<SkuItem> list;
                String str2;
                String str3;
                List<Region> list2;
                String str4;
                int i2;
                HashMap<String, Object> trackParams;
                LogisticDTO logisticDTO;
                Object obj2 = obj;
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    h.r.a(obj2);
                    DeliveryPanelStarter deliveryPanelStarter = DeliveryPanelStarter.f85785a;
                    Context context = this.this$0.$context;
                    boolean z = this.this$0.this$0.f86301b;
                    PdpViewModel pdpViewModel = this.this$0.this$0;
                    SkuPanelState skuPanelState = pdpViewModel.f86304e;
                    String str5 = null;
                    if (skuPanelState != null) {
                        str = skuPanelState.getSkuId();
                        if (str != null) {
                            SkuPanelState skuPanelState2 = pdpViewModel.f86304e;
                            if (skuPanelState2 != null) {
                                num = skuPanelState2.getProductQuantity();
                            }
                            num = null;
                        }
                        ProductPackStruct productPackStruct = pdpViewModel.f86303d;
                        if (!(productPackStruct == null || (list = productPackStruct.f86643g) == null || !(!list.isEmpty()))) {
                            str = list.get(0).getSkuId();
                        }
                        num = null;
                    } else {
                        str = null;
                        ProductPackStruct productPackStruct2 = pdpViewModel.f86303d;
                        str = list.get(0).getSkuId();
                        num = null;
                    }
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = pdpViewModel.f86306g;
                    if (packedDeliverySelectResult == null || (logisticDTO = packedDeliverySelectResult.f85806a) == null) {
                        str2 = null;
                    } else {
                        str2 = logisticDTO.f85899k;
                    }
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult2 = pdpViewModel.f86306g;
                    if (packedDeliverySelectResult2 != null) {
                        str3 = packedDeliverySelectResult2.f85807b;
                    } else {
                        str3 = null;
                    }
                    DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult3 = pdpViewModel.f86306g;
                    if (packedDeliverySelectResult3 != null) {
                        list2 = packedDeliverySelectResult3.f85808c;
                    } else {
                        list2 = null;
                    }
                    ProductPackStruct productPackStruct3 = pdpViewModel.f86303d;
                    if (productPackStruct3 != null) {
                        str4 = productPackStruct3.f86638b;
                    } else {
                        str4 = null;
                    }
                    String valueOf = String.valueOf(str4);
                    String valueOf2 = String.valueOf(str);
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 1;
                    }
                    IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel.f86300a;
                    if (!(pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null)) {
                        Map d2 = ag.d(trackParams);
                        d2.put("previous_page", "product_detail");
                        str5 = dg.a().b(d2);
                    }
                    DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = new DeliveryPanelStarter.EnterParamForProductDetailPage(str2, str3, list2, valueOf, valueOf2, i2, str5);
                    this.label = 1;
                    obj2 = deliveryPanelStarter.a(context, Boolean.valueOf(z), new DeliveryPanelStarter.EnterParam(enterParamForProductDetailPage.f85799a, enterParamForProductDetailPage.f85800b, enterParamForProductDetailPage.f85801c, enterParamForProductDetailPage.f85802d, enterParamForProductDetailPage.f85803e, enterParamForProductDetailPage.f85804f, null, enterParamForProductDetailPage.f85805g, 64), false, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else if (i3 == 1) {
                    h.r.a(obj2);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj2;
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            Float f2;
            String str;
            String priceVal;
            LogisticDTO logisticDTO;
            ProductPackStruct productPackStruct;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            String str2 = null;
            if (i2 == 0) {
                h.r.a(obj);
                PdpViewModel pdpViewModel = this.this$0;
                b bVar = new b(this, null);
                this.label = 1;
                obj = pdpViewModel.a(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                h.r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = (DeliveryPanelStarter.PackedDeliverySelectResult) obj;
            if (packedDeliverySelectResult == null) {
                packedDeliverySelectResult = new DeliveryPanelStarter.PackedDeliverySelectResult();
            }
            LogisticDTO logisticDTO2 = packedDeliverySelectResult.f85806a;
            if (logisticDTO2 != null) {
                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult2 = this.this$0.f86306g;
                if (((packedDeliverySelectResult2 == null || (logisticDTO = packedDeliverySelectResult2.f85806a) == null) && ((productPackStruct = this.this$0.f86303d) == null || (logisticDTO = productPackStruct.f86645i) == null)) || !h.f.b.l.a(logisticDTO2.f85898j, logisticDTO.f85898j) || !h.f.b.l.a(logisticDTO2.f85894f, logisticDTO.f85894f) || !h.f.b.l.a((Object) logisticDTO2.f85895g, (Object) logisticDTO.f85895g)) {
                    Price price = logisticDTO2.f85894f;
                    if (price == null || (priceVal = price.getPriceVal()) == null) {
                        f2 = null;
                    } else {
                        f2 = h.m.p.c(priceVal);
                    }
                    Price price2 = logisticDTO2.f85894f;
                    if (price2 != null) {
                        str = price2.getCurrency();
                    } else {
                        str = null;
                    }
                    LogisticTextDTO logisticTextDTO = logisticDTO2.f85898j;
                    if (logisticTextDTO != null) {
                        str2 = logisticTextDTO.f85905f;
                    }
                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.this$0.s;
                    if (kVar != null) {
                        kVar.a("logistics", this.this$0.f86301b, f2, str, true, str2);
                    }
                }
                this.this$0.f86306g = packedDeliverySelectResult;
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.this$0.s;
                if (kVar2 != null) {
                    kVar2.z = Boolean.valueOf(this.this$0.a());
                }
                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar3 = this.this$0.s;
                if (kVar3 != null) {
                    kVar3.A = this.this$0.f86306g;
                }
                this.this$0.c(new a(this, packedDeliverySelectResult));
            }
            return h.z.f158842a;
        }
    }

    public static final class aa extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
        final /* synthetic */ int $newOffset;

        static {
            Covode.recordClassIndex(54013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public aa(int i2) {
            super(1);
            this.$newOffset = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            h.f.b.l.d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, this.$newOffset, null, 0, false, null, null, null, null, null, 65407, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ab extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
        final /* synthetic */ PdpViewModel this$0;

        static {
            Covode.recordClassIndex(54014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(PdpViewModel pdpViewModel) {
            super(1);
            this.this$0 = pdpViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            h.f.b.l.d(pdpMainState2, "");
            PdpViewModel pdpViewModel = this.this$0;
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, pdpViewModel.a(pdpViewModel.f86303d, false), 0.0f, 0, null, 0, false, null, null, null, null, null, 65503, null);
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
        final /* synthetic */ float $newOffset;

        static {
            Covode.recordClassIndex(54015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ac(float f2) {
            super(1);
            this.$newOffset = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            h.f.b.l.d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, this.$newOffset, 0, null, 0, false, null, null, null, null, null, 65471, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f86312a = new e();

        static {
            Covode.recordClassIndex(54019);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            h.f.b.l.d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, true, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65531, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<PdpMainState, h.z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ PdpViewModel this$0;

        static {
            Covode.recordClassIndex(54020);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(PdpViewModel pdpViewModel, Context context) {
            super(1);
            this.this$0 = pdpViewModel;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(PdpMainState pdpMainState) {
            Context context;
            String string;
            PdpMainState pdpMainState2 = pdpMainState;
            h.f.b.l.d(pdpMainState2, "");
            if (pdpMainState2.isFullScreen() && !this.this$0.k() && (context = this.$context) != null && (string = context.getString(R.string.bj9)) != null) {
                PdpViewModel pdpViewModel = this.this$0;
                h.f.b.l.b(string, "");
                pdpViewModel.c(new x(new a(string, System.currentTimeMillis())));
            }
            return h.z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f86316a = new j();

        static {
            Covode.recordClassIndex(54024);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
            PdpMainState pdpMainState2 = pdpMainState;
            h.f.b.l.d(pdpMainState2, "");
            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65023, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<PdpMainState, h.z> {
        final /* synthetic */ z.a $needHide;
        final /* synthetic */ PdpViewModel this$0;

        static {
            Covode.recordClassIndex(54028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(PdpViewModel pdpViewModel, z.a aVar) {
            super(1);
            this.this$0 = pdpViewModel;
            this.$needHide = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(PdpMainState pdpMainState) {
            boolean z;
            PdpMainState pdpMainState2 = pdpMainState;
            h.f.b.l.d(pdpMainState2, "");
            z.a aVar = this.$needHide;
            if (pdpMainState2.getSheetState() == 4) {
                z = true;
            } else {
                z = false;
            }
            aVar.element = z;
            if (this.$needHide.element && !this.this$0.f86301b) {
                this.this$0.a(5);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.c.b.a.k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ int $from;
        final /* synthetic */ View $view;
        int label;
        final /* synthetic */ PdpViewModel this$0;

        static {
            Covode.recordClassIndex(54032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(PdpViewModel pdpViewModel, View view, int i2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = pdpViewModel;
            this.$view = view;
            this.$from = i2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            h.f.b.l.d(dVar, "");
            return new o(this.this$0, this.$view, this.$from, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((o) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                h.r.a(obj);
                PdpViewModel pdpViewModel = this.this$0;
                AnonymousClass1 r1 = new h.f.a.b<h.c.d<? super h.z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.o.AnonymousClass1 */
                    long J$0;
                    int label;
                    final /* synthetic */ o this$0;

                    static {
                        Covode.recordClassIndex(54033);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<h.z> create(h.c.d<?> dVar) {
                        h.f.b.l.d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        public static final class q<T> implements f.a.d.f {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ PdpViewModel f86318a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ boolean f86319b;

                            static {
                                Covode.recordClassIndex(54035);
                            }

                            q(PdpViewModel pdpViewModel, boolean z) {
                                this.f86318a = pdpViewModel;
                                this.f86319b = z;
                            }

                            @Override // f.a.d.f
                            public final /* synthetic */ void accept(Object obj) {
                                Throwable th = (Throwable) obj;
                                if (!this.f86319b) {
                                    if (th instanceof IPdpStarter.b) {
                                        this.f86318a.a((ProductPackStruct) null, Integer.valueOf(((IPdpStarter.b) th).getCode()));
                                    } else {
                                        this.f86318a.a((ProductPackStruct) null, (Integer) null);
                                    }
                                }
                                this.f86318a.j();
                            }
                        }

                        static final class r extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {

                            /* renamed from: a  reason: collision with root package name */
                            public static final r f86320a = new r();

                            static {
                                Covode.recordClassIndex(54036);
                            }

                            r() {
                                super(1);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                PdpMainState pdpMainState2 = pdpMainState;
                                h.f.b.l.d(pdpMainState2, "");
                                return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 2, false, null, null, null, null, null, 65023, null);
                            }
                        }

                        public static final class s extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {

                            /* renamed from: a  reason: collision with root package name */
                            public static final s f86321a = new s();

                            static {
                                Covode.recordClassIndex(54037);
                            }

                            s() {
                                super(1);
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                PdpMainState pdpMainState2 = pdpMainState;
                                h.f.b.l.d(pdpMainState2, "");
                                return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, true, null, null, null, null, null, 64511, null);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class t extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
                            final /* synthetic */ boolean $fullScreen;

                            static {
                                Covode.recordClassIndex(54038);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            t(boolean z) {
                                super(1);
                                this.$fullScreen = z;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                PdpMainState pdpMainState2 = pdpMainState;
                                h.f.b.l.d(pdpMainState2, "");
                                return PdpMainState.copy$default(pdpMainState2, this.$fullScreen, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65534, null);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class v extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
                            final /* synthetic */ int $status;

                            static {
                                Covode.recordClassIndex(54043);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            v(int i2) {
                                super(1);
                                this.$status = i2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                PdpMainState pdpMainState2 = pdpMainState;
                                h.f.b.l.d(pdpMainState2, "");
                                return PdpMainState.copy$default(pdpMainState2, false, null, false, this.$status, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, 65527, null);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class w extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
                            final /* synthetic */ CartEntry $cartEntry;

                            static {
                                Covode.recordClassIndex(54044);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            w(CartEntry cartEntry) {
                                super(1);
                                this.$cartEntry = cartEntry;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                PdpMainState pdpMainState2 = pdpMainState;
                                h.f.b.l.d(pdpMainState2, "");
                                return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, this.$cartEntry, null, 49151, null);
                            }
                        }

                        static final class x extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
                            final /* synthetic */ a $cartTipData;

                            static {
                                Covode.recordClassIndex(54045);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            x(a aVar) {
                                super(1);
                                this.$cartTipData = aVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                PdpMainState pdpMainState2 = pdpMainState;
                                h.f.b.l.d(pdpMainState2, "");
                                return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, this.$cartTipData, null, null, 57343, null);
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class y extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
                            final /* synthetic */ int $index;
                            final /* synthetic */ boolean $scroll;

                            static {
                                Covode.recordClassIndex(54046);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            y(int i2, boolean z) {
                                super(1);
                                this.$index = i2;
                                this.$scroll = z;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                PdpMainState pdpMainState2 = pdpMainState;
                                h.f.b.l.d(pdpMainState2, "");
                                return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, new d(this.$index, this.$scroll), 0, false, null, null, null, null, null, 65279, null);
                            }
                        }

                        public final void b(Context context) {
                            b_(new f(this, context));
                        }

                        public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c, Boolean> {
                            final /* synthetic */ View $view;
                            final /* synthetic */ PdpViewModel this$0;

                            static {
                                Covode.recordClassIndex(54016);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            public b(PdpViewModel pdpViewModel, View view) {
                                super(1);
                                this.this$0 = pdpViewModel;
                                this.$view = view;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // h.f.a.b
                            public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar) {
                                Integer num;
                                ExceptionUX exceptionUX;
                                com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar2 = cVar;
                                h.f.b.l.d(cVar2, "");
                                T t = cVar2.data;
                                Context context = null;
                                if (t == null || (exceptionUX = t.f84683b) == null) {
                                    num = null;
                                } else {
                                    num = exceptionUX.getExceptionUXType();
                                }
                                boolean z = true;
                                if (!(num == null || num.intValue() != 1 || this.this$0.s == null)) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("error_code", Integer.valueOf(cVar2.code));
                                    linkedHashMap.put("popup_name", "go_to_cart");
                                    linkedHashMap.put("previous_page", "product_detail");
                                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k.a(linkedHashMap);
                                }
                                if (!cVar2.isCodeOK() || !this.this$0.f86301b || this.this$0.k()) {
                                    z = false;
                                } else {
                                    PdpViewModel pdpViewModel = this.this$0;
                                    View view = this.$view;
                                    if (view != null) {
                                        context = view.getContext();
                                    }
                                    pdpViewModel.b(context);
                                }
                                return Boolean.valueOf(z);
                            }
                        }

                        public final void e(Context context) {
                            String str;
                            int i2;
                            HashMap<String, Object> trackParams;
                            ProductDetailReview productDetailReview;
                            Integer num;
                            ProductDetailReview productDetailReview2;
                            h.f.b.l.d(context, "");
                            ProductPackStruct productPackStruct = this.f86303d;
                            if (productPackStruct != null) {
                                str = productPackStruct.f86638b;
                            } else {
                                str = null;
                            }
                            ProductPackStruct productPackStruct2 = this.f86303d;
                            if (productPackStruct2 == null || (productDetailReview2 = productPackStruct2.n) == null) {
                                i2 = null;
                            } else {
                                i2 = productDetailReview2.f86630a;
                            }
                            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.s;
                            if (kVar != null) {
                                kVar.a("review_entrance", (com.ss.android.ugc.aweme.ecommerce.pdp.d.h) null);
                            }
                            if (str != null) {
                                h.p[] pVarArr = new h.p[4];
                                int i3 = 0;
                                pVarArr[0] = new h.p("product_id", str);
                                if (i2 == null) {
                                    i2 = -1;
                                }
                                pVarArr[1] = new h.p("review_score", i2);
                                ProductPackStruct productPackStruct3 = this.f86303d;
                                if (!(productPackStruct3 == null || (productDetailReview = productPackStruct3.n) == null || (num = productDetailReview.f86631b) == null)) {
                                    i3 = num.intValue();
                                }
                                pVarArr[2] = new h.p("review_count", Integer.valueOf(i3));
                                HashMap hashMap = new HashMap();
                                IPdpStarter.PdpEnterParam pdpEnterParam = this.f86300a;
                                if (!(pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null)) {
                                    hashMap.putAll(trackParams);
                                    hashMap.put("previous_page", "product_detail");
                                }
                                pVarArr[3] = new h.p("track_params", hashMap);
                                com.ss.android.ugc.aweme.ecommerce.router.j.a(context, "aweme://ec/product_review", ag.c(pVarArr), false).open();
                            }
                        }

                        public static final class c<T> implements f.a.d.f {

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ PdpViewModel f86310a;

                            static {
                                Covode.recordClassIndex(54017);
                            }

                            public c(PdpViewModel pdpViewModel) {
                                this.f86310a = pdpViewModel;
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:58:0x0107  */
                            @Override // f.a.d.f
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final /* synthetic */ void accept(java.lang.Object r21) {
                                /*
                                // Method dump skipped, instructions count: 316
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.c.accept(java.lang.Object):void");
                            }
                        }

                        /* access modifiers changed from: package-private */
                        public static final class z extends h.f.b.m implements h.f.a.b<PdpMainState, PdpMainState> {
                            final /* synthetic */ z.c $loadingStatus;
                            final /* synthetic */ ProductPackStruct $productionInfoPack;
                            final /* synthetic */ PdpViewModel this$0;

                            static {
                                Covode.recordClassIndex(54047);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            z(PdpViewModel pdpViewModel, z.c cVar, ProductPackStruct productPackStruct) {
                                super(1);
                                this.this$0 = pdpViewModel;
                                this.$loadingStatus = cVar;
                                this.$productionInfoPack = productPackStruct;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX WARNING: Removed duplicated region for block: B:50:0x011c  */
                            /* JADX WARNING: Removed duplicated region for block: B:53:0x012d  */
                            /* JADX WARNING: Removed duplicated region for block: B:64:0x014d  */
                            /* JADX WARNING: Removed duplicated region for block: B:67:0x0153  */
                            /* JADX WARNING: Removed duplicated region for block: B:70:0x0174  */
                            /* JADX WARNING: Removed duplicated region for block: B:71:0x0176  */
                            /* JADX WARNING: Removed duplicated region for block: B:73:0x017a  */
                            /* JADX WARNING: Removed duplicated region for block: B:74:0x017c  */
                            @Override // h.f.a.b
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState invoke(com.ss.android.ugc.aweme.ecommerce.pdp.PdpMainState r28) {
                                /*
                                // Method dump skipped, instructions count: 383
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.z.invoke(java.lang.Object):java.lang.Object");
                            }
                        }

                        public final void a(int i2) {
                            boolean z2;
                            c(new v(i2));
                            boolean z3 = true;
                            if (i2 == 3) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            a(z2);
                            if (i2 != 5) {
                                if (i2 != 3) {
                                    z3 = false;
                                }
                                this.f86302c = z3;
                            }
                        }

                        public final void a(Context context) {
                            String str;
                            CartEntry cartEntry;
                            if (context == null) {
                                com.bytedance.services.apm.api.a.a("Open cart failed. Context is NULL");
                                return;
                            }
                            IPdpStarter.PdpEnterParam pdpEnterParam = this.f86300a;
                            ProductPackStruct productPackStruct = this.f86303d;
                            if (productPackStruct == null || (cartEntry = productPackStruct.r) == null) {
                                str = null;
                            } else {
                                str = cartEntry.f86599a;
                            }
                            com.ss.android.ugc.aweme.ecommerce.cart.a.a(context, pdpEnterParam, "product_detail", str);
                        }

                        /* access modifiers changed from: package-private */
                        public static final class k extends h.f.b.m implements h.f.a.m<List<? extends String>, Integer, h.z> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ PdpViewModel this$0;

                            static {
                                Covode.recordClassIndex(54025);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            k(PdpViewModel pdpViewModel, Context context) {
                                super(2);
                                this.this$0 = pdpViewModel;
                                this.$context = context;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final /* synthetic */ h.z invoke(List<? extends String> list, Integer num) {
                                final List<? extends String> list2 = list;
                                final int intValue = num.intValue();
                                bz bzVar = this.this$0.o;
                                if (bzVar == null || !bzVar.b()) {
                                    this.this$0.o = kotlinx.coroutines.i.a(bs.f159054a, kotlinx.coroutines.internal.o.f159148a, null, new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.k.AnonymousClass1 */
                                        private /* synthetic */ Object L$0;
                                        int label;
                                        final /* synthetic */ k this$0;

                                        static {
                                            Covode.recordClassIndex(54026);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                            h.f.b.l.d(dVar, "");
                                            AnonymousClass1 r3 = 

                                            private static Integer a(RecyclerView recyclerView, int i2) {
                                                if (i2 < 0) {
                                                    return null;
                                                }
                                                try {
                                                    RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                                                    if (layoutManager != null) {
                                                        View c2 = ((LinearLayoutManager) layoutManager).c(i2);
                                                        if (c2 == null) {
                                                            return null;
                                                        }
                                                        int[] iArr = new int[2];
                                                        c2.getLocationInWindow(iArr);
                                                        return Integer.valueOf(iArr[1]);
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                                                } catch (Exception unused) {
                                                    return null;
                                                }
                                            }

                                            private void a(String str, FlashSale flashSale) {
                                                Long l2;
                                                h.f.b.l.d(str, "");
                                                h.f.b.l.d(flashSale, "");
                                                this.t = c.a.a(str);
                                                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.s;
                                                if (kVar != null) {
                                                    kVar.f86393l = flashSale.f86607b;
                                                }
                                                com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.s;
                                                if (kVar2 != null) {
                                                    c cVar = this.t;
                                                    if (cVar != null) {
                                                        l2 = Long.valueOf(cVar.f86422a);
                                                    } else {
                                                        l2 = null;
                                                    }
                                                    kVar2.f86394m = l2;
                                                }
                                                if (this.u == null) {
                                                    this.u = new u(this, flashSale);
                                                }
                                                c cVar2 = this.t;
                                                if (cVar2 != null) {
                                                    h.f.a.q<? super Integer, ? super Integer, ? super Long, h.z> qVar = this.u;
                                                    if (qVar == null) {
                                                        h.f.b.l.b();
                                                    }
                                                    cVar2.a(qVar);
                                                }
                                            }

                                            public static final class a extends h.f.b.m implements h.f.a.m<com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c, ButtonAction, Boolean> {
                                                final /* synthetic */ View $view;
                                                final /* synthetic */ PdpViewModel this$0;

                                                static {
                                                    Covode.recordClassIndex(54012);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                public a(PdpViewModel pdpViewModel, View view) {
                                                    super(2);
                                                    this.this$0 = pdpViewModel;
                                                    this.$view = view;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // h.f.a.m
                                                public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar, ButtonAction buttonAction) {
                                                    Integer buttonActionType;
                                                    String str;
                                                    Context context;
                                                    Integer buttonActionType2;
                                                    com.ss.android.ugc.aweme.ecommerce.cart.repository.a.c cVar2 = cVar;
                                                    ButtonAction buttonAction2 = buttonAction;
                                                    String str2 = "";
                                                    h.f.b.l.d(cVar2, str2);
                                                    boolean z = true;
                                                    String str3 = null;
                                                    if (this.this$0.s != null) {
                                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                        linkedHashMap.put("error_code", String.valueOf(cVar2.code));
                                                        linkedHashMap.put("popup_name", "go_to_cart");
                                                        linkedHashMap.put("previous_page", "product_detail");
                                                        if (!(buttonAction2 == null || (buttonActionType2 = buttonAction2.getButtonActionType()) == null)) {
                                                            if (buttonActionType2.intValue() == 0 || buttonActionType2.intValue() == 1) {
                                                                str2 = "stay";
                                                            } else if (buttonActionType2.intValue() == 3) {
                                                                str2 = "enter";
                                                            }
                                                        }
                                                        linkedHashMap.put("action_type", str2);
                                                        com.ss.android.ugc.aweme.ecommerce.pdp.b.k.b(linkedHashMap);
                                                    }
                                                    if (!(buttonAction2 == null || (buttonActionType = buttonAction2.getButtonActionType()) == null || buttonActionType.intValue() != 3)) {
                                                        ButtonActionInfo buttonActionInfo = buttonAction2.getButtonActionInfo();
                                                        if (buttonActionInfo != null) {
                                                            str = buttonActionInfo.getSchema();
                                                        } else {
                                                            str = null;
                                                        }
                                                        if (hk.a(str)) {
                                                            View view = this.$view;
                                                            if (view != null) {
                                                                context = view.getContext();
                                                            } else {
                                                                context = null;
                                                            }
                                                            IPdpStarter.PdpEnterParam pdpEnterParam = this.this$0.f86300a;
                                                            ButtonActionInfo buttonActionInfo2 = buttonAction2.getButtonActionInfo();
                                                            if (buttonActionInfo2 != null) {
                                                                str3 = buttonActionInfo2.getSchema();
                                                            }
                                                            com.ss.android.ugc.aweme.ecommerce.cart.a.a(context, pdpEnterParam, "product_detail", str3);
                                                            return Boolean.valueOf(z);
                                                        }
                                                    }
                                                    z = false;
                                                    return Boolean.valueOf(z);
                                                }
                                            }

                                            /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
                                            /* JADX WARNING: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
                                            /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
                                            /* Code decompiled incorrectly, please refer to instructions dump. */
                                            public final <R> java.lang.Object a(h.f.a.b<? super h.c.d<? super R>, ? extends java.lang.Object> r8, h.c.d<? super R> r9) {
                                                /*
                                                // Method dump skipped, instructions count: 144
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.a(h.f.a.b, h.c.d):java.lang.Object");
                                            }

                                            public final List<Object> a(ProductPackStruct productPackStruct, boolean z2) {
                                                FlashSale flashSale;
                                                String str;
                                                String str2;
                                                boolean z3;
                                                String str3;
                                                String str4;
                                                String str5;
                                                String str6;
                                                boolean z4;
                                                boolean z5;
                                                LogisticDTO logisticDTO;
                                                String[] strArr;
                                                com.ss.android.ugc.aweme.ecommerce.pdp.d.d dVar;
                                                boolean z6;
                                                boolean z7;
                                                boolean z8;
                                                String str7;
                                                String str8;
                                                String str9;
                                                String str10;
                                                String str11;
                                                boolean z9;
                                                boolean z10;
                                                Integer num;
                                                String str12;
                                                Boolean bool;
                                                ProductPrice productPrice;
                                                Boolean bool2;
                                                ProductPrice productPrice2;
                                                ProductPrice productPrice3;
                                                ProductPrice productPrice4;
                                                Boolean bool3;
                                                ProductPrice productPrice5;
                                                if (productPackStruct == null) {
                                                    return new ArrayList();
                                                }
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(com.ss.android.ugc.aweme.ecommerce.pdp.d.c.a(productPackStruct));
                                                h.f.b.l.d(productPackStruct, "");
                                                Integer num2 = productPackStruct.f86639c;
                                                if (num2 != null && num2.intValue() == 1) {
                                                    flashSale = productPackStruct.o;
                                                } else {
                                                    flashSale = null;
                                                }
                                                ProductBase productBase = productPackStruct.f86641e;
                                                if (productBase == null || (productPrice5 = productBase.f86629g) == null || (str = productPrice5.f86651b) == null) {
                                                    str = "";
                                                }
                                                if (flashSale == null || (str2 = flashSale.f86612g) == null) {
                                                    str2 = str;
                                                }
                                                ProductBase productBase2 = productPackStruct.f86641e;
                                                if (productBase2 == null || (productPrice4 = productBase2.f86629g) == null || (bool3 = productPrice4.f86654e) == null) {
                                                    z3 = false;
                                                } else {
                                                    z3 = bool3.booleanValue();
                                                }
                                                ProductBase productBase3 = productPackStruct.f86641e;
                                                if (productBase3 == null || (str3 = productBase3.f86623a) == null) {
                                                    str3 = "";
                                                }
                                                if (!z2) {
                                                    str2 = str;
                                                }
                                                ProductBase productBase4 = productPackStruct.f86641e;
                                                if (productBase4 == null || (productPrice3 = productBase4.f86629g) == null || (str4 = productPrice3.f86650a) == null) {
                                                    str4 = "";
                                                }
                                                ProductBase productBase5 = productPackStruct.f86641e;
                                                if (productBase5 != null) {
                                                    str5 = productBase5.f86628f;
                                                } else {
                                                    str5 = null;
                                                }
                                                ProductBase productBase6 = productPackStruct.f86641e;
                                                if (productBase6 == null || (productPrice2 = productBase6.f86629g) == null || (str6 = productPrice2.f86652c) == null) {
                                                    str6 = "";
                                                }
                                                ProductBase productBase7 = productPackStruct.f86641e;
                                                if (productBase7 == null || (productPrice = productBase7.f86629g) == null || (bool2 = productPrice.f86653d) == null) {
                                                    z4 = false;
                                                } else {
                                                    z4 = bool2.booleanValue();
                                                }
                                                WaistBanner waistBanner = productPackStruct.f86647k;
                                                VoucherInfo voucherInfo = productPackStruct.f86648l;
                                                ProductDetailReview productDetailReview = productPackStruct.n;
                                                LogisticDTO logisticDTO2 = productPackStruct.f86645i;
                                                if (logisticDTO2 == null || (bool = logisticDTO2.f85896h) == null) {
                                                    z5 = false;
                                                } else {
                                                    z5 = bool.booleanValue();
                                                }
                                                arrayList.add(new com.ss.android.ugc.aweme.ecommerce.pdp.d.g(str3, str2, str4, str5, str6, z4, waistBanner, voucherInfo, productDetailReview, z5, flashSale, productPackStruct.s, z3, productPackStruct.t, productPackStruct.w, productPackStruct.x));
                                                SkuPanelState skuPanelState = this.f86304e;
                                                DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = this.f86306g;
                                                h.f.b.l.d(productPackStruct, "");
                                                if (packedDeliverySelectResult == null || (logisticDTO = packedDeliverySelectResult.f85806a) == null) {
                                                    logisticDTO = productPackStruct.f86645i;
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.h(8.0f, false, androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.az), 4));
                                                Integer num3 = productPackStruct.f86639c;
                                                if (num3 != null && num3.intValue() == 1) {
                                                    if (skuPanelState != null) {
                                                        strArr = skuPanelState.getCheckedSkuIds();
                                                    } else {
                                                        strArr = null;
                                                    }
                                                    arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.d.k(com.ss.android.ugc.aweme.ecommerce.sku.c.b.a(strArr, productPackStruct.f86642f)));
                                                    arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.h(8.0f, false, androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.az), 4));
                                                    if (logisticDTO != null) {
                                                        Price price = logisticDTO.f85894f;
                                                        String str13 = logisticDTO.f85895g;
                                                        Boolean bool4 = logisticDTO.f85892d;
                                                        if (bool4 != null) {
                                                            z7 = bool4.booleanValue();
                                                        } else {
                                                            z7 = false;
                                                        }
                                                        Boolean bool5 = logisticDTO.f85897i;
                                                        if (bool5 != null) {
                                                            z8 = bool5.booleanValue();
                                                        } else {
                                                            z8 = false;
                                                        }
                                                        LogisticTextDTO logisticTextDTO = logisticDTO.f85898j;
                                                        if (logisticTextDTO != null) {
                                                            str7 = logisticTextDTO.f85903d;
                                                        } else {
                                                            str7 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO2 = logisticDTO.f85898j;
                                                        if (logisticTextDTO2 != null) {
                                                            str8 = logisticTextDTO2.f85900a;
                                                        } else {
                                                            str8 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO3 = logisticDTO.f85898j;
                                                        if (logisticTextDTO3 != null) {
                                                            str9 = logisticTextDTO3.f85902c;
                                                        } else {
                                                            str9 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO4 = logisticDTO.f85898j;
                                                        if (logisticTextDTO4 != null) {
                                                            str10 = logisticTextDTO4.f85904e;
                                                        } else {
                                                            str10 = null;
                                                        }
                                                        LogisticTextDTO logisticTextDTO5 = logisticDTO.f85898j;
                                                        if (logisticTextDTO5 != null) {
                                                            str11 = logisticTextDTO5.f85905f;
                                                        } else {
                                                            str11 = null;
                                                        }
                                                        Boolean bool6 = logisticDTO.f85896h;
                                                        if (bool6 != null) {
                                                            z9 = bool6.booleanValue();
                                                        } else {
                                                            z9 = false;
                                                        }
                                                        dVar = new com.ss.android.ugc.aweme.ecommerce.pdp.d.d(price, str13, z7, z8, str7, str8, str9, str10, str11, z9);
                                                    } else {
                                                        dVar = null;
                                                    }
                                                    arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.d.j(dVar));
                                                    z6 = true;
                                                    arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.h(1.0f, true, 0, 12));
                                                } else {
                                                    z6 = true;
                                                }
                                                if (productPackStruct.f86644h != null && (productPackStruct.f86644h.isEmpty() ^ z6)) {
                                                    arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.d.i(productPackStruct.f86644h));
                                                }
                                                ProductBase productBase8 = productPackStruct.f86641e;
                                                if (!(productBase8 == null || productBase8.f86627e == null || !(!productPackStruct.f86641e.f86627e.isEmpty()))) {
                                                    arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.d.l(productPackStruct.f86641e.f86627e));
                                                }
                                                arrayList2.add(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.h(8.0f, false, androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.g.a(), R.color.az), 4));
                                                if (arrayList2.size() == 2) {
                                                    arrayList2.clear();
                                                }
                                                arrayList.addAll(arrayList2);
                                                ProductDetailReview productDetailReview2 = productPackStruct.n;
                                                Integer num4 = productPackStruct.f86639c;
                                                if (num4 != null) {
                                                    z10 = true;
                                                    if (num4.intValue() == 1) {
                                                        if (!(productDetailReview2 == null || (num = productDetailReview2.f86631b) == null || num.intValue() <= 0)) {
                                                            arrayList.add(productDetailReview2);
                                                            List<ReviewItemStruct> list = productDetailReview2.f86632c;
                                                            if (list != null) {
                                                                z10 = true;
                                                                if (!list.isEmpty()) {
                                                                    arrayList.addAll(list);
                                                                    arrayList.add(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.h(24.0f, true, 0, 12));
                                                                }
                                                            } else {
                                                                z10 = true;
                                                            }
                                                            arrayList.add(new com.ss.android.ugc.aweme.ecommerce.pdp.vh.h(16.0f, z10, 0, 12));
                                                        }
                                                    }
                                                    Integer num5 = productPackStruct.f86639c;
                                                    if (num5 != null && num5.intValue() == z10) {
                                                        SellerInfo sellerInfo = productPackStruct.f86640d;
                                                        if (!(sellerInfo == null || (str12 = sellerInfo.f86658b) == null || str12.length() == 0)) {
                                                            arrayList.add(com.ss.android.ugc.aweme.ecommerce.pdp.d.p.a(productPackStruct));
                                                        }
                                                        arrayList.addAll(com.ss.android.ugc.aweme.ecommerce.pdp.d.e.a(productPackStruct, true));
                                                    }
                                                    return arrayList;
                                                }
                                                z10 = true;
                                                Integer num52 = productPackStruct.f86639c;
                                                SellerInfo sellerInfo2 = productPackStruct.f86640d;
                                                arrayList.add(com.ss.android.ugc.aweme.ecommerce.pdp.d.p.a(productPackStruct));
                                                arrayList.addAll(com.ss.android.ugc.aweme.ecommerce.pdp.d.e.a(productPackStruct, true));
                                                return arrayList;
                                            }

                                            public final void a(int i2, boolean z2) {
                                                c(new y(i2, z2));
                                            }

                                            /* access modifiers changed from: package-private */
                                            public static final class u extends h.f.b.m implements h.f.a.q<Integer, Integer, Long, h.z> {
                                                final /* synthetic */ FlashSale $flashSale;
                                                final /* synthetic */ PdpViewModel this$0;

                                                static {
                                                    Covode.recordClassIndex(54039);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                u(PdpViewModel pdpViewModel, FlashSale flashSale) {
                                                    super(3);
                                                    this.this$0 = pdpViewModel;
                                                    this.$flashSale = flashSale;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                                                @Override // h.f.a.q
                                                public final /* synthetic */ h.z invoke(Integer num, Integer num2, Long l2) {
                                                    FlashSale flashSale;
                                                    FlashSale flashSale2;
                                                    int intValue = num.intValue();
                                                    int intValue2 = num2.intValue();
                                                    final long longValue = l2.longValue();
                                                    com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar = this.this$0.s;
                                                    if (kVar != null) {
                                                        kVar.f86394m = Long.valueOf(longValue);
                                                    }
                                                    if (intValue2 != intValue) {
                                                        ProductPackStruct productPackStruct = null;
                                                        if (intValue == 2) {
                                                            PdpViewModel pdpViewModel = this.this$0;
                                                            ProductPackStruct productPackStruct2 = pdpViewModel.f86303d;
                                                            if (productPackStruct2 != null) {
                                                                productPackStruct = ProductPackStruct.a(productPackStruct2.f86638b, productPackStruct2.f86639c, productPackStruct2.f86640d, productPackStruct2.f86641e, productPackStruct2.f86642f, productPackStruct2.f86643g, productPackStruct2.f86644h, productPackStruct2.f86645i, productPackStruct2.f86646j, productPackStruct2.f86647k, productPackStruct2.f86648l, productPackStruct2.f86649m, productPackStruct2.n, FlashSale.a(flashSale2.f86606a, 2, flashSale2.f86608c, flashSale2.f86609d, flashSale2.f86610e, flashSale2.f86611f, flashSale2.f86612g, flashSale2.f86613h, this.$flashSale.f86614i), productPackStruct2.p, productPackStruct2.q, productPackStruct2.r, productPackStruct2.s, productPackStruct2.t, productPackStruct2.u, productPackStruct2.v, productPackStruct2.w, productPackStruct2.x, productPackStruct2.y, productPackStruct2.z, productPackStruct2.A);
                                                            }
                                                            pdpViewModel.f86303d = productPackStruct;
                                                            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar2 = this.this$0.s;
                                                            if (kVar2 != null) {
                                                                kVar2.a(this.this$0.f86303d);
                                                            }
                                                            PdpViewModel pdpViewModel2 = this.this$0;
                                                            final List<Object> a2 = pdpViewModel2.a(pdpViewModel2.f86303d, true);
                                                            this.this$0.c(new h.f.a.b<PdpMainState, PdpMainState>() {
                                                                /* class com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.u.AnonymousClass1 */

                                                                static {
                                                                    Covode.recordClassIndex(54040);
                                                                }

                                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                @Override // h.f.a.b
                                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                                    h.f.b.l.d(pdpMainState2, "");
                                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, a2, 0.0f, 0, null, 0, false, 2, Long.valueOf(longValue), null, null, null, 59359, null);
                                                                }
                                                            });
                                                            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar3 = this.this$0.s;
                                                            if (kVar3 != null) {
                                                                kVar3.f86393l = 2;
                                                            }
                                                        } else if (intValue == 3) {
                                                            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar4 = this.this$0.s;
                                                            if (kVar4 != null) {
                                                                kVar4.f86393l = 3;
                                                            }
                                                            PdpViewModel pdpViewModel3 = this.this$0;
                                                            ProductPackStruct productPackStruct3 = pdpViewModel3.f86303d;
                                                            if (productPackStruct3 != null) {
                                                                productPackStruct = ProductPackStruct.a(productPackStruct3.f86638b, productPackStruct3.f86639c, productPackStruct3.f86640d, productPackStruct3.f86641e, productPackStruct3.f86642f, productPackStruct3.f86643g, productPackStruct3.f86644h, productPackStruct3.f86645i, productPackStruct3.f86646j, productPackStruct3.f86647k, productPackStruct3.f86648l, productPackStruct3.f86649m, productPackStruct3.n, FlashSale.a(flashSale.f86606a, 3, flashSale.f86608c, flashSale.f86609d, flashSale.f86610e, flashSale.f86611f, flashSale.f86612g, flashSale.f86613h, this.$flashSale.f86614i), productPackStruct3.p, productPackStruct3.q, productPackStruct3.r, productPackStruct3.s, productPackStruct3.t, productPackStruct3.u, productPackStruct3.v, productPackStruct3.w, productPackStruct3.x, productPackStruct3.y, productPackStruct3.z, productPackStruct3.A);
                                                            }
                                                            pdpViewModel3.f86303d = productPackStruct;
                                                            com.ss.android.ugc.aweme.ecommerce.pdp.b.k kVar5 = this.this$0.s;
                                                            if (kVar5 != null) {
                                                                kVar5.a(this.this$0.f86303d);
                                                            }
                                                            PdpViewModel pdpViewModel4 = this.this$0;
                                                            final List<Object> a3 = pdpViewModel4.a(pdpViewModel4.f86303d, false);
                                                            this.this$0.c(new h.f.a.b<PdpMainState, PdpMainState>() {
                                                                /* class com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.u.AnonymousClass2 */

                                                                static {
                                                                    Covode.recordClassIndex(54041);
                                                                }

                                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                @Override // h.f.a.b
                                                                public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                                    PdpMainState pdpMainState2 = pdpMainState;
                                                                    h.f.b.l.d(pdpMainState2, "");
                                                                    return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, a3, 0.0f, 0, null, 0, false, 3, Long.valueOf(longValue), null, null, null, 59359, null);
                                                                }
                                                            });
                                                        }
                                                        this.this$0.a(false, true);
                                                    }
                                                    this.this$0.c(new h.f.a.b<PdpMainState, PdpMainState>() {
                                                        /* class com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.u.AnonymousClass3 */

                                                        static {
                                                            Covode.recordClassIndex(54042);
                                                        }

                                                        /* Return type fixed from 'java.lang.Object' to match base method */
                                                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                        @Override // h.f.a.b
                                                        public final /* synthetic */ PdpMainState invoke(PdpMainState pdpMainState) {
                                                            PdpMainState pdpMainState2 = pdpMainState;
                                                            h.f.b.l.d(pdpMainState2, "");
                                                            return PdpMainState.copy$default(pdpMainState2, false, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, Long.valueOf(longValue), null, null, null, 61439, null);
                                                        }
                                                    });
                                                    return h.z.f158842a;
                                                }
                                            }
                                        }
