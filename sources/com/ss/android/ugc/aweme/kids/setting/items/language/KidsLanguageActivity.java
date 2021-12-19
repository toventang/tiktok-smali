package com.ss.android.ugc.aweme.kids.setting.items.language;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.kids.setting.items.language.viewmodel.AppLanguageViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class KidsLanguageActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f107029b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public AppLanguageViewModel f107030a;

    /* renamed from: c  reason: collision with root package name */
    private a f107031c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f107032d;

    static {
        Covode.recordClassIndex(68459);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f107032d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f107032d == null) {
            this.f107032d = new HashMap();
        }
        View view = (View) this.f107032d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f107032d.put(Integer.valueOf(i2), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68460);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
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

    static final class b extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f107033a = new b();

        static {
            Covode.recordClassIndex(68461);
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
            baseActivityViewModel2.config(AnonymousClass1.f107034a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onCreate", true);
        activityConfiguration(b.f107033a);
        super.onCreate(bundle);
        setContentView(R.layout.ac4);
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dqo);
        if (relativeLayout != null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.dqo);
            l.b(relativeLayout2, "");
            relativeLayout.setBackgroundColor(androidx.core.content.b.c(relativeLayout2.getContext(), R.color.f159928l));
        }
        i supportFragmentManager = getSupportFragmentManager();
        l.b(supportFragmentManager, "");
        a aVar = (a) supportFragmentManager.a("language_app_fragment");
        this.f107031c = aVar;
        if (aVar == null) {
            this.f107031c = new a();
            n a2 = supportFragmentManager.a();
            l.b(a2, "");
            a aVar2 = this.f107031c;
            if (aVar2 == null) {
                l.b();
            }
            a2.b(R.id.b94, aVar2, "language_app_fragment");
            a2.a((String) null);
            a2.c();
        }
        this.f107030a = (AppLanguageViewModel) ae.a(this, (ad.b) null).a(AppLanguageViewModel.class);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onCreate", false);
    }
}
