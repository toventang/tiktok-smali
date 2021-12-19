package com.ss.android.ugc.aweme.account.login.twostep;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import b.g;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.account.login.twostep.n;
import com.ss.android.ugc.aweme.account.ui.c;
import com.ss.android.ugc.aweme.utils.ai;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class TwoStepAuthActivity extends com.bytedance.ies.foundation.activity.a implements n.a, com.ss.android.ugc.aweme.account.ui.c {

    /* renamed from: f  reason: collision with root package name */
    public static final boolean f63728f = false;

    /* renamed from: g  reason: collision with root package name */
    public static final a f63729g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public n f63730a;

    /* renamed from: b  reason: collision with root package name */
    public String f63731b;

    /* renamed from: c  reason: collision with root package name */
    public String f63732c;

    /* renamed from: d  reason: collision with root package name */
    public String f63733d;

    /* renamed from: e  reason: collision with root package name */
    public b f63734e;

    /* renamed from: h  reason: collision with root package name */
    private ViewStub f63735h;

    /* renamed from: i  reason: collision with root package name */
    private int f63736i = -1;

    /* renamed from: j  reason: collision with root package name */
    private c.a f63737j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f63738k;

    /* renamed from: l  reason: collision with root package name */
    private HashMap f63739l;

    public interface b {
        static {
            Covode.recordClassIndex(39296);
        }

        void a(int i2, int i3, Intent intent);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f63739l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f63739l == null) {
            this.f63739l = new HashMap();
        }
        View view = (View) this.f63739l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f63739l.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39295);
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
        super.onDestroy();
        this.f63734e = null;
    }

    static {
        Covode.recordClassIndex(39294);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        if (this.f63738k) {
            m.a().a(new com.ss.android.ugc.aweme.account.g.b(null, null, 0, "User left TwoStepAuthActivity before completing auth process"));
        }
        super.finish();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
        c.a aVar = this.f63737j;
        if (aVar == null || !aVar.a()) {
            this.f63738k = true;
            finish();
        }
    }

    static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepAuthActivity f63743a;

        static {
            Covode.recordClassIndex(39300);
        }

        e(TwoStepAuthActivity twoStepAuthActivity) {
            this.f63743a = twoStepAuthActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            JSONObject jSONObject;
            boolean z;
            String str = null;
            try {
                jSONObject = new JSONObject(this.f63743a.f63732c);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                n nVar = this.f63743a.f63730a;
                if (nVar != null) {
                    l.d(jSONObject, "");
                    nVar.f63981h = jSONObject;
                }
                TwoStepAuthActivity twoStepAuthActivity = this.f63743a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 != null) {
                    str = jSONObject2.optString("profile_key");
                }
                twoStepAuthActivity.f63733d = str;
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
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

    public static final class d implements com.bytedance.ies.dmt.ui.titlebar.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepAuthActivity f63742a;

        static {
            Covode.recordClassIndex(39299);
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(TwoStepAuthActivity twoStepAuthActivity) {
            this.f63742a = twoStepAuthActivity;
        }

        @Override // com.bytedance.ies.dmt.ui.titlebar.a.a
        public final void a(View view) {
            this.f63742a.onBackPressed();
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f63740a = new c();

        static {
            Covode.recordClassIndex(39297);
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
            baseActivityViewModel2.config(AnonymousClass1.f63741a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.twostep.n.a
    public final void a(String str) {
        m.a().a(new com.ss.android.ugc.aweme.account.g.b(str, this.f63733d, 0, null));
        finish();
    }

    static final class f<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TwoStepAuthActivity f63744a;

        static {
            Covode.recordClassIndex(39301);
        }

        f(TwoStepAuthActivity twoStepAuthActivity) {
            this.f63744a = twoStepAuthActivity;
        }

        @Override // b.g
        public final Object then(i<Boolean> iVar) {
            if (!ai.a(iVar)) {
                return z.f158842a;
            }
            n nVar = this.f63744a.f63730a;
            if (nVar != null) {
                nVar.f63982i = this.f63744a.f63731b;
            }
            n nVar2 = this.f63744a.f63730a;
            if (nVar2 != null) {
                return nVar2.a();
            }
            return null;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", true);
        activityConfiguration(c.f63740a);
        super.onCreate(bundle);
        setContentView(R.layout.fo);
        ((NormalTitleBar) _$_findCachedViewById(R.id.fab)).setOnTitleBarClickListener(new d(this));
        ((com.bytedance.ies.dmt.ui.titlebar.a) _$_findCachedViewById(R.id.fab)).a(false);
        NormalTitleBar normalTitleBar = (NormalTitleBar) _$_findCachedViewById(R.id.fab);
        l.b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setImageResource(R.drawable.ccf);
        ViewStub viewStub = (ViewStub) findViewById(R.id.faa);
        l.b(viewStub, "");
        this.f63735h = viewStub;
        this.f63736i = getIntent().getIntExtra("auth_type", -1);
        this.f63732c = a(getIntent(), "auth_data");
        this.f63731b = a(getIntent(), "url_path");
        if (this.f63736i == -1) {
            finish();
        } else if (TextUtils.isEmpty(this.f63732c)) {
            finish();
        } else {
            int i2 = this.f63736i;
            if (i2 == 1) {
                ViewStub viewStub2 = this.f63735h;
                if (viewStub2 == null) {
                    l.a("contentStub");
                }
                this.f63730a = new j(this, viewStub2, this);
            } else if (i2 == 2) {
                ViewStub viewStub3 = this.f63735h;
                if (viewStub3 == null) {
                    l.a("contentStub");
                }
                this.f63730a = new h(this, viewStub3, this);
            } else if (i2 == 3) {
                ViewStub viewStub4 = this.f63735h;
                if (viewStub4 == null) {
                    l.a("contentStub");
                }
                this.f63730a = new k(this, viewStub4, this);
            } else if (i2 == 4) {
                ViewStub viewStub5 = this.f63735h;
                if (viewStub5 == null) {
                    l.a("contentStub");
                }
                this.f63730a = new f(this, viewStub5, this);
            } else if (i2 == 5) {
                ViewStub viewStub6 = this.f63735h;
                if (viewStub6 == null) {
                    l.a("contentStub");
                }
                this.f63730a = new d(this, viewStub6, this);
            }
            i.b(new e(this), i.f4824a).a(new f(this), i.f4826c, null);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(androidx.core.content.b.c(this, R.color.f159928l)));
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) _$_findCachedViewById(R.id.fab);
        l.b(normalTitleBar2, "");
        normalTitleBar2.getStartBtn().setImageResource(R.drawable.ccf);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", false);
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
        b bVar = this.f63734e;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
    }
}
