package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.model.ChooseLogAdExtraData;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class PollAdCardAction extends AbsAdCardAction implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private ChooseLogAdExtraData f76013i;

    static {
        Covode.recordClassIndex(46882);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(248, new g(PollAdCardAction.class, "userChooseEvent", ChooseLogAdExtraData.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void d() {
        j();
        b.a e2 = new b.a().a("othershow").b("card").d("vote").e("before");
        Aweme aweme = this.f75996c;
        l.b(aweme, "");
        b.a a2 = e2.a(aweme).a(d.d(this.f75996c));
        String t = com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c);
        l.b(t, "");
        a(a2.f(t).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void f() {
        JSONObject adExtraData;
        String optString;
        j();
        b.a d2 = new b.a().a("close").b("card").d("vote");
        ChooseLogAdExtraData chooseLogAdExtraData = this.f76013i;
        String str = "before";
        if (!(chooseLogAdExtraData == null || (adExtraData = chooseLogAdExtraData.getAdExtraData()) == null || (optString = adExtraData.optString("status", str)) == null)) {
            str = optString;
        }
        b.a e2 = d2.e(str);
        Aweme aweme = this.f75996c;
        l.b(aweme, "");
        b.a a2 = e2.a(aweme);
        String t = com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c);
        l.b(t, "");
        a(a2.f(t).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
    }

    @r
    public final void userChooseEvent(ChooseLogAdExtraData chooseLogAdExtraData) {
        l.d(chooseLogAdExtraData, "");
        this.f76013i = chooseLogAdExtraData;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void a(String str) {
        j();
        b.a d2 = new b.a().a("othershow_fail").b("card").c(String.valueOf(str)).d("vote");
        Aweme aweme = this.f75996c;
        l.b(aweme, "");
        b.a a2 = d2.a(aweme).a(d.d(this.f75996c));
        String t = com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c);
        l.b(t, "");
        a(a2.f(t).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollAdCardAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        l.d(aeVar, "");
    }
}
