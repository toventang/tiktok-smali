package com.facebook.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.h;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import java.util.List;

public final class f<T> implements k<c<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final List<k<c<T>>> f47192a;

    static {
        Covode.recordClassIndex(28712);
    }

    public final int hashCode() {
        return this.f47192a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public class a extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        c<T> f47193a;

        /* renamed from: b  reason: collision with root package name */
        c<T> f47194b;

        /* renamed from: d  reason: collision with root package name */
        private int f47196d;

        static {
            Covode.recordClassIndex(28713);
        }

        /* access modifiers changed from: package-private */
        public final synchronized c<T> h() {
            c<T> cVar;
            MethodCollector.i(4269);
            cVar = this.f47194b;
            MethodCollector.o(4269);
            return cVar;
        }

        @Override // com.facebook.d.c, com.facebook.d.a
        public final synchronized T d() {
            MethodCollector.i(4253);
            c<T> h2 = h();
            if (h2 != null) {
                T d2 = h2.d();
                MethodCollector.o(4253);
                return d2;
            }
            MethodCollector.o(4253);
            return null;
        }

        private boolean i() {
            c<T> cVar;
            k<c<T>> j2 = j();
            if (j2 != null) {
                cVar = j2.b();
            } else {
                cVar = null;
            }
            if (!c(cVar) || cVar == null) {
                b(cVar);
                return false;
            }
            cVar.a(new C1170a(this, (byte) 0), com.facebook.common.b.a.f47054a);
            return true;
        }

        private synchronized k<c<T>> j() {
            MethodCollector.i(4265);
            if (a() || this.f47196d >= f.this.f47192a.size()) {
                MethodCollector.o(4265);
                return null;
            }
            List<k<c<T>>> list = f.this.f47192a;
            int i2 = this.f47196d;
            this.f47196d = i2 + 1;
            k<c<T>> kVar = list.get(i2);
            MethodCollector.o(4265);
            return kVar;
        }

        @Override // com.facebook.d.c, com.facebook.d.a
        public final synchronized boolean c() {
            MethodCollector.i(4256);
            c<T> h2 = h();
            if (h2 == null || !h2.c()) {
                MethodCollector.o(4256);
                return false;
            }
            MethodCollector.o(4256);
            return true;
        }

        @Override // com.facebook.d.c, com.facebook.d.a
        public final boolean g() {
            MethodCollector.i(4259);
            synchronized (this) {
                try {
                    if (!super.g()) {
                        return false;
                    }
                    c<T> cVar = this.f47193a;
                    this.f47193a = null;
                    c<T> cVar2 = this.f47194b;
                    this.f47194b = null;
                    b(cVar2);
                    b(cVar);
                    MethodCollector.o(4259);
                    return true;
                } finally {
                    MethodCollector.o(4259);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.facebook.d.f$a$a  reason: collision with other inner class name */
        public class C1170a implements e<T> {
            static {
                Covode.recordClassIndex(28714);
            }

            @Override // com.facebook.d.e
            public final void onCancellation(c<T> cVar) {
            }

            private C1170a() {
            }

            @Override // com.facebook.d.e
            public final void onFailure(c<T> cVar) {
                a.this.a((c) cVar);
            }

            @Override // com.facebook.d.e
            public final void onProgressUpdate(c<T> cVar) {
                a.this.a(Math.max(a.this.f(), cVar.f()));
            }

            @Override // com.facebook.d.e
            public final void onNewResult(c<T> cVar) {
                c<T> cVar2;
                MethodCollector.i(4239);
                if (cVar.c()) {
                    a aVar = a.this;
                    boolean b2 = cVar.b();
                    synchronized (aVar) {
                        try {
                            if (cVar == aVar.f47193a && cVar != aVar.f47194b) {
                                if (aVar.f47194b != null) {
                                    if (!b2) {
                                        cVar2 = null;
                                        a.b(cVar2);
                                    }
                                }
                                cVar2 = aVar.f47194b;
                                aVar.f47194b = cVar;
                                a.b(cVar2);
                            }
                        } finally {
                            MethodCollector.o(4239);
                        }
                    }
                    if (cVar == aVar.h()) {
                        aVar.a((Object) null, cVar.b());
                    }
                    return;
                }
                if (cVar.b()) {
                    a.this.a((c) cVar);
                }
                MethodCollector.o(4239);
            }

            /* synthetic */ C1170a(a aVar, byte b2) {
                this();
            }
        }

        static void b(c<T> cVar) {
            if (cVar != null) {
                cVar.g();
            }
        }

        public a() {
            if (!i()) {
                a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        private synchronized boolean c(c<T> cVar) {
            MethodCollector.i(4267);
            if (a()) {
                MethodCollector.o(4267);
                return false;
            }
            this.f47193a = cVar;
            MethodCollector.o(4267);
            return true;
        }

        public final void a(c<T> cVar) {
            if (d(cVar)) {
                if (cVar != h()) {
                    b(cVar);
                }
                if (!i()) {
                    a(cVar.e());
                }
            }
        }

        private synchronized boolean d(c<T> cVar) {
            MethodCollector.i(4268);
            if (!a()) {
                if (cVar == this.f47193a) {
                    this.f47193a = null;
                    MethodCollector.o(4268);
                    return true;
                }
            }
            MethodCollector.o(4268);
            return false;
        }
    }

    /* renamed from: a */
    public final c<T> b() {
        return new a();
    }

    public final String toString() {
        return h.a(this).a("list", this.f47192a).toString();
    }

    public static <T> f<T> a(List<k<c<T>>> list) {
        return new f<>(list);
    }

    private f(List<k<c<T>>> list) {
        i.a(!list.isEmpty(), "List of suppliers is empty!");
        this.f47192a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return h.a(this.f47192a, ((f) obj).f47192a);
    }
}
