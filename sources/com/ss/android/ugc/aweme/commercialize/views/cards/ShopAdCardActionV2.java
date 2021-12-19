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
import org.greenrobot.eventbus.j;

public class ShopAdCardActionV2 extends AbsAdCardActionV2 implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private int f76018i;

    static {
        Covode.recordClassIndex(46888);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void e() {
        if (b.f73781b.a() != null) {
            super.e();
            if (this.f76018i == 0) {
                a(new b.a().a("click").b("card").a(this.f76003c).a());
                if (!com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, this.f76003c) && !com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().b(this.f76002b, this.f76003c) && !com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, this.f76003c, 2)) {
                    com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().c(this.f76002b, this.f76003c);
                }
            }
        }
    }

    public ShopAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        boolean z;
        CardStruct f2;
        if (!(com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() == null || (f2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().f(aweme)) == null)) {
            this.f76018i = f2.getCardStyle();
        }
        if (this.f76018i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f76006f = z;
        this.f75992a = 2131232527;
    }
}
