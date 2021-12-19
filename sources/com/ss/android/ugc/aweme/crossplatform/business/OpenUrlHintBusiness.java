package com.ss.android.ugc.aweme.crossplatform.business;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;

public class OpenUrlHintBusiness extends BusinessService.Business {
    static {
        Covode.recordClassIndex(48818);
    }

    public OpenUrlHintBusiness(e eVar) {
        super(eVar);
    }

    public static void a(OpenURLHintLayout openURLHintLayout, String str) {
        openURLHintLayout.a(AwemeService.b().d(str));
    }
}
