package com.ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.b.c;
import h.f.b.l;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f87583a = new k();

    private k() {
    }

    static {
        Covode.recordClassIndex(55053);
    }

    public static Integer a(Throwable th) {
        int i2;
        Integer num;
        l.d(th, "");
        try {
            if (th instanceof c) {
                return Integer.valueOf(((c) th).getStatusCode());
            }
            if (!(th instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c)) {
                return null;
            }
            String requestLog = ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getRequestLog();
            if (requestLog != null) {
                JSONObject optJSONObject = new JSONObject(requestLog).optJSONObject("base");
                if (optJSONObject != null) {
                    num = Integer.valueOf(optJSONObject.optInt("net_error"));
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                    return Integer.valueOf(i2);
                }
            }
            i2 = ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getStatusCode();
            return Integer.valueOf(i2);
        } catch (Exception unused) {
            return null;
        }
    }
}
