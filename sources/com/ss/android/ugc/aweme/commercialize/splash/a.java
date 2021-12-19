package com.ss.android.ugc.aweme.commercialize.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.a.b;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.common.applog.AppLog;
import com.ss.android.e.f;
import com.ss.android.e.h;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.commercialize.ad.c;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.ak;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.log.x;
import com.ss.android.ugc.aweme.commercialize.utils.b.e;
import com.ss.android.ugc.aweme.commercialize.utils.bp;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.t;
import com.ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ed;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.openauthorize.AuthorizeCommonService;
import h.f.b.l;
import h.m.p;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class a implements b {
    static {
        Covode.recordClassIndex(46462);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean a(Context context, String str, String str2, String str3) {
        l.d(context, "");
        Context a2 = d.a();
        l.d(a2, "");
        l.d(a2, "");
        List<h> extractImageUrlList = f.extractImageUrlList(str, null);
        l.b(extractImageUrlList, "");
        return ed.a(a2, -1, extractImageUrlList, str2, "", str3, str3);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean f() {
        return in.d();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void i() {
        a.b.f109011a.f109002c = false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final long l() {
        return d.b();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final String n() {
        return AppLog.getServerDeviceId();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final String c() {
        String b2 = com.ss.android.ugc.trill.d.a.b();
        if (b2 == null) {
            return "";
        }
        return b2;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final com.ss.android.ad.splash.core.i.b d() {
        if (com.ss.android.ugc.aweme.commercialize.track.f.a()) {
            return ak.f74739a;
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final String e() {
        return com.ss.android.ugc.aweme.compliance.api.a.d().f();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean g() {
        if (com.ss.android.ugc.aweme.compliance.api.a.g().b() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void j() {
        l.d("splash", "");
        c.f73645a = "splash";
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void k() {
        if (MainLooperOptService.b((MainLooperOptService.a) null) != null) {
            MainLooperOptService.f107697h = false;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final String m() {
        String installId = AppLog.getInstallId();
        l.b(installId, "");
        return installId;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final IDownloadService p() {
        IDownloadService b2 = DownloadServiceImpl.b();
        l.b(b2, "");
        return b2;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean q() {
        AwemeAppData a2 = AwemeAppData.a();
        l.b(a2, "");
        return a2.f66479h;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean r() {
        AwemeAppData a2 = AwemeAppData.a();
        l.b(a2, "");
        return a2.f66477f;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean s() {
        AwemeAppData a2 = AwemeAppData.a();
        l.b(a2, "");
        return a2.f66478g;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final int t() {
        return com.ss.android.ugc.aweme.adaptation.c.d(d.a());
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean u() {
        o a2 = o.a();
        l.b(a2, "");
        return a2.f66861a.f99089b;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final long v() {
        o a2 = o.a();
        l.b(a2, "");
        return a2.f66861a.f99090c;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final String b() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        return g2.getCurUserId();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final String o() {
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        String str = (String) hashMap.get("openudid");
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final HashMap<String, String> a() {
        int i2;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        if (curUser != null) {
            int b2 = com.ss.android.ugc.aweme.compliance.api.a.g().b();
            if (curUser.getUserMode() != -1) {
                i2 = curUser.getUserMode();
            } else {
                i2 = 0;
            }
            if (b2 == 2 || b2 == 0) {
                str = String.valueOf(i2 | 4);
            } else {
                str = String.valueOf(i2);
            }
            hashMap.put("user_mode", str);
            hashMap.put("user_period", String.valueOf(curUser.getUserPeriod()));
        }
        return hashMap;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean h() {
        if (p.a("startupTest", com.ss.android.ugc.aweme.app.k.a.f66814a, true) || p.a("MTraceStartupDiff", com.ss.android.ugc.aweme.app.k.a.f66814a, true) || p.a("manuallyMTrace", com.ss.android.ugc.aweme.app.k.a.f66814a, true) || p.a("MTraceStartup", com.ss.android.ugc.aweme.app.k.a.f66814a, true) || p.a("systrace", com.ss.android.ugc.aweme.app.k.a.f66814a, true) || p.a("manuallyATrace", com.ss.android.ugc.aweme.app.k.a.f66814a, true) || p.a("dominoMode", com.ss.android.ugc.aweme.app.k.a.f66814a, true)) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final com.ss.android.ad.splash.core.i.a a(Context context) {
        return new b(context);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean b(Aweme aweme) {
        d.a();
        return com.ss.android.ugc.aweme.feed.q.a.l(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean c(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean d(Aweme aweme) {
        return com.ss.android.ugc.aweme.commercialize.e.a.b.A(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void a(Aweme aweme) {
        bs.a(aweme, (Executor) null, false);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final Intent b(Context context) {
        l.d(context, "");
        return new Intent(context, CrossPlatformActivity.class);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void a(com.bytedance.ies.ugc.aweme.commercialize.splash.a.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.lego.f.e().a(new SplashAdDependImpl$setPreloadDelay$1(aVar));
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void e(Aweme aweme) {
        l.d(aweme, "");
        v.O().b(aweme);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void a(String str) {
        l.d(str, "");
        TroubleshootingLogDelegate.ordinarySplashLog$default(TroubleshootingLogDelegate.INSTANCE, str, null, 0, 6, null);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void b(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.crossplatform.business.a.a.a(str, null);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final boolean a(Activity activity) {
        l.d(activity, "");
        return AuthorizeCommonService.a().isActivityAwemeAuthorize(activity);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void b(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        e.a(str);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        String str2 = "?";
        if (str.contains(str2)) {
            str2 = "&";
        }
        objArr[1] = str2;
        objArr[2] = URLEncoder.encode("trigger_by");
        objArr[3] = URLEncoder.encode("splash");
        d.a.a(context, com.a.a("%s%s%s=%s", objArr), (String) null, true);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void a(Context context, Aweme aweme) {
        l.d(context, "");
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme) && d.f75283a != 0) {
            int i2 = 1;
            if (!d.f75286d) {
                i2 = 2;
            }
            long currentTimeMillis = System.currentTimeMillis() - d.f75283a;
            d.f75283a = 0;
            HashMap hashMap = new HashMap();
            hashMap.put("feedduration", String.valueOf(currentTimeMillis));
            hashMap.put("awemelaunch", String.valueOf(i2));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ad_extra_data", new com.google.gson.f().b(hashMap));
            j.b(context, "feed_show", aweme, j.a(context, aweme, false, (Map<String, String>) hashMap2));
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "feed_show", aweme.getAwemeRawAd()).a("feedduration", Long.valueOf(currentTimeMillis)).a("awemelaunch", Integer.valueOf(i2)).c();
            com.ss.android.ugc.aweme.commercialize.util.b.a(System.currentTimeMillis(), "finish");
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void a(boolean z, String str) {
        l.d(str, "");
        if (z) {
            a.b.f109011a.a(str, false);
        } else {
            a.b.f109011a.b(str, false);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.a.b
    public final void a(Context context, Aweme aweme, Map<String, String> map) {
        l.d(context, "");
        l.d(map, "");
        if (!(context == null || aweme == null || !com.ss.android.ugc.aweme.commercialize.e.a.b.B(aweme))) {
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.w(aweme) || !TextUtils.isEmpty(com.ss.android.ugc.aweme.commercialize.e.a.b.b(aweme))) {
                j.b(context, "splash_click", aweme, j.a(context, aweme, false, map));
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "splash_click", aweme.getAwemeRawAd());
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        a2.f35123a.put(entry.getKey(), entry.getValue());
                    }
                }
                a2.c();
                com.ss.android.ugc.aweme.crossplatform.business.a.a.a("splash_ad", null);
                j.b(context, "click", aweme, j.a(context, aweme, true, map));
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new x(awemeRawAd));
                }
                if (!bp.a(context, aweme, 42, new t(context, aweme))) {
                    n.c(context, aweme);
                }
            }
        }
    }
}
