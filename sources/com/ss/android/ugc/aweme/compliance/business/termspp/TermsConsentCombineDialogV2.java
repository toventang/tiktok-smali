package com.ss.android.ugc.aweme.compliance.business.termspp;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class TermsConsentCombineDialogV2 extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f77222b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f77223a;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f77224c;

    static {
        Covode.recordClassIndex(47751);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f77224c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f77224c == null) {
            this.f77224c = new SparseArray();
        }
        View view = (View) this.f77224c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f77224c.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47752);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ TermsConsentCombineDialogV2 this$0;

        static {
            Covode.recordClassIndex(47754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.this$0 = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (TermsConsentCombineDialogV2.a(this.this$0).c().f77245c) {
                r.a("click_agree_to_all", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ TermsConsentCombineDialogV2 this$0;

        static {
            Covode.recordClassIndex(47757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.this$0 = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            if (TpcConsentServiceImpl.j().b()) {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko";
            }
            TermsConsentCombineDialogV2 termsConsentCombineDialogV2 = this.this$0;
            String string = termsConsentCombineDialogV2.getString(R.string.ar9);
            l.b(string, "");
            termsConsentCombineDialogV2.a(str, string);
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ TermsConsentCombineDialogV2 this$0;

        static {
            Covode.recordClassIndex(47758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.this$0 = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            if (TpcConsentServiceImpl.j().b()) {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko";
            }
            TermsConsentCombineDialogV2 termsConsentCombineDialogV2 = this.this$0;
            String string = termsConsentCombineDialogV2.getString(R.string.ar8);
            l.b(string, "");
            termsConsentCombineDialogV2.a(str, string);
            return z.f158842a;
        }
    }

    public final void a() {
        boolean z;
        b bVar = this.f77223a;
        if (bVar == null) {
            l.a("contentView");
        }
        a c2 = bVar.c();
        b bVar2 = this.f77223a;
        if (bVar2 == null) {
            l.a("contentView");
        }
        if (bVar2.a().f77245c) {
            b bVar3 = this.f77223a;
            if (bVar3 == null) {
                l.a("contentView");
            }
            if (bVar3.b().f77245c) {
                z = true;
                c2.a(z);
            }
        }
        z = false;
        c2.a(z);
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

    static final class h extends m implements h.f.a.a<z> {
        final /* synthetic */ TermsConsentCombineDialogV2 this$0;

        static {
            Covode.recordClassIndex(47759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.this$0 = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!com.ss.android.ugc.aweme.l.a.a.a(TermsConsentCombineDialogV2.a(this.this$0).d(), 1200)) {
                if (TermsConsentCombineDialogV2.a(this.this$0).c().f77245c) {
                    com.ss.android.ugc.aweme.compliance.api.a.r().c();
                    this.this$0.finish();
                    a.C0732a.f33434a.a(b.a.TERMS_CONSENT);
                } else {
                    new com.bytedance.tux.g.b(this.this$0).e(R.string.ar_).b();
                }
            }
            return z.f158842a;
        }
    }

    public final void b() {
        if (c.a() != 1) {
            b bVar = this.f77223a;
            if (bVar == null) {
                l.a("contentView");
            }
            if (bVar.c().f77245c) {
                b bVar2 = this.f77223a;
                if (bVar2 == null) {
                    l.a("contentView");
                }
                TuxButton d2 = bVar2.d();
                b bVar3 = this.f77223a;
                if (bVar3 == null) {
                    l.a("contentView");
                }
                d2.setTextColor(androidx.core.content.b.c(bVar3.d().getContext(), R.color.a9));
                b bVar4 = this.f77223a;
                if (bVar4 == null) {
                    l.a("contentView");
                }
                bVar4.d().setBackground(androidx.core.content.b.a(this, (int) R.drawable.a2u));
                b bVar5 = this.f77223a;
                if (bVar5 == null) {
                    l.a("contentView");
                }
                com.bytedance.ies.dmt.ui.f.c.a(bVar5.d(), 0.5f);
                return;
            }
            b bVar6 = this.f77223a;
            if (bVar6 == null) {
                l.a("contentView");
            }
            TuxButton d3 = bVar6.d();
            b bVar7 = this.f77223a;
            if (bVar7 == null) {
                l.a("contentView");
            }
            d3.setTextColor(androidx.core.content.b.c(bVar7.d().getContext(), R.color.bz));
            b bVar8 = this.f77223a;
            if (bVar8 == null) {
                l.a("contentView");
            }
            bVar8.d().setBackground(androidx.core.content.b.a(this, (int) R.drawable.a2y));
            b bVar9 = this.f77223a;
            if (bVar9 == null) {
                l.a("contentView");
            }
            com.bytedance.ies.dmt.ui.f.c.a(bVar9.d(), 1.0f);
        }
    }

    public static final /* synthetic */ b a(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
        b bVar = termsConsentCombineDialogV2.f77223a;
        if (bVar == null) {
            l.a("contentView");
        }
        return bVar;
    }

    static final class d extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ TermsConsentCombineDialogV2 this$0;

        static {
            Covode.recordClassIndex(47755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(1);
            this.this$0 = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.a();
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ TermsConsentCombineDialogV2 this$0;

        static {
            Covode.recordClassIndex(47756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(1);
            this.this$0 = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            bool.booleanValue();
            this.this$0.a();
            this.this$0.b();
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ TermsConsentCombineDialogV2 this$0;

        static {
            Covode.recordClassIndex(47753);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(1);
            this.this$0 = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            TermsConsentCombineDialogV2.a(this.this$0).a().a(booleanValue);
            TermsConsentCombineDialogV2.a(this.this$0).b().a(booleanValue);
            this.this$0.b();
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u_);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.c();
        }
        this.f77223a = new b(this);
        b();
        b bVar = this.f77223a;
        if (bVar == null) {
            l.a("contentView");
        }
        a c2 = bVar.c();
        c2.f77243a = new b(this);
        c2.f77244b = new c(this);
        b bVar2 = this.f77223a;
        if (bVar2 == null) {
            l.a("contentView");
        }
        bVar2.a().f77243a = new d(this);
        b bVar3 = this.f77223a;
        if (bVar3 == null) {
            l.a("contentView");
        }
        bVar3.b().f77243a = new e(this);
        b bVar4 = this.f77223a;
        if (bVar4 == null) {
            l.a("contentView");
        }
        bVar4.f77250e = new f(this);
        b bVar5 = this.f77223a;
        if (bVar5 == null) {
            l.a("contentView");
        }
        bVar5.f77251f = new g(this);
        b bVar6 = this.f77223a;
        if (bVar6 == null) {
            l.a("contentView");
        }
        bVar6.f77252g = new h(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onCreate", false);
    }

    public final void a(String str, String str2) {
        SmartRouter.buildRoute(this, "//webview").withParam("url", str).withParam("title", str2).withParam("skip_consent", TpcConsentServiceImpl.j().b()).open();
    }
}
