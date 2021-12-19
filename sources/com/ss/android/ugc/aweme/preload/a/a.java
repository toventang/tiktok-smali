package com.ss.android.ugc.aweme.preload.a;

import com.bytedance.covode.number.Covode;
import f.a.t;
import f.a.y;
import f.a.z;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f115724a = new a();

    /* renamed from: com.ss.android.ugc.aweme.preload.a.a$a  reason: collision with other inner class name */
    public static final class C2956a {

        /* renamed from: a  reason: collision with root package name */
        static final Map<String, f.a.b.a> f115725a = new ConcurrentHashMap();

        /* renamed from: b  reason: collision with root package name */
        public static final C2956a f115726b = new C2956a();

        /* renamed from: c  reason: collision with root package name */
        private static final Map<String, List<f.a.b.b>> f115727c = new ConcurrentHashMap();

        private C2956a() {
        }

        static {
            Covode.recordClassIndex(74667);
        }
    }

    private a() {
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f115728a;

        static {
            Covode.recordClassIndex(74668);
        }

        b(Runnable runnable) {
            this.f115728a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f115728a.run();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f115729a;

        static {
            Covode.recordClassIndex(74669);
        }

        c(Runnable runnable) {
            this.f115729a = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f115729a.run();
            return true;
        }
    }

    public static final class d extends b<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f115730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f115731b;

        static {
            Covode.recordClassIndex(74670);
        }

        @Override // com.ss.android.ugc.aweme.preload.a.b, f.a.z
        public final void onComplete() {
            this.f115730a.run();
            super.onComplete();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Runnable runnable, e eVar, e eVar2) {
            super(eVar2);
            this.f115730a = runnable;
            this.f115731b = eVar;
        }
    }

    static {
        Covode.recordClassIndex(74666);
    }

    public static void a(String str) {
        l.d(str, "");
        l.d(str, "");
        f.a.b.a aVar = C2956a.f115725a.get(str);
        if (aVar != null) {
            aVar.a();
            C2956a.f115725a.remove(str);
        }
    }

    private static void a(String str, f.a.b.b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        l.d(str, "");
        l.d(bVar, "");
        f.a.b.a aVar = C2956a.f115725a.get(str);
        if (aVar == null) {
            aVar = new f.a.b.a();
            C2956a.f115725a.put(str, aVar);
        }
        aVar.a(bVar);
    }

    public static void a(String str, e eVar, Runnable runnable) {
        y yVar;
        l.d(str, "");
        l.d(runnable, "");
        t c2 = t.c(new b(runnable));
        if (eVar != null) {
            yVar = d.a(eVar);
        } else {
            yVar = null;
        }
        z c3 = c2.a(yVar).c(new b(eVar));
        l.b(c3, "");
        a(str, (f.a.b.b) c3);
    }

    public static void a(String str, e eVar, Runnable runnable, Runnable runnable2) {
        y yVar;
        l.d(str, "");
        l.d(runnable, "");
        l.d(runnable2, "");
        t c2 = t.c(new c(runnable));
        if (eVar != null) {
            yVar = d.a(eVar);
        } else {
            yVar = null;
        }
        z c3 = c2.a(yVar).c(new d(runnable2, eVar, eVar));
        l.b(c3, "");
        a(str, (f.a.b.b) c3);
    }
}
