package com.bytedance.android.live.banner;

import androidx.lifecycle.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public interface c extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(3569);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(3568);
    }

    void addOnBannerVisibilityChangeListener(long j2, a aVar);

    void enter(DataChannel dataChannel, Room room);

    void fetchBanner(m mVar, long j2, boolean z);

    Class<? extends LiveRecyclableWidget> getActivityTopRightBannerWidget();

    Class<? extends LiveRecyclableWidget> getBottomRightBannerWidget();

    Class<? extends LiveRecyclableWidget> getTopRightBannerWidget();

    void leave(DataChannel dataChannel, Room room);

    boolean shouldShowBanner(long j2);
}
