package com.ss.android.account.share.data.write.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.account.share.data.write.a;
import com.ss.android.account.share.data.write.b;

public final class ShareDataActivity extends Activity {
    static {
        Covode.recordClassIndex(36185);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        a.c(this);
        super.onPause();
    }

    public final void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        a.a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
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

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", true);
        super.onCreate(bundle);
        Intent intent = new Intent();
        try {
            if (!b.a(getCallingPackage())) {
                intent.putExtra("EXTRA_IS_SUCCESS", 0);
                setResult(-1, intent);
            } else {
                intent.putExtra("EXTRA_IS_SUCCESS", 1);
                String a2 = a(getIntent(), "EXTRA_KEY");
                if (a2 == null) {
                    a2 = "";
                }
                intent.putExtra("EXTRA_VALUE", a.C1281a.a(this).a(a2));
                setResult(-1, intent);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            com.ss.android.account.share.data.a.a().a("share_sdk_activity_read_local_data_failed").a("err_msg", e2.getMessage()).a("err_msg_stack", Log.getStackTraceString(e2)).b();
            intent.putExtra("EXTRA_IS_SUCCESS", 0);
            setResult(-1, intent);
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.account.share.data.write.activity.ShareDataActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
