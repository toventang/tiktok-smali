package com.ss.android.ugc.aweme.ad.feed;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.ss.android.ugc.aweme.bullet.e;
import com.ss.android.ugc.aweme.commercialize.j.b;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public interface c extends a {
    static {
        Covode.recordClassIndex(40466);
    }

    e a(BulletContainerView bulletContainerView, String str, com.ss.android.ugc.aweme.bullet.a aVar);

    String a(Context context, Aweme aweme);

    void a(Bundle bundle, Aweme aweme, Context context);

    boolean a(Context context, Aweme aweme, int i2, b bVar);

    boolean a(Aweme aweme);

    boolean a(AwemeRawAd awemeRawAd);

    boolean b(Aweme aweme);

    boolean c(Aweme aweme);

    boolean d(Aweme aweme);

    boolean e(Aweme aweme);
}
