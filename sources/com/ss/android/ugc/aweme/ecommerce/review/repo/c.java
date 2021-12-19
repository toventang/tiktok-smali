package com.ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.a.a;
import com.ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import h.a.ag;
import h.f.a.b;
import h.f.b.l;
import h.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class c extends a<ReviewApi.c, ListReviewData> {

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<ReviewApi.c, ListReviewData> f87044c = new HashMap<>();

    static {
        Covode.recordClassIndex(54612);
    }

    @Override // com.bytedance.jedi.a.a.a
    public final List<p<ReviewApi.c, ListReviewData>> d() {
        return ag.e(this.f87044c);
    }

    @Override // com.bytedance.jedi.a.a.a
    public final void e() {
        this.f87044c.clear();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.a.a.a
    public final /* synthetic */ ListReviewData b(ReviewApi.c cVar) {
        l.d(cVar, "");
        return this.f87044c.get(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.bytedance.jedi.a.a.a
    public final /* synthetic */ void b(ReviewApi.c cVar, ListReviewData listReviewData) {
        ListReviewData listReviewData2 = listReviewData;
        l.d(cVar, "");
        if (listReviewData2 != null && listReviewData2.f87045a != null) {
            this.f87044c.put(cVar, listReviewData2);
        }
    }

    public final void a(String str, b<? super ReviewItemStruct, ReviewItemStruct> bVar) {
        List<ReviewItemStruct> list;
        ReviewItemStruct remove;
        l.d(str, "");
        l.d(bVar, "");
        Collection<ListReviewData> values = this.f87044c.values();
        l.b(values, "");
        for (T t : values) {
            List<ReviewItemStruct> list2 = t.f87045a;
            if (list2 != null) {
                int i2 = 0;
                Iterator<ReviewItemStruct> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!l.a((Object) it.next().f87055a.f87068a, (Object) str)) {
                        i2++;
                    } else if (i2 != -1 && (list = t.f87045a) != null && (remove = list.remove(i2)) != null) {
                        t.f87045a.add(i2, bVar.invoke(remove));
                    }
                }
            }
        }
    }
}
