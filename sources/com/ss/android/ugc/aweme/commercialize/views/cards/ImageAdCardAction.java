package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.utils.b.e;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp.utils.a;
import org.greenrobot.eventbus.j;

public class ImageAdCardAction extends AbsAdCardAction implements au, j {
    static {
        Covode.recordClassIndex(46875);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void e() {
        super.e();
        a(new b.a().a("click").b("card").a(this.f75996c).a());
        if (n.a(this.f75995b, this.f75996c)) {
            return;
        }
        if (TextUtils.equals(this.f75996c.getAwemeRawAd().getType(), "app")) {
            if (this.f75996c.getAwemeRawAd().getWebType() != 1 || TextUtils.isEmpty(this.f75996c.getAwemeRawAd().getWebUrl())) {
                w.d(this.f75995b, this.f75996c);
            } else {
                n.a(this.f75995b, this.f75996c, (String) null, (String) null);
            }
        } else if (!a.a(this.f75995b, this.f75996c) && !w.e(this.f75995b, this.f75996c, 33) && !w.a(this.f75995b, 33)) {
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.E(this.f75996c) || TextUtils.isEmpty(com.ss.android.ugc.aweme.commercialize.e.a.b.b(this.f75996c)) || com.ss.android.ugc.aweme.commercialize.e.a.b.F(this.f75996c)) {
                n.a(this.f75995b, this.f75996c, (String) null, (String) null);
            } else {
                e.a(this.f75995b, "click_ad_card");
            }
        }
    }

    public ImageAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75990a = 2131232526;
        this.f75999f = true;
    }
}
