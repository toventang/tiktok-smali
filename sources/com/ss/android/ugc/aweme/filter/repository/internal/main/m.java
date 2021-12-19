package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.c;
import com.ss.android.ugc.aweme.filter.repository.a.k;
import com.ss.android.ugc.aweme.filter.repository.a.n;
import h.f.b.l;

public final class m {
    static {
        Covode.recordClassIndex(60658);
    }

    public static final class a implements com.ss.android.ugc.aweme.filter.repository.a.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f95732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f95733b;

        static {
            Covode.recordClassIndex(60659);
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final k a() {
            return this.f95733b;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final float b(FilterBean filterBean) {
            l.d(filterBean, "");
            return c.a(filterBean, this.f95733b);
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final float a(FilterBean filterBean) {
            l.d(filterBean, "");
            return c.a(filterBean, this.f95732a.a(filterBean, this.f95733b), this.f95733b);
        }

        a(n nVar, k kVar) {
            this.f95732a = nVar;
            this.f95733b = kVar;
        }

        @Override // com.ss.android.ugc.aweme.filter.repository.a.m
        public final void a(FilterBean filterBean, float f2) {
            l.d(filterBean, "");
            this.f95732a.a(filterBean, c.a(filterBean, f2, this.f95733b));
        }
    }

    public static final com.ss.android.ugc.aweme.filter.repository.a.m a(n nVar, k kVar) {
        l.d(nVar, "");
        l.d(kVar, "");
        return new a(nVar, kVar);
    }
}
