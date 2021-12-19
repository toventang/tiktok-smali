package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.depend.t;
import com.ss.android.ugc.aweme.commercialize.model.ChooseLogAdExtraData;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class PollAdCardActionV2 extends AbsAdCardActionV2 implements au, j {

    /* renamed from: i  reason: collision with root package name */
    private ChooseLogAdExtraData f76014i;

    static {
        Covode.recordClassIndex(46883);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public final Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(248, new g(PollAdCardActionV2.class, "userChooseEvent", ChooseLogAdExtraData.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void d() {
        long j2;
        String d2;
        j();
        b.a e2 = new b.a().a("othershow").b("card").d("vote").e("before");
        Aweme aweme = this.f76003c;
        String str = "";
        l.b(aweme, str);
        b.a a2 = e2.a(aweme);
        t a3 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        boolean z = true;
        if (a3 == null || !a3.g(this.f76003c)) {
            z = false;
        }
        b.a a4 = a2.a(z);
        t a5 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        if (!(a5 == null || (d2 = a5.d(this.f76003c)) == null)) {
            str = d2;
        }
        b.a f2 = a4.f(str);
        t a6 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        if (a6 != null) {
            j2 = a6.e(this.f76003c);
        } else {
            j2 = 0;
        }
        a(f2.a(j2).a());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void f() {
        long j2;
        String d2;
        JSONObject adExtraData;
        String optString;
        j();
        b.a d3 = new b.a().a("close").b("card").d("vote");
        ChooseLogAdExtraData chooseLogAdExtraData = this.f76014i;
        String str = "before";
        if (!(chooseLogAdExtraData == null || (adExtraData = chooseLogAdExtraData.getAdExtraData()) == null || (optString = adExtraData.optString("status", str)) == null)) {
            str = optString;
        }
        b.a e2 = d3.e(str);
        Aweme aweme = this.f76003c;
        String str2 = "";
        l.b(aweme, str2);
        b.a a2 = e2.a(aweme);
        t a3 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        if (!(a3 == null || (d2 = a3.d(this.f76003c)) == null)) {
            str2 = d2;
        }
        b.a f2 = a2.f(str2);
        t a4 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        if (a4 != null) {
            j2 = a4.e(this.f76003c);
        } else {
            j2 = 0;
        }
        a(f2.a(j2).a());
    }

    @r
    public final void userChooseEvent(ChooseLogAdExtraData chooseLogAdExtraData) {
        l.d(chooseLogAdExtraData, "");
        this.f76014i = chooseLogAdExtraData;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void a(String str) {
        long j2;
        String d2;
        j();
        b.a d3 = new b.a().a("othershow_fail").b("card").c(String.valueOf(str)).d("vote");
        Aweme aweme = this.f76003c;
        String str2 = "";
        l.b(aweme, str2);
        b.a a2 = d3.a(aweme);
        t a3 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        boolean z = true;
        if (a3 == null || !a3.g(this.f76003c)) {
            z = false;
        }
        b.a a4 = a2.a(z);
        t a5 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        if (!(a5 == null || (d2 = a5.d(this.f76003c)) == null)) {
            str2 = d2;
        }
        b.a f2 = a4.f(str2);
        t a6 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
        if (a6 != null) {
            j2 = a6.e(this.f76003c);
        } else {
            j2 = 0;
        }
        a(f2.a(j2).a());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollAdCardActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        l.d(aeVar, "");
    }
}
