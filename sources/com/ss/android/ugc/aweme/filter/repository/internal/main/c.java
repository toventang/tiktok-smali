package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.h.e;
import com.ss.android.ugc.aweme.filter.repository.internal.h;
import f.a.d.g;
import f.a.e.e.e.v;
import f.a.t;
import f.a.x;
import h.f.b.l;

public final class c extends e<com.ss.android.ugc.aweme.filter.repository.internal.a> implements h {

    /* renamed from: a  reason: collision with root package name */
    private final h f95647a;

    /* renamed from: b  reason: collision with root package name */
    private final h f95648b;

    static {
        Covode.recordClassIndex(60614);
    }

    @Override // com.bytedance.jedi.a.h.a
    public final t<com.ss.android.ugc.aweme.filter.repository.internal.a> b() {
        t<com.ss.android.ugc.aweme.filter.repository.internal.a> d2 = this.f95648b.a().e(b.f95650a).d(this.f95647a.a().e(a.f95649a));
        l.b(d2, "");
        return d2;
    }

    static final class b<T, R> implements g<Throwable, x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f95650a = new b();

        static {
            Covode.recordClassIndex(60616);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a> apply(Throwable th) {
            l.d(th, "");
            return f.a.h.a.a(v.f157740a);
        }
    }

    static final class a<T, R> implements g<Throwable, x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f95649a = new a();

        static {
            Covode.recordClassIndex(60615);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ x<? extends com.ss.android.ugc.aweme.filter.repository.internal.a> apply(Throwable th) {
            l.d(th, "");
            return t.b(new com.ss.android.ugc.aweme.filter.repository.internal.a(com.ss.android.ugc.aweme.filter.repository.a.a.a.f95532a, true));
        }
    }

    public c(h hVar, h hVar2) {
        l.d(hVar, "");
        l.d(hVar2, "");
        this.f95647a = hVar;
        this.f95648b = hVar2;
    }
}
