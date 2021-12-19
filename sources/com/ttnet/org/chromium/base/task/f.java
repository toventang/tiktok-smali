package com.ttnet.org.chromium.base.task;

import android.os.AsyncTask;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.b;
import com.ttnet.org.chromium.base.task.a;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

final class f extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    private static final int f155320a;

    /* renamed from: b  reason: collision with root package name */
    private static final int f155321b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f155322c;

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadFactory f155323d = new ThreadFactory() {
        /* class com.ttnet.org.chromium.base.task.f.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f155325a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(103347);
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(new g(runnable), "CrAsyncTask #" + this.f155325a.getAndIncrement());
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private static final BlockingQueue<Runnable> f155324e = new ArrayBlockingQueue(128);

    f() {
        this(f155321b, f155322c, TimeUnit.SECONDS, f155324e, f155323d);
    }

    static {
        Covode.recordClassIndex(103346);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f155320a = availableProcessors;
        f155321b = Math.max(2, Math.min(availableProcessors - 1, 4));
        f155322c = (availableProcessors * 2) + 1;
    }

    private static String a(Runnable runnable) {
        Class<?> cls = runnable.getClass();
        if (cls == a.C4116a.class) {
            try {
                cls = a.this.getClass();
            } catch (NoSuchFieldException e2) {
                if (b.f155218a) {
                    throw new RuntimeException(e2);
                }
            } catch (IllegalAccessException e3) {
                if (b.f155218a) {
                    throw new RuntimeException(e3);
                }
            }
        } else if (cls.getEnclosingClass() == AsyncTask.class) {
            Field declaredField = cls.getDeclaredField("this$0");
            declaredField.setAccessible(true);
            cls = declaredField.get(runnable).getClass();
        }
        return cls.getName();
    }

    public final void execute(Runnable runnable) {
        int i2;
        MethodCollector.i(12202);
        try {
            super.execute(runnable);
            MethodCollector.o(12202);
        } catch (RejectedExecutionException e2) {
            HashMap hashMap = new HashMap();
            for (Runnable runnable2 : (Runnable[]) getQueue().toArray(new Runnable[0])) {
                String a2 = a(runnable2);
                if (hashMap.containsKey(a2)) {
                    i2 = ((Integer) hashMap.get(a2)).intValue();
                } else {
                    i2 = 0;
                }
                hashMap.put(a2, Integer.valueOf(i2 + 1));
            }
            RejectedExecutionException rejectedExecutionException = new RejectedExecutionException("Prominent classes in AsyncTask: " + a(hashMap), e2);
            MethodCollector.o(12202);
            throw rejectedExecutionException;
        }
    }

    private static String a(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() > 32) {
                sb.append(entry.getKey()).append(' ');
            }
        }
        if (sb.length() == 0) {
            return "NO CLASSES FOUND";
        }
        return sb.toString();
    }

    private f(int i2, int i3, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(i2, i3, 30, timeUnit, blockingQueue, threadFactory);
        allowCoreThreadTimeOut(true);
    }
}
