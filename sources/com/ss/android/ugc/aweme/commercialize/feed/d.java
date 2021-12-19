package com.ss.android.ugc.aweme.commercialize.feed;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.room.i;
import androidx.room.j;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.f.c;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage;
import com.ss.android.ugc.aweme.crossplatform.activity.v;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.experiment.e;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.IFeedItemList;
import com.ss.android.ugc.aweme.i.a.a;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.p;
import com.ss.android.ugc.aweme.utils.v;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class d implements bb {

    /* renamed from: c  reason: collision with root package name */
    private static final String f74196c = d.class.getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f74197e;

    /* renamed from: f  reason: collision with root package name */
    private static c<ShowAdDataBase> f74198f = new c<ShowAdDataBase>() {
        /* class com.ss.android.ugc.aweme.commercialize.feed.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(45791);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.ss.android.f.c
        public final /* bridge */ /* synthetic */ ShowAdDataBase a() {
            j.a a2 = i.a(com.bytedance.ies.ugc.appcontext.d.a(), ShowAdDataBase.class, "showAd.db");
            a2.f4332b = true;
            return a2.a();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    List<String> f74199a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private a f74200b = new a() {
        /* class com.ss.android.ugc.aweme.commercialize.feed.d.AnonymousClass2 */

        static {
            Covode.recordClassIndex(45792);
        }

        @Override // com.ss.android.ugc.aweme.i.a.a
        public final aj<Long> a() {
            return SharePrefCache.inst().getLastFilterTime();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private IFeedItemList f74201d;

    static {
        Covode.recordClassIndex(45790);
    }

    private d() {
    }

    static final /* synthetic */ Object b() {
        try {
            ShowAdDataBase b2 = f74198f.b();
            if (b2 == null) {
                return null;
            }
            b2.i().a();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static d a() {
        MethodCollector.i(1466);
        if (f74197e == null) {
            synchronized (com.ss.android.ugc.aweme.settingsrequest.a.class) {
                try {
                    if (f74197e == null) {
                        f74197e = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1466);
                    throw th;
                }
            }
        }
        d dVar = f74197e;
        MethodCollector.o(1466);
        return dVar;
    }

    static final /* synthetic */ Object a(String str) {
        ShowAdDataBase b2 = f74198f.b();
        if (b2 == null) {
            return null;
        }
        try {
            b2.i().a(new com.ss.android.ugc.aweme.commercialize.dao.a(str));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean b(String str) {
        try {
            ShowAdDataBase b2 = f74198f.b();
            if (b2 != null) {
                List<com.ss.android.ugc.aweme.commercialize.dao.a> a2 = b2.i().a(str);
                if (b.a((Collection) a2)) {
                    return false;
                }
                return a2.contains(new com.ss.android.ugc.aweme.commercialize.dao.a(str));
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.feed.bb
    public final void a(IFeedItemList iFeedItemList) {
        int i2;
        String str;
        if (iFeedItemList != null && !b.a((Collection) iFeedItemList.getItems())) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.f74200b.b(currentTimeMillis)) {
                    this.f74199a.clear();
                    b.i.b(f.f74205a, b.i.f4824a);
                }
                this.f74200b.a(currentTimeMillis);
                Iterator<Aweme> it = iFeedItemList.getItems().iterator();
                Context a2 = com.bytedance.ies.ugc.appcontext.d.a();
                while (it.hasNext()) {
                    Aweme next = it.next();
                    if (next != null) {
                        if (e.f89880b && v.b(next) && !v.a(next) && !com.ss.android.ugc.aweme.commercialize.e.a.b.K(next)) {
                            p.f107614a.post(new Runnable() {
                                /* class com.ss.android.ugc.aweme.commercialize.feed.d.AnonymousClass3 */

                                static {
                                    Covode.recordClassIndex(45793);
                                }

                                public final void run() {
                                    X2CAdWebPage x2CAdWebPage = (X2CAdWebPage) f.b(X2CAdWebPage.class);
                                    if (x2CAdWebPage.f76025a != null) {
                                        com.ss.android.ugc.aweme.crossplatform.activity.v a2 = com.ss.android.ugc.aweme.crossplatform.activity.v.a();
                                        Activity activity = x2CAdWebPage.f76026b;
                                        X2CAdWebPage.AnonymousClass1 r2 = new v.a() {
                                            /* class com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(46896);
                                            }

                                            @Override // com.ss.android.ugc.aweme.crossplatform.activity.v.a
                                            public final void a() {
                                                p.f107614a.post(new Runnable() {
                                                    /* class com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage.AnonymousClass1.AnonymousClass1 */

                                                    static {
                                                        Covode.recordClassIndex(46897);
                                                    }

                                                    public final void run() {
                                                        MethodCollector.i(3023);
                                                        if (X2CAdWebPage.this.f76026b == null) {
                                                            MethodCollector.o(3023);
                                                            return;
                                                        }
                                                        final ViewGroup viewGroup = (ViewGroup) com.a.b.a.a(X2CAdWebPage.this.f76026b, R.layout.a0m, new FrameLayout(X2CAdWebPage.this.f76026b), false);
                                                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                                                            /* class com.ss.android.ugc.aweme.commercialize.views.cards.X2CAdWebPage.AnonymousClass1.AnonymousClass1.AnonymousClass1 */

                                                            static {
                                                                Covode.recordClassIndex(46898);
                                                            }

                                                            public final void run() {
                                                                if (X2CAdWebPage.this.f76026b != null) {
                                                                    ((CrossPlatformWebView) viewGroup.findViewById(R.id.fm8)).a((Context) X2CAdWebPage.this.f76026b, true);
                                                                    X2CAdWebPage.this.f76028d.offer(viewGroup);
                                                                }
                                                            }
                                                        });
                                                        MethodCollector.o(3023);
                                                    }
                                                });
                                            }
                                        };
                                        if (activity != null && a2.f78578b.size() <= a2.f78580d) {
                                            new Handler(Looper.getMainLooper()).post(new Runnable(activity, r2) {
                                                /* class com.ss.android.ugc.aweme.crossplatform.activity.v.AnonymousClass1 */

                                                /* renamed from: a  reason: collision with root package name */
                                                final /* synthetic */ Activity f78583a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ a f78584b;

                                                static {
                                                    Covode.recordClassIndex(48794);
                                                }

                                                public final void run() {
                                                    Looper.myQueue().addIdleHandler(new y(this, this.f78583a, this.f78584b));
                                                }

                                                {
                                                    this.f78583a = r2;
                                                    this.f78584b = r3;
                                                }
                                            });
                                        }
                                        if (!x2CAdWebPage.f76027c) {
                                            x2CAdWebPage.f76027c = true;
                                        }
                                    }
                                }
                            });
                        }
                        if (next.isAd()) {
                            boolean z = false;
                            if (next.isAd()) {
                                String aid = next.getAid();
                                if (!TextUtils.isEmpty(aid)) {
                                    if (!next.getAwemeRawAd().isDiableAdShowFilter()) {
                                        z = this.f74199a.contains(aid) ? true : b(aid);
                                    }
                                }
                            }
                            String str2 = "1";
                            if (z) {
                                it.remove();
                                if (com.ss.android.ugc.aweme.commercialize.e.a.b.an(next)) {
                                    com.ss.android.ugc.aweme.commercialize.log.j.a(a2, next, com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.b("8"));
                                    a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", next.getAwemeRawAd()).a("ad_show_fail_type", "8");
                                    if (!com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                        str2 = "2";
                                    }
                                    a3.a("awemelaunch", str2).c();
                                }
                                if (next.isAd()) {
                                    com.ss.android.ugc.aweme.commercialize.log.j.a(a2, next, 1);
                                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "item_repeat", next.getAwemeRawAd()).a("filter_reason", 1).c();
                                }
                            } else if (this.f74201d != null && !next.getAwemeRawAd().isDiableAdShowFilter()) {
                                String aid2 = next.getAid();
                                for (Aweme aweme : this.f74201d.getItems()) {
                                    if (aweme != null && TextUtils.equals(aid2, aweme.getAid())) {
                                        it.remove();
                                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.an(next)) {
                                            com.ss.android.ugc.aweme.commercialize.log.j.a(a2, next, com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.b("8"));
                                            a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "show_failed", next.getAwemeRawAd()).a("ad_show_fail_type", "8");
                                            if (com.bytedance.ies.ugc.aweme.commercialize.splash.f.i.f34786b) {
                                                str = str2;
                                            } else {
                                                str = "2";
                                            }
                                            a4.a("awemelaunch", str).c();
                                        }
                                        int i3 = 2;
                                        if (aweme.isAd()) {
                                            i2 = 1;
                                        } else {
                                            i2 = 2;
                                        }
                                        com.ss.android.ugc.aweme.commercialize.log.j.a(a2, next, i2);
                                        a.C0791a a5 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "item_repeat", next.getAwemeRawAd());
                                        if (aweme.isAd()) {
                                            i3 = 1;
                                        }
                                        a5.a("filter_reason", Integer.valueOf(i3)).c();
                                    }
                                }
                            }
                        }
                    }
                }
                this.f74201d = iFeedItemList;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
