package com.ss.bduploader;

import com.bytedance.covode.number.Covode;

public interface BDNetworkRouterListener {
    static {
        Covode.recordClassIndex(100650);
    }

    int networkRouteCheckNetState(int i2, int i3);

    void onRouteContext(int i2, int i3, String str);
}
