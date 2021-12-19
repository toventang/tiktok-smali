package okhttp3.internal.connection;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import k.aa;
import k.g;
import k.h;
import k.q;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

public final class RealConnection extends Http2Connection.Listener implements Connection {
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();
    private final ConnectionPool connectionPool;
    private Handshake handshake;
    private Http2Connection http2Connection;
    public long idleAtNanos = Long.MAX_VALUE;
    public boolean noNewStreams;
    private Protocol protocol;
    private Socket rawSocket;
    private final Route route;
    private g sink;
    private Socket socket;
    private h source;
    public int successCount;

    static {
        Covode.recordClassIndex(106218);
    }

    @Override // okhttp3.Connection
    public final Handshake handshake() {
        return this.handshake;
    }

    @Override // okhttp3.Connection
    public final Protocol protocol() {
        return this.protocol;
    }

    @Override // okhttp3.Connection
    public final Route route() {
        return this.route;
    }

    @Override // okhttp3.Connection
    public final Socket socket() {
        return this.socket;
    }

    public final void cancel() {
        Util.closeQuietly(this.rawSocket);
    }

    public final boolean isMultiplexed() {
        if (this.http2Connection != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj;
        StringBuilder append = new StringBuilder("Connection{").append(this.route.address().url().host()).append(":").append(this.route.address().url().port()).append(", proxy=").append(this.route.proxy()).append(" hostAddress=").append(this.route.socketAddress()).append(" cipherSuite=");
        Handshake handshake2 = this.handshake;
        if (handshake2 != null) {
            obj = handshake2.cipherSuite();
        } else {
            obj = "none";
        }
        return append.append(obj).append(" protocol=").append(this.protocol).append('}').toString();
    }

    private Request createTunnelRequest() {
        Request build = new Request.Builder().url(this.route.address().url()).method("CONNECT", null).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
        Request authenticate = this.route.address().proxyAuthenticator().authenticate(this.route, new Response.Builder().request(build).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(-1).header("Proxy-Authenticate", "OkHttp-Preemptive").build());
        if (authenticate != null) {
            return authenticate;
        }
        return build;
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onStream(Http2Stream http2Stream) {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    public final RealWebSocket.Streams newWebSocketStreams(final StreamAllocation streamAllocation) {
        return new RealWebSocket.Streams(true, this.source, this.sink) {
            /* class okhttp3.internal.connection.RealConnection.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106219);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                StreamAllocation streamAllocation = streamAllocation;
                streamAllocation.streamFinished(true, streamAllocation.codec(), -1, null);
            }
        };
    }

    @Override // okhttp3.internal.http2.Http2Connection.Listener
    public final void onSettings(Http2Connection http2Connection2) {
        MethodCollector.i(2649);
        synchronized (this.connectionPool) {
            try {
                this.allocationLimit = http2Connection2.maxConcurrentStreams();
            } finally {
                MethodCollector.o(2649);
            }
        }
    }

    private void startHttp2(int i2) {
        this.socket.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).pingIntervalMillis(i2).build();
        this.http2Connection = build;
        build.start();
    }

    /* JADX INFO: finally extract failed */
    public final boolean isHealthy(boolean z) {
        if (this.socket.isClosed() || this.socket.isInputShutdown() || this.socket.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection2 = this.http2Connection;
        if (http2Connection2 != null) {
            return http2Connection2.isHealthy(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.socket.getSoTimeout();
                try {
                    this.socket.setSoTimeout(1);
                    if (this.source.e()) {
                        this.socket.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.socket.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.socket.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public final boolean supportsUrl(HttpUrl httpUrl) {
        if (httpUrl.port() != this.route.address().url().port()) {
            return false;
        }
        if (httpUrl.host().equals(this.route.address().url().host())) {
            return true;
        }
        if (this.handshake == null || !OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) this.handshake.peerCertificates().get(0))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0136 A[Catch:{ all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x013c A[Catch:{ all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void connectTls(okhttp3.internal.connection.ConnectionSpecSelector r9) {
        /*
        // Method dump skipped, instructions count: 331
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connectTls(okhttp3.internal.connection.ConnectionSpecSelector):void");
    }

    public RealConnection(ConnectionPool connectionPool2, Route route2) {
        this.connectionPool = connectionPool2;
        this.route = route2;
    }

    public final boolean isEligible(Address address, Route route2) {
        if (this.allocations.size() >= this.allocationLimit || this.noNewStreams || !Internal.instance.equalsNonHost(this.route.address(), address)) {
            return false;
        }
        if (address.url().host().equals(route().address().url().host())) {
            return true;
        }
        if (this.http2Connection == null || route2 == null || route2.proxy().type() != Proxy.Type.DIRECT || this.route.proxy().type() != Proxy.Type.DIRECT || !this.route.socketAddress().equals(route2.socketAddress()) || route2.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
            return false;
        }
        try {
            address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final HttpCodec newCodec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation) {
        if (this.http2Connection != null) {
            return new Http2Codec(okHttpClient, chain, streamAllocation, this.http2Connection);
        }
        this.socket.setSoTimeout(chain.readTimeoutMillis());
        this.source.timeout().timeout((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.sink.timeout().timeout((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new Http1Codec(okHttpClient, streamAllocation, this.source, this.sink);
    }

    public static RealConnection testConnection(ConnectionPool connectionPool2, Route route2, Socket socket2, long j2) {
        RealConnection realConnection = new RealConnection(connectionPool2, route2);
        realConnection.socket = socket2;
        realConnection.idleAtNanos = j2;
        return realConnection;
    }

    private void establishProtocol(ConnectionSpecSelector connectionSpecSelector, int i2, Call call, EventListener eventListener) {
        if (this.route.address().sslSocketFactory() != null) {
            eventListener.secureConnectStart(call);
            connectTls(connectionSpecSelector);
            eventListener.secureConnectEnd(call, this.handshake);
            if (this.protocol == Protocol.HTTP_2) {
                startHttp2(i2);
            }
        } else if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
            this.socket = this.rawSocket;
            this.protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            startHttp2(i2);
        } else {
            this.socket = this.rawSocket;
            this.protocol = Protocol.HTTP_1_1;
        }
    }

    private void connectSocket(int i2, int i3, Call call, EventListener eventListener) {
        Socket socket2;
        Proxy proxy = this.route.proxy();
        Address address = this.route.address();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket2 = address.socketFactory().createSocket();
        } else {
            socket2 = new Socket(proxy);
        }
        this.rawSocket = socket2;
        eventListener.connectStart(call, this.route.socketAddress(), proxy);
        this.rawSocket.setSoTimeout(i3);
        try {
            Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), i2);
            try {
                this.source = q.a(q.b(this.rawSocket));
                this.sink = q.a(q.a(this.rawSocket));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.socketAddress());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private Request createTunnel(int i2, int i3, Request request, HttpUrl httpUrl) {
        Response build;
        String str = "CONNECT " + Util.hostHeader(httpUrl, true) + " HTTP/1.1";
        do {
            Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
            this.source.timeout().timeout((long) i2, TimeUnit.MILLISECONDS);
            this.sink.timeout().timeout((long) i3, TimeUnit.MILLISECONDS);
            http1Codec.writeRequest(request.headers(), str);
            http1Codec.finishRequest();
            build = http1Codec.readResponseHeaders(false).request(request).build();
            long contentLength = HttpHeaders.contentLength(build);
            if (contentLength == -1) {
                contentLength = 0;
            }
            aa newFixedLengthSource = http1Codec.newFixedLengthSource(contentLength);
            Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            newFixedLengthSource.close();
            int code = build.code();
            if (code != 200) {
                if (code == 407) {
                    request = this.route.address().proxyAuthenticator().authenticate(this.route, build);
                    if (request == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + build.code());
                }
            } else if (this.source.a().e() && this.sink.a().e()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } while (!"close".equalsIgnoreCase(build.header("Connection")));
        return request;
    }

    private void connectTunnel(int i2, int i3, int i4, Call call, EventListener eventListener) {
        Request createTunnelRequest = createTunnelRequest();
        HttpUrl url = createTunnelRequest.url();
        int i5 = 0;
        do {
            connectSocket(i2, i3, call, eventListener);
            createTunnelRequest = createTunnel(i3, i4, createTunnelRequest, url);
            if (createTunnelRequest != null) {
                Util.closeQuietly(this.rawSocket);
                this.rawSocket = null;
                this.sink = null;
                this.source = null;
                eventListener.connectEnd(call, this.route.socketAddress(), this.route.proxy(), null);
                i5++;
            } else {
                return;
            }
        } while (i5 < 21);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[Catch:{ IOException -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078 A[SYNTHETIC, Splitter:B:16:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
        // Method dump skipped, instructions count: 358
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }
}
