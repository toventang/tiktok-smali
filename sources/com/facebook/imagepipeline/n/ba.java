package com.facebook.imagepipeline.n;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public final class ba<T> implements ak<T> {

    /* renamed from: a  reason: collision with root package name */
    public int f48286a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<Pair<k<T>, al>> f48287b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f48288c;

    /* renamed from: d  reason: collision with root package name */
    private final ak<T> f48289d;

    /* renamed from: e  reason: collision with root package name */
    private final int f48290e = 5;

    static {
        Covode.recordClassIndex(29139);
    }

    /* access modifiers changed from: package-private */
    public class a extends n<T, T> {
        static {
            Covode.recordClassIndex(29140);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a() {
            this.f48362e.b();
            c();
        }

        private void c() {
            final Pair<k<T>, al> poll;
            MethodCollector.i(11673);
            synchronized (ba.this) {
                try {
                    poll = ba.this.f48287b.poll();
                    if (poll == null) {
                        ba baVar = ba.this;
                        baVar.f48286a--;
                    }
                } finally {
                    MethodCollector.o(11673);
                }
            }
            if (poll != null) {
                ba.this.f48288c.execute(new Runnable() {
                    /* class com.facebook.imagepipeline.n.ba.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(29141);
                    }

                    public final void run() {
                        ba.this.b((k) poll.first, (al) poll.second);
                    }
                });
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.n, com.facebook.imagepipeline.n.b
        public final void a(Throwable th) {
            this.f48362e.b(th);
            c();
        }

        private a(k<T> kVar) {
            super(kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.n.b
        public final void a(T t, int i2) {
            this.f48362e.b(t, i2);
            if (a(i2)) {
                c();
            }
        }

        /* synthetic */ a(ba baVar, k kVar, byte b2) {
            this(kVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(k<T> kVar, al alVar) {
        alVar.c().onProducerFinishWithSuccess(alVar.b(), "ThrottlingProducer", null);
        this.f48289d.a(new a(this, kVar, (byte) 0), alVar);
    }

    public ba(Executor executor, ak<T> akVar) {
        this.f48288c = (Executor) i.a(executor);
        this.f48289d = (ak) i.a(akVar);
        this.f48287b = new ConcurrentLinkedQueue<>();
        this.f48286a = 0;
    }

    @Override // com.facebook.imagepipeline.n.ak
    public final void a(k<T> kVar, al alVar) {
        boolean z;
        MethodCollector.i(11670);
        alVar.c().onProducerStart(alVar.b(), "ThrottlingProducer");
        synchronized (this) {
            try {
                int i2 = this.f48286a;
                z = true;
                if (i2 >= this.f48290e) {
                    this.f48287b.add(Pair.create(kVar, alVar));
                } else {
                    this.f48286a = i2 + 1;
                    z = false;
                }
            } finally {
                MethodCollector.o(11670);
            }
        }
        if (!z) {
            b(kVar, alVar);
        }
    }
}
