package com.ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.b.b;
import com.bytedance.jedi.a.b.c;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.ecommerce.review.a.a;
import com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import f.a.d.g;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b extends com.bytedance.jedi.a.j.b {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, b> f87037e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public static final a f87038f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final c f87039b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f87040c = true;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.b<? super a.b, z> f87041d;

    /* renamed from: g  reason: collision with root package name */
    private final a f87042g;

    public static final class a {
        static {
            Covode.recordClassIndex(54609);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(54608);
    }

    public b() {
        a aVar = new a();
        this.f87042g = aVar;
        c cVar = new c();
        this.f87039b = cVar;
        com.bytedance.jedi.a.j.c.a(this, aVar, cVar);
    }

    static final class c extends m implements h.f.a.b<ReviewItemStruct, ReviewItemStruct> {
        final /* synthetic */ boolean $isDigg;

        static {
            Covode.recordClassIndex(54611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$isDigg = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ReviewItemStruct invoke(ReviewItemStruct reviewItemStruct) {
            int i2;
            ReviewItemStruct reviewItemStruct2 = reviewItemStruct;
            l.d(reviewItemStruct2, "");
            Boolean valueOf = Boolean.valueOf(this.$isDigg);
            int i3 = 0;
            if (this.$isDigg) {
                Integer num = reviewItemStruct2.f87058d;
                if (num != null) {
                    i3 = num.intValue();
                }
                i2 = i3 + 1;
            } else {
                Integer num2 = reviewItemStruct2.f87058d;
                if (num2 != null) {
                    i3 = num2.intValue();
                }
                i2 = i3 - 1;
            }
            return ReviewItemStruct.a(reviewItemStruct2.f87055a, reviewItemStruct2.f87056b, reviewItemStruct2.f87057c, Integer.valueOf(i2), valueOf, reviewItemStruct2.f87060f, reviewItemStruct2.f87061g, reviewItemStruct2.f87062h, reviewItemStruct2.f87063i);
        }
    }

    public final t<p<List<com.ss.android.ugc.aweme.ecommerce.review.a.a>, o>> a(ReviewApi.c cVar) {
        l.d(cVar, "");
        t<p<List<com.ss.android.ugc.aweme.ecommerce.review.a.a>, o>> d2 = com.bytedance.jedi.a.b.b.a(this.f87042g, this.f87039b, b.a.f39096a).a(c.a.f39098a).c(cVar).d(new C2100b(this));
        l.b(d2, "");
        return d2;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.b$b  reason: collision with other inner class name */
    static final class C2100b<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f87043a;

        static {
            Covode.recordClassIndex(54610);
        }

        C2100b(b bVar) {
            this.f87043a = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            ArrayList arrayList;
            h.f.a.b<? super a.b, z> bVar;
            ListReviewData listReviewData = (ListReviewData) obj;
            l.d(listReviewData, "");
            ArrayList arrayList2 = new ArrayList();
            if (!(listReviewData.f87048d == null || (bVar = this.f87043a.f87041d) == null)) {
                bVar.invoke(new a.b(listReviewData.f87048d));
            }
            if (l.a((Object) listReviewData.f87049e, (Object) true)) {
                this.f87043a.f87040c = false;
            }
            List<ReviewItemStruct> list = listReviewData.f87045a;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new a.C2096a(it.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = h.a.z.INSTANCE;
            }
            arrayList2.addAll(arrayList);
            if (!listReviewData.f87046b) {
                Object j2 = n.j((List) arrayList2);
                if (!(j2 instanceof a.C2096a)) {
                    j2 = null;
                }
                a.C2096a aVar = (a.C2096a) j2;
                if (aVar != null) {
                    aVar.f86990f = false;
                }
            }
            return new p(arrayList2, new o(listReviewData.f87046b, listReviewData.f87047c));
        }
    }

    public final void a(String str, boolean z) {
        l.d(str, "");
        this.f87039b.a(str, (h.f.a.b<? super ReviewItemStruct, ReviewItemStruct>) new c(z));
    }
}
