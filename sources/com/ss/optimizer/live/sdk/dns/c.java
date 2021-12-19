package com.ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import com.ss.optimizer.live.sdk.a.a.a;
import com.ss.optimizer.live.sdk.a.d;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class c implements Callable<a> {
    static {
        Covode.recordClassIndex(101209);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ a call() {
        String sb;
        if (a.f151691e == null) {
            sb = null;
        } else {
            int i2 = 0;
            StringBuilder sb2 = new StringBuilder("{ \"IpMap\":{");
            for (h hVar : a.f151691e.values()) {
                k kVar = hVar.f151744b;
                if (kVar != null) {
                    if (i2 != 0) {
                        sb2.append(",");
                    }
                    sb2.append(kVar.toString());
                    i2++;
                }
            }
            sb2.append("}}");
            sb = sb2.toString();
        }
        com.ss.optimizer.live.sdk.a.a aVar = d.a().f151669b;
        return new a(new JSONObject(aVar.f151641b.a(com.ss.optimizer.live.sdk.a.a.a(aVar.f151640a + "/video/live/qos/v2/ipSettings", aVar.f151642c), sb.toString().getBytes("UTF-8"), "application/json; charset=utf-8")));
    }
}
