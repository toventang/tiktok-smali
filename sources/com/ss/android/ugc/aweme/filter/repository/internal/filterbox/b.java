package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.repository.a.h;
import com.ss.android.ugc.aweme.filter.repository.a.i;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.aweme.filter.repository.internal.g;
import f.a.ab;
import h.f.b.l;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final g f95599a;

    /* renamed from: b  reason: collision with root package name */
    public final o f95600b;

    static {
        Covode.recordClassIndex(60583);
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.i
    public final ab<h> a() {
        ab<h> c2 = this.f95599a.a().b().c(new a(this));
        l.b(c2, "");
        return c2;
    }

    static final class a<T, R> implements f.a.d.g<com.ss.android.ugc.aweme.filter.repository.a.a, h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f95601a;

        static {
            Covode.recordClassIndex(60584);
        }

        a(b bVar) {
            this.f95601a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ h apply(com.ss.android.ugc.aweme.filter.repository.a.a aVar) {
            com.ss.android.ugc.aweme.filter.repository.a.a aVar2 = aVar;
            l.d(aVar2, "");
            return new a(aVar2, this.f95601a.f95600b, this.f95601a.f95599a);
        }
    }

    public b(g gVar, o oVar) {
        l.d(gVar, "");
        l.d(oVar, "");
        this.f95599a = gVar;
        this.f95600b = oVar;
    }
}
