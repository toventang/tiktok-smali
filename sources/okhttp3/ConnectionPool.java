package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;

public final class ConnectionPool {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Executor executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));
    private final Runnable cleanupRunnable;
    boolean cleanupRunning;
    private final Deque<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;
    final RouteDatabase routeDatabase;

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public final synchronized int connectionCount() {
        int size;
        MethodCollector.i(158);
        size = this.connections.size();
        MethodCollector.o(158);
        return size;
    }

    static {
        Covode.recordClassIndex(106132);
    }

    public final synchronized int idleConnectionCount() {
        int i2;
        MethodCollector.i(155);
        i2 = 0;
        for (RealConnection realConnection : this.connections) {
            if (realConnection.allocations.isEmpty()) {
                i2++;
            }
        }
        MethodCollector.o(155);
        return i2;
    }

    public final void evictAll() {
        MethodCollector.i(163);
        ArrayList<RealConnection> arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealConnection> it = this.connections.iterator();
                while (it.hasNext()) {
                    RealConnection next = it.next();
                    if (next.allocations.isEmpty()) {
                        next.noNewStreams = true;
                        arrayList.add(next);
                        it.remove();
                    }
                }
            } finally {
                MethodCollector.o(163);
            }
        }
        for (RealConnection realConnection : arrayList) {
            Util.closeQuietly(realConnection.socket());
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean connectionBecameIdle(RealConnection realConnection) {
        if (realConnection.noNewStreams || this.maxIdleConnections == 0) {
            this.connections.remove(realConnection);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void put(RealConnection realConnection) {
        if (!this.cleanupRunning) {
            this.cleanupRunning = true;
            executor.execute(this.cleanupRunnable);
        }
        this.connections.add(realConnection);
    }

    /* access modifiers changed from: package-private */
    public final long cleanup(long j2) {
        MethodCollector.i(164);
        synchronized (this) {
            try {
                RealConnection realConnection = null;
                long j3 = Long.MIN_VALUE;
                int i2 = 0;
                int i3 = 0;
                for (RealConnection realConnection2 : this.connections) {
                    if (pruneAndGetAllocationCount(realConnection2, j2) > 0) {
                        i3++;
                    } else {
                        i2++;
                        long j4 = j2 - realConnection2.idleAtNanos;
                        if (j4 > j3) {
                            realConnection = realConnection2;
                            j3 = j4;
                        }
                    }
                }
                long j5 = this.keepAliveDurationNs;
                if (j3 >= j5 || i2 > this.maxIdleConnections) {
                    this.connections.remove(realConnection);
                    Util.closeQuietly(realConnection.socket());
                    MethodCollector.o(164);
                    return 0;
                } else if (i2 > 0) {
                    return j5 - j3;
                } else if (i3 > 0) {
                    MethodCollector.o(164);
                    return j5;
                } else {
                    this.cleanupRunning = false;
                    MethodCollector.o(164);
                    return -1;
                }
            } finally {
                MethodCollector.o(164);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Socket deduplicate(Address address, StreamAllocation streamAllocation) {
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, null) && realConnection.isMultiplexed() && realConnection != streamAllocation.connection()) {
                return streamAllocation.releaseAndAcquire(realConnection);
            }
        }
        return null;
    }

    private int pruneAndGetAllocationCount(RealConnection realConnection, long j2) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference<StreamAllocation> reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((StreamAllocation.StreamAllocationReference) reference).callStackTrace);
                list.remove(i2);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j2 - this.keepAliveDurationNs;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public final RealConnection get(Address address, StreamAllocation streamAllocation, Route route) {
        for (RealConnection realConnection : this.connections) {
            if (realConnection.isEligible(address, route)) {
                streamAllocation.acquire(realConnection, true);
                return realConnection;
            }
        }
        return null;
    }

    public ConnectionPool(int i2, long j2, TimeUnit timeUnit) {
        this.cleanupRunnable = new Runnable() {
            /* class okhttp3.ConnectionPool.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106133);
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(981);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
                throw r0;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r8 = this;
                    r7 = 981(0x3d5, float:1.375E-42)
                    com.bytedance.frameworks.apm.trace.MethodCollector.i(r7)
                L_0x0005:
                    okhttp3.ConnectionPool r2 = okhttp3.ConnectionPool.this
                    long r0 = java.lang.System.nanoTime()
                    long r5 = r2.cleanup(r0)
                    r1 = -1
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 != 0) goto L_0x0019
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
                    return
                L_0x0019:
                    r1 = 0
                    int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                    if (r0 <= 0) goto L_0x0005
                    r0 = 1000000(0xf4240, double:4.940656E-318)
                    long r3 = r5 / r0
                    long r0 = r0 * r3
                    long r5 = r5 - r0
                    okhttp3.ConnectionPool r2 = okhttp3.ConnectionPool.this
                    monitor-enter(r2)
                    okhttp3.ConnectionPool r1 = okhttp3.ConnectionPool.this     // Catch:{ InterruptedException -> 0x002f }
                    int r0 = (int) r5     // Catch:{ InterruptedException -> 0x002f }
                    r1.wait(r3, r0)     // Catch:{ InterruptedException -> 0x002f }
                L_0x002f:
                    monitor-exit(r2)     // Catch:{ all -> 0x0031 }
                    goto L_0x0005
                L_0x0031:
                    r0 = move-exception
                    monitor-exit(r2)
                    com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.ConnectionPool.AnonymousClass1.run():void");
            }
        };
        this.connections = new ArrayDeque();
        this.routeDatabase = new RouteDatabase();
        this.maxIdleConnections = i2;
        this.keepAliveDurationNs = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: ".concat(String.valueOf(j2)));
        }
    }
}
