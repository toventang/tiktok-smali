package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveToolbarWidget f21722a;

    static {
        Covode.recordClassIndex(12806);
    }

    g(LiveToolbarWidget liveToolbarWidget) {
        this.f21722a = liveToolbarWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveToolbarWidget liveToolbarWidget = this.f21722a;
        if (((Boolean) obj).booleanValue()) {
            liveToolbarWidget.hide();
        } else {
            liveToolbarWidget.show();
        }
        return z.f158842a;
    }
}
