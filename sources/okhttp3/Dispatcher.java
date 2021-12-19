package okhttp3;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.RealCall;
import okhttp3.internal.Util;

public final class Dispatcher {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private ExecutorService executorService;
    private Runnable idleCallback;
    private int maxRequests = 64;
    private int maxRequestsPerHost = 5;
    private final Deque<RealCall.AsyncCall> readyAsyncCalls = new ArrayDeque();
    private final Deque<RealCall.AsyncCall> runningAsyncCalls = new ArrayDeque();
    private final Deque<RealCall> runningSyncCalls = new ArrayDeque();

    static {
        Covode.recordClassIndex(106141);
    }

    public final synchronized int getMaxRequests() {
        int i2;
        MethodCollector.i(3333);
        i2 = this.maxRequests;
        MethodCollector.o(3333);
        return i2;
    }

    public final synchronized int getMaxRequestsPerHost() {
        int i2;
        MethodCollector.i(3012);
        i2 = this.maxRequestsPerHost;
        MethodCollector.o(3012);
        return i2;
    }

    public Dispatcher() {
    }

    public final synchronized int queuedCallsCount() {
        int size;
        MethodCollector.i(104);
        size = this.readyAsyncCalls.size();
        MethodCollector.o(104);
        return size;
    }

    public final synchronized int runningCallsCount() {
        int size;
        MethodCollector.i(106);
        size = this.runningAsyncCalls.size() + this.runningSyncCalls.size();
        MethodCollector.o(106);
        return size;
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService2;
        MethodCollector.i(3282);
        if (this.executorService == null) {
            this.executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Dispatcher", false));
        }
        executorService2 = this.executorService;
        MethodCollector.o(3282);
        return executorService2;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> unmodifiableList;
        MethodCollector.i(3624);
        ArrayList arrayList = new ArrayList();
        for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls) {
            arrayList.add(asyncCall.get());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        MethodCollector.o(3624);
        return unmodifiableList;
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> unmodifiableList;
        MethodCollector.i(102);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.runningSyncCalls);
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            arrayList.add(asyncCall.get());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        MethodCollector.o(102);
        return unmodifiableList;
    }

    private boolean promoteAndExecute() {
        int i2;
        boolean z;
        MethodCollector.i(3033);
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
                while (it.hasNext()) {
                    RealCall.AsyncCall next = it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    } else if (runningCallsForHost(next) < this.maxRequestsPerHost) {
                        it.remove();
                        arrayList.add(next);
                        this.runningAsyncCalls.add(next);
                    }
                }
                if (runningCallsCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
                MethodCollector.o(3033);
            }
        }
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((RealCall.AsyncCall) arrayList.get(i2)).executeOn(executorService());
        }
        return z;
    }

    public final synchronized void cancelAll() {
        MethodCollector.i(3028);
        for (RealCall.AsyncCall asyncCall : this.readyAsyncCalls) {
            asyncCall.get().cancel();
        }
        for (RealCall.AsyncCall asyncCall2 : this.runningAsyncCalls) {
            asyncCall2.get().cancel();
        }
        for (RealCall realCall : this.runningSyncCalls) {
            realCall.cancel();
        }
        MethodCollector.o(3028);
    }

    /* access modifiers changed from: package-private */
    public final void finished(RealCall.AsyncCall asyncCall) {
        finished(this.runningAsyncCalls, asyncCall);
    }

    /* access modifiers changed from: package-private */
    public final void finished(RealCall realCall) {
        finished(this.runningSyncCalls, realCall);
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        MethodCollector.i(3013);
        this.idleCallback = runnable;
        MethodCollector.o(3013);
    }

    /* access modifiers changed from: package-private */
    public final void enqueue(RealCall.AsyncCall asyncCall) {
        MethodCollector.i(3015);
        synchronized (this) {
            try {
                this.readyAsyncCalls.add(asyncCall);
            } catch (Throwable th) {
                MethodCollector.o(3015);
                throw th;
            }
        }
        promoteAndExecute();
        MethodCollector.o(3015);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void executed(RealCall realCall) {
        MethodCollector.i(3538);
        this.runningSyncCalls.add(realCall);
        MethodCollector.o(3538);
    }

    public Dispatcher(ExecutorService executorService2) {
        this.executorService = executorService2;
    }

    private int runningCallsForHost(RealCall.AsyncCall asyncCall) {
        int i2 = 0;
        for (RealCall.AsyncCall asyncCall2 : this.runningAsyncCalls) {
            if (!asyncCall2.get().forWebSocket && asyncCall2.host().equals(asyncCall.host())) {
                i2++;
            }
        }
        return i2;
    }

    public final void setMaxRequests(int i2) {
        MethodCollector.i(3314);
        if (i2 > 0) {
            synchronized (this) {
                try {
                    this.maxRequests = i2;
                } catch (Throwable th) {
                    MethodCollector.o(3314);
                    throw th;
                }
            }
            promoteAndExecute();
            MethodCollector.o(3314);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("max < 1: ".concat(String.valueOf(i2)));
        MethodCollector.o(3314);
        throw illegalArgumentException;
    }

    public final void setMaxRequestsPerHost(int i2) {
        MethodCollector.i(3010);
        if (i2 > 0) {
            synchronized (this) {
                try {
                    this.maxRequestsPerHost = i2;
                } catch (Throwable th) {
                    MethodCollector.o(3010);
                    throw th;
                }
            }
            promoteAndExecute();
            MethodCollector.o(3010);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("max < 1: ".concat(String.valueOf(i2)));
        MethodCollector.o(3010);
        throw illegalArgumentException;
    }

    private <T> void finished(Deque<T> deque, T t) {
        Runnable runnable;
        MethodCollector.i(3623);
        synchronized (this) {
            try {
                if (deque.remove(t)) {
                    runnable = this.idleCallback;
                } else {
                    AssertionError assertionError = new AssertionError("Call wasn't in-flight!");
                    MethodCollector.o(3623);
                    throw assertionError;
                }
            } finally {
                MethodCollector.o(3623);
            }
        }
        if (!promoteAndExecute() && runnable != null) {
            runnable.run();
        }
    }
}
