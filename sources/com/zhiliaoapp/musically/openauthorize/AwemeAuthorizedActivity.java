package com.zhiliaoapp.musically.openauthorize;

import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.openauthorize.c;

public class AwemeAuthorizedActivity extends c {
    static {
        Covode.recordClassIndex(103931);
    }

    public void AwemeAuthorizedActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        a.b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        a.d(this);
        com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.openauthorize.c, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
    }

    public static void com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(AwemeAuthorizedActivity awemeAuthorizedActivity) {
        awemeAuthorizedActivity.AwemeAuthorizedActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                awemeAuthorizedActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(AwemeAuthorizedActivity awemeAuthorizedActivity) {
        com_zhiliaoapp_musically_openauthorize_AwemeAuthorizedActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(awemeAuthorizedActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                awemeAuthorizedActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }
}
