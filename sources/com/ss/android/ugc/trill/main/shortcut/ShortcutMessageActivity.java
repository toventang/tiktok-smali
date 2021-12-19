package com.ss.android.ugc.trill.main.shortcut;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.main.MainActivity;
import org.greenrobot.eventbus.j;

public class ShortcutMessageActivity extends MainActivity implements j {
    boolean isFirstOpenFlag = true;

    static {
        Covode.recordClassIndex(98979);
    }

    public void ShortcutMessageActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.main.MainActivity
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.main.MainActivity
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.main.MainActivity
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.main.MainActivity
    public void onStop() {
        a.d(this);
        com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.main.MainActivity
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.main.MainActivity
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", true);
        super.onResume();
        jumpProxy();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onResume", false);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            if (b.g().isLogin()) {
                IMService.createIIMServicebyMonsterPlugin(false).openSessionListActivity(this);
            } else {
                this.mDataCenter.a("proformToTab", "NOTIFICATION");
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutMessageActivity shortcutMessageActivity) {
        shortcutMessageActivity.ShortcutMessageActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutMessageActivity shortcutMessageActivity) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutMessageActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutMessageActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutMessageActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.main.h, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.main.MainActivity, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", true);
        super.onCreate(bundle);
        r.a("shortcut_click", new d().a(StringSet.type, "message").f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutMessageActivity", "onCreate", false);
    }
}
