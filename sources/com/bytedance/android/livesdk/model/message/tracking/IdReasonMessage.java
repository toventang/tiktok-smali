package com.bytedance.android.livesdk.model.message.tracking;

import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.covode.number.Covode;

public class IdReasonMessage extends IdMessage {
    public final String reason;

    static {
        Covode.recordClassIndex(11700);
    }

    public static IdReasonMessage from(a aVar, String str) {
        return new IdReasonMessage(aVar.L.getWsMethod(), aVar.f13611c, aVar.getMessageId(), str);
    }

    IdReasonMessage(String str, boolean z, long j2, String str2) {
        super(str, z, j2);
        this.reason = str2;
    }
}
