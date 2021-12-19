package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.k.c;

public final class PdpReviewHeadViewHolder extends AbsFullSpanVH<ProductDetailReview> implements au {

    /* renamed from: f  reason: collision with root package name */
    final h f86712f;

    /* renamed from: g  reason: collision with root package name */
    public ProductDetailReview f86713g;

    static {
        Covode.recordClassIndex(54311);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
        View view = this.itemView;
        l.b(view, "");
        a.C2089a.a(view, false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void g() {
        super.g();
        a(new i(aI_(), (byte) 0));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ c $viewModelClass;
        final /* synthetic */ c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, c cVar, c cVar2) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpReviewHeadViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86714a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpReviewHeadViewHolder f86715b;

        static {
            Covode.recordClassIndex(54313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(PdpReviewHeadViewHolder pdpReviewHeadViewHolder) {
            super(700);
            this.f86715b = pdpReviewHeadViewHolder;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                Context context = view.getContext();
                l.b(context, "");
                ((PdpViewModel) this.f86715b.f86712f.getValue()).e(context);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpReviewHeadViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559015(0x7f0d0267, float:1.8743362E38)
            r0 = 0
            android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f86712f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewHeadViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        ProductDetailReview productDetailReview = (ProductDetailReview) obj;
        l.d(productDetailReview, "");
        this.f86713g = productDetailReview;
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ahv);
        l.b(tuxTextView, "");
        View view2 = this.itemView;
        l.b(view2, "");
        tuxTextView.setText(view2.getContext().getString(R.string.bhv, String.valueOf(productDetailReview.f86631b)));
        View view3 = this.itemView;
        l.b(view3, "");
        ((RatingNumber) view3.findViewById(R.id.dhd)).setStyle(2);
        if (productDetailReview.f86630a != null) {
            View view4 = this.itemView;
            l.b(view4, "");
            RatingNumber ratingNumber = (RatingNumber) view4.findViewById(R.id.dhd);
            l.b(ratingNumber, "");
            ratingNumber.setVisibility(0);
            View view5 = this.itemView;
            l.b(view5, "");
            TuxIconView tuxIconView = (TuxIconView) view5.findViewById(R.id.e9j);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(0);
            View view6 = this.itemView;
            l.b(view6, "");
            ((RatingNumber) view6.findViewById(R.id.dhd)).getScore().setText(String.valueOf(productDetailReview.f86630a.floatValue()));
        } else {
            View view7 = this.itemView;
            l.b(view7, "");
            RatingNumber ratingNumber2 = (RatingNumber) view7.findViewById(R.id.dhd);
            l.b(ratingNumber2, "");
            ratingNumber2.setVisibility(8);
            View view8 = this.itemView;
            l.b(view8, "");
            TuxIconView tuxIconView2 = (TuxIconView) view8.findViewById(R.id.e9j);
            l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(8);
        }
        View view9 = this.itemView;
        l.b(view9, "");
        view9.setOnClickListener(new b(this));
    }
}
