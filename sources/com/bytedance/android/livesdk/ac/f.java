package com.bytedance.android.livesdk.ac;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class f implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    c f13629a;

    static {
        Covode.recordClassIndex(7544);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        c cVar = this.f13629a;
        if (cVar != null) {
            cVar.a((a) iMessage);
        }
    }
}
