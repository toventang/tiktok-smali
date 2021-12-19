package com.bytedance.android.livesdk.function;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget f17788a;

    static {
        Covode.recordClassIndex(9872);
    }

    a(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f17788a = liveRoomNotifyWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f17788a;
        Boolean bool = (Boolean) obj;
        if (liveRoomNotifyWidget.getView().getVisibility() == 0) {
            if (bool.booleanValue()) {
                liveRoomNotifyWidget.getView().setVisibility(4);
            } else {
                liveRoomNotifyWidget.show();
            }
        }
        return z.f158842a;
    }
}
