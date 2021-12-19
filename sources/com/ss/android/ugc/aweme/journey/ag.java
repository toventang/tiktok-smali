package com.ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.logger.a;

public class ag extends Activity {
    static {
        Covode.recordClassIndex(67232);
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
        a.b.f109011a.b("cold_boot_application_to_stubmain", false);
        a.b.f109011a.a("cold_boot_stubmain_oncreate_duration", false);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            intent.setFlags(268435456);
        } else {
            intent = new Intent();
        }
        intent.putExtra("redirect_from_main", true);
        intent.setClassName(this, NewUserJourneyActivity.class.getName());
        com.ss.android.ugc.tiktok.security.a.a.a(intent, this);
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
        a.b.f109011a.b("cold_boot_stubmain_oncreate_duration", false);
        a.b.f109011a.a("cold_boot_stubmain_to_new_user_jrouney", false);
    }
}
