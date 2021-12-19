package com.ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.b;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f112390a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(72244);
    }

    public static final INetwork a() {
        INetwork iNetwork;
        try {
            Object a2 = b.a(INetwork.class, false);
            if (a2 != null) {
                iNetwork = (INetwork) a2;
            } else {
                iNetwork = new NetworkService();
            }
        } catch (Exception unused) {
            iNetwork = null;
        }
        if (iNetwork != null) {
            return iNetwork;
        }
        throw new IllegalStateException("SPI have not got the INetwork instance");
    }
}
