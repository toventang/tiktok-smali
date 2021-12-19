package com.ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.design.a;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.init.I18nInitTask;
import com.bytedance.android.livesdk.init.InternalServiceInitTask;
import com.bytedance.android.livesdk.init.MonitorInitTask;
import com.bytedance.android.livesdk.init.PipoInitTask;
import com.bytedance.android.livesdk.init.SDKServiceInitTask;
import com.bytedance.android.livesdk.init.TTLynxInitTask;
import com.bytedance.android.livesdk.init.TaskManagerInitTask;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveEnablePopupQueueSettings;
import com.bytedance.android.livesdk.livesetting.other.NetMonitorAllowListSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveOptimizeThreadUsageSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveReplaceObjUnicodeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUseEmojiCompatSetting;
import com.bytedance.android.livesdk.y.b;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.android.livesdkapi.h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.l.a.a.e;
import com.bytedance.l.a.b.b;
import com.bytedance.l.b.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.feed.experiment.ag;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.d;
import com.ss.android.ugc.aweme.live.livehostimpl.ad;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.LiveParams;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.utils.in;
import f.a.aa;
import f.a.k.a;
import f.a.t;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

public class Live {
    private static volatile boolean sInitedLiveSDK;
    private static volatile boolean sInitedLiveSPI;

    static {
        Covode.recordClassIndex(69276);
    }

    static final /* synthetic */ void lambda$refreshLoginState$1$Live(Object obj) {
    }

    static final /* synthetic */ void lambda$refreshLoginState$2$Live(Throwable th) {
    }

    public static boolean openLiveRecord() {
        return openLiveRecordBySchema("");
    }

    public static String getLiveDomain() {
        if (d.c()) {
            return "webcast.tiktokv.com";
        }
        return "webcast-va.tiktokv.com";
    }

    public static boolean invalid() {
        if (getServiceInternal() == null) {
            return true;
        }
        return false;
    }

    private static boolean enableLaunchParasiticModules() {
        if (getService() != null) {
            return ((Boolean) getService().a("live_enable_launch_parasitic_modules", (Object) true)).booleanValue();
        }
        return true;
    }

    public static void initSPI() {
        MethodCollector.i(10962);
        if (!sInitedLiveSPI) {
            synchronized (Live.class) {
                try {
                    if (!sInitedLiveSPI) {
                        initService();
                        f.a(new ad());
                        sInitedLiveSPI = true;
                    }
                } finally {
                    MethodCollector.o(10962);
                }
            }
            return;
        }
        MethodCollector.o(10962);
    }

    private static void launchParasiticModules() {
        try {
            for (ILiveParasiticModuleLaunchService iLiveParasiticModuleLaunchService : ServiceManager.get().getServices(ILiveParasiticModuleLaunchService.class)) {
                iLiveParasiticModuleLaunchService.a();
            }
        } catch (Throwable th) {
            HashMap hashMap = new HashMap();
            hashMap.put("error_msg", th.getMessage());
            c.a("ttlive_live_launch_parasitic_modules", 1, hashMap);
        }
    }

    public static void refreshLoginState() {
        aa c2;
        t a2 = t.a(r.f108528a);
        if (LiveOptimizeThreadUsageSetting.INSTANCE.getValue()) {
            c2 = a.a(g.a());
        } else {
            c2 = f.a.h.a.c(a.f158008e);
        }
        a2.b(c2).a(s.f108532a, t.f108626a);
    }

    public static void switchLocale() {
        com.bytedance.android.livesdkapi.service.d service;
        Locale a2;
        Context a3 = com.bytedance.ies.ugc.appcontext.d.a();
        if (a3 != null && (service = getService()) != null && (a2 = com.ss.android.ugc.aweme.i18n.language.a.a((String) null, (String) null, a3)) != null && !TextUtils.isEmpty(a2.getLanguage())) {
            service.a(a2);
        }
    }

