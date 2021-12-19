package com.ss.android.ugc.aweme.account.agegate.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.agegate.b.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public final class ExportVideoActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    private HashMap f62611a;

    static {
        Covode.recordClassIndex(38535);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f62611a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f62611a == null) {
            this.f62611a = new HashMap();
        }
        View view = (View) this.f62611a.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62611a.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        i supportFragmentManager = getSupportFragmentManager();
        l.b(supportFragmentManager, "");
        List<Fragment> f2 = supportFragmentManager.f();
        l.b(f2, "");
        if (!b.a((Collection) f2)) {
            i supportFragmentManager2 = getSupportFragmentManager();
            l.b(supportFragmentManager2, "");
            if (supportFragmentManager2.f().get(f2.size() - 1) instanceof com.ss.android.ugc.aweme.account.login.c.a) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ff);
        n a2 = getSupportFragmentManager().a();
        l.b(a2, "");
        f fVar = new f();
        fVar.setArguments(a(getIntent()));
        a2.a(R.id.b94, fVar);
        a2.b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.ExportVideoActivity", "onCreate", false);
    }
}
