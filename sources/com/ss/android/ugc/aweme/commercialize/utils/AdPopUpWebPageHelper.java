package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.ad.c.n;
import com.ss.android.ugc.aweme.ad.c.o;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.module.ad.k;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b;
import com.ss.android.ugc.aweme.commercialize.log.f;
import com.ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public final class AdPopUpWebPageHelper implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final Map<Integer, AdPopUpWebPageHelper> f75490g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final a f75491h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f75492a;

    /* renamed from: b  reason: collision with root package name */
    long f75493b;

    /* renamed from: c  reason: collision with root package name */
    public AdPopUpWebPageView f75494c;

    /* renamed from: d  reason: collision with root package name */
    public final b f75495d = new b(this);

    /* renamed from: e  reason: collision with root package name */
    public final d f75496e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    public final e f75497f = new e(this);

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<androidx.fragment.app.e> f75498i;

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46580);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity) {
            l.d(activity, "");
            AdPopUpWebPageHelper adPopUpWebPageHelper = AdPopUpWebPageHelper.f75490g.get(Integer.valueOf(activity.hashCode()));
            if (adPopUpWebPageHelper != null) {
                adPopUpWebPageHelper.c();
                AdPopUpWebPageHelper.f75490g.remove(Integer.valueOf(activity.hashCode()));
            }
        }
    }

    public static final class d implements AdPopUpWebPageView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageHelper f75501a;

        static {
            Covode.recordClassIndex(46584);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.c
        public final void a() {
            this.f75501a.f75492a = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(AdPopUpWebPageHelper adPopUpWebPageHelper) {
            this.f75501a = adPopUpWebPageHelper;
        }
    }

    public static final class e implements AdPopUpWebPageView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageHelper f75502a;

        static {
            Covode.recordClassIndex(46585);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void a() {
            this.f75502a.f75492a = "button";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(AdPopUpWebPageHelper adPopUpWebPageHelper) {
            this.f75502a = adPopUpWebPageHelper;
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        this.f75493b = System.currentTimeMillis();
    }

    public static final class c extends h.f.b.m implements h.f.a.a<Object> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ h.f.a.b $callback = null;
        final /* synthetic */ String $title;
        final /* synthetic */ String $url;
        final /* synthetic */ AdPopUpWebPageView $view;
        final /* synthetic */ AdPopUpWebPageHelper this$0;

        static {
            Covode.recordClassIndex(46582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(AdPopUpWebPageHelper adPopUpWebPageHelper, AdPopUpWebPageView adPopUpWebPageView, androidx.fragment.app.e eVar, String str, String str2, h.f.a.b bVar) {
            super(0);
            this.this$0 = adPopUpWebPageHelper;
            this.$view = adPopUpWebPageView;
            this.$activity = eVar;
            this.$url = str;
            this.$title = str2;
        }

        @Override // h.f.a.a
        public final Object invoke() {
            return Boolean.valueOf(this.$view.post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.commercialize.utils.AdPopUpWebPageHelper.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f75500a;

                static {
                    Covode.recordClassIndex(46583);
                }

                {
                    this.f75500a = r1;
                }

                public final void run() {
                    AwemeRawAd awemeRawAd;
                    String str;
                    b.a a2 = new b.a().a(this.f75500a.$activity);
                    Aweme a3 = AdPopUpWebPageHelper.a();
                    if (a3 != null) {
                        awemeRawAd = a3.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    b.a b2 = a2.a(awemeRawAd).a(this.f75500a.$url).b(this.f75500a.$title);
                    Aweme a4 = AdPopUpWebPageHelper.a();
                    if (a4 == null || (str = a4.getAid()) == null) {
                        str = "";
                    }
                    boolean a5 = AdPopUpWebPageWidget.s.a(b2.c(str).b(25).a());
                    if (a5) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.event.a(1));
                    }
                    h.f.a.b bVar = this.f75500a.$callback;
                    if (bVar != null) {
                        bVar.invoke(Boolean.valueOf(a5));
                    }
                }
            }));
        }
    }

    public static Aweme a() {
        k a2 = au.a();
        if (a2 != null) {
            return a2.f75793m;
        }
        return null;
    }

    public final androidx.fragment.app.e b() {
        WeakReference<androidx.fragment.app.e> weakReference = this.f75498i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        androidx.fragment.app.e b2 = b();
        if (b2 != null) {
            a.a(b2);
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        a(System.currentTimeMillis() - this.f75493b);
    }

    static {
        Covode.recordClassIndex(46579);
    }

    public final void c() {
        androidx.fragment.app.e b2 = b();
        if (b2 != null) {
            b2.getLifecycle().b(this);
            if (this.f75494c != null) {
                AdPopUpWebPageWidget.s.a(b2);
            }
        }
    }

    public static final class b implements AdPopUpWebPageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPopUpWebPageHelper f75499a;

        static {
            Covode.recordClassIndex(46581);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2, Boolean bool) {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void b(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a() {
            AdPopUpWebPageHelper adPopUpWebPageHelper = this.f75499a;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aI(AdPopUpWebPageHelper.a())) {
                com.ss.android.ugc.d.a.c.a(new o());
            }
            com.ss.android.ugc.d.a.c.a(new k(true));
            adPopUpWebPageHelper.f75493b = System.currentTimeMillis();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdPopUpWebPageHelper adPopUpWebPageHelper) {
            this.f75499a = adPopUpWebPageHelper;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2) {
            String str;
            AwemeRawAd awemeRawAd;
            String str2;
            AwemeRawAd awemeRawAd2;
            AdPopUpWebPageHelper adPopUpWebPageHelper = this.f75499a;
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.aI(AdPopUpWebPageHelper.a())) {
                com.ss.android.ugc.d.a.c.a(new n());
            }
            com.ss.android.ugc.d.a.c.a(new k(false));
            if (adPopUpWebPageHelper.f75494c != null) {
                if (aa.f75533d == 1) {
                    str2 = "slide";
                } else {
                    str2 = "slide_down";
                }
                f.b a2 = f.a();
                a2.f74804a = "landing_ad";
                a2.f74805b = "close";
                String str3 = adPopUpWebPageHelper.f75492a;
                if (str3 == null) {
                    str3 = str2;
                }
                a2.c(str3).b(AdPopUpWebPageHelper.a()).a((Context) null);
                Aweme a3 = AdPopUpWebPageHelper.a();
                if (a3 != null) {
                    awemeRawAd2 = a3.getAwemeRawAd();
                } else {
                    awemeRawAd2 = null;
                }
                a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "close", awemeRawAd2);
                String str4 = adPopUpWebPageHelper.f75492a;
                if (str4 != null) {
                    str2 = str4;
                }
                a4.b("refer", str2).c();
            }
            adPopUpWebPageHelper.a(System.currentTimeMillis() - adPopUpWebPageHelper.f75493b);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Aweme a5 = AdPopUpWebPageHelper.a();
            if (a5 == null || (awemeRawAd = a5.getAwemeRawAd()) == null || (str = awemeRawAd.getWebUrl()) == null) {
                str = "";
            }
            linkedHashMap.put("url", str);
            linkedHashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("ad_webview_close", System.currentTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(linkedHashMap)));
            this.f75499a.f75492a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        if (this.f75494c != null) {
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            dVar.a("duration", j2);
            r.a("h5_stay_time", dVar.f66730a);
        }
    }

    public AdPopUpWebPageHelper(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        this.f75498i = new WeakReference<>(eVar);
        eVar.getLifecycle().a(this);
    }
}
