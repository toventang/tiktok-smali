package com.ss.android.ugc.aweme.compliance.business.termspp;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.TermsConsentInfo;
import com.ss.android.ugc.tiktok.security.b.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class TermsConsentDialog extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f77225b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f77226a;

    /* renamed from: c  reason: collision with root package name */
    private SparseArray f77227c;

    static {
        Covode.recordClassIndex(47760);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f77227c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f77227c == null) {
            this.f77227c = new SparseArray();
        }
        View view = (View) this.f77227c.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f77227c.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47761);
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

    public static void a(String str) {
        r.a(str, new com.ss.android.ugc.aweme.app.f.d().f66730a);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentDialog f77240a;

        static {
            Covode.recordClassIndex(47765);
        }

        e(TermsConsentDialog termsConsentDialog) {
            this.f77240a = termsConsentDialog;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                if (this.f77240a.f77226a) {
                    com.ss.android.ugc.aweme.compliance.business.policynotice.a.a aVar = new com.ss.android.ugc.aweme.compliance.business.policynotice.a.a();
                    TermsConsentInfo o = com.ss.android.ugc.aweme.compliance.common.b.o();
                    if (o != null) {
                        str = o.getBusiness();
                    } else {
                        str = null;
                    }
                    aVar.a(str, null, null, null, null, 0, AnonymousClass1.f77241a);
                    TermsConsentDialog.a("qa_kr_terms_dialog_confirm_click");
                    this.f77240a.finish();
                    a.C0732a.f33434a.a(b.a.TERMS_CONSENT);
                    return;
                }
                new com.bytedance.tux.g.b(this.f77240a).e(R.string.ar_).b();
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.zx);
            l.b(tuxTextView, "");
            ((TuxTextView) _$_findCachedViewById(R.id.zx)).setTextColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.a9));
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.zx);
            l.b(tuxTextView2, "");
            tuxTextView2.setBackground(androidx.core.content.b.a(this, (int) R.drawable.a2u));
            com.bytedance.ies.dmt.ui.f.c.a(_$_findCachedViewById(R.id.zx), 0.5f);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.zx);
        l.b(tuxTextView3, "");
        ((TuxTextView) _$_findCachedViewById(R.id.zx)).setTextColor(androidx.core.content.b.c(tuxTextView3.getContext(), R.color.bz));
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.zx);
        l.b(tuxTextView4, "");
        tuxTextView4.setBackground(androidx.core.content.b.a(this, (int) R.drawable.a2y));
        com.bytedance.ies.dmt.ui.f.c.a(_$_findCachedViewById(R.id.zx), 1.0f);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u8);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.c();
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.f99);
        l.b(tuxTextView, "");
        TermsConsentInfo o = com.ss.android.ugc.aweme.compliance.common.b.o();
        String str5 = null;
        if (o != null) {
            str5 = o.getTitle();
        }
        if (str5 == null || str5.length() == 0 || str5 == null) {
            str5 = getString(R.string.arb);
        }
        tuxTextView.setText(str5);
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.f98);
        l.b(tuxTextView2, "");
        TermsConsentInfo o2 = com.ss.android.ugc.aweme.compliance.common.b.o();
        if (o2 == null || (str = o2.getDescription()) == null || str.length() == 0 || str == null) {
            str = getString(R.string.cu_);
        }
        tuxTextView2.setText(str);
        TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.f98);
        l.b(tuxTextView3, "");
        tuxTextView3.setBackground(new ColorDrawable(-1));
        TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.f95);
        l.b(tuxTextView4, "");
        TermsConsentInfo o3 = com.ss.android.ugc.aweme.compliance.common.b.o();
        if (o3 == null || (str2 = o3.getCheckboxAll()) == null || str2.length() == 0 || str2 == null) {
            str2 = getString(R.string.ar7);
        }
        tuxTextView4.setText(str2);
        TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.f97);
        l.b(tuxTextView5, "");
        TermsConsentInfo o4 = com.ss.android.ugc.aweme.compliance.common.b.o();
        if (o4 == null || (str3 = o4.getCheckboxTerms()) == null || str3.length() == 0 || str3 == null) {
            str3 = getString(R.string.at9);
        }
        tuxTextView5.setText(str3);
        TuxTextView tuxTextView6 = (TuxTextView) _$_findCachedViewById(R.id.f96);
        l.b(tuxTextView6, "");
        TermsConsentInfo o5 = com.ss.android.ugc.aweme.compliance.common.b.o();
        if (o5 == null || (str4 = o5.getCheckboxPP()) == null || str4.length() == 0 || str4 == null) {
            str4 = getString(R.string.at3);
        }
        tuxTextView6.setText(str4);
        TuxTextView tuxTextView7 = (TuxTextView) _$_findCachedViewById(R.id.zx);
        l.b(tuxTextView7, "");
        tuxTextView7.setText(getString(R.string.cua));
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) _$_findCachedViewById(R.id.a3e);
        l.b(appCompatCheckBox, "");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a3g);
        l.b(appCompatCheckBox2, "");
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a3f);
        l.b(appCompatCheckBox3, "");
        appCompatCheckBox.setOnCheckedChangeListener(new b(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox));
        appCompatCheckBox2.setOnCheckedChangeListener(new c(this, appCompatCheckBox3, appCompatCheckBox, appCompatCheckBox2));
        appCompatCheckBox3.setOnCheckedChangeListener(new d(this, appCompatCheckBox2, appCompatCheckBox, appCompatCheckBox3));
        String m2 = com.ss.android.ugc.aweme.compliance.common.b.m();
        String n = com.ss.android.ugc.aweme.compliance.common.b.n();
        if (!(m2 == null || m2.length() == 0)) {
            WebView webView = (WebView) _$_findCachedViewById(R.id.fnh);
            l.b(webView, "");
            a(webView, m2);
        }
        if (!(n == null || n.length() == 0)) {
            WebView webView2 = (WebView) _$_findCachedViewById(R.id.fng);
            l.b(webView2, "");
            a(webView2, n);
        }
        ((TuxTextView) _$_findCachedViewById(R.id.zx)).setOnClickListener(new e(this));
        a("qa_kr_terms_dialog_show");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentDialog", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f77242a = new f();

        static {
            Covode.recordClassIndex(47767);
        }

        f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            ((WebView) view).requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    private static void b(WebView webView, String str) {
        MethodCollector.i(6475);
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(6475);
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentDialog f77228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77229b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77230c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77231d;

        static {
            Covode.recordClassIndex(47762);
        }

        b(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f77228a = termsConsentDialog;
            this.f77229b = appCompatCheckBox;
            this.f77230c = appCompatCheckBox2;
            this.f77231d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            this.f77229b.setChecked(z);
            this.f77230c.setChecked(z);
            TermsConsentDialog termsConsentDialog = this.f77228a;
            if (!this.f77231d.isChecked() || !this.f77229b.isChecked() || !this.f77230c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            termsConsentDialog.f77226a = z2;
            TermsConsentDialog termsConsentDialog2 = this.f77228a;
            termsConsentDialog2.a(termsConsentDialog2.f77226a);
        }
    }

    private static void a(WebView webView, WebViewClient webViewClient) {
        if (com.ss.android.ugc.tiktok.security.c.b.a()) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains("BytedanceWebview/d8a21c6")) {
                StringBuilder sb = new StringBuilder(userAgentString);
                if (!TextUtils.isEmpty(sb)) {
                    sb.append(" ");
                }
                sb.append("BytedanceWebview/d8a21c6");
                settings.setUserAgentString(sb.toString());
            }
        }
        webView.setWebViewClient(com.example.a.c.a(webViewClient));
    }

    static final class c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentDialog f77232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77234c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77235d;

        static {
            Covode.recordClassIndex(47763);
        }

        c(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f77232a = termsConsentDialog;
            this.f77233b = appCompatCheckBox;
            this.f77234c = appCompatCheckBox2;
            this.f77235d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f77233b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f77234c;
            boolean z3 = true;
            if (!z || !this.f77233b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f77233b.setChecked(isChecked);
            TermsConsentDialog termsConsentDialog = this.f77232a;
            if (!this.f77234c.isChecked() || !this.f77235d.isChecked() || !this.f77233b.isChecked()) {
                z3 = false;
            }
            termsConsentDialog.f77226a = z3;
            TermsConsentDialog termsConsentDialog2 = this.f77232a;
            termsConsentDialog2.a(termsConsentDialog2.f77226a);
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TermsConsentDialog f77236a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77237b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77238c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f77239d;

        static {
            Covode.recordClassIndex(47764);
        }

        d(TermsConsentDialog termsConsentDialog, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f77236a = termsConsentDialog;
            this.f77237b = appCompatCheckBox;
            this.f77238c = appCompatCheckBox2;
            this.f77239d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f77237b.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f77238c;
            boolean z3 = true;
            if (!z || !this.f77237b.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f77237b.setChecked(isChecked);
            TermsConsentDialog termsConsentDialog = this.f77236a;
            if (!this.f77238c.isChecked() || !this.f77237b.isChecked() || !this.f77239d.isChecked()) {
                z3 = false;
            }
            termsConsentDialog.f77226a = z3;
            TermsConsentDialog termsConsentDialog2 = this.f77236a;
            termsConsentDialog2.a(termsConsentDialog2.f77226a);
        }
    }

    private final void a(WebView webView, String str) {
        a(webView, new d(this));
        webView.setWebChromeClient(new WebChromeClient());
        WebSettings settings = webView.getSettings();
        l.b(settings, "");
        settings.setJavaScriptEnabled(true);
        WebSettings settings2 = webView.getSettings();
        l.b(settings2, "");
        settings2.setDomStorageEnabled(true);
        b(webView, str);
        webView.setOnTouchListener(f.f77242a);
    }
}
