package com.ss.android.ugc.aweme.commercialize.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.compliance.api.a;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.report.b;

public class ReportBusiness extends BusinessService.Business {
    static {
        Covode.recordClassIndex(45372);
    }

    ReportBusiness(e eVar) {
        super(eVar);
    }

    public final void a(Activity activity) {
        Aweme d2 = AwemeService.b().d(this.f78617k.f78741a.f78737j);
        a.a().a(b.a(d2, "homepage_hot"));
        a.a().b(activity, b.a(d2, "landing_page", "ad"));
    }
}
