package com.ss.android.ugc.trill.setting;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.journey.z;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.trill.setting.k;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.p;
import org.json.JSONObject;

public final class ContentPreferenceActivity extends com.bytedance.ies.foundation.activity.a implements k.a {

    /* renamed from: a  reason: collision with root package name */
    private k f150510a;

    /* renamed from: b  reason: collision with root package name */
    private b f150511b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.contentlanguage.a.a f150512c;

    /* renamed from: d  reason: collision with root package name */
    private d f150513d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f150514e;

    static {
        Covode.recordClassIndex(98983);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f150514e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f150514e == null) {
            this.f150514e = new SparseArray();
        }
        View view = (View) this.f150514e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f150514e.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.ss.android.ugc.trill.setting.k.a
    public final void d() {
        onBackPressed();
    }

    @Override // com.ss.android.ugc.trill.setting.k.a
    public final void e() {
        r.a("enter_customize_interests_page", new d().a("enter_from", "content_preference_page").f66730a);
        z.f105220a.a((Context) this);
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

    @Override // com.ss.android.ugc.trill.setting.k.a
    public final void a() {
        i supportFragmentManager = getSupportFragmentManager();
        com.ss.android.ugc.aweme.contentlanguage.a.a aVar = (com.ss.android.ugc.aweme.contentlanguage.a.a) supportFragmentManager.a("language_content_fragment");
        this.f150512c = aVar;
        if (aVar == null) {
            this.f150512c = new com.ss.android.ugc.aweme.contentlanguage.a.a();
        }
        com.ss.android.ugc.aweme.contentlanguage.a.a aVar2 = this.f150512c;
        if (aVar2 == null) {
            l.b();
        }
        if (!aVar2.isAdded()) {
            n a2 = supportFragmentManager.a();
            l.b(a2, "");
            a2.a(R.anim.dm, 0, 0, R.anim.dt);
            com.ss.android.ugc.aweme.contentlanguage.a.a aVar3 = this.f150512c;
            if (aVar3 == null) {
                l.b();
            }
            a2.a(R.id.b94, aVar3, "language_content_fragment");
            a2.a((String) null);
            a2.c();
        }
    }

    @Override // com.ss.android.ugc.trill.setting.k.a
    public final void b() {
        if (!com.ss.android.ugc.aweme.compliance.api.a.e().a()) {
            com.ss.android.ugc.aweme.app.n.a("vpa_show_in_error_region", "", (JSONObject) null);
        }
        if (in.d() || com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            com.ss.android.ugc.aweme.app.n.a("vpa_setting_button_clicked_in_child_mode", "", (JSONObject) null);
        }
        i supportFragmentManager = getSupportFragmentManager();
        d dVar = (d) supportFragmentManager.a("vpa_choice_fragment");
        this.f150513d = dVar;
        if (dVar == null) {
            this.f150513d = new d();
        }
        d dVar2 = this.f150513d;
        if (dVar2 == null) {
            l.b();
        }
        if (!dVar2.isAdded()) {
            n a2 = supportFragmentManager.a();
            l.b(a2, "");
            a2.a(R.anim.dq, R.anim.dv, R.anim.f354do, R.anim.dx);
            d dVar3 = this.f150513d;
            if (dVar3 == null) {
                l.b();
            }
            a2.b(R.id.b94, dVar3, "vpa_choice_fragment");
            a2.a((String) null);
            a2.c();
        }
    }

    @Override // com.ss.android.ugc.trill.setting.k.a
    public final void c() {
        r.a("enter_video_language_page", new d().a("enter_from", "content_preference_page").f66730a);
        k kVar = (k) getSupportFragmentManager().a("video_language_fragment");
        this.f150510a = kVar;
        if (kVar == null) {
            p<Integer, Integer> a2 = a(true);
            p<Integer, Integer> a3 = a(false);
            this.f150510a = new k();
            n a4 = getSupportFragmentManager().a().a(a2.getFirst().intValue(), a2.getSecond().intValue(), a3.getFirst().intValue(), a3.getSecond().intValue());
            k kVar2 = this.f150510a;
            if (kVar2 == null) {
                l.b();
            }
            a4.b(R.id.b94, kVar2, "video_language_fragment").a((String) null).c();
        }
        k kVar3 = this.f150510a;
        if (kVar3 == null) {
            l.b();
        }
        l.d(this, "");
        kVar3.f150604b = this;
    }

    static final class a extends m implements b<BaseActivityViewModel, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f150515a = new a();

        static {
            Covode.recordClassIndex(98984);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f150516a);
            baseActivityViewModel2.config(AnonymousClass2.f150517a);
            return h.z.f158842a;
        }
    }

    private static p<Integer, Integer> a(boolean z) {
        if (gb.a() ? z : !z) {
            return new p<>(Integer.valueOf((int) R.anim.f354do), Integer.valueOf((int) R.anim.dx));
        }
        return new p<>(Integer.valueOf((int) R.anim.dq), Integer.valueOf((int) R.anim.dv));
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", true);
        activityConfiguration(a.f150515a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.c3);
        ((RelativeLayout) _$_findCachedViewById(R.id.dqe)).setBackgroundColor(androidx.core.content.b.c(this, R.color.f159928l));
        b bVar = (b) getSupportFragmentManager().a("content_setting_host_fragment");
        this.f150511b = bVar;
        if (bVar == null) {
            this.f150511b = new b();
            n a2 = getSupportFragmentManager().a();
            b bVar2 = this.f150511b;
            if (bVar2 == null) {
                l.b();
            }
            a2.a(R.id.b94, bVar2, "content_setting_host_fragment").c();
        }
        b bVar3 = this.f150511b;
        if (bVar3 == null) {
            l.b();
        }
        bVar3.f150571a = this;
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", false);
    }
}
