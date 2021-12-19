package com.bytedance.android.livesdk.lynx.lynxcard;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public class f implements b {
    static {
        Covode.recordClassIndex(11130);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.lynx.lynxcard.b
    public Class<? extends LiveRecyclableWidget> getLynxCardPreviewWidget() {
        return LynxCardPreviewWidget.class;
    }

    @Override // com.bytedance.android.livesdk.lynx.lynxcard.b
    public Class<? extends LiveRecyclableWidget> getLynxCardWidget() {
        return LynxCardWidget.class;
    }
}
