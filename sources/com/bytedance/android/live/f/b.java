package com.bytedance.android.live.f;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.f.a;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.f.b.l;

public class b implements a {
    static {
        Covode.recordClassIndex(5070);
    }

    @Override // com.bytedance.android.live.f.a
    public void addOnUserCountVisibilityChangeListener(long j2, a.AbstractC0151a aVar) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.f.a
    public void enter(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.f.a
    public Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.f.a
    public Class<? extends LiveRecyclableWidget> getStreamInfoWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.f.a
    public void leave(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.f.a
    public void likeMicStateChange(long j2, int i2, boolean z) {
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.f.a
    public DialogInterface onLongPress(Context context, boolean z, Room room, c cVar, IHostLongPressCallback iHostLongPressCallback, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        l.d(context, "");
        l.d(room, "");
        l.d(cVar, "");
        l.d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.f.a
    public boolean shouldShowUserCount(Room room) {
        return false;
    }
}
