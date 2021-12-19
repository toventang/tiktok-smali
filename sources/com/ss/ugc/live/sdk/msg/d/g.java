package com.ss.ugc.live.sdk.msg.d;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.msg.b.b;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f154189a = new g();

    private g() {
    }

    static {
        Covode.recordClassIndex(102828);
    }

    public static final String a(SdkUplinkPacket sdkUplinkPacket) {
        Map<String, String> map;
        String str;
        if (sdkUplinkPacket == null || (map = sdkUplinkPacket.headers) == null || (str = map.get("X-Tt-Logid")) == null) {
            return "";
        }
        return str;
    }

    public static final String a(PayloadItem payloadItem) {
        List<b> headers;
        T t;
        if (!(payloadItem == null || (headers = payloadItem.getHeaders()) == null)) {
            Iterator<T> it = headers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.f154106a, (Object) "compress_type")) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.f154107b;
            }
        }
        return null;
    }
}
