package com.ss.android.ugc.aweme.login.ui;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

public final class LogoutDialogActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109032a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f109033b;

    static {
        Covode.recordClassIndex(69822);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f109033b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f109033b == null) {
            this.f109033b = new SparseArray();
        }
        View view = (View) this.f109033b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f109033b.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69823);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.aj_);
        a.C0731a aVar = new a.C0731a(this);
        aVar.f33401a = getString(R.string.czg);
        aVar.f33402b = getString(R.string.czf);
        aVar.a(getString(R.string.b75), (DialogInterface.OnClickListener) new b(this), false).a().b().setCancelable(false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity", "onCreate", false);
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LogoutDialogActivity f109034a;

        static {
            Covode.recordClassIndex(69824);
        }

        b(LogoutDialogActivity logoutDialogActivity) {
            this.f109034a = logoutDialogActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.ss.android.ugc.aweme.account.b.b().logout("expired_logout", "sdk_expired_logout", AnonymousClass1.f109035a);
            dialogInterface.dismiss();
            this.f109034a.finish();
            this.f109034a.overridePendingTransition(0, 0);
        }
    }
}
