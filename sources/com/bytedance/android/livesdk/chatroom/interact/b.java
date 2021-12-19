package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.Client;
import com.ss.avframework.livestreamv2.core.LiveCore;

public interface b {
    static {
        Covode.recordClassIndex(8607);
    }

    Client a(LiveCore.InteractConfig interactConfig);
}
