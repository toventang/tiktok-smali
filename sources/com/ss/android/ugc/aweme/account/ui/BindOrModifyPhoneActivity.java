package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.r;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.j;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;

public final class BindOrModifyPhoneActivity extends com.ss.android.ugc.aweme.account.login.v2.base.b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f65338d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f65339a;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f65340b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f65341c;

    /* renamed from: e  reason: collision with root package name */
    private k f65342e = k.INPUT_PHONE_BIND;

    /* renamed from: f  reason: collision with root package name */
    private final h f65343f = i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private HashMap f65344g;

    static {
        Covode.recordClassIndex(40173);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f65344g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f65344g == null) {
            this.f65344g = new HashMap();
        }
        View view = (View) this.f65344g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f65344g.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final Bundle c() {
        return (Bundle) this.f65343f.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40174);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Bundle> {
        final /* synthetic */ BindOrModifyPhoneActivity this$0;

        static {
            Covode.recordClassIndex(40177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BindOrModifyPhoneActivity bindOrModifyPhoneActivity) {
            super(0);
            this.this$0 = bindOrModifyPhoneActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundle;
            if (a(this.this$0.getIntent()) != null) {
                bundle = new Bundle(a(this.this$0.getIntent()));
            } else {
                bundle = new Bundle();
            }
            bundle.remove("next_page");
            bundle.remove("current_scene");
            return bundle;
        }

        private static Bundle a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        if (this.f65339a) {
            Integer num = this.f65341c;
            if (num == null) {
                l.b();
            }
            cj.a(num.intValue(), 1, this.f65340b);
            return;
        }
        ((IPushLaunchPageAssistantService) com.ss.android.ugc.aweme.a.a(IPushLaunchPageAssistantService.class)).a(this);
        User f2 = cj.f();
        if (f2 != null && !f2.isPhoneBinded()) {
            cj.a(7, 2, (Object) null);
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

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65345a = new b();

        static {
            Covode.recordClassIndex(40175);
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
            baseActivityViewModel2.config(AnonymousClass1.f65346a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        k a2 = k.a.a(bundle2.getInt("next_page", k.INPUT_PHONE_BIND.getValue()));
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", a2.getValue());
        bundle2.remove("next_page");
        com.ss.android.ugc.aweme.account.login.v2.base.b.a(this, com.ss.android.ugc.aweme.account.login.v2.ui.i.a(a2), bundle2);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void b(Bundle bundle) {
        if (c().getBoolean("show_success_toast", true)) {
            Context applicationContext = getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(getString(R.string.fml)).a();
        }
        finish();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", true);
        activityConfiguration(b.f65345a);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this, R.color.f159928l)));
        this.f65342e = k.a.a(getIntent().getIntExtra("next_page", k.INPUT_PHONE_BIND.getValue()));
        if (getIntent().getIntExtra("current_scene", j.NONE.getValue()) == j.NONE.getValue()) {
            getIntent().putExtra("current_scene", j.BIND_PHONE.getValue());
            getIntent().putExtra("enter_method", "first_bind_phone_click");
        }
        if (bundle == null) {
            r<Bundle> rVar = ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64698a;
            Bundle a2 = a(getIntent());
            if (a2 == null) {
                a2 = new Bundle();
            }
            a2.putString("enter_from", a(getIntent(), "ENTER_REASON"));
            a2.putString("enter_method", a(getIntent(), "enter_method"));
            a2.putString("enter_type", g());
            a2.putInt("next_page", this.f65342e.getValue());
            rVar.postValue(a2);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
