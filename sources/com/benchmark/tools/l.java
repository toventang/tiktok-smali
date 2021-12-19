package com.benchmark.tools;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class l<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f6393a;

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f6394b = new b((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private TResult f6395c;

    /* renamed from: d  reason: collision with root package name */
    private Exception f6396d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6397e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f6398f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private List<a<TResult, Void>> f6399g = new ArrayList();

    public interface a<TTaskResult, TContinuationResult> {
        static {
            Covode.recordClassIndex(3077);
        }

        TContinuationResult a(l<TTaskResult> lVar);
    }

    static class b implements Executor {
        static {
            Covode.recordClassIndex(3078);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public final boolean b() {
        boolean z;
        MethodCollector.i(599);
        synchronized (this.f6398f) {
            try {
                z = this.f6397e;
            } finally {
                MethodCollector.o(599);
            }
        }
        return z;
    }

    static {
        Covode.recordClassIndex(3073);
        l.a a2 = com.ss.android.ugc.aweme.cw.l.a(o.FIXED);
        a2.f79174c = 1;
        f6393a = g.a(a2.a());
    }

    private void c() {
        MethodCollector.i(598);
        synchronized (this.f6398f) {
            try {
                for (a<TResult, Void> aVar : this.f6399g) {
                    try {
                        aVar.a(this);
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception e3) {
                        RuntimeException runtimeException = new RuntimeException(e3);
                        MethodCollector.o(598);
                        throw runtimeException;
                    }
                }
                this.f6399g = null;
            } finally {
                MethodCollector.o(598);
            }
        }
        MethodCollector.o(598);
    }

    public final TResult a() {
        TResult tresult;
        MethodCollector.i(596);
        synchronized (this.f6398f) {
            try {
                tresult = this.f6395c;
            } finally {
                MethodCollector.o(596);
            }
        }
        return tresult;
    }

    public final void a(Exception exc) {
        MethodCollector.i(595);
        synchronized (this.f6398f) {
            try {
                if (!this.f6397e) {
                    this.f6397e = true;
                    this.f6396d = exc;
                    this.f6398f.notifyAll();
                    c();
                    MethodCollector.o(595);
                }
            } finally {
                MethodCollector.o(595);
            }
        }
    }

    public final void a(TResult tresult) {
        MethodCollector.i(594);
        synchronized (this.f6398f) {
            try {
                if (!this.f6397e) {
                    this.f6397e = true;
                    this.f6395c = tresult;
                    this.f6398f.notifyAll();
                    c();
                    MethodCollector.o(594);
                }
            } finally {
                MethodCollector.o(594);
            }
        }
    }

    public static <TResult> l<TResult> a(final Callable<TResult> callable, Executor executor) {
        l<TResult> lVar = new l<>();
        try {
            executor.execute(new Runnable(lVar) {
                /* class com.benchmark.tools.l.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ l f6400a;

                static {
                    Covode.recordClassIndex(3074);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.benchmark.tools.l */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    try {
                        this.f6400a.a(callable.call());
                    } catch (Exception e2) {
                        this.f6400a.a(e2);
                    }
                }

                {
                    this.f6400a = r1;
                }
            });
        } catch (Exception e2) {
            lVar.a(e2);
        }
        return lVar;
    }

    public final <TContinuationResult> l<TContinuationResult> a(final a<TResult, TContinuationResult> aVar, final Executor executor) {
        boolean b2;
        MethodCollector.i(600);
        final l<TContinuationResult> lVar = new l<>();
        synchronized (this.f6398f) {
            try {
                b2 = b();
                if (!b2) {
                    this.f6399g.add(new a<TResult, Void>() {
                        /* class com.benchmark.tools.l.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(3075);
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: b */
                        public Void a(l<TResult> lVar) {
                            l.this.a(lVar, aVar, lVar, executor);
                            return null;
                        }
                    });
                }
            } finally {
                MethodCollector.o(600);
            }
        }
        if (b2) {
            a(lVar, aVar, this, executor);
        }
        return lVar;
    }

    public final <TContinuationResult, TResult> void a(final l<TContinuationResult> lVar, final a<TResult, TContinuationResult> aVar, final l<TResult> lVar2, Executor executor) {
        try {
            executor.execute(new Runnable() {
                /* class com.benchmark.tools.l.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(3076);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.benchmark.tools.l */
                /* JADX WARN: Multi-variable type inference failed */
                public final void run() {
                    try {
                        lVar.a(aVar.a(lVar2));
                    } catch (Exception e2) {
                        lVar.a(e2);
                    }
                }
            });
        } catch (Exception e2) {
            lVar.a(e2);
        }
    }
}
