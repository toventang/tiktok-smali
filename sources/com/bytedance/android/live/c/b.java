package com.bytedance.android.live.c;

import com.bytedance.android.live.base.a;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.h;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;

public interface b extends a {
    static {
        Covode.recordClassIndex(4510);
    }

    LiveWidget getDecorationWidget();

    Class<? extends h<List<av>>> getDonationDecorationsEvent();

    Class<? extends LiveRecyclableWidget> getDonationStickerAnchorWidget();

    v getPropsStickerDialog();

    Class<? extends h<av>> getRoomStickersEvent();

    LiveWidget getSelectDonationStickerWidget();
}
