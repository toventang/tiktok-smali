package com.ss.android.ugc.aweme.openauthorize;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.utils.ap;
import java.util.ArrayList;

public class AwemeAuthorizeLoginActivity extends a {
    static {
        Covode.recordClassIndex(73685);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onWindowFocusChanged", true);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", true);
        activityConfiguration(a.f114495a);
        super.onCreate(bundle);
        Bundle bundle2 = new ap().a("only_login", true).f142646a;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("authorize_hide_platforms");
        if (stringArrayListExtra != null) {
            bundle2.putStringArrayList("authorize_hide_platforms", stringArrayListExtra);
        }
        String a2 = a(getIntent(), "auth_from_app");
        if (a2 != null) {
            bundle2.putString("auth_from_app", a2);
        }
        c.a(this, "authorize", "", bundle2, new f() {
            /* class com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73686);
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void a() {
                AwemeAuthorizeLoginActivity.this.setResult(-1);
                AwemeAuthorizeLoginActivity.this.finish();
            }

            @Override // com.ss.android.ugc.aweme.base.component.f
            public final void b() {
                AwemeAuthorizeLoginActivity.this.setResult(0);
                AwemeAuthorizeLoginActivity.this.finish();
            }
        });
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizeLoginActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
