package com.ss.android;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.account.f;
import com.zhiliaoapp.musically.R;

public class ShowDialogActivity extends Activity {
    static {
        Covode.recordClassIndex(36150);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
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

    /* access modifiers changed from: protected */
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", true);
        super.onResume();
        Intent intent = getIntent();
        String a2 = a(intent, "event");
        a2.hashCode();
        if (a2.equals("event_dialog")) {
            new AlertDialog.Builder(this).setTitle(a(intent, "title")).setMessage(a(intent, "message") + "\nPlease confirm that account adk is initialized correctly.").setPositiveButton("ok", new DialogInterface.OnClickListener() {
                /* class com.ss.android.ShowDialogActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(36151);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    ShowDialogActivity.this.finish();
                }
            }).setCancelable(false).show();
        }
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.c6);
        f.a();
        finish();
        ActivityAgent.onTrace("com.ss.android.ShowDialogActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
