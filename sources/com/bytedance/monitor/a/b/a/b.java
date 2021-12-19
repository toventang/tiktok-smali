package com.bytedance.monitor.a.b.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.b.c;
import com.bytedance.monitor.a.b.e;
import com.bytedance.monitor.a.b.f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class b extends ScheduledThreadPoolExecutor implements c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f41378a;

    /* renamed from: b  reason: collision with root package name */
    public f f41379b;

    /* renamed from: c  reason: collision with root package name */
    public ExecutorService f41380c;

    /* renamed from: d  reason: collision with root package name */
    public ThreadPoolExecutor f41381d;

    /* renamed from: e  reason: collision with root package name */
    public int f41382e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, List<ScheduledFuture<?>>> f41383f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Map<ScheduledFuture<?>, Pair<Integer, Boolean>> f41384g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    private a f41385h;

    static {
        Covode.recordClassIndex(25359);
    }

    /* access modifiers changed from: protected */
    public final void terminated() {
        super.terminated();
    }

    public final boolean a() {
        f fVar;
        return this.f41378a && (fVar = this.f41379b) != null && fVar.a();
    }

    private boolean b() {
        if (this.f41382e > 0) {
            return true;
        }
        return false;
    }

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f41388a;

        /* renamed from: b  reason: collision with root package name */
        public Thread f41389b;

        /* renamed from: c  reason: collision with root package name */
        public long f41390c = System.currentTimeMillis();

        /* renamed from: d  reason: collision with root package name */
        public int f41391d;

        static {
            Covode.recordClassIndex(25361);
        }

        public final boolean a() {
            if (System.currentTimeMillis() - this.f41390c > ((long) this.f41391d)) {
                return true;
            }
            return false;
        }

        public final void b() {
            Runnable runnable = this.f41388a;
            if (runnable != null && (runnable instanceof FutureTask)) {
                boolean cancel = ((FutureTask) runnable).cancel(true);
                if (b.this.a()) {
                    b.this.a("TimeSensitive + mCancelOverTimeTaskRunnable run ------------ cancel FutureTask, canceled?".concat(String.valueOf(cancel)));
                }
            }
        }

        public a(Runnable runnable, Thread thread, int i2) {
            this.f41388a = runnable;
            this.f41389b = thread;
            this.f41391d = i2;
        }
    }

    private void c() {
        a aVar = this.f41385h;
        if (aVar != null && aVar.a()) {
            this.f41385h.b();
            this.f41385h = null;
        }
    }

    public final void a(String str) {
        c.a(this.f41379b, str);
    }

    public b(ThreadFactory threadFactory) {
        super(1, threadFactory);
    }

    private static String a(Runnable runnable) {
        if (runnable instanceof e) {
            return ((e) runnable).a();
        }
        if (runnable == null) {
            return "null";
        }
        return runnable.toString();
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void b(e eVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f41381d;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.remove(eVar);
        }
        if (!c(eVar) && a()) {
            a("z-debug-removeTask " + c.a(eVar) + ", remove failed");
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        if (this.f41380c == null) {
            return super.submit(runnable);
        }
        if (a()) {
            a("submit task to outer-executor: " + a(runnable));
        }
        return this.f41380c.submit(runnable);
    }

    private boolean c(e eVar) {
        boolean z;
        boolean z2 = false;
        if (eVar == null) {
            return false;
        }
        int hashCode = eVar.hashCode();
        List<ScheduledFuture<?>> list = this.f41383f.get(Integer.valueOf(hashCode));
        StringBuilder sb = new StringBuilder("z-debug scheduledFutures in ?");
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        a(sb.append(z).toString());
        if (list != null && !list.isEmpty()) {
            if (a()) {
                a("z-debug-removeTask from mTaskFutureMap" + c.a(eVar));
                a("z-debug scheduledFutures size:" + list.size());
            }
            for (ScheduledFuture<?> scheduledFuture : list) {
                if (!scheduledFuture.isCancelled()) {
                    if (scheduledFuture.cancel(true)) {
                        z2 = true;
                    }
                    a(Integer.valueOf(hashCode), scheduledFuture);
                }
            }
        }
        return z2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        if (this.f41380c == null) {
            return super.submit(callable);
        }
        if (a()) {
            a("submit task to outer-executor: ".concat(String.valueOf(callable)));
        }
        return this.f41380c.submit(callable);
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void a(e eVar) {
        if (a()) {
            a("post " + c.a(eVar));
        }
        submit(eVar);
        c();
        if (this.f41380c == null && a()) {
            a("current task count: " + getQueue().size());
        }
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        a(true, runnable, thread);
        super.beforeExecute(thread, runnable);
    }

    private void a(Integer num, ScheduledFuture scheduledFuture) {
        boolean z;
        List<ScheduledFuture<?>> list = this.f41383f.get(num);
        if (list != null) {
            z = list.remove(scheduledFuture);
            if (list.isEmpty()) {
                this.f41383f.remove(num);
            }
        } else {
            z = false;
        }
        this.f41384g.remove(scheduledFuture);
        if (a()) {
            a("z-debug removeMapRecord: " + scheduledFuture + ", removed: " + z);
        }
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        ScheduledFuture scheduledFuture;
        Pair<Integer, Boolean> pair;
        super.afterExecute(runnable, th);
        a(false, runnable, (Thread) null);
        if ((runnable instanceof ScheduledFuture) && (pair = this.f41384g.get((scheduledFuture = (ScheduledFuture) runnable))) != null && pair.first != null) {
            int intValue = ((Integer) pair.first).intValue();
            Boolean bool = (Boolean) pair.second;
            if (bool != null && !bool.booleanValue()) {
                if (a()) {
                    a("z-debug postDelay or scheduled task: " + runnable + ", taskHashCode: " + intValue + ", in map? " + this.f41383f.containsKey(Integer.valueOf(intValue)));
                }
                a(Integer.valueOf(intValue), scheduledFuture);
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ScheduledThreadPoolExecutor, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        if (this.f41380c == null) {
            return super.submit(runnable, t);
        }
        if (a()) {
            a("submit task to outer-executor: " + a(runnable));
        }
        return this.f41380c.submit(runnable, t);
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void a(e eVar, long j2) {
        if (eVar != null) {
            if (a()) {
                a("postDelayed " + c.a(eVar));
            }
            a(schedule(eVar, j2, TimeUnit.MILLISECONDS), eVar.hashCode(), false);
            c();
        }
    }

    private void a(boolean z, Runnable runnable, Thread thread) {
        if (b()) {
            if (z) {
                this.f41385h = new a(runnable, thread, this.f41382e);
            } else {
                this.f41385h = null;
            }
        }
    }

    private void a(ScheduledFuture<?> scheduledFuture, int i2, boolean z) {
        List<ScheduledFuture<?>> list = this.f41383f.get(Integer.valueOf(i2));
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.f41383f.put(Integer.valueOf(i2), list);
        }
        list.add(scheduledFuture);
        this.f41384g.put(scheduledFuture, new Pair<>(Integer.valueOf(i2), Boolean.valueOf(z)));
        if (a()) {
            a("z-debug saveToMap -current task count: " + getQueue().size() + ", thread-count; " + getActiveCount());
            a("z-debug saveToMap >>>>>> mTaskFutureMap size: " + this.f41383f.size() + ", mFutureTaskMap size: " + this.f41384g.size());
            a("z-debug saveToMap >>>>>> sameHashCodeFutures size: " + list.size());
        }
    }

    @Override // com.bytedance.monitor.a.b.a.c
    public final void a(e eVar, long j2, long j3) {
        if (eVar != null) {
            if (a()) {
                a("scheduleWithFixedDelay " + c.a(eVar) + ", initialDelay: " + j2 + ", delayInMillis: " + j3 + "\n task count: " + getQueue().size());
            }
            c(eVar);
            a(scheduleWithFixedDelay(eVar, j2, j3, TimeUnit.MILLISECONDS), eVar.hashCode(), true);
            c();
        }
    }
}
