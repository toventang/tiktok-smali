package com.ss.android.ugc.aweme.favorites.i;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class c {
    static {
        Covode.recordClassIndex(56951);
    }

    static final class a extends m implements b<T, R> {
        final /* synthetic */ b $f;

        static {
            Covode.recordClassIndex(56952);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(1);
            this.$f = bVar;
        }

        @Override // h.f.a.b
        public final R invoke(T t) {
            return (R) this.$f.invoke(t);
        }
    }

    public static final <T, R> b<T, R> a(b<? super T, ? extends R> bVar) {
        l.d(bVar, "");
        return new a(bVar);
    }
}
