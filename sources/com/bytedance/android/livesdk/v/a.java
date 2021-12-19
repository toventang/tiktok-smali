package com.bytedance.android.livesdk.v;

import com.bytedance.android.live.broadcast.widget.SelectDonationStickerWidget;
import com.bytedance.android.live.c.b;
import com.bytedance.android.live.c.c;
import com.bytedance.android.live.c.e;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DonationStickerAnchorWidget;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.h;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.List;

public class a implements b {
    static {
        Covode.recordClassIndex(13214);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.c.b
    public Class<? extends h<List<av>>> getDonationDecorationsEvent() {
        return c.class;
    }

    @Override // com.bytedance.android.live.c.b
    public Class<? extends LiveRecyclableWidget> getDonationStickerAnchorWidget() {
        return DonationStickerAnchorWidget.class;
    }

    @Override // com.bytedance.android.live.c.b
    public Class<? extends h<av>> getRoomStickersEvent() {
        return e.class;
    }

    @Override // com.bytedance.android.live.c.b
    public LiveWidget getDecorationWidget() {
        return new DecorationWrapperWidget();
    }

    @Override // com.bytedance.android.live.c.b
    public v getPropsStickerDialog() {
        return new com.bytedance.android.livesdk.chatroom.ui.b.a();
    }

    @Override // com.bytedance.android.live.c.b
    public LiveWidget getSelectDonationStickerWidget() {
        return new SelectDonationStickerWidget();
    }
}
