package com.ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import f.a.d.g;
import f.a.t;
import h.f.b.l;

public final class a extends com.bytedance.jedi.a.f.a<ReviewApi.c, ListReviewData, ReviewApi.c, ListReviewData> {
    static {
        Covode.recordClassIndex(54605);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.a$a  reason: collision with other inner class name */
    public static final class C2099a extends RuntimeException {
        private final com.ss.android.ugc.aweme.ecommerce.api.model.a<ListReviewData> response;

        static {
            Covode.recordClassIndex(54606);
        }

        public final com.ss.android.ugc.aweme.ecommerce.api.model.a<ListReviewData> getResponse() {
            return this.response;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2099a(com.ss.android.ugc.aweme.ecommerce.api.model.a<ListReviewData> aVar, String str) {
            super(str);
            l.d(aVar, "");
            this.response = aVar;
        }
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object b(Object obj) {
        l.d(obj, "");
        return obj;
    }

    static final class b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f87036a = new b();

        static {
            Covode.recordClassIndex(54607);
        }

        b() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.ecommerce.api.model.a aVar = (com.ss.android.ugc.aweme.ecommerce.api.model.a) obj;
            l.d(aVar, "");
            if (aVar.isCodeOK() && aVar.data != null) {
                return aVar.data;
            }
            throw new C2099a(aVar, "code is not ok | data is null");
        }
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t<ListReviewData> a(ReviewApi.c cVar) {
        ReviewApi.c cVar2 = cVar;
        l.d(cVar2, "");
        l.d(cVar2, "");
        t<com.ss.android.ugc.aweme.ecommerce.api.model.a<ListReviewData>> b2 = ((ReviewApi) ReviewApi.a.f87024a.a(ReviewApi.class)).getReviewInfo(cVar2).b(f.a.h.a.b(f.a.k.a.f158006c));
        l.b(b2, "");
        t<R> d2 = b2.d(b.f87036a);
        l.b(d2, "");
        return d2;
    }

    @Override // com.bytedance.jedi.a.f.b
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return obj2;
    }
}
