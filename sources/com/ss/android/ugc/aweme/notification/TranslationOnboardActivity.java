package com.ss.android.ugc.aweme.notification;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class TranslationOnboardActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f113034a = i.a((h.f.a.a) new d(this));

    /* renamed from: b  reason: collision with root package name */
    private final h f113035b = i.a((h.f.a.a) new b(this));

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f113036c;

    static {
        Covode.recordClassIndex(72674);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f113036c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f113036c == null) {
            this.f113036c = new SparseArray();
        }
        View view = (View) this.f113036c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f113036c.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static final class b extends m implements h.f.a.a<TuxButton> {
        final /* synthetic */ TranslationOnboardActivity this$0;

        static {
            Covode.recordClassIndex(72676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TranslationOnboardActivity translationOnboardActivity) {
            super(0);
            this.this$0 = translationOnboardActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxButton invoke() {
            return this.this$0.findViewById(R.id.cys);
        }
    }

    static final class d extends m implements h.f.a.a<SmartImageView> {
        final /* synthetic */ TranslationOnboardActivity this$0;

        static {
            Covode.recordClassIndex(72680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TranslationOnboardActivity translationOnboardActivity) {
            super(0);
            this.this$0 = translationOnboardActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SmartImageView invoke() {
            return this.this$0.findViewById(R.id.cyt);
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

        /* renamed from: a  reason: collision with root package name */
        public static final c f113038a = new c();

        static {
            Covode.recordClassIndex(72677);
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
            baseActivityViewModel2.config(AnonymousClass1.f113039a);
            baseActivityViewModel2.config(AnonymousClass2.f113040a);
            return z.f158842a;
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TranslationOnboardActivity f113037a;

        static {
            Covode.recordClassIndex(72675);
        }

        a(TranslationOnboardActivity translationOnboardActivity) {
            this.f113037a = translationOnboardActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f113037a, "//aweme/detail").withParam("id", a(this.f113037a.getIntent(), "aweme_id")).open();
            this.f113037a.finish();
        }

        private static String a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onCreate", true);
        activityConfiguration(c.f113038a);
        super.onCreate(bundle);
        ITranslatedCaptionService j2 = TranslatedCaptionCacheServiceImpl.j();
        if (j2.h()) {
            SmartRouter.buildRoute(this, "//aweme/detail").withParam("id", a(getIntent(), "aweme_id")).open();
            finish();
        } else {
            j2.i();
            setContentView(R.layout.k3);
            v a2 = r.a(a.a());
            a2.E = (SmartImageView) this.f113034a.getValue();
            a2.v = w.CENTER_INSIDE;
            a2.c();
            ((TuxButton) this.f113035b.getValue()).setOnClickListener(new a(this));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
