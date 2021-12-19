package com.ss.android.ugc.aweme.profile.f;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.experiment.fq;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import h.f.b.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f116473a = new w();

    private w() {
    }

    static {
        Covode.recordClassIndex(75179);
    }

    public static final void a(Context context, LiveEventStruct liveEventStruct) {
        l.d(liveEventStruct, "");
        String a2 = fq.a();
        if (context != null && !TextUtils.isEmpty(a2)) {
            g gVar = new g("sslocal://webcast_webview");
            gVar.a("hide_nav_bar", 1);
            gVar.a("hide_status_bar", 1);
            g gVar2 = new g(a2);
            gVar2.a("event_id", liveEventStruct.getId());
            gVar2.a("live_event_enter_from", "live_event_card");
            gVar.a("url", gVar2.a());
            String a3 = gVar.a();
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            s.d().a(context, Uri.parse(a3));
        }
    }
}
