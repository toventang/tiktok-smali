package com.ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import f.a.t;
import h.f.b.l;
import java.util.Objects;
import l.b.o;

public interface ReviewApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87023a = a.f87025b;

    static {
        Covode.recordClassIndex(54597);
    }

    @o(a = "api/v1/review/digg")
    t<Object> dig(@l.b.a b bVar);

    @o(a = "api/v1/review/list")
    t<com.ss.android.ugc.aweme.ecommerce.api.model.a<ListReviewData>> getReviewInfo(@l.b.a c cVar);

    @o(a = "api/v1/review/cancel_digg")
    t<Object> unDig(@l.b.a b bVar);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f87024a = RetrofitFactory.a().b("https://oec-api.tiktokv.com/").d();

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f87025b = new a();

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi$a$a  reason: collision with other inner class name */
        public static final class C2098a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final C2098a f87026a = new C2098a();

            static {
                Covode.recordClassIndex(54599);
            }

            C2098a() {
            }

            @Override // f.a.d.f
            public final void accept(Object obj) {
            }
        }

        public static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f87027a = new b();

            static {
                Covode.recordClassIndex(54600);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        public static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final c f87028a = new c();

            static {
                Covode.recordClassIndex(54601);
            }

            c() {
            }

            @Override // f.a.d.f
            public final void accept(Object obj) {
            }
        }

        public static final class d<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            public static final d f87029a = new d();

            static {
                Covode.recordClassIndex(54602);
            }

            d() {
            }

            @Override // f.a.d.f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        private a() {
        }

        static {
            Covode.recordClassIndex(54598);
        }
    }

    public static final class c {
        @com.google.gson.a.c(a = "product_id")

        /* renamed from: a  reason: collision with root package name */
        public final String f87031a;
        @com.google.gson.a.c(a = "filter_id")

        /* renamed from: b  reason: collision with root package name */
        public final String f87032b;
        @com.google.gson.a.c(a = "size")

        /* renamed from: c  reason: collision with root package name */
        public final int f87033c = 10;
        @com.google.gson.a.c(a = "cursor")

        /* renamed from: d  reason: collision with root package name */
        public final int f87034d;
        @com.google.gson.a.c(a = "need_filter")

        /* renamed from: e  reason: collision with root package name */
        public final boolean f87035e;

        static {
            Covode.recordClassIndex(54604);
        }

        public final int hashCode() {
            int i2;
            int hashCode = this.f87031a.hashCode() * 31;
            String str = this.f87032b;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            return ((((hashCode + i2) * 31) + this.f87033c) * 31) + this.f87034d;
        }

        public final boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!l.a(cls2, cls)) {
                return false;
            }
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi.ReviewRequest");
            c cVar = (c) obj;
            if (!(!l.a((Object) this.f87031a, (Object) cVar.f87031a)) && !(!l.a((Object) this.f87032b, (Object) cVar.f87032b)) && this.f87033c == cVar.f87033c && this.f87034d == cVar.f87034d) {
                return true;
            }
            return false;
        }

        public c(String str, String str2, int i2, boolean z) {
            l.d(str, "");
            this.f87031a = str;
            this.f87032b = str2;
            this.f87034d = i2;
            this.f87035e = z;
        }
    }

    public static final class b {
        @com.google.gson.a.c(a = "main_review_id")

        /* renamed from: a  reason: collision with root package name */
        public final String f87030a;

        static {
            Covode.recordClassIndex(54603);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && l.a(this.f87030a, ((b) obj).f87030a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f87030a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "ReviewDiggRequest(reviewId=" + this.f87030a + ")";
        }

        public b(String str) {
            l.d(str, "");
            this.f87030a = str;
        }
    }
}
