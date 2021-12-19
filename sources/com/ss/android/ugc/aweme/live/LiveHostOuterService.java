package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.host.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.ui.common.BulletActivityWrapper;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.s;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.keva.Keva;
import com.lynx.tasm.LynxView;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.deeplink.DeepLinkActivityV2;
import com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.ss.android.ugc.aweme.live.ILiveHostOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.net.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ag;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.utils.hh;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.ss.android.ugc.aweme.web.h;
import com.ss.android.ugc.aweme.web.k;
import com.ss.android.ugc.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public class LiveHostOuterService implements a, ILiveHostOuterService {

    /* renamed from: a  reason: collision with root package name */
    private Handler f108063a = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(69290);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final String a() {
        return "api-va.tiktokv.com";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final String l() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final String p() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final boolean e() {
        return k.f145062b;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void a(boolean z) {
        c.a(new com.ss.android.ugc.aweme.feed.i.k(z));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final Locale c() {
        return com.ss.android.ugc.aweme.i18n.language.a.a((String) null, (String) null, d.a());
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final String f() {
        e.a();
        return k.f145061a.a();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final boolean g() {
        try {
            return com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getEnableAutoLiveState().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void i() {
        this.f108063a.post(new Runnable() {
            /* class com.ss.android.ugc.aweme.live.LiveHostOuterService.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69292);
            }

            public final void run() {
                if (j.a().b() == null) {
                    new InitTTNetTask().a(g.a());
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final int m() {
        return com.ss.android.ugc.aweme.simkit.d.a().e();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final boolean b() {
        return com.ss.android.ugc.aweme.compliance.api.a.o().a();
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final List<String> d() {
        return h.a((List<String>) Arrays.asList("host", "webcast"), false);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final long h() {
        try {
            return com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getAutoLiveStateIntervalMills().longValue();
        } catch (com.bytedance.ies.a unused) {
            return 60000;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final String k() {
        try {
            return com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeedbackConf().getFeHelp();
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static ILiveHostOuterService q() {
        MethodCollector.i(3882);
        Object a2 = b.a(ILiveHostOuterService.class, false);
        if (a2 != null) {
            ILiveHostOuterService iLiveHostOuterService = (ILiveHostOuterService) a2;
            MethodCollector.o(3882);
            return iLiveHostOuterService;
        }
        if (b.cs == null) {
            synchronized (ILiveHostOuterService.class) {
                try {
                    if (b.cs == null) {
                        b.cs = new LiveHostOuterService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3882);
                    throw th;
                }
            }
        }
        LiveHostOuterService liveHostOuterService = (LiveHostOuterService) b.cs;
        MethodCollector.o(3882);
        return liveHostOuterService;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final double n() {
        RateSettingsResponse rateSettingsResponse = VideoBitRateABManager.f143220a.f143222b;
        if (rateSettingsResponse == null) {
            return 0.0d;
        }
        double d2 = com.ss.android.ugc.h.g.e().d();
        com.ss.android.ugc.aweme.simkit.model.bitrateselect.b autoBitrateSetLive = rateSettingsResponse.getAutoBitrateSetLive();
        if (d2 <= 0.0d || autoBitrateSetLive == null) {
            return 0.0d;
        }
        return Math.max((autoBitrateSetLive.f133601a * d2 * d2 * d2) + (autoBitrateSetLive.f133602b * d2 * d2) + (autoBitrateSetLive.f133603c * d2) + autoBitrateSetLive.f133604d, autoBitrateSetLive.f133605e);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final JSONObject o() {
        JSONObject optJSONObject;
        Keva repo = Keva.getRepo("TTSettingData");
        if (repo == null || (optJSONObject = new JSONObject(repo.getString("settingData", "")).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("app");
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final List<com.bytedance.android.livesdkapi.model.b> j() {
        ArrayList arrayList = new ArrayList();
        try {
            List<UgActivityTasks> activityTasks = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getAwemeActivitySetting().getActivityTasks();
            if (activityTasks != null) {
                for (UgActivityTasks ugActivityTasks : activityTasks) {
                    if (ugActivityTasks.getTaskType().intValue() == 2 || ugActivityTasks.getTaskType().intValue() == 3) {
                        com.bytedance.android.livesdkapi.model.b bVar = new com.bytedance.android.livesdkapi.model.b();
                        bVar.f23270a = ugActivityTasks.getTaskId();
                        bVar.f23271b = ugActivityTasks.getTaskType();
                        bVar.f23272c = Long.valueOf(ugActivityTasks.getTime().longValue());
                        bVar.f23273d = ugActivityTasks.getUrlList();
                        arrayList.add(bVar);
                    }
                }
            }
        } catch (com.bytedance.ies.a unused) {
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final Intent a(Context context) {
        return new Intent(context, CrossPlatformActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final Intent b(Context context) {
        return new Intent(context, DeepLinkActivityV2.class);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void a(long j2) {
        c.a(new com.ss.android.ugc.aweme.live.model.c(j2));
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final boolean c(Context context) {
        if ((context instanceof DeepLinkHandlerActivity) || (context instanceof DeepLinkActivityV2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void a(Activity activity) {
        hh.a(activity);
    }

    @Override // com.bytedance.android.livesdkapi.host.a.a
    public final Object a(Context context, Object obj) {
        com.ss.android.ugc.aweme.web.b bVar = new com.ss.android.ugc.aweme.web.b(context);
        x xVar = (x) obj;
        l.d(xVar, "");
        com.ss.android.sdk.webview.e eVar = new com.ss.android.sdk.webview.e(xVar);
        eVar.f60188e = false;
        eVar.f60186c = true;
        com.ss.android.sdk.webview.e a2 = com.ss.android.sdk.webview.e.a(eVar.a(bVar), Arrays.asList("host", "webcast"), false, null, null, 12);
        bVar.a(a2, (com.ss.android.sdk.webview.c) null);
        return a2.f60187d;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void b(Context context, String str) {
        if (com.ss.android.ugc.aweme.language.d.c() || !TextUtils.equals("amazon", d.s)) {
            String str2 = "";
            if (com.ss.android.ugc.aweme.dg.a.f80072a == null) {
                str2 = SharePrefCache.inst().getSharePref().getString(str, str2);
            } else if (TextUtils.equals(str, "page_charge") && !TextUtils.isEmpty(com.ss.android.ugc.aweme.dg.a.f80072a.a())) {
                str2 = com.ss.android.ugc.aweme.dg.a.f80072a.a();
            } else if (TextUtils.equals(str, "page_index") && !TextUtils.isEmpty(com.ss.android.ugc.aweme.dg.a.f80072a.b())) {
                str2 = com.ss.android.ugc.aweme.dg.a.f80072a.b();
            }
            if (TextUtils.isEmpty(str2)) {
                if (!com.ss.android.ugc.aweme.language.d.c()) {
                    if (!TextUtils.equals(str, "page_index")) {
                        TextUtils.equals(str, "page_charge");
                    }
                    str2 = "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
                } else if (!TextUtils.equals(str, "page_index") && TextUtils.equals(str, "page_charge")) {
                    str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fwallet%2Frecharge%3Fhide_nav_bar%3D1";
                } else {
                    str2 = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
                }
            }
            Intent a2 = com.ss.android.ugc.aweme.crossplatform.a.b.a(context, Uri.parse(str2));
            com.ss.android.ugc.tiktok.security.a.a.a(a2, context);
            context.startActivity(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void a(Context context, String str) {
        w.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final Dialog a(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        return ah.f123352a.a(activity, cVar, bVar);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final Dialog b(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        return ah.f123352a.b(activity, cVar, bVar);
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void c(Activity activity, com.bytedance.android.livesdkapi.depend.e.c cVar, com.bytedance.android.livesdkapi.depend.e.b bVar) {
        com.ss.android.ugc.aweme.sharer.b a2 = a.C3201a.a(cVar.f22965a, activity);
        if (a2 != null && a2.b(activity)) {
            SharePackage c2 = ah.f123352a.c(activity, cVar, bVar);
            if (a2.a(c2.a(a2), activity)) {
                bVar.a(cVar.f22965a, "link", c2.f124595i);
            } else {
                bVar.a(new Throwable());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void a(Activity activity, boolean z, boolean z2) {
        if (z && z2 && !o.a().f66861a.a()) {
            Intent intent = new Intent(activity, MainActivity.class);
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveHostOuterService
    public final void a(String str, String str2, final ILiveHostOuterService.a aVar) {
        AnonymousClass1 r2 = new ag() {
            /* class com.ss.android.ugc.aweme.live.LiveHostOuterService.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69291);
            }

            @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.profile.presenter.ag
            public final void c() {
                T t = this.f76396h.mData;
                if (t == null) {
                    aVar.a((User) null);
                    return;
                }
                aVar.a(t.getUser());
            }

            @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o, com.ss.android.ugc.aweme.profile.presenter.aa, com.ss.android.ugc.aweme.profile.presenter.ag
            public final void a_(Exception exc) {
                aVar.a(exc);
                super.a_(exc);
            }
        };
        r2.d();
        r2.a(str, str2);
    }

    @Override // com.bytedance.android.livesdkapi.host.a.a
    public final Object a(Object obj, Context context, Object obj2, View view, Object obj3) {
        if (!(obj instanceof x) || !(obj3 instanceof com.bytedance.ies.web.jsbridge2.b)) {
            return null;
        }
        final com.bytedance.ies.bullet.c.e.a.b bVar = new com.bytedance.ies.bullet.c.e.a.b();
        com.bytedance.ies.web.jsbridge2.l a2 = x.a((x) obj);
        a2.f35674c = (com.bytedance.ies.web.jsbridge2.b) obj3;
        a2.f35682k = new s() {
            /* class com.ss.android.ugc.aweme.live.LiveHostOuterService.AnonymousClass3 */

            static {
                Covode.recordClassIndex(69293);
            }

            @Override // com.bytedance.ies.web.jsbridge2.s
            public final void a() {
                bVar.a();
            }
        };
        x d2 = a2.d();
        bVar.a(Context.class, context);
        if (obj2 instanceof com.bytedance.ies.bullet.service.base.c.c) {
            bVar.a(com.bytedance.ies.bullet.service.base.c.c.class, obj2);
        }
        if (view instanceof LynxView) {
            bVar.a(LynxView.class, view);
        }
        if (context instanceof Activity) {
            bVar.b(com.bytedance.ies.bullet.ui.common.g.class, new BulletActivityWrapper((Activity) context));
        }
        List<com.bytedance.ies.bullet.c.c.a.k> a3 = BulletHostProxy.b().a(bVar);
        for (int i2 = 0; i2 < a3.size(); i2++) {
            com.bytedance.ies.bullet.c.c.a.k kVar = a3.get(i2);
            d2.a(kVar.d(), (e.b) new ac(this, kVar));
        }
        return d2;
    }
}
