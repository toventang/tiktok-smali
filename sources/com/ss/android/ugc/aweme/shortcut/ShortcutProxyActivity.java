package com.ss.android.ugc.aweme.shortcut;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouteSet;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.money.growth.e;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.e;
import h.f.b.l;

public final class ShortcutProxyActivity extends com.bytedance.ies.foundation.activity.a {
    public static final a Companion = new a((byte) 0);
    private SparseArray _$_findViewCache;

    static {
        Covode.recordClassIndex(81930);
    }

    public final void ShortcutProxyActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81931);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Intent a(Context context, h hVar) {
            l.d(context, "");
            l.d(hVar, "");
            Intent intent = new Intent(context, ShortcutProxyActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra(StringSet.type, hVar.toString());
            return intent;
        }
    }

    private final void openMoneyGrowthPage() {
        String com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "open_url");
        if (com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            l.b();
        }
        e.a(com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, this);
        r.a("enter_activity_page", new d().a("enter_from", "feed_popup").f66730a);
    }

    private final void openShootingPage() {
        SmartRouteSet buildRoute = SmartRouteSet.Companion.buildRoute(this);
        SmartRoute buildRoute2 = SmartRouter.buildRoute(this, "//main");
        l.b(buildRoute2, "");
        buildRoute.addRoute(buildRoute2);
        SmartRoute buildRoute3 = SmartRouter.buildRoute(this, "//shortcut/shooting");
        l.b(buildRoute3, "");
        buildRoute.addRoute(buildRoute3);
        buildRoute.open();
    }

    private final void openNormalPage(String str) {
        SmartRouter.buildRoute(this, str).open();
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutProxyActivity shortcutProxyActivity) {
        shortcutProxyActivity.ShortcutProxyActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutProxyActivity shortcutProxyActivity) {
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutProxyActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    private final boolean needBlock(boolean z) {
        if (z || e.f124696a == null) {
            return false;
        }
        Intent intent = new Intent(this, e.f124696a);
        intent.putExtra(StringSet.type, com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), StringSet.type));
        intent.putExtra("open_url", com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "open_url"));
        com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(this, intent);
        return true;
    }

    private final void openPage(h hVar) {
        int i2 = f.f124704a[hVar.ordinal()];
        if (i2 == 1) {
            openMoneyGrowthPage();
        } else if (i2 == 2) {
            openMoneyGrowthPage();
        } else if (i2 == 3) {
            openNormalPage("//shortcut/message");
        } else if (i2 == 4) {
            openShootingPage();
        } else if (i2 == 5) {
            openNormalPage("//shortcut/trending");
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        h hVar;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("from_live_block_dialog", false);
        try {
            String com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), StringSet.type);
            if (com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
                com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "";
            }
            l.b(com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, "");
            hVar = h.valueOf(com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        } catch (IllegalArgumentException unused) {
            hVar = h.NONE;
        }
        if (!booleanExtra) {
            r.a("shortcut_click", new d().a(StringSet.type, hVar.toString()).f66730a);
            UgCommonServiceImpl.j().h().a(e.a.SHORTCUT, hVar.getValue());
        }
        if (needBlock(booleanExtra)) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
            return;
        }
        openPage(hVar);
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
    }

    public static String com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(ShortcutProxyActivity shortcutProxyActivity, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, shortcutProxyActivity);
        shortcutProxyActivity.startActivity(intent);
    }
}
