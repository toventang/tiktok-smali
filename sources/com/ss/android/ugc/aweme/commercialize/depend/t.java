package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.f;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.views.cards.ae;
import com.ss.android.ugc.aweme.commercialize.views.cards.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

public interface t {
    static {
        Covode.recordClassIndex(45434);
    }

    f a(Activity activity, a aVar);

    ai a(Integer num, Context context, Aweme aweme, ae aeVar);

    void a(int i2, boolean z);

    void a(Context context, b bVar);

    void a(Context context, String str);

    void a(Aweme aweme);

    void a(Aweme aweme, String str);

    void a(Aweme aweme, boolean z, String str);

    void a(String str, UrlModel urlModel, Aweme aweme);

    void a(String str, AwemeRawAd awemeRawAd);

    void a(boolean z);

    boolean a();

    boolean a(Context context);

    boolean a(Context context, Aweme aweme);

    boolean a(Context context, Aweme aweme, int i2);

    ae b(Aweme aweme);

    boolean b();

    boolean b(Context context, Aweme aweme);

    ae c(Aweme aweme);

    void c();

    boolean c(Context context, Aweme aweme);

    String d(Aweme aweme);

    boolean d();

    long e(Aweme aweme);

    boolean e();

    CardStruct f(Aweme aweme);

    void f();

    void g();

    boolean g(Aweme aweme);

    boolean h(Aweme aweme);

    void i(Aweme aweme);

    void j(Aweme aweme);

    boolean k(Aweme aweme);

    String l(Aweme aweme);

    boolean m(Aweme aweme);

    boolean n(Aweme aweme);

    CardStruct o(Aweme aweme);

    boolean p(Aweme aweme);

    boolean q(Aweme aweme);

    boolean r(Aweme aweme);

    void s(Aweme aweme);
}
