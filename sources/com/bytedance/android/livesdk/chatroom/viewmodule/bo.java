package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.live.d.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.j.j;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;

final /* synthetic */ class bo implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final FullVideoButtonWidget f16496a;

    static {
        Covode.recordClassIndex(9132);
    }

    bo(FullVideoButtonWidget fullVideoButtonWidget) {
        this.f16496a = fullVideoButtonWidget;
    }

    public final void onClick(View view) {
        Long l2;
        b bVar;
        FullVideoButtonWidget fullVideoButtonWidget = this.f16496a;
        a.a().a(new com.bytedance.android.livesdkapi.f.a(2));
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(fullVideoButtonWidget.f16314a));
        hashMap.put(StringSet.type, "portrait_to_landscape");
        b.a.a("screen_rotate").a("room_id", String.valueOf(fullVideoButtonWidget.f16314a)).a(StringSet.type, "portrait_to_landscape").a(fullVideoButtonWidget.dataChannel).c("click").b("live").d("live_detail").b();
        if (fullVideoButtonWidget.dataChannel != null && (l2 = (Long) fullVideoButtonWidget.dataChannel.b(j.class)) != null && (bVar = (com.bytedance.android.live.d.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.d.b.class)) != null) {
            bVar.reportAudienceRotateBtnClick(String.valueOf(fullVideoButtonWidget.f16314a), l2.longValue(), "1");
            fullVideoButtonWidget.dataChannel.b(j.class, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
