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
import com.ss.android.ugc.aweme.commercialize.model.e;
import com.ss.android.ugc.aweme.commercialize.utils.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.greenrobot.eventbus.EventBus;

public abstract class AbsHalfWebPageActionV2 implements u<b>, ai, ai {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ boolean f76001h = true;

    /* renamed from: b  reason: collision with root package name */
    protected Context f76002b;

    /* renamed from: c  reason: collision with root package name */
    protected Aweme f76003c;

    /* renamed from: d  reason: collision with root package name */
    protected ae f76004d;

    /* renamed from: e  reason: collision with root package name */
    protected DataCenter f76005e = new DataCenter();

    /* renamed from: f  reason: collision with root package name */
    protected boolean f76006f = false;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f76007g = false;

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
        return this.f76007g;
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
        this.f76007g = true;
    }

    public void h() {
        j();
        this.f76007g = false;
    }

    static {
        Covode.recordClassIndex(46864);
    }

    /* access modifiers changed from: protected */
    public final void j() {
        getClass().getSimpleName();
        hashCode();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai
    public final void c() {
        this.f76005e.a(this);
        if (EventBus.a().a(this)) {
            EventBus.a().b(this);
        }
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        j();
        this.f76004d.b().getLifecycle().b(this);
    }

    /* access modifiers changed from: protected */
    public void b() {
        DataCenter dataCenter = this.f76005e;
        if (dataCenter != null) {
            dataCenter.a("ON_AD_HALF_WEB_PAGE_SHOW", (u<b>) this);
            this.f76005e.a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (u<b>) this);
            this.f76005e.a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", (u<b>) this);
            this.f76005e.a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (u<b>) this);
            this.f76005e.a("ON_AD_HALF_WEB_PAGE_HIDE", (u<b>) this);
            this.f76005e.a("ON_AD_HALF_WEB_PAGE_EXPAND", (u<b>) this);
            this.f76005e.a("ON_AD_HALF_WEB_PAGE_EXPAND_FAIL", (u<b>) this);
            this.f76005e.a("ON_AD_HALF_WEB_PAGE_COLLAPSE", (u<b>) this);
        }
    }

    public void d() {
        String str;
        long j2;
        boolean z;
        j();
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            z = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().g(this.f76003c);
            str = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().d(this.f76003c);
            j2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().e(this.f76003c);
        } else {
            str = "";
            j2 = 0;
            z = false;
        }
        a(new b.a().a("othershow").b("card").a(this.f76003c).a(z).f(str).a(j2).a());
        if (this.f76006f) {
            this.f76004d.a(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai
    public void f() {
        String str;
        long j2;
        j();
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            str = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().d(this.f76003c);
            j2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().e(this.f76003c);
        } else {
            str = "";
            j2 = 0;
        }
        a(new b.a().a("close").b("card").a(this.f76003c).f(str).a(j2).a());
    }

    public void b(String str) {
        j();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ai
    public final void a(DataCenter dataCenter) {
        this.f76005e = dataCenter;
        b();
    }

    /* access modifiers changed from: protected */
    public final void a(com.ss.android.ugc.aweme.commercialize.utils.b bVar) {
        j();
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76002b, bVar);
        }
        b(bVar);
    }

    public void a(String str) {
        boolean z;
        String str2;
        long j2;
        j();
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            z = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().g(this.f76003c);
            str2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().d(this.f76003c);
            j2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().e(this.f76003c);
        } else {
            z = false;
            str2 = "";
            j2 = 0;
        }
        a(new b.a().a("othershow_fail").b("card").c(str).a(this.f76003c).a(z).f(str2).a(j2).a());
    }

    private void b(com.ss.android.ugc.aweme.commercialize.utils.b bVar) {
        String str;
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null && com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().h(bVar.f75623a)) {
            if (f76001h || bVar.f75623a.getAwemeRawAd() != null) {
                AwemeRawAd awemeRawAd = bVar.f75623a.getAwemeRawAd();
                String str2 = bVar.f75624b;
                str2.hashCode();
                if (!str2.equals("othershow")) {
                    if (str2.equals("click") && com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
                        com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a("click", awemeRawAd);
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
                        CardStruct cardStruct = awemeRawAd.getCardInfos().get(str);
                        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
                            com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a("othershow", cardStruct.getTrackUrlList(), this.f76003c);
                        }
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

    public AbsHalfWebPageActionV2(Context context, Aweme aweme, ae aeVar) {
        this.f76002b = context;
        this.f76003c = aweme;
        this.f76004d = aeVar;
        aeVar.b().getLifecycle().a(this);
    }
}
