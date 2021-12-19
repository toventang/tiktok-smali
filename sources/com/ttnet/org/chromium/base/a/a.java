package com.ttnet.org.chromium.base.a;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(103287);
    }

    public static long a(Network network) {
        return network.getNetworkHandle();
    }

    public static Network b(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }

    public static Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getBoundNetworkForProcess();
    }

    public static NetworkInfo b(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public static NetworkInfo a(ConnectivityManager connectivityManager, Network network) {
        return b(connectivityManager, network);
    }
}
