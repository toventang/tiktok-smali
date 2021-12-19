package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.FlowLayout;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText;
import com.ss.android.ugc.aweme.ecommerce.util.g;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.h;
import h.m.p;
import h.z;
import java.util.List;

public final class PdpReviewViewHolder extends AbsFullSpanVH<ReviewItemStruct> implements au {

    /* renamed from: f  reason: collision with root package name */
    public ReviewItemStruct f86716f;

    /* renamed from: g  reason: collision with root package name */
    private final h f86717g;

    final /* synthetic */ class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f86722a;

        static {
            Covode.recordClassIndex(54321);
        }

        d(h.f.a.a aVar) {
            this.f86722a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f86722a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(54314);
    }

    public final PdpViewModel n() {
        return (PdpViewModel) this.f86717g.getValue();
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

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ FlowLayout $flow;
        final /* synthetic */ List $images;
        final /* synthetic */ int $plus;
        final /* synthetic */ PdpReviewViewHolder this$0;

        static {
            Covode.recordClassIndex(54316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PdpReviewViewHolder pdpReviewViewHolder, FlowLayout flowLayout, List list, int i2) {
            super(0);
            this.this$0 = pdpReviewViewHolder;
            this.$flow = flowLayout;
            this.$images = list;
            this.$plus = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            final int width = (this.$flow.getWidth() - (com.ss.android.ugc.aweme.ecommerce.util.h.f87572f * 3)) / 4;
            FlowLayout flowLayout = this.$flow;
            List list = this.$images;
            com.ss.android.ugc.aweme.ecommerce.review.viewholder.a.a(flowLayout, list.subList(0, Math.min(4, list.size())), new h.f.a.a<View>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(54317);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ View invoke() {
                    View a2 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(this.this$0.$flow.getContext(), R.layout.q5, this.this$0.$flow, false);
                    ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                        layoutParams.width = width;
                        layoutParams.height = width;
                        a2.setLayoutParams(layoutParams);
                    }
                    return a2;
                }
            }, new q<View, Image, Integer, z>(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder.b.AnonymousClass2 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(54318);
                }

                {
                    this.this$0 = r2;
                }

                /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$b$2$a */
                public static final class a extends bp {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ long f86718a = 700;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass2 f86719b;

                    static {
                        Covode.recordClassIndex(54319);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public a(AnonymousClass2 r3) {
                        super(700);
                        this.f86719b = r3;
                    }

                    @Override // com.ss.android.ugc.aweme.utils.bp
                    public final void a(View view) {
                        if (view != null) {
                            PdpViewModel n = this.f86719b.this$0.this$0.n();
                            Context context = view.getContext();
                            l.b(context, "");
                            n.e(context);
                        }
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // h.f.a.q
                public final /* synthetic */ z invoke(View view, Image image, Integer num) {
                    View view2 = view;
                    Image image2 = image;
                    int intValue = num.intValue();
                    l.d(image2, "");
                    v a2 = g.a(image2.toThumbFirstImageUrlModel());
                    a2.v = w.CENTER_CROP;
                    a2.f39916l = R.color.f159926j;
                    a2.w = g.f87565a;
                    a2.E = (SmartImageView) view2.findViewById(R.id.dmo);
                    a2.c();
                    view2.setOnClickListener(new a(this));
                    if (intValue == 3) {
                        com.bytedance.tux.h.i.b(view2, null, null, 0, null, false, 27);
                    }
                    if (this.this$0.$plus <= 0 || intValue != 3) {
                        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.e07);
                        l.b(tuxTextView, "");
                        tuxTextView.setVisibility(8);
                    } else {
                        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.e07);
                        l.b(tuxTextView2, "");
                        tuxTextView2.setVisibility(0);
                        if (gb.a()) {
                            TuxTextView tuxTextView3 = (TuxTextView) view2.findViewById(R.id.e07);
                            l.b(tuxTextView3, "");
                            tuxTextView3.setText(new StringBuilder().append(this.this$0.$plus).append('+').toString());
                        } else {
                            TuxTextView tuxTextView4 = (TuxTextView) view2.findViewById(R.id.e07);
                            l.b(tuxTextView4, "");
                            tuxTextView4.setText("+" + this.this$0.$plus);
                        }
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<PdpViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54315);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_pdp_vh_PdpReviewViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f86720a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PdpReviewViewHolder f86721b;

        static {
            Covode.recordClassIndex(54320);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(PdpReviewViewHolder pdpReviewViewHolder) {
            super(700);
            this.f86721b = pdpReviewViewHolder;
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                PdpViewModel n = this.f86721b.n();
                Context context = view.getContext();
                l.b(context, "");
                n.e(context);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PdpReviewViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559022(0x7f0d026e, float:1.8743376E38)
            r0 = 0
            android.view.View r0 = com.ss.android.ugc.aweme.ecommerce.pdp.c.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.pdp.PdpViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f86717g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.pdp.vh.PdpReviewViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        String str;
        float f2;
        String str2;
        Image image;
        ReviewItemStruct reviewItemStruct = (ReviewItemStruct) obj;
        l.d(reviewItemStruct, "");
        this.f86716f = reviewItemStruct;
        View view = this.itemView;
        l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fe1);
        l.b(tuxTextView, "");
        ReviewItemStruct.User user = reviewItemStruct.f87061g;
        if (user == null || (str = user.f87077b) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.e52);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(reviewItemStruct.f87056b);
        RatingStar ratingStar = (RatingStar) view.findViewById(R.id.e9k);
        l.b(ratingStar, "");
        ratingStar.setVisibility(0);
        RatingStar ratingStar2 = (RatingStar) view.findViewById(R.id.e9k);
        Float c2 = p.c(reviewItemStruct.f87055a.f87069b);
        if (c2 != null) {
            f2 = c2.floatValue();
        } else {
            f2 = 0.0f;
        }
        ratingStar2.setRate(f2);
        RatingStar ratingStar3 = (RatingStar) view.findViewById(R.id.e9e);
        l.b(ratingStar3, "");
        ratingStar3.setVisibility(8);
        if (!reviewItemStruct.f87055a.a()) {
            View view2 = this.itemView;
            l.b(view2, "");
            str2 = view2.getContext().getString(R.string.bhu);
        } else {
            str2 = reviewItemStruct.f87055a.f87070c;
        }
        if (hl.a(reviewItemStruct.f87055a.f87070c) || !reviewItemStruct.f87055a.b()) {
            ViewMoreText viewMoreText = (ViewMoreText) view.findViewById(R.id.dmm);
            l.b(viewMoreText, "");
            viewMoreText.setVisibility(0);
        } else {
            ViewMoreText viewMoreText2 = (ViewMoreText) view.findViewById(R.id.dmm);
            l.b(viewMoreText2, "");
            viewMoreText2.setVisibility(8);
        }
        ViewMoreText.a((ViewMoreText) view.findViewById(R.id.dmm), str2, 2, false, null, 8);
        ReviewItemStruct.User user2 = reviewItemStruct.f87061g;
        if (user2 != null) {
            image = user2.f87078c;
        } else {
            image = null;
        }
        v a2 = g.a(image);
        a2.f39916l = R.drawable.cc1;
        a2.E = (SmartImageView) view.findViewById(R.id.or);
        a2.c();
        view.setOnClickListener(new c(this));
        ((FlowLayout) view.findViewById(R.id.dms)).setGravity(-1);
        FlowLayout flowLayout = (FlowLayout) view.findViewById(R.id.dms);
        l.b(flowLayout, "");
        List<Image> list = reviewItemStruct.f87055a.f87071d;
        if (list == null || list.isEmpty()) {
            flowLayout.setVisibility(8);
            return;
        }
        flowLayout.setVisibility(0);
        b bVar = new b(this, flowLayout, list, list.size() - 4);
        if (flowLayout.getWidth() == 0) {
            flowLayout.post(new d(bVar));
        } else {
            bVar.invoke();
        }
    }
}
