package com.bytedance.android.live.h;

import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public class a implements b {
    static {
        Covode.recordClassIndex(5099);
    }

    @Override // com.bytedance.android.live.h.b
    public Class<? extends LiveRecyclableWidget> getAnchorHashTagWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.h.b
    public f getAnchorToolbarBehavior() {
        return null;
    }

    @Override // com.bytedance.android.live.h.b
    public Class<? extends LiveRecyclableWidget> getAudienceHashTagWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.h.b
    public LiveWidget getPreviewHashTagWidget(i iVar) {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.h.b
    public void updatePreviewHashTagWidgetLiveMode(LiveWidget liveWidget, i iVar) {
    }
}
