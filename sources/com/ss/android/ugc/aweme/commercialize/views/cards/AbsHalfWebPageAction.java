package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.e;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.commercialize.utils.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.greenrobot.eventbus.EventBus;

public abstract class AbsHalfWebPageAction implements u<b>, ai, ai {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f75994h = true;

    /* renamed from: b  reason: collision with root package name */
    protected Context f75995b;

    /* renamed from: c  reason: collision with root package name */
    protected Aweme f75996c;

    /* renamed from: d  reason: collision with root package name */
    protected ae f75997d;

    /* renamed from: e  reason: collision with root package name */
    protected DataCenter f75998e = new DataCenter();

    /* renamed from: f  reason: collision with root package name */
    protected boolean f75999f = false;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f76000g = false;

    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public void e() {
        j();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai
    public final boolean i() {
        return this.f76000g;
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        j();
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        j();
    }

    public void g() {
        j();
        this.f76000g = true;
    }

    public void h() {
        j();
        this.f76000g = false;
    }

    static {
        Covode.recordClassIndex(46863);
    }

    /* access modifiers changed from: protected */
    public final void j() {
        getClass().getSimpleName();
        hashCode();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai
    public final void c() {
        this.f75998e.a(this);
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        j();
        this.f75997d.b().getLifecycle().b(this);
    }

    /* access modifiers changed from: protected */
    public void b() {
        DataCenter dataCenter = this.f75998e;
        if (dataCenter != null) {
            dataCenter.a("ON_AD_HALF_WEB_PAGE_SHOW", (u<b>) this);
            this.f75998e.a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (u<b>) this);
            this.f75998e.a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (u<b>) this);
            this.f75998e.a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (u<b>) this);
            this.f75998e.a("ON_AD_HALF_WEB_PAGE_HIDE", (u<b>) this);
            this.f75998e.a("ON_AD_HALF_WEB_PAGE_EXPAND", (u<b>) this);
            this.f75998e.a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (u<b>) this);
            this.f75998e.a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (u<b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai
    public void f() {
        j();
        a(new b.a().a("close").b("card").a(this.f75996c).f(com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c)).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
    }

    public void d() {
        j();
        a(new b.a().a("othershow").b("card").a(this.f75996c).a(d.d(this.f75996c)).f(com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c)).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
        if (this.f75999f) {
            this.f75997d.a(false);
        }
    }

    public void b(String str) {
        j();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai
    public final void a(DataCenter dataCenter) {
        this.f75998e = dataCenter;
        b();
    }

    /* access modifiers changed from: protected */
    public final void a(com.ss.android.ugc.aweme.commercialize.utils.b bVar) {
        j();
        j.a(this.f75995b, bVar);
        b(bVar);
    }

    public void a(String str) {
        j();
        a(new b.a().a("othershow_fail").b("card").c(str).a(this.f75996c).a(d.d(this.f75996c)).f(com.ss.android.ugc.aweme.commercialize.e.a.b.t(this.f75996c)).a(com.ss.android.ugc.aweme.commercialize.e.a.b.u(this.f75996c)).a());
    }

    private void b(com.ss.android.ugc.aweme.commercialize.utils.b bVar) {
        String str;
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(bVar.f75623a)) {
            if (f75994h || bVar.f75623a.getAwemeRawAd() != null) {
                AwemeRawAd awemeRawAd = bVar.f75623a.getAwemeRawAd();
                String str2 = bVar.f75624b;
                str2.hashCode();
                if (!str2.equals("othershow")) {
                    if (str2.equals("click")) {
                        aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new a(awemeRawAd));
                    }
                } else if (awemeRawAd.getCardInfos() != null) {
                    String str3 = bVar.f75625c;
                    TextUtils.equals(str3, "card");
                    if (TextUtils.equals(str3, "coupon")) {
                        str = "4";
                    } else {
                        str = "3";
                    }
                    if (awemeRawAd.getCardInfos().containsKey(str)) {
                        aj.a("othershow", awemeRawAd.getCardInfos().get(str).getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new b(this));
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: a */
    public void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1528248849:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND")) {
                        g();
                        return;
                    }
                    return;
                case -1501644853:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_CLICK_COVER")) {
                        e();
                        return;
                    }
                    return;
                case -1393672249:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL")) {
                        bVar.a();
                        j();
                        return;
                    }
                    return;
                case -201580690:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL")) {
                        b((String) bVar.a());
                        return;
                    }
                    return;
                case 995285931:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW_FAIL")) {
                        a((String) bVar.a());
                        return;
                    }
                    return;
                case 1538688450:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_COLLAPSE")) {
                        h();
                        return;
                    }
                    return;
                case 2116917719:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_HIDE")) {
                        e eVar = (e) bVar.a();
                        if (eVar == null || eVar.f74884b) {
                            f();
                            return;
                        }
                        return;
                    }
                    return;
                case 2117244818:
                    if (str.equals("ON_AD_HALF_WEB_PAGE_SHOW")) {
                        d();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ f.b a(f.b bVar, Boolean bool) {
        if (bool.booleanValue()) {
            return bVar.b(this.f75996c);
        }
        return bVar.a(this.f75996c);
    }

    public AbsHalfWebPageAction(Context context, Aweme aweme, ae aeVar) {
        this.f75995b = context;
        this.f75996c = aweme;
        this.f75997d = aeVar;
        aeVar.b().getLifecycle().a(this);
    }
}
