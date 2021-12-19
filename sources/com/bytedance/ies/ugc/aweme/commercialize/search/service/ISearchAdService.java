package com.bytedance.ies.ugc.aweme.commercialize.search.service;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public interface ISearchAdService {
    static {
        Covode.recordClassIndex(20818);
    }

    ViewGroup a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd);

    ViewGroup a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd, View.OnClickListener onClickListener);

    void a(ViewGroup viewGroup);

    void a(AwemeRawAd awemeRawAd, ViewGroup viewGroup, View.OnClickListener onClickListener, View.OnClickListener onClickListener2);

    void b(ViewGroup viewGroup);

    void c(ViewGroup viewGroup);

    void d(ViewGroup viewGroup);

    void e(ViewGroup viewGroup);

    void f(ViewGroup viewGroup);
}
