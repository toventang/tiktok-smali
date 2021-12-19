package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.a.e.g;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.ss.android.ugc.aweme.account.f.a;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.s;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.a.r;
import com.ss.android.ugc.aweme.account.login.v2.ui.l;
import com.ss.android.ugc.aweme.account.login.w;
import com.ss.android.ugc.aweme.account.login.x;
import com.ss.android.ugc.aweme.bf;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.ug.i;
import h.f.b.m;
import h.z;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class SignUpOrLoginActivity extends com.ss.android.ugc.aweme.account.login.v2.base.b implements a.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f64774c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AgeGateResponse f64775a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f64776b;

    /* renamed from: d  reason: collision with root package name */
    private k f64777d = k.PHONE_EMAIL_LOGIN;

    /* renamed from: e  reason: collision with root package name */
    private k f64778e = k.NONE;

    /* renamed from: f  reason: collision with root package name */
    private boolean f64779f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap f64780g;

    static {
        Covode.recordClassIndex(39810);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f64780g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f64780g == null) {
            this.f64780g = new HashMap();
        }
        View view = (View) this.f64780g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f64780g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39811);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        com.ss.android.ugc.aweme.account.f.a.b(this);
        w.f65123a.erase("use_current_user_info");
        super.onDestroy();
        com.bytedance.sdk.a.e.d.a().b();
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

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        Bundle a2;
        l.a g2;
        super.finish();
        com.ss.android.ugc.aweme.account.agegate.b.f62627b = false;
        int i2 = o.f65098a[this.f64777d.ordinal()];
        if (i2 == 1) {
            cj.a(15, 1, (Object) "");
        } else if (i2 != 2 && i2 != 3) {
        } else {
            if (this.f64778e == k.NONE) {
                if (this.f64779f) {
                    com.ss.android.ugc.aweme.account.f.a.a(11);
                }
            } else if ((this.f64778e == k.INPUT_PHONE_LOGIN || this.f64778e == k.INPUT_EMAIL_LOGIN) && (a2 = a(getIntent())) != null && !a2.getBoolean("has_callBack", true)) {
                com.ss.android.ugc.aweme.account.login.v2.base.c d2 = d();
                if (!(d2 instanceof r)) {
                    d2 = null;
                }
                r rVar = (r) d2;
                if (rVar != null) {
                    if (rVar.f64941b == 0) {
                        g2 = rVar.e();
                    } else {
                        g2 = rVar.g();
                    }
                    Fragment fragment = g2.f65083a;
                    Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.NeedCancelThisLoginMethod");
                    if (((x) fragment).a() && !cj.d()) {
                        cj.g().retryLogin();
                        return;
                    }
                }
                cj.a(7, 4, "");
                if (!this.f64779f) {
                    cj.a(1, 2, (Object) "");
                }
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

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f64781a = new c();

        static {
            Covode.recordClassIndex(39813);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f64782a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onRestoreInstanceState(Bundle bundle) {
        h.f.b.l.d(bundle, "");
        super.onRestoreInstanceState(bundle);
        Serializable serializable = bundle.getSerializable("age_gate_response");
        if (!(serializable instanceof AgeGateResponse)) {
            serializable = null;
        }
        this.f64775a = (AgeGateResponse) serializable;
    }

    static final class b extends m implements h.f.a.b<i<Bundle>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.account.login.v2.base.c $fragment;
        final /* synthetic */ SignUpOrLoginActivity this$0;

        static {
            Covode.recordClassIndex(39812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SignUpOrLoginActivity signUpOrLoginActivity, com.ss.android.ugc.aweme.account.login.v2.base.c cVar) {
            super(1);
            this.this$0 = signUpOrLoginActivity;
            this.$fragment = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i<Bundle> iVar) {
            h.f.b.l.d(iVar, "");
            com.ss.android.ugc.aweme.account.login.v2.base.c cVar = this.$fragment;
            if (cVar != null) {
                cVar.b_(0);
            }
            this.this$0.finish();
            if (cj.d()) {
                cj.a(1, 1, (Object) "");
            }
            com.ss.android.ugc.aweme.account.f.a.a(11);
            cj.a(cj.f());
            if (h.f.b.l.a((Object) "find_account", (Object) this.this$0.e())) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.c());
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.f.a.b
    public final void a(int i2) {
        if (i2 == 9) {
            finish();
        } else if (i2 == 14) {
            String e2 = e();
            String f2 = f();
            h.f.b.l.d(e2, "");
            h.f.b.l.d(f2, "");
            long a2 = i.a.a();
            com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", f2).a("enter_from", e2);
            if (a2 != -1) {
                a3.a("stay_time", a2);
            }
            com.ss.android.ugc.aweme.common.r.a("success_guestmode", a3.f66730a);
            finish();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void b(Bundle bundle) {
        this.f64779f = true;
        com.ss.android.ugc.aweme.account.login.v2.base.c d2 = d();
        if (bundle == null) {
            bundle = new Bundle();
        }
        AgeGateResponse ageGateResponse = this.f64775a;
        if (ageGateResponse != null) {
            bundle.putSerializable("age_gate_response", ageGateResponse);
        }
        if (!TextUtils.isEmpty(s.f63679b)) {
            bundle.putString("enter_from", s.f63679b);
        }
        if (!TextUtils.isEmpty(s.f63678a)) {
            bundle.putString("enter_method", s.f63678a);
        }
        if (cj.a()) {
            bundle.putBoolean("only_login", true);
        }
        Integer num = this.f64776b;
        if (num != null) {
            bundle.putInt("kr_marketing_notification_operation", num.intValue());
        }
        if (d2 != null) {
            d2.b_(1);
        }
        com.ss.android.ugc.aweme.account.d.a(bundle, this, new b(this, d2));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void a(Bundle bundle) {
        boolean z;
        Bundle bundle2 = new Bundle(bundle);
        k a2 = k.a.a(bundle2.getInt("next_page", k.PHONE_EMAIL_SIGN_UP.getValue()));
        int i2 = o.f65099b[a2.ordinal()];
        if (i2 == 1) {
            if (bundle2.getInt("result_code", -99988) != -99988) {
                setResult(bundle2.getInt("result_code", -99988));
            }
            finish();
        } else if (i2 != 2) {
            int i3 = bundle2.getInt("current_page", -1);
            bundle2.putInt("previous_page", i3);
            boolean z2 = false;
            if (a2 == k.PHONE_EMAIL_SIGN_UP && i3 == -1 && !GuestModeServiceImpl.d().c()) {
                z = true;
            } else {
                z = false;
            }
            if (bundle2.getBoolean("is_multi_account", false) && w.a.a()) {
                z2 = true;
            }
            Object a3 = com.ss.android.ugc.aweme.a.a(bf.class);
            h.f.b.l.b(a3, "");
            int d2 = ((bf) a3).d();
            if (z && !z2 && d2 != 0) {
                a2 = k.AGE_GATE_SIGN_UP;
                Keva.getRepo("compliance_setting").storeBoolean("need_to_show_ftc_age_gate_but_no_showed", true);
            } else if (com.ss.android.ugc.aweme.account.login.g.c.a() && a2 == k.PHONE_EMAIL_SIGN_UP && i3 == -1) {
                a2 = k.TERMS_CONSENT_SIGN_UP;
            }
            bundle2.putInt("current_page", a2.getValue());
            bundle2.remove("next_page");
            if (a2 == k.THIRD_PARTY_AGE_GATE) {
                bundle2.putString("platform", a(getIntent(), "platform"));
            }
            bundle2.putInt("age_gate_register_action", d2);
            bundle2.putBoolean("is_multi_account_same_user", z2);
            com.ss.android.ugc.aweme.account.login.v2.base.b.a(this, i.a(a2), bundle2);
        } else {
            SmartRouter.buildRoute(this, "//account/ftc").withParam("next_page", k.FTC_CREATE_ACCOUNT.getValue()).withParam("age_gate_data", this.f64775a).withParam(bundle2).open();
            finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", true);
        activityConfiguration(c.f64781a);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.account.f.a.a(this);
        this.f64777d = k.a.a(getIntent().getIntExtra("next_page", k.PHONE_EMAIL_LOGIN.getValue()));
        this.f64778e = k.a.a(getIntent().getIntExtra("child_page", k.NONE.getValue()));
        if (bundle == null) {
            androidx.lifecycle.r<Bundle> rVar = ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64698a;
            Bundle a2 = a(getIntent());
            if (a2 == null) {
                a2 = new Bundle();
            }
            a2.putString("enter_from", e());
            a2.putString("enter_method", f());
            a2.putString("enter_type", g());
            a2.putInt("next_page", this.f64777d.getValue());
            rVar.postValue(a2);
        }
        com.bytedance.sdk.a.e.d.a().a(d.f64783a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity", "onCreate", false);
    }

    static final class d implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f64783a = new d();

        static {
            Covode.recordClassIndex(39815);
        }

        d() {
        }

        @Override // com.bytedance.sdk.a.e.g.a
        public final void a(String str, Bundle bundle) {
            com.ss.android.ugc.aweme.common.r.a(str, bundle);
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        h.f.b.l.d(bundle, "");
        h.f.b.l.d(persistableBundle, "");
        super.onSaveInstanceState(bundle, persistableBundle);
        AgeGateResponse ageGateResponse = this.f64775a;
        if (ageGateResponse != null) {
            bundle.putSerializable("age_gate_response", ageGateResponse);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.bytedance.sdk.a.e.d.a().a(i2, i3, intent);
    }
}