    public static com.bytedance.android.livesdkapi.service.d getService() {
        if (!com.ss.android.common.util.f.a(com.bytedance.ies.ugc.appcontext.d.a())) {
            com.bytedance.android.live.core.c.a.a(6, "Live", "cannot use LiveService in non-main process");
            HashMap hashMap = new HashMap(2);
            hashMap.put("error_msg", Log.getStackTraceString(new Throwable("")));
            a.C0976a.f39760a.a("ttlive_init_non_main_process_error", 1, hashMap);
            return null;
        }
        com.bytedance.android.livesdkapi.service.d serviceInternal = getServiceInternal();
        if (serviceInternal == null) {
            com.bytedance.android.live.core.c.a.a(6, "Live", "Live getService is null");
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("error_msg", Log.getStackTraceString(new Throwable("")));
            a.C0976a.f39760a.a("ttlive_live_get_service_null_error", 1, hashMap2);
        }
        return serviceInternal;
    }

    private static void initService() {
        com.bytedance.l.a.a(g.class, new ag());
        com.bytedance.l.a.a(b.class, new com.bytedance.l.b.b.b());
        com.bytedance.l.a.a(com.bytedance.l.a.b.a.class, new com.bytedance.l.b.b.a());
        com.bytedance.l.a.a(com.bytedance.l.a.a.g.class, new com.bytedance.l.b.a.g());
        com.bytedance.l.a.a(com.bytedance.l.a.a.f.class, new com.bytedance.l.b.a.f());
        com.bytedance.l.a.a(e.class, new com.bytedance.l.b.a.e());
        com.bytedance.l.a.a(com.bytedance.l.a.a.d.class, new com.bytedance.l.b.a.d());
        com.bytedance.l.a.a(com.bytedance.l.a.a.c.class, new com.bytedance.l.b.a.c());
        com.bytedance.l.a.a(com.bytedance.l.a.a.b.class, new com.bytedance.l.b.a.b());
        com.bytedance.l.a.a(com.bytedance.l.a.a.a.class, new com.bytedance.l.b.a.a());
    }

