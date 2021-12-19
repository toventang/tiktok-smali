package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAdCardService;
import com.ss.android.ugc.aweme.commercialize.depend.t;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.commercialize.utils.h;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.cards.ab;
import com.ss.android.ugc.aweme.commercialize.views.cards.ae;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.s.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e implements u<b>, af {

    /* renamed from: a  reason: collision with root package name */
    public Context f76066a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f76067b;

    /* renamed from: c  reason: collision with root package name */
    public AdHalfWebPageContainer f76068c;

    /* renamed from: d  reason: collision with root package name */
    public AdHalfWebPageMaskLayer f76069d;

    /* renamed from: e  reason: collision with root package name */
    public i f76070e;

    /* renamed from: f  reason: collision with root package name */
    public ai f76071f;

    /* renamed from: g  reason: collision with root package name */
    public int f76072g;

    /* renamed from: h  reason: collision with root package name */
    TopPageAction f76073h;

    /* renamed from: i  reason: collision with root package name */
    public AdHalfWebPageMaskLayer f76074i;

    /* renamed from: j  reason: collision with root package name */
    Integer f76075j;

    /* renamed from: k  reason: collision with root package name */
    Integer f76076k;

    /* renamed from: l  reason: collision with root package name */
    Integer f76077l;

    /* renamed from: m  reason: collision with root package name */
    public DataCenter f76078m;
    Handler n;
    Runnable o;
    long p;
    long q;
    public aj r;
    boolean s;
    String t;
    boolean u;
    IAdCardService v;
    private AdHalfWebPageContainer w;
    private i x;
    private g y;
    private com.ss.android.ugc.aweme.ad.feed.h.b z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e f76088a = new e((byte) 0);

        static {
            Covode.recordClassIndex(46931);
        }
    }

    static {
        Covode.recordClassIndex(46923);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void f() {
        if (!this.s) {
            h();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void g() {
        if (!this.s) {
            i();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void e() {
        if (!this.s) {
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = this.f76069d;
            if (adHalfWebPageMaskLayer != null && adHalfWebPageMaskLayer.f75853a) {
                this.f76069d.c();
            }
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer2 = this.f76074i;
            if (adHalfWebPageMaskLayer2 != null && adHalfWebPageMaskLayer2.f75853a) {
                this.f76074i.c();
            }
        }
    }

    private e() {
        this.f76075j = -100;
        this.f76076k = -100;
        this.f76077l = 0;
        this.f76078m = new DataCenter();
        this.n = new Handler(Looper.getMainLooper());
        this.p = -1;
        this.q = -1;
        this.s = false;
        this.t = null;
        this.u = false;
        this.v = AdCardServiceImpl.c();
    }

    private void h() {
        if (this.o != null && this.p > 0 && this.q > 0) {
            this.q = System.currentTimeMillis();
            this.n.removeCallbacks(this.o);
            this.n.postDelayed(this.o, this.p);
        }
    }

    private void i() {
        if (this.o != null && this.q > 0) {
            long j2 = this.p;
            if (j2 > 0) {
                this.p = j2 - (System.currentTimeMillis() - this.q);
                this.n.removeCallbacks(this.o);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void b() {
        Context context;
        if (!this.s && (context = this.f76066a) != null && (context instanceof androidx.fragment.app.e)) {
            this.x = ((androidx.fragment.app.e) context).getSupportFragmentManager();
            if (d.c()) {
                if (((androidx.fragment.app.e) this.f76066a).findViewById(R.id.fl4) != null) {
                    a((Activity) this.f76066a, (int) R.id.fl4);
                }
                if (((androidx.fragment.app.e) this.f76066a).findViewById(R.id.flf) != null) {
                    a((Activity) this.f76066a, (int) R.id.flf);
                }
            }
            this.w = (AdHalfWebPageContainer) ((androidx.fragment.app.e) this.f76066a).findViewById(R.id.gt);
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = (AdHalfWebPageMaskLayer) ((androidx.fragment.app.e) this.f76066a).findViewById(R.id.gu);
            this.f76074i = adHalfWebPageMaskLayer;
            if (this.x != null && this.w != null && adHalfWebPageMaskLayer != null) {
                CardStruct ar = com.ss.android.ugc.aweme.commercialize.e.a.b.ar(this.f76067b);
                if (ar == null) {
                    this.w.setVisibility(8);
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.w.getLayoutParams();
                layoutParams.height = com.ss.android.ugc.aweme.commercialize.utils.i.a(ar, this.w);
                layoutParams.bottomMargin = (layoutParams.height + 5) * -1;
                this.w.b();
                this.w.setLayoutParams(layoutParams);
                this.f76074i.b();
                n a2 = this.x.a();
                ab a3 = ab.a.a(com.ss.android.ugc.aweme.commercialize.utils.d.b(this.f76067b));
                a3.a(new ae.a() {
                    /* class com.ss.android.ugc.aweme.commercialize.views.cards.e.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(46925);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                    public final void a() {
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                    public final void b() {
                        e.this.f76078m.a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
                    }
                });
                TopPageAction topPageAction = new TopPageAction(this.f76066a, this.f76067b, a3);
                this.f76073h = topPageAction;
                topPageAction.a(this.f76078m);
                this.f76073h.f76019i = new f(this);
                a2.a(R.id.gt, a3.c(), "card_tag_top_page");
                a2.b(a3.c()).c();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void c() {
        ae a2;
        IAdCardService iAdCardService = this.v;
        if (iAdCardService != null) {
            iAdCardService.b().f(this.f76067b);
        }
        if (!this.s) {
            this.s = true;
            AdHalfWebPageContainer adHalfWebPageContainer = this.f76068c;
            if (adHalfWebPageContainer != null && adHalfWebPageContainer.a()) {
                this.f76071f.f();
            }
            if (!(this.f76070e == null || a(false) == null)) {
                n a3 = this.f76070e.a();
                ae a4 = a(false);
                if (a4 != null) {
                    a3.a(a4.c());
                    a3.c();
                }
            }
            if ((this.f76066a instanceof androidx.fragment.app.e) && (a2 = a(true)) != null) {
                this.x.a().a(a2.c()).c();
            }
            ai aiVar = this.f76071f;
            if (aiVar != null) {
                aiVar.c();
                this.f76071f = null;
            }
            TopPageAction topPageAction = this.f76073h;
            if (topPageAction != null) {
                topPageAction.c();
                this.f76073h = null;
            }
            this.f76078m.a(this);
            Handler handler = this.n;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.n = null;
                this.o = null;
            }
            com.ss.android.ugc.aweme.commercialize.utils.i.g(this.f76067b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r4 = a(false);
     */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.cards.e.d():void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void a() {
        Integer num;
        float f2;
        if (!this.s) {
            int i2 = this.f76072g;
            if (i2 == 0 || i2 == 1) {
                CardStruct a2 = com.ss.android.ugc.aweme.commercialize.utils.i.a(this.f76067b);
                int width = this.f76068c.getWidth();
                int b2 = (int) com.bytedance.common.utility.n.b(this.f76066a, 138.0f);
                if (a2 != null) {
                    int cardStyle = a2.getCardStyle();
                    if (cardStyle != 0) {
                        if (cardStyle == 1) {
                            f2 = com.bytedance.common.utility.n.b(this.f76066a, 130.0f);
                        } else if (cardStyle == 2) {
                            width = (int) com.bytedance.common.utility.n.b(this.f76066a, 260.0f);
                        }
                    } else if (a2.getCardType() == 2) {
                        f2 = com.bytedance.common.utility.n.b(this.f76066a, 147.0f);
                    }
                    b2 = (int) f2;
                }
                this.f76068c.b(width, b2);
            } else if (i2 == 2) {
                int b3 = (int) com.bytedance.common.utility.n.b(this.f76066a, 112.0f);
                this.f76068c.b((int) (((float) com.bytedance.common.utility.n.a(this.f76066a)) - (com.bytedance.common.utility.n.b(this.f76066a, 12.0f) * 2.0f)), b3);
            }
            if (this.f76072g == 0) {
                com.ss.android.ugc.aweme.commercialize.utils.i.a(this.f76066a, this.f76067b, this.f76068c);
            }
            this.f76068c.setInCleanMode(false);
            this.f76068c.d();
            this.f76068c.b();
            this.f76069d.b();
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.d(this.f76067b)) {
                com.ss.android.ugc.aweme.web.jsbridge.a.f144955c = com.ss.android.ugc.aweme.commercialize.e.a.b.e(this.f76067b);
                com.ss.android.ugc.aweme.web.jsbridge.a.f144956d = com.ss.android.ugc.aweme.commercialize.e.a.b.ar(this.f76067b);
                com.ss.android.ugc.aweme.web.jsbridge.a.f144958f = 1;
                com.ss.android.ugc.aweme.web.jsbridge.a.f144959g = this.f76067b;
            }
            ab a3 = ab.a.a(com.ss.android.ugc.aweme.commercialize.utils.d.a(this.f76067b));
            Context context = this.f76066a;
            Aweme aweme = this.f76067b;
            l.d(a3, "");
            t a4 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a();
            if (a4 == null) {
                l.b();
            }
            CardStruct a5 = com.ss.android.ugc.aweme.commercialize.utils.i.a(aweme);
            if (a5 != null) {
                num = Integer.valueOf(a5.getCardType());
            } else {
                num = null;
            }
            ai a6 = a4.a(num, context, aweme, a3);
            this.f76071f = a6;
            a6.a(this.f76078m);
            a3.a(new ae.a() {
                /* class com.ss.android.ugc.aweme.commercialize.views.cards.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(46924);
                }

                @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                public final void a() {
                    e.this.f76078m.a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (Object) null);
                }

                @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                public final void b() {
                    if (e.this.f76071f == null || !e.this.f76071f.i()) {
                        e.this.f76078m.a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
                    } else {
                        e.this.f76078m.a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) true);
                    }
                }
            });
            View a7 = com.ss.android.ugc.aweme.commercialize.utils.i.a(this.f76068c);
            if (a7 != null) {
                n a8 = this.f76070e.a();
                a8.b(a7.getId(), a3.c(), "card_default");
                a8.c();
            }
            b();
            this.f76078m.a("ACTION_HALF_WEB_PAGE_SHOW", (u<b>) this);
            this.f76078m.a("ACTION_HALF_WEB_PAGE_HIDE", (u<b>) this);
            this.f76078m.a("ACTION_HALF_WEB_PAGE_COLLAPSE", (u<b>) this);
            this.f76078m.a("ACTION_HALF_WEB_PAGE_MOVE_OUT_OF_SCREEN", (u<b>) this);
            this.f76078m.a("ACTION_TOP_WEB_PAGE_HIDE", (u<b>) this);
            this.f76078m.a("ad_comment_dialog_visible", (u<b>) this);
            this.f76078m.a("ad_share_dialog_visible", (u<b>) this);
            this.f76078m.a("on_ad_light_web_page_show", (u<b>) this);
            this.f76078m.a("on_ad_light_web_page_hide", (u<b>) this);
            this.f76078m.a("ON_AD_COMMON_MASK_SHOW", (u<b>) this);
            this.f76078m.a("ON_AD_COMMON_MASK_HIDE", (u<b>) this);
            this.f76078m.a("ON_AD_FORM_MASK_SHOW", (u<b>) this);
            this.f76078m.a("ON_AD_FORM_MASK_HIDE", (u<b>) this);
            this.f76078m.a("ON_AD_LYNX_MASK_SHOW", (u<b>) this);
            this.f76078m.a("ON_AD_LYNX_MASK_HIDE", (u<b>) this);
            this.f76078m.a("ON_SIMILAR_ADVERT_DATA_RECEIVE", (u<b>) this);
            this.f76078m.a("ON_SIMILAR_ADVERT_HIDE", (u<b>) this);
            this.f76078m.a("ad_on_live_link_user_count_changed", (u<b>) this);
            this.f76078m.a("SET_HALF_WEB_PAGE_REAL_SHOW", (u<b>) this);
        }
    }

    /* synthetic */ e(byte b2) {
        this();
    }

    private void a(com.ss.android.ugc.aweme.commercialize.model.e eVar) {
        boolean z2;
        if (this.f76068c.a()) {
            AdHalfWebPageContainer adHalfWebPageContainer = this.f76068c;
            if (com.ss.android.ugc.aweme.commercialize.utils.i.f(this.f76067b) || this.f76072g == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            adHalfWebPageContainer.b(z2);
            this.f76078m.a("ON_AD_HALF_WEB_PAGE_HIDE_START", (Object) null);
            this.f76068c.postDelayed(new i(this), 200);
            this.f76078m.a("ON_AD_HALF_WEB_PAGE_HIDE", eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final String b(boolean z2) {
        boolean a2;
        ae a3 = a(z2);
        if (a3 == null) {
            return "data_load_fail";
        }
        boolean e2 = a3.e();
        if (z2) {
            a2 = a(e2, this.f76073h);
        } else {
            a2 = a(e2, this.f76071f);
        }
        if (a2) {
            return null;
        }
        if (!e2) {
            return "data_load_fail";
        }
        return "load_timeout";
    }

    /* access modifiers changed from: package-private */
    public final ae a(boolean z2) {
        if (z2) {
            i iVar = this.x;
            if (iVar == null) {
                return null;
            }
            Fragment a2 = iVar.a("card_tag_top_page");
            if (a2 instanceof ae) {
                return (ae) a2;
            }
            return null;
        }
        i iVar2 = this.f76070e;
        if (iVar2 == null) {
            return null;
        }
        Fragment a3 = iVar2.a("card_default");
        if (a3 instanceof ae) {
            return (ae) a3;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r3 = a(true);
     */
    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.cards.e.a(int):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @Override // androidx.lifecycle.u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b r7) {
        /*
        // Method dump skipped, instructions count: 766
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.cards.e.onChanged(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.f76078m.a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", str);
        h.b(this.f76067b, str, false);
        IAdCardService iAdCardService = this.v;
        if (iAdCardService != null) {
            iAdCardService.b().a(this.f76067b, str);
        }
    }

    private boolean a(boolean z2, ai aiVar) {
        if (this.f76071f instanceof AbsAdCardAction) {
            return ((AbsAdCardAction) aiVar).a();
        }
        return z2;
    }

    private static void a(Activity activity, int i2) {
        MethodCollector.i(2411);
        ((ViewStub) activity.findViewById(i2)).inflate();
        MethodCollector.o(2411);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void b(int i2, int i3) {
        if (!this.s) {
            if (i2 != 0 || i3 != 0) {
                ViewGroup.LayoutParams layoutParams = this.w.getLayoutParams();
                if (i2 != 0) {
                    layoutParams.width = com.ss.android.ugc.aweme.base.utils.n.a(this.f76066a, i2);
                }
                if (i3 != 0) {
                    layoutParams.height = com.ss.android.ugc.aweme.base.utils.n.a(this.f76066a, i3);
                }
                this.w.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void a(int i2, int i3) {
        if (!this.s) {
            if (i2 != 0 || i3 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f76068c.getLayoutParams();
                if (i2 != 0) {
                    layoutParams.width = com.ss.android.ugc.aweme.base.utils.n.a(this.f76066a, i2);
                }
                if (i3 != 0) {
                    layoutParams.height = com.ss.android.ugc.aweme.base.utils.n.a(this.f76066a, i3);
                }
                this.f76068c.setLayoutParams(layoutParams);
            }
        }
    }
}
