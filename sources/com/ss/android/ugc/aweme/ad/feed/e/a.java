package com.ss.android.ugc.aweme.ad.feed.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.j.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public interface a extends com.ss.android.ugc.aweme.commercialize_ad_api.a.a {
    static {
        Covode.recordClassIndex(40510);
    }

    void a(Context context, Aweme aweme);

    void a(AwemeRawAd awemeRawAd);

    boolean a(Context context);

    boolean a(Context context, Aweme aweme, b bVar);

    boolean b(Context context, Aweme aweme);
}
