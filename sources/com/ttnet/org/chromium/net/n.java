package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

final class n extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final ProxyChangeListener f155832a;

    static {
        Covode.recordClassIndex(103547);
    }

    n(ProxyChangeListener proxyChangeListener) {
        this.f155832a = proxyChangeListener;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            ProxyChangeListener proxyChangeListener = this.f155832a;
            proxyChangeListener.a(new o(proxyChangeListener));
        }
    }
}
