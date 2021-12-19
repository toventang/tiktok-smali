package okhttp3.internal.http2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.f;
import k.g;
import k.h;
import k.i;
import k.q;
import okhttp3.Protocol;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;

public final class Http2Connection implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ExecutorService listenerExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    private long awaitPingsSent = 0;
    public long awaitPongsReceived = 0;
    long bytesLeftInWriteWindow;
    final boolean client;
    final Set<Integer> currentPushRequests;
    private long degradedPingsSent = 0;
    private long degradedPongDeadlineNs = 0;
    public long degradedPongsReceived = 0;
    final String hostname;
    public long intervalPingsSent = 0;
    public long intervalPongsReceived = 0;
    int lastGoodStreamId;
    final Listener listener;
    int nextStreamId;
    Settings okHttpSettings = new Settings();
    final Settings peerSettings;
    private final ExecutorService pushExecutor;
    final PushObserver pushObserver;
    final ReaderRunnable readerRunnable;
    public boolean shutdown;
    final Socket socket;
    final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    long unacknowledgedBytesRead = 0;
    final Http2Writer writer;
    public final ScheduledExecutorService writerExecutor;

    /* access modifiers changed from: package-private */
    public final boolean pushedStream(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public final Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public static class Builder {
        boolean client;
        String hostname;
        Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        int pingIntervalMillis;
        PushObserver pushObserver = PushObserver.CANCEL;
        g sink;
        Socket socket;
        h source;

        static {
            Covode.recordClassIndex(106266);
        }

        public Http2Connection build() {
            return new Http2Connection(this);
        }

        public Builder listener(Listener listener2) {
            this.listener = listener2;
            return this;
        }

        public Builder pingIntervalMillis(int i2) {
            this.pingIntervalMillis = i2;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver2) {
            this.pushObserver = pushObserver2;
            return this;
        }

        public Builder(boolean z) {
            this.client = z;
        }

        public Builder socket(Socket socket2) {
            return socket(socket2, ((InetSocketAddress) socket2.getRemoteSocketAddress()).getHostName(), q.a(q.b(socket2)), q.a(q.a(socket2)));
        }

        public Builder socket(Socket socket2, String str, h hVar, g gVar) {
            this.socket = socket2;
            this.hostname = str;
            this.source = hVar;
            this.sink = gVar;
            return this;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public final void failConnection() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            close(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    public final void flush() {
        this.writer.flush();
    }

    public final void start() {
        start(true);
    }

    /* access modifiers changed from: package-private */
    public final void writePingAndAwaitPong() {
        writePing();
        awaitPong();
    }

    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() {
            /* class okhttp3.internal.http2.Http2Connection.Listener.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106269);
            }

            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public final void onStream(Http2Stream http2Stream) {
                http2Stream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream);

        static {
            Covode.recordClassIndex(106268);
        }
    }

    final class PingRunnable extends NamedRunnable {
        final int payload1;
        final int payload2;
        final boolean reply;

        static {
            Covode.recordClassIndex(106270);
        }

        @Override // okhttp3.internal.NamedRunnable
        public final void execute() {
            Http2Connection.this.writePing(this.reply, this.payload1, this.payload2);
        }

        PingRunnable(boolean z, int i2, int i3) {
            super("OkHttp %s ping %08x%08x", Http2Connection.this.hostname, Integer.valueOf(i2), Integer.valueOf(i3));
            this.reply = z;
            this.payload1 = i2;
            this.payload2 = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void awaitPong() {
        MethodCollector.i(2785);
        while (this.awaitPongsReceived < this.awaitPingsSent) {
            wait();
        }
        MethodCollector.o(2785);
    }

    public final synchronized int maxConcurrentStreams() {
        int maxConcurrentStreams;
        MethodCollector.i(492);
        maxConcurrentStreams = this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
        MethodCollector.o(492);
        return maxConcurrentStreams;
    }

    public final synchronized int openStreamCount() {
        int size;
        MethodCollector.i(487);
        size = this.streams.size();
        MethodCollector.o(487);
        return size;
    }

    /* access modifiers changed from: package-private */
    public final void writePing() {
        MethodCollector.i(2784);
        synchronized (this) {
            try {
                this.awaitPingsSent++;
            } catch (Throwable th) {
                MethodCollector.o(2784);
                throw th;
            }
        }
        writePing(false, 3, 1330343787);
        MethodCollector.o(2784);
    }

    final class IntervalPingRunnable extends NamedRunnable {
        static {
            Covode.recordClassIndex(106267);
        }

        @Override // okhttp3.internal.NamedRunnable
        public final void execute() {
            boolean z;
            MethodCollector.i(6459);
            synchronized (Http2Connection.this) {
                try {
                    if (Http2Connection.this.intervalPongsReceived < Http2Connection.this.intervalPingsSent) {
                        z = true;
                    } else {
                        Http2Connection.this.intervalPingsSent++;
                        z = false;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6459);
                    throw th;
                }
            }
            if (z) {
                Http2Connection.this.failConnection();
                MethodCollector.o(6459);
                return;
            }
            Http2Connection.this.writePing(false, 1, 0);
            MethodCollector.o(6459);
        }

        IntervalPingRunnable() {
            super("OkHttp %s ping", Http2Connection.this.hostname);
        }
    }

    /* access modifiers changed from: package-private */
    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {
        final Http2Reader reader;

        static {
            Covode.recordClassIndex(106271);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i2, String str, i iVar, String str2, int i3, long j2) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i2, int i3, int i4, boolean z) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
            r0 = r4.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r4.this$0.close(r3, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            okhttp3.internal.Util.closeQuietly(r4.reader);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r3 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0019 */
        @Override // okhttp3.internal.NamedRunnable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void execute() {
            /*
                r4 = this;
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.Http2Reader r0 = r4.reader     // Catch:{ IOException -> 0x0019 }
                r0.readConnectionPreface(r4)     // Catch:{ IOException -> 0x0019 }
            L_0x0009:
                okhttp3.internal.http2.Http2Reader r1 = r4.reader     // Catch:{ IOException -> 0x0019 }
                r0 = 0
                boolean r0 = r1.nextFrame(r0, r4)     // Catch:{ IOException -> 0x0019 }
                if (r0 != 0) goto L_0x0009
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0019 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0019 }
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ IOException -> 0x0022 }
                goto L_0x001f
            L_0x0019:
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0028 }
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x0028 }
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
            L_0x001f:
                r0.close(r3, r1)
            L_0x0022:
                okhttp3.internal.http2.Http2Reader r0 = r4.reader
                okhttp3.internal.Util.closeQuietly(r0)
                return
            L_0x0028:
                r1 = move-exception
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ IOException -> 0x002e }
                r0.close(r3, r2)     // Catch:{ IOException -> 0x002e }
            L_0x002e:
                okhttp3.internal.http2.Http2Reader r0 = r4.reader
                okhttp3.internal.Util.closeQuietly(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.execute():void");
        }

        ReaderRunnable(Http2Reader http2Reader) {
            super("OkHttp %s", Http2Connection.this.hostname);
            this.reader = http2Reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i2, ErrorCode errorCode) {
            if (Http2Connection.this.pushedStream(i2)) {
                Http2Connection.this.pushResetLater(i2, errorCode);
                return;
            }
            Http2Stream removeStream = Http2Connection.this.removeStream(i2);
            if (removeStream != null) {
                removeStream.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(final boolean z, final Settings settings) {
            try {
                Http2Connection.this.writerExecutor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{Http2Connection.this.hostname}) {
                    /* class okhttp3.internal.http2.Http2Connection.ReaderRunnable.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(106273);
                    }

                    @Override // okhttp3.internal.NamedRunnable
                    public void execute() {
                        ReaderRunnable.this.applyAndAckSettings(z, settings);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i2, long j2) {
            MethodCollector.i(287);
            if (i2 == 0) {
                synchronized (Http2Connection.this) {
                    try {
                        Http2Connection.this.bytesLeftInWriteWindow += j2;
                        Http2Connection.this.notifyAll();
                    } finally {
                        MethodCollector.o(287);
                    }
                }
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i2);
            if (stream != null) {
                synchronized (stream) {
                    try {
                        stream.addBytesToWriteWindow(j2);
                    } finally {
                        MethodCollector.o(287);
                    }
                }
                return;
            }
            MethodCollector.o(287);
        }

        /* access modifiers changed from: package-private */
        public void applyAndAckSettings(boolean z, Settings settings) {
            Http2Stream[] http2StreamArr;
            long j2;
            MethodCollector.i(154);
            synchronized (Http2Connection.this.writer) {
                try {
                    synchronized (Http2Connection.this) {
                        try {
                            int initialWindowSize = Http2Connection.this.peerSettings.getInitialWindowSize();
                            if (z) {
                                Http2Connection.this.peerSettings.clear();
                            }
                            Http2Connection.this.peerSettings.merge(settings);
                            int initialWindowSize2 = Http2Connection.this.peerSettings.getInitialWindowSize();
                            http2StreamArr = null;
                            if (initialWindowSize2 == -1 || initialWindowSize2 == initialWindowSize) {
                                j2 = 0;
                            } else {
                                j2 = (long) (initialWindowSize2 - initialWindowSize);
                                if (!Http2Connection.this.streams.isEmpty()) {
                                    http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                                }
                            }
                        } finally {
                            MethodCollector.o(154);
                        }
                    }
                    try {
                        Http2Connection.this.writer.applyAndAckSettings(Http2Connection.this.peerSettings);
                    } catch (IOException unused) {
                        Http2Connection.this.failConnection();
                    }
                } finally {
                    MethodCollector.o(154);
                }
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        try {
                            http2Stream.addBytesToWriteWindow(j2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            Http2Connection.listenerExecutor.execute(new NamedRunnable("OkHttp %s settings", Http2Connection.this.hostname) {
                /* class okhttp3.internal.http2.Http2Connection.ReaderRunnable.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(106274);
                }

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    Http2Connection.this.listener.onSettings(Http2Connection.this);
                }
            });
            MethodCollector.o(154);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i2, int i3, List<Header> list) {
            Http2Connection.this.pushRequestLater(i3, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i2, ErrorCode errorCode, i iVar) {
            Http2Stream[] http2StreamArr;
            MethodCollector.i(281);
            iVar.size();
            synchronized (Http2Connection.this) {
                try {
                    http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                    Http2Connection.this.shutdown = true;
                } finally {
                    MethodCollector.o(281);
                }
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i2 && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream(http2Stream.getId());
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, int i2, int i3) {
            MethodCollector.i(274);
            if (z) {
                synchronized (Http2Connection.this) {
                    if (i2 == 1) {
                        try {
                            Http2Connection.this.intervalPongsReceived++;
                        } catch (Throwable th) {
                            MethodCollector.o(274);
                            throw th;
                        }
                    } else if (i2 == 2) {
                        Http2Connection.this.degradedPongsReceived++;
                    } else if (i2 == 3) {
                        Http2Connection.this.awaitPongsReceived++;
                        Http2Connection.this.notifyAll();
                    }
                }
                MethodCollector.o(274);
                return;
            }
            try {
                Http2Connection.this.writerExecutor.execute(new PingRunnable(true, i2, i3));
                MethodCollector.o(274);
            } catch (RejectedExecutionException unused) {
                MethodCollector.o(274);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i2, h hVar, int i3) {
            if (Http2Connection.this.pushedStream(i2)) {
                Http2Connection.this.pushDataLater(i2, hVar, i3, z);
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i2);
            if (stream == null) {
                Http2Connection.this.writeSynResetLater(i2, ErrorCode.PROTOCOL_ERROR);
                long j2 = (long) i3;
                Http2Connection.this.updateConnectionFlowControl(j2);
                hVar.l(j2);
                return;
            }
            stream.receiveData(hVar, i3);
            if (z) {
                stream.receiveFin();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0088, code lost:
            r0.receiveHeaders(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
            if (r15 == false) goto L_0x0090;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
            r0.receiveFin();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0090, code lost:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(3820);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0093, code lost:
            return;
         */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void headers(boolean r15, int r16, int r17, java.util.List<okhttp3.internal.http2.Header> r18) {
            /*
            // Method dump skipped, instructions count: 154
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.headers(boolean, int, int, java.util.List):void");
        }
    }

    static {
        Covode.recordClassIndex(106258);
    }

    /* access modifiers changed from: package-private */
    public final void sendDegradedPingLater() {
        MethodCollector.i(3087);
        synchronized (this) {
            try {
                long j2 = this.degradedPongsReceived;
                long j3 = this.degradedPingsSent;
                if (j2 >= j3) {
                    this.degradedPingsSent = j3 + 1;
                    this.degradedPongDeadlineNs = System.nanoTime() + 1000000000;
                    try {
                        this.writerExecutor.execute(new NamedRunnable("OkHttp %s ping", this.hostname) {
                            /* class okhttp3.internal.http2.Http2Connection.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(106261);
                            }

                            @Override // okhttp3.internal.NamedRunnable
                            public void execute() {
                                Http2Connection.this.writePing(false, 2, 0);
                            }
                        });
                        MethodCollector.o(3087);
                    } catch (RejectedExecutionException unused) {
                        MethodCollector.o(3087);
                    }
                }
            } finally {
                MethodCollector.o(3087);
            }
        }
    }

    private synchronized void pushExecutorExecute(NamedRunnable namedRunnable) {
        MethodCollector.i(3420);
        if (!this.shutdown) {
            this.pushExecutor.execute(namedRunnable);
        }
        MethodCollector.o(3420);
    }

    /* access modifiers changed from: package-private */
    public final synchronized Http2Stream getStream(int i2) {
        Http2Stream http2Stream;
        MethodCollector.i(488);
        http2Stream = this.streams.get(Integer.valueOf(i2));
        MethodCollector.o(488);
        return http2Stream;
    }

    /* access modifiers changed from: package-private */
    public final synchronized Http2Stream removeStream(int i2) {
        Http2Stream remove;
        MethodCollector.i(491);
        remove = this.streams.remove(Integer.valueOf(i2));
        notifyAll();
        MethodCollector.o(491);
        return remove;
    }

    public final synchronized boolean isHealthy(long j2) {
        MethodCollector.i(3085);
        if (this.shutdown) {
            MethodCollector.o(3085);
            return false;
        } else if (this.degradedPongsReceived >= this.degradedPingsSent || j2 < this.degradedPongDeadlineNs) {
            MethodCollector.o(3085);
            return true;
        } else {
            MethodCollector.o(3085);
            return false;
        }
    }

    public final void setSettings(Settings settings) {
        MethodCollector.i(3083);
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (!this.shutdown) {
                            this.okHttpSettings.merge(settings);
                        } else {
                            ConnectionShutdownException connectionShutdownException = new ConnectionShutdownException();
                            MethodCollector.o(3083);
                            throw connectionShutdownException;
                        }
                    } finally {
                        MethodCollector.o(3083);
                    }
                }
                this.writer.settings(settings);
            } finally {
                MethodCollector.o(3083);
            }
        }
    }

    public final void shutdown(ErrorCode errorCode) {
        MethodCollector.i(3046);
        synchronized (this.writer) {
            try {
                synchronized (this) {
                    try {
                        if (!this.shutdown) {
                            this.shutdown = true;
                            this.writer.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
                            MethodCollector.o(3046);
                        }
                    } finally {
                        MethodCollector.o(3046);
                    }
                }
            } finally {
                MethodCollector.o(3046);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void start(boolean z) {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, (long) (initialWindowSize - 65535));
            }
        }
        new Thread(this.readerRunnable).start();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void updateConnectionFlowControl(long j2) {
        MethodCollector.i(494);
        long j3 = this.unacknowledgedBytesRead + j2;
        this.unacknowledgedBytesRead = j3;
        if (j3 >= ((long) (this.okHttpSettings.getInitialWindowSize() / 2))) {
            writeWindowUpdateLater(0, this.unacknowledgedBytesRead);
            this.unacknowledgedBytesRead = 0;
        }
        MethodCollector.o(494);
    }

    Http2Connection(Builder builder) {
        int i2;
        Settings settings = new Settings();
        this.peerSettings = settings;
        this.currentPushRequests = new LinkedHashSet();
        this.pushObserver = builder.pushObserver;
        boolean z = builder.client;
        this.client = z;
        this.listener = builder.listener;
        if (builder.client) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.nextStreamId = i2;
        if (builder.client) {
            this.nextStreamId += 2;
        }
        if (builder.client) {
            this.okHttpSettings.set(7, 16777216);
        }
        String str = builder.hostname;
        this.hostname = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", str), false));
        this.writerExecutor = scheduledThreadPoolExecutor;
        if (builder.pingIntervalMillis != 0) {
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new IntervalPingRunnable(), (long) builder.pingIntervalMillis, (long) builder.pingIntervalMillis, TimeUnit.MILLISECONDS);
        }
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", str), true));
        settings.set(7, 65535);
        settings.set(5, 16384);
        this.bytesLeftInWriteWindow = (long) settings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new Http2Writer(builder.sink, z);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.source, z));
    }

    public final Http2Stream newStream(List<Header> list, boolean z) {
        return newStream(0, list, z);
    }

    /* access modifiers changed from: package-private */
    public final void writeSynReset(int i2, ErrorCode errorCode) {
        this.writer.rstStream(i2, errorCode);
    }

    /* access modifiers changed from: package-private */
    public final void pushResetLater(final int i2, final ErrorCode errorCode) {
        pushExecutorExecute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostname, Integer.valueOf(i2)}) {
            /* class okhttp3.internal.http2.Http2Connection.AnonymousClass7 */

            static {
                Covode.recordClassIndex(106265);
            }

            @Override // okhttp3.internal.NamedRunnable
            public void execute() {
                MethodCollector.i(962);
                Http2Connection.this.pushObserver.onReset(i2, errorCode);
                synchronized (Http2Connection.this) {
                    try {
                        Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i2));
                    } finally {
                        MethodCollector.o(962);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void writeSynResetLater(final int i2, final ErrorCode errorCode) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostname, Integer.valueOf(i2)}) {
                /* class okhttp3.internal.http2.Http2Connection.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(106259);
                }

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writeSynReset(i2, errorCode);
                    } catch (IOException unused) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void writeWindowUpdateLater(final int i2, final long j2) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostname, Integer.valueOf(i2)}) {
                /* class okhttp3.internal.http2.Http2Connection.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(106260);
                }

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writer.windowUpdate(i2, j2);
                    } catch (IOException unused) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void close(ErrorCode errorCode, ErrorCode errorCode2) {
        IOException e2;
        MethodCollector.i(3049);
        Http2Stream[] http2StreamArr = null;
        try {
            shutdown(errorCode);
            e2 = null;
        } catch (IOException e3) {
            e2 = e3;
        }
        synchronized (this) {
            try {
                if (!this.streams.isEmpty()) {
                    http2StreamArr = (Http2Stream[]) this.streams.values().toArray(new Http2Stream[this.streams.size()]);
                    this.streams.clear();
                }
            } catch (Throwable th) {
                MethodCollector.o(3049);
                throw th;
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2);
                } catch (IOException e4) {
                    if (e2 != null) {
                        e2 = e4;
                    }
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException e5) {
            if (e2 == null) {
                e2 = e5;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e6) {
            e2 = e6;
        }
        this.writerExecutor.shutdown();
        this.pushExecutor.shutdown();
        if (e2 == null) {
            MethodCollector.o(3049);
        } else {
            MethodCollector.o(3049);
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void pushRequestLater(final int i2, final List<Header> list) {
        MethodCollector.i(3401);
        synchronized (this) {
            try {
                if (this.currentPushRequests.contains(Integer.valueOf(i2))) {
                    writeSynResetLater(i2, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                this.currentPushRequests.add(Integer.valueOf(i2));
                try {
                    pushExecutorExecute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostname, Integer.valueOf(i2)}) {
                        /* class okhttp3.internal.http2.Http2Connection.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(106262);
                        }

                        @Override // okhttp3.internal.NamedRunnable
                        public void execute() {
                            MethodCollector.i(6546);
                            if (Http2Connection.this.pushObserver.onRequest(i2, list)) {
                                try {
                                    Http2Connection.this.writer.rstStream(i2, ErrorCode.CANCEL);
                                    synchronized (Http2Connection.this) {
                                        try {
                                            Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i2));
                                        } finally {
                                            MethodCollector.o(6546);
                                        }
                                    }
                                } catch (IOException unused) {
                                    MethodCollector.o(6546);
                                }
                            } else {
                                MethodCollector.o(6546);
                            }
                        }
                    });
                    MethodCollector.o(3401);
                } catch (RejectedExecutionException unused) {
                    MethodCollector.o(3401);
                }
            } finally {
                MethodCollector.o(3401);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void writeSynReply(int i2, boolean z, List<Header> list) {
        this.writer.synReply(z, i2, list);
    }

    /* access modifiers changed from: package-private */
    public final void writePing(boolean z, int i2, int i3) {
        try {
            this.writer.ping(z, i2, i3);
        } catch (IOException unused) {
            failConnection();
        }
    }

    /* access modifiers changed from: package-private */
    public final void pushHeadersLater(final int i2, final List<Header> list, final boolean z) {
        try {
            pushExecutorExecute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostname, Integer.valueOf(i2)}) {
                /* class okhttp3.internal.http2.Http2Connection.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(106263);
                }

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    MethodCollector.i(4518);
                    if (Http2Connection.this.pushObserver.onHeaders(i2, list, z)) {
                        Http2Connection.this.writer.rstStream(i2, ErrorCode.CANCEL);
                    } else {
                        try {
                            if (!z) {
                                MethodCollector.o(4518);
                                return;
                            }
                        } catch (IOException unused) {
                            MethodCollector.o(4518);
                            return;
                        }
                    }
                    synchronized (Http2Connection.this) {
                        try {
                            Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i2));
                        } finally {
                            MethodCollector.o(4518);
                        }
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final Http2Stream pushStream(int i2, List<Header> list, boolean z) {
        if (!this.client) {
            return newStream(i2, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[Catch:{ all -> 0x007e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.http2.Http2Stream newStream(int r14, java.util.List<okhttp3.internal.http2.Header> r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    /* access modifiers changed from: package-private */
    public final void pushDataLater(final int i2, h hVar, final int i3, final boolean z) {
        final f fVar = new f();
        long j2 = (long) i3;
        hVar.d(j2);
        hVar.read(fVar, j2);
        if (fVar.f158864b == j2) {
            pushExecutorExecute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostname, Integer.valueOf(i2)}) {
                /* class okhttp3.internal.http2.Http2Connection.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(106264);
                }

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    MethodCollector.i(4672);
                    try {
                        if (Http2Connection.this.pushObserver.onData(i2, fVar, i3, z)) {
                            Http2Connection.this.writer.rstStream(i2, ErrorCode.CANCEL);
                        } else if (!z) {
                            MethodCollector.o(4672);
                            return;
                        }
                        synchronized (Http2Connection.this) {
                            try {
                                Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i2));
                            } finally {
                                MethodCollector.o(4672);
                            }
                        }
                    } catch (IOException unused) {
                        MethodCollector.o(4672);
                    }
                }
            });
            return;
        }
        throw new IOException(fVar.f158864b + " != " + i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r4 = java.lang.Math.min((int) java.lang.Math.min(r12, r0), r8.writer.maxDataLength());
        r0 = (long) r4;
        r8.bytesLeftInWriteWindow -= r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeData(int r9, boolean r10, k.f r11, long r12) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, k.f, long):void");
    }
}
