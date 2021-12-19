package com.bytedance.platform.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.b.a.a;
import com.bytedance.platform.b.a.b;
import com.bytedance.platform.b.a.c;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class e extends ThreadPoolExecutor implements c {

    /* renamed from: a  reason: collision with root package name */
    private String f41919a;

    /* renamed from: b  reason: collision with root package name */
    private ThreadLocal<a> f41920b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    private Map<Runnable, c> f41921c = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25604);
    }

    @Override // com.bytedance.platform.b.c
    public final String a() {
        if (!TextUtils.isEmpty(this.f41919a)) {
            return this.f41919a;
        }
        return "PlatformScheduleExecutor";
    }

    public final void execute(Runnable runnable) {
        MethodCollector.i(9478);
        if (b.f41906b) {
            c cVar = new c(this, runnable);
            this.f41921c.put(runnable, cVar);
            b.f41905a.postDelayed(cVar, (long) b.f41908d);
        }
        super.execute(runnable);
        MethodCollector.o(9478);
    }

    /* access modifiers changed from: protected */
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (b.f41906b) {
            b.f41905a.removeCallbacks(this.f41920b.get());
        }
    }

    /* access modifiers changed from: protected */
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        if (b.f41906b) {
            b.f41905a.removeCallbacks(this.f41921c.remove(runnable));
            a aVar = new a(this, thread, runnable);
            this.f41920b.set(aVar);
            b.f41905a.postDelayed(aVar, (long) b.f41907c);
        }
    }

    public e(int i2, int i3, long j2, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, String str) {
        super(i2, i3, j2, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f41919a = str;
    }
}
