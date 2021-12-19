package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.utils.il;
import h.f.b.l;
import java.util.Random;

public final class RequireLoginActivity extends Activity {

    /* renamed from: d  reason: collision with root package name */
    public static final a f79416d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f79417a;

    /* renamed from: b  reason: collision with root package name */
    public Intent f79418b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79419c;

    /* renamed from: e  reason: collision with root package name */
    private final IAccountService.g f79420e = new b(this);

    static {
        Covode.recordClassIndex(49318);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49319);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static String b(Uri uri) {
            if (uri == null) {
                return null;
            }
            if (l.a((Object) uri.getHost(), (Object) "webview")) {
                return il.a(il.a(uri), "awedp_require_login");
            }
            return uri.getQueryParameter("awedp_require_login");
        }

        public static boolean a(Uri uri) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                return false;
            }
            if (MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
                return true;
            }
            return l.a((Object) "normal", (Object) b(uri));
        }

        public static void a(Activity activity, Intent intent) {
            com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
            activity.startActivity(intent);
        }

        public static void a(Activity activity, String str, boolean z) {
            l.d(activity, "");
            l.d(str, "");
            Intent intent = new Intent(activity, RequireLoginActivity.class);
            intent.putExtra("deep_link_intent", activity.getIntent());
            intent.putExtra("enter_from", str);
            intent.putExtra("is_new_procedure", z);
            activity.overridePendingTransition(0, 0);
            a(activity, intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
    }

    private final void a(Intent intent) {
        Intent intent2;
        String str = null;
        if (intent != null) {
            str = a(intent, "enter_from");
        }
        this.f79417a = str;
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("is_new_procedure", false);
        }
        this.f79419c = z;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("deep_link_intent")) != null) {
            this.f79418b = intent2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        a(getIntent());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_fullscreen_dialog", true);
        bundle2.putBoolean("is_skippable_dialog", false);
        bundle2.putBoolean("need_callback", true);
        IAccountService.d dVar = new IAccountService.d();
        dVar.f62402b = "deeplink";
        dVar.f62401a = this;
        dVar.f62405e = this.f79420e;
        dVar.f62404d = bundle2;
        AccountService.a().g().showLoginAndRegisterView(dVar.a());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b implements IAccountService.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RequireLoginActivity f79421a;

        static {
            Covode.recordClassIndex(49320);
        }

        b(RequireLoginActivity requireLoginActivity) {
            this.f79421a = requireLoginActivity;
        }

        @Override // com.ss.android.ugc.aweme.IAccountService.g
        public final void onResult(int i2, int i3, Object obj) {
            Class<? extends Activity> deepLinkHandlerActivityClass;
            String str;
            if (i2 == 1 && i3 == 1) {
                Intent intent = this.f79421a.f79418b;
                RequireLoginActivity requireLoginActivity = this.f79421a;
                String str2 = requireLoginActivity.f79417a;
                boolean z = this.f79421a.f79419c;
                l.d(requireLoginActivity, "");
                if (!(intent == null || intent.getData() == null)) {
                    if (l.a((Object) str2, (Object) "from_app_link")) {
                        deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppLinkHandlerActivityClass(z);
                    } else {
                        deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeepLinkHandlerActivityClass(z);
                    }
                    Intent intent2 = new Intent(requireLoginActivity, deepLinkHandlerActivityClass);
                    Uri data = intent.getData();
                    if (data != null) {
                        str = data.toString();
                    } else {
                        str = null;
                    }
                    g gVar = new g(str);
                    gVar.a("random", new Random(1000).toString());
                    intent2.setData(Uri.parse(gVar.a()));
                    intent2.putExtras(intent);
                    intent2.putExtra("inner_from", "require_login");
                    a.a(requireLoginActivity, intent2);
                }
            } else {
                Intent intent3 = this.f79421a.getIntent();
                if (intent3 == null) {
                    intent3 = new Intent();
                }
                RequireLoginActivity requireLoginActivity2 = this.f79421a;
                IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                l.b(createIMainServicebyMonsterPlugin, "");
                intent3.setClass(requireLoginActivity2, createIMainServicebyMonsterPlugin.getMainActivityClass());
                intent3.putExtra("from_require_login", true);
                intent3.setFlags(335544320);
                RequireLoginActivity requireLoginActivity3 = this.f79421a;
                com.ss.android.ugc.tiktok.security.a.a.a(intent3, requireLoginActivity3);
                requireLoginActivity3.startActivity(intent3);
            }
            this.f79421a.finish();
        }
    }
}
