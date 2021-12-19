package com.bytedance.android.live.publicscreen.a.e;

import com.bytedance.android.live.publicscreen.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;

public interface a {
    static {
        Covode.recordClassIndex(6711);
    }

    <MESSAGE extends IMessage> void a(Class<MESSAGE> cls, b<MESSAGE> bVar);
}
