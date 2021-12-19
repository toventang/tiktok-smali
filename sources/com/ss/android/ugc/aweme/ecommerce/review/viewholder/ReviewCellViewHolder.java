package com.ss.android.ugc.aweme.ecommerce.review.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.a.a;
import com.bytedance.tux.tag.TuxTag;
import com.bytedance.tux.widget.FlowLayout;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bo;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.ss.android.ugc.aweme.ecommerce.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.review.a.a;
import com.ss.android.ugc.aweme.ecommerce.review.f;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewTags;
import com.ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.ss.android.ugc.aweme.ecommerce.review.view.ViewMoreText;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class ReviewCellViewHolder extends JediSimpleViewHolder<com.ss.android.ugc.aweme.ecommerce.review.a.a> implements au {

    /* renamed from: k  reason: collision with root package name */
    public static final int f87117k;

    /* renamed from: l  reason: collision with root package name */
    public static final b f87118l = new b((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public View f87119f;

    /* renamed from: g  reason: collision with root package name */
    public a.C2096a f87120g;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.fragment.app.i f87121j;

    /* renamed from: m  reason: collision with root package name */
    private final h.h f87122m;

    public final ProductReviewViewModel m() {
        return (ProductReviewViewModel) this.f87122m.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54650);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void e() {
        super.e();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void g() {
        super.g();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void f() {
        super.f();
        this.itemView.post(new n(this));
    }

    public static final class h extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87135a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReviewCellViewHolder f87136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReviewItemStruct f87137c;

        static {
            Covode.recordClassIndex(54658);
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(54659);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h hVar) {
                super(0);
                this.this$0 = hVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f87136b.m().a(this.this$0.f87137c);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f87136b.a((h.f.a.a<z>) new a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(700);
            this.f87136b = reviewCellViewHolder;
            this.f87137c = reviewItemStruct;
        }
    }

    public static final class i extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87138a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReviewCellViewHolder f87139b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReviewItemStruct f87140c;

        static {
            Covode.recordClassIndex(54660);
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ i this$0;

            static {
                Covode.recordClassIndex(54661);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(i iVar) {
                super(0);
                this.this$0 = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f87139b.m().a(this.this$0.f87140c);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                this.f87139b.a((h.f.a.a<z>) new a(this));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(700);
            this.f87139b = reviewCellViewHolder;
            this.f87140c = reviewItemStruct;
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f87123a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReviewCellViewHolder f87124b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReviewItemStruct.AppendReview f87125c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.C2096a f87126d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f87127e;

        static {
            Covode.recordClassIndex(54652);
        }

        d(View view, ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct.AppendReview appendReview, a.C2096a aVar, String str) {
            this.f87123a = view;
            this.f87124b = reviewCellViewHolder;
            this.f87125c = appendReview;
            this.f87126d = aVar;
            this.f87127e = str;
        }

        public final void run() {
            ReviewCellViewHolder reviewCellViewHolder = this.f87124b;
            FlowLayout flowLayout = (FlowLayout) this.f87123a.findViewById(R.id.dms);
            h.f.b.l.b(flowLayout, "");
            reviewCellViewHolder.a(flowLayout, this.f87125c.f87065b);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ FlowLayout $flow;
        final /* synthetic */ int $size;

        static {
            Covode.recordClassIndex(54653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FlowLayout flowLayout, int i2) {
            super(0);
            this.$flow = flowLayout;
            this.$size = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            SmartImageView smartImageView = new SmartImageView(this.$flow.getContext());
            int i2 = this.$size;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, i2);
            int i3 = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginEnd(com.ss.android.ugc.aweme.ecommerce.util.h.f87572f);
            marginLayoutParams.rightMargin = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
            marginLayoutParams.bottomMargin = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f;
            smartImageView.setLayoutParams(marginLayoutParams);
            return smartImageView;
        }
    }

    static {
        Covode.recordClassIndex(54648);
        int i2 = com.ss.android.ugc.aweme.ecommerce.util.h.f87567a;
        Resources system = Resources.getSystem();
        h.f.b.l.a((Object) system, "");
        f87117k = i2 - h.g.a.a(TypedValue.applyDimension(1, 76.0f, system.getDisplayMetrics()));
    }

    public static final class a extends h.f.b.m implements h.f.a.a<ProductReviewViewModel> {
        final /* synthetic */ JediViewHolder $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(54649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(JediViewHolder jediViewHolder, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jediViewHolder;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_ecommerce_review_viewholder_ReviewCellViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<TuxTag> {
        final /* synthetic */ LinearLayout $container;

        static {
            Covode.recordClassIndex(54663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(LinearLayout linearLayout) {
            super(0);
            this.$container = linearLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTag invoke() {
            Context context = this.$container.getContext();
            h.f.b.l.b(context, "");
            TuxTag tuxTag = new TuxTag(context, null, 0, 6);
            tuxTag.setTagSize(0);
            tuxTag.setBackgroundColor(androidx.core.content.b.c(tuxTag.getContext(), R.color.f159923g));
            tuxTag.setTextColor(androidx.core.content.b.c(tuxTag.getContext(), R.color.c5));
            tuxTag.setTuxFont(92);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginEnd(com.ss.android.ugc.aweme.ecommerce.util.h.f87572f / 2);
            layoutParams.rightMargin = com.ss.android.ugc.aweme.ecommerce.util.h.f87572f / 2;
            layoutParams.gravity = 16;
            tuxTag.setLayoutParams(layoutParams);
            return tuxTag;
        }
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReviewCellViewHolder f87143a;

        static {
            Covode.recordClassIndex(54666);
        }

        n(ReviewCellViewHolder reviewCellViewHolder) {
            this.f87143a = reviewCellViewHolder;
        }

        public final void run() {
            List<Image> list;
            boolean z;
            boolean z2;
            View view = this.f87143a.itemView;
            h.f.b.l.b(view, "");
            if (view.getY() < ((float) com.ss.android.ugc.aweme.ecommerce.util.h.f87568b)) {
                com.ss.android.ugc.aweme.ecommerce.review.a.a aVar = (com.ss.android.ugc.aweme.ecommerce.review.a.a) this.f87143a.aI_();
                if (!(aVar instanceof a.C2096a)) {
                    aVar = null;
                }
                a.C2096a aVar2 = (a.C2096a) aVar;
                if (aVar2 != null) {
                    com.ss.android.ugc.aweme.ecommerce.review.f fVar = this.f87143a.m().f86969b;
                    if (fVar != null) {
                        ReviewItemStruct reviewItemStruct = aVar2.f86985a;
                        h.f.b.l.d(reviewItemStruct, "");
                        f.i iVar = new f.i(fVar, reviewItemStruct);
                        List<Image> list2 = reviewItemStruct.f87055a.f87071d;
                        if (list2 != null) {
                            int i2 = 0;
                            for (T t : list2) {
                                int i3 = i2 + 1;
                                if (i2 < 0) {
                                    h.a.n.a();
                                }
                                ReviewItemStruct.MainReview mainReview = reviewItemStruct.f87055a;
                                String valueOf = String.valueOf(t.getUri());
                                String valueOf2 = String.valueOf(i2);
                                Boolean bool = reviewItemStruct.f87060f;
                                if (bool != null) {
                                    z2 = bool.booleanValue();
                                } else {
                                    z2 = false;
                                }
                                iVar.a(mainReview, valueOf, valueOf2, z2);
                                i2 = i3;
                            }
                        }
                        ReviewItemStruct.AppendReview appendReview = reviewItemStruct.f87055a.f87073f;
                        if (!(appendReview == null || (list = appendReview.f87065b) == null)) {
                            int i4 = 0;
                            for (T t2 : list) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    h.a.n.a();
                                }
                                ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.f87055a;
                                String valueOf3 = String.valueOf(t2.getUri());
                                String valueOf4 = String.valueOf(i4);
                                Boolean bool2 = reviewItemStruct.f87060f;
                                if (bool2 != null) {
                                    z = bool2.booleanValue();
                                } else {
                                    z = false;
                                }
                                iVar.a(mainReview2, valueOf3, valueOf4, z);
                                i4 = i5;
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.ecommerce.review.f fVar2 = this.f87143a.m().f86969b;
                    if (fVar2 != null) {
                        ReviewItemStruct reviewItemStruct2 = aVar2.f86985a;
                        int i6 = this.f87143a.f39676i;
                        h.f.b.l.d(reviewItemStruct2, "");
                        if (!fVar2.f87015f.contains(reviewItemStruct2.f87055a.f87068a)) {
                            fVar2.f87015f.add(reviewItemStruct2.f87055a.f87068a);
                            com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar2.f87019j, "tiktokec_review_show", new f.m(fVar2, i6, reviewItemStruct2));
                        }
                    }
                }
            }
        }
    }

    public static final class g extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f87132a = 700;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReviewCellViewHolder f87133b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReviewItemStruct f87134c;

        static {
            Covode.recordClassIndex(54656);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            if (view != null) {
                ReviewCellViewHolder reviewCellViewHolder = this.f87133b;
                reviewCellViewHolder.withState(reviewCellViewHolder.m(), new a(this));
            }
        }

        static final class a extends h.f.b.m implements h.f.a.b<ProductReviewState, z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(54657);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(1);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(ProductReviewState productReviewState) {
                ProductReviewState productReviewState2 = productReviewState;
                h.f.b.l.d(productReviewState2, "");
                ProductReviewViewModel m2 = this.this$0.f87133b.m();
                View view = this.this$0.f87133b.itemView;
                h.f.b.l.b(view, "");
                Context context = view.getContext();
                h.f.b.l.b(context, "");
                androidx.fragment.app.i iVar = this.this$0.f87133b.f87121j;
                ReviewItemStruct reviewItemStruct = this.this$0.f87134c;
                String productId = productReviewState2.getProductId();
                h.f.b.l.d(context, "");
                h.f.b.l.d(reviewItemStruct, "");
                h.f.b.l.d(productId, "");
                String str = reviewItemStruct.f87055a.f87068a;
                com.ss.android.ugc.aweme.ecommerce.review.f fVar = m2.f86969b;
                if (fVar != null) {
                    h.f.b.l.d(reviewItemStruct, "");
                    com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar.f87019j, "tiktokec_report_entrance_show", new f.l(fVar, reviewItemStruct));
                }
                new a.b().a(R.string.a9e).a(new ProductReviewViewModel.i(m2, reviewItemStruct)).b(h.a.n.a(new a.e().a(R.string.bhz).a(new ProductReviewViewModel.j(m2, iVar, context, reviewItemStruct, str)))).b().show(iVar, "review_more");
                return z.f158842a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(700);
            this.f87133b = reviewCellViewHolder;
            this.f87134c = reviewItemStruct;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<CharSequence, CharSequence> {
        final /* synthetic */ String $fromSeller;

        static {
            Covode.recordClassIndex(54667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(1);
            this.$fromSeller = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            h.f.b.l.d(charSequence2, "");
            return com.ss.android.ugc.aweme.ecommerce.util.n.a(charSequence2, this.$fromSeller);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<CharSequence, CharSequence> {
        final /* synthetic */ String $fromSeller;

        static {
            Covode.recordClassIndex(54668);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.$fromSeller = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(CharSequence charSequence) {
            CharSequence charSequence2 = charSequence;
            h.f.b.l.d(charSequence2, "");
            return com.ss.android.ugc.aweme.ecommerce.util.n.a(charSequence2, this.$fromSeller);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ ReviewItemStruct.AppendReview $appendReviewStruct$inlined;
        final /* synthetic */ View $it;
        final /* synthetic */ String $reviewId$inlined;
        final /* synthetic */ a.C2096a $reviewVO$inlined;
        final /* synthetic */ ReviewCellViewHolder this$0;

        static {
            Covode.recordClassIndex(54651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view, ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct.AppendReview appendReview, a.C2096a aVar, String str) {
            super(1);
            this.$it = view;
            this.this$0 = reviewCellViewHolder;
            this.$appendReviewStruct$inlined = appendReview;
            this.$reviewVO$inlined = aVar;
            this.$reviewId$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.m().a(this.$reviewId$inlined, 1);
                ViewMoreText.a((ViewMoreText) this.$it.findViewById(R.id.dmm), this.$appendReviewStruct$inlined.f87064a, 0, false, null, 14);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ ReviewItemStruct $reviewData;
        final /* synthetic */ ReviewCellViewHolder this$0;

        static {
            Covode.recordClassIndex(54662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ReviewCellViewHolder reviewCellViewHolder, ReviewItemStruct reviewItemStruct) {
            super(1);
            this.this$0 = reviewCellViewHolder;
            this.$reviewData = reviewItemStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.m().a(this.$reviewData.f87055a.f87068a, 0);
                View view = this.this$0.itemView;
                h.f.b.l.b(view, "");
                ViewMoreText.a((ViewMoreText) view.findViewById(R.id.dmm), this.$reviewData.f87055a.f87070c, 0, false, null, 14);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ String $display;
        final /* synthetic */ boolean $fromAppendReview;
        final /* synthetic */ String $fromSeller;
        final /* synthetic */ String $reviewId;
        final /* synthetic */ ViewMoreText $view;
        final /* synthetic */ ReviewCellViewHolder this$0;

        static {
            Covode.recordClassIndex(54669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(ReviewCellViewHolder reviewCellViewHolder, boolean z, String str, ViewMoreText viewMoreText, String str2, String str3) {
            super(1);
            this.this$0 = reviewCellViewHolder;
            this.$fromAppendReview = z;
            this.$reviewId = str;
            this.$view = viewMoreText;
            this.$display = str2;
            this.$fromSeller = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                if (this.$fromAppendReview) {
                    this.this$0.m().a(this.$reviewId, 3);
                } else {
                    this.this$0.m().a(this.$reviewId, 2);
                }
                ViewMoreText.a(this.$view, this.$display, 0, false, new h.f.a.b<CharSequence, CharSequence>(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder.q.AnonymousClass1 */
                    final /* synthetic */ q this$0;

                    static {
                        Covode.recordClassIndex(54670);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ CharSequence invoke(CharSequence charSequence) {
                        CharSequence charSequence2 = charSequence;
                        h.f.b.l.d(charSequence2, "");
                        return com.ss.android.ugc.aweme.ecommerce.util.n.a(charSequence2, this.this$0.$fromSeller);
                    }
                }, 6);
            }
            return z.f158842a;
        }
    }

    public final void a(h.f.a.a<z> aVar) {
        IAccountService a2 = AccountService.a();
        IAccountUserService e2 = a2.e();
        h.f.b.l.b(e2, "");
        if (!e2.isLogin()) {
            bo g2 = a2.g();
            IAccountService.d dVar = new IAccountService.d();
            dVar.f62401a = com.bytedance.jedi.ext.adapter.b.b(this);
            dVar.f62405e = new m(aVar);
            g2.showLoginAndRegisterView(dVar.a());
            return;
        }
        aVar.invoke();
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.q<SmartImageView, Image, Integer, z> {
        final /* synthetic */ List $imageStrList;
        final /* synthetic */ List $images;
        final /* synthetic */ ReviewCellViewHolder this$0;

        static {
            Covode.recordClassIndex(54654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ReviewCellViewHolder reviewCellViewHolder, List list, List list2) {
            super(3);
            this.this$0 = reviewCellViewHolder;
            this.$images = list;
            this.$imageStrList = list2;
        }

        public static final class a extends bp {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ long f87128a = 700;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f87129b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f87130c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Image f87131d;

            static {
                Covode.recordClassIndex(54655);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                String str;
                boolean z;
                String str2;
                ReviewItemStruct reviewItemStruct;
                ReviewItemStruct.User user;
                ReviewItemStruct reviewItemStruct2;
                ReviewItemStruct reviewItemStruct3;
                Boolean bool;
                ReviewItemStruct reviewItemStruct4;
                ReviewItemStruct.MainReview mainReview;
                if (view != null) {
                    Context context = view.getContext();
                    h.f.b.l.b(context, "");
                    com.ss.android.ugc.aweme.ecommerce.gallery.a.a(context, this.f87130c, this.f87129b.$images.size(), this.f87129b.$imageStrList, null, null, null, null, null, null, 16368);
                    com.ss.android.ugc.aweme.ecommerce.review.f fVar = this.f87129b.this$0.m().f86969b;
                    if (fVar != null) {
                        a.C2096a aVar = this.f87129b.this$0.f87120g;
                        if (aVar == null || (reviewItemStruct4 = aVar.f86985a) == null || (mainReview = reviewItemStruct4.f87055a) == null || (str = mainReview.f87068a) == null) {
                            str = "";
                        }
                        String valueOf = String.valueOf(this.f87131d.getUri());
                        String valueOf2 = String.valueOf(this.f87130c);
                        Object aI_ = this.f87129b.this$0.aI_();
                        String str3 = null;
                        if (!(aI_ instanceof a.C2096a)) {
                            aI_ = null;
                        }
                        a.C2096a aVar2 = (a.C2096a) aI_;
                        if (aVar2 == null || (reviewItemStruct3 = aVar2.f86985a) == null || (bool = reviewItemStruct3.f87060f) == null) {
                            z = false;
                        } else {
                            z = bool.booleanValue();
                        }
                        a.C2096a aVar3 = this.f87129b.this$0.f87120g;
                        if (aVar3 == null || (reviewItemStruct2 = aVar3.f86985a) == null) {
                            str2 = null;
                        } else {
                            str2 = reviewItemStruct2.f87057c;
                        }
                        a.C2096a aVar4 = this.f87129b.this$0.f87120g;
                        if (!(aVar4 == null || (reviewItemStruct = aVar4.f86985a) == null || (user = reviewItemStruct.f87061g) == null)) {
                            str3 = user.f87076a;
                        }
                        h.f.b.l.d(str, "");
                        h.f.b.l.d(valueOf, "");
                        h.f.b.l.d(valueOf2, "");
                        com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar.f87019j, "tiktokec_photo_click", new f.h(fVar, valueOf, valueOf2, str2, str3, str, z));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, int i2, Image image) {
                super(700);
                this.f87129b = fVar;
                this.f87130c = i2;
                this.f87131d = image;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(SmartImageView smartImageView, Image image, Integer num) {
            SmartImageView smartImageView2 = smartImageView;
            Image image2 = image;
            int intValue = num.intValue();
            h.f.b.l.d(smartImageView2, "");
            h.f.b.l.d(image2, "");
            if ((intValue + 1) % 4 == 0) {
                com.bytedance.tux.h.i.b(smartImageView2, null, null, 0, null, false, 27);
            }
            v a2 = com.ss.android.ugc.aweme.ecommerce.util.g.a(image2.toThumbFirstImageUrlModel());
            a2.v = w.CENTER_CROP;
            a2.w = com.ss.android.ugc.aweme.ecommerce.util.g.f87565a;
            a2.f39916l = R.color.f159926j;
            a2.E = smartImageView2;
            a2.c();
            smartImageView2.setOnClickListener(new a(this, intValue, image2));
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.review.a.a aVar) {
        MethodCollector.i(4205);
        com.ss.android.ugc.aweme.ecommerce.review.a.a aVar2 = aVar;
        h.f.b.l.d(aVar2, "");
        a.C2096a aVar3 = (a.C2096a) aVar2;
        this.f87120g = aVar3;
        View view = this.itemView;
        h.f.b.l.b(view, "");
        a.C2089a.a(view, aVar3.f86990f);
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        RatingStar ratingStar = (RatingStar) view2.findViewById(R.id.e9k);
        h.f.b.l.b(ratingStar, "");
        ratingStar.setVisibility(8);
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        RatingStar ratingStar2 = (RatingStar) view3.findViewById(R.id.e9e);
        h.f.b.l.b(ratingStar2, "");
        ratingStar2.setVisibility(0);
        a(aVar3);
        String str = aVar3.f86985a.f87055a.f87068a;
        ReviewItemStruct.AppendReview appendReview = aVar3.f86985a.f87055a.f87073f;
        if (appendReview == null) {
            View view4 = this.f87119f;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        } else {
            if (this.f87119f == null) {
                View view5 = this.itemView;
                h.f.b.l.b(view5, "");
                this.f87119f = ((ViewStub) view5.findViewById(R.id.dmk)).inflate();
            }
            View view6 = this.f87119f;
            if (view6 != null) {
                view6.setVisibility(0);
                TuxTextView tuxTextView = (TuxTextView) view6.findViewById(R.id.dmv);
                h.f.b.l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = (TuxTextView) view6.findViewById(R.id.dmv);
                h.f.b.l.b(tuxTextView2, "");
                Context context = view6.getContext();
                h.f.b.l.b(context, "");
                tuxTextView2.setText(context.getResources().getQuantityString(R.plurals.b_, Integer.parseInt(appendReview.f87066c), Integer.valueOf(Integer.parseInt(appendReview.f87066c))));
                if (hl.a(appendReview.f87064a) || !(!appendReview.f87065b.isEmpty())) {
                    ViewMoreText viewMoreText = (ViewMoreText) view6.findViewById(R.id.dmm);
                    h.f.b.l.b(viewMoreText, "");
                    viewMoreText.setVisibility(0);
                } else {
                    ViewMoreText viewMoreText2 = (ViewMoreText) view6.findViewById(R.id.dmm);
                    h.f.b.l.b(viewMoreText2, "");
                    viewMoreText2.setVisibility(8);
                }
                if (aVar3.f86987c) {
                    ViewMoreText.a((ViewMoreText) view6.findViewById(R.id.dmm), appendReview.f87064a, 0, false, null, 14);
                } else {
                    ViewMoreText.a((ViewMoreText) view6.findViewById(R.id.dmm), appendReview.f87064a, 4, true, null, 8);
                    ((ViewMoreText) view6.findViewById(R.id.dmm)).setExpandListener(new c(view6, this, appendReview, aVar3, str));
                }
                ViewMoreText viewMoreText3 = (ViewMoreText) view6.findViewById(R.id.f159974dmt);
                h.f.b.l.b(viewMoreText3, "");
                a(viewMoreText3, str, appendReview.f87067d, true, aVar3.f86989e);
                view6.post(new d(view6, this, appendReview, aVar3, str));
            }
        }
        View view7 = this.itemView;
        h.f.b.l.b(view7, "");
        LinearLayout linearLayout = (LinearLayout) view7.findViewById(R.id.fdv);
        h.f.b.l.b(linearLayout, "");
        a.a(linearLayout, aVar3.f86985a.f87062h, new k(linearLayout), l.f87141a);
        MethodCollector.o(4205);
    }

    private final void a(a.C2096a aVar) {
        String str;
        long j2;
        Image image;
        String str2;
        Integer num;
        ReviewItemStruct reviewItemStruct = aVar.f86985a;
        View view = this.itemView;
        h.f.b.l.b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fe1);
        h.f.b.l.b(tuxTextView, "");
        ReviewItemStruct.User user = reviewItemStruct.f87061g;
        if (user == null || (str = user.f87077b) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        View view2 = this.itemView;
        h.f.b.l.b(view2, "");
        TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.e52);
        h.f.b.l.b(tuxTextView2, "");
        tuxTextView2.setText(reviewItemStruct.f87056b);
        View view3 = this.itemView;
        h.f.b.l.b(view3, "");
        TuxTextView tuxTextView3 = (TuxTextView) view3.findViewById(R.id.dmn);
        h.f.b.l.b(tuxTextView3, "");
        View view4 = this.itemView;
        h.f.b.l.b(view4, "");
        Context context = view4.getContext();
        Long g2 = h.m.p.g(reviewItemStruct.f87055a.f87072e);
        if (g2 != null) {
            j2 = g2.longValue();
        } else {
            j2 = 0;
        }
        tuxTextView3.setText(ib.c(context, j2));
        if (!m().a()) {
            View view5 = this.itemView;
            h.f.b.l.b(view5, "");
            TuxIconView tuxIconView = (TuxIconView) view5.findViewById(R.id.co2);
            h.f.b.l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
        } else {
            View view6 = this.itemView;
            h.f.b.l.b(view6, "");
            TuxIconView tuxIconView2 = (TuxIconView) view6.findViewById(R.id.co2);
            h.f.b.l.b(tuxIconView2, "");
            tuxIconView2.setVisibility(0);
        }
        View view7 = this.itemView;
        h.f.b.l.b(view7, "");
        TuxIconView tuxIconView3 = (TuxIconView) view7.findViewById(R.id.co2);
        h.f.b.l.b(tuxIconView3, "");
        tuxIconView3.setOnClickListener(new g(this, reviewItemStruct));
        ReviewItemStruct.User user2 = reviewItemStruct.f87061g;
        if (user2 != null) {
            image = user2.f87078c;
        } else {
            image = null;
        }
        v a2 = com.ss.android.ugc.aweme.ecommerce.util.g.a(image);
        View view8 = this.itemView;
        h.f.b.l.b(view8, "");
        a2.E = (SmartImageView) view8.findViewById(R.id.or);
        a2.f39916l = R.drawable.cc1;
        a2.c();
        if (h.f.b.l.a((Object) reviewItemStruct.f87059e, (Object) true)) {
            View view9 = this.itemView;
            h.f.b.l.b(view9, "");
            ((AppCompatImageView) view9.findViewById(R.id.c_o)).setImageResource(R.drawable.z0);
        } else {
            View view10 = this.itemView;
            h.f.b.l.b(view10, "");
            ((AppCompatImageView) view10.findViewById(R.id.c_o)).setImageResource(R.drawable.yz);
        }
        View view11 = this.itemView;
        h.f.b.l.b(view11, "");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view11.findViewById(R.id.c_o);
        h.f.b.l.b(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new h(this, reviewItemStruct));
        View view12 = this.itemView;
        h.f.b.l.b(view12, "");
        TuxTextView tuxTextView4 = (TuxTextView) view12.findViewById(R.id.c_s);
        h.f.b.l.b(tuxTextView4, "");
        tuxTextView4.setOnClickListener(new i(this, reviewItemStruct));
        if (reviewItemStruct.f87058d == null || ((num = reviewItemStruct.f87058d) != null && num.intValue() == 0)) {
            View view13 = this.itemView;
            h.f.b.l.b(view13, "");
            TuxTextView tuxTextView5 = (TuxTextView) view13.findViewById(R.id.c_s);
            h.f.b.l.b(tuxTextView5, "");
            tuxTextView5.setText("");
        } else {
            View view14 = this.itemView;
            h.f.b.l.b(view14, "");
            TuxTextView tuxTextView6 = (TuxTextView) view14.findViewById(R.id.c_s);
            h.f.b.l.b(tuxTextView6, "");
            tuxTextView6.setText(String.valueOf(reviewItemStruct.f87058d.intValue()));
        }
        if (!reviewItemStruct.f87055a.a()) {
            View view15 = this.itemView;
            h.f.b.l.b(view15, "");
            str2 = view15.getContext().getString(R.string.bhu);
        } else {
            str2 = reviewItemStruct.f87055a.f87070c;
        }
        if (hl.a(reviewItemStruct.f87055a.f87070c) || !reviewItemStruct.f87055a.b()) {
            View view16 = this.itemView;
            h.f.b.l.b(view16, "");
            ViewMoreText viewMoreText = (ViewMoreText) view16.findViewById(R.id.dmm);
            h.f.b.l.b(viewMoreText, "");
            viewMoreText.setVisibility(0);
        } else {
            View view17 = this.itemView;
            h.f.b.l.b(view17, "");
            ViewMoreText viewMoreText2 = (ViewMoreText) view17.findViewById(R.id.dmm);
            h.f.b.l.b(viewMoreText2, "");
            viewMoreText2.setVisibility(8);
        }
        if (aVar.f86986b) {
            View view18 = this.itemView;
            h.f.b.l.b(view18, "");
            ViewMoreText.a((ViewMoreText) view18.findViewById(R.id.dmm), str2, 0, false, null, 14);
        } else {
            View view19 = this.itemView;
            h.f.b.l.b(view19, "");
            ViewMoreText.a((ViewMoreText) view19.findViewById(R.id.dmm), str2, 4, true, null, 8);
            View view20 = this.itemView;
            h.f.b.l.b(view20, "");
            ((ViewMoreText) view20.findViewById(R.id.dmm)).setExpandListener(new j(this, reviewItemStruct));
        }
        View view21 = this.itemView;
        h.f.b.l.b(view21, "");
        FlowLayout flowLayout = (FlowLayout) view21.findViewById(R.id.dms);
        h.f.b.l.b(flowLayout, "");
        a(flowLayout, aVar.f86985a.f87055a.f87071d);
        View view22 = this.itemView;
        h.f.b.l.b(view22, "");
        ViewMoreText viewMoreText3 = (ViewMoreText) view22.findViewById(R.id.f159974dmt);
        h.f.b.l.b(viewMoreText3, "");
        a(viewMoreText3, reviewItemStruct.f87055a.f87068a, reviewItemStruct.f87055a.f87074g, false, aVar.f86988d);
        View view23 = this.itemView;
        h.f.b.l.b(view23, "");
        ((RatingStar) view23.findViewById(R.id.e9k)).setRate(Float.parseFloat(reviewItemStruct.f87055a.f87069b));
        View view24 = this.itemView;
        h.f.b.l.b(view24, "");
        ((RatingStar) view24.findViewById(R.id.e9e)).setRate(Float.parseFloat(reviewItemStruct.f87055a.f87069b));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReviewCellViewHolder(androidx.fragment.app.i r5, android.view.ViewGroup r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            h.f.b.l.d(r6, r3)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559029(0x7f0d0275, float:1.874339E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r6, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            r4.f87121j = r5
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel> r0 = com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.class
            h.k.c r1 = h.f.b.ab.a(r0)
            com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder$a
            r0.<init>(r4, r1, r1)
            h.h r0 = h.i.a(r0)
            r4.f87122m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder.<init>(androidx.fragment.app.i, android.view.ViewGroup):void");
    }

    public final void a(FlowLayout flowLayout, List<Image> list) {
        Object obj;
        List<String> thumbUrls;
        flowLayout.setGravity(-1);
        if (list == null || list.isEmpty()) {
            flowLayout.setVisibility(8);
            return;
        }
        flowLayout.setVisibility(0);
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
        for (T t : list) {
            List<String> urls = t.getUrls();
            if ((urls == null || (obj = h.a.n.h((List) urls)) == null) && ((thumbUrls = t.getThumbUrls()) == null || (obj = h.a.n.h((List) thumbUrls)) == null)) {
                obj = "";
            }
            arrayList.add(obj);
        }
        a.a(flowLayout, list, new e(flowLayout, (f87117k - (com.ss.android.ugc.aweme.ecommerce.util.h.f87572f * 3)) / 4), new f(this, list, arrayList));
    }

    /* access modifiers changed from: package-private */
    public static final class m implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f87142a;

        static {
            Covode.recordClassIndex(54665);
        }

        m(h.f.a.a aVar) {
            this.f87142a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            if (i2 == 1 && i3 == 1) {
                this.f87142a.invoke();
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.q<TuxTag, ReviewTags, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f87141a = new l();

        static {
            Covode.recordClassIndex(54664);
        }

        l() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(TuxTag tuxTag, ReviewTags reviewTags, Integer num) {
            TuxTag tuxTag2 = tuxTag;
            ReviewTags reviewTags2 = reviewTags;
            num.intValue();
            h.f.b.l.d(tuxTag2, "");
            h.f.b.l.d(reviewTags2, "");
            tuxTag2.setText(reviewTags2.f87080a);
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.util.List] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.ecommerce.review.a.a aVar, int i2, List list) {
        com.ss.android.ugc.aweme.ecommerce.review.a.a aVar2 = aVar;
        h.f.b.l.d(aVar2, "");
        a.C2096a aVar3 = (a.C2096a) aVar2;
        this.f87120g = aVar3;
        if (list == null || list.isEmpty()) {
            super.a(aVar2, i2, list);
        } else {
            a(aVar3);
        }
    }

    private final void a(ViewMoreText viewMoreText, String str, String str2, boolean z, boolean z2) {
        if (str2 == null || h.m.p.a((CharSequence) str2)) {
            viewMoreText.setVisibility(8);
            return;
        }
        viewMoreText.setVisibility(0);
        viewMoreText.setContentTextColor(androidx.core.content.b.c(viewMoreText.getContext(), R.color.c5));
        Context context = viewMoreText.getContext();
        h.f.b.l.b(context, "");
        String string = context.getResources().getString(R.string.bi0);
        h.f.b.l.b(string, "");
        String str3 = string + ' ' + str2;
        if (z2) {
            ViewMoreText.a(viewMoreText, str3, 0, false, new o(string), 6);
            return;
        }
        viewMoreText.a(str3, 2, true, new p(string));
        viewMoreText.setExpandListener(new q(this, z, str, viewMoreText, str3, string));
    }
}
