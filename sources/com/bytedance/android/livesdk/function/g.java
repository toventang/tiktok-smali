package com.bytedance.android.livesdk.function;

import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget.AnonymousClass1 f17796a;

    static {
        Covode.recordClassIndex(9878);
    }

    g(LiveRoomNotifyWidget.AnonymousClass1 r1) {
        this.f17796a = r1;
    }

    public final void run() {
        LiveRoomNotifyWidget.AnonymousClass1 r1 = this.f17796a;
        if (LiveRoomNotifyWidget.this.isViewValid() && LiveRoomNotifyWidget.this.f17764d != null) {
            LiveRoomNotifyWidget.this.f17764d.start();
        }
    }
}
