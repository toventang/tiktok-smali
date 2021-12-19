package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class d extends ab {
    public static final a Companion = new a((byte) 0);
    public static final long IDLE_TIMEOUT_MILLIS;
    public static final long IDLE_TIMEOUT_NANOS;
    public static d head;
    private boolean inQueue;
    public d next;
    public long timeoutAt;

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105419);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(d dVar) {
            MethodCollector.i(4653);
            synchronized (d.class) {
                try {
                    for (d dVar2 = d.head; dVar2 != null; dVar2 = dVar2.next) {
                        if (dVar2.next == dVar) {
                            dVar2.next = dVar.next;
                            dVar.next = null;
                            MethodCollector.o(4653);
                            return false;
                        }
                    }
                    MethodCollector.o(4653);
                    return true;
                } catch (Throwable th) {
                    MethodCollector.o(4653);
                    throw th;
                }
            }
        }

        public static void a(d dVar, long j2, boolean z) {
            MethodCollector.i(4644);
            synchronized (d.class) {
                try {
                    if (d.head == null) {
                        d.head = new d();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j2 != 0 && z) {
                        dVar.timeoutAt = Math.min(j2, dVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (j2 != 0) {
                        dVar.timeoutAt = j2 + nanoTime;
                    } else if (z) {
                        dVar.timeoutAt = dVar.deadlineNanoTime();
                    } else {
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.o(4644);
                        throw assertionError;
                    }
                    long remainingNanos = dVar.remainingNanos(nanoTime);
                    d dVar2 = d.head;
                    if (dVar2 == null) {
                        l.a();
                    }
                    while (dVar2.next != null) {
                        d dVar3 = dVar2.next;
                        if (dVar3 == null) {
                            l.a();
                        }
                        if (remainingNanos < dVar3.remainingNanos(nanoTime)) {
                            break;
                        }
                        dVar2 = dVar2.next;
                        if (dVar2 == null) {
                            l.a();
                        }
                    }
                    dVar.next = dVar2.next;
                    dVar2.next = dVar;
                    if (dVar2 == d.head) {
                        d.class.notify();
                    }
                } finally {
                    MethodCollector.o(4644);
                }
            }
        }
    }

    public static final class c implements y {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f158857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f158858b;

        static {
            Covode.recordClassIndex(105421);
        }

        @Override // k.y
        public final /* bridge */ /* synthetic */ ab timeout() {
            return this.f158857a;
        }

        public final String toString() {
            return "AsyncTimeout.sink(" + this.f158858b + ')';
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f158857a.enter();
            try {
                this.f158858b.close();
                this.f158857a.exit$jvm(true);
            } catch (IOException e2) {
                throw this.f158857a.exit$jvm(e2);
            } catch (Throwable th) {
                this.f158857a.exit$jvm(false);
                throw th;
            }
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            this.f158857a.enter();
            try {
                this.f158858b.flush();
                this.f158857a.exit$jvm(true);
            } catch (IOException e2) {
                throw this.f158857a.exit$jvm(e2);
            } catch (Throwable th) {
                this.f158857a.exit$jvm(false);
                throw th;
            }
        }

        c(d dVar, y yVar) {
            this.f158857a = dVar;
            this.f158858b = yVar;
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            long j3 = j2;
            l.c(fVar, "");
            c.a(fVar.f158864b, 0, j3);
            while (true) {
                long j4 = 0;
                if (j3 > 0) {
                    v vVar = fVar.f158863a;
                    if (vVar == null) {
                        l.a();
                    }
                    while (true) {
                        j4 += (long) (vVar.f158914c - vVar.f158913b);
                        if (j4 < j3) {
                            vVar = vVar.f158917f;
                            if (vVar == null) {
                                l.a();
                            }
                            if (j4 >= 65536) {
                                break;
                            }
                        } else {
                            j4 = j3;
                            break;
                        }
                    }
                    this.f158857a.enter();
                    try {
                        this.f158858b.write(fVar, j4);
                        j3 -= j4;
                        this.f158857a.exit$jvm(true);
                    } catch (IOException e2) {
                        throw this.f158857a.exit$jvm(e2);
                    } catch (Throwable th) {
                        this.f158857a.exit$jvm(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: k.d$d  reason: collision with other inner class name */
    public static final class C4189d implements aa {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f158859a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ aa f158860b;

        static {
            Covode.recordClassIndex(105422);
        }

        @Override // k.aa
        public final /* bridge */ /* synthetic */ ab timeout() {
            return this.f158859a;
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f158860b.close();
                this.f158859a.exit$jvm(true);
            } catch (IOException e2) {
                throw this.f158859a.exit$jvm(e2);
            } catch (Throwable th) {
                this.f158859a.exit$jvm(false);
                throw th;
            }
        }

        public final String toString() {
            return "AsyncTimeout.source(" + this.f158860b + ')';
        }

        C4189d(d dVar, aa aaVar) {
            this.f158859a = dVar;
            this.f158860b = aaVar;
        }

        @Override // k.aa
        public final long read(f fVar, long j2) {
            l.c(fVar, "");
            this.f158859a.enter();
            try {
                long read = this.f158860b.read(fVar, j2);
                this.f158859a.exit$jvm(true);
                return read;
            } catch (IOException e2) {
                throw this.f158859a.exit$jvm(e2);
            } catch (Throwable th) {
                this.f158859a.exit$jvm(false);
                throw th;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends Thread {
        static {
            Covode.recordClassIndex(105420);
        }

        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
            if (r3 == null) goto L_0x0005;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0074, code lost:
            r3.timedOut();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: k.d.b.run():void");
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return a.a(this);
    }

    static {
        Covode.recordClassIndex(105418);
        long millis = TimeUnit.SECONDS.toMillis(60);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                a.a(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final long remainingNanos(long j2) {
        return this.timeoutAt - j2;
    }

    public final void exit$jvm(boolean z) {
        if (exit() && z) {
            throw newTimeoutException(null);
        }
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final y sink(y yVar) {
        l.c(yVar, "");
        return new c(this, yVar);
    }

    public final aa source(aa aaVar) {
        l.c(aaVar, "");
        return new C4189d(this, aaVar);
    }

    public final IOException exit$jvm(IOException iOException) {
        l.c(iOException, "");
        if (!exit()) {
            return iOException;
        }
        return newTimeoutException(iOException);
    }
}
