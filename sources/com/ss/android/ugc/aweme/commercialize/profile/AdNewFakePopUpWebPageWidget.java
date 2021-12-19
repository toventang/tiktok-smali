package com.ss.android.ugc.aweme.commercialize.profile;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.utils.aa;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class AdNewFakePopUpWebPageWidget extends AbsAdProfileWidget implements au {

    /* renamed from: m  reason: collision with root package name */
    public static final a f75096m = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public AdPopUpWebPageView f75097j;

    /* renamed from: k  reason: collision with root package name */
    public String f75098k;

    /* renamed from: l  reason: collision with root package name */
    long f75099l;
    private final c n = new c(this);
    private final d o = new d(this);
    private final b p = new b(this);

    static {
        Covode.recordClassIndex(46309);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46310);
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget$a$a  reason: collision with other inner class name */
        static final class C1710a extends h.f.b.m implements h.f.a.a<Object> {
            final /* synthetic */ com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b $openParams;
            final /* synthetic */ AdPopUpWebPageView $popUpWebPageView;

            static {
                Covode.recordClassIndex(46311);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1710a(AdPopUpWebPageView adPopUpWebPageView, com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b bVar) {
                super(0);
                this.$popUpWebPageView = adPopUpWebPageView;
                this.$openParams = bVar;
            }

            @Override // h.f.a.a
            public final Object invoke() {
                return Boolean.valueOf(this.$popUpWebPageView.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget.a.C1710a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ C1710a f75100a;

                    static {
                        Covode.recordClassIndex(46312);
                    }

                    {
                        this.f75100a = r1;
                    }

                    public final void run() {
                        this.f75100a.$popUpWebPageView.a(this.f75100a.$openParams);
                    }
                }));
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static AdPopUpWebPageView b(e eVar) {
            AdPopUpWebPageView adPopUpWebPageView;
            FrameLayout a2 = a(eVar);
            if (a2 != null) {
                adPopUpWebPageView = (AdPopUpWebPageView) a2.findViewById(R.id.ea);
            } else {
                adPopUpWebPageView = null;
            }
            if (!(adPopUpWebPageView instanceof AdPopUpWebPageView)) {
                return null;
            }
            return adPopUpWebPageView;
        }

        public static FrameLayout a(e eVar) {
            View view;
            MethodCollector.i(10084);
            if (eVar != null) {
                ViewStub viewStub = (ViewStub) eVar.findViewById(R.id.fn);
                if (viewStub != null && viewStub.getParent() != null) {
                    view = viewStub.inflate();
                    if (view == null) {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                        MethodCollector.o(10084);
                        throw nullPointerException;
                    }
                } else if (eVar != null) {
                    view = eVar.findViewById(R.id.fm);
                }
                FrameLayout frameLayout = (FrameLayout) view;
                MethodCollector.o(10084);
                return frameLayout;
            }
            MethodCollector.o(10084);
            return null;
        }
    }

    public static final class c implements AdPopUpWebPageView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakePopUpWebPageWidget f75102a;

        static {
            Covode.recordClassIndex(46314);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.c
        public final void a() {
            this.f75102a.f75098k = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
            this.f75102a = adNewFakePopUpWebPageWidget;
        }
    }

    public static final class d implements AdPopUpWebPageView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakePopUpWebPageWidget f75103a;

        static {
            Covode.recordClassIndex(46315);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void a() {
            this.f75103a.f75098k = "button";
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void b() {
            AwemeRawAd awemeRawAd;
            AdPopUpWebPageView adPopUpWebPageView = this.f75103a.f75097j;
            if (adPopUpWebPageView != null) {
                com.ss.android.ugc.aweme.commercialize.feed.popupwebview.a actionMode = adPopUpWebPageView.getActionMode();
                Aweme aweme = ((AbsAdProfileWidget) this.f75103a).f75063a;
                AwemeRawAd awemeRawAd2 = null;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                if (actionMode.b(awemeRawAd)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) this.f75103a).f75063a;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "report", awemeRawAd2).b();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
            this.f75103a = adNewFakePopUpWebPageWidget;
        }
    }

    public static final class b implements AdPopUpWebPageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdNewFakePopUpWebPageWidget f75101a;

        static {
            Covode.recordClassIndex(46313);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a() {
            AwemeRawAd awemeRawAd;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f75101a;
            adNewFakePopUpWebPageWidget.f75099l = System.currentTimeMillis();
            AdPopUpWebPageView adPopUpWebPageView = adNewFakePopUpWebPageWidget.f75097j;
            if (adPopUpWebPageView == null) {
                return;
            }
            if (adPopUpWebPageView.e() || adPopUpWebPageView.f()) {
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd).b("refer", "halfscreen_page").b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget) {
            this.f75101a = adNewFakePopUpWebPageWidget;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2) {
            String str;
            AwemeRawAd awemeRawAd;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f75101a;
            AdPopUpWebPageView adPopUpWebPageView = adNewFakePopUpWebPageWidget.f75097j;
            AwemeRawAd awemeRawAd2 = null;
            if (adPopUpWebPageView != null && adPopUpWebPageView.f() && i2 == 3) {
                if (aa.f75533d == 1) {
                    str = "slide";
                } else {
                    str = "slide_down";
                }
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "close", awemeRawAd);
                String str2 = adNewFakePopUpWebPageWidget.f75098k;
                if (str2 != null) {
                    str = str2;
                }
                a2.b("refer", str).b();
            }
            AdPopUpWebPageView adPopUpWebPageView2 = adNewFakePopUpWebPageWidget.f75097j;
            if (adPopUpWebPageView2 != null && adPopUpWebPageView2.f() && i2 == 6) {
                Aweme aweme2 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                if (aweme2 != null) {
                    awemeRawAd2 = aweme2.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "close", awemeRawAd2).b("refer", "halfscreen_page").b();
            }
            adNewFakePopUpWebPageWidget.a(System.currentTimeMillis() - adNewFakePopUpWebPageWidget.f75099l);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.assem.popup.b.a());
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void b(int i2) {
            AdPopUpWebPageView adPopUpWebPageView;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f75101a;
            AdPopUpWebPageView adPopUpWebPageView2 = adNewFakePopUpWebPageWidget.f75097j;
            AwemeRawAd awemeRawAd = null;
            if (((adPopUpWebPageView2 != null && adPopUpWebPageView2.e()) || ((adPopUpWebPageView = adNewFakePopUpWebPageWidget.f75097j) != null && adPopUpWebPageView.f())) && i2 == 6) {
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "otherclick", awemeRawAd).b("refer", "halfscreen_page").b();
            } else if (adNewFakePopUpWebPageWidget.f75097j != null) {
                Aweme aweme2 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                if (aweme2 != null) {
                    awemeRawAd = aweme2.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "click", awemeRawAd).b("refer", "button").b();
            }
            adNewFakePopUpWebPageWidget.f75099l = System.currentTimeMillis();
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2, Boolean bool) {
            String str;
            AwemeRawAd awemeRawAd;
            a.C0791a a2;
            String str2;
            AwemeRawAd awemeRawAd2;
            AwemeRawAd awemeRawAd3;
            AdNewFakePopUpWebPageWidget adNewFakePopUpWebPageWidget = this.f75101a;
            if (l.a((Object) bool, (Object) true)) {
                Aweme aweme = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                if (aweme != null) {
                    awemeRawAd3 = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd3 = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "othershow_fail", awemeRawAd3).b("refer", "button").b();
            } else {
                AdPopUpWebPageView adPopUpWebPageView = adNewFakePopUpWebPageWidget.f75097j;
                if (adPopUpWebPageView != null) {
                    if (!adPopUpWebPageView.e() || i2 != 6) {
                        if (aa.f75533d == 1) {
                            str = "slide";
                        } else {
                            str = "slide_down";
                        }
                        if (!(i2 == 5 || i2 == 0)) {
                            adPopUpWebPageView.a();
                            Aweme aweme2 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                            if (aweme2 != null) {
                                awemeRawAd = aweme2.getAwemeRawAd();
                            } else {
                                awemeRawAd = null;
                            }
                            a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "close", awemeRawAd);
                            str2 = adNewFakePopUpWebPageWidget.f75098k;
                            if (str2 == null) {
                                str2 = str;
                            }
                        }
                    } else {
                        Aweme aweme3 = ((AbsAdProfileWidget) adNewFakePopUpWebPageWidget).f75063a;
                        if (aweme3 != null) {
                            awemeRawAd2 = aweme3.getAwemeRawAd();
                        } else {
                            awemeRawAd2 = null;
                        }
                        a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("homepage_ad", "close", awemeRawAd2);
                        str2 = "halfscreen_page";
                    }
                    a2.b("refer", str2).b();
                }
                adNewFakePopUpWebPageWidget.a(System.currentTimeMillis() - adNewFakePopUpWebPageWidget.f75099l);
            }
            this.f75101a.f75098k = null;
        }
    }

    private final boolean e() {
        AwemeRawAd awemeRawAd;
        String str;
        AwemeRawAd awemeRawAd2;
        com.ss.android.ugc.aweme.commercialize.model.aa fakeAuthor;
        AwemeRawAd awemeRawAd3;
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        Boolean bool = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.g(awemeRawAd)) {
            return false;
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme2 == null || (awemeRawAd3 = aweme2.getAwemeRawAd()) == null) {
            str = null;
        } else {
            str = awemeRawAd3.getOpenUrl();
        }
        if (!TextUtils.isEmpty(str)) {
            return false;
        }
        Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
        if (!(aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd2.getFakeAuthor()) == null)) {
            bool = fakeAuthor.getAutoShowWebview();
        }
        if (l.a((Object) bool, (Object) true)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f75097j != null) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("duration", j2);
            r.a("h5_stay_time", dVar.f66730a);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011c, code lost:
        if (h.f.b.l.a((java.lang.Object) r5, (java.lang.Object) "app") != false) goto L_0x011e;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r13) {
        /*
        // Method dump skipped, instructions count: 471
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.profile.AdNewFakePopUpWebPageWidget.a(boolean):void");
    }
}
