package com.bytedance.android.livesdk.function;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.util.LongSparseArray;
import com.bytedance.android.live.f.a;
import com.bytedance.android.live.publicscreen.a.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.chatroom.b.f;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.other.LiveSdkWarningTagDelayEndDurationSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveSdkWarningTagDelayStartDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.EnableAnchorLiveLongPressShareSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.EnableLiveLongPressShareSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.cb;
import com.bytedance.android.livesdk.model.message.g;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.c.a;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.m.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import h.f.b.l;
import h.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class m implements com.bytedance.android.live.f.a, a.AbstractC0502a, OnMessageListener {
    public final int MSG_WHAT_FETCH_ROOM = 2;
    private final LongSparseArray<DataChannel> mDataChannels = new LongSparseArray<>();
    private final h mHandler$delegate = d.a(new b(this));
    private final LongSparseArray<ArrayList<a.AbstractC0151a>> mOnUserCountVisibilityChangeListeners = new LongSparseArray<>();

    static {
        Covode.recordClassIndex(9884);
    }

    public final com.bytedance.android.livesdkapi.depend.c.a getMHandler() {
        return (com.bytedance.android.livesdkapi.depend.c.a) this.mHandler$delegate.getValue();
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.f.a
    public Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget() {
        return LiveRoomNotifyWidget.class;
    }

    @Override // com.bytedance.android.live.f.a
    public Class<? extends LiveRecyclableWidget> getStreamInfoWidget() {
        return StreamInfoWidget.class;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdkapi.depend.c.a> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(9886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdkapi.depend.c.a invoke() {
            return new com.bytedance.android.livesdkapi.depend.c.a(this.this$0);
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f17803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f17804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f17805c;

        static {
            Covode.recordClassIndex(9885);
        }

        a(m mVar, boolean z, long j2) {
            this.f17803a = mVar;
            this.f17804b = z;
            this.f17805c = j2;
        }

        public final void run() {
            f.f14958a.a(this.f17803a.getMHandler(), this.f17804b, this.f17805c, this.f17803a.MSG_WHAT_FETCH_ROOM);
        }
    }

    @Override // com.bytedance.android.live.f.a
    public boolean shouldShowUserCount(Room room) {
        if (room == null) {
            return false;
        }
        RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
        if (roomAuthStatus == null || roomAuthStatus.getUserCountDisplayState() != 2) {
            return true;
        }
        return false;
    }

    private final void handleMaskLayer(Room room) {
        if (room != null) {
            if (room.maskLayer == null) {
                ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).showMaskLayer(room.getId(), false);
            } else {
                ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).showMaskLayer(room.getId(), true);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.c.a.AbstractC0502a
    public void handleMsg(Message message) {
        Object obj;
        Object obj2 = null;
        if (message != null) {
            obj = message.obj;
        } else {
            obj = null;
        }
        if (obj instanceof Room) {
            if (message != null) {
                obj2 = message.obj;
            }
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            if (Room.isValid((Room) obj2)) {
                Object obj3 = message.obj;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                handleWarningTag((Room) obj3);
                Object obj4 = message.obj;
                Objects.requireNonNull(obj4, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
                handleMaskLayer((Room) obj4);
            }
        }
    }

    private final void handleWarningTag(Room room) {
        g currentBottomMessage;
        int i2;
        if (room != null) {
            e eVar = (e) com.bytedance.android.live.t.a.a(e.class);
            if (room.warningTag != null && room.warningTag.text != null) {
                if (room.warningTag.tagSource == 1) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
                if (eVar != null) {
                    long id = room.getId();
                    com.bytedance.android.livesdk.model.message.c.b bVar = room.warningTag.text;
                    Long l2 = room.warningTag.duration;
                    l.b(l2, "");
                    eVar.insertBottomMessage(id, "", bVar, l2.longValue(), 1, 0, i2);
                }
            } else if (eVar != null && (currentBottomMessage = eVar.getCurrentBottomMessage(room.getId())) != null) {
                if (currentBottomMessage.f19625i == 3 || currentBottomMessage.f19625i == 4) {
                    eVar.hideWarningMessage(room.getId());
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        IMessage iMessage2;
        com.bytedance.android.livesdkapi.h.b bVar;
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
            if (cbVar.f19460a == 32) {
                RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
                if (roomAuthStatus != null) {
                    roomAuthStatus.setUserCountDisplayState(1);
                }
                ArrayList<a.AbstractC0151a> arrayList = this.mOnUserCountVisibilityChangeListeners.get(j2);
                if (arrayList != null) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().a(shouldShowUserCount(room));
                    }
                }
            } else if (cbVar.f19460a == 33) {
                RoomAuthStatus roomAuthStatus2 = room.getRoomAuthStatus();
                if (roomAuthStatus2 != null) {
                    roomAuthStatus2.setUserCountDisplayState(2);
                }
                ArrayList<a.AbstractC0151a> arrayList2 = this.mOnUserCountVisibilityChangeListeners.get(j2);
                if (arrayList2 != null) {
                    Iterator<T> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(shouldShowUserCount(room));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.f.a
    public void addOnUserCountVisibilityChangeListener(long j2, a.AbstractC0151a aVar) {
        l.d(aVar, "");
        ArrayList<a.AbstractC0151a> arrayList = this.mOnUserCountVisibilityChangeListeners.get(j2);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.mOnUserCountVisibilityChangeListeners.put(j2, arrayList);
        }
        arrayList.add(aVar);
    }

    @Override // com.bytedance.android.live.f.a
    public void enter(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.put(room.getId(), dataChannel);
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.live.f.a
    public void leave(DataChannel dataChannel, Room room) {
        IMessageManager iMessageManager;
        if (room != null) {
            this.mDataChannels.remove(room.getId());
            this.mOnUserCountVisibilityChangeListeners.remove(room.getId());
        }
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) != null) {
            iMessageManager.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_VERIFY.getIntType(), this);
        }
    }

    private final void logOnLongPress(boolean z, Room room, c cVar) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = cVar.z;
        l.b(str2, "");
        String str3 = cVar.A;
        String str4 = cVar.B;
        l.b(str4, "");
        com.bytedance.android.livesdk.watch.chatroom.b.a(linkedHashMap, room, str2, str3, str4);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        b.a.a("click_trans_layer").a().a((Map<String, String>) linkedHashMap).b();
    }

    @Override // com.bytedance.android.live.f.a
    public void likeMicStateChange(long j2, int i2, boolean z) {
        double value = LiveSdkWarningTagDelayStartDurationSetting.INSTANCE.getValue();
        if (i2 == 1) {
            value = LiveSdkWarningTagDelayEndDurationSetting.INSTANCE.getValue();
        }
        getMHandler().postDelayed(new a(this, z, j2), (long) (value * 1000.0d));
    }

    @Override // com.bytedance.android.live.f.a
    public DialogInterface onLongPress(Context context, boolean z, Room room, c cVar, IHostLongPressCallback iHostLongPressCallback, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        androidx.fragment.app.e a2;
        l.d(context, "");
        l.d(room, "");
        l.d(cVar, "");
        l.d(bVar, "");
        if (!((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).shareable(room)) {
            if (!z) {
                DialogInterface openLongPressDialog = ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).openLongPressDialog(iHostLongPressCallback, context, room, cVar.z, cVar.A, cVar.N);
                logOnLongPress(z, room, cVar);
                return openLongPressDialog;
            }
        } else if (z) {
            if (EnableAnchorLiveLongPressShareSetting.INSTANCE.getValue() == 0 || (a2 = p.a(context)) == null) {
                return null;
            }
            Dialog c2 = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share().c(a2, cVar, bVar);
            if (c2 != null) {
                c2.show();
            }
            logOnLongPress(z, room, cVar);
            return c2;
        } else if (EnableLiveLongPressShareSetting.INSTANCE.getValue() == 1) {
            androidx.fragment.app.e a3 = p.a(context);
            if (a3 == null) {
                return null;
            }
            Dialog c3 = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share().c(a3, cVar, bVar);
            if (c3 != null) {
                c3.show();
            }
            logOnLongPress(z, room, cVar);
            return c3;
        } else {
            DialogInterface openLongPressDialog2 = ((com.bytedance.android.livesdk.watch.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.watch.d.class)).openLongPressDialog(iHostLongPressCallback, context, room, cVar.z, cVar.A, cVar.N);
            logOnLongPress(z, room, cVar);
            return openLongPressDialog2;
        }
        return null;
    }
}
