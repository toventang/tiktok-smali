package com.ss.android.ugc.aweme.net.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.api.e;
import com.ss.android.ugc.aweme.logger.a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

public final class d extends EventListener {
    static {
        Covode.recordClassIndex(72203);
    }

    @Override // okhttp3.EventListener
    public final void requestBodyStart(Call call) {
        super.requestBodyStart(call);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersStart(Call call) {
        super.requestHeadersStart(call);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void responseBodyStart(Call call) {
        super.responseBodyStart(call);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersStart(Call call) {
        super.responseHeadersStart(call);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        super.callEnd(call);
        if (a(call)) {
            a.b.f109011a.b("feed_ok_connection_to_end", false);
        }
        System.currentTimeMillis();
    }

    private static boolean a(Call call) {
        if (call == null || call.request() == null || call.request().url() == null || !e.a(call.request().url().toString())) {
            return false;
        }
        return true;
    }

    @Override // okhttp3.EventListener
    public final void callStart(Call call) {
        super.callStart(call);
        if (a(call)) {
            a.b.f109011a.a("feed_boot_to_ok_start", System.currentTimeMillis() - a.b.f109011a.f109007h);
            a.b.f109011a.a("feed_ok_start_to_security_interceptor", false);
            a.b.f109011a.a("feed_ok_start_to_connection", false);
        }
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void requestBodyEnd(Call call, long j2) {
        super.requestBodyEnd(call, j2);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void requestHeadersEnd(Call call, Request request) {
        super.requestHeadersEnd(call, request);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void responseBodyEnd(Call call, long j2) {
        super.responseBodyEnd(call, j2);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void responseHeadersEnd(Call call, Response response) {
        super.responseHeadersEnd(call, response);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        if (a(call)) {
            a.b.f109011a.b("feed_ok_start_to_connection", false);
            a.b.f109011a.a("feed_ok_connection_to_end", false);
            a.b.f109011a.b("feed_ok_security_interceptor_to_connection", false);
        }
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        System.currentTimeMillis();
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        System.currentTimeMillis();
    }
}
