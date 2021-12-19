package com.ss.android.ugc.trill.main.shortcut;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;

public class ShortcutShootingActivity extends a {
    static {
        Covode.recordClassIndex(98980);
    }

    public void ShortcutShootingActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        AVExternalServiceImpl.a().asyncServiceWithActivity(this, "shortcut", new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(98981);
            }

            @Override // com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                ShortcutShootingActivity.this.finish();
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                ShortcutShootingActivity.this.finish();
                Intent intent = ShortcutShootingActivity.this.getIntent();
                intent.putExtra("shoot_way", "short_cut");
                asyncAVService.uiService().recordService().startRecord(ShortcutShootingActivity.this, intent);
            }
        });
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ShortcutShootingActivity shortcutShootingActivity) {
        shortcutShootingActivity.ShortcutShootingActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ShortcutShootingActivity shortcutShootingActivity) {
        com_ss_android_ugc_trill_main_shortcut_ShortcutShootingActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(shortcutShootingActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutShootingActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", true);
        super.onCreate(bundle);
        r.a("shortcut_click", new d().a(StringSet.type, "shooting").f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.main.shortcut.ShortcutShootingActivity", "onCreate", false);
    }
}
