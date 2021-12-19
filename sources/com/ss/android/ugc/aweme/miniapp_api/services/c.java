package com.ss.android.ugc.aweme.miniapp_api.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.miniapp_api.a.f;
import com.ss.android.ugc.aweme.miniapp_api.b.b;
import com.ss.android.ugc.aweme.miniapp_api.d;
import com.tt.appbrandimpl.MiniAppDependServiceImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

public class c implements IMiniAppService {

    /* renamed from: a  reason: collision with root package name */
    public static final String f109685a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private IMiniAppService f109686b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f109687c;

    /* renamed from: d  reason: collision with root package name */
    private Locale f109688d;

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public String addScene(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean checkMiniAppEnable(Context context) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public String getJsSdkVersion(Application application) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void getShareInfo(String str, b bVar) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void handleActivityImageResult(int i2, int i3, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void initMiniApp(com.ss.android.ugc.aweme.miniapp_api.b.a aVar) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void initWebViewSuffix(ContextWrapper contextWrapper, String str) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean isMinAppAvailable(Context context, String str) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void logExcitingVideoAd(Context context, String str, long j2, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void notifyFollowAwemeState(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void onRequestPermissionsResult(Activity activity, String[] strArr, int[] iArr) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean openShortcut(Context context, Intent intent) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void preloadMiniApp(String str) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void preloadMiniApp(String str, int i2) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void remoteMobV3(String str, JSONObject jSONObject) {
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public String setLaunchModeHostTask(String str) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void tryMoveMiniAppActivityToFront(String str) {
    }

    private c() {
        this.f109687c = true;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public a getMobClickCombinerIpcService() {
        return new d();
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public b getTTDownloaderIpcService() {
        return new e();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f109704a = new c((byte) 0);

        static {
            Covode.recordClassIndex(70232);
        }
    }

    static {
        Covode.recordClassIndex(70228);
    }

    public final IMiniAppService a() {
        com.ss.android.ugc.aweme.miniapp_api.a.c e2 = MiniAppDependServiceImpl.l().e();
        try {
            if (this.f109687c) {
                f c2 = MiniAppDependServiceImpl.l().c();
                HashMap hashMap = new HashMap();
                hashMap.put("plugin_version", e2.a());
                c2.a("miniapp_launch_crash", new JSONObject(hashMap));
                this.f109687c = false;
            }
        } catch (Throwable unused) {
        }
        IMiniAppService b2 = b();
        if (b2 == null) {
            return this;
        }
        return b2;
    }

    public final synchronized IMiniAppService b() {
        MethodCollector.i(3699);
        if (Build.VERSION.SDK_INT < 21) {
            MethodCollector.o(3699);
            return null;
        }
        IMiniAppService iMiniAppService = this.f109686b;
        if (iMiniAppService != null) {
            MethodCollector.o(3699);
            return iMiniAppService;
        }
        try {
            try {
                this.f109686b = (IMiniAppService) Class.forName("com.ss.android.ugc.aweme.miniapp.MiniAppService").getMethod("inst", new Class[0]).invoke(null, new Object[0]);
            } catch (IllegalAccessException e2) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e2);
            } catch (NoSuchMethodException e3) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e3);
            } catch (InvocationTargetException e4) {
                com.ss.android.ugc.aweme.framework.a.a.a("", e4);
            }
        } catch (Throwable unused) {
        }
        IMiniAppService iMiniAppService2 = this.f109686b;
        MethodCollector.o(3699);
        return iMiniAppService2;
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void notifyLocaleChange(Locale locale) {
        this.f109688d = locale;
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean openMiniApp(final Context context, final String str, final com.ss.android.ugc.aweme.miniapp_api.model.b.a aVar) {
        return com.ss.android.ugc.aweme.miniapp_api.c.a(d.d(str), new Runnable() {
            /* class com.ss.android.ugc.aweme.miniapp_api.services.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(70229);
            }

            public final void run() {
                if (c.this.b() != null) {
                    c.this.a().openMiniApp(context, str, aVar);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public boolean openMiniApp(final Context context, final com.ss.android.ugc.aweme.miniapp_api.model.b bVar, final com.ss.android.ugc.aweme.miniapp_api.model.b.a aVar) {
        return com.ss.android.ugc.aweme.miniapp_api.c.a(d.d(d.a(bVar)), new Runnable() {
            /* class com.ss.android.ugc.aweme.miniapp_api.services.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(70230);
            }

            public final void run() {
                if (c.this.b() != null && !(c.this.a() instanceof c)) {
                    c.this.a().openMiniApp(context, bVar, aVar);
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService
    public void jumpToMiniApp(final Context context, final String str, final String str2, final boolean z, final String str3, final String str4) {
        com.ss.android.ugc.aweme.miniapp_api.c.a(z, new Runnable() {
            /* class com.ss.android.ugc.aweme.miniapp_api.services.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(70231);
            }

            public final void run() {
                if (c.this.b() != null && !(c.this.a() instanceof c)) {
                    c.this.a().jumpToMiniApp(context, str, str2, z, str3, str4);
                }
            }
        });
    }
}
