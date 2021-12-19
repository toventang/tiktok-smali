package okhttp3.internal.ws;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.g;
import k.h;
import k.i;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.ws.WebSocketReader;

public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final List<Protocol> ONLY_HTTP1 = Collections.singletonList(Protocol.HTTP_1_1);
    private boolean awaitingPong;
    private Call call;
    private ScheduledFuture<?> cancelFuture;
    private boolean enqueuedClose;
    private ScheduledExecutorService executor;
    private boolean failed;
    private final String key;
    final WebSocketListener listener;
    private final ArrayDeque<Object> messageAndCloseQueue = new ArrayDeque<>();
    private final Request originalRequest;
    private final long pingIntervalMillis;
    private final ArrayDeque<i> pongQueue = new ArrayDeque<>();
    private long queueSize;
    private final Random random;
    private WebSocketReader reader;
    private int receivedCloseCode = -1;
    private String receivedCloseReason;
    private int receivedPingCount;
    private int receivedPongCount;
    private int sentPingCount;
    private Streams streams;
    private WebSocketWriter writer;
    private final Runnable writerRunnable;

    @Override // okhttp3.WebSocket
    public final Request request() {
        return this.originalRequest;
    }

    /* access modifiers changed from: package-private */
    public final class CancelRunnable implements Runnable {
        static {
            Covode.recordClassIndex(106322);
        }

        public final void run() {
            RealWebSocket.this.cancel();
        }

        CancelRunnable() {
        }
    }

    /* access modifiers changed from: package-private */
    public final class PingRunnable implements Runnable {
        static {
            Covode.recordClassIndex(106325);
        }

        public final void run() {
            RealWebSocket.this.writePingFrame();
        }

        PingRunnable() {
        }
    }

    @Override // okhttp3.WebSocket
    public final void cancel() {
        this.call.cancel();
    }

    static {
        Covode.recordClassIndex(106319);
    }

    private void runWriter() {
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.writerRunnable);
        }
    }

    public final void loopReader() {
        while (this.receivedCloseCode == -1) {
            this.reader.processNextFrame();
        }
    }

    @Override // okhttp3.WebSocket
    public final synchronized long queueSize() {
        long j2;
        MethodCollector.i(2847);
        j2 = this.queueSize;
        MethodCollector.o(2847);
        return j2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int receivedPingCount() {
        int i2;
        MethodCollector.i(2872);
        i2 = this.receivedPingCount;
        MethodCollector.o(2872);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int receivedPongCount() {
        int i2;
        MethodCollector.i(2873);
        i2 = this.receivedPongCount;
        MethodCollector.o(2873);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized int sentPingCount() {
        int i2;
        MethodCollector.i(2871);
        i2 = this.sentPingCount;
        MethodCollector.o(2871);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean processNextFrame() {
        try {
            this.reader.processNextFrame();
            if (this.receivedCloseCode == -1) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            failWebSocket(e2, null);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void tearDown() {
        ScheduledFuture<?> scheduledFuture = this.cancelFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.executor.shutdown();
        this.executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r6 == -1) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        failWebSocket(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r8.pingIntervalMillis + "ms (after " + (r6 - 1) + " successful ping/pongs)"), null);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4208);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.writePing(k.i.EMPTY);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4208);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        failWebSocket(r0, null);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(4208);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writePingFrame() {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writePingFrame():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r10 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.writePong(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if ((r6 instanceof okhttp3.internal.ws.RealWebSocket.Message) == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r5 = r6.data;
        r0 = k.q.a(r3.newMessageSink(r6.formatOpcode, (long) r5.size()));
        r0.a(r5);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r12.queueSize -= (long) r5.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(3958);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        if ((r6 instanceof okhttp3.internal.ws.RealWebSocket.Close) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        r6 = (okhttp3.internal.ws.RealWebSocket.Close) r6;
        r3.writeClose(r6.code, r6.reason);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r4 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r12.listener.onClosed(r12, r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        okhttp3.internal.Util.closeQuietly(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(3958);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        r0 = new java.lang.AssertionError();
        com.bytedance.frameworks.apm.trace.MethodCollector.o(3958);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bb, code lost:
        okhttp3.internal.Util.closeQuietly(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(3958);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean writeOneFrame() {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.writeOneFrame():boolean");
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(String str) {
        this.listener.onMessage(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadMessage(i iVar) {
        this.listener.onMessage(this, iVar);
    }

    @Override // okhttp3.WebSocket
    public final boolean send(String str) {
        Objects.requireNonNull(str, "text == null");
        return send(i.encodeUtf8(str), 1);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void onReadPong(i iVar) {
        MethodCollector.i(2875);
        this.receivedPongCount++;
        this.awaitingPong = false;
        MethodCollector.o(2875);
    }

    @Override // okhttp3.WebSocket
    public final boolean send(i iVar) {
        Objects.requireNonNull(iVar, "bytes == null");
        return send(iVar, 2);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void onReadPing(i iVar) {
        MethodCollector.i(2874);
        if (this.failed || (this.enqueuedClose && this.messageAndCloseQueue.isEmpty())) {
            MethodCollector.o(2874);
            return;
        }
        this.pongQueue.add(iVar);
        runWriter();
        this.receivedPingCount++;
        MethodCollector.o(2874);
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean pong(i iVar) {
        MethodCollector.i(2880);
        if (!this.failed) {
            if (!this.enqueuedClose || !this.messageAndCloseQueue.isEmpty()) {
                this.pongQueue.add(iVar);
                runWriter();
                MethodCollector.o(2880);
                return true;
            }
        }
        MethodCollector.o(2880);
        return false;
    }

    public final void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(ONLY_HTTP1).build();
        final Request build2 = this.originalRequest.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.key).header("Sec-WebSocket-Version", "13").build();
        Call newWebSocketCall = Internal.instance.newWebSocketCall(build, build2);
        this.call = newWebSocketCall;
        newWebSocketCall.timeout().clearTimeout();
        this.call.enqueue(new Callback() {
            /* class okhttp3.internal.ws.RealWebSocket.AnonymousClass2 */

            static {
                Covode.recordClassIndex(106321);
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                RealWebSocket.this.failWebSocket(iOException, null);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                try {
                    RealWebSocket.this.checkResponse(response);
                    StreamAllocation streamAllocation = Internal.instance.streamAllocation(call);
                    streamAllocation.noNewStreams();
                    Streams newWebSocketStreams = streamAllocation.connection().newWebSocketStreams(streamAllocation);
                    try {
                        RealWebSocket.this.listener.onOpen(RealWebSocket.this, response);
                        RealWebSocket.this.initReaderAndWriter("OkHttp WebSocket " + build2.url().redact(), newWebSocketStreams);
                        streamAllocation.connection().socket().setSoTimeout(0);
                        RealWebSocket.this.loopReader();
                    } catch (Exception e2) {
                        RealWebSocket.this.failWebSocket(e2, null);
                    }
                } catch (ProtocolException e3) {
                    RealWebSocket.this.failWebSocket(e3, response);
                    Util.closeQuietly(response);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void checkResponse(Response response) {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    String base64 = i.encodeUtf8(this.key + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                    if (!base64.equals(header3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header3 + "'");
                    }
                    return;
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
    }

    /* access modifiers changed from: package-private */
    public static final class Message {
        final i data;
        final int formatOpcode;

        static {
            Covode.recordClassIndex(106324);
        }

        Message(int i2, i iVar) {
            this.formatOpcode = i2;
            this.data = iVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void awaitTermination(int i2, TimeUnit timeUnit) {
        this.executor.awaitTermination((long) i2, timeUnit);
    }

    @Override // okhttp3.WebSocket
    public final boolean close(int i2, String str) {
        return close(i2, str, 60000);
    }

    private synchronized boolean send(i iVar, int i2) {
        MethodCollector.i(2879);
        if (this.failed || this.enqueuedClose) {
            MethodCollector.o(2879);
            return false;
        } else if (this.queueSize + ((long) iVar.size()) > 16777216) {
            close(1001, null);
            MethodCollector.o(2879);
            return false;
        } else {
            this.queueSize += (long) iVar.size();
            this.messageAndCloseQueue.add(new Message(i2, iVar));
            runWriter();
            MethodCollector.o(2879);
            return true;
        }
    }

    public final void failWebSocket(Exception exc, Response response) {
        MethodCollector.i(4212);
        synchronized (this) {
            try {
                if (!this.failed) {
                    this.failed = true;
                    Streams streams2 = this.streams;
                    this.streams = null;
                    ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    ScheduledExecutorService scheduledExecutorService = this.executor;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdown();
                    }
                    try {
                        this.listener.onFailure(this, exc, response);
                    } finally {
                        Util.closeQuietly(streams2);
                        MethodCollector.o(4212);
                    }
                }
            } finally {
                MethodCollector.o(4212);
            }
        }
    }

    public final void initReaderAndWriter(String str, Streams streams2) {
        MethodCollector.i(2869);
        synchronized (this) {
            try {
                this.streams = streams2;
                this.writer = new WebSocketWriter(streams2.client, streams2.sink, this.random);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
                this.executor = scheduledThreadPoolExecutor;
                if (this.pingIntervalMillis != 0) {
                    PingRunnable pingRunnable = new PingRunnable();
                    long j2 = this.pingIntervalMillis;
                    scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, j2, j2, TimeUnit.MILLISECONDS);
                }
                if (!this.messageAndCloseQueue.isEmpty()) {
                    runWriter();
                }
            } catch (Throwable th) {
                MethodCollector.o(2869);
                throw th;
            }
        }
        this.reader = new WebSocketReader(streams2.client, streams2.source, this);
        MethodCollector.o(2869);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void onReadClose(int i2, String str) {
        Streams streams2;
        MethodCollector.i(2876);
        if (i2 != -1) {
            synchronized (this) {
                try {
                    if (this.receivedCloseCode == -1) {
                        this.receivedCloseCode = i2;
                        this.receivedCloseReason = str;
                        streams2 = null;
                        if (this.enqueuedClose && this.messageAndCloseQueue.isEmpty()) {
                            Streams streams3 = this.streams;
                            this.streams = streams2;
                            ScheduledFuture<?> scheduledFuture = this.cancelFuture;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            this.executor.shutdown();
                            streams2 = streams3;
                        }
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException("already closed");
                        MethodCollector.o(2876);
                        throw illegalStateException;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2876);
                    throw th;
                }
            }
            try {
                this.listener.onClosing(this, i2, str);
                if (streams2 != null) {
                    this.listener.onClosed(this, i2, str);
                }
            } finally {
                Util.closeQuietly(streams2);
                MethodCollector.o(2876);
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
            MethodCollector.o(2876);
            throw illegalArgumentException;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class Close {
        final long cancelAfterCloseMillis;
        final int code;
        final i reason;

        static {
            Covode.recordClassIndex(106323);
        }

        Close(int i2, i iVar, long j2) {
            this.code = i2;
            this.reason = iVar;
            this.cancelAfterCloseMillis = j2;
        }
    }

    public static abstract class Streams implements Closeable {
        public final boolean client;
        public final g sink;
        public final h source;

        static {
            Covode.recordClassIndex(106326);
        }

        public Streams(boolean z, h hVar, g gVar) {
            this.client = z;
            this.source = hVar;
            this.sink = gVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized boolean close(int i2, String str, long j2) {
        MethodCollector.i(3255);
        WebSocketProtocol.validateCloseCode(i2);
        i iVar = null;
        if (str != null) {
            iVar = i.encodeUtf8(str);
            if (((long) iVar.size()) > 123) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("reason.size() > 123: ".concat(String.valueOf(str)));
                MethodCollector.o(3255);
                throw illegalArgumentException;
            }
        }
        if (!this.failed) {
            if (!this.enqueuedClose) {
                this.enqueuedClose = true;
                this.messageAndCloseQueue.add(new Close(i2, iVar, j2));
                runWriter();
                MethodCollector.o(3255);
                return true;
            }
        }
        MethodCollector.o(3255);
        return false;
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random2, long j2) {
        if ("GET".equals(request.method())) {
            this.originalRequest = request;
            this.listener = webSocketListener;
            this.random = random2;
            this.pingIntervalMillis = j2;
            byte[] bArr = new byte[16];
            random2.nextBytes(bArr);
            this.key = i.of(bArr).base64();
            this.writerRunnable = new Runnable() {
                /* class okhttp3.internal.ws.RealWebSocket.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(106320);
                }

                public void run() {
                    do {
                        try {
                        } catch (IOException e2) {
                            RealWebSocket.this.failWebSocket(e2, null);
                            return;
                        }
                    } while (RealWebSocket.this.writeOneFrame());
                }
            };
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }
}
