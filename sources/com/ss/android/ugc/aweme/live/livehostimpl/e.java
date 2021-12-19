package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSchemaSkipDeepLinkEnableSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveSchemaSkipDeepLinkSetting;
import com.bytedance.android.livesdkapi.g.i;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.a.j;
import com.bytedance.ies.bullet.kit.lynx.ILynxKitApi;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.af;
import com.bytedance.ies.bullet.service.base.ak;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.b.f;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.i;
import com.bytedance.ies.bullet.service.f.f;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.j.a.c.b;
import com.bytedance.l.a;
import com.bytedance.router.SmartRouter;
import com.lynx.tasm.LynxEnv;
import com.ss.android.c.b;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.ax;
import com.ss.android.ugc.aweme.ck.r;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.ss.android.ugc.aweme.live.LiveDummyActivity;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.g;
import com.ss.android.ugc.aweme.live.g.c;
import com.ss.android.ugc.aweme.ttlive.ILiveApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.web.k;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements IHostAction {

    /* renamed from: a  reason: collision with root package name */
    private ILiveApi f108464a = ((ILiveApi) RetrofitFactory.a().b(b.f59141e).d().a(ILiveApi.class));

    static {
        Covode.recordClassIndex(69506);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openSignActivity(Context context, Intent intent) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openVideoDetailPage(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void switchToLiveTab(int i2, String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public boolean tryOpenAdByOpenUrl(Context context, long j2, String str, String str2) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public boolean tryShowKoiRedPackageInLive(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public List<com.bytedance.android.livesdkapi.model.b> getLiveActivityTasksSetting() {
        return LiveHostOuterService.q().j();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public String getReportUrl() {
        return LiveHostOuterService.q().k();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public JSONObject getTTSetting() {
        try {
            return LiveHostOuterService.q().o();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new JSONObject();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public IHostAction.c getVideoOnDemandParams() {
        IHostAction.c cVar = new IHostAction.c();
        double n = LiveHostOuterService.q().n();
        int m2 = LiveHostOuterService.q().m();
        cVar.f23239a = n;
        cVar.f23240b = m2;
        return cVar;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void finishLivePlayActivity() {
        Activity[] activityStack = ActivityStack.getActivityStack();
        Class c2 = ((g) a.b(g.class)).c();
        for (Activity activity : activityStack) {
            if (c2.isInstance(activity)) {
                activity.finish();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void initLynxEnv() {
        if (!LynxEnv.b().f55536f.get()) {
            com.ss.android.ugc.aweme.bullet.b.a().a(ILynxKitApi.class);
        }
        com.bytedance.ies.bullet.service.base.c.b bVar = (com.bytedance.ies.bullet.service.base.c.b) e.a.a().a("live", com.bytedance.ies.bullet.service.base.c.b.class);
        if (bVar == null || !l.a((Object) bVar.c(), (Object) "live")) {
            Context a2 = d.a();
            if (!(a2 instanceof Application)) {
                a2 = null;
            }
            Application application = (Application) a2;
            if (application != null) {
                b.a aVar = new b.a(application);
                com.bytedance.android.live.base.a a3 = com.bytedance.android.live.t.a.a(IHostContext.class);
                l.b(a3, "");
                com.bytedance.j.a.c.e.f38996b = ((IHostContext) a3).isLocalTest();
                com.bytedance.j.a.c.b a4 = aVar.a();
                com.bytedance.ies.bullet.service.base.a.l a5 = e.a.a();
                f.a a6 = new f.a().a(com.bytedance.ies.bullet.service.base.c.b.class, new com.bytedance.j.a.d(a4));
                c.a aVar2 = new c.a();
                ak.a aVar3 = new ak.a();
                aVar3.f32541b = "99999";
                f.a a7 = a6.a(o.class, new com.bytedance.ies.bullet.service.b.a(aVar2, aVar3.a()));
                j jVar = new j(application);
                l.b(k.f145061a, "");
                l.b("gecko-va.tiktokv.com", "");
                String a8 = com.ss.android.ugc.aweme.language.d.a();
                l.b(a8, "");
                ArrayList arrayList = new ArrayList();
                for (Pattern pattern : com.bytedance.android.livesdkapi.d.c.a()) {
                    if (pattern != null) {
                        String pattern2 = pattern.toString();
                        l.b(pattern2, "");
                        if (pattern2.length() > 0) {
                            Uri parse = Uri.parse(pattern.toString());
                            l.b(parse, "");
                            String path = parse.getPath();
                            if (!(path == null || path.length() == 0)) {
                                String path2 = parse.getPath();
                                if (path2 == null) {
                                    l.b();
                                }
                                l.b(path2, "");
                                arrayList.add(path2);
                            }
                        }
                    }
                }
                String valueOf = String.valueOf(d.n);
                String f2 = d.f();
                String serverDeviceId = AppLog.getServerDeviceId();
                if (serverDeviceId == null) {
                    serverDeviceId = "";
                }
                com.bytedance.ies.bullet.f.a aVar4 = new com.bytedance.ies.bullet.f.a();
                GeckoXNetImpl geckoXNetImpl = new GeckoXNetImpl(application);
                k kVar = k.f145061a;
                l.b(kVar, "");
                String c2 = kVar.c();
                l.b(c2, "");
                jVar.init(new i("gecko-va.tiktokv.com", a8, arrayList, valueOf, f2, serverDeviceId, new GeckoConfig(c2, "offlineX", new com.bytedance.ies.bullet.g.a.b(), true, false, 16, null), null, aVar4, geckoXNetImpl, 128));
                a5.a("live", a7.a(IResourceLoaderService.class, jVar).a(af.class, new com.bytedance.ies.bullet.service.f.g(new f.a().a())).a());
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public com.bytedance.android.livesdkapi.g.i getSearchComponent(final String str) {
        return new com.bytedance.android.livesdkapi.g.i() {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69507);
            }

            @Override // com.bytedance.android.livesdkapi.g.i
            public final List<EnterRoomConfig> a() {
                return LiveOuterService.s().i().a(str).a();
            }

            @Override // com.bytedance.android.livesdkapi.g.i
            public final void b() {
                LiveOuterService.s().i().a(str).b();
            }

            @Override // com.bytedance.android.livesdkapi.g.i
            public final void a(long j2) {
                LiveOuterService.s().i().a(str).a(j2);
            }

            @Override // com.bytedance.android.livesdkapi.g.i
            public final void a(Map<String, String> map) {
                LiveOuterService.s().i().a(str).a(map);
            }

            @Override // com.bytedance.android.livesdkapi.g.i
            public final void a(int i2, i.a aVar) {
                LiveOuterService.s().i().a(str).a(i2, aVar);
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void notifyShowLiveIconEntrance(boolean z) {
        LiveHostOuterService.q().a(z);
    }

    private static boolean a(Uri uri) {
        String host = uri.getHost();
        if (!(TextUtils.equals(host, "webcast_lynxview") || TextUtils.equals(host, "webcast_webview") || TextUtils.equals(host, "webcast_lynxview_popup") || TextUtils.equals(host, "webcast_webview_popup"))) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("url");
        if (TextUtils.isEmpty(queryParameter)) {
            return false;
        }
        Uri parse = Uri.parse(queryParameter);
        for (String str : LiveSchemaSkipDeepLinkSetting.INSTANCE.getValue()) {
            if (TextUtils.equals(parse.getHost(), str)) {
                return true;
            }
        }
        return false;
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openRegionListPage(Activity activity, final IHostAction.b bVar) {
        com.ss.android.ugc.aweme.account.b.b().openCountryListActivity(activity, new ax() {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69508);
            }

            @Override // com.ss.android.ugc.aweme.ax
            public final void onExit() {
                IHostAction.b bVar = bVar;
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // com.ss.android.ugc.aweme.ax
            public final void onChanged(String str, String str2) {
                IHostAction.b bVar = bVar;
                if (bVar != null) {
                    bVar.a(str, str2);
                }
            }
        });
    }

    private static String a(String str, Bundle bundle) {
        u a2 = u.a(str);
        for (String str2 : bundle.keySet()) {
            Object a3 = a(bundle, str2);
            if (a3 != null) {
                a2.a(str2, a3.toString());
            }
        }
        return a2.f71178a.a();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openFeedBack(String str, Context context) {
        Intent a2 = LiveHostOuterService.q().a(context);
        a2.setData(Uri.parse("https://m.tiktok.com/falcon/tiktok_rn_web/feedback/?hide_nav_bar=1?enter_from=".concat(String.valueOf(str))));
        a2.putExtra("hide_nav_bar", true);
        a(context, a2);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openUserProfilePage(long j2, Map<String, String> map) {
        u a2 = u.a("aweme://user/profile/".concat(String.valueOf(j2)));
        if (map != null) {
            for (String str : map.keySet()) {
                a2.a(str, map.get(str));
            }
        }
        t.a(t.a(), a2.f71178a.a());
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public boolean handleSchema(Context context, String str, Bundle bundle) {
        return handleSchema(context, str, bundle, true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public boolean openHostBrowser(String str, Bundle bundle, Context context) {
        Intent a2 = LiveHostOuterService.q().a(context);
        a2.putExtras(bundle);
        a2.setData(Uri.parse(str));
        a(context, a2);
        return true;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openLiveBrowser(String str, String str2, Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hide_nav_bar", TextUtils.isEmpty(str2));
        bundle.putString("title", str2);
        openLiveBrowser(str, bundle, context);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openUserProfilePage(Context context, long j2, Bundle bundle) {
        t.a(t.a(), "aweme://user/profile/".concat(String.valueOf(j2)));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void goEditDoBAgeGatePage(Activity activity, String str, IHostAction.a aVar) {
        this.f108464a.getDoBStatus().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(activity, aVar, str), new g(aVar));
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openLiveLynx(String str, Bundle bundle, Context context) {
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            bundle.putString("url", str);
            intent.putExtra("intent_type", 4);
            intent.putExtras(bundle);
            a(context, intent);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openLiveNewHybrid(Uri uri, Context context, Bundle bundle) {
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            intent.putExtra("intent_type", 5);
            bundle.putParcelable("bundle_uri", uri);
            intent.putExtras(bundle);
            a(context, intent);
        }
    }

    private static boolean a(Context context, String str, boolean z) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("sslocal://showcaseh5")) {
            LiveHostOuterService.q().a(context, str);
            return true;
        } else if (!z) {
            SmartRouter.buildRoute(context, str).open();
            return true;
        } else {
            Uri parse = Uri.parse(str);
            if (!LiveSchemaSkipDeepLinkEnableSetting.INSTANCE.getValue() || !a(parse)) {
                Intent b2 = LiveHostOuterService.q().b(context);
                b2.setData(parse);
                a(context, b2);
                return true;
            }
            SmartRouter.buildRoute(context, str).open();
            return true;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public void openLiveBrowser(String str, Bundle bundle, Context context) {
        Uri parse;
        if (!(context instanceof Activity)) {
            context = ActivityStack.getTopActivity();
        }
        if (context != null) {
            Intent intent = new Intent(context, LiveDummyActivity.class);
            bundle.putString("url", str);
            String string = bundle.getString("original_scheme");
            if (!TextUtils.isEmpty(string) && (parse = Uri.parse(string)) != null) {
                String queryParameter = parse.getQueryParameter("sec_link_scene");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("sec_link_scene", queryParameter);
                }
            }
            bundle.putBoolean("show_progress", false);
            intent.putExtra("intent_type", 1);
            intent.putExtras(bundle);
            a(context, intent);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public boolean openHostBrowser(String str, boolean z, String str2, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("aweme://webview/?url=").append(str);
        if (z) {
            sb.append("&title=").append(str2);
        }
        return a(context, sb.toString(), true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostAction
    public boolean handleSchema(Context context, String str, Bundle bundle, boolean z) {
        Activity activity;
        if (!(context instanceof Activity)) {
            return false;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1863814380:
                if (str.equals("//report") && (activity = (Activity) context) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("https://www.tiktokv.com/aweme/in_app/report/");
                    try {
                        sb.append("?object_id=").append(a(bundle, "reportVideo.user.id")).append("&owner_id=").append(a(bundle, "reportVideo.user.id")).append("&report_type=").append(a(bundle, "reportVideo.activity.type")).append("&room_id=").append(a(bundle, "reportVideo.media.id"));
                    } catch (Exception unused) {
                    }
                    Intent a2 = LiveHostOuterService.q().a((Context) activity);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("show_load_dialog", false);
                    bundle2.putBoolean("hide_nav_bar", true);
                    a2.putExtras(bundle2);
                    a2.setData(Uri.parse(sb.toString()));
                    com.ss.android.ugc.tiktok.security.a.a.a(a2, activity);
                    activity.startActivity(a2);
                    break;
                }
            case -1813849575:
                if (str.equals("//webview")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("aweme://webview/?url=").append(a(bundle, "bundle_open_url"));
                    if (bundle.containsKey("title")) {
                        sb2.append("&title=").append(a(bundle, "title"));
                    }
                    str = sb2.toString();
                    break;
                }
                break;
            case -1588030678:
                if (str.equals("//livend/submitfeedbackacitivity") && bundle != null && bundle.containsKey("roomId")) {
                    try {
                        u a3 = u.a(com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getFeedbackConf().getFeHelp());
                        a3.f71178a.a("roomId", bundle.getLong("roomId"));
                        r rVar = t.a().f71171c;
                        if (rVar.f71155b == null) {
                            rVar.f71155b = new ArrayList<>();
                        }
                        rVar.f71155b.add("roomId");
                        a3.a("feedback_id", "6954");
                        a3.a("enter_from", "live_end");
                        t.a(t.a(), a3.a());
                        break;
                    } catch (com.bytedance.ies.a unused2) {
                        break;
                    }
                }
            case -570110082:
                if (str.equals("//verify/acitivity")) {
                    str = "aweme://aweme/zhima/live";
                    break;
                }
                break;
            case -262720268:
                if (str.equals("//live/detail")) {
                    long j2 = bundle.getLong("live.intent.extra.ROOM_ID");
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.f23299c.R = j2;
                    LiveOuterService.s().i().a(context, enterRoomConfig, "");
                    break;
                }
                break;
            case 337200928:
                if (str.equals("//chargeDeal")) {
                    new i().openWallet((Activity) context);
                    return true;
                }
                break;
            case 947267529:
                if (str.equals("//profile")) {
                    str = a("aweme://user/profile/" + a(bundle, "user_id"), bundle);
                    break;
                }
                break;
            case 1392218355:
                if (str.equals("//item")) {
                    str = a("aweme://aweme/detail/" + a(bundle, "extra_key_id"), bundle);
                    break;
                }
                break;
        }
        return a(context, str, z);
    }
}
