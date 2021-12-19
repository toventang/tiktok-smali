package com.google.c.h.a;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.a.s;
import com.google.c.h.a.j;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class u {
    static {
        Covode.recordClassIndex(33663);
    }

    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f54246a;

        static {
            Covode.recordClassIndex(33667);
        }

        public final boolean isShutdown() {
            return this.f54246a.isShutdown();
        }

        public final boolean isTerminated() {
            return this.f54246a.isTerminated();
        }

        public final void shutdown() {
            this.f54246a.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return this.f54246a.shutdownNow();
        }

        public final void execute(Runnable runnable) {
            this.f54246a.execute(runnable);
        }

        public b(ExecutorService executorService) {
            this.f54246a = (ExecutorService) k.a(executorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
            return this.f54246a.awaitTermination(j2, timeUnit);
        }
    }

    public static final class c extends b implements t {

        /* renamed from: a  reason: collision with root package name */
        final ScheduledExecutorService f54247a;

        static {
            Covode.recordClassIndex(33668);
        }

        static final class b extends b<Void> implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private final Runnable f54249a;

            static {
                Covode.recordClassIndex(33670);
            }

            public final void run() {
                try {
                    this.f54249a.run();
                } catch (Throwable th) {
                    a(th);
                    s.a(th);
                    throw new RuntimeException(th);
                }
            }

            public b(Runnable runnable) {
                this.f54249a = (Runnable) k.a(runnable);
            }
        }

        static final class a<V> extends j.a<V> implements r<V> {

            /* renamed from: a  reason: collision with root package name */
            private final ScheduledFuture<?> f54248a;

            static {
                Covode.recordClassIndex(33669);
            }

            @Override // java.lang.Comparable
            public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
                return this.f54248a.compareTo(obj);
            }

            public final long getDelay(TimeUnit timeUnit) {
                return this.f54248a.getDelay(timeUnit);
            }

            @Override // com.google.c.h.a.i
            public final boolean cancel(boolean z) {
                boolean cancel = super.cancel(z);
                if (cancel) {
                    this.f54248a.cancel(z);
                }
                return cancel;
            }

            public a(q<V> qVar, ScheduledFuture<?> scheduledFuture) {
                super(qVar);
                this.f54248a = scheduledFuture;
            }
        }

        public c(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f54247a = (ScheduledExecutorService) k.a(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
            w a2 = w.a(callable);
            return new a(a2, this.f54247a.schedule(a2, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            w a2 = w.a(runnable, (Object) null);
            return new a(a2, this.f54247a.schedule(a2, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f54247a.scheduleAtFixedRate(bVar, j2, j3, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            b bVar = new b(runnable);
            return new a(bVar, this.f54247a.scheduleWithFixedDelay(bVar, j2, j3, timeUnit));
        }
    }

    public enum a implements Executor {
        INSTANCE;

        public final String toString() {
            return "MoreExecutors.directExecutor()";
        }

        static {
            Covode.recordClassIndex(33666);
        }

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a(final Executor executor, final b<?> bVar) {
        k.a(executor);
        k.a(bVar);
        if (executor == a.INSTANCE) {
            return executor;
        }
        return new Executor() {
            /* class com.google.c.h.a.u.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            boolean f54239a = true;

            static {
                Covode.recordClassIndex(33664);
            }

            public final void execute(final Runnable runnable) {
                try {
                    executor.execute(new Runnable() {
                        /* class com.google.c.h.a.u.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(33665);
                        }

                        public final void run() {
                            AnonymousClass1.this.f54239a = false;
                            runnable.run();
                        }
                    });
                } catch (RejectedExecutionException e2) {
                    if (this.f54239a) {
                        bVar.a((Throwable) e2);
                    }
                }
            }
        };
    }
}
