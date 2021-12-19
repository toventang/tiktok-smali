package com.ss.android.ugc.aweme.net.h.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.cu;
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

public final class e extends EventListener {
    static {
        Covode.recordClassIndex(72200);
    }

    @Override // okhttp3.EventListener
    public final void callEnd(Call call) {
        super.callEnd(call);
        System.currentTimeMillis();
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
    public final void callStart(Call call) {
        super.callStart(call);
        System.currentTimeMillis();
        a.b.f109011a.a("feed_ok_precon_to_dns", false);
    }

    @Override // okhttp3.EventListener
    public final void secureConnectStart(Call call) {
        super.secureConnectStart(call);
        System.currentTimeMillis();
        a.b.f109011a.b("feed_ok_precon_connect_to_ssl", false);
        a.b.f109011a.a("feed_ok_precon_ssl_duration", false);
    }

    @Override // okhttp3.EventListener
    public final void connectionReleased(Call call, Connection connection) {
        super.connectionReleased(call, connection);
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
    public final void connectionAcquired(Call call, Connection connection) {
        super.connectionAcquired(call, connection);
        System.currentTimeMillis();
        com.ss.android.ugc.aweme.net.h.a.f112351b = true;
    }

    @Override // okhttp3.EventListener
    public final void callFailed(Call call, IOException iOException) {
        super.callFailed(call, iOException);
        System.currentTimeMillis();
        a.b.f109011a.a("feed_ok_pre_connection_result", -2);
        cu.f89727a = true;
    }

    @Override // okhttp3.EventListener
    public final void dnsStart(Call call, String str) {
        super.dnsStart(call, str);
        System.currentTimeMillis();
        a.b.f109011a.b("feed_ok_precon_to_dns", false);
        a.b.f109011a.a("feed_ok_precon_dns_duration", false);
    }

    @Override // okhttp3.EventListener
    public final void secureConnectEnd(Call call, Handshake handshake) {
        super.secureConnectEnd(call, handshake);
        System.currentTimeMillis();
        a.b.f109011a.b("feed_ok_precon_ssl_duration", false);
        a.b.f109011a.a("feed_ok_precon_ssl_to_connect_end", false);
    }

    @Override // okhttp3.EventListener
    public final void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        super.connectStart(call, inetSocketAddress, proxy);
        System.currentTimeMillis();
        a.b.f109011a.b("feed_ok_precon_dns_to_connect", false);
        a.b.f109011a.a("feed_ok_precon_connect_to_ssl", false);
    }

    @Override // okhttp3.EventListener
    public final void dnsEnd(Call call, String str, List<InetAddress> list) {
        super.dnsEnd(call, str, list);
        System.currentTimeMillis();
        a.b.f109011a.b("feed_ok_precon_dns_duration", false);
        a.b.f109011a.a("feed_ok_precon_dns_to_connect", false);
    }

    @Override // okhttp3.EventListener
    public final void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        super.connectEnd(call, inetSocketAddress, proxy, protocol);
        System.currentTimeMillis();
        a.b.f109011a.b("feed_ok_precon_ssl_to_connect_end", false);
        a.b.f109011a.a("feed_ok_pre_connection_result", 1);
    }

    @Override // okhttp3.EventListener
    public final void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        super.connectFailed(call, inetSocketAddress, proxy, protocol, iOException);
        System.currentTimeMillis();
        a.b.f109011a.a("feed_ok_pre_connection_result", -1);
    }
}
