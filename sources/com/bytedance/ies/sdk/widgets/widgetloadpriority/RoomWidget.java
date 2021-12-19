package com.bytedance.ies.sdk.widgets.widgetloadpriority;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.j.cc;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.IUnLoadWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;

public abstract class RoomWidget extends LiveWidget implements IUnLoadWidget, au {
    static {
        Covode.recordClassIndex(20737);
    }

    public void onGetRoomInfo(Room room) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public RoomWidget() {
        register(Room.class);
    }

    public boolean isVisibilityToUser() {
        if (EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            return cc.a(this.dataChannel);
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        if (t instanceof Room) {
            onGetRoomInfo(t);
        }
        super.onCustomInfoCallBack(t);
    }
}
