package com.bytedance.android.live.liveinteract.api;

import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;
import com.bytedance.android.livesdk.chatroom.interact.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public interface e {
    static {
        Covode.recordClassIndex(5191);
    }

    BaseLinkControlWidget a(BaseLinkControlWidget.a aVar);

    BaseLinkWidget a(FrameLayout frameLayout);

    LiveWidget a();

    void a(b bVar);

    LiveWidget b();

    LiveWidget b(FrameLayout frameLayout);
}
