package com.bytedance.android.live.m;

import android.content.Context;
import com.bytedance.android.live.p.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface a extends com.bytedance.android.live.base.a {
    static {
        Covode.recordClassIndex(6580);
    }

    Class<? extends LiveRecyclableWidget> getQAWidget();

    f getToolbarBehavior(Context context);
}
