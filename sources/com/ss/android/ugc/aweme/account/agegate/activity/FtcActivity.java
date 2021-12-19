package com.ss.android.ugc.aweme.account.agegate.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.r;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.login.s;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.io.Serializable;
import java.util.HashMap;

public final class FtcActivity extends com.ss.android.ugc.aweme.account.login.v2.base.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f62612a = RouteArgExtension.INSTANCE.optionalArgNotNull(this, b.f62615a, "next_page", Integer.class);

    /* renamed from: b  reason: collision with root package name */
    private final h f62613b = i.a((h.f.a.a) new a(this));

    /* renamed from: c  reason: collision with root package name */
    private HashMap f62614c;

    static {
        Covode.recordClassIndex(38536);
    }

    private final int c() {
        return ((Number) this.f62612a.getValue()).intValue();
    }

    private final Serializable h() {
        return (Serializable) this.f62613b.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f62614c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f62614c == null) {
            this.f62614c = new HashMap();
        }
        View view = (View) this.f62614c.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f62614c.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class a extends m implements h.f.a.a<Serializable> {
        final /* synthetic */ FtcActivity this$0;

        static {
            Covode.recordClassIndex(38537);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FtcActivity ftcActivity) {
            super(0);
            this.this$0 = ftcActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Serializable invoke() {
            Bundle a2 = a(this.this$0.getIntent());
            if (a2 != null) {
                return a2.getSerializable("age_gate_data");
            }
            return null;
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class b extends m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f62615a = new b();

        static {
            Covode.recordClassIndex(38538);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return Integer.valueOf(k.NONE.getValue());
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f62616a = new c();

        static {
            Covode.recordClassIndex(38539);
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
            baseActivityViewModel2.config(AnonymousClass1.f62617a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i2 = bundle.getInt("current_page", -1);
        k a2 = k.a.a(bundle.getInt("next_page", k.FTC_CREATE_ACCOUNT.getValue()));
        if (a2 == k.DELETE_VIDEO_ALERT) {
            SmartRouter.buildRoute(this, "//account/video/deleted/alert").withParam("age_gate_response", new AgeGateResponse(0, "", false, 0, 1, null, 32, null)).withParam("enter_from", "from_create_account_password").open();
            finish();
            return;
        }
        bundle.putInt("previous_page", i2);
        bundle.putInt("current_page", a2.getValue());
        bundle.remove("next_page");
        com.ss.android.ugc.aweme.account.login.v2.base.b.a(this, com.ss.android.ugc.aweme.account.login.v2.ui.i.a(a2), bundle);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (h() != null) {
            bundle.putSerializable("age_gate_response", h());
        }
        if (!TextUtils.isEmpty(s.f63679b)) {
            bundle.putString("enter_from", s.f63679b);
        }
        if (cj.a()) {
            bundle.putBoolean("only_login", true);
        }
        bundle.putString("platform", "account");
        SmartRouter.buildRoute(this, "//account/ftc/complete").withParam(bundle).open();
        Activity[] activityStack = ActivityStack.getActivityStack();
        l.b(activityStack, "");
        for (Activity activity : h.a.i.g(activityStack)) {
            l.b(activity, "");
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", true);
        activityConfiguration(c.f62616a);
        super.onCreate(bundle);
        if (bundle == null) {
            if (c() != k.NONE.getValue()) {
                r<Bundle> rVar = ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64698a;
                Bundle a2 = a(getIntent());
                if (a2 == null) {
                    a2 = new Bundle();
                }
                a2.putInt("next_page", c());
                rVar.postValue(a2);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Cannot start AgeGateActivityV2 with Step.NONE");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", false);
                throw illegalArgumentException;
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.agegate.activity.FtcActivity", "onCreate", false);
    }
}
