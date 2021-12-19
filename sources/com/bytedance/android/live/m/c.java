package com.bytedance.android.live.m;

import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class c {
    static {
        Covode.recordClassIndex(6582);
    }

    public static final boolean a(DataChannel dataChannel) {
        Room c2 = c(dataChannel);
        if (c2 == null || c2.questionVersion == 0) {
            return false;
        }
        return true;
    }

    public static final Room c(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Room) dataChannel.b(df.class);
        }
        return null;
    }

    public static final boolean b(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        Room c2 = c(dataChannel);
        if (c2 == null || (roomAuthStatus = c2.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableQuestion()) {
            return false;
        }
        return true;
    }
}
