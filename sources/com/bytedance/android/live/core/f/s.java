package com.bytedance.android.live.core.f;

import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class s {
    static {
        Covode.recordClassIndex(4664);
    }

    public static boolean a(DataChannel dataChannel) {
        boolean z;
        if (dataChannel == null) {
            return false;
        }
        Room room = (Room) dataChannel.b(df.class);
        if (room == null || !(room.getStreamType() == i.VIDEO || room.getStreamType() == i.SCREEN_RECORD)) {
            z = false;
        } else {
            z = true;
        }
        if (!((Boolean) dataChannel.b(ee.class)).booleanValue() || !z) {
            return false;
        }
        return true;
    }

    public static boolean b(DataChannel dataChannel) {
        Room room;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null || (room.getStreamType() != i.VIDEO && room.getStreamType() != i.THIRD_PARTY && room.getStreamType() != i.SCREEN_RECORD)) {
            return false;
        }
        return true;
    }
}
