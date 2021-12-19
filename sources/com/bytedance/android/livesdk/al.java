package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.msg.b.b;
import h.f.b.l;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public final class al {

    /* renamed from: a  reason: collision with root package name */
    public static final al f13939a = new al();

    private al() {
    }

    static {
        Covode.recordClassIndex(7729);
    }

    public static final List<b> a(LiveWsMessage liveWsMessage) {
        List<LiveWsMessage.MsgHeader> list;
        ArrayList arrayList = new ArrayList();
        if (!(liveWsMessage == null || (list = liveWsMessage.f23387f) == null)) {
            for (T t : list) {
                l.b(t, "");
                arrayList.add(new b(t.f23393a, t.f23394b));
            }
        }
        return arrayList;
    }

    public static final byte[] a(PayloadItem payloadItem) {
        MethodCollector.i(8712);
        if (payloadItem == null) {
            byte[] bArr = new byte[1];
            MethodCollector.o(8712);
            return bArr;
        }
        byte[] payload = payloadItem.getPayload();
        if (l.a((Object) payloadItem.getCompressType(), (Object) "gzip")) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(payload);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            o.a(byteArrayInputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byteArrayInputStream.close();
            l.b(byteArray, "");
            MethodCollector.o(8712);
            return byteArray;
        }
        l.b(payload, "");
        MethodCollector.o(8712);
        return payload;
    }
}