    public static void syncShareCookieToTarget() {
        String cookie;
        try {
            String a2 = com.a.a("https://%s/", new Object[]{getLiveDomain()});
            if (!com.ss.android.ugc.aweme.account.util.a.a() || a2.toLowerCase(Locale.ROOT).startsWith("https")) {
                String cookie2 = CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
                CookieManager.getInstance().setAcceptCookie(true);
                if (!TextUtils.isEmpty(cookie2)) {
                    for (String str : cookie2.split("; ")) {
                        CookieManager.getInstance().setCookie(a2, str);
                        if (com.ss.android.common.util.f.a(com.bytedance.ies.ugc.appcontext.g.a()) && ag.a() && (cookie = CookieManager.getInstance().getCookie(com.ss.android.ugc.aweme.feed.f.a.a())) != null && !TextUtils.equals(cookie, com.ss.android.ugc.aweme.feed.f.a.b())) {
                            com.ss.android.ugc.aweme.feed.f.a.a(com.ss.android.ugc.aweme.feed.f.a.a(), cookie);
                        }
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Cookie url must be https");
        } catch (Exception unused) {
        }
    }

    private static com.bytedance.android.livesdkapi.service.d getServiceInternal() {
        MethodCollector.i(10791);
        if (!sInitedLiveSDK) {
            synchronized (Live.class) {
                try {
                    if (sInitedLiveSDK) {
                        return f.a();
                    }
                    com.bytedance.android.live.core.d.b.a("init_live_all_duration");
                    com.bytedance.android.live.core.d.b.a("init_live_host_service");
                    initSPI();
                    ad adVar = new ad();
                    com.bytedance.android.live.core.d.b.b("init_live_host_service");
                    com.bytedance.android.live.core.d.b.a("init_live_service");
                    com.bytedance.android.live.core.d.b.a("init_live_sdk_service");
                    if (!f.f23196a) {
                        synchronized (f.class) {
                            try {
                                if (!f.f23196a) {
                                    f.a(adVar);
                                    com.bytedance.android.live.core.d.b.a("init_live_setting_init");
                                    SettingsManager.INSTANCE.init(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest(), new com.bytedance.android.livesdk.livesetting.c(), new com.bytedance.android.livesdk.livesetting.a());
                                    com.bytedance.android.live.core.d.b.b("init_live_setting_init");
                                    f.a("com.bytedance.android.live.base.model.proto.ProtocolBuffersCollector", "init");
                                    b.a.f22918a.a(1, new I18nInitTask());
                                    b.a.f22918a.a(2, new InternalServiceInitTask());
                                    b.a.f22918a.a(3, new MonitorInitTask());
                                    b.a.f22918a.a(9, new PipoInitTask());
                                    b.a.f22918a.a(8, new TTLynxInitTask());
                                    b.a.f22918a.a(4, new TaskManagerInitTask());
                                    b.a.f22918a.a(0, new SDKServiceInitTask());
                                    com.bytedance.android.live.network.model.a.f12137a = h.f23208a;
                                    com.bytedance.android.live.network.model.a.f12138b = Arrays.asList(NetMonitorAllowListSettings.INSTANCE.getValue());
                                    com.bytedance.android.livesdk.ak.c.f13938a = LiveEnablePopupQueueSettings.INSTANCE.getValue();
                                    com.bytedance.android.live.core.d.b.b("init_live_sdk_service");
                                    com.bytedance.android.live.core.d.b.a("init_live_feed_service");
                                    ((com.bytedance.android.b.a.b) com.bytedance.android.live.t.a.a(com.bytedance.android.b.a.b.class)).init();
                                    com.bytedance.android.live.core.d.b.b("init_live_feed_service");
                                    com.bytedance.android.live.core.d.b.b("init_live_service");
                                    com.bytedance.android.live.core.d.b.a("init_live_launch_task");
                                    com.bytedance.android.livesdk.y.b bVar = b.a.f22918a;
                                    if (bVar.f22915e == null) {
                                        int size = bVar.f22912b.size();
                                        int[] iArr = new int[2];
                                        iArr[1] = bVar.f22912b.size();
                                        iArr[0] = size;
                                        bVar.f22914d = (int[][]) Array.newInstance(int.class, iArr);
                                        int[] iArr2 = new int[bVar.f22912b.size()];
                                        for (Map.Entry<Integer, Integer> entry : bVar.f22912b.entrySet()) {
                                            List<Integer> preTasks = bVar.f22911a.get(entry.getKey()).getPreTasks();
                                            if (preTasks != null) {
                                                for (Integer num : preTasks) {
                                                    if (num != entry.getKey()) {
                                                        bVar.f22914d[bVar.f22912b.get(num).intValue()][bVar.f22912b.get(entry.getKey()).intValue()] = 1;
                                                    }
                                                }
                                            }
                                        }
                                        Stack stack = new Stack();
                                        int size2 = bVar.f22912b.size();
                                        for (int i2 = 0; i2 < size2; i2++) {
                                            iArr2[i2] = 0;
                                        }
                                        for (int i3 = 0; i3 < size2; i3++) {
                                            if (iArr2[i3] == 0 && !bVar.a(i3, iArr2, stack)) {
                                                RuntimeException runtimeException = new RuntimeException(bVar.f22911a.get(Integer.valueOf(i3)).getClass().getCanonicalName() + " is circular dependence, please review task dependence");
                                                MethodCollector.o(10791);
                                                throw runtimeException;
                                            }
                                        }
                                        int i4 = -1;
                                        com.bytedance.android.livesdk.y.a aVar = null;
                                        while (!stack.empty()) {
                                            int intValue = bVar.f22913c.get(stack.pop()).intValue();
                                            if (bVar.f22911a.containsKey(Integer.valueOf(i4))) {
                                                bVar.f22911a.get(Integer.valueOf(i4)).mNextTask = bVar.f22911a.get(Integer.valueOf(intValue));
                                            } else {
                                                aVar = bVar.f22911a.get(Integer.valueOf(intValue));
                                            }
                                            i4 = intValue;
                                        }
                                        bVar.f22915e = aVar;
                                    }
                                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                        bVar.a();
                                    } else if (bVar.f22916f == null) {
                                        bVar.b();
                                    }
                                    com.bytedance.android.livesdk.ab.d.e.a();
                                    com.bytedance.android.live.core.d.b.a("init_live_feed_init");
                                    ((com.bytedance.android.b.a.b) com.bytedance.android.live.t.a.a(com.bytedance.android.b.a.b.class)).delayInit();
                                    com.bytedance.android.live.core.d.b.b("init_live_feed_init");
                                    com.bytedance.android.live.core.d.b.b("init_live_launch_task");
                                    a.C0139a.f9358a.f9355a = LiveUseEmojiCompatSetting.INSTANCE.getValue();
                                    a.C0139a.f9358a.f9356b = LiveReplaceObjUnicodeSetting.INSTANCE.getValue();
                                    f.f23196a = true;
                                }
                            } catch (Throwable th) {
                                MethodCollector.o(10791);
                                throw th;
                            }
                        }
                    }
                    com.bytedance.android.live.core.d.b.a("init_live_refresh_login_state");
                    refreshLoginState();
                    com.bytedance.android.live.core.d.b.b("init_live_refresh_login_state");
                    com.bytedance.android.live.core.d.b.b("init_live_all_duration");
                    HashMap hashMap = new HashMap(com.bytedance.android.live.core.d.b.f8963a);
                    com.bytedance.android.live.core.d.b.f8963a.clear();
                    JSONObject jSONObject = new JSONObject();
                    for (String str : com.bytedance.android.live.core.d.b.f8964b) {
                        String a2 = com.bytedance.android.live.core.d.b.a(str, true);
                        String a3 = com.bytedance.android.live.core.d.b.a(str, false);
                        long a4 = com.bytedance.android.live.core.d.b.a(hashMap, a2);
                        long a5 = com.bytedance.android.live.core.d.b.a(hashMap, a3);
                        if (!(a4 == 0 || a5 == 0)) {
                            com.bytedance.android.live.core.d.b.a(jSONObject, str, Long.valueOf(a5 - a4));
                        }
                    }
                    com.bytedance.android.live.core.d.b.a(jSONObject, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
                    c.b("ttlive_live_init_time_all", 0, jSONObject);
                    sInitedLiveSDK = true;
                    if (enableLaunchParasiticModules()) {
                        launchParasiticModules();
                    }
                } finally {
                    MethodCollector.o(10791);
                }
            }
        }
        com.bytedance.android.livesdkapi.service.d a6 = f.a();
        MethodCollector.o(10791);
        return a6;
    }

    private static boolean isPrivateAccount(User user) {
        if (user == null || !user.isSecret()) {
            return false;
        }
        return true;
    }

    private static boolean hasFollowed(User user) {
        if (user == null) {
            return false;
        }
        if (user.getFollowStatus() == 1 || user.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static boolean showLive(User user) {
        if (user == null || !user.isLive() || !com.ss.android.ugc.aweme.story.c.a()) {
            return false;
        }
        if (isPrivateAccount(user)) {
            return hasFollowed(user);
        }
        return true;
    }

    public static boolean openLiveRecordBySchema(final String str) {
        final Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (j2 == null) {
            return false;
        }
        if (in.d()) {
            n.a("ttlive_minor_mode_live", "", (JSONObject) null);
        }
        if (com.ss.android.ugc.aweme.utils.permission.e.a(j2) == 0 && com.ss.android.ugc.aweme.utils.permission.e.b(j2) == 0 && com.ss.android.ugc.aweme.utils.permission.e.c(j2) == 0) {
            jumpToLive(j2, str);
            return true;
        }
        com.ss.android.ugc.aweme.ce.b.a(j2, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new b.AbstractC1579b() {
            /* class com.ss.android.ugc.aweme.live.Live.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69277);
            }

            @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
            public final void a(String[] strArr, int[] iArr) {
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        return;
                    }
                }
                Live.jumpToLive(j2, str);
            }
        });
        return true;
    }

    public static void jumpToLive(final Activity activity, String str) {
        final RecordConfig.Builder reshootConfig = new RecordConfig.Builder().shootWay("direct_shoot").translationType(3).defaultTab(2).enterFrom(Uri.parse(str).getQueryParameter("enter_from")).liveParams(new LiveParams(Uri.parse(str).getQueryParameter("source_params"), false)).reshootConfig(new ReshootConfig(true, true));
        AVExternalServiceImpl.a().asyncService("Live", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.live.Live.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69278);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                asyncAVService.uiService().recordService().startRecord(activity, reshootConfig.build());
            }
        });
    }
}
