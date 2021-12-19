package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.livesdk.j.as;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHashTagAnchorShowEntrance;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class o {
    static {
        Covode.recordClassIndex(4429);
    }

    public static final boolean a(DataChannel dataChannel) {
        Object obj;
        if (!LiveHashTagAnchorShowEntrance.INSTANCE.getValue()) {
            return false;
        }
        if (dataChannel != null) {
            obj = dataChannel.b(as.class);
        } else {
            obj = null;
        }
        if (l.a(obj, (Object) true)) {
            return true;
        }
        return false;
    }
}
