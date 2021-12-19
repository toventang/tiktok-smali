package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.internal.e;
import f.a.aa;
import h.f.a.m;
import h.f.b.l;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    static boolean f39535a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f39536b;

    /* renamed from: c  reason: collision with root package name */
    static m<? super JediViewModel<af>, ? super af, ? extends ag<af>> f39537c = c.f39544a;

    /* renamed from: d  reason: collision with root package name */
    public static final h.f.a.a<Executor> f39538d = b.f39543a;

    /* renamed from: e  reason: collision with root package name */
    static h.f.a.a<? extends aa> f39539e = d.f39545a;

    /* renamed from: f  reason: collision with root package name */
    public static h.f.a.a<? extends Executor> f39540f = a.f39542a;

    /* renamed from: g  reason: collision with root package name */
    public static final j f39541g = new j();

    private j() {
    }

    static final class b extends h.f.b.m implements h.f.a.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39543a = new b();

        static {
            Covode.recordClassIndex(24322);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            return new e();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f39542a = new a();

        static {
            Covode.recordClassIndex(24321);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            Object value = e.f39481b.getValue();
            l.a(value, "");
            return value;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<aa> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f39545a = new d();

        static {
            Covode.recordClassIndex(24324);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aa invoke() {
            aa a2 = f.a.k.a.a(j.f39538d.invoke());
            l.a((Object) a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(24320);
    }

    static final class c extends h.f.b.m implements m<JediViewModel<af>, af, com.bytedance.jedi.arch.internal.c<af>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f39544a = new c();

        static {
            Covode.recordClassIndex(24323);
        }

        c() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ com.bytedance.jedi.arch.internal.c<af> invoke(JediViewModel<af> jediViewModel, af afVar) {
            l.c(jediViewModel, "");
            l.c(afVar, "");
            return new com.bytedance.jedi.arch.internal.c(afVar, (aa) j.f39539e.invoke());
        }
    }
}
