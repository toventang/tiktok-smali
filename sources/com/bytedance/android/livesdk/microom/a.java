package com.bytedance.android.livesdk.microom;

import com.bytedance.android.live.j.c;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class a implements com.bytedance.android.live.j.a {
    static {
        Covode.recordClassIndex(11262);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomAnchorTimeControlWidget() {
        return MicRoomAnchorTimeControlWidget.class;
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceEnterWidget() {
        return MicRoomAudienceEnterWidget.class;
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomAudienceExitWidget() {
        return MicRoomAudienceExitWidget.class;
    }

    @Override // com.bytedance.android.live.j.a
    public Class<? extends LiveRecyclableWidget> getMicRoomBackupTipsWidget() {
        return MicRoomBackUpTipsWidget.class;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoomForAnchorNow() {
        return isMicRoomForAnchor((Room) DataChannelGlobal.f34575d.b(ac.class));
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoomForCurrentRoom() {
        return isMicRoomForAudience((Room) DataChannelGlobal.f34575d.b(ac.class));
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicAudience() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoom() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return false;
        }
        try {
            if (room.getOwner() != null) {
                long ownerUserId = room.getOwnerUserId();
                f b2 = u.a().b();
                if (b2 == null || ownerUserId != b2.c()) {
                    return isMicRoomForAudience(room);
                }
                return isMicRoomForAnchor(room);
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicRoomForRoom(Room room) {
        return isMicRoomForAudience(room);
    }

    private final boolean isMicRoomForAudience(Room room) {
        if (room == null || room.roomLayout != 2) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.j.a
    public boolean isMicAudienceForRoom(Room room) {
        if (room != null) {
            return room.isOfficialChannel();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r10 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r10.roomLayout != 2) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isMicRoomForAnchor(com.bytedance.android.livesdkapi.depend.model.live.Room r10) {
        /*
            r9 = this;
            long r7 = com.bytedance.android.livesdk.utils.a.a.a()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r0
            r6 = 1
            r5 = 0
            if (r10 == 0) goto L_0x002b
            com.bytedance.android.livesdk.model.aq r2 = r10.officialChannelInfo
            if (r2 == 0) goto L_0x001a
            long r3 = r2.f18980c
            r0 = 10
            long r3 = r3 - r0
            long r1 = r2.f18981d
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
        L_0x001a:
            r2 = 0
            if (r10 == 0) goto L_0x0022
        L_0x001d:
            int r1 = r10.roomLayout
            r0 = 2
            if (r1 == r0) goto L_0x0024
        L_0x0022:
            if (r2 == 0) goto L_0x002b
        L_0x0024:
            return r6
        L_0x0025:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x001a
            r2 = 1
            goto L_0x001d
        L_0x002b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.a.isMicRoomForAnchor(com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    @Override // com.bytedance.android.live.j.a
    public void jumpRoom(long j2, boolean z) {
        com.bytedance.android.livesdk.an.a.a().a(new c(j2, z));
    }
}
