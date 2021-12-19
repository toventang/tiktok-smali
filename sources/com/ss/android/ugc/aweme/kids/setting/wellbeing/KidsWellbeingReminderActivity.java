package com.ss.android.ugc.aweme.kids.setting.wellbeing;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class KidsWellbeingReminderActivity extends com.bytedance.ies.foundation.activity.a implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107110a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f107111b = h.i.a((h.f.a.a) new i(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f107112c = h.i.a((h.f.a.a) new l(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.h f107113d = h.i.a((h.f.a.a) new k(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f107114e = h.i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f107115f = h.i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f107116g = h.i.a((h.f.a.a) new h(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f107117h = h.i.a((h.f.a.a) new j(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f107118i = h.i.a((h.f.a.a) new g(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f107119j;

    static {
        Covode.recordClassIndex(68513);
    }

    private final String f() {
        return (String) this.f107111b.getValue();
    }

    private final com.bytedance.tux.sheet.sheet.a g() {
        return (com.bytedance.tux.sheet.sheet.a) this.f107118i.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f107119j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f107119j == null) {
            this.f107119j = new HashMap();
        }
        View view = (View) this.f107119j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f107119j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final String a() {
        return (String) this.f107112c.getValue();
    }

    public final d b() {
        return (d) this.f107116g.getValue();
    }

    public final int c() {
        return ((Number) this.f107117h.getValue()).intValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingReminderActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingReminderActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingReminderActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68514);
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
        overridePendingTransition(0, 0);
    }

    static final class b extends m implements h.f.a.a<String> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "key_description");
            if (a2 == null) {
                a2 = "";
            }
            h.f.b.l.b(a2, "");
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "key_image_url");
            if (a2 == null) {
                a2 = "";
            }
            h.f.b.l.b(a2, "");
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class h extends m implements h.f.a.a<d> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            d dVar = new d(h.f.b.l.a((Object) this.this$0.a(), (Object) "night"), this.this$0, (byte) 0);
            dVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return dVar;
        }
    }

    static final class i extends m implements h.f.a.a<String> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "key_view_style");
            if (a2 == null) {
                a2 = "full";
            }
            h.f.b.l.b(a2, "");
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class j extends m implements h.f.a.a<Integer> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            if (h.f.b.l.a((Object) this.this$0.a(), (Object) "night")) {
                i2 = R.style.fq;
            } else {
                i2 = R.style.o1;
            }
            return Integer.valueOf(i2);
        }
    }

    static final class k extends m implements h.f.a.a<String> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "key_title");
            if (a2 == null) {
                a2 = "";
            }
            h.f.b.l.b(a2, "");
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static final class l extends m implements h.f.a.a<String> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2 = a(this.this$0.getIntent(), "key_type");
            if (a2 == null) {
                a2 = "day";
            }
            h.f.b.l.b(a2, "");
            return a2;
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public final int d() {
        if (h.f.b.l.a((Object) a(), (Object) "night")) {
            return R.color.ae;
        }
        return R.color.f159928l;
    }

    static final class g extends m implements h.f.a.a<com.bytedance.tux.sheet.sheet.a> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(0);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.tux.sheet.sheet.a invoke() {
            return new a.C1112a().a(this.this$0.b()).b(true).c(true).b().a(this.this$0).a(0).c(this.this$0.c()).f45299a;
        }
    }

    public final void e() {
        String f2 = f();
        if (f2.hashCode() == 3154575 && f2.equals("full")) {
            finish();
        } else {
            g().dismiss();
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        MethodCollector.i(3563);
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        b().setFullScreen(h.f.b.l.a((Object) f(), (Object) "full"));
        String f2 = f();
        if (f2.hashCode() == 3154575 && f2.equals("full")) {
            FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.b_j);
            h.f.b.l.b(frameLayout, "");
            if (frameLayout.getVisibility() == 8) {
                ((FrameLayout) _$_findCachedViewById(R.id.b_j)).addView(b());
                FrameLayout frameLayout2 = (FrameLayout) _$_findCachedViewById(R.id.b_j);
                h.f.b.l.b(frameLayout2, "");
                frameLayout2.setVisibility(0);
                MethodCollector.o(3563);
                return;
            }
        } else {
            FrameLayout frameLayout3 = (FrameLayout) _$_findCachedViewById(R.id.b_j);
            h.f.b.l.b(frameLayout3, "");
            frameLayout3.setVisibility(8);
            g().show(getSupportFragmentManager(), "kids_wellbeing_reminder");
        }
        MethodCollector.o(3563);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        finish();
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsWellbeingReminderActivity f107120a;

        static {
            Covode.recordClassIndex(68517);
        }

        d(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            this.f107120a = kidsWellbeingReminderActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f107120a.e();
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ KidsWellbeingReminderActivity f107121a;

        static {
            Covode.recordClassIndex(68518);
        }

        e(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            this.f107121a = kidsWellbeingReminderActivity;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.d.a.c.a(new e());
            this.f107121a.e();
        }
    }

    static final class f extends m implements h.f.a.b<BaseActivityViewModel, z> {
        final /* synthetic */ KidsWellbeingReminderActivity this$0;

        static {
            Covode.recordClassIndex(68519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(KidsWellbeingReminderActivity kidsWellbeingReminderActivity) {
            super(1);
            this.this$0 = kidsWellbeingReminderActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            h.f.b.l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new h.f.a.a<com.bytedance.ies.foundation.base.a>(this) {
                /* class com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingReminderActivity.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(68520);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.bytedance.ies.foundation.base.a invoke() {
                    x xVar = new x(0, false, false, 7);
                    xVar.f65561g = this.this$0.this$0.d();
                    xVar.f65558d = this.this$0.this$0.d();
                    xVar.f65555a = h.f.b.l.a((Object) this.this$0.this$0.a(), (Object) "day");
                    return xVar;
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingReminderActivity", "onCreate", true);
        if (h.f.b.l.a((Object) f(), (Object) "full")) {
            activityConfiguration(new f(this));
            setTheme(c());
        } else {
            setTheme(R.style.fr);
        }
        super.onCreate(bundle);
        setContentView(R.layout.ae1);
        b().setTitle$k_setting_release((String) this.f107113d.getValue());
        b().setDesc$k_setting_release((String) this.f107114e.getValue());
        d b2 = b();
        String str = (String) this.f107115f.getValue();
        h.f.b.l.d(str, "");
        v a2 = r.a(str);
        SmartImageView smartImageView = b2.f107151b;
        if (smartImageView == null) {
            h.f.b.l.a("imageView");
        }
        a2.E = smartImageView;
        SmartImageView smartImageView2 = b2.f107151b;
        if (smartImageView2 == null) {
            h.f.b.l.a("imageView");
        }
        int width = smartImageView2.getWidth();
        SmartImageView smartImageView3 = b2.f107151b;
        if (smartImageView3 == null) {
            h.f.b.l.a("imageView");
        }
        a2.a(width, smartImageView3.getHeight()).c();
        b().getDismissLiveData$k_setting_release().observe(this, new d(this));
        b().getSnoozeLiveData$k_setting_release().observe(this, new e(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingReminderActivity", "onCreate", false);
    }
}
