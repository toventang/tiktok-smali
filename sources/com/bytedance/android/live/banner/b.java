package com.bytedance.android.live.banner;

import androidx.lifecycle.m;
import com.bytedance.android.live.banner.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import h.f.b.l;

public class b implements c {
    static {
        Covode.recordClassIndex(3567);
    }

    @Override // com.bytedance.android.live.banner.c
    public void addOnBannerVisibilityChangeListener(long j2, c.a aVar) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.banner.c
    public void enter(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.banner.c
    public void fetchBanner(m mVar, long j2, boolean z) {
    }

    @Override // com.bytedance.android.live.banner.c
    public Class<? extends LiveRecyclableWidget> getActivityTopRightBannerWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.banner.c
    public Class<? extends LiveRecyclableWidget> getBottomRightBannerWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.banner.c
    public Class<? extends LiveRecyclableWidget> getTopRightBannerWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.banner.c
    public void leave(DataChannel dataChannel, Room room) {
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.banner.c
    public boolean shouldShowBanner(long j2) {
        return false;
    }

    public boolean shouldShowBanner(Room room) {
        return false;
    }
}
