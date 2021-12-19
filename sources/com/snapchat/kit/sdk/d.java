package com.snapchat.kit.sdk;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.snapchat.kit.sdk.core.controller.a;

public class d extends Activity {

    /* renamed from: a  reason: collision with root package name */
    m f57317a;

    static {
        Covode.recordClassIndex(35840);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        SnapKitComponent a2 = c.a(this);
        if (a2 == null) {
            finish();
            return;
        }
        a2.inject(this);
        Uri data = intent.getData();
        if (data != null) {
            if (data.toString().startsWith(this.f57317a.f57345c)) {
                m mVar = this.f57317a;
                mVar.a(mVar.f57354l, data.getQueryParameter("code"), data.getQueryParameter("state"));
                finish();
            }
        }
        m mVar2 = this.f57317a;
        if (mVar2.o) {
            mVar2.a(a.INVALID_OAUTH_RESPONSE);
        } else {
            mVar2.b();
        }
        finish();
    }
}
