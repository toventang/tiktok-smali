package com.vk.api.sdk.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.vk.api.sdk.d;
import com.vk.api.sdk.f.b;
import h.f.b.l;

public final class g<T> extends f<T> {

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f156260b;

    static {
        Covode.recordClassIndex(103771);
    }

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156261a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final b f156262b = new b(1000, 8000, 1.2f, 0.0f, 8);

        private a() {
        }

        static {
            Covode.recordClassIndex(103772);
        }

        public final synchronized boolean a() {
            boolean a2;
            MethodCollector.i(780);
            a2 = f156262b.a();
            MethodCollector.o(780);
            return a2;
        }

        public final synchronized void b() {
            MethodCollector.i(781);
            f156262b.b();
            MethodCollector.o(781);
        }

        public final synchronized void c() {
            MethodCollector.i(782);
            b bVar = f156262b;
            bVar.f156316a = bVar.f156318c;
            bVar.f156317b = 0;
            MethodCollector.o(782);
        }

        public final synchronized long d() {
            long j2;
            MethodCollector.i(783);
            j2 = f156262b.f156316a;
            MethodCollector.o(783);
            return j2;
        }
    }

    @Override // com.vk.api.sdk.b.b
    public final T a(a aVar) {
        MethodCollector.i(193);
        l.c(aVar, "");
        int i2 = this.f156259c;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                if (a.f156261a.a()) {
                    Thread.sleep(a.f156261a.d());
                }
                try {
                    T a2 = this.f156260b.a(aVar);
                    a.f156261a.c();
                    MethodCollector.o(193);
                    return a2;
                } catch (com.vk.api.sdk.c.b e2) {
                    if (e2.isTooManyRequestsError()) {
                        a("Too many requests", e2);
                        a.f156261a.b();
                        if (i3 == i2) {
                            break;
                        }
                        i3++;
                    } else {
                        MethodCollector.o(193);
                        throw e2;
                    }
                }
            }
        }
        com.vk.api.sdk.c.a aVar2 = new com.vk.api.sdk.c.a("Can't handle too many requests due to retry limit! (retryLimit=" + this.f156259c + ')');
        MethodCollector.o(193);
        throw aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.vk.api.sdk.b.b<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d dVar, int i2, b<? extends T> bVar) {
        super(dVar, i2);
        l.c(dVar, "");
        l.c(bVar, "");
        this.f156260b = bVar;
    }
}
