package com.linecorp.linesdk.auth.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public class LineAuthenticationCallbackActivity extends Activity {
    static {
        Covode.recordClassIndex(34537);
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
    public void onResume() {
        a.b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
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
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        Intent intent = new Intent(this, LineAuthenticationActivity.class);
        intent.setData(getIntent().getData());
        intent.setFlags(335544320);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
        startActivity(intent);
        finish();
    }
}
