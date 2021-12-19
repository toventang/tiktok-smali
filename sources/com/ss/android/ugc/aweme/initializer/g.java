package com.ss.android.ugc.aweme.initializer;

import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.recommend.a.b;
import com.ss.android.ugc.aweme.shortvideo.ae.c;
import com.ss.android.ugc.aweme.video.hashtag.AVRecommendHashTagResponseViewModel;

final /* synthetic */ class g implements u {

    /* renamed from: a  reason: collision with root package name */
    private final e f104736a;

    static {
        Covode.recordClassIndex(67142);
    }

    g(e eVar) {
        this.f104736a = eVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ((AVRecommendHashTagResponseViewModel) ae.a(this.f104736a, (ad.b) null).a(AVRecommendHashTagResponseViewModel.class)).f143393a.postValue(c.a((b) obj));
    }
}
