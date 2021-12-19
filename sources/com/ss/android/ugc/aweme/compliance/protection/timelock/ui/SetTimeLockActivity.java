package com.ss.android.ugc.aweme.compliance.protection.timelock.ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.p;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.a;
import com.zhiliaoapp.musically.R;

public class SetTimeLockActivity extends a {

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f78012b;

    /* renamed from: c  reason: collision with root package name */
    private a f78013c;

    static {
        Covode.recordClassIndex(48368);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a
    public final int a() {
        return R.layout.u2;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a
    public final void b() {
        Fragment a2;
        Fragment a3;
        Fragment a4;
        this.f78012b = (ViewGroup) findViewById(R.id.dqe);
        a aVar = new a();
        this.f78013c = aVar;
        aVar.f78094a = getIntent().getIntExtra("SetTimeLockActivityKeyType", 0);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            a.C1812a aVar2 = new a.C1812a();
            aVar2.f78096a = a(getIntent(), "SetTimeLockActivityKeyUid");
            aVar2.f78097b = a(getIntent(), "SetTimeLockActivityKeySecUid");
            aVar2.f78098c = a(getIntent(), "SetTimeLockActivityKeyUsername");
            this.f78013c.f78095b = aVar2;
        }
        ((SetLockParamViewModel) ae.a(this, (ad.b) null).a(SetLockParamViewModel.class)).f78092a.setValue(this.f78013c);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            int intExtra = getIntent().getIntExtra("SetTimeLockActivityKeyLockTimeInMin", 0);
            if (intExtra > 0) {
                ((TimeLockOptionViewModel) ae.a(this, (ad.b) null).a(TimeLockOptionViewModel.class)).f78093a.setValue(new l.a(intExtra));
            }
            if (getIntent().getBooleanExtra("SetTimeLockActivityKeyParentState", false)) {
                a4 = p.c(this.f78013c.f78094a);
            } else {
                a4 = p.a(this.f78013c.f78094a);
            }
            a(a4);
        } else if (this.f78013c.f78094a == 0) {
            if (com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.c()) {
                a3 = p.c(this.f78013c.f78094a);
            } else {
                a3 = p.a(this.f78013c.f78094a);
            }
            a(a3);
        } else {
            if (com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.b()) {
                a2 = p.c(this.f78013c.f78094a);
            } else {
                a2 = p.a(this.f78013c.f78094a);
            }
            a(a2);
        }
        ViewGroup viewGroup = this.f78012b;
        viewGroup.setBackgroundColor(b.c(viewGroup.getContext(), R.color.f159928l));
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a, com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.nd;
        activityConfiguration(new b(xVar));
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(Context context, Intent intent) {
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }

    public static void a(Context context, int i2, String str, String str2, String str3, boolean z, int i3) {
        Intent intent = new Intent(context, SetTimeLockActivity.class);
        intent.putExtra("SetTimeLockActivityKeyType", i2);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("SetTimeLockActivityKeyFromParent", true);
            intent.putExtra("SetTimeLockActivityKeyUid", str);
            intent.putExtra("SetTimeLockActivityKeySecUid", str2);
            intent.putExtra("SetTimeLockActivityKeyUsername", str3);
            intent.putExtra("SetTimeLockActivityKeyParentState", z);
            intent.putExtra("SetTimeLockActivityKeyLockTimeInMin", i3);
        }
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        a(context, intent);
    }
}
