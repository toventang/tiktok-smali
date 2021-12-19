package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.model.message.q;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;

public final class n extends r<a> implements OnMessageListener {

    public interface a extends bq {
        static {
            Covode.recordClassIndex(8496);
        }

        void a(q qVar);
    }

    static {
        Covode.recordClassIndex(8495);
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        super.a((bq) aVar);
        IMessageManager iMessageManager = this.x;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.DONATION_INFO.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        l.d(iMessage, "");
        if ((iMessage instanceof com.bytedance.android.livesdk.ac.b.a) && ((com.bytedance.android.livesdkapi.h.a) iMessage).L == com.bytedance.android.livesdk.model.message.a.a.DONATION_INFO) {
            q qVar = (q) iMessage;
            a aVar = (a) this.y;
            if (aVar != null) {
                aVar.a(qVar);
            }
        }
    }
}
