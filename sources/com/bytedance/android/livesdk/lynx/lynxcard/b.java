package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.android.live.base.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface b extends a {
    static {
        Covode.recordClassIndex(11125);
    }

    Class<? extends LiveRecyclableWidget> getLynxCardPreviewWidget();

    Class<? extends LiveRecyclableWidget> getLynxCardWidget();
}
