package com.ss.android.ugc.aweme.friends.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.f.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.g;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class FacebookAuthorizeActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f97070a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f97071b = "";

    /* renamed from: c  reason: collision with root package name */
    private f.a.b.b f97072c;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f97073d;

    static {
        Covode.recordClassIndex(61694);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f97073d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f97073d == null) {
            this.f97073d = new SparseArray();
        }
        View view = (View) this.f97073d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f97073d.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61695);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        f.a.b.b bVar = this.f97072c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        if (isTaskRoot()) {
            t.a(t.a(), this, "aweme://main");
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

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {
        final /* synthetic */ x $config;

        static {
            Covode.recordClassIndex(61697);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(x xVar) {
            super(1);
            this.$config = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new h.f.a.a<com.bytedance.ies.foundation.base.a>(this) {
                /* class com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(61698);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                    return this.this$0.$config;
                }
            });
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        r.a("authorize_facebook_response", new d().a("enter_from", this.f97071b).a("is_allow", i2).f66730a);
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FacebookAuthorizeActivity f97074a;

        static {
            Covode.recordClassIndex(61696);
        }

        b(FacebookAuthorizeActivity facebookAuthorizeActivity) {
            this.f97074a = facebookAuthorizeActivity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141689a == g.AUTHORIZED) {
                this.f97074a.a(1);
            }
            if (dVar.f141689a == g.REQUEST_ACTUAL_PERMISSION && !dVar.f141690b.f141691a) {
                this.f97074a.a(0);
                this.f97074a.finish();
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onCreate", true);
        x xVar = new x(0, false, false, 7);
        xVar.f65555a = false;
        xVar.f65562h = false;
        xVar.f65561g = R.color.us;
        activityConfiguration(new c(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.a1z);
        if (getIntent().hasExtra("enter_from")) {
            String a2 = a(getIntent(), "enter_from");
            if (a2 == null) {
                a2 = "";
            }
            this.f97071b = a2;
        }
        Class<? extends com.ss.android.ugc.aweme.ufr.a> f2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.f();
        String str = this.f97071b;
        User c2 = ai.c();
        l.b(c2, "");
        this.f97072c = com.ss.android.ugc.aweme.ufr.b.a(this, f2, c2.getUid(), str, "auto", true, true, null).d(new b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        a.C0732a.f33434a.a(b.a.FRIENDSLIST_PERMISSION);
        if (i2 == 101) {
            finish();
        }
    }
}
