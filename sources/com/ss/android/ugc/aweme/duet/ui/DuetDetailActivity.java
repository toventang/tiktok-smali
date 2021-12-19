package com.ss.android.ugc.aweme.duet.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class DuetDetailActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f84134b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f84135a;

    /* renamed from: c  reason: collision with root package name */
    private String f84136c = "";

    /* renamed from: d  reason: collision with root package name */
    private String f84137d = "";

    /* renamed from: e  reason: collision with root package name */
    private String f84138e = "";

    /* renamed from: f  reason: collision with root package name */
    private String f84139f = "";

    /* renamed from: g  reason: collision with root package name */
    private String f84140g = "";

    /* renamed from: h  reason: collision with root package name */
    private final long f84141h = System.currentTimeMillis();

    /* renamed from: i  reason: collision with root package name */
    private SparseArray f84142i;

    static {
        Covode.recordClassIndex(52451);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f84142i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f84142i == null) {
            this.f84142i = new SparseArray();
        }
        View view = (View) this.f84142i.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f84142i.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52452);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        r.a("anchor_stay_time", new d().a("duration", System.currentTimeMillis() - this.f84141h).a((HashMap<? extends String, ? extends String>) this.f84135a).f66730a);
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
        public static final b f84143a = new b();

        static {
            Covode.recordClassIndex(52453);
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
            baseActivityViewModel2.config(AnonymousClass1.f84144a);
            baseActivityViewModel2.config(AnonymousClass2.f84145a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", true);
        activityConfiguration(b.f84143a);
        super.onCreate(bundle);
        setContentView(R.layout.b3z);
        String a2 = a(getIntent(), "enter_method");
        if (a2 == null) {
            a2 = "";
        }
        this.f84137d = a2;
        String a3 = a(getIntent(), "enter_from");
        if (a3 == null) {
            a3 = "";
        }
        this.f84136c = a3;
        String a4 = a(getIntent(), "id");
        if (a4 == null) {
            a4 = "";
        }
        this.f84138e = a4;
        String a5 = a(getIntent(), "origin_item_id");
        if (a5 == null) {
            a5 = "";
        }
        this.f84139f = a5;
        String a6 = a(getIntent(), "author_id");
        if (a6 == null) {
            a6 = "";
        }
        this.f84140g = a6;
        if (getIntent().getSerializableExtra("anchor_event_map") instanceof HashMap) {
            this.f84135a = (HashMap) getIntent().getSerializableExtra("anchor_event_map");
        }
        i supportFragmentManager = getSupportFragmentManager();
        n a7 = supportFragmentManager.a();
        l.b(a7, "");
        Fragment a8 = supportFragmentManager.a("duet_detail_fragment_tag");
        if (a8 == null) {
            String str = this.f84138e;
            String str2 = this.f84139f;
            String str3 = this.f84136c;
            String str4 = this.f84137d;
            String str5 = this.f84140g;
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            l.d(str4, "");
            a8 = new d();
            Bundle bundle2 = new Bundle();
            bundle2.putString("origin_item_id", str2);
            bundle2.putString("enter_from", str3);
            bundle2.putString("enter_method", str4);
            bundle2.putString("id", str);
            bundle2.putString("author_id", str5);
            a8.setArguments(bundle2);
        }
        a8.setUserVisibleHint(true);
        a7.b(R.id.ad7, a8, "duet_detail_fragment_tag");
        a7.b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.duet.ui.DuetDetailActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
