package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.ss.android.ugc.aweme.commercialize.event.e;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.d.a.c;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class FormAdCardAction extends AbsAdCardAction implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private boolean f76010i;

    static {
        Covode.recordClassIndex(46871);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(62, new g(FormAdCardAction.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void f() {
        if (!this.f76010i && !i()) {
            super.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void g() {
        super.g();
        this.f75997d.a("javascript:window.dialogPopUp()");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void e() {
        super.e();
        a(new b.a().a("click").b("card").a(this.f75996c).a());
        if (w.a(this.f75995b, 33)) {
            this.f76010i = false;
            f();
            return;
        }
        c.a(new e(this.f75996c, 2));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void h() {
        AwemeRawAd awemeRawAd;
        super.h();
        if (!this.f76010i) {
            com.ss.android.ugc.aweme.commercialize.log.j.x(this.f75995b, this.f75996c);
            if (this.f75996c != null) {
                awemeRawAd = this.f75996c.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            a.a("feed_form", "click_cancel", awemeRawAd).c();
        }
    }

    @r
    public void onEvent(AdCardClose adCardClose) {
        this.f76010i = false;
        this.f75998e.a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void b(String str) {
        AwemeRawAd awemeRawAd;
        super.b(str);
        com.ss.android.ugc.aweme.commercialize.log.j.y(this.f75995b, this.f75996c);
        if (this.f75996c != null) {
            awemeRawAd = this.f75996c.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        a.a("feed_form", "load_fail", awemeRawAd).c();
    }

    public FormAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75999f = true;
    }
}
