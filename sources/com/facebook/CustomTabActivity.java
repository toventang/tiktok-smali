package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public class CustomTabActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public static final String f46505a = (CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect");

    /* renamed from: b  reason: collision with root package name */
    public static final String f46506b = (CustomTabActivity.class.getSimpleName() + ".action_destroy");

    /* renamed from: c  reason: collision with root package name */
    private BroadcastReceiver f46507c;

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
    public void onDestroy() {
        a.e(this);
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.f46507c);
        super.onDestroy();
    }

    static {
        Covode.recordClassIndex(28381);
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
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f46505a);
        intent.putExtra(CustomTabMainActivity.f46512d, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 0) {
            Intent intent2 = new Intent(f46505a);
            intent2.putExtra(CustomTabMainActivity.f46512d, getIntent().getDataString());
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent2);
            this.f46507c = new BroadcastReceiver() {
                /* class com.facebook.CustomTabActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(28382);
                }

                public final void onReceive(Context context, Intent intent) {
                    CustomTabActivity.this.finish();
                }
            };
            LocalBroadcastManager.getInstance(this).registerReceiver(this.f46507c, new IntentFilter(f46506b));
        }
    }
}
