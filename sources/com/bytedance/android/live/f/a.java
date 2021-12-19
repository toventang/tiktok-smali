package com.bytedance.android.live.f;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface a extends com.bytedance.android.live.base.a {

    /* renamed from: com.bytedance.android.live.f.a$a  reason: collision with other inner class name */
    public interface AbstractC0151a {
        static {
            Covode.recordClassIndex(5069);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(5068);
    }

    void addOnUserCountVisibilityChangeListener(long j2, AbstractC0151a aVar);

    void enter(DataChannel dataChannel, Room room);

    Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget();

    Class<? extends LiveRecyclableWidget> getStreamInfoWidget();

    void leave(DataChannel dataChannel, Room room);

    void likeMicStateChange(long j2, int i2, boolean z);

    DialogInterface onLongPress(Context context, boolean z, Room room, c cVar, IHostLongPressCallback iHostLongPressCallback, b bVar);

    boolean shouldShowUserCount(Room room);
}
