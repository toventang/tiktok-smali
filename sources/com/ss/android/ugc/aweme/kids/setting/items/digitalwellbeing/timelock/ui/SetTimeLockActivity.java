package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui;

import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.i;
import com.zhiliaoapp.musically.R;

public class SetTimeLockActivity extends a {

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f106932b;

    static {
        Covode.recordClassIndex(68402);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a
    public final int a() {
        return R.layout.acb;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.SetTimeLockActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.SetTimeLockActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.SetTimeLockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a
    public final void b() {
        Fragment a2;
        if (TimeLockRuler.isSelfTimeLockOn()) {
            a2 = i.b();
        } else {
            a2 = i.a();
        }
        a(a2);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.dqe);
        this.f106932b = viewGroup;
        viewGroup.setBackgroundColor(b.c(viewGroup.getContext(), R.color.f159928l));
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.SetTimeLockActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.nd;
        activityConfiguration(new b(xVar));
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.SetTimeLockActivity", "onCreate", false);
    }
}
