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

public class TopPageAction extends AbsAdCardAction implements au, j {

    /* renamed from: i  reason: collision with root package name */
    public a f76019i;

    /* renamed from: j  reason: collision with root package name */
    public int f76020j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f76021k = true;

    public interface a {
        static {
            Covode.recordClassIndex(46892);
        }

        void a(d dVar);
    }

    static {
        Covode.recordClassIndex(46891);
    }

    @Override // org.greenrobot.eventbus.i, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public Map<Integer, Object> getSubscriberEventTypes() {
        Map<Integer, Object> subscriberEventTypes = super.getSubscriberEventTypes();
        subscriberEventTypes.put(62, new g(TopPageAction.class, "onEvent", AdCardClose.class, ThreadMode.POSTING, 0, false));
        return subscriberEventTypes;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction, androidx.lifecycle.k, com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final boolean k() {
        if (this.f76020j == 8) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void b() {
        if (this.f75998e != null) {
            this.f75998e.a("ON_AD_TOP_WEB_PAGE_SHOW", (u<b>) this);
            this.f75998e.a("ON_AD_TOP_WEB_PAGE_SHOW_FAIL", (u<b>) this);
            this.f75998e.a("ON_AD_TOP_WEB_PAGE_HIDE", (u<b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void d() {
        j();
        this.f76000g = true;
        this.f75997d.a("javascript:window.creative_showModal()");
        a(new b.a().a("othershow").b("coupon").a(this.f75996c).f(com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c)).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void f() {
        j();
        this.f76000g = false;
        this.f75997d.a("javascript:window.creative_dismissModal()");
        if (this.f76021k) {
            a(new b.a().a("close").b("coupon").a(this.f75996c).f(com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c)).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction
    public final void a(d dVar) {
        a aVar = this.f76019i;
        if (aVar != null) {
            aVar.a(dVar);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    @r
    public void onEvent(AdCardClose adCardClose) {
        j();
        this.f76021k = false;
        this.f75998e.a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
    public final void a(String str) {
        j();
        a(new b.a().a("othershow_fail").b("coupon").c(str).a(this.f75996c).f(com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c)).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction
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

    public TopPageAction(Context context, Aweme aweme, ae aeVar) {
        super(context, aweme, aeVar);
        this.f75990a = 2131233116;
    }
}
