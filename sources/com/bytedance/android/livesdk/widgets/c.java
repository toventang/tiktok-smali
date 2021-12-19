package com.bytedance.android.livesdk.widgets;

import com.bytedance.android.live.gift.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewSpecialGiftWidget f22660a;

    static {
        Covode.recordClassIndex(13373);
    }

    c(LiveNewSpecialGiftWidget liveNewSpecialGiftWidget) {
        this.f22660a = liveNewSpecialGiftWidget;
    }

    public final void run() {
        LiveNewSpecialGiftWidget liveNewSpecialGiftWidget = this.f22660a;
        liveNewSpecialGiftWidget.f22654a.setVisibility(8);
        liveNewSpecialGiftWidget.dataChannel.b(u.class, (Object) false);
        liveNewSpecialGiftWidget.f22656c = false;
    }
}
