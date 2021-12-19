package com.ss.android.ugc.aweme.profile.ui;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.profile.ui.bk;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public final class ProfileEditBioUrlActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116791a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f116792b = RouteArgExtension.INSTANCE.optionalArg(this, b.f116794a, "bio_url", String.class);

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f116793c;

    static {
        Covode.recordClassIndex(75432);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f116793c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f116793c == null) {
            this.f116793c = new SparseArray();
        }
        View view = (View) this.f116793c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f116793c.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75433);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
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

    static final class b extends m implements h.f.a.b<Boolean, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f116794a = new b();

        static {
            Covode.recordClassIndex(75434);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f116795a = new c();

        static {
            Covode.recordClassIndex(75435);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f116796a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onCreate", true);
        activityConfiguration(c.f116795a);
        super.onCreate(bundle);
        setContentView(R.layout.mc);
        String str = (String) this.f116792b.getValue();
        if (str == null) {
            str = "";
        }
        bk a2 = bk.a.a(str, "");
        a2.setUserVisibleHint(true);
        i supportFragmentManager = getSupportFragmentManager();
        l.b(supportFragmentManager, "");
        a2.show(supportFragmentManager, "EditBioUrl");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileEditBioUrlActivity", "onCreate", false);
    }
}
