package com.bytedance.sdk.b.d.e;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.a.c;
import com.bytedance.sdk.b.c.a;
import java.util.Map;

public abstract class b<T> extends a<T> {
    static {
        Covode.recordClassIndex(26688);
    }

    public void run() {
        String str = this.f43593d;
        Map<String, String> map = this.f43594e;
        a.a("request url:" + str + "; request params:" + com.bytedance.sdk.b.f.a.a(map));
        String a2 = com.bytedance.sdk.b.f.a.a(map);
        if (!TextUtils.isEmpty(a2)) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            } else if (str.endsWith("?")) {
                str = str + a2;
            } else {
                str = str + "?" + a2;
            }
        }
        if (!URLUtil.isValidUrl(str)) {
            a((Exception) new IllegalArgumentException("target url is invalid"));
            return;
        }
        c b2 = com.bytedance.sdk.b.a.b();
        if (b2 == null && (b2 = com.bytedance.sdk.b.d.c.a.a()) == null) {
            a((Exception) new IllegalStateException("do not have a network executor"));
            return;
        }
        try {
            a((Object) a(b2.a(this.f43598i, str)));
        } catch (Exception e2) {
            a(e2);
            a.a("response exception:" + e2.toString());
        }
    }

    public b(String str, Map<String, String> map) {
        super(str, map);
    }
}
