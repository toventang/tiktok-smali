package net.openid.appauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;

public class RedirectUriReceiverActivity extends Activity {
    static {
        Covode.recordClassIndex(106057);
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

    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        Intent a2 = AuthorizationManagementActivity.a(this);
        a2.setData(data);
        a2.addFlags(603979776);
        com.ss.android.ugc.tiktok.security.a.a.a(a2, this);
        startActivity(a2);
        finish();
    }
}
