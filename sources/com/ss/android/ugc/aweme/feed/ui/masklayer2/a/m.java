package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.model.b;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.helper.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class m extends n {

    /* renamed from: a  reason: collision with root package name */
    private final SharePackage f94900a;

    static {
        Covode.recordClassIndex(60191);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        User user;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        b dislikeInfo;
        User author;
        AwemeRawAd awemeRawAd2;
        ITalentAdRevenueShareService e2;
        l.d(view, "");
        ShareExtService shareExtService = ah.f123353b;
        Aweme aweme2 = this.f94901f;
        if (aweme2 == null) {
            l.b();
        }
        h a2 = shareExtService.a(aweme2, this.f94902g, "long_press");
        if (a2.f()) {
            Aweme aweme3 = this.f94901f;
            if (!(aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null || (e2 = TalentAdRevenueShareServiceImpl.e()) == null)) {
                l.b(awemeRawAd2, "");
                e2.a(awemeRawAd2);
            }
            u a3 = new u().a("homepage_hot");
            a3.f109596a = u.c.ITEM;
            a3.f109597b = u.a.DISLIKE;
            u f2 = a3.g(this.f94901f);
            Aweme aweme4 = this.f94901f;
            String str = null;
            if (aweme4 != null) {
                user = aweme4.getAuthor();
            } else {
                user = null;
            }
            u a4 = f2.a(user);
            Aweme aweme5 = this.f94901f;
            if (!(aweme5 == null || (author = aweme5.getAuthor()) == null)) {
                str = author.getRequestId();
            }
            a4.s(str).b();
            Aweme aweme6 = this.f94901f;
            if (aweme6 == null || !aweme6.isAd() || (aweme = this.f94901f) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
                a2.a(d.a(), this.f94900a);
            } else {
                Activity d2 = o.d(view);
                l.b(d2, "");
                a2.a(d2, this.f94900a);
            }
            if (TextUtils.equals(this.f94902g, "homepage_hot") && k.c()) {
                c.a(new com.ss.android.ugc.aweme.feed.i.l());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(a aVar, f fVar) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94900a = aVar.f94864a;
    }
}
