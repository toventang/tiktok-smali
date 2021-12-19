package com.bytedance.android.live.j;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface a extends com.bytedance.android.live.base.a {

    /* renamed from: com.bytedance.android.live.j.a$a  reason: collision with other inner class name */
    public static final class C0154a {
        static {
            Covode.recordClassIndex(5119);
        }
    }

    static {
        Covode.recordClassIndex(5118);
    }

    Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget();

    Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget();

    Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget();

    Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget();

    boolean isMicAudience();

    boolean isMicAudienceForRoom(Room room);

    boolean isMicRoom();

    boolean isMicRoomForAnchorNow();

    boolean isMicRoomForCurrentRoom();

    boolean isMicRoomForRoom(Room room);

    void jumpRoom(long j2, boolean z);
}
