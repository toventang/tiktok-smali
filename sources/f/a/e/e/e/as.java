package f.a.e.e.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.aa;
import f.a.d.f;
import f.a.e.a.e;
import f.a.t;
import f.a.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class as<T> extends t<T> {

    /* renamed from: a  reason: collision with root package name */
    final f.a.f.a<T> f157483a;

    /* renamed from: b  reason: collision with root package name */
    final int f157484b;

    /* renamed from: c  reason: collision with root package name */
    final long f157485c;

    /* renamed from: d  reason: collision with root package name */
    final TimeUnit f157486d;

    /* renamed from: e  reason: collision with root package name */
    final aa f157487e;

    /* renamed from: f  reason: collision with root package name */
    a f157488f;

    static {
        Covode.recordClassIndex(104633);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends AtomicReference<f.a.b.b> implements f<f.a.b.b>, Runnable {
        private static final long serialVersionUID = -4552101107598366241L;
        boolean connected;
        boolean disconnectedEarly;
        final as<?> parent;
        long subscriberCount;
        f.a.b.b timer;

        static {
            Covode.recordClassIndex(104634);
        }

        public final void run() {
            this.parent.b(this);
        }

        a(as<?> asVar) {
            this.parent = asVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(f.a.b.b bVar) {
            MethodCollector.i(11598);
            f.a.b.b bVar2 = bVar;
            f.a.e.a.b.replace(this, bVar2);
            synchronized (this.parent) {
                try {
                    if (this.disconnectedEarly) {
                        ((e) this.parent.f157483a).a(bVar2);
                    }
                } finally {
                    MethodCollector.o(11598);
                }
            }
        }
    }

    static final class b<T> extends AtomicBoolean implements f.a.b.b, z<T> {
        private static final long serialVersionUID = -7419642935409022375L;
        final a connection;
        final z<? super T> downstream;
        final as<T> parent;
        f.a.b.b upstream;

        static {
            Covode.recordClassIndex(104635);
        }

        @Override // f.a.b.b
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // f.a.z
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.parent.a(this.connection);
                this.downstream.onComplete();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
            r4.replace(r6.f157487e.a(r5, r6.f157485c, r6.f157486d));
         */
        @Override // f.a.b.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void dispose() {
            /*
            // Method dump skipped, instructions count: 104
            */
            throw new UnsupportedOperationException("Method not decompiled: f.a.e.e.e.as.b.dispose():void");
        }

        @Override // f.a.z
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            if (f.a.e.a.b.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.parent.a(this.connection);
                this.downstream.onError(th);
                return;
            }
            f.a.h.a.a(th);
        }

        b(z<? super T> zVar, as<T> asVar, a aVar) {
            this.downstream = zVar;
            this.parent = asVar;
            this.connection = aVar;
        }
    }

    public as(f.a.f.a<T> aVar) {
        this(aVar, TimeUnit.NANOSECONDS, f.a.k.a.f158007d);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        MethodCollector.i(11808);
        synchronized (this) {
            try {
                a aVar2 = this.f157488f;
                if (aVar2 != null && aVar2 == aVar) {
                    this.f157488f = null;
                    if (aVar.timer != null) {
                        aVar.timer.dispose();
                    }
                }
                long j2 = aVar.subscriberCount - 1;
                aVar.subscriberCount = j2;
                if (j2 == 0) {
                    f.a.f.a<T> aVar3 = this.f157483a;
                    if (aVar3 instanceof f.a.b.b) {
                        ((f.a.b.b) aVar3).dispose();
                    } else if (aVar3 instanceof e) {
                        ((e) aVar3).a((f.a.b.b) aVar.get());
                    }
                }
            } finally {
                MethodCollector.o(11808);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(a aVar) {
        MethodCollector.i(11809);
        synchronized (this) {
            try {
                if (aVar.subscriberCount == 0 && aVar == this.f157488f) {
                    this.f157488f = null;
                    f.a.b.b bVar = (f.a.b.b) aVar.get();
                    f.a.e.a.b.dispose(aVar);
                    f.a.f.a<T> aVar2 = this.f157483a;
                    if (aVar2 instanceof f.a.b.b) {
                        ((f.a.b.b) aVar2).dispose();
                    } else if (aVar2 instanceof e) {
                        if (bVar == null) {
                            aVar.disconnectedEarly = true;
                        } else {
                            ((e) aVar2).a(bVar);
                        }
                    }
                }
            } finally {
                MethodCollector.o(11809);
            }
        }
    }

    @Override // f.a.t
    public final void a(z<? super T> zVar) {
        a aVar;
        boolean z;
        MethodCollector.i(11649);
        synchronized (this) {
            try {
                aVar = this.f157488f;
                if (aVar == null) {
                    aVar = new a(this);
                    this.f157488f = aVar;
                }
                long j2 = aVar.subscriberCount;
                if (j2 == 0 && aVar.timer != null) {
                    aVar.timer.dispose();
                }
                long j3 = j2 + 1;
                aVar.subscriberCount = j3;
                z = true;
                if (aVar.connected || j3 != ((long) this.f157484b)) {
                    z = false;
                } else {
                    aVar.connected = true;
                }
            } finally {
                MethodCollector.o(11649);
            }
        }
        this.f157483a.b((z) new b(zVar, this, aVar));
        if (z) {
            this.f157483a.e(aVar);
        }
    }

    private as(f.a.f.a<T> aVar, TimeUnit timeUnit, aa aaVar) {
        this.f157483a = aVar;
        this.f157484b = 1;
        this.f157485c = 0;
        this.f157486d = timeUnit;
        this.f157487e = aaVar;
    }
}
