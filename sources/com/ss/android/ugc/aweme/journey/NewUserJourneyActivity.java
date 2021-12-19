package com.ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.analytics.page.b;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.e.a;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.journey.flow.NewUserJourneyFlowDependencies;
import com.ss.android.ugc.aweme.journey.p;
import com.ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.ss.android.ugc.aweme.journey.y;
import com.ss.android.ugc.aweme.logger.a;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class NewUserJourneyActivity extends f implements com.bytedance.analytics.page.b, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f104787h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f104788i = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public boolean f104789f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.journey.flow.a f104790g;

    /* renamed from: j  reason: collision with root package name */
    private final t<aa> f104791j = new t<>();

    /* renamed from: k  reason: collision with root package name */
    private final t<Boolean> f104792k = new t<>();

    /* renamed from: l  reason: collision with root package name */
    private ComponentDependencies f104793l;

    /* renamed from: m  reason: collision with root package name */
    private NewUserJourneyFlowDependencies f104794m;
    private SparseArray n;

    static {
        Covode.recordClassIndex(67200);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.n == null) {
            this.n = new SparseArray();
        }
        View view = (View) this.n.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.n.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.b
    public final String bp_() {
        return "0226";
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(23, new org.greenrobot.eventbus.g(NewUserJourneyActivity.class, "onEvent", com.ss.android.ugc.aweme.al.f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(24, new org.greenrobot.eventbus.g(NewUserJourneyActivity.class, "onEvent", com.ss.android.ugc.aweme.journey.step.g.b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(25, new org.greenrobot.eventbus.g(NewUserJourneyActivity.class, "onAppFlyerEvent", com.ss.android.ugc.aweme.al.b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.cm
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.cm
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(67201);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Activity activity, boolean z, boolean z2) {
            h.f.b.l.d(activity, "");
            a.b.f109011a.f109002c = false;
            a.b.f109011a.f109006g = false;
            Intent intent = new Intent(activity, NewUserJourneyActivity.class);
            intent.putExtra("from_main", z);
            if (!z) {
                intent.putExtra("deeplink_intent_about_welcome_screen", activity.getIntent());
                if (!z2 || activity.getIntent() != null) {
                    activity.finish();
                }
            }
            activity.overridePendingTransition(0, 0);
            activity.startActivityForResult(intent, 18);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<WeakReference<Context>> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakReference<Context> invoke() {
            return new WeakReference(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.e();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<WeakReference<androidx.fragment.app.e>> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakReference<androidx.fragment.app.e> invoke() {
            return new WeakReference(this.this$0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.a<WeakReference<Context>> {
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(NewUserJourneyActivity newUserJourneyActivity) {
            super(0);
            this.this$0 = newUserJourneyActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakReference<Context> invoke() {
            return new WeakReference(this.this$0);
        }
    }

    @Override // com.bytedance.analytics.page.b
    public final String ac_() {
        return b.a.a(this);
    }

    @Override // com.bytedance.analytics.page.b
    public final Map<String, String> c() {
        h.f.b.l.d(this, "");
        return null;
    }

    public static final class c implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NewUserJourneyActivity f104798a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f104799b;

        static {
            Covode.recordClassIndex(67205);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f104800a;

            static {
                Covode.recordClassIndex(67206);
            }

            a(c cVar) {
                this.f104800a = cVar;
            }

            public final void run() {
                com.ss.android.ugc.aweme.journey.flow.a aVar = this.f104800a.f104798a.f104790g;
                if (aVar != null) {
                    aVar.a((Boolean) null);
                }
            }
        }

        c(NewUserJourneyActivity newUserJourneyActivity, View view) {
            this.f104798a = newUserJourneyActivity;
            this.f104799b = view;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f104799b.removeOnLayoutChangeListener(this);
            new Handler(Looper.getMainLooper()).postDelayed(new a(this), 1000);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.journey.flow.a aVar = this.this$0.f104790g;
            if (aVar != null) {
                aVar.a((Boolean) null);
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        p.a.a().f104884a = true;
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.journey.flow.a aVar = this.this$0.f104790g;
            if (aVar != null) {
                aVar.f104855b = Integer.MAX_VALUE;
                aVar.f59393a.d().invoke();
            }
            return z.f158842a;
        }
    }

    public final void e() {
        p.a.a().f104889f = true;
        Boolean value = this.f104792k.getValue();
        if (value == null) {
            value = false;
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.z(true ^ value.booleanValue()));
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.cm
    public final void finish() {
        boolean z = true;
        p.a.a().f104884a = true;
        com.ss.android.ugc.d.a.c.a(new x());
        ComponentDependencies componentDependencies = this.f104793l;
        if (componentDependencies == null) {
            h.f.b.l.a("componentDependencies");
        }
        if (componentDependencies.i() == null) {
            z = false;
        }
        a(Boolean.valueOf(z));
        super.finish();
        overridePendingTransition(0, R.anim.c7);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", true);
        a.b.f109011a.b("cold_boot_new_user_journey_create_to_resume", false);
        a.b.f109011a.a("cold_boot_new_user_journey_resume_duration", false);
        super.onResume();
        a.b.f109011a.b("cold_boot_new_user_journey_resume_duration", false);
        a.b.f109011a.a("cold_boot_new_user_journey_resume_to_focus_changed", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", false);
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

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ NewUserJourneyFlowDependencies $this_apply;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(NewUserJourneyFlowDependencies newUserJourneyFlowDependencies, NewUserJourneyActivity newUserJourneyActivity) {
            super(0);
            this.$this_apply = newUserJourneyFlowDependencies;
            this.this$0 = newUserJourneyActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.language.b bVar = this.$this_apply.a().f104914d;
            NewUserJourneyActivity newUserJourneyActivity = this.this$0;
            if (bVar != null && !TextUtils.equals(bVar.f(), SettingServiceImpl.v().a((Context) newUserJourneyActivity).f()) && !this.this$0.f104789f) {
                this.this$0.f104789f = true;
                ISettingService v = SettingServiceImpl.v();
                String a2 = bVar.a();
                h.f.b.l.b(a2, "");
                String f2 = bVar.f();
                h.f.b.l.b(f2, "");
                v.a(a2, f2, newUserJourneyActivity);
                com.ss.android.ugc.aweme.account.b.g().updateLanguage(null, SettingServiceImpl.v().h(), 0);
            } else if (!this.this$0.isFinishing()) {
                this.this$0.finish();
            }
            return z.f158842a;
        }
    }

    private final void f() {
        ac a2 = ae.a(this, (ad.b) null).a(NewUserJourneyFlowDependencies.class);
        h.f.b.l.b(a2, "");
        NewUserJourneyFlowDependencies newUserJourneyFlowDependencies = (NewUserJourneyFlowDependencies) a2;
        com.ss.android.ugc.aweme.journey.a.c cVar = y.f105216b;
        if (cVar == null) {
            cVar = new com.ss.android.ugc.aweme.journey.a.c();
        }
        newUserJourneyFlowDependencies.a(cVar);
        newUserJourneyFlowDependencies.b(new l(this));
        newUserJourneyFlowDependencies.a(this.f104791j);
        newUserJourneyFlowDependencies.b(this.f104792k);
        ComponentDependencies componentDependencies = this.f104793l;
        if (componentDependencies == null) {
            h.f.b.l.a("componentDependencies");
        }
        newUserJourneyFlowDependencies.a(componentDependencies);
        newUserJourneyFlowDependencies.a(new m(newUserJourneyFlowDependencies, this));
        this.f104794m = newUserJourneyFlowDependencies;
        com.ss.android.ugc.aweme.journey.flow.a aVar = this.f104790g;
        if (aVar == null) {
            NewUserJourneyFlowDependencies newUserJourneyFlowDependencies2 = this.f104794m;
            if (newUserJourneyFlowDependencies2 == null) {
                h.f.b.l.a("flowDependencies");
            }
            this.f104790g = new com.ss.android.ugc.aweme.journey.flow.a(newUserJourneyFlowDependencies2);
            return;
        }
        NewUserJourneyFlowDependencies newUserJourneyFlowDependencies3 = this.f104794m;
        if (newUserJourneyFlowDependencies3 == null) {
            h.f.b.l.a("flowDependencies");
        }
        aVar.a(newUserJourneyFlowDependencies3);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<Fragment, z> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(1);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            h.f.b.l.d(fragment2, "");
            this.this$0.a(fragment2, false);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<Fragment, z> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(1);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            h.f.b.l.d(fragment2, "");
            this.this$0.a(fragment2, true);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<Fragment, z> {
        final /* synthetic */ Intent $deeplinkIntent$inlined;
        final /* synthetic */ NewUserJourneyActivity this$0;

        static {
            Covode.recordClassIndex(67214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(1);
            this.this$0 = newUserJourneyActivity;
            this.$deeplinkIntent$inlined = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            h.f.b.l.d(fragment2, "");
            this.this$0.a(fragment2, false);
            return z.f158842a;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onEvent(com.ss.android.ugc.aweme.journey.step.g.b bVar) {
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.aweme.journey.flow.a aVar = this.f104790g;
        if (aVar != null) {
            aVar.a(bVar.f105027a);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a(intent);
        f();
    }

    static final class b extends h.f.b.m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104795a = new b();

        static {
            Covode.recordClassIndex(67202);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f104796a);
            baseActivityViewModel2.config(AnonymousClass2.f104797a);
            return z.f158842a;
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onAppFlyerEvent(com.ss.android.ugc.aweme.al.b bVar) {
        h.f.b.l.d(bVar, "");
        Intent intent = new Intent(this, NewUserJourneyActivity.class);
        intent.putExtra("deeplink_intent_about_welcome_screen", bVar.f66363a);
        a(intent);
        f();
    }

    @r(a = ThreadMode.MAIN)
    public final void onEvent(com.ss.android.ugc.aweme.al.f fVar) {
        boolean z;
        h.f.b.l.d(fVar, "");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (g2.isChildrenMode()) {
            finish();
            return;
        }
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        ComponentDependencies componentDependencies = this.f104793l;
        if (componentDependencies == null) {
            h.f.b.l.a("componentDependencies");
        }
        h.f.b.l.b(g3, "");
        if (!g3.getCurUser().notifyPrivatePolicy || !g3.isNewUser()) {
            z = false;
        } else {
            z = true;
        }
        componentDependencies.f104915e = z;
        NewUserJourneyFlowDependencies newUserJourneyFlowDependencies = this.f104794m;
        if (newUserJourneyFlowDependencies == null) {
            h.f.b.l.a("flowDependencies");
        }
        newUserJourneyFlowDependencies.a(new com.ss.android.ugc.aweme.journey.a.c());
    }

    private final void a(Intent intent) {
        Intent intent2;
        boolean z;
        Uri data;
        if (intent != null) {
            intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent2 = null;
        }
        boolean z2 = false;
        if (intent2 == null || (data = intent2.getData()) == null || (z = data.getQueryParameter("awedp_require_login")) == null) {
            z = false;
        }
        this.f71189c = h.f.b.l.a((Object) "normal", z);
        ac a2 = ae.a(this, (ad.b) null).a(ComponentDependencies.class);
        h.f.b.l.b(a2, "");
        ComponentDependencies componentDependencies = (ComponentDependencies) a2;
        componentDependencies.a(this.f104791j);
        componentDependencies.f104919i = this.f71187a;
        componentDependencies.f104921k = this.f71189c;
        componentDependencies.f104920j = this.f71188b;
        componentDependencies.a(new d(this, intent2));
        componentDependencies.b(new e(this, intent2));
        componentDependencies.a(new f(this, intent2));
        componentDependencies.a(p.a.a());
        componentDependencies.a(SettingServiceImpl.v().a((Context) this));
        componentDependencies.b(new g(this, intent2));
        componentDependencies.f104911a = this.f71191e;
        if (p.a.a().c() == 3) {
            z2 = true;
        }
        componentDependencies.f104922l = z2;
        if (intent2 != null) {
            componentDependencies.a(new com.ss.android.ugc.aweme.journey.step.d.b(this.f71189c, intent2));
        }
        componentDependencies.d(new h(this, intent2));
        componentDependencies.c(new i(this, intent2));
        componentDependencies.e(new j(this, intent2));
        componentDependencies.c(new k(this, intent2));
        this.f104793l = componentDependencies;
        if (!y.f105215a) {
            y.a.a(this);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.journey.f, androidx.appcompat.app.d, com.ss.android.ugc.aweme.cm, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", true);
        a.b.f109011a.b("cold_boot_stubmain_to_new_user_jrouney", false);
        activityConfiguration(b.f104795a);
        super.onCreate(bundle);
        a.b.f109011a.a("cold_boot_new_user_journey_oncreate_duration", false);
        this.f71191e = getIntent().getBooleanExtra("from_main", true);
        this.f104789f = false;
        if (!this.f71191e) {
            p.a.a().f104886c = 1;
        }
        p.a.a().f104884a = false;
        Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
        a(getIntent());
        f();
        a.b.f109011a.a("cold_boot_new_user_journey_setcontentview_duration", false);
        setContentView(R.layout.bg);
        if (!d() || bundle != null) {
            com.ss.android.ugc.aweme.journey.flow.a aVar = this.f104790g;
            if (aVar != null) {
                aVar.a((Boolean) null);
            }
        } else {
            Window window = getWindow();
            h.f.b.l.b(window, "");
            View decorView = window.getDecorView();
            h.f.b.l.b(decorView, "");
            decorView.addOnLayoutChangeListener(new c(this, decorView));
        }
        a.b.f109011a.b("cold_boot_new_user_journey_setcontentview_duration", false);
        f104787h = true;
        a.C1099a.a(this).a().b().c().f44923a.d();
        a.b.f109011a.b("cold_boot_new_user_journey_oncreate_duration", false);
        a.b.f109011a.a("cold_boot_new_user_journey_create_to_resume", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", false);
    }

    public final void a(Fragment fragment, boolean z) {
        int i2;
        h.f.b.l.d(fragment, "");
        n a2 = getSupportFragmentManager().a();
        h.f.b.l.b(a2, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = R.anim.c9;
        }
        a2.a(i2, R.anim.c_);
        a2.b(R.id.b94, fragment);
        a2.c();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void onActivityResult(int i2, int i3, Intent intent) {
        com.ss.android.ugc.aweme.journey.flow.a aVar;
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1 && (aVar = this.f104790g) != null) {
            aVar.a((Boolean) null);
        }
    }
}
