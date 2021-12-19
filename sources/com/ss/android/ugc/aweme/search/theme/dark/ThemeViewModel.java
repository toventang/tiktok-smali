package com.ss.android.ugc.aweme.search.theme.dark;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ThemeViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    private final h f121724a = i.a((h.f.a.a) a.f121728a);

    /* renamed from: b  reason: collision with root package name */
    private final h f121725b = i.a((h.f.a.a) d.f121731a);

    /* renamed from: c  reason: collision with root package name */
    private final h f121726c = i.a((h.f.a.a) c.f121730a);

    /* renamed from: d  reason: collision with root package name */
    private final h f121727d = i.a((h.f.a.a) b.f121729a);

    static {
        Covode.recordClassIndex(79281);
    }

    public final t<com.ss.android.ugc.aweme.search.theme.c> a() {
        return (t) this.f121724a.getValue();
    }

    public final t<Boolean> b() {
        return (t) this.f121725b.getValue();
    }

    public final t<com.ss.android.ugc.aweme.search.theme.c> c() {
        return (t) this.f121726c.getValue();
    }

    public final t<com.ss.android.ugc.aweme.search.theme.c> d() {
        return (t) this.f121727d.getValue();
    }

    static final class a extends m implements h.f.a.a<t<com.ss.android.ugc.aweme.search.theme.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f121728a = new a();

        static {
            Covode.recordClassIndex(79282);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<com.ss.android.ugc.aweme.search.theme.c> invoke() {
            return new t();
        }
    }

    static final class b extends m implements h.f.a.a<t<com.ss.android.ugc.aweme.search.theme.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f121729a = new b();

        static {
            Covode.recordClassIndex(79283);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<com.ss.android.ugc.aweme.search.theme.c> invoke() {
            return new t();
        }
    }

    static final class c extends m implements h.f.a.a<t<com.ss.android.ugc.aweme.search.theme.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f121730a = new c();

        static {
            Covode.recordClassIndex(79284);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<com.ss.android.ugc.aweme.search.theme.c> invoke() {
            return new t();
        }
    }

    static final class d extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f121731a = new d();

        static {
            Covode.recordClassIndex(79285);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    public final void a(com.ss.android.ugc.aweme.search.theme.c cVar) {
        l.d(cVar, "");
        c().postValue(cVar);
        c(cVar);
    }

    public final void b(com.ss.android.ugc.aweme.search.theme.c cVar) {
        l.d(cVar, "");
        d().setValue(cVar);
    }

    public final void c(com.ss.android.ugc.aweme.search.theme.c cVar) {
        l.d(cVar, "");
        a().postValue(cVar);
    }
}
