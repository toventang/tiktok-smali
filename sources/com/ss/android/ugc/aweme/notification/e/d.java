package com.ss.android.ugc.aweme.notification.e;

import b.g;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.f;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final h f113432a = i.a((h.f.a.a) e.f113437a);

    private static ExecutorService a() {
        return (ExecutorService) f113432a.getValue();
    }

    static final class e extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f113437a = new e();

        static {
            Covode.recordClassIndex(72942);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            return p.a(true);
        }
    }

    static {
        Covode.recordClassIndex(72937);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f113433a;

        static {
            Covode.recordClassIndex(72938);
        }

        a(h.f.a.a aVar) {
            this.f113433a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                this.f113433a.invoke();
            } catch (Throwable th) {
                f.a("PerfExt", "asyncCall error", th);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f113434a;

        static {
            Covode.recordClassIndex(72939);
        }

        b(h.f.a.a aVar) {
            this.f113434a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                this.f113434a.invoke();
            } catch (Throwable th) {
                f.a("PerfExt", "serialCall error", th);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f113435a;

        static {
            Covode.recordClassIndex(72940);
        }

        c(h.f.a.a aVar) {
            this.f113435a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final T call() {
            try {
                return (T) this.f113435a.invoke();
            } catch (Throwable th) {
                f.a("PerfExt", "serialCall error", th);
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.e.d$d  reason: collision with other inner class name */
    public static final class C2907d<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f113436a;

        static {
            Covode.recordClassIndex(72941);
        }

        C2907d(h.f.a.b bVar) {
            this.f113436a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            h.f.a.b bVar = this.f113436a;
            l.b(iVar, "");
            bVar.invoke(iVar.d());
            return z.f158842a;
        }
    }

    public static final b.i<z> a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        b.i<z> b2 = b.i.b(new b(aVar), a());
        if (b2 == null) {
            l.b();
        }
        return b2;
    }

    public static final b.i<z> b(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        b.i<z> b2 = b.i.b(new a(aVar), b.i.f4824a);
        l.b(b2, "");
        return b2;
    }

    public static final <T> b.i<z> a(h.f.a.a<? extends T> aVar, h.f.a.b<? super T, z> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        b.i<z> a2 = b.i.b(new c(aVar), a()).a(new C2907d(bVar), b.i.f4826c, null);
        l.b(a2, "");
        return a2;
    }
}
