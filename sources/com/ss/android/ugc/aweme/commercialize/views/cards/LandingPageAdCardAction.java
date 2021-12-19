package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp.utils.a;

public class LandingPageAdCardAction extends AbsHalfWebPageAction implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final String f76012a = LandingPageAdCardAction.class.getSimpleName();

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(46879);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void d() {
        super.d();
        if (this.f75996c.getAwemeRawAd() != null && !this.f75996c.getAwemeRawAd().getDisableAutoTrackClick()) {
            a(new b.a().a("click").b("card").a(this.f75996c).a(d.d(this.f75996c)).a());
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void e() {
        super.e();
        a(new b.a().a("otherclick").b("card").a(this.f75996c).a());
        if (!n.a(this.f75995b, this.f75996c) && !a.a(this.f75995b, this.f75996c)) {
            if (!w.e(this.f75995b, this.f75996c, 33)) {
                n.a(this.f75995b, this.f75996c, (String) null, (String) null);
            } else {
                return;
            }
        }
        if (this.f75996c.getAwemeRawAd() != null && this.f75996c.getAwemeRawAd().getDisableAutoTrackClick()) {
            a(new b.a().a("click").b("card").a(this.f75996c).a());
        }
    }

    public LandingPageAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75999f = true;
    }
}
