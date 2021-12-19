package com.bytedance.android.live.c;

import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.h;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;

public class a implements b {
    static {
        Covode.recordClassIndex(4509);
    }

    @Override // com.bytedance.android.live.c.b
    public LiveWidget getDecorationWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.c.b
    public Class<? extends h<List<av>>> getDonationDecorationsEvent() {
        return null;
    }

    @Override // com.bytedance.android.live.c.b
    public Class<? extends LiveRecyclableWidget> getDonationStickerAnchorWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.c.b
    public v getPropsStickerDialog() {
        return null;
    }

    @Override // com.bytedance.android.live.c.b
    public Class<? extends h<av>> getRoomStickersEvent() {
        return null;
    }

    @Override // com.bytedance.android.live.c.b
    public LiveWidget getSelectDonationStickerWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }
}
