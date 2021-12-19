package com.ss.android.ugc.aweme.ad.feed.card;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    final FrameLayout f65805a;

    /* renamed from: b  reason: collision with root package name */
    final FrameLayout f65806b;

    /* renamed from: c  reason: collision with root package name */
    d f65807c;

    /* renamed from: d  reason: collision with root package name */
    d f65808d;

    /* renamed from: e  reason: collision with root package name */
    d f65809e;

    static {
        Covode.recordClassIndex(40490);
    }

    public final void a() {
        for (FrameLayout frameLayout : n.b(this.f65805a, this.f65806b)) {
            frameLayout.setVisibility(8);
        }
    }

    public final void a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.e(awemeRawAd)) {
            i.a(this.f65805a.getContext(), aweme, this.f65805a);
        }
    }

    public b(View view) {
        l.d(view, "");
        View findViewById = view.findViewById(R.id.ec);
        l.b(findViewById, "");
        this.f65805a = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.ed);
        l.b(findViewById2, "");
        this.f65806b = (FrameLayout) findViewById2;
    }
}
