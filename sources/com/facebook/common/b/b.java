package com.facebook.common.b;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends AbstractExecutorService {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f47055a = b.class;

    /* renamed from: b  reason: collision with root package name */
    public final String f47056b;

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<Runnable> f47057c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f47058d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f47059e;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f47060f = 1;

    /* renamed from: g  reason: collision with root package name */
    private final a f47061g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicInteger f47062h;

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    static {
        Covode.recordClassIndex(28613);
    }

    public final void a() {
        int i2 = this.f47058d.get();
        while (i2 < this.f47060f) {
            int i3 = i2 + 1;
            if (this.f47058d.compareAndSet(i2, i3)) {
                com.facebook.common.e.a.a(f47055a, "%s: starting worker %d of %d", this.f47056b, Integer.valueOf(i3), Integer.valueOf(this.f47060f));
                this.f47059e.execute(this.f47061g);
                return;
            }
            com.facebook.common.e.a.a(f47055a, "%s: race in startWorkerIfNeeded; retrying", this.f47056b);
            i2 = this.f47058d.get();
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        static {
            Covode.recordClassIndex(28614);
        }

        public final void run() {
            int decrementAndGet;
            boolean isEmpty;
            try {
                Runnable poll = b.this.f47057c.poll();
                if (poll != null) {
                    poll.run();
                } else {
                    com.facebook.common.e.a.a(b.f47055a, "%s: Worker has nothing to run", b.this.f47056b);
                }
                if (isEmpty) {
                    com.facebook.common.e.a.a(b.f47055a, "%s: worker finished; %d workers left", b.this.f47056b, Integer.valueOf(decrementAndGet));
                }
            } finally {
                decrementAndGet = b.this.f47058d.decrementAndGet();
                if (!b.this.f47057c.isEmpty()) {
                    b.this.a();
                } else {
                    com.facebook.common.e.a.a(b.f47055a, "%s: worker finished; %d workers left", b.this.f47056b, Integer.valueOf(decrementAndGet));
                }
            }
        }

        private a() {
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }
    }

    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable, "runnable parameter is null");
        if (this.f47057c.offer(runnable)) {
            int size = this.f47057c.size();
            int i2 = this.f47062h.get();
            if (size > i2 && this.f47062h.compareAndSet(i2, size)) {
                com.facebook.common.e.a.a(f47055a, "%s: max pending work in queue = %d", this.f47056b, Integer.valueOf(size));
            }
            a();
            return;
        }
        throw new RejectedExecutionException(this.f47056b + " queue is full, size=" + this.f47057c.size());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public b(String str, Executor executor, BlockingQueue<Runnable> blockingQueue) {
        this.f47056b = str;
        this.f47059e = executor;
        this.f47057c = blockingQueue;
        this.f47061g = new a(this, (byte) 0);
        this.f47058d = new AtomicInteger(0);
        this.f47062h = new AtomicInteger(0);
    }
}
