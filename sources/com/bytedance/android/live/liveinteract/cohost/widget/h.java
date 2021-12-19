package com.bytedance.android.live.liveinteract.cohost.widget;

import android.view.View;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.n.z;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final LinkCrossRoomWidget f10482a;

    static {
        Covode.recordClassIndex(5569);
    }

    h(LinkCrossRoomWidget linkCrossRoomWidget) {
        this.f10482a = linkCrossRoomWidget;
    }

    public final void onClick(View view) {
        LinkCrossRoomWidget linkCrossRoomWidget = this.f10482a;
        UserProfileEvent userProfileEvent = new UserProfileEvent(linkCrossRoomWidget.f10469h.f9941f);
        userProfileEvent.interactLogLabel = "right_anchor";
        userProfileEvent.mReportType = "report_anchor";
        linkCrossRoomWidget.dataChannel.c(z.class, userProfileEvent);
        HashMap hashMap = new HashMap();
        hashMap.put("user_id", String.valueOf(linkCrossRoomWidget.f10467f.getOwnerUserId()));
        if (linkCrossRoomWidget.f10469h.r == 0) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "pk");
        }
        b.a.a("right_anchor_click").a((Map<String, String>) hashMap).a("enter_from", "live_detail").d("live_detail").b("live").c("click").a(b.a.a().e()).a(linkCrossRoomWidget.dataChannel).b();
    }
}
