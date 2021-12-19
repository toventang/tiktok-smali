package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.chatroom.view.a;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.model.message.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashMap;

public final class k implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    private a f15362a;

    /* renamed from: b  reason: collision with root package name */
    private DataChannel f15363b;

    /* renamed from: c  reason: collision with root package name */
    private IMessageManager f15364c;

    static {
        Covode.recordClassIndex(8490);
    }

    public final void a() {
        IMessageManager iMessageManager = this.f15364c;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f15362a = null;
    }

    public k(DataChannel dataChannel) {
        this.f15363b = dataChannel;
    }

    public final void a(a aVar) {
        this.f15362a = aVar;
        IMessageManager iMessageManager = (IMessageManager) this.f15363b.b(cg.class);
        this.f15364c = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.CONTROL.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        a aVar = this.f15362a;
        if (aVar != null) {
            aVar.a((n) iMessage);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(((n) iMessage).f19656a));
        c.a("ttlive_control_message_status", 1, hashMap);
    }
}
