package com.ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.services.MainServiceImpl;

public class AppLinkHandler extends DeepLinkHandlerActivity {
    static {
        Covode.recordClassIndex(49305);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity
    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandler", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandler", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.AppLinkHandler", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, androidx.appcompat.app.d
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

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        if (android.text.TextUtils.isEmpty(r9.getQueryParameter("_t")) == false) goto L_0x00be;
     */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
        // Method dump skipped, instructions count: 430
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.deeplink.AppLinkHandler.onCreate(android.os.Bundle):void");
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.deeplink.DeepLinkHandlerActivity
    public final Intent a(Uri uri, boolean z, boolean z2) {
        if (uri == null || !TextUtils.equals("shortlink", uri.getHost())) {
            return super.a(uri, z, z2);
        }
        if (a()) {
            return null;
        }
        return MainServiceImpl.createIMainServicebyMonsterPlugin(false).getMainActivityIntent(this);
    }
}
