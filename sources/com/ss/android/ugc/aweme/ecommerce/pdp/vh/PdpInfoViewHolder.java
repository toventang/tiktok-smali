package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.ecommerce.coupon.a;
import com.ss.android.ugc.aweme.ecommerce.coupon.b;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.CouponCache;
import com.ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.pdp.d.g;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.n;
import h.f.b.l;
import h.h;
import h.z;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class PdpInfoViewHolder extends AbsFullSpanVH<g> implements IEventCenter.b, IEventCenter.b {

    /* renamed from: f  reason: collision with root package name */
    public final CommerceProductInfoView f86701f;

    /* renamed from: g  reason: collision with root package name */
    public CommerceProductInfoView f86702g;

    /* renamed from: j  reason: collision with root package name */
    public int f86703j;

    /* renamed from: k  reason: collision with root package name */
    public int f86704k;

    /* renamed from: l  reason: collision with root package name */
    private final h f86705l;

    /* renamed from: m  reason: collision with root package name */
    private final b f86706m;
    private final Map<String, Voucher> n = new LinkedHashMap();

    static {
        Covode.recordClassIndex(54304);
    }

    public final PdpViewModel n() {
        return (PdpViewModel) this.f86705l.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void g() {
        super.g();
        a(new i(aI_(), (byte) 0));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpInfoViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ PdpInfoViewHolder this$0;

        static {
            Covode.recordClassIndex(54307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PdpInfoViewHolder pdpInfoViewHolder) {
            super(0);
            this.this$0 = pdpInfoViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            PdpInfoViewHolder pdpInfoViewHolder = this.this$0;
            pdpInfoViewHolder.f86704k = pdpInfoViewHolder.f86701f.getHeight();
            PdpInfoViewHolder pdpInfoViewHolder2 = this.this$0;
            pdpInfoViewHolder2.f86703j = pdpInfoViewHolder2.f86702g.getHeight();
            if (!this.this$0.n().f86301b) {
                this.this$0.itemView.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f86711a;

                    static {
                        Covode.recordClassIndex(54308);
                    }

                    {
                        this.f86711a = r1;
                    }

                    public final void run() {
                        View view = this.f86711a.this$0.itemView;
                        l.b(view, "");
                        View view2 = this.f86711a.this$0.itemView;
                        l.b(view2, "");
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        layoutParams.height = this.f86711a.this$0.f86704k;
                        view.setLayoutParams(layoutParams);
                    }
                });
            } else {
                View view = this.this$0.itemView;
                l.b(view, "");
                View view2 = this.this$0.itemView;
                l.b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = this.this$0.f86703j;
                view.setLayoutParams(layoutParams);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        this.f86702g.setAlpha(0.0f);
        this.f86701f.setAlpha(1.0f);
        if (n().f86301b) {
            this.f86702g.setAlpha(1.0f);
            this.f86701f.setAlpha(0.0f);
        } else {
            this.f86702g.setAlpha(0.0f);
            this.f86701f.setAlpha(1.0f);
        }
        n().g(new d(this));
        f.a.b.b unused = selectSubscribe(n(), f.f86782a, new ah(), new e(this));
    }

    static final class d extends h.f.b.m implements h.f.a.b<Float, z> {
        final /* synthetic */ PdpInfoViewHolder this$0;

        static {
            Covode.recordClassIndex(54309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PdpInfoViewHolder pdpInfoViewHolder) {
            super(1);
            this.this$0 = pdpInfoViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Float f2) {
            float floatValue = f2.floatValue();
            this.this$0.f86702g.setAlpha(floatValue);
            this.this$0.f86701f.setAlpha(1.0f - floatValue);
            if (!(this.this$0.f86703j == 0 || this.this$0.f86704k == 0)) {
                View view = this.this$0.itemView;
                l.b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = this.this$0.f86704k + ((int) (((float) (this.this$0.f86703j - this.this$0.f86704k)) * floatValue));
                View view2 = this.this$0.itemView;
                l.b(view2, "");
                view2.setLayoutParams(layoutParams);
            }
            return z.f158842a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpInfoViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559014(0x7f0d0266, float:1.874336E38)
            r0 = 0
            android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            android.view.View r1 = r4.itemView
            r0 = 2131367267(0x7f0a1563, float:1.835445E38)
            android.view.View r2 = r1.findViewById(r0)
            h.f.b.l.b(r2, r3)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView r2 = (com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView) r2
            r4.f86701f = r2
            android.view.View r1 = r4.itemView
            r0 = 2131367265(0x7f0a1561, float:1.8354447E38)
            android.view.View r0 = r1.findViewById(r0)
            h.f.b.l.b(r0, r3)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView r0 = (com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView) r0
            r4.f86702g = r0
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f86705l = r0
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$b r1 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder$b
            r1.<init>(r4, r5)
            r4.f86706m = r1
            r2.setCouponLogListener(r1)
            com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView r0 = r4.f86702g
            r0.setCouponLogListener(r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r4.n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpInfoViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        com.ss.android.ugc.aweme.ecommerce.pdp.c cVar;
        g gVar = (g) obj;
        l.d(gVar, "");
        this.f86704k = 0;
        this.f86703j = 0;
        FlashSale flashSale = gVar.f86470k;
        if (!(flashSale == null || (cVar = n().t) == null)) {
            long j2 = cVar.f86422a;
            this.f86701f.a(flashSale, j2);
            this.f86702g.a(flashSale, j2);
        }
        CommerceProductInfoView commerceProductInfoView = this.f86701f;
        ViewGroup.LayoutParams layoutParams = commerceProductInfoView.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            FrameLayout.LayoutParams layoutParams3 = layoutParams2;
            layoutParams3.height = -2;
            layoutParams3.width = -1;
            commerceProductInfoView.setLayoutParams(layoutParams2);
        }
        CommerceProductInfoView commerceProductInfoView2 = this.f86702g;
        ViewGroup.LayoutParams layoutParams4 = commerceProductInfoView2.getLayoutParams();
        if (!(layoutParams4 instanceof FrameLayout.LayoutParams)) {
            layoutParams4 = null;
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
        if (layoutParams5 != null) {
            FrameLayout.LayoutParams layoutParams6 = layoutParams5;
            layoutParams6.height = -2;
            layoutParams6.width = -1;
            commerceProductInfoView2.setLayoutParams(layoutParams5);
        }
        View view = this.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
        if ((layoutParams7 instanceof ViewGroup.LayoutParams) && layoutParams7 != null) {
            layoutParams7.height = -2;
            layoutParams7.width = -1;
            view.setLayoutParams(layoutParams7);
        }
        this.f86701f.a(gVar, 1, (h.f.a.a<z>) null);
        this.f86702g.a(gVar, Integer.MAX_VALUE, new c(this));
        View view2 = this.itemView;
        l.b(view2, "");
        a.C2089a.a(view2, false);
    }

    public static final class b implements CommerceProductInfoView.d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f86707a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f86708b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PdpInfoViewHolder f86709c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f86710d;

        static {
            Covode.recordClassIndex(54306);
        }

        b(PdpInfoViewHolder pdpInfoViewHolder, ViewGroup viewGroup) {
            this.f86709c = pdpInfoViewHolder;
            this.f86710d = viewGroup;
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.d
        public final void a(String str, String str2) {
            if (!this.f86707a) {
                k kVar = this.f86709c.n().s;
                if (kVar != null) {
                    com.ss.android.ugc.aweme.ecommerce.track.c.a("tiktokec_banner_show", new k.u(kVar, str, str2));
                }
                this.f86707a = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.d
        public final void a(PromotionView promotionView, int i2) {
            String str;
            String str2;
            String str3;
            PromotionView promotionView2;
            List<PromotionItem> promotion_items;
            PromotionItem promotionItem;
            if (!this.f86708b) {
                k kVar = this.f86709c.n().s;
                if (kVar != null) {
                    com.ss.android.ugc.aweme.ecommerce.pdp.b.c cVar = new com.ss.android.ugc.aweme.ecommerce.pdp.b.c();
                    cVar.a(kVar.f86382a);
                    String str4 = null;
                    if (promotionView != null) {
                        str = com.ss.android.ugc.aweme.ecommercebase.dto.a.a(promotionView, i2);
                    } else {
                        str = null;
                    }
                    cVar.b(str);
                    if (promotionView != null) {
                        str2 = com.ss.android.ugc.aweme.ecommercebase.dto.a.b(promotionView, i2);
                    } else {
                        str2 = null;
                    }
                    cVar.a(str2);
                    if (promotionView != null) {
                        str3 = com.ss.android.ugc.aweme.ecommercebase.dto.a.c(promotionView, i2);
                    } else {
                        str3 = null;
                    }
                    cVar.c(str3);
                    ProductPackStruct productPackStruct = kVar.f86391j;
                    if (!(productPackStruct == null || (promotionView2 = productPackStruct.w) == null || (promotion_items = promotionView2.getPromotion_items()) == null || (promotionItem = (PromotionItem) n.h((List) promotion_items)) == null)) {
                        str4 = promotionItem.getLog_extra();
                    }
                    Map<String, ? extends Object> f2 = k.f(str4);
                    if (f2 != null) {
                        cVar.b(f2);
                    }
                    cVar.d();
                }
                this.f86708b = true;
            }
        }

        @Override // com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.d
        public final void b(PromotionView promotionView, int i2) {
            Object obj;
            String str;
            HashMap<String, Object> trackParams;
            String str2;
            String str3;
            String str4;
            String str5;
            PromotionView promotionView2;
            List<PromotionItem> promotion_items;
            PromotionItem promotionItem;
            k kVar = this.f86709c.n().s;
            HashMap<String, Object> hashMap = null;
            if (kVar != null) {
                com.ss.android.ugc.aweme.ecommerce.pdp.b.a aVar = new com.ss.android.ugc.aweme.ecommerce.pdp.b.a();
                aVar.a(kVar.f86382a);
                if (promotionView != null) {
                    str2 = com.ss.android.ugc.aweme.ecommercebase.dto.a.a(promotionView, i2);
                } else {
                    str2 = null;
                }
                aVar.b(str2);
                if (promotionView != null) {
                    str3 = com.ss.android.ugc.aweme.ecommercebase.dto.a.b(promotionView, i2);
                } else {
                    str3 = null;
                }
                aVar.a(str3);
                if (promotionView != null) {
                    str4 = com.ss.android.ugc.aweme.ecommercebase.dto.a.c(promotionView, i2);
                } else {
                    str4 = null;
                }
                aVar.c(str4);
                ProductPackStruct productPackStruct = kVar.f86391j;
                if (productPackStruct == null || (promotionView2 = productPackStruct.w) == null || (promotion_items = promotionView2.getPromotion_items()) == null || (promotionItem = (PromotionItem) n.h((List) promotion_items)) == null) {
                    str5 = null;
                } else {
                    str5 = promotionItem.getLog_extra();
                }
                Map<String, ? extends Object> f2 = k.f(str5);
                if (f2 != null) {
                    aVar.b(f2);
                }
                aVar.d();
            }
            Context context = this.f86710d.getContext();
            if (context instanceof androidx.fragment.app.e) {
                IPdpStarter.PdpEnterParam pdpEnterParam = this.f86709c.n().f86300a;
                if (pdpEnterParam == null || (trackParams = pdpEnterParam.getTrackParams()) == null) {
                    obj = null;
                } else {
                    obj = trackParams.get("entrance_info");
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                IPdpStarter.PdpEnterParam pdpEnterParam2 = this.f86709c.n().f86300a;
                if (pdpEnterParam2 != null) {
                    hashMap = pdpEnterParam2.getTrackParams();
                }
                l.d(context, "");
                b.a.a(context, 1, "product_detail", 2, str, hashMap, null, null);
                PdpInfoViewHolder pdpInfoViewHolder = this.f86709c;
                EventCenter.a().a("ec_voucher_click_claim", pdpInfoViewHolder);
                EventCenter.a().a("ec_voucher_click_cover", pdpInfoViewHolder);
                EventCenter.a().a("ec_voucher_page_close", pdpInfoViewHolder);
            }
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<JediSimpleViewHolder<g>, Long, z> {
        final /* synthetic */ PdpInfoViewHolder this$0;

        static {
            Covode.recordClassIndex(54310);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(PdpInfoViewHolder pdpInfoViewHolder) {
            super(2);
            this.this$0 = pdpInfoViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(JediSimpleViewHolder<g> jediSimpleViewHolder, Long l2) {
            FlashSale flashSale;
            Long l3 = l2;
            l.d(jediSimpleViewHolder, "");
            if (!(l3 == null || l3.longValue() < 0 || (flashSale = ((g) this.this$0.aI_()).f86470k) == null)) {
                this.this$0.f86701f.a(flashSale, l3.longValue());
                this.this$0.f86702g.a(flashSale, l3.longValue());
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        com.ss.android.ugc.aweme.ecommerce.coupon.a a2;
        String voucherID;
        l.d(str, "");
        l.d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != 440795539) {
            if (hashCode != 440904974) {
                if (hashCode != 882422714 || !str.equals("ec_voucher_page_close")) {
                    return;
                }
            } else if (!str.equals("ec_voucher_click_cover")) {
                return;
            }
            IEventCenter a3 = EventCenter.a();
            a3.b("ec_voucher_click_claim", this);
            a3.b("ec_voucher_click_cover", this);
            a3.b("ec_voucher_page_close", this);
        } else if (str.equals("ec_voucher_click_claim") && (a2 = a.C2054a.a(str2)) != null && a2.f85750a != null && (voucherID = a2.f85750a.getVoucherID()) != null && hl.a(voucherID)) {
            String voucherTypeID = a2.f85750a.getVoucherTypeID();
            String voucherID2 = a2.f85750a.getVoucherID();
            l.d(voucherTypeID, "");
            com.ss.android.ugc.aweme.ecommerce.coupon.a.a.f85753a.put(voucherTypeID, new CouponCache(voucherID2, voucherTypeID, 3, System.currentTimeMillis()));
            this.n.put(a2.f85750a.getVoucherTypeID(), a2.f85750a);
        }
    }
}
