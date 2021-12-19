package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.greenrobot.eventbus.j;

public class ImageAdCardActionV2 extends AbsAdCardActionV2 implements au, j {
    static {
        Covode.recordClassIndex(46876);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void e() {
        if (b.f73781b.a() != null) {
            super.e();
            a(new b.a().a("click").b("card").a(this.f76003c).a());
            if (!com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, this.f76003c) && !com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().b(this.f76002b, this.f76003c) && !com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, this.f76003c, 33) && !com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b)) {
                if (!com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().k(this.f76003c) || TextUtils.isEmpty(com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().l(this.f76003c)) || com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().m(this.f76003c)) {
                    com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().c(this.f76002b, this.f76003c);
                } else {
                    com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, "click_ad_card");
                }
            }
        }
    }

    public ImageAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75992a = 2131232526;
        this.f76006f = true;
    }
}
