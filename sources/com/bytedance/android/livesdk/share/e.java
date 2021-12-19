package com.bytedance.android.livesdk.share;

import com.bytedance.android.live.share.b;
import com.bytedance.android.livesdk.j.dl;
import com.bytedance.android.livesdk.model.message.a.a;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;

public final class e implements b, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    private DataChannel f21453a;

    /* renamed from: b  reason: collision with root package name */
    private IMessageManager f21454b;

    static {
        Covode.recordClassIndex(12632);
    }

    @Override // com.bytedance.android.live.share.b
    public final void a() {
        IMessageManager iMessageManager = this.f21454b;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f21454b = null;
        this.f21453a = null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        DataChannel dataChannel;
        if (iMessage instanceof ce) {
            ce ceVar = (ce) iMessage;
            if (ceVar.f19470a == 3 && (dataChannel = this.f21453a) != null) {
                dataChannel.b(dl.class, Integer.valueOf(ceVar.f19475j));
            }
        }
    }

    @Override // com.bytedance.android.live.share.b
    public final void a(DataChannel dataChannel, IMessageManager iMessageManager, int i2) {
        l.d(dataChannel, "");
        dataChannel.b(dl.class, Integer.valueOf(i2));
        this.f21453a = dataChannel;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(a.SOCIAL.getIntType(), this);
            this.f21454b = iMessageManager;
        }
    }
}
