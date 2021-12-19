package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp.utils.a;
import org.greenrobot.eventbus.j;

public class ShopAdCardAction extends AbsAdCardAction implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private int f76017i;

    static {
        Covode.recordClassIndex(46887);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void e() {
        super.e();
        if (this.f76017i == 0) {
            a(new b.a().a("click").b("card").a(this.f75996c).a());
            if (!n.a(this.f75995b, this.f75996c) && !a.a(this.f75995b, this.f75996c) && !w.e(this.f75995b, this.f75996c, 2)) {
                n.a(this.f75995b, this.f75996c, (String) null, (String) null);
            }
        }
    }

    public ShopAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        boolean z;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme) != null) {
            this.f76017i = com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme).getCardStyle();
        }
        if (this.f76017i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f75999f = z;
        this.f75990a = 2131232524;
    }
}
