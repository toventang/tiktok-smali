package com.ss.android.ugc.aweme.compliance.business.termspp;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.ArrayList;

public final class TermsConsentCombineDialog extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f77209d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f77210a = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f77211b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f77212c;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f77213e;

    static {
        Covode.recordClassIndex(47740);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f77213e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f77213e == null) {
            this.f77213e = new SparseArray();
        }
        View view = (View) this.f77213e.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f77213e.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47741);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void b() {
        finish();
        a.C0732a.f33434a.a(b.a.TERMS_CONSENT);
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

    public final void c() {
        if (this.f77211b) {
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.y7);
            l.b(tuxButton, "");
            ((TuxButton) _$_findCachedViewById(R.id.y7)).setTextColor(androidx.core.content.b.c(tuxButton.getContext(), R.color.a9));
            TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.y7);
            l.b(tuxButton2, "");
            tuxButton2.setBackground(androidx.core.content.b.a(this, (int) R.drawable.a2u));
            com.bytedance.ies.dmt.ui.f.c.a(_$_findCachedViewById(R.id.y7), 0.5f);
            return;
        }
        TuxButton tuxButton3 = (TuxButton) _$_findCachedViewById(R.id.y7);
        l.b(tuxButton3, "");
        ((TuxButton) _$_findCachedViewById(R.id.y7)).setTextColor(androidx.core.content.b.c(tuxButton3.getContext(), R.color.bz));
        TuxButton tuxButton4 = (TuxButton) _$_findCachedViewById(R.id.y7);
        l.b(tuxButton4, "");
        tuxButton4.setBackground(androidx.core.content.b.a(this, (int) R.drawable.a2y));
        com.bytedance.ies.dmt.ui.f.c.a(_$_findCachedViewById(R.id.y7), 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.appcompat.widget.AppCompatCheckBox[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.bytedance.tux.input.TuxCheckBox */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        boolean z;
        boolean z2;
        AppCompatCheckBox[] appCompatCheckBoxArr = {_$_findCachedViewById(R.id.a3a), _$_findCachedViewById(R.id.a39)};
        ArrayList<AppCompatCheckBox> arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            TuxCheckBox tuxCheckBox = appCompatCheckBoxArr[i2];
            l.b(tuxCheckBox, "");
            if (tuxCheckBox.getVisibility() == 0) {
                arrayList.add(tuxCheckBox);
            }
        }
        for (AppCompatCheckBox appCompatCheckBox : arrayList) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dco);
            l.b(relativeLayout, "");
            if (relativeLayout.getVisibility() == 0) {
                l.b(appCompatCheckBox, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a32);
                l.b(appCompatCheckBox2, "");
                if (appCompatCheckBox2.isChecked()) {
                    AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a30);
                    l.b(appCompatCheckBox3, "");
                    if (appCompatCheckBox3.isChecked()) {
                        AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a37);
                        l.b(appCompatCheckBox4, "");
                        if (appCompatCheckBox4.isChecked()) {
                            z2 = true;
                            appCompatCheckBox.setChecked(z2);
                        }
                    }
                }
                z2 = false;
                appCompatCheckBox.setChecked(z2);
            } else {
                l.b(appCompatCheckBox, "");
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a32);
                l.b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    AppCompatCheckBox appCompatCheckBox6 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a30);
                    l.b(appCompatCheckBox6, "");
                    if (appCompatCheckBox6.isChecked()) {
                        z = true;
                        appCompatCheckBox.setChecked(z);
                    }
                }
                z = false;
                appCompatCheckBox.setChecked(z);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77215a;

        static {
            Covode.recordClassIndex(47743);
        }

        c(AppCompatCheckBox appCompatCheckBox) {
            this.f77215a = appCompatCheckBox;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AppCompatCheckBox appCompatCheckBox = this.f77215a;
            l.b(appCompatCheckBox, "");
            if (appCompatCheckBox.isChecked()) {
                r.a("click_agree_to_all", new com.ss.android.ugc.aweme.app.f.d().f66730a);
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentCombineDialog f77219a;

        static {
            Covode.recordClassIndex(47747);
        }

        g(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f77219a = termsConsentCombineDialog;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (TpcConsentServiceImpl.j().b()) {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko";
            }
            SmartRouter.buildRoute(this.f77219a, "//webview").withParam("url", str).withParam("title", this.f77219a.getString(R.string.ar9)).withParam("skip_consent", TpcConsentServiceImpl.j().b()).open();
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentCombineDialog f77220a;

        static {
            Covode.recordClassIndex(47748);
        }

        h(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f77220a = termsConsentCombineDialog;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (TpcConsentServiceImpl.j().b()) {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko";
            }
            SmartRouter.buildRoute(this.f77220a, "//webview").withParam("url", str).withParam("title", this.f77220a.getString(R.string.ar8)).withParam("skip_consent", TpcConsentServiceImpl.j().b()).open();
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentCombineDialog f77221a;

        static {
            Covode.recordClassIndex(47749);
        }

        i(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f77221a = termsConsentCombineDialog;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                if (this.f77221a.f77211b) {
                    com.ss.android.ugc.aweme.compliance.api.a.r().c();
                    if (this.f77221a.f77210a != 3) {
                        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a aVar = new com.ss.android.ugc.aweme.compliance.business.policynotice.a.a();
                        if (this.f77221a.f77212c) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        aVar.a("kr_market_ms_d", "v20200906", "pop", null, Integer.valueOf(i2), 0, new h.f.a.a<z>(this) {
                            /* class com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog.i.AnonymousClass1 */
                            final /* synthetic */ i this$0;

                            static {
                                Covode.recordClassIndex(47750);
                            }

                            {
                                this.this$0 = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // h.f.a.a
                            public final /* synthetic */ z invoke() {
                                this.this$0.f77221a.b();
                                return z.f158842a;
                            }
                        });
                        return;
                    }
                    this.f77221a.b();
                    return;
                }
                new com.bytedance.tux.g.b(this.f77221a).e(R.string.ar_).b();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: androidx.appcompat.widget.AppCompatCheckBox[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.bytedance.tux.input.TuxCheckBox */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u9);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.c();
        }
        this.f77210a = getIntent().getIntExtra("style", 1);
        c();
        int i2 = this.f77210a;
        if (i2 == 2) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dx9);
            l.b(relativeLayout, "");
            relativeLayout.setVisibility(8);
        } else if (i2 != 3) {
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.dx8);
            l.b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
        } else {
            RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(R.id.dx8);
            l.b(relativeLayout3, "");
            relativeLayout3.setVisibility(8);
            RelativeLayout relativeLayout4 = (RelativeLayout) _$_findCachedViewById(R.id.dco);
            l.b(relativeLayout4, "");
            relativeLayout4.setVisibility(8);
        }
        AppCompatCheckBox[] appCompatCheckBoxArr = {_$_findCachedViewById(R.id.a3a), _$_findCachedViewById(R.id.a39)};
        int i3 = 0;
        do {
            TuxCheckBox tuxCheckBox = appCompatCheckBoxArr[i3];
            tuxCheckBox.setOnCheckedChangeListener(new b(this));
            tuxCheckBox.setOnClickListener(new c(tuxCheckBox));
            i3++;
        } while (i3 < 2);
        ((AppCompatCheckBox) _$_findCachedViewById(R.id.a32)).setOnCheckedChangeListener(new d(this));
        ((AppCompatCheckBox) _$_findCachedViewById(R.id.a30)).setOnCheckedChangeListener(new e(this));
        ((AppCompatCheckBox) _$_findCachedViewById(R.id.a37)).setOnCheckedChangeListener(new f(this));
        ((RelativeLayout) _$_findCachedViewById(R.id.eiu)).setOnClickListener(new g(this));
        ((RelativeLayout) _$_findCachedViewById(R.id.d9d)).setOnClickListener(new h(this));
        ((TuxButton) _$_findCachedViewById(R.id.y7)).setOnClickListener(new i(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onCreate", false);
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentCombineDialog f77214a;

        static {
            Covode.recordClassIndex(47742);
        }

        b(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f77214a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f77214a._$_findCachedViewById(R.id.a32);
            l.b(appCompatCheckBox, "");
            appCompatCheckBox.setChecked(z);
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f77214a._$_findCachedViewById(R.id.a30);
            l.b(appCompatCheckBox2, "");
            appCompatCheckBox2.setChecked(z);
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f77214a._$_findCachedViewById(R.id.a37);
            l.b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(z);
            TermsConsentCombineDialog termsConsentCombineDialog = this.f77214a;
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) termsConsentCombineDialog._$_findCachedViewById(R.id.a32);
            l.b(appCompatCheckBox4, "");
            if (appCompatCheckBox4.isChecked()) {
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) this.f77214a._$_findCachedViewById(R.id.a30);
                l.b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    z2 = true;
                    termsConsentCombineDialog.f77211b = z2;
                    this.f77214a.c();
                }
            }
            z2 = false;
            termsConsentCombineDialog.f77211b = z2;
            this.f77214a.c();
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentCombineDialog f77216a;

        static {
            Covode.recordClassIndex(47744);
        }

        d(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f77216a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f77216a._$_findCachedViewById(R.id.a30);
            l.b(appCompatCheckBox, "");
            boolean isChecked = appCompatCheckBox.isChecked();
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f77216a._$_findCachedViewById(R.id.a37);
            l.b(appCompatCheckBox2, "");
            boolean isChecked2 = appCompatCheckBox2.isChecked();
            this.f77216a.a();
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f77216a._$_findCachedViewById(R.id.a30);
            l.b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(isChecked);
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) this.f77216a._$_findCachedViewById(R.id.a37);
            l.b(appCompatCheckBox4, "");
            appCompatCheckBox4.setChecked(isChecked2);
            TermsConsentCombineDialog termsConsentCombineDialog = this.f77216a;
            if (z) {
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) termsConsentCombineDialog._$_findCachedViewById(R.id.a30);
                l.b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    z2 = true;
                    termsConsentCombineDialog.f77211b = z2;
                    this.f77216a.c();
                }
            }
            z2 = false;
            termsConsentCombineDialog.f77211b = z2;
            this.f77216a.c();
        }
    }

    static final class e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentCombineDialog f77217a;

        static {
            Covode.recordClassIndex(47745);
        }

        e(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f77217a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f77217a._$_findCachedViewById(R.id.a32);
            l.b(appCompatCheckBox, "");
            boolean isChecked = appCompatCheckBox.isChecked();
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f77217a._$_findCachedViewById(R.id.a37);
            l.b(appCompatCheckBox2, "");
            boolean isChecked2 = appCompatCheckBox2.isChecked();
            this.f77217a.a();
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f77217a._$_findCachedViewById(R.id.a32);
            l.b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(isChecked);
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) this.f77217a._$_findCachedViewById(R.id.a37);
            l.b(appCompatCheckBox4, "");
            appCompatCheckBox4.setChecked(isChecked2);
            TermsConsentCombineDialog termsConsentCombineDialog = this.f77217a;
            if (z) {
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) termsConsentCombineDialog._$_findCachedViewById(R.id.a32);
                l.b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    z2 = true;
                    termsConsentCombineDialog.f77211b = z2;
                    this.f77217a.c();
                }
            }
            z2 = false;
            termsConsentCombineDialog.f77211b = z2;
            this.f77217a.c();
        }
    }

    static final class f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentCombineDialog f77218a;

        static {
            Covode.recordClassIndex(47746);
        }

        f(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f77218a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f77218a._$_findCachedViewById(R.id.a32);
            l.b(appCompatCheckBox, "");
            boolean isChecked = appCompatCheckBox.isChecked();
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f77218a._$_findCachedViewById(R.id.a30);
            l.b(appCompatCheckBox2, "");
            boolean isChecked2 = appCompatCheckBox2.isChecked();
            this.f77218a.a();
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f77218a._$_findCachedViewById(R.id.a32);
            l.b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(isChecked);
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) this.f77218a._$_findCachedViewById(R.id.a30);
            l.b(appCompatCheckBox4, "");
            appCompatCheckBox4.setChecked(isChecked2);
            this.f77218a.f77212c = z;
        }
    }
}
