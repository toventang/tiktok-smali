package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.f.d;
import com.ss.android.ugc.aweme.filter.repository.a.g;
import com.ss.android.ugc.aweme.filter.repository.internal.c;
import com.ss.android.ugc.aweme.filter.repository.internal.e;
import com.ss.android.ugc.aweme.filter.repository.internal.k;
import com.ss.android.ugc.aweme.filter.repository.internal.l;
import com.ss.android.ugc.aweme.filter.repository.internal.n;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.b;
import f.a.t;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class f extends d<List<? extends com.ss.android.ugc.aweme.filter.repository.a.f>, List<? extends com.ss.android.ugc.aweme.filter.repository.a.d>> implements n {

    /* renamed from: a  reason: collision with root package name */
    public final e f95654a;

    /* renamed from: b  reason: collision with root package name */
    public final k f95655b;

    /* renamed from: f  reason: collision with root package name */
    public final l f95656f;

    static {
        Covode.recordClassIndex(60619);
    }

    static final class a<V> implements Callable<List<? extends com.ss.android.ugc.aweme.filter.repository.a.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f95657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f95658b;

        static {
            Covode.recordClassIndex(60620);
        }

        a(f fVar, List list) {
            this.f95657a = fVar;
            this.f95658b = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.filter.repository.a.d> call() {
            g gVar;
            com.ss.android.ugc.aweme.filter.repository.internal.d dVar;
            List<com.ss.android.ugc.aweme.filter.repository.a.f> list = this.f95658b;
            ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
            for (com.ss.android.ugc.aweme.filter.repository.a.f fVar : list) {
                if (this.f95657a.f95654a.a(fVar)) {
                    gVar = g.FILTER_STATE_DOWNLOAD_SUCCESS;
                } else {
                    k kVar = this.f95657a.f95655b;
                    h.f.b.l.d(kVar, "");
                    h.f.b.l.d(fVar, "");
                    c c2 = kVar.c(fVar);
                    if (c2 != null && (c2 == c.PENDING || c2 == c.START)) {
                        gVar = g.FILTER_STATE_DOWNLOADING;
                    } else if (this.f95657a.f95656f.a(fVar)) {
                        gVar = g.FILTER_STATE_DOWNLOAD_SUCCESS;
                    } else {
                        gVar = g.FILTER_STATE_NOT_DOWNLOAD;
                    }
                }
                if (this.f95657a.f95654a.a(fVar)) {
                    dVar = this.f95657a.f95654a.a(fVar.f95550a);
                } else if (gVar == g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    dVar = this.f95657a.f95656f.d(fVar.f95550a);
                } else {
                    dVar = b.f95752a;
                }
                arrayList.add(new com.ss.android.ugc.aweme.filter.repository.a.d(fVar.f95550a, gVar, dVar.f95588a, dVar.f95589b));
            }
            return arrayList;
        }
    }

    @Override // com.bytedance.jedi.a.f.a
    public final /* synthetic */ t a(Object obj) {
        List list = (List) obj;
        h.f.b.l.d(list, "");
        t c2 = t.c(new a(this, list));
        h.f.b.l.b(c2, "");
        return c2;
    }

    public f(e eVar, k kVar, l lVar) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(lVar, "");
        this.f95654a = eVar;
        this.f95655b = kVar;
        this.f95656f = lVar;
    }
}
