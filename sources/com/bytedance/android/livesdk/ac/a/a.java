package com.bytedance.android.livesdk.ac.a;

import com.bytedance.android.live.e;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.google.gson.p;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageConverter;

public final class a implements IMessageConverter {
    static {
        Covode.recordClassIndex(7532);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageConverter
    public final IMessage convert(String str, String str2, long j2) {
        Class<? extends com.bytedance.android.livesdk.ac.b.a> messageClass = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).getMessageClass(str);
        if (messageClass == null) {
            return null;
        }
        try {
            com.bytedance.android.livesdk.ac.b.a aVar = (com.bytedance.android.livesdk.ac.b.a) e.a.f9628b.a(str2, (Class) messageClass);
            aVar.M = j2;
            return aVar;
        } catch (p e2) {
            com.bytedance.android.live.core.c.a.b(e2.toString());
            return null;
        }
    }
}
