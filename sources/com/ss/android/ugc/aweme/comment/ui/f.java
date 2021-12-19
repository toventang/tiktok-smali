package com.ss.android.ugc.aweme.comment.ui;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.comment.l.b;
import com.ss.android.ugc.aweme.commerce.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f72746a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72747b;

    /* renamed from: c  reason: collision with root package name */
    private final Aweme f72748c;

    /* renamed from: d  reason: collision with root package name */
    private final a f72749d;

    static {
        Covode.recordClassIndex(44823);
    }

    f(b bVar, String str, Aweme aweme, a aVar) {
        this.f72746a = bVar;
        this.f72747b = str;
        this.f72748c = aweme;
        this.f72749d = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        b bVar = this.f72746a;
        String str = this.f72747b;
        Aweme aweme = this.f72748c;
        a aVar = this.f72749d;
        r.a("select_report_ads", new d().a("creativeId", aweme.getCommerceVideoAuthInfo().getCreativeId()).f66730a);
        SmartRoute buildRoute = SmartRouter.buildRoute(bVar.getContext(), b.a() + "%26selectTab%3d" + str);
        buildRoute.withParam("bundle_ad_id_from_aweme", aVar.getAdId()).withParam("bundle_advertiser_id_from_aweme", aVar.getAdvId()).withParam("bundle_creative_id_from_aweme", aVar.getCreativeId()).withParam("bundle_item_id_from_aweme", aVar.getItemId()).withParam("bundle_view_time_from_aweme", aVar.getLastViewTime()).withParam("bundle_desc_from_aweme", aweme.getDesc());
        if (!(aweme.getVideo() == null || aweme.getVideo().getCover() == null || aweme.getVideo().getCover().getUrlList() == null || aweme.getVideo().getCover().getUrlList().size() <= 0)) {
            buildRoute.withParam("bundle_cover_url_from_aweme", aweme.getVideo().getCover().getUrlList().get(0));
        }
        buildRoute.open();
    }
}
