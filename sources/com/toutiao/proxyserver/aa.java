package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

final class aa extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Proxy> f154765a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b  reason: collision with root package name */
    private final ProxySelector f154766b = ProxySelector.getDefault();

    /* renamed from: c  reason: collision with root package name */
    private final String f154767c;

    /* renamed from: d  reason: collision with root package name */
    private final int f154768d;

    static {
        Covode.recordClassIndex(103098);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("URI can't be null");
        } else if (!this.f154767c.equalsIgnoreCase(uri.getHost()) || this.f154768d != uri.getPort()) {
            return this.f154766b.select(uri);
        } else {
            return f154765a;
        }
    }

    aa(String str, int i2) {
        this.f154767c = str;
        this.f154768d = i2;
    }

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f154766b.connectFailed(uri, socketAddress, iOException);
    }
}
