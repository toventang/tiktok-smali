package okhttp3.logging;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    /* renamed from: okhttp3.logging.LoggingEventListener$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(106337);
        }
    }

    static {
        Covode.recordClassIndex(106336);
    }

    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        static {
            Covode.recordClassIndex(106338);
        }

        public Factory() {
            this(HttpLoggingInterceptor.Logger.DEFAULT);
        }

        public Factory(HttpLoggingInterceptor.Logger logger2) {
            this.logger = logger2;
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            return new LoggingEventListener(this.logger, null);
        }
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger2) {
        this.logger = logger2;
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public final void requestBodyStart(Call call) {
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersStart(Call call) {
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(Call call) {
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(Call call) {
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        logWithTime("secureConnectStart");
    }

    @Override // okhttp3.EventListener
    public final void callStart(Call call) {
        this.startNs = System.nanoTime();
        logWithTime("callStart: " + call.request());
    }

    private void logWithTime(String str) {
        this.logger.log("[" + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs) + " ms] " + str);
    }

    /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger2, AnonymousClass1 r2) {
        this(logger2);
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(Call call, Connection connection) {
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersEnd(Call call, Request request) {
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        logWithTime("secureConnectEnd");
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        logWithTime("callFailed: ".concat(String.valueOf(iOException)));
    }

    @Override // okhttp3.EventListener
    public final void connectionAcquired(Call call, Connection connection) {
        logWithTime("connectionAcquired: ".concat(String.valueOf(connection)));
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        logWithTime("dnsStart: ".concat(String.valueOf(str)));
    }

    @Override // okhttp3.EventListener
    public final void requestBodyEnd(Call call, long j2) {
        logWithTime("requestBodyEnd: byteCount=".concat(String.valueOf(j2)));
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(Call call, long j2) {
        logWithTime("responseBodyEnd: byteCount=".concat(String.valueOf(j2)));
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(Call call, Response response) {
        logWithTime("responseHeadersEnd: ".concat(String.valueOf(response)));
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List<InetAddress> list) {
        logWithTime("dnsEnd: ".concat(String.valueOf(list)));
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        logWithTime("connectStart: " + inetSocketAddress + " " + proxy);
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        logWithTime("connectEnd: ".concat(String.valueOf(protocol)));
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        logWithTime("connectFailed: " + protocol + " " + iOException);
    }
}
