package com.bytedance.android.livesdk.model.message.tracking;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;

public class IdMessage extends EventTrackingMessage {
    public final long messageId;

    static {
        Covode.recordClassIndex(11699);
    }

    public static IdMessage from(a aVar) {
        return new IdMessage(aVar.L.getWsMethod(), !aVar.f13611c, aVar.getMessageId());
    }

    IdMessage(String str, boolean z, long j2) {
        super(str, z);
        this.messageId = j2;
    }
}
