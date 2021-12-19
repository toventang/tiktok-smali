package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.common.e.g;
import com.ss.android.ugc.aweme.feed.adapter.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.ss.android.ugc.aweme.feed.q.av;
import com.ss.android.ugc.aweme.feed.q.w;
import com.ss.android.ugc.aweme.feed.ui.af;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.utils.fp;
import com.ss.android.ugc.aweme.utils.fq;
import com.ss.android.ugc.aweme.video.v;

public final class e {
    static {
        Covode.recordClassIndex(46469);
    }

    public static boolean a(af afVar) {
        String str;
        int i2;
        MethodCollector.i(3682);
        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("try show TopView");
        if (afVar == null) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: feedRecommendFragment null");
            MethodCollector.o(3682);
            return false;
        }
        String str2 = i.f34792h;
        i.f34792h = null;
        i.f34793i = !TextUtils.isEmpty(str2);
        if (TextUtils.isEmpty(str2)) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: awesomeId null");
            MethodCollector.o(3682);
            return false;
        }
        Aweme a2 = SplashAdServiceImpl.h().a(str2);
        if (a2 == null) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: aweme null");
            MethodCollector.o(3682);
            return false;
        } else if (!a2.isAd()) {
            TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: aweme not ad");
            MethodCollector.o(3682);
            return false;
        } else {
            av avVar = afVar.n;
            if (avVar == null || avVar.W == null) {
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: BaseListFragmentPanel null");
                MethodCollector.o(3682);
                return false;
            }
            int aE = avVar.aE();
            b bVar = avVar.W;
            int b2 = m.b(bVar.e(), a2);
            if (b2 >= 0) {
                Aweme c2 = bVar.c(b2);
                Context a3 = d.a();
                int i3 = 2;
                if (c2.isAd()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                j.a(a3, a2, i2);
                a.C0791a a4 = a.a("draw_ad", "item_repeat", a2.getAwemeRawAd());
                if (c2.isAd()) {
                    i3 = 1;
                }
                a4.a("filter_reason", Integer.valueOf(i3)).c();
            }
            if (!com.bytedance.ies.ugc.aweme.commercialize.splash.setting.a.a() || !i.f34796l || bVar.getCount() != 0) {
                i.f34796l = false;
                int i4 = -1;
                for (int i5 = 0; i5 < bVar.getCount(); i5++) {
                    Aweme c3 = bVar.c(i5);
                    if ((c3 == a2 || TextUtils.equals(c3.getAid(), a2.getAid())) && a2.getAwemeRawAd().isEnableFilterSameVideo()) {
                        TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("TopView show failed reason: feed has same aweme");
                        Context a5 = d.a();
                        j.b(a5, "show_failed", a2, j.b(a5, a2, i.b("8")));
                        a.C0791a a6 = a.a("draw_ad", "show_failed", a2.getAwemeRawAd()).a("ad_show_fail_type", "8");
                        if (i.f34786b) {
                            str = "1";
                        } else {
                            str = "2";
                        }
                        a6.a("awemelaunch", str).c();
                        MethodCollector.o(3682);
                        return false;
                    }
                    if (i5 >= aE && i4 == -1 && !c3.isAd()) {
                        i4 = i5;
                    }
                }
                int b3 = SplashSettingServiceImpl.g().b();
                if (b3 > 0) {
                    try {
                        Thread.sleep((long) b3);
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                }
                Aweme a7 = AwemeService.b().a(a2);
                TroubleshootingLogDelegate.INSTANCE.awesomeSplashLog("insert TopView to feed list");
                a7.getAid();
                avVar.aE();
                AwemeSplashInfo m2 = com.ss.android.ugc.aweme.commercialize.e.a.b.m(a7);
                if (m2 != null) {
                    m2.setShown(false);
                    m2.contextTrackSent = false;
                }
                com.ss.android.ugc.aweme.freeflowcard.a.a.f96689a = true;
                try {
                    avVar.b(a7, aE);
                    if (a7.getVideo() != null) {
                        if (com.bytedance.ies.abmock.b.a().a(true, "player_precreateplayer", 0) == 1 && fq.a.f142946a.a(fp.PLAYER_FIRST_VIDEO_PREPARED)) {
                            v.O().a(a7);
                        }
                    }
                } catch (g e3) {
                    com.ss.android.ugc.aweme.framework.a.a.a("", e3);
                }
                avVar.b(aE, false);
                com.ss.android.ugc.aweme.freeflowcard.a.a.f96689a = false;
                if (!d.f75286d && SplashSettingServiceImpl.g().c()) {
                    for (int count = bVar.getCount() - 1; count > aE; count--) {
                        if (count != i4 + 1 && (avVar instanceof w)) {
                            avVar.a(count, bVar.c(count));
                        }
                    }
                    afVar.a();
                } else if (!d.f75286d) {
                    i.a();
                }
                if (d.f75286d && !SplashSettingServiceImpl.g().a()) {
                    i.a();
                }
                MethodCollector.o(3682);
                return true;
            }
            MethodCollector.o(3682);
            return false;
        }
    }
}
