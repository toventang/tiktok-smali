package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.internal.h.b;

public class ProxyBillingActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f5772a;

    static {
        Covode.recordClassIndex(2419);
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f5772a);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        a.a(this, bundle);
        super.onCreate(bundle);
        if (bundle == null) {
            this.f5772a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            } else {
                pendingIntent = null;
            }
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 100, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e2) {
                String.valueOf(String.valueOf(e2)).length();
                this.f5772a.send(6, null);
                finish();
            }
        } else {
            this.f5772a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        Bundle a2;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 100) {
            int i4 = b.a(intent).f5852a;
            ResultReceiver resultReceiver = this.f5772a;
            if (intent == null) {
                a2 = null;
            } else {
                a2 = a(intent);
            }
            resultReceiver.send(i4, a2);
        }
        finish();
    }
}
