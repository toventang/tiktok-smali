package com.bytedance.android.live.p;

import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface h extends a {
    static {
        Covode.recordClassIndex(6673);
    }

    Class<? extends LiveRecyclableWidget> audienceToolbarWidget();

    Class<? extends LiveRecyclableWidget> broadcastToolbarWidget();

    void preloadAudienceToolbarWidget();

    void preloadBroadcastToolbarWidget();

    void preloadToolbarView(Context context, int i2, q qVar);

    void releaseToolbarView();

    g toolbarManager();

    Class<? extends LiveRecyclableWidget> toolbarWidget();
}
