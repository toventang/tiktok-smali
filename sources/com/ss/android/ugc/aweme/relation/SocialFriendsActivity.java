package com.ss.android.ugc.aweme.relation;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.relation.a.b;
import com.ss.android.ugc.aweme.relation.recommend.n;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;

public final class SocialFriendsActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120294a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f120295b = RouteArgExtension.INSTANCE.optionalArgNotNull(this, b.f120298a, "nextStep", Integer.class);

    /* renamed from: c  reason: collision with root package name */
    private final h f120296c = RouteArgExtension.INSTANCE.optionalArgNotNull(this, g.f120304a, "socialRecType", Integer.class);

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f120297d;

    final /* synthetic */ class f implements u {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f120303a;

        static {
            Covode.recordClassIndex(78244);
        }

        f(h.f.a.b bVar) {
            this.f120303a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            l.b(this.f120303a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(78236);
    }

    private final int a() {
        return ((Number) this.f120295b.getValue()).intValue();
    }

    private final int b() {
        return ((Number) this.f120296c.getValue()).intValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f120297d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f120297d == null) {
            this.f120297d = new SparseArray();
        }
        View view = (View) this.f120297d.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f120297d.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78237);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        com.ss.android.ugc.aweme.friends.service.b q = com.ss.android.ugc.aweme.friends.service.a.f97047a.q();
        if (q != null) {
            q.a();
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

    static final class b extends m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120298a = new b();

        static {
            Covode.recordClassIndex(78238);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return Integer.valueOf(com.ss.android.ugc.aweme.relation.c.b.NONE.getValue());
        }
    }

    static final /* synthetic */ class d extends j implements h.f.a.b<com.ss.android.ugc.aweme.relation.viewmodel.e, z> {
        static {
            Covode.recordClassIndex(78242);
        }

        d(SocialFriendsActivity socialFriendsActivity) {
            super(1, socialFriendsActivity, SocialFriendsActivity.class, "handleActionTransition", "handleActionTransition(Lcom/ss/android/ugc/aweme/relation/viewmodel/SocialRecFlowData;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.relation.viewmodel.e eVar) {
            ((SocialFriendsActivity) this.receiver).a(eVar);
            return z.f158842a;
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialFriendsActivity f120302a;

        static {
            Covode.recordClassIndex(78243);
        }

        e(SocialFriendsActivity socialFriendsActivity) {
            this.f120302a = socialFriendsActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (!this.f120302a.isFinishing()) {
                this.f120302a.finish();
            }
        }
    }

    static final class g extends m implements h.f.a.b<Boolean, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f120304a = new g();

        static {
            Covode.recordClassIndex(78245);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 0;
        }
    }

    static final class c extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120299a = new c();

        static {
            Covode.recordClassIndex(78239);
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
            baseActivityViewModel2.config(AnonymousClass1.f120300a);
            baseActivityViewModel2.config(AnonymousClass2.f120301a);
            return z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.relation.viewmodel.e eVar) {
        if (eVar == null) {
            finish();
            return;
        }
        int i2 = eVar.f120573a;
        boolean z = false;
        if (i2 == com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue()) {
            com.ss.android.ugc.aweme.relation.a.a c2 = com.ss.android.ugc.aweme.relation.b.b.c(b());
            if (c2 != null) {
                a(b.d.a(c2), false);
            } else {
                finish();
            }
        } else if (i2 == com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue()) {
            com.ss.android.ugc.aweme.relation.recommend.m d2 = com.ss.android.ugc.aweme.relation.b.b.d(b());
            if (d2 != null) {
                n a2 = n.d.a(d2);
                if (a() == com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue()) {
                    z = true;
                }
                a(a2, z);
                return;
            }
            finish();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onCreate", true);
        activityConfiguration(c.f120299a);
        super.onCreate(bundle);
        setContentView(R.layout.a23);
        int b2 = b();
        if (b2 == 2 || b2 == 1) {
            ((SocialRecFlowModel) ae.a(this, (ad.b) null).a(SocialRecFlowModel.class)).f120502a.observe(this, new f(new d(this)));
            ((SocialRecFlowModel) ae.a(this, (ad.b) null).a(SocialRecFlowModel.class)).f120503b.observe(this, new e(this));
            a(new com.ss.android.ugc.aweme.relation.viewmodel.e(a(), null, null, null, 14));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onCreate", false);
    }

    private final void a(Fragment fragment, boolean z) {
        androidx.fragment.app.n a2 = getSupportFragmentManager().a();
        l.b(a2, "");
        if (z) {
            a2.a(R.anim.bp, R.anim.bq);
        }
        a2.b(R.id.b4y, fragment);
        a2.c();
    }
}
