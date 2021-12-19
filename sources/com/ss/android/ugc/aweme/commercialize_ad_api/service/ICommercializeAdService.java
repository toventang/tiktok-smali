package com.ss.android.ugc.aweme.commercialize_ad_api.service;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.a;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.ss.android.ugc.aweme.commercialize_ad_api.b.b;

public interface ICommercializeAdService {
    static {
        Covode.recordClassIndex(47098);
    }

    a a(int i2);

    b<?> a(Context context, c cVar);

    void a(Application application, com.ss.android.ugc.aweme.commercialize_ad_api.a.b bVar, boolean z);

    Widget b(Context context, c cVar);

    com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, c cVar);
}
