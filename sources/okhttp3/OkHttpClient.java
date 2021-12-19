package okhttp3;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.net.j.h;
import com.ss.android.ugc.aweme.net.monitor.p;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableList(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);
    static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableList(Protocol.HTTP_2, Protocol.HTTP_1_1);
    final Authenticator authenticator;
    final Cache cache;
    final int callTimeout;
    final CertificateChainCleaner certificateChainCleaner;
    final CertificatePinner certificatePinner;
    final int connectTimeout;
    final ConnectionPool connectionPool;
    final List<ConnectionSpec> connectionSpecs;
    final CookieJar cookieJar;
    final Dispatcher dispatcher;
    final Dns dns;
    final EventListener.Factory eventListenerFactory;
    final boolean followRedirects;
    final boolean followSslRedirects;
    final HostnameVerifier hostnameVerifier;
    final List<Interceptor> interceptors;
    final InternalCache internalCache;
    final List<Interceptor> networkInterceptors;
    final int pingInterval;
    final List<Protocol> protocols;
    final Proxy proxy;
    final Authenticator proxyAuthenticator;
    final ProxySelector proxySelector;
    final int readTimeout;
    final boolean retryOnConnectionFailure;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final int writeTimeout;

    public static final class Builder {
        Authenticator authenticator;
        Cache cache;
        int callTimeout;
        CertificateChainCleaner certificateChainCleaner;
        CertificatePinner certificatePinner;
        int connectTimeout;
        ConnectionPool connectionPool;
        List<ConnectionSpec> connectionSpecs;
        CookieJar cookieJar;
        Dispatcher dispatcher;
        Dns dns;
        EventListener.Factory eventListenerFactory;
        boolean followRedirects;
        boolean followSslRedirects;
        HostnameVerifier hostnameVerifier;
        final List<Interceptor> interceptors;
        InternalCache internalCache;
        final List<Interceptor> networkInterceptors;
        int pingInterval;
        List<Protocol> protocols;
        Proxy proxy;
        Authenticator proxyAuthenticator;
        ProxySelector proxySelector;
        int readTimeout;
        boolean retryOnConnectionFailure;
        SocketFactory socketFactory;
        SSLSocketFactory sslSocketFactory;
        int writeTimeout;

        static {
            Covode.recordClassIndex(106165);
        }

        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public Builder() {
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.dispatcher = new Dispatcher();
            this.protocols = OkHttpClient.DEFAULT_PROTOCOLS;
            this.connectionSpecs = OkHttpClient.DEFAULT_CONNECTION_SPECS;
            this.eventListenerFactory = EventListener.factory(EventListener.NONE);
            ProxySelector proxySelector2 = ProxySelector.getDefault();
            this.proxySelector = proxySelector2;
            if (proxySelector2 == null) {
                this.proxySelector = new NullProxySelector();
            }
            this.cookieJar = CookieJar.NO_COOKIES;
            this.socketFactory = SocketFactory.getDefault();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.proxyAuthenticator = Authenticator.NONE;
            this.authenticator = Authenticator.NONE;
            this.connectionPool = new ConnectionPool();
            this.dns = Dns.SYSTEM;
            this.followSslRedirects = true;
            this.followRedirects = true;
            this.retryOnConnectionFailure = true;
            this.callTimeout = 0;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.pingInterval = 0;
        }

        public final Builder followRedirects(boolean z) {
            this.followRedirects = z;
            return this;
        }

        public final Builder followSslRedirects(boolean z) {
            this.followSslRedirects = z;
            return this;
        }

        public final Builder proxy(Proxy proxy2) {
            this.proxy = proxy2;
            return this;
        }

        public final Builder retryOnConnectionFailure(boolean z) {
            this.retryOnConnectionFailure = z;
            return this;
        }

        public final Builder authenticator(Authenticator authenticator2) {
            Objects.requireNonNull(authenticator2, "authenticator == null");
            this.authenticator = authenticator2;
            return this;
        }

        public final Builder cache(Cache cache2) {
            this.cache = cache2;
            this.internalCache = null;
            return this;
        }

        public final Builder certificatePinner(CertificatePinner certificatePinner2) {
            Objects.requireNonNull(certificatePinner2, "certificatePinner == null");
            this.certificatePinner = certificatePinner2;
            return this;
        }

        public final Builder connectionPool(ConnectionPool connectionPool2) {
            Objects.requireNonNull(connectionPool2, "connectionPool == null");
            this.connectionPool = connectionPool2;
            return this;
        }

        public final Builder connectionSpecs(List<ConnectionSpec> list) {
            this.connectionSpecs = Util.immutableList(list);
            return this;
        }

        public final Builder cookieJar(CookieJar cookieJar2) {
            Objects.requireNonNull(cookieJar2, "cookieJar == null");
            this.cookieJar = cookieJar2;
            return this;
        }

        public final Builder dns(Dns dns2) {
            Objects.requireNonNull(dns2, "dns == null");
            this.dns = dns2;
            return this;
        }

        public final Builder eventListenerFactory(EventListener.Factory factory) {
            Objects.requireNonNull(factory, "eventListenerFactory == null");
            this.eventListenerFactory = factory;
            return this;
        }

        public final Builder hostnameVerifier(HostnameVerifier hostnameVerifier2) {
            Objects.requireNonNull(hostnameVerifier2, "hostnameVerifier == null");
            this.hostnameVerifier = hostnameVerifier2;
            return this;
        }

        public final Builder proxyAuthenticator(Authenticator authenticator2) {
            Objects.requireNonNull(authenticator2, "proxyAuthenticator == null");
            this.proxyAuthenticator = authenticator2;
            return this;
        }

        public final Builder proxySelector(ProxySelector proxySelector2) {
            Objects.requireNonNull(proxySelector2, "proxySelector == null");
            this.proxySelector = proxySelector2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void setInternalCache(InternalCache internalCache2) {
            this.internalCache = internalCache2;
            this.cache = null;
        }

        public final Builder socketFactory(SocketFactory socketFactory2) {
            Objects.requireNonNull(socketFactory2, "socketFactory == null");
            this.socketFactory = socketFactory2;
            return this;
        }

        public final Builder addInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.interceptors.add(interceptor);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final Builder addNetworkInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.networkInterceptors.add(interceptor);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public final Builder dispatcher(Dispatcher dispatcher2) {
            if (dispatcher2 != null) {
                this.dispatcher = dispatcher2;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public final Builder eventListener(EventListener eventListener) {
            Objects.requireNonNull(eventListener, "eventListener == null");
            this.eventListenerFactory = EventListener.factory(eventListener);
            return this;
        }

        public final Builder callTimeout(Duration duration) {
            this.callTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder connectTimeout(Duration duration) {
            this.connectTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder pingInterval(Duration duration) {
            this.pingInterval = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder readTimeout(Duration duration) {
            this.readTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            Objects.requireNonNull(sSLSocketFactory, "sslSocketFactory == null");
            this.sslSocketFactory = sSLSocketFactory;
            this.certificateChainCleaner = Platform.get().buildCertificateChainCleaner(sSLSocketFactory);
            return this;
        }

        public final Builder writeTimeout(Duration duration) {
            this.writeTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        public final Builder protocols(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.contains(Protocol.H2_PRIOR_KNOWLEDGE) && !arrayList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: ".concat(String.valueOf(arrayList)));
            } else if (arrayList.contains(Protocol.H2_PRIOR_KNOWLEDGE) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: ".concat(String.valueOf(arrayList)));
            } else if (arrayList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: ".concat(String.valueOf(arrayList)));
            } else if (!arrayList.contains(null)) {
                arrayList.remove(Protocol.SPDY_3);
                this.protocols = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        Builder(OkHttpClient okHttpClient) {
            ArrayList arrayList = new ArrayList();
            this.interceptors = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.networkInterceptors = arrayList2;
            this.dispatcher = okHttpClient.dispatcher;
            this.proxy = okHttpClient.proxy;
            this.protocols = okHttpClient.protocols;
            this.connectionSpecs = okHttpClient.connectionSpecs;
            arrayList.addAll(okHttpClient.interceptors);
            arrayList2.addAll(okHttpClient.networkInterceptors);
            this.eventListenerFactory = okHttpClient.eventListenerFactory;
            this.proxySelector = okHttpClient.proxySelector;
            this.cookieJar = okHttpClient.cookieJar;
            this.internalCache = okHttpClient.internalCache;
            this.cache = okHttpClient.cache;
            this.socketFactory = okHttpClient.socketFactory;
            this.sslSocketFactory = okHttpClient.sslSocketFactory;
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner;
            this.hostnameVerifier = okHttpClient.hostnameVerifier;
            this.certificatePinner = okHttpClient.certificatePinner;
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator;
            this.authenticator = okHttpClient.authenticator;
            this.connectionPool = okHttpClient.connectionPool;
            this.dns = okHttpClient.dns;
            this.followSslRedirects = okHttpClient.followSslRedirects;
            this.followRedirects = okHttpClient.followRedirects;
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure;
            this.callTimeout = okHttpClient.callTimeout;
            this.connectTimeout = okHttpClient.connectTimeout;
            this.readTimeout = okHttpClient.readTimeout;
            this.writeTimeout = okHttpClient.writeTimeout;
            this.pingInterval = okHttpClient.pingInterval;
            List<Interceptor> interceptors2 = interceptors();
            if (h.a().f112414a) {
                for (Interceptor interceptor : interceptors2) {
                    if (interceptor instanceof p) {
                        return;
                    }
                }
                addInterceptor(new p());
            }
        }

        public final Builder callTimeout(long j2, TimeUnit timeUnit) {
            this.callTimeout = Util.checkDuration("timeout", j2, timeUnit);
            return this;
        }

        public final Builder connectTimeout(long j2, TimeUnit timeUnit) {
            this.connectTimeout = Util.checkDuration("timeout", j2, timeUnit);
            return this;
        }

        public final Builder pingInterval(long j2, TimeUnit timeUnit) {
            this.pingInterval = Util.checkDuration("interval", j2, timeUnit);
            return this;
        }

        public final Builder readTimeout(long j2, TimeUnit timeUnit) {
            this.readTimeout = Util.checkDuration("timeout", j2, timeUnit);
            return this;
        }

        public final Builder writeTimeout(long j2, TimeUnit timeUnit) {
            this.writeTimeout = Util.checkDuration("timeout", j2, timeUnit);
            return this;
        }

        public final Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            Objects.requireNonNull(sSLSocketFactory, "sslSocketFactory == null");
            Objects.requireNonNull(x509TrustManager, "trustManager == null");
            this.sslSocketFactory = sSLSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.get(x509TrustManager);
            return this;
        }
    }

    public Authenticator authenticator() {
        return this.authenticator;
    }

    public Cache cache() {
        return this.cache;
    }

    public int callTimeoutMillis() {
        return this.callTimeout;
    }

    public CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }

    public ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public CookieJar cookieJar() {
        return this.cookieJar;
    }

    public Dispatcher dispatcher() {
        return this.dispatcher;
    }

    public Dns dns() {
        return this.dns;
    }

    public EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    public boolean followRedirects() {
        return this.followRedirects;
    }

    public boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    public int pingIntervalMillis() {
        return this.pingInterval;
    }

    public List<Protocol> protocols() {
        return this.protocols;
    }

    public Proxy proxy() {
        return this.proxy;
    }

    public Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public int readTimeoutMillis() {
        return this.readTimeout;
    }

    public boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    public SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public OkHttpClient() {
        this(new Builder());
    }

    /* access modifiers changed from: package-private */
    public InternalCache internalCache() {
        Cache cache2 = this.cache;
        if (cache2 != null) {
            return cache2.internalCache;
        }
        return this.internalCache;
    }

    static {
        Covode.recordClassIndex(106163);
        Internal.instance = new Internal() {
            /* class okhttp3.OkHttpClient.AnonymousClass1 */

            static {
                Covode.recordClassIndex(106164);
            }

            @Override // okhttp3.internal.Internal
            public final int code(Response.Builder builder) {
                return builder.code;
            }

            @Override // okhttp3.internal.Internal
            public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
                return connectionPool.routeDatabase;
            }

            @Override // okhttp3.internal.Internal
            public final StreamAllocation streamAllocation(Call call) {
                return ((RealCall) call).streamAllocation();
            }

            @Override // okhttp3.internal.Internal
            public final boolean isInvalidHttpUrlHost(IllegalArgumentException illegalArgumentException) {
                return illegalArgumentException.getMessage().startsWith("Invalid URL host");
            }

            @Override // okhttp3.internal.Internal
            public final void addLenient(Headers.Builder builder, String str) {
                builder.addLenient(str);
            }

            @Override // okhttp3.internal.Internal
            public final void put(ConnectionPool connectionPool, RealConnection realConnection) {
                connectionPool.put(realConnection);
            }

            @Override // okhttp3.internal.Internal
            public final void setCache(Builder builder, InternalCache internalCache) {
                builder.setInternalCache(internalCache);
            }

            @Override // okhttp3.internal.Internal
            public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
                return connectionPool.connectionBecameIdle(realConnection);
            }

            @Override // okhttp3.internal.Internal
            public final boolean equalsNonHost(Address address, Address address2) {
                return address.equalsNonHost(address2);
            }

            @Override // okhttp3.internal.Internal
            public final Call newWebSocketCall(OkHttpClient okHttpClient, Request request) {
                return RealCall.newRealCall(okHttpClient, request, true);
            }

            @Override // okhttp3.internal.Internal
            public final IOException timeoutExit(Call call, IOException iOException) {
                return ((RealCall) call).timeoutExit(iOException);
            }

            @Override // okhttp3.internal.Internal
            public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
                connectionSpec.apply(sSLSocket, z);
            }

            @Override // okhttp3.internal.Internal
            public final void addLenient(Headers.Builder builder, String str, String str2) {
                builder.addLenient(str, str2);
            }

            @Override // okhttp3.internal.Internal
            public final Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                return connectionPool.deduplicate(address, streamAllocation);
            }

            @Override // okhttp3.internal.Internal
            public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
                return connectionPool.get(address, streamAllocation, route);
            }
        };
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(Request request) {
        return RealCall.newRealCall(this, request, false);
    }

    private static SSLSocketFactory newSslSocketFactory(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContext = Platform.get().getSSLContext();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw Util.assertionError("No System TLS", e2);
        }
    }

    OkHttpClient(Builder builder) {
        boolean z;
        this.dispatcher = builder.dispatcher;
        this.proxy = builder.proxy;
        this.protocols = builder.protocols;
        List<ConnectionSpec> list = builder.connectionSpecs;
        this.connectionSpecs = list;
        this.interceptors = Util.immutableList(builder.interceptors);
        this.networkInterceptors = Util.immutableList(builder.networkInterceptors);
        this.eventListenerFactory = builder.eventListenerFactory;
        this.proxySelector = builder.proxySelector;
        this.cookieJar = builder.cookieJar;
        this.cache = builder.cache;
        this.internalCache = builder.internalCache;
        this.socketFactory = builder.socketFactory;
        Iterator<ConnectionSpec> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ConnectionSpec next = it.next();
                if (z || next.isTls()) {
                    z = true;
                }
            }
        }
        if (builder.sslSocketFactory != null || !z) {
            this.sslSocketFactory = builder.sslSocketFactory;
            this.certificateChainCleaner = builder.certificateChainCleaner;
        } else {
            X509TrustManager platformTrustManager = Util.platformTrustManager();
            this.sslSocketFactory = newSslSocketFactory(platformTrustManager);
            this.certificateChainCleaner = CertificateChainCleaner.get(platformTrustManager);
        }
        if (this.sslSocketFactory != null) {
            Platform.get().configureSslSocketFactory(this.sslSocketFactory);
        }
        this.hostnameVerifier = builder.hostnameVerifier;
        this.certificatePinner = builder.certificatePinner.withCertificateChainCleaner(this.certificateChainCleaner);
        this.proxyAuthenticator = builder.proxyAuthenticator;
        this.authenticator = builder.authenticator;
        this.connectionPool = builder.connectionPool;
        this.dns = builder.dns;
        this.followSslRedirects = builder.followSslRedirects;
        this.followRedirects = builder.followRedirects;
        this.retryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.callTimeout = builder.callTimeout;
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.writeTimeout = builder.writeTimeout;
        this.pingInterval = builder.pingInterval;
        if (this.interceptors.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.interceptors);
        } else if (this.networkInterceptors.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.networkInterceptors);
        }
    }

    @Override // okhttp3.WebSocket.Factory
    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random(), (long) this.pingInterval);
        realWebSocket.connect(this);
        return realWebSocket;
    }
}
