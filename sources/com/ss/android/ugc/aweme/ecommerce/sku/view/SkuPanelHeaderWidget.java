package com.ss.android.ugc.aweme.ecommerce.sku.view;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.b.k;
import com.ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.a.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class SkuPanelHeaderWidget extends SkuPanelBaseWidget implements au {
    public static final a r = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    public SmartImageView f87446h;

    /* renamed from: i  reason: collision with root package name */
    public TuxIconView f87447i;

    /* renamed from: j  reason: collision with root package name */
    public TuxTextView f87448j;

    /* renamed from: k  reason: collision with root package name */
    public TuxTextView f87449k;

    /* renamed from: l  reason: collision with root package name */
    public TagTextView f87450l;

    /* renamed from: m  reason: collision with root package name */
    public TuxTextView f87451m;
    public TuxTextView n;
    public TuxTextView o;
    public int p;
    public int q;
    private final int s = R.layout.qz;
    private Barrier t;
    private Barrier u;

    static {
        Covode.recordClassIndex(54941);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.k, com.ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54942);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.widget.Widget
    public final int b() {
        return this.s;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    public final void m() {
        super.m();
        SkuPanelViewModel l2 = l();
        f.a.b.b unused = selectSubscribe(l2, f.f87459a, new ah(), new b(this));
        f.a.b.b unused2 = selectSubscribe(l2, j.f87463a, new ah(), new c(this));
        f.a.b.b unused3 = selectSubscribe(l2, k.f87464a, new ah(), new d(this));
        f.a.b.b unused4 = selectSubscribe(l2, l.f87465a, new ah(), new e(this));
        f.a.b.b unused5 = selectSubscribe(l2, m.f87466a, new ah(), new f(this));
        f.a.b.b unused6 = selectSubscribe(l2, g.f87460a, new ah(), new g(this));
        f.a.b.b unused7 = selectSubscribe(l2, h.f87461a, new ah(), new h(this));
        f.a.b.b unused8 = selectSubscribe(l2, i.f87462a, new ah(), new i(this));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    public final void n() {
        super.n();
        this.f87446h = (SmartImageView) a(R.id.e5j);
        this.f87447i = (TuxIconView) a(R.id.e5f);
        this.f87448j = (TuxTextView) a(R.id.e5m);
        this.f87449k = (TuxTextView) a(R.id.e5k);
        this.f87450l = (TagTextView) a(R.id.e5o);
        this.f87451m = (TuxTextView) a(R.id.e5n);
        this.n = (TuxTextView) a(R.id.e5l);
        this.o = (TuxTextView) a(R.id.e5h);
        this.t = (Barrier) a(R.id.e5i);
        this.u = (Barrier) a(R.id.e5g);
        Barrier barrier = this.t;
        if (barrier == null) {
            l.a("discountLineBarrier");
        }
        barrier.setReferencedIds(new int[]{R.id.e5h, R.id.e5l});
        Barrier barrier2 = this.u;
        if (barrier2 == null) {
            l.a("skuHeaderBarrier");
        }
        barrier2.setReferencedIds(new int[]{R.id.e5n, R.id.e5j});
        TuxTextView tuxTextView = this.n;
        if (tuxTextView == null) {
            l.a("originalPriceView");
        }
        TextPaint paint = tuxTextView.getPaint();
        l.b(paint, "");
        paint.setFlags(16);
        TuxTextView tuxTextView2 = this.n;
        if (tuxTextView2 == null) {
            l.a("originalPriceView");
        }
        TextPaint paint2 = tuxTextView2.getPaint();
        l.b(paint2, "");
        paint2.setAntiAlias(true);
        SmartImageView smartImageView = this.f87446h;
        if (smartImageView == null) {
            l.a("headerImageView");
        }
        smartImageView.setOnClickListener(new j(this));
        this.p = (int) n.b(a().getContext(), 8.0f);
        this.q = (int) n.b(a().getContext(), 0.0f);
    }

    public static final /* synthetic */ TuxTextView a(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.f87448j;
        if (tuxTextView == null) {
            l.a("priceView");
        }
        return tuxTextView;
    }

    public static final /* synthetic */ TuxTextView b(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.f87449k;
        if (tuxTextView == null) {
            l.a("lowStockWarningView");
        }
        return tuxTextView;
    }

    public static final /* synthetic */ TuxTextView c(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.n;
        if (tuxTextView == null) {
            l.a("originalPriceView");
        }
        return tuxTextView;
    }

    public static final /* synthetic */ TuxTextView d(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.o;
        if (tuxTextView == null) {
            l.a("discountTextView");
        }
        return tuxTextView;
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SkuPanelHeaderWidget f87453a;

        static {
            Covode.recordClassIndex(54952);
        }

        j(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            this.f87453a = skuPanelHeaderWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SkuPanelHeaderWidget skuPanelHeaderWidget = this.f87453a;
            skuPanelHeaderWidget.withState(skuPanelHeaderWidget.l(), new h.f.a.b<SkuState, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget.j.AnonymousClass1 */
                final /* synthetic */ j this$0;

                static {
                    Covode.recordClassIndex(54953);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(SkuState skuState) {
                    String productId;
                    Object obj;
                    String str;
                    SkuState skuState2 = skuState;
                    String str2 = "";
                    l.d(skuState2, str2);
                    if (l.a((Object) skuState2.getKeyBoardVisibility(), (Object) true)) {
                        this.this$0.f87453a.l().a(false);
                    } else {
                        List<Image> list = this.this$0.f87453a.l().f87500a;
                        if (list != null && !list.isEmpty()) {
                            k a2 = k.a.a(com.bytedance.jedi.ext.adapter.b.b(this.this$0.f87453a));
                            if (a2 != null) {
                                Image image = (Image) h.a.n.b((List) this.this$0.f87453a.l().f87500a, skuState2.getCurrentImagePosition());
                                if (image != null) {
                                    str = image.getUri();
                                } else {
                                    str = null;
                                }
                                a2.d(str);
                            }
                            androidx.fragment.app.e b2 = com.bytedance.jedi.ext.adapter.b.b(this.this$0.f87453a);
                            int currentImagePosition = skuState2.getCurrentImagePosition();
                            int size = this.this$0.f87453a.l().f87500a.size();
                            List<Image> list2 = this.this$0.f87453a.l().f87500a;
                            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                List<String> list3 = it.next().toImageUrlModel().f39811a;
                                if (list3 == null || (obj = h.a.n.b((List) list3, 0)) == null) {
                                    obj = str2;
                                }
                                arrayList.add(obj);
                            }
                            ArrayList arrayList2 = arrayList;
                            List<String> list4 = this.this$0.f87453a.l().f87501b;
                            SkuPanelStarter.SkuEnterParams skuEnterParams = this.this$0.f87453a.l().f87504e;
                            if (!(skuEnterParams == null || (productId = skuEnterParams.getProductId()) == null)) {
                                str2 = productId;
                            }
                            com.ss.android.ugc.aweme.ecommerce.gallery.a.a(b2, currentImagePosition, size, arrayList2, str2, "sku", list4, null, null, null, 14144);
                        }
                    }
                    return z.f158842a;
                }
            });
        }
    }

    static final class d extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54946);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            l.d(iVar, "");
            l.d(str2, "");
            SkuPanelHeaderWidget.a(this.this$0).setText(str2);
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54949);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            l.d(iVar, "");
            l.d(str2, "");
            TuxTextView tuxTextView = this.this$0.f87451m;
            if (tuxTextView == null) {
                l.a("specsView");
            }
            tuxTextView.setText(str2);
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            int i2;
            int i3;
            l.d(iVar, "");
            TuxIconView tuxIconView = this.this$0.f87447i;
            if (tuxIconView == null) {
                l.a("couponIcon");
            }
            if (l.a((Object) bool, (Object) true)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
            TuxTextView a2 = SkuPanelHeaderWidget.a(this.this$0);
            if (l.a((Object) bool, (Object) true)) {
                i3 = R.attr.ay;
            } else {
                i3 = R.attr.bc;
            }
            a2.setTextColorRes(i3);
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            l.d(iVar, "");
            if (str2 == null || !(!l.a((Object) str2, (Object) ""))) {
                SkuPanelHeaderWidget.b(this.this$0).setVisibility(8);
            } else {
                SkuPanelHeaderWidget.b(this.this$0).setVisibility(0);
                SkuPanelHeaderWidget.b(this.this$0).setText(str2);
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, PromotionView, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54948);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, PromotionView promotionView) {
            PromotionItem promotionItem;
            List<PromotionItem> promotion_items;
            PromotionView promotionView2 = promotionView;
            l.d(iVar, "");
            if (promotionView2 == null || (promotion_items = promotionView2.getPromotion_items()) == null) {
                promotionItem = null;
            } else {
                promotionItem = (PromotionItem) h.a.n.h((List) promotion_items);
            }
            com.ss.android.ugc.aweme.ecommercebase.view.a.b a2 = b.a.a(promotionItem);
            TagTextView tagTextView = this.this$0.f87450l;
            if (tagTextView == null) {
                l.a("promotionTag");
            }
            tagTextView.setTagUi(a2);
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54951);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            l.d(iVar, "");
            if (str2 == null || !(!p.a((CharSequence) str2))) {
                SkuPanelHeaderWidget.d(this.this$0).setVisibility(8);
            } else {
                SkuPanelHeaderWidget.d(this.this$0).setVisibility(0);
                SkuPanelHeaderWidget.d(this.this$0).setText(str2);
            }
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, Image, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Image image) {
            Image image2 = image;
            l.d(iVar, "");
            if (image2 != null) {
                final com.ss.android.ugc.aweme.ecommerce.preloader.c cVar = new com.ss.android.ugc.aweme.ecommerce.preloader.c();
                cVar.a("sku_head");
                cVar.a(-1);
                cVar.a(image2.toThumbFirstImageUrlModel());
                v a2 = r.a(image2.toThumbFirstImageUrlModel()).a("SkuPanelHeaderWidget");
                SmartImageView smartImageView = this.this$0.f87446h;
                if (smartImageView == null) {
                    l.a("headerImageView");
                }
                a2.E = smartImageView;
                a2.a(new com.bytedance.lighten.a.c.k() {
                    /* class com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(54944);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri) {
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view) {
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, o oVar) {
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, Throwable th) {
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, Throwable th) {
                        cVar.a(th);
                    }

                    @Override // com.bytedance.lighten.a.c.k
                    public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                        cVar.a(oVar);
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ SkuPanelHeaderWidget this$0;

        static {
            Covode.recordClassIndex(54950);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.this$0 = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            l.d(iVar, "");
            if (str2 != null) {
                SkuPanelHeaderWidget.c(this.this$0).setVisibility(0);
                SkuPanelHeaderWidget.c(this.this$0).setText(str2);
                ViewGroup.LayoutParams layoutParams = SkuPanelHeaderWidget.d(this.this$0).getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.a) layoutParams).leftMargin = this.this$0.p;
            } else {
                SkuPanelHeaderWidget.c(this.this$0).setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = SkuPanelHeaderWidget.d(this.this$0).getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.a) layoutParams2).leftMargin = this.this$0.q;
            }
            return z.f158842a;
        }
    }
}
