package com.bytedance.android.livesdk.toolbar;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

final /* synthetic */ class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final LiveAudienceToolbarWidget f21694a;

    static {
        Covode.recordClassIndex(12792);
    }

    c(LiveAudienceToolbarWidget liveAudienceToolbarWidget) {
        this.f21694a = liveAudienceToolbarWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        LiveAudienceToolbarWidget liveAudienceToolbarWidget = this.f21694a;
        Boolean bool = (Boolean) obj;
        if (liveAudienceToolbarWidget.contentView != null) {
            liveAudienceToolbarWidget.contentView.setVisibility(bool.booleanValue() ? 8 : 0);
        }
        return z.f158842a;
    }
}
