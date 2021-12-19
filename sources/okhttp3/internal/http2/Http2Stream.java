package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import k.aa;
import k.ab;
import k.d;
import k.f;
import k.h;
import k.y;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;

public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    ErrorCode errorCode = null;
    private boolean hasResponseHeaders;
    public Header.Listener headersListener;
    public final Deque<Headers> headersQueue;
    final int id;
    final StreamTimeout readTimeout = new StreamTimeout();
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead;
    final StreamTimeout writeTimeout = new StreamTimeout();

    static {
        Covode.recordClassIndex(106278);
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final int getId() {
        return this.id;
    }

    public final aa getSource() {
        return this.source;
    }

    public final ab readTimeout() {
        return this.readTimeout;
    }

    public final ab writeTimeout() {
        return this.writeTimeout;
    }

    /* access modifiers changed from: package-private */
    public final class FramingSink implements y {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final f sendBuffer = new f();

        @Override // k.y
        public final ab timeout() {
            return Http2Stream.this.writeTimeout;
        }

        static {
            Covode.recordClassIndex(106279);
        }

        @Override // k.y, java.io.Flushable
        public final void flush() {
            MethodCollector.i(961);
            synchronized (Http2Stream.this) {
                try {
                    Http2Stream.this.checkOutNotClosed();
                } finally {
                    MethodCollector.o(961);
                }
            }
            while (this.sendBuffer.f158864b > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            if (r13.this$0.sink.finished != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            if (r13.sendBuffer.f158864b <= 0) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
            if (r13.sendBuffer.f158864b <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
            r13.this$0.connection.writeData(r13.this$0.id, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
            r1 = r13.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r13.closed = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
            r13.this$0.connection.flush();
            r13.this$0.cancelStreamIfNecessary();
            com.bytedance.frameworks.apm.trace.MethodCollector.o(968);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(968);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005b, code lost:
            throw r0;
         */
        @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void close() {
            /*
                r13 = this;
                r6 = 968(0x3c8, float:1.356E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r1)
                boolean r0 = r13.closed     // Catch:{ all -> 0x005c }
                if (r0 == 0) goto L_0x0011
                monitor-exit(r1)     // Catch:{ all -> 0x005c }
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
                return
            L_0x0011:
                monitor-exit(r1)
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.sink
                boolean r0 = r0.finished
                r3 = 1
                if (r0 != 0) goto L_0x0040
                k.f r0 = r13.sendBuffer
                long r1 = r0.f158864b
                r4 = 0
                int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0031
            L_0x0025:
                k.f r0 = r13.sendBuffer
                long r1 = r0.f158864b
                int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
                r13.emitFrame(r3)
                goto L_0x0025
            L_0x0031:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r7 = r0.connection
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                int r8 = r0.id
                r9 = 1
                r10 = 0
                r11 = 0
                r7.writeData(r8, r9, r10, r11)
            L_0x0040:
                okhttp3.internal.http2.Http2Stream r1 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r1)
                r13.closed = r3     // Catch:{ all -> 0x0056 }
                monitor-exit(r1)     // Catch:{ all -> 0x0056 }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary()
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
                return
            L_0x0056:
                r0 = move-exception
                monitor-exit(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
                throw r0
            L_0x005c:
                r0 = move-exception
                monitor-exit(r1)
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        FramingSink() {
        }

        private void emitFrame(boolean z) {
            long min;
            boolean z2;
            MethodCollector.i(959);
            synchronized (Http2Stream.this) {
                try {
                    Http2Stream.this.writeTimeout.enter();
                    while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                        try {
                            Http2Stream.this.waitForIo();
                        } finally {
                            Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                            MethodCollector.o(959);
                        }
                    }
                    Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                    Http2Stream.this.checkOutNotClosed();
                    min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.f158864b);
                    Http2Stream.this.bytesLeftInWriteWindow -= min;
                } catch (Throwable th) {
                    MethodCollector.o(959);
                    throw th;
                }
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Connection http2Connection = Http2Stream.this.connection;
                int i2 = Http2Stream.this.id;
                if (!z || min != this.sendBuffer.f158864b) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                http2Connection.writeData(i2, z2, this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                MethodCollector.o(959);
            }
        }

        @Override // k.y
        public final void write(f fVar, long j2) {
            this.sendBuffer.write(fVar, j2);
            while (this.sendBuffer.f158864b >= 16384) {
                emitFrame(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final class FramingSource implements aa {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final f readBuffer = new f();
        private final f receiveBuffer = new f();

        @Override // k.aa
        public final ab timeout() {
            return Http2Stream.this.readTimeout;
        }

        static {
            Covode.recordClassIndex(106280);
        }

        @Override // k.aa, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j2;
            Header.Listener listener;
            ArrayList<Headers> arrayList;
            MethodCollector.i(4607);
            synchronized (Http2Stream.this) {
                try {
                    this.closed = true;
                    j2 = this.readBuffer.f158864b;
                    this.readBuffer.v();
                    listener = null;
                    if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(Http2Stream.this.headersQueue);
                        Http2Stream.this.headersQueue.clear();
                        listener = Http2Stream.this.headersListener;
                    }
                    Http2Stream.this.notifyAll();
                } finally {
                    MethodCollector.o(4607);
                }
            }
            if (j2 > 0) {
                updateConnectionFlowControl(j2);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                for (Headers headers : arrayList) {
                    listener.onHeaders(headers);
                }
            }
        }

        private void updateConnectionFlowControl(long j2) {
            Http2Stream.this.connection.updateConnectionFlowControl(j2);
        }

        FramingSource(long j2) {
            this.maxByteCount = j2;
        }

        /* access modifiers changed from: package-private */
        public final void receive(h hVar, long j2) {
            boolean z;
            boolean z2;
            boolean z3;
            long j3;
            MethodCollector.i(4526);
            while (j2 > 0) {
                synchronized (Http2Stream.this) {
                    try {
                        z = this.finished;
                        z2 = true;
                        if (this.readBuffer.f158864b + j2 > this.maxByteCount) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } finally {
                        MethodCollector.o(4526);
                    }
                }
                if (z3) {
                    hVar.l(j2);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    MethodCollector.o(4526);
                    return;
                } else if (z) {
                    hVar.l(j2);
                    MethodCollector.o(4526);
                    return;
                } else {
                    long read = hVar.read(this.receiveBuffer, j2);
                    if (read != -1) {
                        j2 -= read;
                        synchronized (Http2Stream.this) {
                            try {
                                if (this.closed) {
                                    j3 = this.receiveBuffer.f158864b;
                                    this.receiveBuffer.v();
                                } else {
                                    if (this.readBuffer.f158864b != 0) {
                                        z2 = false;
                                    }
                                    this.readBuffer.a((aa) this.receiveBuffer);
                                    if (z2) {
                                        Http2Stream.this.notifyAll();
                                    }
                                    j3 = 0;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (j3 > 0) {
                            updateConnectionFlowControl(j3);
                        }
                    } else {
                        EOFException eOFException = new EOFException();
                        MethodCollector.o(4526);
                        throw eOFException;
                    }
                }
            }
            MethodCollector.o(4526);
        }

        @Override // k.aa
        public final long read(f fVar, long j2) {
            ErrorCode errorCode;
            long j3;
            Header.Listener listener;
            MethodCollector.i(4403);
            long j4 = 0;
            if (j2 >= 0) {
                while (true) {
                    synchronized (Http2Stream.this) {
                        try {
                            Http2Stream.this.readTimeout.enter();
                            try {
                                Headers headers = null;
                                if (Http2Stream.this.errorCode != null) {
                                    errorCode = Http2Stream.this.errorCode;
                                } else {
                                    errorCode = null;
                                }
                                if (!this.closed) {
                                    if (!Http2Stream.this.headersQueue.isEmpty() && Http2Stream.this.headersListener != null) {
                                        headers = Http2Stream.this.headersQueue.removeFirst();
                                        listener = Http2Stream.this.headersListener;
                                    } else if (this.readBuffer.f158864b > j4) {
                                        f fVar2 = this.readBuffer;
                                        j3 = fVar2.read(fVar, Math.min(j2, fVar2.f158864b));
                                        Http2Stream.this.unacknowledgedBytesRead += j3;
                                        if (errorCode == null) {
                                            if (Http2Stream.this.unacknowledgedBytesRead >= ((long) (Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2))) {
                                                Http2Stream.this.connection.writeWindowUpdateLater(Http2Stream.this.id, Http2Stream.this.unacknowledgedBytesRead);
                                                j4 = 0;
                                                Http2Stream.this.unacknowledgedBytesRead = 0;
                                            } else {
                                                j4 = 0;
                                            }
                                        }
                                        listener = null;
                                        Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                        if (headers != null && listener != null) {
                                            listener.onHeaders(headers);
                                        }
                                    } else if (this.finished || errorCode != null) {
                                        listener = null;
                                    } else {
                                        Http2Stream.this.waitForIo();
                                        Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                    }
                                    j3 = -1;
                                    Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                    if (headers != null) {
                                        break;
                                    }
                                    break;
                                }
                                IOException iOException = new IOException("stream closed");
                                MethodCollector.o(4403);
                                throw iOException;
                            } catch (Throwable th) {
                                Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                MethodCollector.o(4403);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            MethodCollector.o(4403);
                            throw th2;
                        }
                    }
                }
                if (j3 != -1) {
                    updateConnectionFlowControl(j3);
                    MethodCollector.o(4403);
                    return j3;
                } else if (errorCode == null) {
                    MethodCollector.o(4403);
                    return -1;
                } else {
                    StreamResetException streamResetException = new StreamResetException(errorCode);
                    MethodCollector.o(4403);
                    throw streamResetException;
                }
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
                MethodCollector.o(4403);
                throw illegalArgumentException;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class StreamTimeout extends d {
        static {
            Covode.recordClassIndex(106281);
        }

        public void exitAndThrowIfTimedOut() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // k.d
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.connection.sendDegradedPingLater();
        }

        StreamTimeout() {
        }

        @Override // k.d
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public final synchronized ErrorCode getErrorCode() {
        ErrorCode errorCode2;
        MethodCollector.i(4807);
        errorCode2 = this.errorCode;
        MethodCollector.o(4807);
        return errorCode2;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.client == z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void waitForIo() {
        MethodCollector.i(5156);
        try {
            wait();
            MethodCollector.o(5156);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            MethodCollector.o(5156);
            throw interruptedIOException;
        }
    }

    /* access modifiers changed from: package-private */
    public final void checkOutNotClosed() {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        } else if (this.sink.finished) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }

    public final y getSink() {
        MethodCollector.i(4884);
        synchronized (this) {
            try {
                if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                    IllegalStateException illegalStateException = new IllegalStateException("reply before requesting the sink");
                    MethodCollector.o(4884);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.o(4884);
                throw th;
            }
        }
        FramingSink framingSink = this.sink;
        MethodCollector.o(4884);
        return framingSink;
    }

    public final synchronized boolean isOpen() {
        MethodCollector.i(4793);
        if (this.errorCode != null) {
            MethodCollector.o(4793);
            return false;
        } else if ((this.source.finished || this.source.closed) && ((this.sink.finished || this.sink.closed) && this.hasResponseHeaders)) {
            MethodCollector.o(4793);
            return false;
        } else {
            MethodCollector.o(4793);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void receiveFin() {
        boolean isOpen;
        MethodCollector.i(5065);
        synchronized (this) {
            try {
                this.source.finished = true;
                isOpen = isOpen();
                notifyAll();
            } finally {
                MethodCollector.o(5065);
            }
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    /* access modifiers changed from: package-private */
    public final void cancelStreamIfNecessary() {
        boolean z;
        boolean isOpen;
        MethodCollector.i(5149);
        synchronized (this) {
            try {
                if (this.source.finished || !this.source.closed || (!this.sink.finished && !this.sink.closed)) {
                    z = false;
                } else {
                    z = true;
                }
                isOpen = isOpen();
            } finally {
                MethodCollector.o(5149);
            }
        }
        if (z) {
            close(ErrorCode.CANCEL);
            MethodCollector.o(5149);
            return;
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    public final synchronized Headers takeHeaders() {
        Headers removeFirst;
        MethodCollector.i(4799);
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                MethodCollector.o(4799);
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            removeFirst = this.headersQueue.removeFirst();
            MethodCollector.o(4799);
        } else {
            StreamResetException streamResetException = new StreamResetException(this.errorCode);
            MethodCollector.o(4799);
            throw streamResetException;
        }
        return removeFirst;
    }

    /* access modifiers changed from: package-private */
    public final void addBytesToWriteWindow(long j2) {
        this.bytesLeftInWriteWindow += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void close(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynReset(this.id, errorCode2);
        }
    }

    public final void closeLater(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynResetLater(this.id, errorCode2);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void receiveRstStream(ErrorCode errorCode2) {
        MethodCollector.i(5067);
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
        MethodCollector.o(5067);
    }

    public final synchronized void setHeadersListener(Header.Listener listener) {
        MethodCollector.i(5143);
        this.headersListener = listener;
        if (!this.headersQueue.isEmpty() && listener != null) {
            notifyAll();
        }
        MethodCollector.o(5143);
    }

    private boolean closeInternal(ErrorCode errorCode2) {
        MethodCollector.i(4987);
        synchronized (this) {
            try {
                if (this.errorCode != null) {
                    return false;
                }
                if (!this.source.finished || !this.sink.finished) {
                    this.errorCode = errorCode2;
                    notifyAll();
                    this.connection.removeStream(this.id);
                    MethodCollector.o(4987);
                    return true;
                }
                MethodCollector.o(4987);
                return false;
            } finally {
                MethodCollector.o(4987);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void receiveHeaders(List<Header> list) {
        boolean isOpen;
        MethodCollector.i(4994);
        synchronized (this) {
            try {
                this.hasResponseHeaders = true;
                this.headersQueue.add(Util.toHeaders(list));
                isOpen = isOpen();
                notifyAll();
            } finally {
                MethodCollector.o(4994);
            }
        }
        if (!isOpen) {
            this.connection.removeStream(this.id);
        }
    }

    /* access modifiers changed from: package-private */
    public final void receiveData(h hVar, int i2) {
        this.source.receive(hVar, (long) i2);
    }

    public final void writeHeaders(List<Header> list, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        MethodCollector.i(4811);
        if (list != null) {
            synchronized (this) {
                z2 = true;
                try {
                    this.hasResponseHeaders = true;
                    if (!z) {
                        this.sink.finished = true;
                        z4 = true;
                        z3 = true;
                    } else {
                        z4 = false;
                        z3 = false;
                    }
                } finally {
                    MethodCollector.o(4811);
                }
            }
            if (!z4) {
                synchronized (this.connection) {
                    try {
                        if (this.connection.bytesLeftInWriteWindow != 0) {
                            z2 = false;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(4811);
                        throw th;
                    }
                }
                z4 = z2;
            }
            this.connection.writeSynReply(this.id, z3, list);
            if (z4) {
                this.connection.flush();
            }
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("headers == null");
        MethodCollector.o(4811);
        throw nullPointerException;
    }

    Http2Stream(int i2, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.headersQueue = arrayDeque;
        Objects.requireNonNull(http2Connection, "connection == null");
        this.id = i2;
        this.connection = http2Connection;
        this.bytesLeftInWriteWindow = (long) http2Connection.peerSettings.getInitialWindowSize();
        FramingSource framingSource = new FramingSource((long) http2Connection.okHttpSettings.getInitialWindowSize());
        this.source = framingSource;
        FramingSink framingSink = new FramingSink();
        this.sink = framingSink;
        framingSource.finished = z2;
        framingSink.finished = z;
        if (headers != null) {
            arrayDeque.add(headers);
        }
        if (isLocallyInitiated() && headers != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        } else if (!isLocallyInitiated() && headers == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }
}
