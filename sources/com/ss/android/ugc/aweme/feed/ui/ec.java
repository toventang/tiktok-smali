package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.l.a.a;

final /* synthetic */ class ec implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final eb f94682a;

    static {
        Covode.recordClassIndex(60084);
    }

    ec(eb ebVar) {
        this.f94682a = ebVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        eb ebVar = this.f94682a;
        if (!a.a(view, 1200)) {
            r.a("enter_appeal", new d().a("enter_from", "personal_homepage").a("group_id", ebVar.f94768a.getFromGroupId()).f66730a);
            String reviewDetailUrl = ebVar.f94768a.getReviewDetailUrl();
            if (!TextUtils.isEmpty(reviewDetailUrl)) {
                Intent buildIntent = SmartRouter.buildRoute(view.getContext(), "aweme://webview/").buildIntent();
                buildIntent.setData(Uri.parse(reviewDetailUrl));
                Activity j2 = f.j();
                if (j2 != null) {
                    com.ss.android.ugc.tiktok.security.a.a.a(buildIntent, j2);
                    j2.startActivity(buildIntent);
                }
            }
        }
    }
}
