package com.bytedance.android.live.banner;

import android.util.LongSparseArray;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.banner.c;
import com.bytedance.android.livesdk.chatroom.viewmodule.ActivityTopRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.cb;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.h.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public class a implements c, OnMessageListener {
    private final LongSparseArray<DataChannel> mDataChannels = new LongSparseArray<>();
    private final LongSparseArray<ArrayList<c.a>> mOnBannerVisibilityChangeListeners = new LongSparseArray<>();

    static {
        Covode.recordClassIndex(3566);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.banner.c
    public Class<? extends LiveRecyclableWidget> getActivityTopRightBannerWidget() {
        return ActivityTopRightBannerWidget.class;
    }

    @Override // com.bytedance.android.live.banner.c
    public Class<? extends LiveRecyclableWidget> getBottomRightBannerWidget() {
        return BottomRightBannerWidget.class;
    }

    @Override // com.bytedance.android.live.banner.c
    public Class<? extends LiveRecyclableWidget> getTopRightBannerWidget() {
        return TopRightBannerWidget.class;
    }

    @Override // com.bytedance.android.live.banner.c
    public boolean shouldShowBanner(long j2) {
        Room room;
        DataChannel dataChannel = this.mDataChannels.get(j2);
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        return shouldShowBanner(room);
    }

    public boolean shouldShowBanner(Room room) {
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus == null || roomAuthStatus.getBannerState() != 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        IMessage iMessage2;
        b bVar;
        long j2;
        DataChannel dataChannel;
        Room room;
        if (!(iMessage instanceof com.bytedance.android.livesdk.ac.b.a)) {
            iMessage2 = null;
        } else {
            iMessage2 = iMessage;
        }
        com.bytedance.android.livesdk.ac.b.a aVar = (com.bytedance.android.livesdk.ac.b.a) iMessage2;
        if (aVar != null && (bVar = aVar.O) != null && (dataChannel = this.mDataChannels.get((j2 = bVar.f23211c))) != null && (room = (Room) dataChannel.b(df.class)) != null && (iMessage instanceof cb)) {
            cb cbVar = (cb) iMessage;
            if (cbVar.f19460a == 25) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null) {
                    roomAuthStatus.setBannerState(1);
                }
                ArrayList<c.a> arrayList = this.mOnBannerVisibilityChangeListeners.get(j2);
                if (arrayList != null) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        shouldShowBanner(room);
                        it.next().a();
                    }
                }
            } else if (cbVar.f19460a == 24) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.setBannerState(2);
                }
                ArrayList<c.a> arrayList2 = this.mOnBannerVisibilityChangeListeners.get(j2);
                if (arrayList2 != null) {
                    Iterator<T> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        shouldShowBanner(room);
                        it2.next().a();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.banner.c
    public void addOnBannerVisibilityChangeListener(long j2, c.a aVar) {
        l.d(aVar, "");
        ArrayList<c.a> arrayList = this.mOnBannerVisibilityChangeListeners.get(j2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mOnBannerVisibilityChangeListeners.put(j2, arrayList);
        }
        arrayList.add(aVar);
    }

    @Override // com.bytedance.android.live.banner.c
    public void enter(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.put(room.getId(), dataChannel);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.c
    public void leave(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.remove(room.getId());
            this.mOnBannerVisibilityChangeListeners.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) != null) {
            iMessageManager.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.banner.c
    public void fetchBanner(m mVar, long j2, boolean z) {
        i lifecycle;
        InRoomBannerManager inRoomBannerManager = InRoomBannerManager.f7355e;
        InRoomBannerManager.f7351a = mVar;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.a(inRoomBannerManager);
        }
        InRoomBannerManager.f7352b = j2;
        InRoomBannerManager.f7353c = z;
        InRoomBannerManager.a(InRoomBannerManager.f7352b, InRoomBannerManager.f7353c);
    }
}
