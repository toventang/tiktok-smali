package com.bytedance.android.live.publicscreen.a;

import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;

public interface b<MESSAGE extends IMessage> {
    static {
        Covode.recordClassIndex(6689);
    }

    boolean a(MESSAGE message, g gVar);
}
