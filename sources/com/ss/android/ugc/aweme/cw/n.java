package com.ss.android.ugc.aweme.cw;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* access modifiers changed from: package-private */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, WeakReference<ExecutorService>> f79182a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<o, AtomicInteger> f79183b = new HashMap();

    static {
        Covode.recordClassIndex(49136);
    }

    n() {
    }

    public final String toString() {
        MethodCollector.i(6702);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, WeakReference<ExecutorService>> entry : this.f79182a.entrySet()) {
            String key = entry.getKey();
            if (entry.getValue().get() != null) {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) entry.getValue().get();
                sb.append("pool=").append(key).append(", core.size=").append(threadPoolExecutor.getCorePoolSize()).append(", pool.size=").append(threadPoolExecutor.getPoolSize()).append(", largest.pool.size=").append(threadPoolExecutor.getLargestPoolSize()).append(", queue.size=").append(threadPoolExecutor.getQueue().size()).append(", task.count=").append(threadPoolExecutor.getTaskCount()).append(", task.completed.count=").append(threadPoolExecutor.getCompletedTaskCount()).append("\n");
            }
        }
        String sb2 = sb.toString();
        MethodCollector.o(6702);
        return sb2;
    }

    /* access modifiers changed from: package-private */
    public final void a(o oVar, ExecutorService executorService, boolean z) {
        if (z) {
            this.f79182a.put(oVar.name(), new WeakReference<>(executorService));
            return;
        }
        if (this.f79183b.get(oVar) == null) {
            this.f79183b.put(oVar, new AtomicInteger(0));
        }
        this.f79182a.put(oVar.name() + "_" + this.f79183b.get(oVar).incrementAndGet(), new WeakReference<>(executorService));
    }
}
