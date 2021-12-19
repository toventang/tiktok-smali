package com.bytedance.android.livesdk.function;

import android.view.View;
import com.bytedance.android.live.core.f.a.h;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomNotifyWidget.AnonymousClass3 f17800a;

    static {
        Covode.recordClassIndex(9881);
    }

    j(LiveRoomNotifyWidget.AnonymousClass3 r1) {
        this.f17800a = r1;
    }

    public final void run() {
        LiveRoomNotifyWidget.AnonymousClass3 r0 = this.f17800a;
        LiveRoomNotifyWidget.this.a((by) h.a((View) LiveRoomNotifyWidget.this.f17761a, "2131362437"));
    }
}
