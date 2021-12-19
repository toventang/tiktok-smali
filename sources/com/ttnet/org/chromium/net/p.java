package com.ttnet.org.chromium.net;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.ProxyChangeListener;

final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ProxyChangeListener.ProxyReceiver f155834a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f155835b;

    static {
        Covode.recordClassIndex(103549);
    }

    p(ProxyChangeListener.ProxyReceiver proxyReceiver, Intent intent) {
        this.f155834a = proxyReceiver;
        this.f155835b = intent;
    }

    public final void run() {
        ProxyChangeListener.this.a(ProxyChangeListener.ProxyReceiver.a(this.f155835b));
    }
}
