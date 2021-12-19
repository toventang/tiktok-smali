package com.bytedance.android.livesdk.function;

import android.view.View;
import com.bytedance.android.live.core.f.a.h;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget.AnonymousClass3 f17801a;

    static {
        Covode.recordClassIndex(9882);
    }

    k(LiveRoomNotifyWidget.AnonymousClass3 r1) {
        this.f17801a = r1;
    }

    public final void run() {
        LiveRoomNotifyWidget.AnonymousClass3 r0 = this.f17801a;
        LiveRoomNotifyWidget.this.a((by) h.a((View) LiveRoomNotifyWidget.this.f17761a, "2131362437"));
    }
}
