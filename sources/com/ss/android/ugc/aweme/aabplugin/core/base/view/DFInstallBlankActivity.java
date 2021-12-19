package com.ss.android.ugc.aweme.aabplugin.core.base.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.aabplugin.core.base.m;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

public class DFInstallBlankActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f62547a;

    static {
        Covode.recordClassIndex(38481);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        if (this.f62547a) {
            c.a().b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
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

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        finish();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        String str;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", true);
        super.onCreate(bundle);
        m<?> b2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.a().b(a(getIntent(), "module_name"));
        if (b2 != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("is_hold_progress_dialog", false);
            this.f62547a = booleanExtra;
            if (booleanExtra) {
                c a2 = c.a();
                T t = b2.f62500g;
                a aVar = new a(b2);
                if (t.f62509c == null || (str = t.f62509c.f35098b) == null) {
                    str = getString(R.string.c48);
                }
                WeakReference weakReference = new WeakReference(this);
                a2.f62556a = new b(this);
                a2.f62556a.setCancelable(true);
                a2.f62556a.setCanceledOnTouchOutside(false);
                a2.f62556a.setIndeterminate(false);
                a2.f62556a.setMax(100);
                a2.f62556a.setMessage(str);
                a2.f62556a.setOnCancelListener(aVar);
                a2.f62556a.setOnDismissListener(new d(weakReference));
                if (!isFinishing()) {
                    a2.f62556a.show();
                }
            }
            if (getIntent().getBooleanExtra("is_hold_permission_dialog", false) && !b2.a((a) this)) {
                finish();
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
