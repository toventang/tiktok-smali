package com.ss.android.ugc.aweme.ad.feed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.feed.a.b;
import com.ss.android.ugc.aweme.ad.feed.b.e;
import com.ss.android.ugc.aweme.ad.feed.mask.h;
import com.ss.android.ugc.aweme.ad.feed.survey.c;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.a.a;
import h.z;

public interface IFeedAdService {
    static {
        Covode.recordClassIndex(40447);
    }

    d a(AwemeRawAd awemeRawAd, String str, com.ss.android.ugc.aweme.ad.feed.dialog.d dVar);

    d a(AwemeRawAd awemeRawAd, String str, com.ss.android.ugc.aweme.ad.feed.dialog.d dVar, long j2);

    b a();

    e a(ViewGroup viewGroup);

    com.ss.android.ugc.aweme.ad.feed.g.b a(View view);

    c a(ViewStub viewStub);

    void a(Context context, String str, long j2);

    void a(Context context, String str, long j2, a<z> aVar);

    void a(androidx.fragment.app.e eVar, AwemeRawAd awemeRawAd, String str);

    com.ss.android.ugc.aweme.ad.feed.b.d b();

    h b(ViewStub viewStub);

    e c(ViewStub viewStub);

    e d(ViewStub viewStub);
}
