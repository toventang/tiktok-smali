package com.ss.android.ugc.aweme.detail.h;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.utils.hh;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f79743a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f79744b;

    static {
        Covode.recordClassIndex(49554);
    }

    m(b bVar, Aweme aweme) {
        this.f79743a = bVar;
        this.f79744b = aweme;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        b bVar = this.f79743a;
        r.a("click_insight", new d().a("enter_from", "banner_more_data").f66730a);
        r.a("enter_insight_detail", new d().a("enter_from", "banner_more_data").f66730a);
        ShareDependService.a.a().a("https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=" + hh.c() + "#/video/" + this.f79744b.getAid(), bVar.bv);
    }
}
