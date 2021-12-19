package com.ss.android.ugc.aweme.ecommerce.review;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.aq;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.ecommerce.review.a.a;
import com.ss.android.ugc.aweme.ecommerce.review.f;
import com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.List;
import java.util.Map;

public final class ProductReviewViewModel extends ListViewModel<com.ss.android.ugc.aweme.ecommerce.review.a.a, o, ProductReviewState> {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f86968a;

    /* renamed from: b  reason: collision with root package name */
    public f f86969b;

    /* renamed from: c  reason: collision with root package name */
    public final d f86970c = new d();

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.ecommerce.review.repo.b f86971d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.b<ProductReviewState, t<p<List<com.ss.android.ugc.aweme.ecommerce.review.a.a>, o>>> f86972e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private final h.f.a.b<ProductReviewState, t<p<List<com.ss.android.ugc.aweme.ecommerce.review.a.a>, o>>> f86973f = new a(this);

    static {
        Covode.recordClassIndex(54531);
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final h.f.a.b<ProductReviewState, t<p<List<com.ss.android.ugc.aweme.ecommerce.review.a.a>, o>>> g() {
        return this.f86972e;
    }

    @Override // com.bytedance.jedi.arch.ext.list.ListViewModel
    public final h.f.a.b<ProductReviewState, t<p<List<com.ss.android.ugc.aweme.ecommerce.review.a.a>, o>>> h() {
        return this.f86973f;
    }

    public final boolean a() {
        com.ss.android.ugc.aweme.ecommerce.review.repo.b bVar = this.f86971d;
        if (bVar == null || !bVar.f87040c) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void bg_() {
        super.bg_();
        f.a.b.b unused = a(e.f87008a, new ah(), new h(this));
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        com.ss.android.ugc.aweme.ecommerce.review.repo.b bVar = this.f86971d;
        if (bVar != null) {
            bVar.f87041d = null;
        }
        super.onCleared();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ProductReviewState(0, null, 0.0f, "", null, new ListState(new o(false, 3, (byte) 0), null, null, null, null, 30, null));
    }

    static final class h extends m implements h.f.a.b<String, z> {
        final /* synthetic */ ProductReviewViewModel this$0;

        static {
            Covode.recordClassIndex(54541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.this$0 = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            this.this$0.k();
            return z.f158842a;
        }
    }

    public static final class i implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductReviewViewModel f86975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReviewItemStruct f86976b;

        static {
            Covode.recordClassIndex(54542);
        }

        public i(ProductReviewViewModel productReviewViewModel, ReviewItemStruct reviewItemStruct) {
            this.f86975a = productReviewViewModel;
            this.f86976b = reviewItemStruct;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            f fVar = this.f86975a.f86969b;
            if (fVar != null) {
                fVar.a(this.f86976b, "cancel");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<a.b, z> {
        final /* synthetic */ ProductReviewViewModel this$0;

        static {
            Covode.recordClassIndex(54539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.this$0 = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.b bVar) {
            final a.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.c(new h.f.a.b<ProductReviewState, ProductReviewState>() {
                /* class com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(54540);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ ProductReviewState invoke(ProductReviewState productReviewState) {
                    ProductReviewState productReviewState2 = productReviewState;
                    l.d(productReviewState2, "");
                    return ProductReviewState.copy$default(productReviewState2, 0, null, 0.0f, null, bVar2, null, 47, null);
                }
            });
            return z.f158842a;
        }
    }

    static final class a extends m implements h.f.a.b<ProductReviewState, t<p<? extends List<? extends com.ss.android.ugc.aweme.ecommerce.review.a.a>, ? extends o>>> {
        final /* synthetic */ ProductReviewViewModel this$0;

        static {
            Covode.recordClassIndex(54532);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.this$0 = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends com.ss.android.ugc.aweme.ecommerce.review.a.a>, ? extends o>> invoke(ProductReviewState productReviewState) {
            ProductReviewState productReviewState2 = productReviewState;
            l.d(productReviewState2, "");
            return this.this$0.a(productReviewState2.getProductId()).a(new ReviewApi.c(productReviewState2.getProductId(), productReviewState2.getSelectFilterId(), productReviewState2.getSubstate().getPayload().f39460b, false));
        }
    }

    static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.review.a.a, Boolean> {
        final /* synthetic */ String $reviewId;

        static {
            Covode.recordClassIndex(54535);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.$reviewId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommerce.review.a.a aVar) {
            ReviewItemStruct reviewItemStruct;
            ReviewItemStruct.MainReview mainReview;
            com.ss.android.ugc.aweme.ecommerce.review.a.a aVar2 = aVar;
            l.d(aVar2, "");
            String str = null;
            if (!(aVar2 instanceof a.C2096a)) {
                aVar2 = null;
            }
            a.C2096a aVar3 = (a.C2096a) aVar2;
            if (!(aVar3 == null || (reviewItemStruct = aVar3.f86985a) == null || (mainReview = reviewItemStruct.f87055a) == null)) {
                str = mainReview.f87068a;
            }
            return Boolean.valueOf(l.a((Object) str, (Object) this.$reviewId));
        }
    }

    static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.review.a.a, Boolean> {
        final /* synthetic */ String $reviewId;

        static {
            Covode.recordClassIndex(54537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.$reviewId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.ecommerce.review.a.a aVar) {
            ReviewItemStruct reviewItemStruct;
            ReviewItemStruct.MainReview mainReview;
            com.ss.android.ugc.aweme.ecommerce.review.a.a aVar2 = aVar;
            l.d(aVar2, "");
            String str = null;
            if (!(aVar2 instanceof a.C2096a)) {
                aVar2 = null;
            }
            a.C2096a aVar3 = (a.C2096a) aVar2;
            if (!(aVar3 == null || (reviewItemStruct = aVar3.f86985a) == null || (mainReview = reviewItemStruct.f87055a) == null)) {
                str = mainReview.f87068a;
            }
            return Boolean.valueOf(l.a((Object) str, (Object) this.$reviewId));
        }
    }

    static final class k extends m implements h.f.a.b<ProductReviewState, ProductReviewState> {
        final /* synthetic */ ReviewFilterStruct $filter;

        static {
            Covode.recordClassIndex(54544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ReviewFilterStruct reviewFilterStruct) {
            super(1);
            this.$filter = reviewFilterStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProductReviewState invoke(ProductReviewState productReviewState) {
            String str;
            ProductReviewState productReviewState2 = productReviewState;
            l.d(productReviewState2, "");
            ReviewFilterStruct reviewFilterStruct = this.$filter;
            if (reviewFilterStruct != null) {
                str = reviewFilterStruct.f87051a;
            } else {
                str = null;
            }
            return ProductReviewState.copy$default(productReviewState2, 0, str, 0.0f, null, null, ListState.copy$default(productReviewState2.getSubstate(), null, null, aq.f39400a, aq.f39400a, null, 19, null), 29, null);
        }
    }

    public final com.ss.android.ugc.aweme.ecommerce.review.repo.b a(String str) {
        l.d(str, "");
        Map<String, com.ss.android.ugc.aweme.ecommerce.review.repo.b> map = com.ss.android.ugc.aweme.ecommerce.review.repo.b.f87037e;
        com.ss.android.ugc.aweme.ecommerce.review.repo.b bVar = map.get(str);
        if (bVar == null) {
            bVar = new com.ss.android.ugc.aweme.ecommerce.review.repo.b();
            map.put(str, bVar);
        }
        com.ss.android.ugc.aweme.ecommerce.review.repo.b bVar2 = bVar;
        bVar2.f87041d = new g(this);
        if (this.f86971d == null) {
            this.f86971d = bVar2;
        }
        return bVar2;
    }

    static final class b extends m implements h.f.a.b<ProductReviewState, t<p<? extends List<? extends com.ss.android.ugc.aweme.ecommerce.review.a.a>, ? extends o>>> {
        final /* synthetic */ ProductReviewViewModel this$0;

        static {
            Covode.recordClassIndex(54533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ProductReviewViewModel productReviewViewModel) {
            super(1);
            this.this$0 = productReviewViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ t<p<? extends List<? extends com.ss.android.ugc.aweme.ecommerce.review.a.a>, ? extends o>> invoke(ProductReviewState productReviewState) {
            ProductReviewState productReviewState2 = productReviewState;
            l.d(productReviewState2, "");
            boolean z = false;
            this.this$0.f86970c.f87007a = false;
            f.a.b.b bVar = this.this$0.f86968a;
            if (bVar != null) {
                bVar.dispose();
            }
            com.ss.android.ugc.aweme.ecommerce.review.repo.b a2 = this.this$0.a(productReviewState2.getProductId());
            String productId = productReviewState2.getProductId();
            String selectFilterId = productReviewState2.getSelectFilterId();
            if (productReviewState2.getFilterData() == null) {
                z = true;
            }
            t<p<List<com.ss.android.ugc.aweme.ecommerce.review.a.a>, o>> c2 = a2.a(new ReviewApi.c(productId, selectFilterId, 1, z)).c(new f.a.d.f(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f86974a;

                static {
                    Covode.recordClassIndex(54534);
                }

                {
                    this.f86974a = r1;
                }

                @Override // f.a.d.f
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    this.f86974a.this$0.f86968a = (f.a.b.b) obj;
                }
            });
            l.b(c2, "");
            return c2;
        }
    }

    static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.review.a.a, com.ss.android.ugc.aweme.ecommerce.review.a.a> {
        final /* synthetic */ boolean $isLike;

        static {
            Covode.recordClassIndex(54536);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$isLike = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.review.a.a invoke(com.ss.android.ugc.aweme.ecommerce.review.a.a aVar) {
            int i2;
            com.ss.android.ugc.aweme.ecommerce.review.a.a aVar2 = aVar;
            l.d(aVar2, "");
            a.C2096a aVar3 = (a.C2096a) aVar2;
            ReviewItemStruct reviewItemStruct = aVar3.f86985a;
            int i3 = 0;
            if (this.$isLike) {
                Integer num = aVar3.f86985a.f87058d;
                if (num != null) {
                    i3 = num.intValue();
                }
                i2 = i3 + 1;
            } else {
                Integer num2 = aVar3.f86985a.f87058d;
                if (num2 != null) {
                    i3 = num2.intValue();
                }
                i2 = i3 - 1;
            }
            return a.C2096a.a(aVar3, ReviewItemStruct.a(reviewItemStruct.f87055a, reviewItemStruct.f87056b, reviewItemStruct.f87057c, Integer.valueOf(i2), Boolean.valueOf(this.$isLike), reviewItemStruct.f87060f, reviewItemStruct.f87061g, reviewItemStruct.f87062h, reviewItemStruct.f87063i), false, false, false, false, false, 62);
        }
    }

    static final class f extends m implements h.f.a.b<com.ss.android.ugc.aweme.ecommerce.review.a.a, com.ss.android.ugc.aweme.ecommerce.review.a.a> {
        final /* synthetic */ int $where;

        static {
            Covode.recordClassIndex(54538);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(int i2) {
            super(1);
            this.$where = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.ecommerce.review.a.a invoke(com.ss.android.ugc.aweme.ecommerce.review.a.a aVar) {
            com.ss.android.ugc.aweme.ecommerce.review.a.a aVar2 = aVar;
            l.d(aVar2, "");
            int i2 = this.$where;
            if (i2 == 0) {
                a.C2096a aVar3 = (a.C2096a) aVar2;
                return a.C2096a.a(aVar3, aVar3.f86985a, true, false, false, false, false, 60);
            } else if (i2 == 1) {
                a.C2096a aVar4 = (a.C2096a) aVar2;
                return a.C2096a.a(aVar4, aVar4.f86985a, false, true, false, false, false, 58);
            } else if (i2 == 2) {
                a.C2096a aVar5 = (a.C2096a) aVar2;
                return a.C2096a.a(aVar5, aVar5.f86985a, false, false, true, false, false, 54);
            } else if (i2 != 3) {
                return aVar2;
            } else {
                a.C2096a aVar6 = (a.C2096a) aVar2;
                return a.C2096a.a(aVar6, aVar6.f86985a, false, false, false, true, false, 46);
            }
        }
    }

    public static final class j extends m implements h.f.a.b<View, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ androidx.fragment.app.i $fm;
        final /* synthetic */ ReviewItemStruct $reviewData;
        final /* synthetic */ String $reviewId;
        final /* synthetic */ ProductReviewViewModel this$0;

        static {
            Covode.recordClassIndex(54543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(ProductReviewViewModel productReviewViewModel, androidx.fragment.app.i iVar, Context context, ReviewItemStruct reviewItemStruct, String str) {
            super(1);
            this.this$0 = productReviewViewModel;
            this.$fm = iVar;
            this.$context = context;
            this.$reviewData = reviewItemStruct;
            this.$reviewId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e4, code lost:
            if (r0 != null) goto L_0x0028;
         */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(android.view.View r10) {
            /*
            // Method dump skipped, instructions count: 234
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public final void a(ReviewItemStruct reviewItemStruct) {
        boolean z;
        String str;
        l.d(reviewItemStruct, "");
        String str2 = reviewItemStruct.f87055a.f87068a;
        Boolean bool = reviewItemStruct.f87059e;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        boolean z2 = !z;
        f fVar = this.f86969b;
        if (fVar != null) {
            l.d(reviewItemStruct, "");
            if (z2) {
                str = "tiktokec_like_review";
            } else {
                str = "tiktokec_unlike_review";
            }
            com.ss.android.ugc.aweme.ecommerce.track.c.a(fVar.f87019j, str, new f.d(fVar, reviewItemStruct));
        }
        if (z2) {
            com.ss.android.ugc.aweme.ecommerce.review.repo.b bVar = this.f86971d;
            if (bVar != null) {
                l.d(str2, "");
                bVar.a(str2, true);
                l.d(str2, "");
                ((ReviewApi) ReviewApi.a.f87024a.a(ReviewApi.class)).dig(new ReviewApi.b(str2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(ReviewApi.a.C2098a.f87026a, ReviewApi.a.b.f87027a);
            }
        } else {
            com.ss.android.ugc.aweme.ecommerce.review.repo.b bVar2 = this.f86971d;
            if (bVar2 != null) {
                l.d(str2, "");
                bVar2.a(str2, false);
                l.d(str2, "");
                ((ReviewApi) ReviewApi.a.f87024a.a(ReviewApi.class)).unDig(new ReviewApi.b(str2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(ReviewApi.a.c.f87028a, ReviewApi.a.d.f87029a);
            }
        }
        a(new c(str2), new d(z2));
    }

    public final void a(String str, int i2) {
        l.d(str, "");
        a(new e(str), new f(i2));
    }
}
