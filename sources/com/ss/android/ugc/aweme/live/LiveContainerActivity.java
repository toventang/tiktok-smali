package com.ss.android.ugc.aweme.live;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.android.livesdkapi.service.d;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class LiveContainerActivity extends a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f108046c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f108047a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f108048b = "";

    /* renamed from: d  reason: collision with root package name */
    private final b f108049d = new b(this);

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f108050e;

    static {
        Covode.recordClassIndex(69283);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f108050e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f108050e == null) {
            this.f108050e = new SparseArray();
        }
        View view = (View) this.f108050e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f108050e.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69284);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        getSupportFragmentManager().a(this.f108049d);
        super.onDestroy();
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

    public static final class b extends i.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveContainerActivity f108051a;

        static {
            Covode.recordClassIndex(69285);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(LiveContainerActivity liveContainerActivity) {
            this.f108051a = liveContainerActivity;
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentStopped(i iVar, Fragment fragment) {
            l.d(iVar, "");
            l.d(fragment, "");
            super.onFragmentStopped(iVar, fragment);
            if (l.a((Object) this.f108051a.f108047a, (Object) "subscribe_info_list")) {
                this.f108051a.finish();
            }
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f108052a = new c();

        static {
            Covode.recordClassIndex(69286);
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
            baseActivityViewModel2.config(AnonymousClass1.f108053a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.live.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", true);
        activityConfiguration(c.f108052a);
        super.onCreate(bundle);
        setContentView(R.layout.ajk);
        this.f108047a = a(getIntent(), "fragment_type");
        n a2 = getSupportFragmentManager().a();
        String str = this.f108047a;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 514841930) {
                if (hashCode == 956433626 && str.equals("subscribe_info_list")) {
                    fragment = Live.getService().a(this, "");
                }
            } else if (str.equals("subscribe")) {
                d service = Live.getService();
                l.b(service, "");
                fragment = service.d();
            }
            a2.a(R.id.do6, fragment).c();
            getSupportFragmentManager().a((i.b) this.f108049d, true);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", false);
            return;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveContainerActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
