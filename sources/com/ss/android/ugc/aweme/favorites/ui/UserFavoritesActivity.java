package com.ss.android.ugc.aweme.favorites.ui;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.base.f;
import com.zhiliaoapp.musically.R;
import dagger.a;

public class UserFavoritesActivity extends h implements f {

    /* renamed from: a  reason: collision with root package name */
    protected a<Fragment> f90742a;

    static {
        Covode.recordClassIndex(56984);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        Fragment a2 = getSupportFragmentManager().a("user_favorites_fragment_tag");
        if (!(a2 instanceof y) || ((y) a2).n != 0) {
            return "";
        }
        return "collection_video";
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.favorites.ui.h, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65561g = R.color.f159928l;
        xVar.f65555a = true;
        activityConfiguration(new s(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.zn);
        n a2 = getSupportFragmentManager().a();
        a2.b(R.id.ad7, this.f90742a.get(), "user_favorites_fragment_tag");
        a2.b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity", "onCreate", false);
    }
}
