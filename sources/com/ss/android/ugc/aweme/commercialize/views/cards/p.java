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
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.ss.android.ugc.aweme.commercialize.IAdCardService;
import com.ss.android.ugc.aweme.commercialize.f;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.cards.ae;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.s.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class p implements u<b>, af {

    /* renamed from: a  reason: collision with root package name */
    public Context f76100a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f76101b;

    /* renamed from: c  reason: collision with root package name */
    public AdHalfWebPageContainer f76102c;

    /* renamed from: d  reason: collision with root package name */
    public AdHalfWebPageMaskLayer f76103d;

    /* renamed from: e  reason: collision with root package name */
    public i f76104e;

    /* renamed from: f  reason: collision with root package name */
    public ai f76105f;

    /* renamed from: g  reason: collision with root package name */
    public int f76106g;

    /* renamed from: h  reason: collision with root package name */
    TopPageActionV2 f76107h;

    /* renamed from: i  reason: collision with root package name */
    public AdHalfWebPageMaskLayer f76108i;

    /* renamed from: j  reason: collision with root package name */
    public DataCenter f76109j;

    /* renamed from: k  reason: collision with root package name */
    Handler f76110k;

    /* renamed from: l  reason: collision with root package name */
    Runnable f76111l;

    /* renamed from: m  reason: collision with root package name */
    long f76112m;
    long n;
    Integer o;
    Integer p;
    Integer q;
    public Object r;
    boolean s;
    String t;
    boolean u;
    private AdHalfWebPageContainer v;
    private i w;
    private g x;
    private f y;

    static {
        Covode.recordClassIndex(46942);
    }

    public static class a implements ag {

        /* renamed from: a  reason: collision with root package name */
        p f76121a = new p((byte) 0);

        static {
            Covode.recordClassIndex(46949);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* bridge */ /* synthetic */ af a() {
            return this.f76121a;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* bridge */ /* synthetic */ ag a(Context context) {
            this.f76121a.f76100a = context;
            return this;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* bridge */ /* synthetic */ ag a(i iVar) {
            this.f76121a.f76104e = iVar;
            return this;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* bridge */ /* synthetic */ ag a(DataCenter dataCenter) {
            this.f76121a.f76109j = dataCenter;
            return this;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* synthetic */ ag a(AdHalfWebPageContainer adHalfWebPageContainer) {
            boolean z;
            if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
                z = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().b();
            } else {
                z = false;
            }
            adHalfWebPageContainer.setUseZOrder(z);
            this.f76121a.f76102c = adHalfWebPageContainer;
            return this;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* bridge */ /* synthetic */ ag a(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f76121a.f76103d = adHalfWebPageMaskLayer;
            return this;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* bridge */ /* synthetic */ ag a(Aweme aweme) {
            this.f76121a.f76101b = aweme;
            return this;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ag
        public final /* bridge */ /* synthetic */ ag a(Object obj) {
            this.f76121a.r = obj;
            return this;
        }
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
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = this.f76103d;
            if (adHalfWebPageMaskLayer != null && adHalfWebPageMaskLayer.f75853a) {
                this.f76103d.c();
            }
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer2 = this.f76108i;
            if (adHalfWebPageMaskLayer2 != null && adHalfWebPageMaskLayer2.f75853a) {
                this.f76108i.c();
            }
        }
    }

    private p() {
        this.f76109j = new DataCenter();
        this.f76110k = new Handler(Looper.getMainLooper());
        this.f76112m = -1;
        this.n = -1;
        this.o = -100;
        this.p = -100;
        this.q = 0;
        this.s = false;
        this.t = null;
        this.u = false;
    }

    private void h() {
        if (this.f76111l != null && this.f76112m > 0 && this.n > 0) {
            this.n = System.currentTimeMillis();
            this.f76110k.removeCallbacks(this.f76111l);
            this.f76110k.postDelayed(this.f76111l, this.f76112m);
        }
    }

    private void i() {
        if (this.f76111l != null && this.n > 0) {
            long j2 = this.f76112m;
            if (j2 > 0) {
                this.f76112m = j2 - (System.currentTimeMillis() - this.n);
                this.f76110k.removeCallbacks(this.f76111l);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void c() {
        ae a2;
        ac.f76047a.f(this.f76101b);
        if (!this.s) {
            this.s = true;
            AdHalfWebPageContainer adHalfWebPageContainer = this.f76102c;
            if (adHalfWebPageContainer != null && adHalfWebPageContainer.a()) {
                this.f76105f.f();
            }
            if (!(this.f76104e == null || a(false) == null)) {
                n a3 = this.f76104e.a();
                ae a4 = a(false);
                if (a4 != null) {
                    a3.a(a4.c());
                    a3.c();
                }
            }
            if ((this.f76100a instanceof e) && (a2 = a(true)) != null) {
                this.w.a().a(a2.c()).c();
            }
            ai aiVar = this.f76105f;
            if (aiVar != null) {
                aiVar.c();
                this.f76105f = null;
            }
            TopPageActionV2 topPageActionV2 = this.f76107h;
            if (topPageActionV2 != null) {
                topPageActionV2.c();
                this.f76107h = null;
            }
            this.f76109j.a(this);
            Handler handler = this.f76110k;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f76110k = null;
                this.f76111l = null;
            }
            com.ss.android.ugc.aweme.commercialize.utils.i.g(this.f76101b);
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.cards.p.d():void");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void a() {
        ae b2;
        float f2;
        if (!this.s) {
            int i2 = this.f76106g;
            if (i2 == 0 || i2 == 1) {
                CardStruct a2 = com.ss.android.ugc.aweme.commercialize.utils.i.a(this.f76101b);
                int width = this.f76102c.getWidth();
                int b3 = (int) com.bytedance.common.utility.n.b(this.f76100a, 138.0f);
                if (a2 != null) {
                    int cardStyle = a2.getCardStyle();
                    if (cardStyle != 0) {
                        if (cardStyle == 1) {
                            f2 = com.bytedance.common.utility.n.b(this.f76100a, 130.0f);
                        } else if (cardStyle == 2) {
                            width = (int) com.bytedance.common.utility.n.b(this.f76100a, 260.0f);
                        }
                    } else if (a2.getCardType() == 2) {
                        f2 = com.bytedance.common.utility.n.b(this.f76100a, 147.0f);
                    }
                    b3 = (int) f2;
                }
                this.f76102c.b(width, b3);
            } else if (i2 == 2) {
                this.f76102c.b((int) (((float) com.bytedance.common.utility.n.a(this.f76100a)) - (com.bytedance.common.utility.n.b(this.f76100a, 12.0f) * 2.0f)), (int) com.bytedance.common.utility.n.b(this.f76100a, 112.0f));
            }
            if (this.f76106g == 0) {
                com.ss.android.ugc.aweme.commercialize.utils.i.a(this.f76100a, this.f76101b, this.f76102c);
            }
            this.f76102c.setInCleanMode(false);
            this.f76102c.d();
            this.f76102c.b();
            this.f76103d.b();
            if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null && com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().n(this.f76101b)) {
                com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76101b);
            }
            Integer num = null;
            if (!(com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() == null || (b2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().b(this.f76101b)) == null)) {
                Context context = this.f76100a;
                Aweme aweme = this.f76101b;
                l.d(b2, "");
                IAdCardService c2 = AdCardServiceImpl.c();
                CardStruct a3 = com.ss.android.ugc.aweme.commercialize.utils.i.a(aweme);
                if (a3 != null) {
                    num = Integer.valueOf(a3.getCardType());
                }
                ai a4 = c2.a(num, context, aweme, b2);
                this.f76105f = a4;
                a4.a(this.f76109j);
                b2.a(new ae.a() {
                    /* class com.ss.android.ugc.aweme.commercialize.views.cards.p.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(46943);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                    public final void a() {
                        p.this.f76109j.a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (Object) null);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                    public final void b() {
                        if (p.this.f76105f == null || !p.this.f76105f.i()) {
                            p.this.f76109j.a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
                        } else {
                            p.this.f76109j.a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) true);
                        }
                    }
                });
                View a5 = com.ss.android.ugc.aweme.commercialize.utils.i.a(this.f76102c);
                if (a5 != null) {
                    n a6 = this.f76104e.a();
                    a6.b(a5.getId(), b2.c(), "card_default");
                    a6.c();
                }
            }
            b();
            this.f76109j.a("ACTION_HALF_WEB_PAGE_SHOW", (u<b>) this);
            this.f76109j.a("ACTION_HALF_WEB_PAGE_HIDE", (u<b>) this);
            this.f76109j.a("ACTION_HALF_WEB_PAGE_COLLAPSE", (u<b>) this);
            this.f76109j.a("ACTION_HALF_WEB_PAGE_MOVE_OUT_OF_SCREEN", (u<b>) this);
            this.f76109j.a("ACTION_TOP_WEB_PAGE_HIDE", (u<b>) this);
            this.f76109j.a("ad_comment_dialog_visible", (u<b>) this);
            this.f76109j.a("ad_share_dialog_visible", (u<b>) this);
            this.f76109j.a("on_ad_light_web_page_show", (u<b>) this);
            this.f76109j.a("on_ad_light_web_page_hide", (u<b>) this);
            this.f76109j.a("ON_AD_COMMON_MASK_SHOW", (u<b>) this);
            this.f76109j.a("ON_AD_COMMON_MASK_HIDE", (u<b>) this);
            this.f76109j.a("ON_AD_FORM_MASK_SHOW", (u<b>) this);
            this.f76109j.a("ON_AD_FORM_MASK_HIDE", (u<b>) this);
            this.f76109j.a("ON_AD_LYNX_MASK_SHOW", (u<b>) this);
            this.f76109j.a("ON_AD_LYNX_MASK_HIDE", (u<b>) this);
            this.f76109j.a("ON_SIMILAR_ADVERT_DATA_RECEIVE", (u<b>) this);
            this.f76109j.a("ON_SIMILAR_ADVERT_HIDE", (u<b>) this);
            this.f76109j.a("ad_on_live_link_user_count_changed", (u<b>) this);
            this.f76109j.a("SET_HALF_WEB_PAGE_REAL_SHOW", (u<b>) this);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void b() {
        Context context;
        CardStruct o2;
        if (!this.s && com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null && (context = this.f76100a) != null && (context instanceof e)) {
            this.w = ((e) context).getSupportFragmentManager();
            if (d.c()) {
                if (((e) this.f76100a).findViewById(R.id.fl4) != null) {
                    a((Activity) this.f76100a, (int) R.id.fl4);
                }
                if (((e) this.f76100a).findViewById(R.id.flf) != null) {
                    a((Activity) this.f76100a, (int) R.id.flf);
                }
            }
            this.v = (AdHalfWebPageContainer) ((e) this.f76100a).findViewById(R.id.gt);
            AdHalfWebPageMaskLayer adHalfWebPageMaskLayer = (AdHalfWebPageMaskLayer) ((e) this.f76100a).findViewById(R.id.gu);
            this.f76108i = adHalfWebPageMaskLayer;
            if (this.w != null && this.v != null && adHalfWebPageMaskLayer != null) {
                if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() == null || (o2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().o(this.f76101b)) == null) {
                    this.v.setVisibility(8);
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.v.getLayoutParams();
                layoutParams.height = com.ss.android.ugc.aweme.commercialize.utils.i.a(o2, this.v);
                layoutParams.bottomMargin = (layoutParams.height + 5) * -1;
                this.v.b();
                this.v.setLayoutParams(layoutParams);
                this.f76108i.b();
                n a2 = this.w.a();
                ae c2 = com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().c(this.f76101b);
                c2.a(new ae.a() {
                    /* class com.ss.android.ugc.aweme.commercialize.views.cards.p.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(46944);
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                    public final void a() {
                    }

                    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ae.a
                    public final void b() {
                        p.this.f76109j.a("ACTION_TOP_WEB_PAGE_HIDE", (Object) null);
                    }
                });
                TopPageActionV2 topPageActionV2 = new TopPageActionV2(this.f76100a, this.f76101b, c2);
                this.f76107h = topPageActionV2;
                topPageActionV2.a(this.f76109j);
                this.f76107h.f76022i = new q(this);
                a2.a(R.id.gt, c2.c(), "card_tag_top_page");
                a2.b(c2.c()).c();
            }
        }
    }

    /* synthetic */ p(byte b2) {
        this();
    }

    private void a(com.ss.android.ugc.aweme.commercialize.model.e eVar) {
        boolean z;
        if (this.f76102c.a()) {
            AdHalfWebPageContainer adHalfWebPageContainer = this.f76102c;
            if (com.ss.android.ugc.aweme.commercialize.utils.i.f(this.f76101b) || this.f76106g == 2) {
                z = true;
            } else {
                z = false;
            }
            adHalfWebPageContainer.b(z);
            this.f76109j.a("ON_AD_HALF_WEB_PAGE_HIDE_START", (Object) null);
            this.f76102c.postDelayed(new t(this), 200);
            this.f76109j.a("ON_AD_HALF_WEB_PAGE_HIDE", eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final String b(boolean z) {
        boolean a2;
        ae a3 = a(z);
        if (a3 == null) {
            return "data_load_fail";
        }
        boolean e2 = a3.e();
        if (z) {
            a2 = a(e2, this.f76107h);
        } else {
            a2 = a(e2, this.f76105f);
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
    public final ae a(boolean z) {
        if (z) {
            i iVar = this.w;
            if (iVar == null) {
                return null;
            }
            Fragment a2 = iVar.a("card_tag_top_page");
            if (a2 instanceof ae) {
                return (ae) a2;
            }
            return null;
        }
        i iVar2 = this.f76104e;
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
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.cards.p.a(int):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e3  */
    @Override // androidx.lifecycle.u
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b r6) {
        /*
        // Method dump skipped, instructions count: 794
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.cards.p.onChanged(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.f76109j.a("ON_AD_HALF_WEB_PAGE_SHOW_CANCEL", str);
        if (com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a() != null) {
            com.ss.android.ugc.aweme.commercialize.depend.b.f73781b.a().a(this.f76101b, str);
        }
        ac.f76047a.a(this.f76101b, str);
    }

    private boolean a(boolean z, ai aiVar) {
        if (this.f76105f instanceof AbsAdCardActionV2) {
            return ((AbsAdCardActionV2) aiVar).a();
        }
        return z;
    }

    private static void a(Activity activity, int i2) {
        MethodCollector.i(12419);
        ((ViewStub) activity.findViewById(i2)).inflate();
        MethodCollector.o(12419);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void b(int i2, int i3) {
        if (!this.s) {
            if (i2 != 0 || i3 != 0) {
                ViewGroup.LayoutParams layoutParams = this.v.getLayoutParams();
                if (i2 != 0) {
                    layoutParams.width = com.ss.android.ugc.aweme.base.utils.n.a(this.f76100a, i2);
                }
                if (i3 != 0) {
                    layoutParams.height = com.ss.android.ugc.aweme.base.utils.n.a(this.f76100a, i3);
                }
                this.v.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.af
    public final void a(int i2, int i3) {
        if (!this.s) {
            if (i2 != 0 || i3 != 0) {
                ViewGroup.LayoutParams layoutParams = this.f76102c.getLayoutParams();
                if (i2 != 0) {
                    layoutParams.width = com.ss.android.ugc.aweme.base.utils.n.a(this.f76100a, i2);
                }
                if (i3 != 0) {
                    layoutParams.height = com.ss.android.ugc.aweme.base.utils.n.a(this.f76100a, i3);
                }
                this.f76102c.setLayoutParams(layoutParams);
            }
        }
    }
}
