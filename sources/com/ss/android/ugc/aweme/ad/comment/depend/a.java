package com.ss.android.ugc.aweme.ad.comment.depend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final IAdCommentDepend f65679a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f65680b = new a();

    private a() {
    }

    static {
        com.ss.android.ugc.aweme.commercialize_ad_api.a.a aVar;
        Covode.recordClassIndex(40414);
        ICommercializeAdService a2 = CommercializeAdServiceImpl.a();
        if (a2 != null) {
            aVar = a2.a(5);
        } else {
            aVar = null;
        }
        f65679a = (IAdCommentDepend) aVar;
    }
}
