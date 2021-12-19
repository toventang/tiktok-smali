package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.w;
import java.io.IOException;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final f f158893a = new f();

    /* renamed from: b  reason: collision with root package name */
    public boolean f158894b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f158895c;

    /* renamed from: d  reason: collision with root package name */
    public final y f158896d;

    /* renamed from: e  reason: collision with root package name */
    public final aa f158897e;

    /* renamed from: f  reason: collision with root package name */
    public final long f158898f = 8192;

    static {
        Covode.recordClassIndex(105442);
    }

    public static final class a implements y {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f158899a;

        /* renamed from: b  reason: collision with root package name */
        private final ab f158900b = new ab();

        static {
            Covode.recordClassIndex(105443);
        }

        @Override // k.y
        public final ab timeout() {
            return this.f158900b;
        }

        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            MethodCollector.i(4637);
            synchronized (this.f158899a.f158893a) {
                try {
                    if (!this.f158899a.f158894b) {
                        if (!this.f158899a.f158895c || this.f158899a.f158893a.f158864b <= 0) {
                            this.f158899a.f158894b = true;
                            f fVar = this.f158899a.f158893a;
                            if (fVar != null) {
                                fVar.notifyAll();
                                MethodCollector.o(4637);
                                return;
                            }
                            w wVar = new w("null cannot be cast to non-null type");
                            MethodCollector.o(4637);
                            throw wVar;
                        }
                        IOException iOException = new IOException("source is closed");
                        MethodCollector.o(4637);
                        throw iOException;
                    }
                } finally {
                    MethodCollector.o(4637);
                }
            }
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            MethodCollector.i(4626);
            synchronized (this.f158899a.f158893a) {
                try {
                    if (!(!this.f158899a.f158894b)) {
                        IllegalStateException illegalStateException = new IllegalStateException("closed".toString());
                        MethodCollector.o(4626);
                        throw illegalStateException;
                    } else if (this.f158899a.f158895c) {
                        if (this.f158899a.f158893a.f158864b > 0) {
                            IOException iOException = new IOException("source is closed");
                            MethodCollector.o(4626);
                            throw iOException;
                        }
                    }
                } finally {
                    MethodCollector.o(4626);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(s sVar) {
            this.f158899a = sVar;
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            MethodCollector.i(4139);
            l.c(fVar, "");
            synchronized (this.f158899a.f158893a) {
                try {
                    if (!this.f158899a.f158894b) {
                        while (j2 > 0) {
                            if (!this.f158899a.f158895c) {
                                long j3 = this.f158899a.f158898f - this.f158899a.f158893a.f158864b;
                                if (j3 == 0) {
                                    this.f158900b.waitUntilNotified(this.f158899a.f158893a);
                                } else {
                                    long min = Math.min(j3, j2);
                                    this.f158899a.f158893a.write(fVar, min);
                                    j2 -= min;
                                    f fVar2 = this.f158899a.f158893a;
                                    if (fVar2 != null) {
                                        fVar2.notifyAll();
                                    } else {
                                        w wVar = new w("null cannot be cast to non-null type");
                                        MethodCollector.o(4139);
                                        throw wVar;
                                    }
                                }
                            } else {
                                IOException iOException = new IOException("source is closed");
                                MethodCollector.o(4139);
                                throw iOException;
                            }
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("closed".toString());
                        MethodCollector.o(4139);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.o(4139);
                }
            }
        }
    }

    public static final class b implements aa {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s f158901a;

        /* renamed from: b  reason: collision with root package name */
        private final ab f158902b = new ab();

        static {
            Covode.recordClassIndex(105444);
        }

        @Override // k.aa
        public final ab timeout() {
            return this.f158902b;
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            MethodCollector.i(2652);
            synchronized (this.f158901a.f158893a) {
                try {
                    this.f158901a.f158895c = true;
                    f fVar = this.f158901a.f158893a;
                    if (fVar != null) {
                        fVar.notifyAll();
                    } else {
                        w wVar = new w("null cannot be cast to non-null type");
                        MethodCollector.o(2652);
                        throw wVar;
                    }
                } finally {
                    MethodCollector.o(2652);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(s sVar) {
            this.f158901a = sVar;
        }

        @Override // k.aa
        public final long read(f fVar, long j2) {
            MethodCollector.i(2650);
            l.c(fVar, "");
            synchronized (this.f158901a.f158893a) {
                try {
                    if (!this.f158901a.f158895c) {
                        while (this.f158901a.f158893a.f158864b == 0) {
                            if (this.f158901a.f158894b) {
                                MethodCollector.o(2650);
                                return -1;
                            }
                            this.f158902b.waitUntilNotified(this.f158901a.f158893a);
                        }
                        long read = this.f158901a.f158893a.read(fVar, j2);
                        f fVar2 = this.f158901a.f158893a;
                        if (fVar2 != null) {
                            fVar2.notifyAll();
                            return read;
                        }
                        w wVar = new w("null cannot be cast to non-null type");
                        MethodCollector.o(2650);
                        throw wVar;
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("closed".toString());
                    MethodCollector.o(2650);
                    throw illegalStateException;
                } finally {
                    MethodCollector.o(2650);
                }
            }
        }
    }

    public s() {
        int i2 = (8192 > 1 ? 1 : (8192 == 1 ? 0 : -1));
        this.f158896d = new a(this);
        this.f158897e = new b(this);
    }
}
