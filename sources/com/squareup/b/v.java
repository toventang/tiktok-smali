package com.squareup.b;

import com.bytedance.covode.number.Covode;
import com.squareup.b.ae;
import com.squareup.b.t;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class v extends ThreadPoolExecutor {
    static {
        Covode.recordClassIndex(36087);
    }

    v() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ae.b());
    }

    static final class a extends FutureTask<c> implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        private final c f58111a;

        static {
            Covode.recordClassIndex(36088);
        }

        public a(c cVar) {
            super(cVar, null);
            this.f58111a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            a aVar2 = aVar;
            t.e eVar = this.f58111a.s;
            t.e eVar2 = aVar2.f58111a.s;
            if (eVar == eVar2) {
                return this.f58111a.f58004a - aVar2.f58111a.f58004a;
            }
            return eVar2.ordinal() - eVar.ordinal();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        setCorePoolSize(i2);
        setMaximumPoolSize(i2);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        a aVar = new a((c) runnable);
        execute(aVar);
        return aVar;
    }
}
