package com.bytedance.android.live.liveinteract.linkroom.widget;

import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.e;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAnchorAvatarBgWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget;
import com.bytedance.android.livesdk.chatroom.interact.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import h.f.b.l;

public final class af implements e {
    static {
        Covode.recordClassIndex(5664);
    }

    @Override // com.bytedance.android.live.liveinteract.api.e
    public final LiveWidget b() {
        return new MultiGuestAnchorAvatarBgWidget();
    }

    @Override // com.bytedance.android.live.liveinteract.api.e
    public final LiveWidget a() {
        return new MultiGuestAsAnchorWidget();
    }

    @Override // com.bytedance.android.live.liveinteract.api.e
    public final BaseLinkWidget a(FrameLayout frameLayout) {
        return new LinkCrossRoomWidget(frameLayout);
    }

    @Override // com.bytedance.android.live.liveinteract.api.e
    public final BaseLinkControlWidget a(BaseLinkControlWidget.a aVar) {
        l.d(aVar, "");
        return new LinkControlWidget(aVar);
    }

    @Override // com.bytedance.android.live.liveinteract.api.e
    public final LiveWidget b(FrameLayout frameLayout) {
        l.d(frameLayout, "");
        return new MultiGuestAsGuestWidget(frameLayout);
    }

    @Override // com.bytedance.android.live.liveinteract.api.e
    public final void a(b bVar) {
        if (bVar != null) {
            com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(bVar, "LIVE_VIDEO_CLIENT_FACTORY");
        }
    }
}
