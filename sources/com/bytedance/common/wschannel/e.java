package com.bytedance.common.wschannel;

import com.bytedance.common.wschannel.b.b;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class e implements c.a {
    static {
        Covode.recordClassIndex(16040);
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public final void b(WsChannelMsg wsChannelMsg) {
        k.a(wsChannelMsg.f27304m);
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public final void a(WsChannelMsg wsChannelMsg) {
        i a2;
        if (wsChannelMsg != null && (a2 = k.a(wsChannelMsg.f27304m)) != null && a2.f27218b != null) {
            a2.f27218b.a(wsChannelMsg);
        }
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public final void a(b bVar, JSONObject jSONObject) {
        i a2 = k.a(bVar.f27018c);
        if (a2 != null && a2.f27218b != null) {
            a2.f27218b.a(bVar, jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public final void a(int i2, com.bytedance.common.wschannel.b.c cVar) {
        i a2 = k.a(i2);
        if (a2 != null) {
            a2.f27222f = cVar;
            if (cVar == com.bytedance.common.wschannel.b.c.CONNECT_CLOSED && a2.f27223g.get()) {
                k.f27238b.remove(Integer.valueOf(a2.f27217a.f26993a));
            }
        }
    }
}
