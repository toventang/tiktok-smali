package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.event.e;
import com.ss.android.ugc.aweme.commercialize.f;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.FeedLiveAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.GeneralAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.InteractAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.PollAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.SurveyAdCardAction;
import com.ss.android.ugc.aweme.commercialize.views.cards.ab;
import com.ss.android.ugc.aweme.commercialize.views.cards.ae;
import com.ss.android.ugc.aweme.commercialize.views.cards.ai;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.i.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.co;
import com.ss.android.ugc.aweme.video.v;
import h.f.b.l;
import h.f.b.m;

public final class a implements t {
    static {
        Covode.recordClassIndex(45404);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(String str, AwemeRawAd awemeRawAd) {
        l.d(str, "");
        if (awemeRawAd != null && str.hashCode() == 94750088 && str.equals("click")) {
            aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new b(awemeRawAd));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean a(Context context, Aweme aweme, int i2) {
        return w.e(context, aweme, i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(boolean z) {
        if (z) {
            com.ss.android.ugc.d.a.c.a(new j(true));
        } else {
            com.ss.android.ugc.d.a.c.a(new j(false));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean a(Context context, Aweme aweme) {
        return n.a(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean a() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return g2.isLogin();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean b() {
        return co.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void g() {
        v.O().y();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean e() {
        h a2 = h.a();
        l.b(a2, "");
        return a2.f93344g;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void f() {
        v.O().B();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void c() {
        h a2 = h.a();
        l.b(a2, "");
        a2.f93343f = true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean d() {
        h a2 = h.a();
        l.b(a2, "");
        return a2.f93343f;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void s(Aweme aweme) {
        com.ss.android.ugc.aweme.commercialize.e.a.b.o(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean a(Context context) {
        return w.a(context, 33);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final long e(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.u(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final CardStruct f(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean h(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean k(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final String l(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.b(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean m(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.F(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean n(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.d(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final CardStruct o(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.ar(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean p(Aweme aweme) {
        return com.ss.android.ugc.aweme.utils.v.b(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean q(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean r(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.l(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final ae b(Aweme aweme) {
        Bundle a2 = d.a(aweme);
        l.b(a2, "");
        return ab.a.a(a2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final ae c(Aweme aweme) {
        Bundle b2 = d.b(aweme);
        l.b(b2, "");
        return ab.a.a(b2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final String d(Aweme aweme) {
        String t = com.ss.android.ugc.aweme.commercialize.e.a.b.t(aweme);
        l.b(t, "");
        return t;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean g(Aweme aweme) {
        return d.d(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void i(Aweme aweme) {
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.d(aweme, 17));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void j(Aweme aweme) {
        com.ss.android.ugc.d.a.c.a(new e(aweme, 2));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(Aweme aweme) {
        com.ss.android.ugc.aweme.web.jsbridge.a.f144955c = com.ss.android.ugc.aweme.commercialize.e.a.b.e(aweme);
        com.ss.android.ugc.aweme.web.jsbridge.a.f144956d = com.ss.android.ugc.aweme.commercialize.e.a.b.ar(aweme);
        com.ss.android.ugc.aweme.web.jsbridge.a.f144958f = 1;
        com.ss.android.ugc.aweme.web.jsbridge.a.f144959g = aweme;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(Context context, com.ss.android.ugc.aweme.commercialize.utils.b bVar) {
        com.ss.android.ugc.aweme.commercialize.log.j.a(context, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.a$a  reason: collision with other inner class name */
    public static final class C1653a extends com.ss.android.ugc.aweme.ad.feed.h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.base.a.a f73779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f73780b;

        static {
            Covode.recordClassIndex(45405);
        }

        @Override // com.ss.android.ugc.aweme.base.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            return this.f73779a.onKeyDown(i2, keyEvent);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1653a(com.ss.android.ugc.aweme.base.a.a aVar, Activity activity, Activity activity2) {
            super(activity2);
            this.f73779a = aVar;
            this.f73780b = activity;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean c(Context context, Aweme aweme) {
        return n.a(context, aweme, (String) null, (String) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final f a(Activity activity, com.ss.android.ugc.aweme.base.a.a aVar) {
        l.d(activity, "");
        l.d(aVar, "");
        return new C1653a(aVar, activity, activity);
    }

    static final class b extends m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ AwemeRawAd $rawAd;

        static {
            Covode.recordClassIndex(45406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AwemeRawAd awemeRawAd) {
            super(2);
            this.$rawAd = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$rawAd);
            } else {
                a2 = bVar2.a(this.$rawAd);
            }
            l.b(a2, "");
            return a2;
        }
    }

    static final class c extends m implements h.f.a.m<f.b, Boolean, f.b> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(45407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Aweme aweme) {
            super(2);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.b invoke(f.b bVar, Boolean bool) {
            f.b a2;
            f.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$aweme);
            } else {
                a2 = bVar2.a(this.$aweme);
            }
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(int i2, boolean z) {
        com.ss.android.ugc.aweme.commercialize.event.f fVar = new com.ss.android.ugc.aweme.commercialize.event.f(z);
        fVar.f74049b = i2;
        com.ss.android.ugc.d.a.c.a(fVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final boolean b(Context context, Aweme aweme) {
        return com.ss.android.ugc.aweme.miniapp.utils.a.a(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(Context context, String str) {
        l.d(str, "");
        if (context != null) {
            com.ss.android.ugc.aweme.commercialize.utils.b.e.a(context, "click_ad_card");
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(Aweme aweme, String str) {
        if (str == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.commercialize.utils.h.b(aweme, str, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(Aweme aweme, boolean z, String str) {
        if (z) {
            com.ss.android.ugc.aweme.commercialize.utils.h.a(aweme, true);
            return;
        }
        if (str == null) {
            str = "";
        }
        com.ss.android.ugc.aweme.commercialize.utils.h.a(aweme, str, true);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final void a(String str, UrlModel urlModel, Aweme aweme) {
        Long l2;
        l.d(str, "");
        if (aweme != null && aweme.getAwemeRawAd() != null && str.hashCode() == -1944956403 && str.equals("othershow")) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            String str2 = null;
            if (awemeRawAd != null) {
                l2 = awemeRawAd.getCreativeId();
            } else {
                l2 = null;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str2 = awemeRawAd2.getLogExtra();
            }
            aj.a("othershow", urlModel, l2, str2, new c(aweme));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.depend.t
    public final ai a(Integer num, Context context, Aweme aweme, ae aeVar) {
        l.d(aeVar, "");
        if (num != null) {
            if (num.intValue() == 2) {
                return new DownloadAdCardAction(context, aweme, aeVar);
            }
            if (num.intValue() == 3) {
                return new ShopAdCardAction(context, aweme, aeVar);
            }
            if (num != null) {
                if (num.intValue() == 1) {
                    return new FormAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 4) {
                    return new ImageAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 5) {
                    return new InteractAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 6) {
                    return new PollAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 7) {
                    return new SurveyAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 8 || num.intValue() == 9) {
                    return new CouponAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 11) {
                    return new SelectAdCardAction(context, aweme, aeVar);
                }
                if (num.intValue() == 12) {
                    if (aweme == null || !aweme.isLive()) {
                        return new GeneralAdCardAction(context, aweme, aeVar);
                    }
                    return new FeedLiveAdCardAction(context, aweme, aeVar);
                }
            }
        }
        return new LandingPageAdCardAction(context, aweme, aeVar);
    }
}
