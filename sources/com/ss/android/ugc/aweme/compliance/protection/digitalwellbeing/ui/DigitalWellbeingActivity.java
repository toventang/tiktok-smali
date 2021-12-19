package com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPiaringManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class DigitalWellbeingActivity extends com.bytedance.ies.foundation.activity.a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77970a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private TuxNavBar f77971b;

    /* renamed from: c  reason: collision with root package name */
    private CommonItemView f77972c;

    /* renamed from: d  reason: collision with root package name */
    private CommonItemView f77973d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f77974e;

    static {
        Covode.recordClassIndex(48329);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f77974e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f77974e == null) {
            this.f77974e = new SparseArray();
        }
        View view = (View) this.f77974e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f77974e.put(i2, findViewById);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48330);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ DigitalWellbeingActivity this$0;

        static {
            Covode.recordClassIndex(48331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DigitalWellbeingActivity digitalWellbeingActivity) {
            super(0);
            this.this$0 = digitalWellbeingActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.onBackPressed();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onResume", true);
        super.onResume();
        a();
        b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onResume", false);
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

    private final void a() {
        CommonItemView commonItemView;
        String string;
        String string2;
        if (FamilyPiaringManager.a() != IFamilyPairingService.a.UNLINK_LOCKED) {
            commonItemView = this.f77972c;
            if (commonItemView == null) {
                l.a("mTimeLockSetting");
            }
            if (com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.c()) {
                string = getString(R.string.c_u);
            } else {
                string = getString(R.string.dj5);
            }
        } else if (FamilyPiaringManager.c()) {
            commonItemView = this.f77972c;
            if (commonItemView == null) {
                l.a("mTimeLockSetting");
            }
            string = getString(R.string.brs);
        } else {
            CommonItemView commonItemView2 = this.f77972c;
            if (commonItemView2 == null) {
                l.a("mTimeLockSetting");
            }
            if (com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.c()) {
                string2 = getString(R.string.c_u);
            } else {
                string2 = getString(R.string.dj5);
            }
            commonItemView2.setRightText(string2);
            return;
        }
        commonItemView.setRightText(string);
    }

    private final void b() {
        CommonItemView commonItemView;
        String string;
        String string2;
        if (FamilyPiaringManager.a() != IFamilyPairingService.a.UNLINK_LOCKED) {
            commonItemView = this.f77973d;
            if (commonItemView == null) {
                l.a("mTeenagerModeSetting");
            }
            if (com.ss.android.ugc.aweme.compliance.protection.common.a.b()) {
                string = getString(R.string.c_u);
            } else {
                string = getString(R.string.dj5);
            }
        } else if (FamilyPiaringManager.b()) {
            commonItemView = this.f77973d;
            if (commonItemView == null) {
                l.a("mTeenagerModeSetting");
            }
            string = getString(R.string.brs);
        } else {
            CommonItemView commonItemView2 = this.f77973d;
            if (commonItemView2 == null) {
                l.a("mTeenagerModeSetting");
            }
            if (com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.a.b()) {
                string2 = getString(R.string.c_u);
            } else {
                string2 = getString(R.string.dj5);
            }
            commonItemView2.setRightText(string2);
            return;
        }
        commonItemView.setRightText(string);
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f77975a = new c();

        static {
            Covode.recordClassIndex(48332);
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
            baseActivityViewModel2.config(AnonymousClass1.f77976a);
            baseActivityViewModel2.config(AnonymousClass2.f77977a);
            return z.f158842a;
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickAgent.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == R.id.am_) {
                if (!FamilyPiaringManager.c()) {
                    r.a("enter_time_lock", new d().f66730a);
                    SmartRouter.buildRoute(this, "//settimelock").withParam("SetTimeLockActivityKeyType", 0).withParam("SetTimeLockActivityKeyFromParent", false).open();
                }
            } else if (num.intValue() == R.id.am9 && !FamilyPiaringManager.b()) {
                d a2 = new d().a("enter_from", com.ss.android.ugc.aweme.compliance.protection.timelock.a.f78011a);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                r.a("enter_teen_mode", a2.a("is_login", g2.isLogin() ? 1 : 0).f66730a);
                SmartRouter.buildRoute(this, "//settimelock").withParam("SetTimeLockActivityKeyType", 1).withParam("SetTimeLockActivityKeyFromParent", false).open();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onCreate", true);
        activityConfiguration(c.f77975a);
        super.onCreate(bundle);
        setContentView(R.layout.u0);
        View findViewById = findViewById(R.id.emo);
        l.b(findViewById, "");
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById;
        this.f77971b = tuxNavBar;
        if (tuxNavBar == null) {
            l.a("mTitle");
        }
        g gVar = new g();
        String string = getString(R.string.ghe);
        l.b(string, "");
        tuxNavBar.a(gVar.a(string));
        TuxNavBar tuxNavBar2 = this.f77971b;
        if (tuxNavBar2 == null) {
            l.a("mTitle");
        }
        tuxNavBar2.a((com.bytedance.tux.navigation.a.c) new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr).a((h.f.a.a<z>) new b(this)));
        TuxNavBar tuxNavBar3 = this.f77971b;
        if (tuxNavBar3 == null) {
            l.a("mTitle");
        }
        tuxNavBar3.a(true);
        View findViewById2 = findViewById(R.id.am_);
        l.b(findViewById2, "");
        CommonItemView commonItemView = (CommonItemView) findViewById2;
        this.f77972c = commonItemView;
        if (commonItemView == null) {
            l.a("mTimeLockSetting");
        }
        commonItemView.setLeftText(getString(R.string.b7h));
        CommonItemView commonItemView2 = this.f77972c;
        if (commonItemView2 == null) {
            l.a("mTimeLockSetting");
        }
        commonItemView2.setRightIconRes(0);
        CommonItemView commonItemView3 = this.f77972c;
        if (commonItemView3 == null) {
            l.a("mTimeLockSetting");
        }
        commonItemView3.setOnClickListener(this);
        View findViewById3 = findViewById(R.id.am9);
        l.b(findViewById3, "");
        CommonItemView commonItemView4 = (CommonItemView) findViewById3;
        this.f77973d = commonItemView4;
        if (commonItemView4 == null) {
            l.a("mTeenagerModeSetting");
        }
        commonItemView4.setLeftText(getString(R.string.b7g));
        CommonItemView commonItemView5 = this.f77973d;
        if (commonItemView5 == null) {
            l.a("mTeenagerModeSetting");
        }
        commonItemView5.setRightIconRes(0);
        CommonItemView commonItemView6 = this.f77973d;
        if (commonItemView6 == null) {
            l.a("mTeenagerModeSetting");
        }
        commonItemView6.setOnClickListener(this);
        a();
        b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.ui.DigitalWellbeingActivity", "onCreate", false);
    }
}
