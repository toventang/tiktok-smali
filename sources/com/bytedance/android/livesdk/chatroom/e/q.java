package com.bytedance.android.livesdk.chatroom.e;

import com.bytedance.android.live.n.y;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.model.message.ci;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a.a;
import com.bytedance.ies.a.b;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class q extends b<a> implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    private IMessageManager f15384a;

    /* renamed from: b  reason: collision with root package name */
    private DataChannel f15385b;

    static {
        Covode.recordClassIndex(8503);
    }

    @Override // com.bytedance.ies.a.b
    public final void b() {
        super.b();
        IMessageManager iMessageManager = this.f15384a;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public q(DataChannel dataChannel) {
        this.f15385b = dataChannel;
    }

    @Override // com.bytedance.ies.a.b
    public final void a(a aVar) {
        super.a(aVar);
        IMessageManager iMessageManager = (IMessageManager) this.f15385b.b(cg.class);
        this.f15384a = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.USER_STATS.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        ci ciVar;
        if (iMessage != null && (ciVar = (ci) iMessage) != null && ciVar.f19493f == u.a().b().c() && 1 == ciVar.f19494g) {
            u.a().b().i().a_(new g());
            this.f15385b.c(y.class);
        }
    }
}
