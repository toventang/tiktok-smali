package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import org.json.JSONObject;

final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16510a;

    static {
        Covode.recordClassIndex(9148);
    }

    k(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16510a = bottomRightBannerWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16510a;
        bottomRightBannerWidget.f16249d.a(bottomRightBannerWidget.f16246a, "H5_roomStatusChange", (JSONObject) obj);
    }
}
