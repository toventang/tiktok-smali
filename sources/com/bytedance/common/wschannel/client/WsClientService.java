package com.bytedance.common.wschannel.client;

import android.content.Intent;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.b.b;
import com.bytedance.common.wschannel.b.c;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import org.json.JSONObject;

public class WsClientService extends a {
    static {
        Covode.recordClassIndex(16009);
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public final void b(WsChannelMsg wsChannelMsg) {
    }

    @Override // com.bytedance.common.wschannel.client.a
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    @Override // com.bytedance.common.wschannel.client.a, com.bytedance.common.wschannel.client.c.a
    public final void a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null) {
            try {
                e listener = WsConstants.getListener(wsChannelMsg.f27304m);
                if (listener != null) {
                    listener.a(wsChannelMsg);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public final void a(int i2, c cVar) {
        WsConstants.setConnectionState(i2, cVar);
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public final void a(b bVar, JSONObject jSONObject) {
        e listener = WsConstants.getListener(bVar.f27018c);
        if (listener != null) {
            listener.a(bVar, jSONObject);
        }
    }
}
