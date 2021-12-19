package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class f implements Executor {

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ boolean f155880c = true;

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicBoolean f155881h = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public boolean f155882a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f155883b;

    /* renamed from: d  reason: collision with root package name */
    private final BlockingQueue<Runnable> f155884d = new LinkedBlockingQueue();

    /* renamed from: e  reason: collision with root package name */
    private InterruptedIOException f155885e;

    /* renamed from: f  reason: collision with root package name */
    private RuntimeException f155886f;

    /* renamed from: g  reason: collision with root package name */
    private long f155887g = -1;

    static {
        Covode.recordClassIndex(103567);
    }

    public final void a() {
        if (f155880c || c()) {
            this.f155883b = false;
            return;
        }
        throw new AssertionError();
    }

    public final void b() {
        if (f155880c || c()) {
            this.f155882a = false;
            return;
        }
        throw new AssertionError();
    }

    private boolean c() {
        if (f155881h.get()) {
            return true;
        }
        long j2 = this.f155887g;
        if (j2 == -1) {
            this.f155887g = Thread.currentThread().getId();
            return true;
        } else if (j2 == Thread.currentThread().getId()) {
            return true;
        } else {
            return false;
        }
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                this.f155884d.put(runnable);
            } catch (InterruptedException e2) {
                throw new RejectedExecutionException(e2);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void a(int i2) {
        if (f155880c || c()) {
            long nanoTime = System.nanoTime();
            long convert = TimeUnit.NANOSECONDS.convert((long) i2, TimeUnit.MILLISECONDS);
            if (this.f155883b) {
                InterruptedIOException interruptedIOException = this.f155885e;
                if (interruptedIOException != null) {
                    throw interruptedIOException;
                }
                throw this.f155886f;
            } else if (!this.f155882a) {
                this.f155882a = true;
                while (this.f155882a) {
                    if (i2 == 0) {
                        try {
                            a(false, 0).run();
                        } catch (SocketTimeoutException e2) {
                            this.f155882a = false;
                            this.f155883b = true;
                            throw e2;
                        } catch (InterruptedIOException e3) {
                            this.f155882a = false;
                            this.f155883b = true;
                            this.f155885e = e3;
                            throw e3;
                        } catch (RuntimeException e4) {
                            this.f155882a = false;
                            this.f155883b = true;
                            this.f155886f = e4;
                            throw e4;
                        }
                    } else {
                        a(true, (convert - System.nanoTime()) + nanoTime).run();
                    }
                }
            } else {
                throw new IllegalStateException("Cannot run loop when it is already running.");
            }
        } else {
            throw new AssertionError();
        }
    }

    private Runnable a(boolean z, long j2) {
        Runnable runnable;
        if (!z) {
            try {
                runnable = this.f155884d.take();
            } catch (InterruptedException e2) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e2);
                throw interruptedIOException;
            }
        } else {
            runnable = this.f155884d.poll(j2, TimeUnit.NANOSECONDS);
        }
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }
}
