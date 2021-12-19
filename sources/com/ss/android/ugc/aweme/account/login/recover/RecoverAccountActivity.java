package com.ss.android.ugc.aweme.account.login.recover;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.a.e.g;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.f.a;
import com.ss.android.ugc.aweme.account.login.s;
import com.ss.android.ugc.aweme.account.login.v2.base.ActionResultModel;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.util.t;
import com.ss.android.ugc.aweme.al.e;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Set;

public final class RecoverAccountActivity extends com.ss.android.ugc.aweme.account.login.v2.base.b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63536a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private k f63537b = k.PHONE_EMAIL_USERNAME_RECOVER;

    /* renamed from: c  reason: collision with root package name */
    private boolean f63538c;

    /* renamed from: d  reason: collision with root package name */
    private String f63539d = "";

    /* renamed from: e  reason: collision with root package name */
    private HashMap f63540e;

    static {
        Covode.recordClassIndex(39167);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f63540e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f63540e == null) {
            this.f63540e = new HashMap();
        }
        View view = (View) this.f63540e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f63540e.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39168);
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

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f63541a = new c();

        static {
            Covode.recordClassIndex(39170);
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
            baseActivityViewModel2.config(AnonymousClass1.f63542a);
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<i<Bundle>, z> {
        final /* synthetic */ RecoverAccountActivity this$0;

        static {
            Covode.recordClassIndex(39169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(RecoverAccountActivity recoverAccountActivity) {
            super(1);
            this.this$0 = recoverAccountActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i<Bundle> iVar) {
            l.d(iVar, "");
            this.this$0.finish();
            if (cj.d()) {
                cj.a(1, 1, (Object) "");
            }
            com.ss.android.ugc.aweme.account.f.a.a(11);
            com.ss.android.ugc.aweme.account.f.a.a(9);
            cj.a(cj.f());
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.al.c());
            com.ss.android.ugc.d.a.c.a(new e());
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.f.a.b
    public final void a(int i2) {
        if (i2 == 12) {
            SmartRouter.buildRoute(this, "aweme://main?tab=1").withParam("tab", 1).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME").addFlags(67108864).open();
        } else if (i2 == 13) {
            finish();
            com.ss.android.ugc.aweme.account.f.a.a(11);
            com.ss.android.ugc.aweme.account.f.a.a(9);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void b(Bundle bundle) {
        this.f63538c = true;
        if (bundle == null) {
            bundle = new Bundle();
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
        com.ss.android.ugc.aweme.account.d.a(bundle, this, new b(this));
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.b
    public final void a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        k a2 = k.a.a(bundle2.getInt("next_page", k.RECOVER_VERIFY_EMAIL_PHONE_THIRD_PARTY.getValue()));
        if (d.f63598a[a2.ordinal()] != 1) {
            bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
            bundle2.putInt("current_page", a2.getValue());
            com.ss.android.ugc.aweme.account.login.v2.base.b.a(this, com.ss.android.ugc.aweme.account.login.v2.ui.i.a(a2), bundle2);
            return;
        }
        if (bundle2.getInt("result_code", -99988) != -99988) {
            setResult(bundle2.getInt("result_code", -99988));
        }
        finish();
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Bundle a2;
        Bundle a3;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", true);
        activityConfiguration(c.f63541a);
        super.onCreate(bundle);
        String str = t.a().f65505d;
        if (str == null) {
            str = "sslocal://webview?url=https%3A%2F%2Fwww.tiktok.com%2Fucenter_web%2Faccount_recover%3Fappend_common_params%3D1%26hide_nav_bar%3D1%26container_color_auto_dark%3D1";
        }
        if (!TextUtils.isEmpty(str)) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this, str + URLDecoder.decode("&enter_from=" + e(), "UTF-8"));
            Bundle a4 = a(getIntent());
            if (a4 == null) {
                a4 = new Bundle();
            }
            buildRoute.withParam(a4).withAnimation(R.anim.dq, R.anim.a1).open();
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", false);
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this, R.color.f159928l)));
        com.ss.android.ugc.aweme.account.f.a.a(this);
        r.a("find_account_page_show", new com.ss.android.ugc.aweme.account.a.b.a().a("aid", 1233).f62575a);
        Intent intent = getIntent();
        Set<String> keySet = (intent == null || (a3 = a(intent)) == null) ? null : a3.keySet();
        Uri.Builder builder = new Uri.Builder();
        if (keySet != null) {
            for (String str2 : keySet) {
                Intent intent2 = getIntent();
                builder.appendQueryParameter(str2, (intent2 == null || (a2 = a(intent2)) == null) ? null : a2.getString(str2));
            }
        }
        String builder2 = builder.toString();
        l.b(builder2, "");
        this.f63539d = builder2;
        if (bundle == null) {
            androidx.lifecycle.r<Bundle> rVar = ((ActionResultModel) ae.a(this, (ad.b) null).a(ActionResultModel.class)).f64698a;
            Bundle a5 = a(getIntent());
            if (a5 == null) {
                a5 = new Bundle();
            }
            a5.putString("enter_from", "find_account");
            a5.putString("enter_method", "find_account");
            a5.putString("enter_type", g());
            a5.putString("feedback_param", this.f63539d);
            a5.putInt("next_page", this.f63537b.getValue());
            rVar.postValue(a5);
        }
        com.bytedance.sdk.a.e.d.a().a(d.f63543a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.recover.RecoverAccountActivity", "onCreate", false);
    }

    static final class d implements g.a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f63543a = new d();

        static {
            Covode.recordClassIndex(39172);
        }

        d() {
        }

        @Override // com.bytedance.sdk.a.e.g.a
        public final void a(String str, Bundle bundle) {
            r.a(str, bundle);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.account.login.v2.base.b, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.bytedance.sdk.a.e.d.a().a(i2, i3, intent);
    }
}
