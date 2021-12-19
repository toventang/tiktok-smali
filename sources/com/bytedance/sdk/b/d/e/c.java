package com.bytedance.sdk.b.d.e;

import android.webkit.URLUtil;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.a;
import java.util.Map;

public abstract class c<T> extends a<T> {
    static {
        Covode.recordClassIndex(26689);
    }

    public void run() {
        String str = this.f43593d;
        if (!URLUtil.isValidUrl(str)) {
            a((Exception) new IllegalArgumentException("target url is invalid"));
            return;
        }
        com.bytedance.sdk.b.a.c b2 = a.b();
        if (b2 == null && (b2 = com.bytedance.sdk.b.d.c.a.a()) == null) {
            a((Exception) new IllegalStateException("do not have a network executor"));
            return;
        }
        try {
            Map<String, String> map = this.f43594e;
            com.bytedance.sdk.b.c.a.a("request url:" + str + "; request params:" + com.bytedance.sdk.b.f.a.a(map));
            a((Object) a(b2.a(str, map)));
        } catch (Exception e2) {
            a(e2);
            com.bytedance.sdk.b.c.a.a("response exception:" + e2.toString());
        }
    }

    public c(String str, Map<String, String> map) {
        super(str, map);
    }
}
