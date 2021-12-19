package com.ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner;
import com.ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.a.b;
import com.ss.android.ugc.aweme.utils.bp;
import com.zhiliaoapp.musically.R;
import h.a.am;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class CommerceProductInfoView extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final c f86790d = new c((byte) 0);
    private static final BDDateFormat w = new BDDateFormat("MMM D h:mm A");
    private static final SimpleDateFormat x;

    /* renamed from: a  reason: collision with root package name */
    public int f86791a;

    /* renamed from: b  reason: collision with root package name */
    public PromotionView f86792b;

    /* renamed from: c  reason: collision with root package name */
    public d f86793c;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f86794e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f86795f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f86796g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f86797h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f86798i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f86799j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f86800k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f86801l;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f86802m;
    private final h.h n;
    private final h.h o;
    private final h.h p;
    private final h.h q;
    private final h.h r;
    private final h.h s;
    private final h.h t;
    private final h.h u;
    private WaistBanner v;
    private SparseArray y;

    public interface d {
        static {
            Covode.recordClassIndex(54373);
        }

        void a(PromotionView promotionView, int i2);

        void a(String str, String str2);

        void b(PromotionView promotionView, int i2);
    }

    public CommerceProductInfoView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public CommerceProductInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private View a(int i2) {
        if (this.y == null) {
            this.y = new SparseArray();
        }
        View view = (View) this.y.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.y.put(i2, findViewById);
        return findViewById;
    }

    private final TuxTextView getActivityNameSingle() {
        return (TuxTextView) this.f86802m.getValue();
    }

    private final LogoTuxTextView getDesc() {
        return (LogoTuxTextView) this.f86794e.getValue();
    }

    private final FlashSaleCountDownView getFlashSaleOnCountdown() {
        return (FlashSaleCountDownView) this.r.getValue();
    }

    private final TuxTextView getFlashSaleOnCountdownEndsText() {
        return (TuxTextView) this.s.getValue();
    }

    private final TuxTextView getFlashSaleOnTitle() {
        return (TuxTextView) this.q.getValue();
    }

    private final TuxIconView getIcCoupon() {
        return (TuxIconView) this.o.getValue();
    }

    private final TuxIconView getOpenCouponSheet() {
        return (TuxIconView) this.t.getValue();
    }

    private final TuxTextView getPickName() {
        return (TuxTextView) this.f86801l.getValue();
    }

    private final View getPlaceHolder() {
        return (View) this.n.getValue();
    }

    private final TuxTextView getSales() {
        return (TuxTextView) this.f86795f.getValue();
    }

    private final TuxIconView getWaistBg() {
        return (TuxIconView) this.f86799j.getValue();
    }

    private final LinearLayout getWaistRight() {
        return (LinearLayout) this.f86800k.getValue();
    }

    public final LinearLayout getCouponTags() {
        return (LinearLayout) this.u.getValue();
    }

    public final TuxTextView getDiscount() {
        return (TuxTextView) this.f86798i.getValue();
    }

    public final FlashSaleBg getFlashSaleOnCountDownContainer() {
        return (FlashSaleBg) this.p.getValue();
    }

    public final TuxTextView getMarketPrice() {
        return (TuxTextView) this.f86796g.getValue();
    }

    public final TuxTextView getPrimaryPrice() {
        return (TuxTextView) this.f86797h.getValue();
    }

    public static final class c {
        static {
            Covode.recordClassIndex(54372);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }
    }

    private final boolean a(PickTag pickTag, boolean z2, boolean z3) {
        String str;
        String str2;
        int i2;
        LinearLayout linearLayout = (LinearLayout) a(R.id.a4q);
        h.f.b.l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        String str3 = null;
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            layoutParams = null;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (aVar != null) {
            ConstraintLayout.a aVar2 = aVar;
            if (z2 || !z3) {
                i2 = R.id.ckl;
            } else {
                i2 = R.id.aml;
            }
            aVar2.f2052i = i2;
            linearLayout.setLayoutParams(aVar);
        }
        if (pickTag == null || (str = pickTag.f86620b) == null || str.length() == 0) {
            LinearLayout linearLayout2 = (LinearLayout) a(R.id.a4q);
            h.f.b.l.b(linearLayout2, "");
            linearLayout2.setVisibility(8);
        } else {
            LinearLayout linearLayout3 = (LinearLayout) a(R.id.a4q);
            h.f.b.l.b(linearLayout3, "");
            linearLayout3.setVisibility(0);
            com.bytedance.lighten.a.v a2 = com.ss.android.ugc.aweme.ecommerce.util.g.a((Object) (pickTag != null ? pickTag.f86621c : null));
            a2.F = (ImageView) a(R.id.a4r);
            a2.c();
            if (!(pickTag == null || (str2 = pickTag.f86620b) == null || str2.length() == 0)) {
                TuxTextView tuxTextView = (TuxTextView) a(R.id.a4s);
                h.f.b.l.b(tuxTextView, "");
                if (pickTag != null) {
                    str3 = pickTag.f86620b;
                }
                tuxTextView.setText(str3);
            }
        }
        LinearLayout linearLayout4 = (LinearLayout) a(R.id.a4q);
        h.f.b.l.b(linearLayout4, "");
        return linearLayout4.getVisibility() == 0;
    }

    public final void a(com.ss.android.ugc.aweme.ecommerce.pdp.d.g gVar, int i2, h.f.a.a<h.z> aVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        CharSequence charSequence;
        Float f2;
        Long g2;
        List<PromotionItem> promotion_items;
        FlashSale flashSale;
        Integer num;
        FlashSale flashSale2;
        Integer num2;
        h.f.b.l.d(gVar, "");
        WaistBanner waistBanner = gVar.f86466g;
        int i3 = 0;
        if (waistBanner == null || (waistBanner.f86675a.length() <= 0 && waistBanner.f86676b == null)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 || !((flashSale2 = gVar.f86470k) == null || (num2 = flashSale2.f86607b) == null || num2.intValue() != 2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z5 = gVar.f86465f;
        boolean z6 = !h.m.p.a((CharSequence) gVar.f86462c);
        if ((!z3 || !((flashSale = gVar.f86470k) == null || (num = flashSale.f86607b) == null || num.intValue() != 2)) && !h.m.p.a((CharSequence) gVar.f86464e)) {
            z4 = true;
        } else {
            z4 = false;
        }
        PromotionView promotionView = gVar.o;
        boolean z7 = (promotionView == null || (promotion_items = promotionView.getPromotion_items()) == null || promotion_items.size() <= 0) ? false : true;
        b(z3, gVar);
        b(gVar.f86472m, z3, z5);
        a(gVar.f86472m, z3, z5);
        b(z3, z6);
        a(z3, z4);
        a(a(gVar.f86471l, z6, z4), gVar.f86470k, z6, z4);
        a(z7, gVar);
        TuxTextView primaryPrice = getPrimaryPrice();
        String str = gVar.f86461b;
        if (str.length() == 0) {
            charSequence = "--";
        } else {
            charSequence = new a.C0730a().b(str).f33382a;
        }
        primaryPrice.setText(charSequence);
        TextPaint paint = getMarketPrice().getPaint();
        h.f.b.l.b(paint, "");
        paint.setFlags(16);
        TextPaint paint2 = getMarketPrice().getPaint();
        h.f.b.l.b(paint2, "");
        paint2.setAntiAlias(true);
        getMarketPrice().setText(new a.C0730a().b(gVar.f86462c).f33382a);
        PdpExtraInfoView pdpExtraInfoView = (PdpExtraInfoView) a(R.id.az5);
        String str2 = gVar.f86463d;
        pdpExtraInfoView.setSales((str2 == null || (g2 = h.m.p.g(str2)) == null) ? 0 : g2.longValue());
        PdpExtraInfoView pdpExtraInfoView2 = (PdpExtraInfoView) a(R.id.az5);
        ProductDetailReview productDetailReview = gVar.f86468i;
        pdpExtraInfoView2.setRate((productDetailReview == null || (f2 = productDetailReview.f86630a) == null) ? 0.0f : f2.floatValue());
        PdpExtraInfoView pdpExtraInfoView3 = (PdpExtraInfoView) a(R.id.az5);
        h.f.b.l.b(pdpExtraInfoView3, "");
        if (pdpExtraInfoView3.getVisibility() == 0) {
            LinearLayout linearLayout = (LinearLayout) a(R.id.b9y);
            h.f.b.l.b(linearLayout, "");
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            com.bytedance.tux.h.i.b(linearLayout, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()))), null, null, null, false, 30);
            LinearLayout linearLayout2 = (LinearLayout) a(R.id.b9y);
            h.f.b.l.b(linearLayout2, "");
            linearLayout2.setGravity(8388629);
        } else {
            LinearLayout linearLayout3 = (LinearLayout) a(R.id.b9y);
            h.f.b.l.b(linearLayout3, "");
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            com.bytedance.tux.h.i.b(linearLayout3, Integer.valueOf(h.g.a.a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics()))), null, null, null, false, 30);
            LinearLayout linearLayout4 = (LinearLayout) a(R.id.b9y);
            h.f.b.l.b(linearLayout4, "");
            linearLayout4.setGravity(8388627);
        }
        LinearLayout linearLayout5 = (LinearLayout) a(R.id.b9y);
        h.f.b.l.b(linearLayout5, "");
        if (!gVar.f86469j) {
            i3 = 8;
        }
        linearLayout5.setVisibility(i3);
        getDiscount().setText(gVar.f86464e);
        getDesc().a(gVar.f86460a, gVar.n);
        if (i2 != 1) {
            getDesc().setMaxLines(i2);
        }
        post(new f(this, aVar));
        c(z3, z6, z4);
    }

    public final void a(boolean z2) {
        if (getFlashSaleOnCountDownContainer().getVisibility() != 0) {
            getPrimaryPrice().setMaxWidth(Integer.MAX_VALUE);
            getMarketPrice().setMaxWidth(Integer.MAX_VALUE);
        } else if (com.bytedance.tux.h.i.a(this)) {
            if (!z2) {
                if (getDiscount().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                    getDiscount().setVisibility(4);
                } else {
                    getDiscount().setVisibility(0);
                }
                if (getMarketPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                    TuxTextView marketPrice = getMarketPrice();
                    int width = getWidth() - getFlashSaleOnCountDownContainer().getRight();
                    Resources system = Resources.getSystem();
                    h.f.b.l.a((Object) system, "");
                    marketPrice.setMaxWidth(width - h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())));
                }
            } else if (getDiscount().getLeft() < getFlashSaleOnCountDownContainer().getRight() || getMarketPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight() || getPrimaryPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                a();
            }
        } else if (!z2) {
            if (getDiscount().getRight() > getFlashSaleOnCountDownContainer().getLeft()) {
                getDiscount().setVisibility(4);
            } else {
                getDiscount().setVisibility(0);
            }
            if (getMarketPrice().getRight() > getFlashSaleOnCountDownContainer().getLeft()) {
                TuxTextView marketPrice2 = getMarketPrice();
                int left = getFlashSaleOnCountDownContainer().getLeft();
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                marketPrice2.setMaxWidth(left - h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics())));
            }
        } else if (getDiscount().getRight() > getFlashSaleOnCountDownContainer().getLeft() || getMarketPrice().getRight() > getFlashSaleOnCountDownContainer().getLeft() || getPrimaryPrice().getRight() > getPrimaryPrice().getLeft()) {
            a();
        }
    }

    public final void a(FlashSale flashSale, long j2) {
        com.bytedance.tux.f.d dVar;
        Long g2;
        Long g3;
        h.f.b.l.d(flashSale, "");
        long j3 = j2 + 999;
        getFlashSaleOnCountdown().a(j3, getFlashSaleOnCountdownEndsText());
        StringBuilder sb = new StringBuilder();
        String str = flashSale.f86611f;
        if (str == null) {
            str = "";
        }
        com.bytedance.tux.f.d dVar2 = new com.bytedance.tux.f.d(sb.append(str).append(' ').append(flashSale.f86612g).append(" · ").toString());
        dVar2.a(62);
        int i2 = j3 >= 86400000 ? R.string.bih : R.string.big;
        if (j3 >= 86400000) {
            Integer num = flashSale.f86607b;
            long j4 = 0;
            if (num != null && num.intValue() == 1) {
                String str2 = flashSale.f86609d;
                if (!(str2 == null || (g2 = h.m.p.g(str2)) == null)) {
                    j4 = g2.longValue() * 1000;
                }
                dVar = new com.bytedance.tux.f.d(getContext().getString(i2, BDDateFormat.a(w, j4)));
            } else {
                String str3 = flashSale.f86610e;
                if (!(str3 == null || (g3 = h.m.p.g(str3)) == null)) {
                    j4 = g3.longValue() * 1000;
                }
                dVar = new com.bytedance.tux.f.d(getContext().getString(i2, BDDateFormat.a(w, j4)));
            }
        } else {
            dVar = new com.bytedance.tux.f.d(getContext().getString(i2, x.format(Long.valueOf(j3))));
        }
        TuxTextView tuxTextView = (TuxTextView) a(R.id.b6w);
        h.f.b.l.b(tuxTextView, "");
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) dVar2);
        dVar.a(61);
        tuxTextView.setText(append.append((CharSequence) dVar));
    }

    /* access modifiers changed from: package-private */
    public static final class ac implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86807a;

        static {
            Covode.recordClassIndex(54368);
        }

        ac(CommerceProductInfoView commerceProductInfoView) {
            this.f86807a = commerceProductInfoView;
        }

        public final void run() {
            this.f86807a.a(false);
        }
    }

    public static final class x extends com.bytedance.lighten.a.c.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86816a;

        static {
            Covode.recordClassIndex(54394);
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Throwable th) {
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x f86817a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bitmap f86818b;

            static {
                Covode.recordClassIndex(54395);
            }

            a(x xVar, Bitmap bitmap) {
                this.f86817a = xVar;
                this.f86818b = bitmap;
            }

            public final void run() {
                com.ss.android.ugc.aweme.base.m.f68150a.execute(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.x.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f86819a;

                    static {
                        Covode.recordClassIndex(54396);
                    }

                    {
                        this.f86819a = r1;
                    }

                    public final void run() {
                        this.f86819a.f86817a.f86816a.getFlashSaleOnCountDownContainer().setFlashSaleBg(this.f86819a.f86818b);
                    }
                });
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        x(CommerceProductInfoView commerceProductInfoView) {
            this.f86816a = commerceProductInfoView;
        }

        @Override // com.bytedance.lighten.a.c.n
        public final void a(Bitmap bitmap) {
            if (bitmap != null) {
                com.ss.android.ugc.aweme.cw.g.b().execute(new a(this, bitmap));
            }
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ad(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.findViewById(R.id.flm);
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.fln);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54374);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.cx);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54376);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.findViewById(R.id.age);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<LogoTuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LogoTuxTextView invoke() {
            return this.this$0.findViewById(R.id.bcm);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54378);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.aml);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<FlashSaleBg> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FlashSaleBg invoke() {
            return this.this$0.findViewById(R.id.b6y);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<FlashSaleCountDownView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FlashSaleCountDownView invoke() {
            return this.this$0.findViewById(R.id.b6x);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.b70);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.b71);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54383);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.findViewById(R.id.bhs);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54384);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.ckl);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54385);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.findViewById(R.id.czg);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.d4n);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.findViewById(R.id.d5_);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86813a;

        static {
            Covode.recordClassIndex(54390);
        }

        u(CommerceProductInfoView commerceProductInfoView) {
            this.f86813a = commerceProductInfoView;
        }

        public final void run() {
            this.f86813a.getCouponTags().post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.u.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ u f86814a;

                static {
                    Covode.recordClassIndex(54391);
                }

                {
                    this.f86814a = r1;
                }

                public final void run() {
                    int childCount = this.f86814a.f86813a.getCouponTags().getChildCount();
                    if (childCount >= 0) {
                        int i2 = 0;
                        while (true) {
                            View childAt = this.f86814a.f86813a.getCouponTags().getChildAt(i2);
                            if (childAt != null && childAt.getVisibility() == 0) {
                                this.f86814a.f86813a.f86791a++;
                            }
                            if (i2 == childCount) {
                                break;
                            }
                            i2++;
                        }
                    }
                    d dVar = this.f86814a.f86813a.f86793c;
                    if (dVar != null) {
                        dVar.a(this.f86814a.f86813a.f86792b, this.f86814a.f86813a.f86791a);
                    }
                }
            });
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.d9c);
        }
    }

    static final class z extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.findViewById(R.id.drz);
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f86811b;

        static {
            Covode.recordClassIndex(54375);
        }

        f(CommerceProductInfoView commerceProductInfoView, h.f.a.a aVar) {
            this.f86810a = commerceProductInfoView;
            this.f86811b = aVar;
        }

        public final void run() {
            try {
                h.f.a.a aVar = this.f86811b;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f86810a.a(true);
            } catch (Exception e2) {
                com.bytedance.services.apm.api.a.a((Throwable) e2);
            }
        }
    }

    static {
        Covode.recordClassIndex(54364);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        x = simpleDateFormat;
    }

    /* access modifiers changed from: package-private */
    public static final class aa implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86805a;

        static {
            Covode.recordClassIndex(54366);
        }

        aa(CommerceProductInfoView commerceProductInfoView) {
            this.f86805a = commerceProductInfoView;
        }

        public final void run() {
            TuxTextView primaryPrice = this.f86805a.getPrimaryPrice();
            int width = this.f86805a.getWidth() - this.f86805a.getFlashSaleOnCountDownContainer().getRight();
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            primaryPrice.setMaxWidth(width - h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())));
            if (this.f86805a.getDiscount().getVisibility() == 4) {
                TuxTextView marketPrice = this.f86805a.getMarketPrice();
                int width2 = this.f86805a.getWidth() - this.f86805a.getFlashSaleOnCountDownContainer().getRight();
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                marketPrice.setMaxWidth(width2 - h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics())));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ab implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86806a;

        static {
            Covode.recordClassIndex(54367);
        }

        ab(CommerceProductInfoView commerceProductInfoView) {
            this.f86806a = commerceProductInfoView;
        }

        public final void run() {
            TuxTextView primaryPrice = this.f86806a.getPrimaryPrice();
            int left = this.f86806a.getFlashSaleOnCountDownContainer().getLeft();
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            primaryPrice.setMaxWidth(left - h.g.a.a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())));
            if (this.f86806a.getDiscount().getVisibility() == 4) {
                TuxTextView marketPrice = this.f86806a.getMarketPrice();
                int left2 = this.f86806a.getFlashSaleOnCountDownContainer().getLeft();
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                marketPrice.setMaxWidth(left2 - h.g.a.a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics())));
            }
        }
    }

    private final void a() {
        if (getFlashSaleOnCountDownContainer().getVisibility() == 0) {
            if (com.bytedance.tux.h.i.a(this)) {
                if (getPrimaryPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                    LinearLayout linearLayout = (LinearLayout) a(R.id.b6z);
                    h.f.b.l.b(linearLayout, "");
                    int width = linearLayout.getWidth();
                    Resources system = Resources.getSystem();
                    h.f.b.l.a((Object) system, "");
                    int a2 = width + h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                    int left = getPrimaryPrice().getLeft();
                    Resources system2 = Resources.getSystem();
                    h.f.b.l.a((Object) system2, "");
                    int max = Math.max(a2, left - h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
                    FlashSaleBg flashSaleOnCountDownContainer = getFlashSaleOnCountDownContainer();
                    ViewGroup.LayoutParams layoutParams = flashSaleOnCountDownContainer.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                        if (getFlashSaleOnCountDownContainer().getWidth() > max) {
                            layoutParams.width = max;
                        }
                        flashSaleOnCountDownContainer.setLayoutParams(layoutParams);
                    }
                    post(new aa(this));
                }
            } else if (getPrimaryPrice().getRight() > getFlashSaleOnCountDownContainer().getLeft()) {
                LinearLayout linearLayout2 = (LinearLayout) a(R.id.b6z);
                h.f.b.l.b(linearLayout2, "");
                int width2 = linearLayout2.getWidth();
                Resources system3 = Resources.getSystem();
                h.f.b.l.a((Object) system3, "");
                int a3 = width2 + h.g.a.a(TypedValue.applyDimension(1, 36.0f, system3.getDisplayMetrics()));
                int width3 = getWidth() - getPrimaryPrice().getRight();
                Resources system4 = Resources.getSystem();
                h.f.b.l.a((Object) system4, "");
                int max2 = Math.max(a3, width3 - h.g.a.a(TypedValue.applyDimension(1, 16.0f, system4.getDisplayMetrics())));
                FlashSaleBg flashSaleOnCountDownContainer2 = getFlashSaleOnCountDownContainer();
                ViewGroup.LayoutParams layoutParams2 = flashSaleOnCountDownContainer2.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.LayoutParams) && layoutParams2 != null) {
                    if (getFlashSaleOnCountDownContainer().getWidth() > max2) {
                        layoutParams2.width = max2;
                    }
                    flashSaleOnCountDownContainer2.setLayoutParams(layoutParams2);
                }
                post(new ab(this));
            }
            post(new ac(this));
            return;
        }
        getPrimaryPrice().setMaxWidth(Integer.MAX_VALUE);
        getMarketPrice().setMaxWidth(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<ConstraintLayout.a, h.z> {
        final /* synthetic */ boolean $isDiscountShow;
        final /* synthetic */ boolean $isMarketPriceShow;
        final /* synthetic */ boolean $isWaistShow;

        static {
            Covode.recordClassIndex(54386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(boolean z, boolean z2, boolean z3) {
            super(1);
            this.$isWaistShow = z;
            this.$isMarketPriceShow = z2;
            this.$isDiscountShow = z3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(ConstraintLayout.a aVar) {
            a(aVar);
            return h.z.f158842a;
        }

        public final void a(ConstraintLayout.a aVar) {
            int i2;
            h.f.b.l.d(aVar, "");
            if (this.$isWaistShow) {
                aVar.f2052i = R.id.flm;
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                aVar.topMargin = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
                return;
            }
            if (this.$isMarketPriceShow || !this.$isDiscountShow) {
                i2 = R.id.ckl;
            } else {
                i2 = R.id.aml;
            }
            aVar.f2052i = i2;
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar.topMargin = h.g.a.a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
        }
    }

    public final void setCouponLogListener(d dVar) {
        h.f.b.l.d(dVar, "");
        this.f86793c = dVar;
    }

    public static final class a extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86803a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86804b;

        static {
            Covode.recordClassIndex(54365);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(CommerceProductInfoView commerceProductInfoView) {
            super(700);
            this.f86804b = commerceProductInfoView;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            d dVar;
            if (view != null && (dVar = this.f86804b.f86793c) != null) {
                dVar.b(this.f86804b.f86792b, this.f86804b.f86791a);
            }
        }
    }

    public static final class b extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86808a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommerceProductInfoView f86809b;

        static {
            Covode.recordClassIndex(54371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CommerceProductInfoView commerceProductInfoView) {
            super(700);
            this.f86809b = commerceProductInfoView;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            d dVar;
            if (view != null && (dVar = this.f86809b.f86793c) != null) {
                dVar.b(this.f86809b.f86792b, this.f86809b.f86791a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f86815a = new w();

        static {
            Covode.recordClassIndex(54393);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_bolt_fill;
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 14.0f, system2.getDisplayMetrics()));
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<TagTextView, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f86812a = new t();

        static {
            Covode.recordClassIndex(54389);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(TagTextView tagTextView) {
            TagTextView tagTextView2 = tagTextView;
            h.f.b.l.d(tagTextView2, "");
            tagTextView2.setTextFont(62);
            tagTextView2.setTagLayoutParams(am.b(new com.ss.android.ugc.aweme.ecommercebase.view.a(2, 0, (int) tagTextView2.a(19.0f), (int) tagTextView2.a(8.0f), (int) tagTextView2.a(5.0f), (int) tagTextView2.a(2.0f), (int) tagTextView2.a(13.0f), 0, 0, 3162), new com.ss.android.ugc.aweme.ecommercebase.view.a(1, 0, (int) tagTextView2.a(19.0f), (int) tagTextView2.a(8.0f), (int) tagTextView2.a(4.0f), (int) tagTextView2.a(2.0f), (int) tagTextView2.a(4.0f), 0, 0, 3162)));
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.m<TuxIconView, Integer, h.z> {
        final /* synthetic */ CommerceProductInfoView this$0;

        static {
            Covode.recordClassIndex(54392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(CommerceProductInfoView commerceProductInfoView) {
            super(2);
            this.this$0 = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(TuxIconView tuxIconView, Integer num) {
            a(tuxIconView, num.intValue());
            return h.z.f158842a;
        }

        public final void a(TuxIconView tuxIconView, int i2) {
            h.f.b.l.d(tuxIconView, "");
            if (this.this$0.getVisibility() == 0 && tuxIconView != null) {
                if (tuxIconView.getWidth() != i2 || tuxIconView.getHeight() != i2) {
                    ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                    layoutParams.width = i2;
                    layoutParams.height = i2;
                }
            }
        }
    }

    private final void b(boolean z2, boolean z3) {
        int i2;
        int i3;
        TuxTextView marketPrice = getMarketPrice();
        if (z3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        marketPrice.setVisibility(i2);
        TuxTextView marketPrice2 = getMarketPrice();
        if (z2) {
            i3 = R.attr.ab;
        } else {
            i3 = R.attr.bj;
        }
        marketPrice2.setTextColorRes(i3);
        ViewGroup.LayoutParams layoutParams = getMarketPrice().getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            layoutParams = null;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (aVar != null) {
            if (z2) {
                aVar.topMargin = 0;
            } else {
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                aVar.topMargin = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            }
            getMarketPrice().setLayoutParams(aVar);
        }
    }

    private final void a(boolean z2, com.ss.android.ugc.aweme.ecommerce.pdp.d.g gVar) {
        List<PromotionItem> promotion_items;
        int i2;
        int i3;
        MethodCollector.i(8167);
        if (z2) {
            getCouponTags().setVisibility(0);
            getOpenCouponSheet().setVisibility(0);
        } else {
            getCouponTags().setVisibility(8);
            getOpenCouponSheet().setVisibility(8);
        }
        getCouponTags().removeAllViews();
        int a2 = com.ss.android.ugc.aweme.base.utils.n.a(8.0d);
        if (getCouponTags().getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = getCouponTags().getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
                ViewGroup.LayoutParams layoutParams2 = getOpenCouponSheet().getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams2;
                    int a3 = (((com.bytedance.common.utility.n.a(getContext()) - aVar.leftMargin) - aVar.rightMargin) - aVar2.width) - aVar2.rightMargin;
                    PromotionView promotionView = gVar.o;
                    if (!(promotionView == null || (promotion_items = promotionView.getPromotion_items()) == null)) {
                        int i4 = 0;
                        int i5 = 0;
                        for (T t2 : promotion_items) {
                            int i6 = i4 + 1;
                            if (i4 < 0) {
                                h.a.n.a();
                            }
                            Context context = getContext();
                            h.f.b.l.b(context, "");
                            TagTextView tagTextView = new TagTextView(context, (AttributeSet) null, 6);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            int i7 = Build.VERSION.SDK_INT;
                            layoutParams3.setMarginEnd(a2);
                            tagTextView.setLayoutParams(layoutParams3);
                            tagTextView.a(t.f86812a);
                            tagTextView.setTagUi(b.a.a(t2));
                            SmartImageView smartImageView = (SmartImageView) tagTextView.a(R.id.ehv);
                            h.f.b.l.b(smartImageView, "");
                            if (smartImageView.getVisibility() == 0) {
                                SmartImageView smartImageView2 = (SmartImageView) tagTextView.a(R.id.ehv);
                                h.f.b.l.b(smartImageView2, "");
                                int i8 = smartImageView2.getLayoutParams().width;
                                SmartImageView smartImageView3 = (SmartImageView) tagTextView.a(R.id.ehv);
                                h.f.b.l.b(smartImageView3, "");
                                i2 = i8 + smartImageView3.getPaddingStart() + 0;
                            } else {
                                i2 = 0;
                            }
                            Paint paint = new Paint();
                            TuxTextView tuxTextView = (TuxTextView) tagTextView.a(R.id.ei5);
                            h.f.b.l.b(tuxTextView, "");
                            paint.setTextSize(tuxTextView.getTextSize());
                            int paddingStart = tagTextView.getPaddingStart() + tagTextView.getPaddingEnd();
                            TuxTextView tuxTextView2 = (TuxTextView) tagTextView.a(R.id.ei5);
                            h.f.b.l.b(tuxTextView2, "");
                            int measureText = i2 + paddingStart + ((int) paint.measureText(tuxTextView2.getText().toString()));
                            List<PromotionItem> promotion_items2 = gVar.o.getPromotion_items();
                            if (promotion_items2 == null || i6 != promotion_items2.size()) {
                                i3 = a2;
                            } else {
                                i3 = 0;
                            }
                            i5 += measureText + i3;
                            if (tagTextView.f87698a && i5 <= a3) {
                                getCouponTags().addView(tagTextView);
                            }
                            i4 = i6;
                        }
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.o(8167);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                MethodCollector.o(8167);
                throw nullPointerException2;
            }
        }
        this.f86792b = gVar.o;
        if (z2) {
            this.f86791a = 0;
            getCouponTags().post(new u(this));
        }
        MethodCollector.o(8167);
    }

    private final void b(boolean z2, com.ss.android.ugc.aweme.ecommerce.pdp.d.g gVar) {
        boolean z3;
        boolean z4;
        boolean z5;
        Integer num;
        if (z2) {
            getWaistBg().setVisibility(0);
            if (gVar.f86470k == null || (num = gVar.f86470k.f86607b) == null || num.intValue() != 2) {
                WaistBanner waistBanner = gVar.f86466g;
                if (waistBanner != null && (waistBanner.f86675a.length() > 0 || waistBanner.f86676b != null)) {
                    getFlashSaleOnCountDownContainer().setVisibility(8);
                    getWaistRight().setVisibility(0);
                    if (gVar.f86466g.f86675a.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = !z3;
                    String str = gVar.f86466g.f86677c;
                    if (str == null || str.length() == 0) {
                        getPickName().setVisibility(8);
                        z4 = false;
                    } else {
                        getPickName().setText(str);
                        if (z6) {
                            getPickName().setTuxFont(72);
                        } else {
                            getPickName().setTuxFont(52);
                        }
                        getPickName().setVisibility(0);
                        z4 = true;
                    }
                    String str2 = gVar.f86466g.f86675a;
                    if (str2 == null || str2.length() == 0) {
                        getActivityNameSingle().setVisibility(8);
                        z5 = false;
                    } else {
                        if (z4) {
                            getActivityNameSingle().setText(h.m.p.a(str2, "\\n", " "));
                            getActivityNameSingle().setTuxFont(92);
                            getActivityNameSingle().setTextColor(androidx.core.content.b.c(getContext(), R.color.bd));
                            getActivityNameSingle().setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.a9));
                            a(getActivityNameSingle(), 3.0d, 3.0d);
                        } else {
                            getActivityNameSingle().setText(h.m.p.a(str2, "\\n", "\n"));
                            getActivityNameSingle().setTuxFont(62);
                            getActivityNameSingle().setTextColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
                            getActivityNameSingle().setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.c9));
                            a(getActivityNameSingle(), 0.0d, 0.0d);
                        }
                        getActivityNameSingle().setVisibility(0);
                        z5 = true;
                    }
                    if (!z4 || !z5) {
                        getPlaceHolder().setVisibility(8);
                    } else {
                        getPlaceHolder().setVisibility(0);
                    }
                    Image image = gVar.f86466g.f86676b;
                    if (image != null) {
                        com.bytedance.lighten.a.v a2 = com.ss.android.ugc.aweme.ecommerce.util.g.a((Object) image);
                        a2.v = com.bytedance.lighten.a.w.CENTER_CROP;
                        a2.F = getWaistBg();
                        a2.c();
                    }
                    d dVar = this.f86793c;
                    if (dVar != null) {
                        dVar.a(gVar.f86466g.f86675a, gVar.f86466g.f86677c);
                    }
                }
            } else {
                getFlashSaleOnCountDownContainer().setVisibility(0);
                getWaistRight().setVisibility(8);
                TuxTextView flashSaleOnTitle = getFlashSaleOnTitle();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                com.bytedance.tux.c.a a3 = com.bytedance.tux.c.c.a(w.f86815a);
                Context context = getContext();
                String str3 = "";
                h.f.b.l.b(context, str3);
                com.bytedance.tux.f.a.c b2 = a3.b(context);
                Context context2 = getContext();
                h.f.b.l.b(context2, str3);
                boolean a4 = com.bytedance.tux.h.i.a(context2);
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, str3);
                b2.a(a4, h.g.a.a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics())));
                com.ss.android.ugc.aweme.ecommerce.util.n.a(spannableStringBuilder, " ", b2);
                String str4 = gVar.f86470k.f86611f;
                if (str4 != null) {
                    str3 = str4;
                }
                spannableStringBuilder.append((CharSequence) str3);
                flashSaleOnTitle.setText(spannableStringBuilder);
                Image image2 = gVar.f86470k.f86613h;
                if (image2 != null) {
                    com.bytedance.lighten.a.v a5 = com.ss.android.ugc.aweme.ecommerce.util.g.a((Object) image2);
                    a5.v = com.bytedance.lighten.a.w.CENTER_CROP;
                    a5.F = getWaistBg();
                    a5.c();
                }
                com.ss.android.ugc.aweme.ecommerce.util.g.a((Object) gVar.f86470k.f86614i).a(new x(this));
                d dVar2 = this.f86793c;
                if (dVar2 != null) {
                    dVar2.a("flashsale", (String) null);
                }
            }
        } else {
            getWaistBg().setVisibility(8);
            getWaistRight().setVisibility(8);
            getFlashSaleOnCountDownContainer().setVisibility(8);
        }
        this.v = gVar.f86466g;
    }

    private final void a(boolean z2, boolean z3) {
        int i2;
        TuxTextView discount = getDiscount();
        if (z3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        discount.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = getDiscount().getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            layoutParams = null;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (aVar != null) {
            if (z2) {
                aVar.f2054k = R.id.flm;
                aVar.topMargin = 0;
                getDiscount().setTextColor(androidx.core.content.b.c(getContext(), R.color.a9));
                getDiscount().setBackgroundResource(R.drawable.xr);
            } else {
                aVar.f2054k = -1;
                aVar.topMargin = com.ss.android.ugc.aweme.base.utils.n.a(4.0d);
                getDiscount().setTextColor(androidx.core.content.b.c(getContext(), R.color.bh));
                getDiscount().setBackgroundResource(R.drawable.yf);
            }
            getDiscount().setLayoutParams(aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CommerceProductInfoView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    private final void b(boolean z2, boolean z3, boolean z4) {
        int i2;
        int i3;
        TuxIconView icCoupon = getIcCoupon();
        if (z4) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        icCoupon.setVisibility(i2);
        TuxIconView icCoupon2 = getIcCoupon();
        if (z3) {
            i3 = R.attr.aa;
        } else {
            i3 = R.attr.ay;
        }
        icCoupon2.setTintColorRes(i3);
        v vVar = new v(this);
        if (z2) {
            vVar.a(getIcCoupon(), com.ss.android.ugc.aweme.base.utils.n.a(16.0d));
        } else {
            vVar.a(getIcCoupon(), com.ss.android.ugc.aweme.base.utils.n.a(20.0d));
        }
    }

    private static void a(View view, double d2, double d3) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (d2 != 0.0d) {
            i2 = com.ss.android.ugc.aweme.base.utils.n.a(d2);
        } else {
            i2 = 0;
        }
        if (d2 != 0.0d) {
            i3 = com.ss.android.ugc.aweme.base.utils.n.a(0.0d);
        } else {
            i3 = 0;
        }
        if (d2 != 0.0d) {
            i4 = com.ss.android.ugc.aweme.base.utils.n.a(d3);
        } else {
            i4 = 0;
        }
        if (d2 != 0.0d) {
            i5 = com.ss.android.ugc.aweme.base.utils.n.a(0.0d);
        }
        if (i2 != view.getPaddingLeft() || i3 != view.getPaddingTop() || i4 != view.getPaddingRight() || i5 != view.getPaddingBottom()) {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceProductInfoView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        h.f.b.l.d(context, "");
        MethodCollector.i(8557);
        this.f86794e = h.i.a((h.f.a.a) new h(this));
        this.f86795f = h.i.a((h.f.a.a) new z(this));
        this.f86796g = h.i.a((h.f.a.a) new o(this));
        this.f86797h = h.i.a((h.f.a.a) new y(this));
        this.f86798i = h.i.a((h.f.a.a) new i(this));
        this.f86799j = h.i.a((h.f.a.a) new ad(this));
        this.f86800k = h.i.a((h.f.a.a) new ae(this));
        this.f86801l = h.i.a((h.f.a.a) new r(this));
        this.f86802m = h.i.a((h.f.a.a) new e(this));
        this.n = h.i.a((h.f.a.a) new s(this));
        this.o = h.i.a((h.f.a.a) new n(this));
        this.p = h.i.a((h.f.a.a) new j(this));
        this.q = h.i.a((h.f.a.a) new m(this));
        this.r = h.i.a((h.f.a.a) new k(this));
        this.s = h.i.a((h.f.a.a) new l(this));
        this.t = h.i.a((h.f.a.a) new p(this));
        this.u = h.i.a((h.f.a.a) new g(this));
        com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(context, R.layout.q1, this, true);
        getOpenCouponSheet().setOnClickListener(new a(this));
        getCouponTags().setOnClickListener(new b(this));
        MethodCollector.o(8557);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        if (r16 != false) goto L_0x0129;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.c(boolean, boolean, boolean):void");
    }

    private final void a(boolean z2, boolean z3, boolean z4) {
        int i2;
        TuxTextView primaryPrice = getPrimaryPrice();
        if (z3) {
            i2 = R.attr.aa;
        } else if (z4) {
            i2 = R.attr.ay;
        } else {
            i2 = R.attr.bc;
        }
        primaryPrice.setTextColorRes(i2);
        ViewGroup.LayoutParams layoutParams = getPrimaryPrice().getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            layoutParams = null;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (aVar != null) {
            if (!z3) {
                aVar.topMargin = com.ss.android.ugc.aweme.base.utils.n.a(16.0d);
            } else if (z2) {
                Resources system = Resources.getSystem();
                h.f.b.l.a((Object) system, "");
                aVar.topMargin = h.g.a.a(TypedValue.applyDimension(1, 7.5f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                h.f.b.l.a((Object) system2, "");
                aVar.topMargin = h.g.a.a(TypedValue.applyDimension(1, 5.0f, system2.getDisplayMetrics()));
            }
            getPrimaryPrice().setLayoutParams(aVar);
        }
        if (z2) {
            getPrimaryPrice().setTuxFont(32);
        } else {
            getPrimaryPrice().setTuxFont(22);
        }
    }

    private final void a(boolean z2, FlashSale flashSale, boolean z3, boolean z4) {
        Integer num;
        int i2;
        LinearLayout linearLayout = (LinearLayout) a(R.id.b6u);
        h.f.b.l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.a)) {
            layoutParams = null;
        }
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (aVar != null) {
            ConstraintLayout.a aVar2 = aVar;
            if (z3 || !z4) {
                i2 = R.id.ckl;
            } else {
                i2 = R.id.aml;
            }
            aVar2.f2052i = i2;
            linearLayout.setLayoutParams(aVar);
        }
        if (!(flashSale == null || (num = flashSale.f86607b) == null)) {
            if (num.intValue() == 1) {
                LinearLayout linearLayout2 = (LinearLayout) a(R.id.b6u);
                h.f.b.l.b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            } else if (num.intValue() == 2) {
                LinearLayout linearLayout3 = (LinearLayout) a(R.id.b6u);
                h.f.b.l.b(linearLayout3, "");
                linearLayout3.setVisibility(8);
            }
        }
        if (z2) {
            LinearLayout linearLayout4 = (LinearLayout) a(R.id.b6u);
            h.f.b.l.b(linearLayout4, "");
            linearLayout4.setVisibility(8);
        }
    }
}
