package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Collection;
import org.json.JSONObject;

public interface be {
    static {
        Covode.recordClassIndex(45777);
    }

    long a(AwemeRawAd awemeRawAd);

    JSONObject a(Context context, JSONObject jSONObject, String str);

    void a(Context context, long j2, String str, UrlModel urlModel);

    void a(Context context, long j2, String str, UrlModel urlModel, String str2);

    void a(Context context, Banner banner, int i2);

    void a(Context context, Aweme aweme);

    void a(Context context, Aweme aweme, int i2);

    void a(Context context, Aweme aweme, FollowStatus followStatus);

    void a(Context context, Aweme aweme, String str);

    void a(Context context, Aweme aweme, JSONObject jSONObject);

    void a(Context context, AwemeRawAd awemeRawAd, String str);

    void a(Context context, String str, String str2, JSONObject jSONObject, String str3, long j2);

    void a(Collection<String> collection);

    void b(Context context, long j2, String str, UrlModel urlModel);

    void b(Context context, Banner banner, int i2);

    void b(Context context, Aweme aweme);

    void b(Context context, Aweme aweme, FollowStatus followStatus);

    void b(Context context, Aweme aweme, String str);

    void c(Context context, long j2, String str, UrlModel urlModel);

    void c(Context context, Aweme aweme);

    void d(Context context, Aweme aweme);

    void e(Context context, Aweme aweme);

    void f(Context context, Aweme aweme);

    void g(Context context, Aweme aweme);

    void h(Context context, Aweme aweme);

    void i(Context context, Aweme aweme);

    void j(Context context, Aweme aweme);

    void k(Context context, Aweme aweme);

    void l(Context context, Aweme aweme);

    void m(Context context, Aweme aweme);

    void n(Context context, Aweme aweme);

    void o(Context context, Aweme aweme);

    void p(Context context, Aweme aweme);

    void q(Context context, Aweme aweme);

    void r(Context context, Aweme aweme);

    void s(Context context, Aweme aweme);

    void t(Context context, Aweme aweme);

    void u(Context context, Aweme aweme);

    void v(Context context, Aweme aweme);
}
