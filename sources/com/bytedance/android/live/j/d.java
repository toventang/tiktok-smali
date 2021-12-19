package com.bytedance.android.live.j;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class d implements a {
    static {
        Covode.recordClassIndex(5122);
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicAudience() {
        return false;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicAudienceForRoom(Room room) {
        return false;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoomForAnchorNow() {
        return false;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoomForCurrentRoom() {
        return false;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoomForRoom(Room room) {
        return false;
    }

    @Override // com.bytedance.android.live.j.a
    public void jumpRoom(long j2, boolean z) {
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }
}
