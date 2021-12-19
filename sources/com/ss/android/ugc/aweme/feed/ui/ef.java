package com.ss.android.ugc.aweme.feed.ui;

import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.l.a.a;

final /* synthetic */ class ef implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final String f94685a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f94686b;

    static {
        Covode.recordClassIndex(60087);
    }

    ef(String str, Aweme aweme) {
        this.f94685a = str;
        this.f94686b = aweme;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        String str = this.f94685a;
        Aweme aweme = this.f94686b;
        if (!a.a(view, 1200)) {
            SmartRouter.buildRoute(view.getContext(), "//webview").withParam(Uri.parse(str)).open();
            String str2 = "";
            d a2 = new d().a("enter_from", "personal_homepage").a("group_id", aweme.getAid()).a("music_id", aweme.getMusic() == null ? str2 : Long.valueOf(aweme.getMusic().getId()));
            if (aweme.getVideo() != null) {
                str2 = aweme.getVideo().isLongVideo() ? "1" : "0";
            }
            r.a("click_music_mute_detail", a2.a("is_long_video", str2).f66730a);
        }
    }
}
