package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.c;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.io.Serializable;
import java.util.HashMap;

public final class LoginActionFlowActivity extends CommonFlowActivity {

    /* renamed from: a  reason: collision with root package name */
    private final h f64769a = i.a((h.f.a.a) new a(this));

    /* renamed from: h  reason: collision with root package name */
    private HashMap f64770h;

    static {
        Covode.recordClassIndex(39804);
    }

    private final g i() {
        return (g) this.f64769a.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f64770h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f64770h == null) {
            this.f64770h = new HashMap();
        }
        View view = (View) this.f64770h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f64770h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class a extends m implements h.f.a.a<g> {
        final /* synthetic */ LoginActionFlowActivity this$0;

        static {
            Covode.recordClassIndex(39805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LoginActionFlowActivity loginActionFlowActivity) {
            super(0);
            this.this$0 = loginActionFlowActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            Serializable serializable;
            Intent intent = this.this$0.getIntent();
            if (intent != null) {
                serializable = intent.getSerializableExtra("LoginActionContext");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof g)) {
                return null;
            }
            return serializable;
        }
    }

    @Override // androidx.fragment.app.e, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        c d2;
        c d3 = d();
        if ((d3 == null || !d3.q()) && (d2 = d()) != null) {
            Bundle arguments = d2.getArguments();
            if (arguments == null) {
                l.b();
            }
            arguments.putInt("next_page", k.FINISH.getValue());
            Bundle arguments2 = d2.getArguments();
            if (arguments2 == null) {
                l.b();
            }
            l.b(arguments2, "");
            d2.a(arguments2);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d
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

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f64771a = new b();

        static {
            Covode.recordClassIndex(39806);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f64772a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onCreate", true);
        activityConfiguration(b.f64771a);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onCreate", false);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b, com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity
    public final void a(Bundle bundle) {
        k kVar;
        if (bundle != null && k.a.a(bundle.getInt("next_page", k.FINISH.getValue())) == k.FINISH) {
            k a2 = k.a.a(bundle.getInt("current_page", -1));
            while (true) {
                l.d(a2, "");
                int i2 = h.f65079a[a2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        g i3 = i();
                        if (i3 != null && i3.getNeedShowPrivateAccountTips()) {
                            kVar = k.PRIVATE_ACCOUNT_TIPS;
                            break;
                        }
                        a2 = k.PRIVATE_ACCOUNT_TIPS;
                    } else {
                        kVar = k.FINISH;
                        break;
                    }
                } else {
                    g i4 = i();
                    if (i4 != null && i4.getNeedSetUserName()) {
                        kVar = k.CREATE_USERNAME;
                        break;
                    }
                    a2 = k.CREATE_USERNAME;
                }
            }
            if (kVar == k.FINISH) {
                b(null);
                return;
            }
            bundle.putInt("next_page", kVar.getValue());
        }
        super.a(bundle);
    }
}
