package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import org.greenrobot.eventbus.j;

public class CouponAdCardActionV2 extends AbsAdCardActionV2 implements au, j {
    static {
        Covode.recordClassIndex(46866);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void d() {
        CardStruct f2;
        super.d();
        if (b.f73781b.a() != null && (f2 = b.f73781b.a().f(this.f76003c)) != null && f2.getCardStyle() != 2 && this.f76004d.d() != null) {
            this.f76004d.d().setBackgroundResource(R.drawable.pe);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void e() {
        super.e();
        a(new b.a().a("click").b("card").a(this.f76003c).a());
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().i(this.f76003c);
        }
    }

    public CouponAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75992a = 2131232527;
        this.f76006f = true;
    }
}
