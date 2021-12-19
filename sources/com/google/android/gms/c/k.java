package com.google.android.gms.c;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class k {

    /* access modifiers changed from: package-private */
    public interface b extends b, d, e<Object> {
        static {
            Covode.recordClassIndex(31160);
        }
    }

    static {
        Covode.recordClassIndex(31158);
    }

    public static <TResult> h<TResult> a(TResult tresult) {
        ac acVar = new ac();
        acVar.a((Object) tresult);
        return acVar;
    }

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f49906a;

        static {
            Covode.recordClassIndex(31159);
        }

        private a() {
            this.f49906a = new CountDownLatch(1);
        }

        @Override // com.google.android.gms.c.e
        public final void a(Object obj) {
            this.f49906a.countDown();
        }

        @Override // com.google.android.gms.c.d
        public final void a(Exception exc) {
            this.f49906a.countDown();
        }

        @Override // com.google.android.gms.c.b
        public final void a() {
            this.f49906a.countDown();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static <TResult> h<TResult> a(Exception exc) {
        ac acVar = new ac();
        acVar.a(exc);
        return acVar;
    }

    public static <TResult> h<TResult> a(Executor executor, Callable<TResult> callable) {
        r.a(executor, "Executor must not be null");
        r.a(callable, "Callback must not be null");
        ac acVar = new ac();
        executor.execute(new ad(acVar, callable));
        return acVar;
    }

    public static <TResult> TResult a(h<TResult> hVar) {
        if (hVar.b()) {
            return hVar.d();
        }
        if (hVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(hVar.e());
    }

    public static void a(h<?> hVar, b bVar) {
        hVar.a(j.f49904b, (e<? super Object>) bVar);
        hVar.a(j.f49904b, (d) bVar);
        hVar.a(j.f49904b, (b) bVar);
    }

    public static <TResult> TResult a(h<TResult> hVar, long j2, TimeUnit timeUnit) {
        r.c("Must not be called on the main application thread");
        r.a(hVar, "Task must not be null");
        r.a(timeUnit, "TimeUnit must not be null");
        if (hVar.a()) {
            return (TResult) a((h) hVar);
        }
        a aVar = new a((byte) 0);
        a((h<?>) hVar, (b) aVar);
        if (aVar.f49906a.await(j2, timeUnit)) {
            return (TResult) a((h) hVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }
}
