package com.bytedance.android.livesdk.hashtag;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.chatroom.f.c;
import com.bytedance.android.livesdk.j.aq;
import com.bytedance.android.livesdk.j.ar;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.message.a.a;
import com.bytedance.android.livesdk.model.message.ac;
import com.bytedance.android.livesdk.model.message.c.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class MessageStationWidget extends LiveRecyclableWidget implements au, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    private IMessageManager f18120a;

    static {
        Covode.recordClassIndex(10055);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.f18120a = (IMessageManager) this.dataChannel.b(cg.class);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager = this.f18120a;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(a.HASHTAG.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        b bVar;
        Hashtag hashtag;
        if (iMessage instanceof ac) {
            ac acVar = (ac) iMessage;
            com.bytedance.android.livesdkapi.h.b bVar2 = acVar.O;
            if (!(bVar2 == null || (bVar = bVar2.f23218j) == null || (hashtag = acVar.f19122a) == null)) {
                hashtag.title = c.a(bVar, "").toString();
            }
            Hashtag hashtag2 = acVar.f19122a;
            if (hashtag2 != null) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.b(aq.class, hashtag2);
                }
                DataChannelGlobal.f34575d.a(ar.class, hashtag2);
            }
        }
    }
}
