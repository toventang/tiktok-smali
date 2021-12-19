package com.bytedance.android.live.h;

import com.bytedance.android.live.base.a;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public interface b extends a {
    static {
        Covode.recordClassIndex(5100);
    }

    Class<? extends LiveRecyclableWidget> getAnchorHashTagWidget();

    f getAnchorToolbarBehavior();

    Class<? extends LiveRecyclableWidget> getAudienceHashTagWidget();

    LiveWidget getPreviewHashTagWidget(i iVar);

    void updatePreviewHashTagWidgetLiveMode(LiveWidget liveWidget, i iVar);
}
