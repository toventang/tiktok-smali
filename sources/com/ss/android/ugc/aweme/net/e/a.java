package com.ss.android.ugc.aweme.net.e;

import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(72163);
    }

    public static NetworkInfo a() {
        try {
            return (NetworkInfo) Class.forName("android.net.NetworkInfo").getConstructor(Integer.TYPE, Integer.TYPE, String.class, String.class).newInstance(1, 0, "CONNECTED", "CONNECTED");
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return null;
        }
    }
}
