package com.ss.ugc.aweme.performance.core.monitor.printer;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

public final class NotificationActivity extends Activity {
    static {
        Covode.recordClassIndex(101825);
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

    /* access modifiers changed from: protected */
    public final void onResume() {
        a.b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        a.a(this);
        super.onStart();
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
        super.onCreate(bundle);
        setContentView(R.layout.bs);
        ((TextView) findViewById(R.id.a1e)).setText(a(getIntent(), "key"));
        ((TextView) findViewById(R.id.cke)).setText(a(getIntent(), "stack"));
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
