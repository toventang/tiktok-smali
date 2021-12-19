package com.bytedance.android.livesdk.browser.jsbridge.b;

import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(8006);
    }

    public static String a(String str) {
        String str2 = "?";
        if (str.indexOf(str2) > 0) {
            str2 = "&";
        }
        return str + str2 + "live_sdk_version=" + ((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getVersionCode();
    }
}
