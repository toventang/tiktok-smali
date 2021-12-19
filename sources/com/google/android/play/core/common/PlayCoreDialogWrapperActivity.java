package com.google.android.play.core.common;

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

public class PlayCoreDialogWrapperActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f53186a;

    static {
        Covode.recordClassIndex(32869);
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i4;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 0 && (resultReceiver = this.f53186a) != null) {
            if (i3 == -1) {
                bundle = new Bundle();
                i4 = 1;
            } else if (i3 == 0) {
                bundle = new Bundle();
                i4 = 2;
            }
            resultReceiver.send(i4, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Intent intent;
        a.a(this, bundle);
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            intent = new Intent();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.f53186a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) a(a(getIntent()), "confirmation_intent")).getIntentSender(), 0, intent, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.f53186a;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f53186a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
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
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f53186a);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
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
}
