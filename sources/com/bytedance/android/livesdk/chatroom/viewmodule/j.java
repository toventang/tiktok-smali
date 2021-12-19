package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.ab.e;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import f.a.d.g;
import org.json.JSONObject;

final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final BottomRightBannerWidget f16509a;

    static {
        Covode.recordClassIndex(9147);
    }

    j(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f16509a = bottomRightBannerWidget;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        BottomRightBannerWidget bottomRightBannerWidget = this.f16509a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StringSet.type, "refresh");
        jSONObject.put("data", obj);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_from_merge", e.a()).put("enter_method", e.d()).put("event_page", bottomRightBannerWidget.f16248c ? "live_take_detail" : "live_detail").put("room_id", String.valueOf(bottomRightBannerWidget.f16247b.getId())).put("anchor_id", String.valueOf(bottomRightBannerWidget.f16247b.getOwnerUserId())).put("request_id", bottomRightBannerWidget.f16247b.getRequestId()).put("log_pb", bottomRightBannerWidget.f16247b.getLog_pb());
        jSONObject.put("log", jSONObject2);
        return jSONObject;
    }
}
