package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public class LandingPageAdCardActionV2 extends AbsHalfWebPageActionV2 implements au {
    static {
        Covode.recordClassIndex(46880);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void d() {
        boolean z;
        super.d();
        if (b.f73781b.a() != null) {
            z = b.f73781b.a().g(this.f76003c);
        } else {
            z = false;
        }
        if (this.f76003c.getAwemeRawAd() != null && !this.f76003c.getAwemeRawAd().getDisableAutoTrackClick()) {
            a(new b.a().a("click").b("card").a(this.f76003c).a(z).a());
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void e() {
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            super.e();
            a(new b.a().a("otherclick").b("card").a(this.f76003c).a());
            if (!com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, this.f76003c) && !com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().b(this.f76002b, this.f76003c)) {
                if (!com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, this.f76003c, 33)) {
                    com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().c(this.f76002b, this.f76003c);
                } else {
                    return;
                }
            }
            if (this.f76003c.getAwemeRawAd() != null && this.f76003c.getAwemeRawAd().getDisableAutoTrackClick()) {
                a(new b.a().a("click").b("card").a(this.f76003c).a());
            }
        }
    }

    public LandingPageAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f76006f = true;
    }
}
