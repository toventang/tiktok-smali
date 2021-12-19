package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.f;

public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private int f49957a;

    static {
        Covode.recordClassIndex(31183);
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

    public void onCancel(DialogInterface dialogInterface) {
        this.f49957a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f49957a);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        if (bundle != null) {
            this.f49957a = bundle.getInt("resolution");
        }
        if (this.f49957a != 1) {
            Bundle a2 = a(getIntent());
            if (a2 == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) a(a2, "pending_intent");
            Integer num = (Integer) a(a2, "error_code");
            if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f49957a = 1;
                } catch (IntentSender.SendIntentException unused) {
                    finish();
                }
            } else if (num == null) {
                finish();
            } else {
                GoogleApiAvailability.getInstance().showErrorDialogFragment(this, num.intValue(), 2, this);
                this.f49957a = 1;
            }
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f49957a = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                f a2 = f.a(this);
                if (i3 == -1) {
                    a2.c();
                } else if (i3 == 0) {
                    a2.b(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.f49957a = 0;
            setResult(i3, intent);
        }
        finish();
    }

    public static Intent a(Context context, PendingIntent pendingIntent, int i2, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", z);
        return intent;
    }
}
