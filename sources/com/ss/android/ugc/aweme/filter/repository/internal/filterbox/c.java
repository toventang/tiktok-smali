package com.ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.filter.repository.a.i;
import com.ss.android.ugc.aweme.filter.repository.a.j;
import com.ss.android.ugc.aweme.filter.repository.a.o;
import com.ss.android.ugc.tools.b.a.d;
import h.f.b.l;
import h.f.b.m;

public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final q<FilterBoxApi> f95602a;

    /* renamed from: b  reason: collision with root package name */
    private final o f95603b;

    /* renamed from: c  reason: collision with root package name */
    private final q<d> f95604c;

    /* renamed from: d  reason: collision with root package name */
    private final d f95605d;

    static {
        Covode.recordClassIndex(60585);
    }

    static final class a extends m implements h.f.a.a<FilterBoxApi> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(60586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FilterBoxApi invoke() {
            return this.this$0.f95602a.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.a.j
    public final i a() {
        return new b(new e(h.i.a((h.f.a.a) new a(this)), this.f95605d, this.f95604c), this.f95603b);
    }

    public c(o oVar, q<FilterBoxApi> qVar, q<d> qVar2, d dVar) {
        l.d(oVar, "");
        l.d(qVar, "");
        l.d(qVar2, "");
        l.d(dVar, "");
        this.f95603b = oVar;
        this.f95602a = qVar;
        this.f95604c = qVar2;
        this.f95605d = dVar;
    }
}
