package com.ss.android.ugc.aweme.compliance.protection.timelock.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.w;
import com.zhiliaoapp.musically.R;

public class TimeUnlockActivity extends a {

    /* renamed from: b  reason: collision with root package name */
    public static String f78014b = "UNLOCK";

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a
    public final int a() {
        return R.layout.u7;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(48369);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a
    public void onBackPressed() {
        if (com.ss.android.ugc.aweme.compliance.protection.timelock.a.a() != null) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a
    public final void b() {
        View findViewById = findViewById(R.id.b94);
        findViewById.setBackgroundColor(b.c(findViewById.getContext(), R.color.f159928l));
        this.f78015a = com.ss.android.ugc.aweme.compliance.common.e.a.a.a(w.class).a();
        this.f78015a.setArguments(a(getIntent()));
        com.ss.android.ugc.aweme.base.ui.session.a<Boolean> a2 = com.ss.android.ugc.aweme.compliance.protection.timelock.a.a();
        if (a2 != null) {
            a2.a(this.f78015a);
        }
        a(this.f78015a);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        a.d(this);
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.nd;
        activityConfiguration(new e(xVar));
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.TimeUnlockActivity", "onCreate", false);
    }
}
