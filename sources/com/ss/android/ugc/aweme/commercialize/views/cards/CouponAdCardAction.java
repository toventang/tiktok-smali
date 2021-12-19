package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.event.d;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import org.greenrobot.eventbus.j;

public class CouponAdCardAction extends AbsAdCardAction implements au, j {
    static {
        Covode.recordClassIndex(46865);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void d() {
        super.d();
        CardStruct e2 = b.e(this.f75996c);
        if (e2 != null && e2.getCardStyle() != 2 && this.f75997d.d() != null) {
            this.f75997d.d().setBackgroundResource(R.drawable.pe);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void e() {
        super.e();
        a(new b.a().a("click").b("card").a(this.f75996c).a());
        c.a(new d(this.f75996c, 17));
    }

    public CouponAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75990a = 2131231768;
        this.f75999f = true;
    }
}
