package com.bytedance.common.wschannel.a;

import com.bytedance.common.wschannel.model.Frame;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.squareup.wire.Wire;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.i;

final class c implements a {
    static {
        Covode.recordClassIndex(15939);
    }

    c() {
    }

    @Override // com.bytedance.common.wschannel.a.a
    public final WsChannelMsg a(byte[] bArr) {
        Frame decode = Frame.ADAPTER.decode(bArr);
        long longValue = ((Long) Wire.get(decode.seqid, Frame.DEFAULT_SEQID)).longValue();
        long longValue2 = ((Long) Wire.get(decode.logid, Frame.DEFAULT_LOGID)).longValue();
        int intValue = ((Integer) Wire.get(decode.service, Frame.DEFAULT_SERVICE)).intValue();
        int intValue2 = ((Integer) Wire.get(decode.method, Frame.DEFAULT_METHOD)).intValue();
        List<Frame.ExtendedEntry> list = (List) Wire.get(decode.headers, Collections.emptyList());
        String str = (String) Wire.get(decode.payload_encoding, "");
        String str2 = (String) Wire.get(decode.payload_type, "");
        byte[] byteArray = ((i) Wire.get(decode.payload, Frame.DEFAULT_PAYLOAD)).toByteArray();
        WsChannelMsg wsChannelMsg = new WsChannelMsg();
        wsChannelMsg.f27296e = longValue2;
        wsChannelMsg.f27295d = longValue;
        wsChannelMsg.f27297f = intValue;
        wsChannelMsg.f27298g = intValue2;
        if (list != null && list.size() >= 0) {
            ArrayList arrayList = new ArrayList();
            for (Frame.ExtendedEntry extendedEntry : list) {
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.f27305a = (String) Wire.get(extendedEntry.key, "");
                msgHeader.f27306b = (String) Wire.get(extendedEntry.value, "");
                arrayList.add(msgHeader);
            }
            wsChannelMsg.f27299h = arrayList;
        }
        wsChannelMsg.f27300i = str;
        wsChannelMsg.f27301j = str2;
        wsChannelMsg.f27302k = byteArray;
        return wsChannelMsg;
    }

    @Override // com.bytedance.common.wschannel.a.a
    public final byte[] a(WsChannelMsg wsChannelMsg) {
        i iVar;
        if (wsChannelMsg == null) {
            return null;
        }
        if (wsChannelMsg.a() != null) {
            iVar = i.of(wsChannelMsg.a());
        } else {
            iVar = i.EMPTY;
        }
        Frame.Builder method = new Frame.Builder().logid(Long.valueOf(wsChannelMsg.f27296e)).seqid(Long.valueOf(wsChannelMsg.f27295d)).service(Integer.valueOf(wsChannelMsg.f27297f)).payload_encoding(wsChannelMsg.f27300i).payload_type(wsChannelMsg.f27301j).payload(iVar).method(Integer.valueOf(wsChannelMsg.f27298g));
        List<WsChannelMsg.MsgHeader> list = wsChannelMsg.f27299h;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (WsChannelMsg.MsgHeader msgHeader : list) {
                arrayList.add(new Frame.ExtendedEntry.Builder().key(msgHeader.f27305a).value(msgHeader.f27306b).build());
            }
        }
        if (!arrayList.isEmpty()) {
            method.headers(arrayList);
        }
        return Frame.ADAPTER.encode(method.build());
    }
}
