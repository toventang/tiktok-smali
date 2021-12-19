package com.ss.android.ugc.aweme.setting.ui;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class SettingAdsActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122783a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f122784b;

    static {
        Covode.recordClassIndex(80594);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f122784b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f122784b == null) {
            this.f122784b = new SparseArray();
        }
        View view = (View) this.f122784b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f122784b.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80595);
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

    public static final class b implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingAdsActivity f122785a;

        static {
            Covode.recordClassIndex(80596);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
            l.d(view, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(SettingAdsActivity settingAdsActivity) {
            this.f122785a = settingAdsActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            l.d(view, "");
            this.f122785a.finish();
        }
    }

    static final class e extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f122788a = new e();

        static {
            Covode.recordClassIndex(80599);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f122789a);
            return z.f158842a;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingAdsActivity f122786a;

        static {
            Covode.recordClassIndex(80597);
        }

        c(SettingAdsActivity settingAdsActivity) {
            this.f122786a = settingAdsActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("refer", "settings_ads");
            User c2 = in.c();
            if (c2 != null) {
                str = c2.getUid();
            } else {
                str = null;
            }
            r.a("click_settings_ads_specialist", a2.a("user_id", str).f66730a);
            SmartRouter.buildRoute(this.f122786a, com.ss.android.ugc.aweme.setting.utils.e.a()).open();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingAdsActivity f122787a;

        static {
            Covode.recordClassIndex(80598);
        }

        d(SettingAdsActivity settingAdsActivity) {
            this.f122787a = settingAdsActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            User c2 = in.c();
            if (c2 != null) {
                str = c2.getUid();
            } else {
                str = null;
            }
            r.a("click_settings_ads_engage", dVar.a("user_id", str).f66730a);
            SmartRouter.buildRoute(this.f122787a, com.ss.android.ugc.aweme.setting.utils.a.a()).open();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        int i2;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onCreate", true);
        activityConfiguration(e.f122788a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.az_);
        User c2 = in.c();
        if (c2 != null) {
            CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.dy);
            l.b(commonItemView, "");
            CommerceUserInfo commerceUserInfo = c2.getCommerceUserInfo();
            int i3 = 8;
            if (commerceUserInfo == null || !commerceUserInfo.isHasAdExperienceEntry()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            commonItemView.setVisibility(i2);
            CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.h0);
            l.b(commonItemView2, "");
            CommerceUserInfo commerceUserInfo2 = c2.getCommerceUserInfo();
            if (commerceUserInfo2 != null && commerceUserInfo2.isHasAdFeedbackEntry()) {
                i3 = 0;
            }
            commonItemView2.setVisibility(i3);
            ((TextTitleBar) _$_findCachedViewById(R.id.em8)).setOnTitleBarClickListener(new b(this));
            ((CommonItemView) _$_findCachedViewById(R.id.dy)).setOnClickListener(new c(this));
            ((CommonItemView) _$_findCachedViewById(R.id.h0)).setOnClickListener(new d(this));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingAdsActivity", "onCreate", false);
    }
}
