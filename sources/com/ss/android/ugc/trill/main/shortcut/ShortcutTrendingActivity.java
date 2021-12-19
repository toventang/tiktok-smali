package com.ss.android.ugc.trill.main.shortcut;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.MainActivity;
import org.greenrobot.eventbus.j;

public class ShortcutTrendingActivity extends MainActivity implements j {
    boolean isFirstOpenFlag = true;

    static {
        Covode.recordClassIndex(98982);
    }

    public void ShortcutTrendingActivity__onStop$___twin___() {
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
        com_ss_android_ugc_trill_main_shortcut_ShortcutTrendingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.main.MainActivity
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void jumpProxy() {
        if (this.isFirstOpenFlag) {
            this.isFirstOpenFlag = false;
            this.mDataCenter.a("proformToTab", "DISCOVER");
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.main.MainActivity
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onResume", true);
        super.onResume();
        jumpProxy();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onResume", false);
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutTrendingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutTrendingActivity shortcutTrendingActivity) {
        shortcutTrendingActivity.ShortcutTrendingActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutTrendingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutTrendingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutTrendingActivity shortcutTrendingActivity) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutTrendingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutTrendingActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutTrendingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.ss.android.ugc.aweme.main.h, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.main.MainActivity, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onCreate", true);
        super.onCreate(bundle);
        r.a("shortcut_click", new d().a(StringSet.type, "trending").f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutTrendingActivity", "onCreate", false);
    }
}
