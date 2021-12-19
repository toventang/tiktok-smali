package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.event.AdCardClose;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public class TopPageActionV2 extends AbsAdCardActionV2 implements au, j {

    /* renamed from: i  reason: collision with root package name */
    public a f76022i;

    /* renamed from: j  reason: collision with root package name */
    public int f76023j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f76024k = true;

    public interface a {
        static {
            Covode.recordClassIndex(46894);
        }

        void a(d dVar);
    }

    static {
        Covode.recordClassIndex(46893);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(62, new g(TopPageActionV2.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final boolean k() {
        if (this.f76023j == 8) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void b() {
        if (this.f76005e != null) {
            this.f76005e.a("ON_AD_TOP_WEB_PAGE_SHOW", (u<b>) this);
            this.f76005e.a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (u<b>) this);
            this.f76005e.a("ON_AD_TOP_WEB_PAGE_HIDE", (u<b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void d() {
        String str;
        long j2;
        j();
        this.f76007g = true;
        this.f76004d.a("javascript:window.creative_showModal()");
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            str = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().d(this.f76003c);
            j2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().e(this.f76003c);
        } else {
            str = "";
            j2 = 0;
        }
        a(new b.a().a("othershow").b("coupon").a(this.f76003c).f(str).a(j2).a());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void f() {
        String str;
        long j2;
        j();
        this.f76007g = false;
        this.f76004d.a("javascript:window.creative_dismissModal()");
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            str = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().d(this.f76003c);
            j2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().e(this.f76003c);
        } else {
            str = "";
            j2 = 0;
        }
        if (this.f76024k) {
            a(new b.a().a("close").b("coupon").a(this.f76003c).f(str).a(j2).a());
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardActionV2
    public final void a(d dVar) {
        a aVar = this.f76022i;
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    @r
    public void onEvent(AdCardClose adCardClose) {
        j();
        this.f76024k = false;
        this.f76005e.a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1923750303:
                    if (str.equals("ON_AD_TOP_WEB_PAGE_SHOW_FAIL")) {
                        a((String) bVar.a());
                        return;
                    }
                    return;
                case -200264351:
                    if (str.equals("ON_AD_TOP_WEB_PAGE_HIDE")) {
                        f();
                        return;
                    }
                    return;
                case -199937252:
                    if (str.equals("ON_AD_TOP_WEB_PAGE_SHOW")) {
                        d();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageActionV2
    public final void a(String str) {
        String str2;
        long j2;
        j();
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            str2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().d(this.f76003c);
            j2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().e(this.f76003c);
        } else {
            str2 = "";
            j2 = 0;
        }
        a(new b.a().a("othershow_fail").b("coupon").c(str).a(this.f76003c).f(str2).a(j2).a());
    }

    public TopPageActionV2(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75992a = 2131233116;
    }
}
