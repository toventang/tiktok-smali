package com.bytedance.android.livesdk.widgets;

import com.bytedance.android.live.gift.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LiveNewSpecialGiftWidget f22661a;

    static {
        Covode.recordClassIndex(13374);
    }

    d(LiveNewSpecialGiftWidget liveNewSpecialGiftWidget) {
        this.f22661a = liveNewSpecialGiftWidget;
    }

    public final void run() {
        LiveNewSpecialGiftWidget liveNewSpecialGiftWidget = this.f22661a;
        liveNewSpecialGiftWidget.f22654a.setVisibility(8);
        liveNewSpecialGiftWidget.dataChannel.b(u.class, (Object) false);
        liveNewSpecialGiftWidget.f22656c = false;
    }
}
