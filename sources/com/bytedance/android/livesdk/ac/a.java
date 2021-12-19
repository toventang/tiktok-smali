package com.bytedance.android.livesdk.ac;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.e.c;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class a implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public c f13607a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bytedance.android.livesdk.ui.a f13608b;

    /* renamed from: c  reason: collision with root package name */
    private final Room f13609c;

    static {
        Covode.recordClassIndex(7531);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof bv) {
            bv bvVar = (bv) iMessage;
            if (bvVar.L == com.bytedance.android.livesdk.model.message.a.a.REMIND && 5 == bvVar.f19368f) {
                if (this.f13607a == null) {
                    this.f13607a = ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).createCoverController(this.f13608b, this.f13609c);
                }
                this.f13607a.a(bvVar);
            }
        }
    }

    public a(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel) {
        this.f13608b = aVar;
        this.f13609c = (Room) dataChannel.b(df.class);
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.REMIND.getIntType(), this);
        }
    }
}
