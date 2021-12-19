package com.ss.android.ugc.aweme.crossplatform.business.proxy;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.business.e;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.metrics.ac;

public class ReportBusinessProxy extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public String f78681a = this.f78617k.f78741a.o;

    /* renamed from: b  reason: collision with root package name */
    public Long f78682b = -1L;

    static {
        Covode.recordClassIndex(48851);
    }

    public final void a(Activity activity) {
        CrossPlatformLegacyServiceImpl.f().a(activity, this.f78617k.f78741a.f78737j);
    }

    ReportBusinessProxy(e eVar) {
        super(eVar);
    }

    public final void a(Activity activity, String str, int i2) {
        String aid;
        if (!TextUtils.isEmpty(this.f78681a)) {
            Uri.Builder builder = new Uri.Builder();
            Aweme b2 = AwemeService.b().b(this.f78617k.f78741a.f78737j);
            String str2 = this.f78617k.f78741a.f78740m;
            r.a("report", new d().a("author_id", str2).a("enter_from", this.f78617k.f78741a.f78733f).a("group_id", ac.e(b2)).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.b(b2))).a("report_type", this.f78681a).a("reported_url", str).a("page_depth", String.valueOf(i2)).f66730a);
            Uri.Builder appendQueryParameter = builder.appendQueryParameter("report_type", this.f78681a).appendQueryParameter("owner_id", str2).appendQueryParameter("enter_from", this.f78617k.f78741a.f78733f).appendQueryParameter("reported_url", str).appendQueryParameter("page_depth", String.valueOf(i2)).appendQueryParameter("user_id", b.g().getCurUserId());
            if (b2 == null) {
                aid = "";
            } else {
                aid = b2.getAid();
            }
            appendQueryParameter.appendQueryParameter("object_id", aid);
            CrossPlatformLegacyServiceImpl.f().a(activity, builder);
        }
    }
}
