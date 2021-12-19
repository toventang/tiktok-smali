package com.bytedance.android.live.r;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface a extends com.bytedance.android.live.base.a {
    static {
        Covode.recordClassIndex(6934);
    }

    Class<? extends LiveRecyclableWidget> getGeneralUserInfoWidget();

    Class<? extends LiveRecyclableWidget> getUserInfoWidget();
}
