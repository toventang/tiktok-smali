package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.ss.android.ugc.aweme.commercialize.h.a.b;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public class FormAdCardActionV2 extends AbsAdCardActionV2 implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private boolean f76011i;

    static {
        Covode.recordClassIndex(46872);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(62, new g(FormAdCardActionV2.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void f() {
        if (!this.f76011i && !i()) {
            super.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void g() {
        super.g();
        this.f76004d.a("javascript:window.dialogPopUp()");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void h() {
        AwemeRawAd awemeRawAd;
        super.h();
        if (!this.f76011i) {
            Context context = this.f76002b;
            Aweme aweme = this.f76003c;
            i.a aVar = new i.a();
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            aVar.f74815a = awemeRawAd;
            aVar.f74817c = false;
            JSONObject a2 = aVar.a();
            l.b(a2, "");
            b.a(context, aweme, "click_cancel", a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void e() {
        super.e();
        a(new b.a().a("click").b("card").a(this.f76003c).a());
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null && com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b)) {
            this.f76011i = false;
            f();
        } else if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().j(this.f76003c);
        }
    }

    @r
    public void onEvent(AdCardClose adCardClose) {
        this.f76011i = false;
        this.f76005e.a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void b(String str) {
        AwemeRawAd awemeRawAd;
        super.b(str);
        Context context = this.f76002b;
        Aweme aweme = this.f76003c;
        i.a aVar = new i.a();
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        aVar.f74815a = awemeRawAd;
        aVar.f74817c = false;
        JSONObject a2 = aVar.a();
        l.b(a2, "");
        com.ss.android.ugc.aweme.commercialize.h.a.b.a(context, aweme, "load_fail", a2);
    }

    public FormAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f76006f = true;
    }
}
