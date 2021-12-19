package com.bytedance.android.livesdkapi.g;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;

public final class a {
    static {
        Covode.recordClassIndex(13753);
    }

    private static void a(EnterRoomConfig enterRoomConfig, Room room) {
        if (room != null && room.getRoomAuthStatus() != null && room.getOwner() != null && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            enterRoomConfig.f23299c.f23322a = e.a.f9628b.b(room);
        }
    }

    public static EnterRoomConfig b(Room room, EnterRoomConfig enterRoomConfig) {
        if (room != null) {
            enterRoomConfig.f23299c.R = room.getId();
            enterRoomConfig.f23299c.S = room.getStreamType();
            enterRoomConfig.f23297a.f23338b = room.buildPullUrl();
            enterRoomConfig.f23297a.f23339c = room.getSdkParams();
            enterRoomConfig.f23297a.f23340d = room.getMultiStreamData();
            enterRoomConfig.f23297a.f23342f = room.getMultiStreamDefaultQualitySdkKey();
            s.a aVar = room.getStreamUrlExtraSafely().n;
            if (aVar != null) {
                enterRoomConfig.f23297a.f23343g = aVar.f23192a;
                enterRoomConfig.f23297a.f23344h = aVar.f23193b;
                enterRoomConfig.f23297a.f23345i = aVar.f23194c;
            }
            enterRoomConfig.f23297a.f23346j = room.getStreamType().ordinal();
            enterRoomConfig.f23298b.f23310b = String.valueOf(room.getOwnerUserId());
        }
        return enterRoomConfig;
    }

    public static EnterRoomConfig a(Room room, EnterRoomConfig enterRoomConfig) {
        if (room != null) {
            enterRoomConfig.f23299c.R = room.getId();
            enterRoomConfig.f23299c.S = room.getStreamType();
            ArrayList<String> arrayList = null;
            if (room.getCover() != null && !h.a(room.getCover().getUrls())) {
                arrayList = new ArrayList<>(room.getCover().getUrls());
            } else if (!(room.getOwner() == null || room.getOwner().getAvatarThumb() == null || h.a(room.getOwner().getAvatarThumb().getUrls()))) {
                arrayList = new ArrayList<>(room.getOwner().getAvatarThumb().getUrls());
            }
            enterRoomConfig.f23299c.y = arrayList;
            enterRoomConfig.f23298b.f23309a = room.getRequestId();
            enterRoomConfig.f23298b.f23315g = room.getLog_pb();
            enterRoomConfig.f23299c.ad = room.getSourceType();
            if (DataChannelGlobal.f34575d.b(ac.class) != null) {
                enterRoomConfig.f23298b.f23319k = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getUserFrom();
            }
            enterRoomConfig.f23299c.z = room.getLabels();
            enterRoomConfig.f23297a.f23338b = room.buildPullUrl();
            enterRoomConfig.f23297a.f23339c = room.getSdkParams();
            enterRoomConfig.f23297a.f23340d = room.getMultiStreamData();
            enterRoomConfig.f23297a.f23342f = room.getMultiStreamDefaultQualitySdkKey();
            s.a aVar = room.getStreamUrlExtraSafely().n;
            if (aVar != null) {
                enterRoomConfig.f23297a.f23343g = aVar.f23192a;
                enterRoomConfig.f23297a.f23344h = aVar.f23193b;
                enterRoomConfig.f23297a.f23345i = aVar.f23194c;
            }
            enterRoomConfig.f23297a.f23346j = room.getStreamType().ordinal();
            enterRoomConfig.f23298b.f23310b = String.valueOf(room.getOwnerUserId());
        }
        return enterRoomConfig;
    }

    public static EnterRoomConfig a(Room room, boolean z) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        if (room != null) {
            enterRoomConfig.f23299c.R = room.getId();
            enterRoomConfig.f23299c.S = room.getStreamType();
            ArrayList<String> arrayList = null;
            if (room.getCover() != null && !h.a(room.getCover().getUrls())) {
                arrayList = new ArrayList<>(room.getCover().getUrls());
            } else if (!(room.getOwner() == null || room.getOwner().getAvatarThumb() == null || h.a(room.getOwner().getAvatarThumb().getUrls()))) {
                arrayList = new ArrayList<>(room.getOwner().getAvatarThumb().getUrls());
            }
            enterRoomConfig.f23299c.y = arrayList;
            enterRoomConfig.f23298b.f23309a = room.getRequestId();
            enterRoomConfig.f23298b.f23315g = room.getLog_pb();
            enterRoomConfig.f23299c.ad = room.getSourceType();
            if (DataChannelGlobal.f34575d.b(ac.class) != null) {
                enterRoomConfig.f23298b.f23319k = ((Room) DataChannelGlobal.f34575d.b(ac.class)).getUserFrom();
            }
            enterRoomConfig.f23299c.z = room.getLabels();
            enterRoomConfig.f23297a.f23338b = room.buildPullUrl();
            enterRoomConfig.f23297a.f23339c = room.getSdkParams();
            enterRoomConfig.f23297a.f23340d = room.getMultiStreamData();
            enterRoomConfig.f23297a.f23342f = room.getMultiStreamDefaultQualitySdkKey();
            s.a aVar = room.getStreamUrlExtraSafely().n;
            if (aVar != null) {
                enterRoomConfig.f23297a.f23343g = aVar.f23192a;
                enterRoomConfig.f23297a.f23344h = aVar.f23193b;
                enterRoomConfig.f23297a.f23345i = aVar.f23194c;
            }
            enterRoomConfig.f23297a.f23346j = room.getStreamType().ordinal();
            enterRoomConfig.f23298b.f23310b = String.valueOf(room.getOwnerUserId());
            if (z) {
                a(enterRoomConfig, room);
            }
        }
        return enterRoomConfig;
    }
}
