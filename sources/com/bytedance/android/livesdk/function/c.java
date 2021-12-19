package com.bytedance.android.livesdk.function;

import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget f17790a;

    static {
        Covode.recordClassIndex(9874);
    }

    c(LiveRoomNotifyWidget liveRoomNotifyWidget) {
        this.f17790a = liveRoomNotifyWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        LiveRoomNotifyWidget liveRoomNotifyWidget = this.f17790a;
        g gVar = (g) obj;
        if (gVar != null && gVar.f17192a != null && liveRoomNotifyWidget.getView() != null && liveRoomNotifyWidget.isViewValid()) {
            SparseBooleanArray sparseBooleanArray = gVar.f17192a;
            if (gVar.f17193b == 1) {
                e.a(liveRoomNotifyWidget.context, liveRoomNotifyWidget.getView(), !sparseBooleanArray.get(1), gVar.f17194c);
            }
        }
    }
}
