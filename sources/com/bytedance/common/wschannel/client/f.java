package com.bytedance.common.wschannel.client;

import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.model.a;
import com.bytedance.covode.number.Covode;

public final class f extends b {
    static {
        Covode.recordClassIndex(16019);
    }

    public f(c.a aVar) {
        super(aVar);
    }

    @Override // com.bytedance.common.wschannel.client.d
    public final void a(Intent intent, a aVar) {
        intent.setExtrasClassLoader(WsChannelMsg.class.getClassLoader());
        WsChannelMsg wsChannelMsg = (WsChannelMsg) intent.getParcelableExtra("payload");
        if (!WsConstants.getOptLogic().a().booleanValue()) {
            Message message = new Message();
            message.getData().putParcelable("payload", wsChannelMsg);
            message.getData().setClassLoader(WsChannelMsg.class.getClassLoader());
            Parcelable parcelable = message.getData().getParcelable("payload");
            if (parcelable instanceof WsChannelMsg) {
                wsChannelMsg = (WsChannelMsg) parcelable;
            } else {
                return;
            }
        }
        if (wsChannelMsg != null) {
            Logger.debug();
            if (aVar != null) {
                wsChannelMsg.o = aVar.f27317a;
            }
            this.f27183a.a(wsChannelMsg);
        }
    }
}
