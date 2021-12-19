package okhttp3.internal.connection;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;

public final class StreamAllocation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public final Address address;
    public final Call call;
    private final Object callStackTrace;
    private boolean canceled;
    private HttpCodec codec;
    private RealConnection connection;
    private final ConnectionPool connectionPool;
    public final EventListener eventListener;
    private int refusedStreamCount;
    private boolean released;
    private boolean reportedAcquired;
    private Route route;
    private RouteSelector.Selection routeSelection;
    private final RouteSelector routeSelector;

    static {
        Covode.recordClassIndex(106224);
    }

    public final Route route() {
        return this.route;
    }

    private RouteDatabase routeDatabase() {
        return Internal.instance.routeDatabase(this.connectionPool);
    }

    public final synchronized RealConnection connection() {
        RealConnection realConnection;
        MethodCollector.i(4076);
        realConnection = this.connection;
        MethodCollector.o(4076);
        return realConnection;
    }

    private Socket releaseIfNoNewStreams() {
        RealConnection realConnection = this.connection;
        if (realConnection == null || !realConnection.noNewStreams) {
            return null;
        }
        return deallocate(false, false, true);
    }

    public final HttpCodec codec() {
        HttpCodec httpCodec;
        MethodCollector.i(4071);
        synchronized (this.connectionPool) {
            try {
                httpCodec = this.codec;
            } finally {
                MethodCollector.o(4071);
            }
        }
        return httpCodec;
    }

    public final boolean hasMoreRoutes() {
        if (this.route != null) {
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if ((selection == null || !selection.hasNext()) && !this.routeSelector.hasNext()) {
            return false;
        }
        return true;
    }

    public final String toString() {
        RealConnection connection2 = connection();
        if (connection2 != null) {
            return connection2.toString();
        }
        return this.address.toString();
    }

    public final void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        MethodCollector.i(4082);
        synchronized (this.connectionPool) {
            try {
                this.canceled = true;
                httpCodec = this.codec;
                realConnection = this.connection;
            } finally {
                MethodCollector.o(4082);
            }
        }
        if (httpCodec != null) {
            httpCodec.cancel();
            MethodCollector.o(4082);
            return;
        }
        if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public final void noNewStreams() {
        RealConnection realConnection;
        Socket deallocate;
        MethodCollector.i(4078);
        synchronized (this.connectionPool) {
            try {
                realConnection = this.connection;
                deallocate = deallocate(true, false, false);
                if (this.connection != null) {
                    realConnection = null;
                }
            } finally {
                MethodCollector.o(4078);
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public final void release() {
        RealConnection realConnection;
        Socket deallocate;
        MethodCollector.i(4077);
        synchronized (this.connectionPool) {
            try {
                realConnection = this.connection;
                deallocate = deallocate(false, true, false);
                if (this.connection != null) {
                    realConnection = null;
                }
            } finally {
                MethodCollector.o(4077);
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.connectionReleased(this.call, realConnection);
            this.eventListener.callEnd(this.call);
        }
    }

    private void release(RealConnection realConnection) {
        int size = realConnection.allocations.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (realConnection.allocations.get(i2).get() == this) {
                realConnection.allocations.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.codec == null && this.connection.allocations.size() == 1) {
            Reference<StreamAllocation> reference = this.connection.allocations.get(0);
            Socket deallocate = deallocate(true, false, false);
            this.connection = realConnection;
            realConnection.allocations.add(reference);
            return deallocate;
        }
        throw new IllegalStateException();
    }

    public final void streamFailed(IOException iOException) {
        RealConnection realConnection;
        boolean z;
        Socket deallocate;
        MethodCollector.i(90);
        synchronized (this.connectionPool) {
            try {
                realConnection = null;
                if (iOException instanceof StreamResetException) {
                    ErrorCode errorCode = ((StreamResetException) iOException).errorCode;
                    if (errorCode == ErrorCode.REFUSED_STREAM) {
                        int i2 = this.refusedStreamCount + 1;
                        this.refusedStreamCount = i2;
                        if (i2 > 1) {
                        }
                    } else if (errorCode != ErrorCode.CANCEL) {
                        this.route = null;
                        z = true;
                        RealConnection realConnection2 = this.connection;
                        deallocate = deallocate(z, false, true);
                        if (this.connection == null && this.reportedAcquired) {
                            realConnection = realConnection2;
                        }
                    }
                    z = false;
                    RealConnection realConnection22 = this.connection;
                    deallocate = deallocate(z, false, true);
                    realConnection = realConnection22;
                } else {
                    RealConnection realConnection3 = this.connection;
                    if (realConnection3 != null && (!realConnection3.isMultiplexed() || (iOException instanceof ConnectionShutdownException))) {
                        if (this.connection.successCount == 0) {
                            Route route2 = this.route;
                            if (!(route2 == null || iOException == null)) {
                                this.routeSelector.connectFailed(route2, iOException);
                            }
                        }
                        z = true;
                        RealConnection realConnection222 = this.connection;
                        deallocate = deallocate(z, false, true);
                        realConnection = realConnection222;
                    }
                    z = false;
                    RealConnection realConnection2222 = this.connection;
                    deallocate = deallocate(z, false, true);
                    realConnection = realConnection2222;
                }
                this.route = null;
                z = true;
                RealConnection realConnection22222 = this.connection;
                deallocate = deallocate(z, false, true);
                realConnection = realConnection22222;
            } finally {
                MethodCollector.o(90);
            }
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        static {
            Covode.recordClassIndex(106225);
        }

        StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }

    public final void acquire(RealConnection realConnection, boolean z) {
        if (this.connection == null) {
            this.connection = realConnection;
            this.reportedAcquired = z;
            realConnection.allocations.add(new StreamAllocationReference(this, this.callStackTrace));
            return;
        }
        throw new IllegalStateException();
    }

    public final HttpCodec newStream(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z) {
        MethodCollector.i(625);
        try {
            HttpCodec newCodec = findHealthyConnection(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z).newCodec(okHttpClient, chain, this);
            synchronized (this.connectionPool) {
                try {
                    this.codec = newCodec;
                } finally {
                    MethodCollector.o(625);
                }
            }
            return newCodec;
        } catch (IOException e2) {
            RouteException routeException = new RouteException(e2);
            MethodCollector.o(625);
            throw routeException;
        }
    }

    private Socket deallocate(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.codec = null;
        }
        if (z2) {
            this.released = true;
        }
        RealConnection realConnection = this.connection;
        if (realConnection == null) {
            return null;
        }
        if (z) {
            realConnection.noNewStreams = true;
        }
        if (this.codec != null) {
            return null;
        }
        if (!this.released && !this.connection.noNewStreams) {
            return null;
        }
        release(this.connection);
        if (this.connection.allocations.isEmpty()) {
            this.connection.idleAtNanos = System.nanoTime();
            if (Internal.instance.connectionBecameIdle(this.connectionPool, this.connection)) {
                socket = this.connection.socket();
                this.connection = null;
                return socket;
            }
        }
        socket = null;
        this.connection = null;
        return socket;
    }

    public final void streamFinished(boolean z, HttpCodec httpCodec, long j2, IOException iOException) {
        RealConnection realConnection;
        Socket deallocate;
        boolean z2;
        MethodCollector.i(868);
        this.eventListener.responseBodyEnd(this.call, j2);
        synchronized (this.connectionPool) {
            if (httpCodec != null) {
                try {
                    if (httpCodec == this.codec) {
                        if (!z) {
                            this.connection.successCount++;
                        }
                        realConnection = this.connection;
                        deallocate = deallocate(z, false, true);
                        if (this.connection != null) {
                            realConnection = null;
                        }
                        z2 = this.released;
                    }
                } finally {
                    MethodCollector.o(868);
                }
            }
            IllegalStateException illegalStateException = new IllegalStateException("expected " + this.codec + " but was " + httpCodec);
            MethodCollector.o(868);
            throw illegalStateException;
        }
        Util.closeQuietly(deallocate);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, Internal.instance.timeoutExit(this.call, iOException));
            MethodCollector.o(868);
            return;
        }
        if (z2) {
            Internal.instance.timeoutExit(this.call, null);
            this.eventListener.callEnd(this.call);
        }
    }

    public StreamAllocation(ConnectionPool connectionPool2, Address address2, Call call2, EventListener eventListener2, Object obj) {
        this.connectionPool = connectionPool2;
        this.address = address2;
        this.call = call2;
        this.eventListener = eventListener2;
        this.routeSelector = new RouteSelector(address2, routeDatabase(), call2, eventListener2);
        this.callStackTrace = obj;
    }

    private RealConnection findConnection(int i2, int i3, int i4, int i5, boolean z) {
        RealConnection realConnection;
        Socket releaseIfNoNewStreams;
        RealConnection realConnection2;
        Socket socket;
        boolean z2;
        Route route2;
        boolean z3;
        RouteSelector.Selection selection;
        MethodCollector.i(865);
        synchronized (this.connectionPool) {
            try {
                if (this.released) {
                    IllegalStateException illegalStateException = new IllegalStateException("released");
                    MethodCollector.o(865);
                    throw illegalStateException;
                } else if (this.codec != null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("codec != null");
                    MethodCollector.o(865);
                    throw illegalStateException2;
                } else if (!this.canceled) {
                    realConnection = this.connection;
                    releaseIfNoNewStreams = releaseIfNoNewStreams();
                    realConnection2 = this.connection;
                    socket = null;
                    if (realConnection2 != null) {
                        realConnection = null;
                    } else {
                        realConnection2 = null;
                    }
                    if (!this.reportedAcquired) {
                        realConnection = null;
                    }
                    if (realConnection2 == null) {
                        Internal.instance.get(this.connectionPool, this.address, this, null);
                        RealConnection realConnection3 = this.connection;
                        if (realConnection3 != null) {
                            realConnection2 = realConnection3;
                            z2 = true;
                            route2 = null;
                        } else {
                            route2 = this.route;
                        }
                    } else {
                        route2 = null;
                    }
                    z2 = false;
                } else {
                    IOException iOException = new IOException("Canceled");
                    MethodCollector.o(865);
                    throw iOException;
                }
            } finally {
                MethodCollector.o(865);
            }
        }
        Util.closeQuietly(releaseIfNoNewStreams);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            this.route = this.connection.route();
            MethodCollector.o(865);
            return realConnection2;
        }
        if (route2 != null || ((selection = this.routeSelection) != null && selection.hasNext())) {
            z3 = false;
        } else {
            this.routeSelection = this.routeSelector.next();
            z3 = true;
        }
        synchronized (this.connectionPool) {
            try {
                if (!this.canceled) {
                    if (z3) {
                        List<Route> all = this.routeSelection.getAll();
                        int size = all.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size) {
                                break;
                            }
                            Route route3 = all.get(i6);
                            Internal.instance.get(this.connectionPool, this.address, this, route3);
                            RealConnection realConnection4 = this.connection;
                            if (realConnection4 != null) {
                                this.route = route3;
                                realConnection2 = realConnection4;
                                z2 = true;
                                break;
                            }
                            i6++;
                        }
                    }
                    if (!z2) {
                        if (route2 == null) {
                            route2 = this.routeSelection.next();
                        }
                        this.route = route2;
                        this.refusedStreamCount = 0;
                        realConnection2 = new RealConnection(this.connectionPool, route2);
                        acquire(realConnection2, false);
                    }
                } else {
                    IOException iOException2 = new IOException("Canceled");
                    MethodCollector.o(865);
                    throw iOException2;
                }
            } finally {
                MethodCollector.o(865);
            }
        }
        if (z2) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
            MethodCollector.o(865);
            return realConnection2;
        }
        realConnection2.connect(i2, i3, i4, i5, z, this.call, this.eventListener);
        routeDatabase().connected(realConnection2.route());
        synchronized (this.connectionPool) {
            try {
                this.reportedAcquired = true;
                Internal.instance.put(this.connectionPool, realConnection2);
                if (realConnection2.isMultiplexed()) {
                    socket = Internal.instance.deduplicate(this.connectionPool, this.address, this);
                    realConnection2 = this.connection;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Util.closeQuietly(socket);
        this.eventListener.connectionAcquired(this.call, realConnection2);
        MethodCollector.o(865);
        return realConnection2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r2.isHealthy(r10) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.connection.RealConnection findHealthyConnection(int r5, int r6, int r7, int r8, boolean r9, boolean r10) {
        /*
            r4 = this;
            r3 = 626(0x272, float:8.77E-43)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
        L_0x0005:
            okhttp3.internal.connection.RealConnection r2 = r4.findConnection(r5, r6, r7, r8, r9)
            okhttp3.ConnectionPool r1 = r4.connectionPool
            monitor-enter(r1)
            int r0 = r2.successCount     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0018
            boolean r0 = r2.isMultiplexed()     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            goto L_0x0023
        L_0x0018:
            monitor-exit(r1)
            boolean r0 = r2.isHealthy(r10)
            if (r0 != 0) goto L_0x0027
            r4.noNewStreams()
            goto L_0x0005
        L_0x0023:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x0027:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return r2
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.findHealthyConnection(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }
}
