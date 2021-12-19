package com.ttnet.org.chromium.net;

import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.c;
import com.ttnet.org.chromium.net.ProxyChangeListener;

final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ProxyChangeListener f155833a;

    static {
        Covode.recordClassIndex(103548);
    }

    o(ProxyChangeListener proxyChangeListener) {
        this.f155833a = proxyChangeListener;
    }

    public final void run() {
        ProxyChangeListener proxyChangeListener = this.f155833a;
        ProxyInfo defaultProxy = ((ConnectivityManager) ProxyChangeListener.a(c.f155223a, "connectivity")).getDefaultProxy();
        proxyChangeListener.a(defaultProxy == null ? ProxyChangeListener.a.f155436e : ProxyChangeListener.a.a(defaultProxy));
    }
}
