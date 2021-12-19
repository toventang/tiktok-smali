package com.ss.android.ugc.aweme.account.login.v2.ui.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.h.a;
import com.ss.android.ugc.aweme.account.login.v2.a.x;
import com.ss.android.ugc.aweme.account.login.v2.base.k;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Objects;

public final class w extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f65016a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f65017b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f65018c;

    /* renamed from: d  reason: collision with root package name */
    public int f65019d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f65020e;

    /* renamed from: j  reason: collision with root package name */
    public String f65021j = "";

    /* renamed from: k  reason: collision with root package name */
    private int f65022k = k.TERMS_CONSENT_SIGN_UP.getValue();

    /* renamed from: l  reason: collision with root package name */
    private AuthResult f65023l;

    /* renamed from: m  reason: collision with root package name */
    private HashMap f65024m;

    static {
        Covode.recordClassIndex(39971);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c
    public final void a(int i2, String str) {
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final View c(int i2) {
        if (this.f65024m == null) {
            this.f65024m = new HashMap();
        }
        View view = (View) this.f65024m.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f65024m.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final int d() {
        return R.layout.hu;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void h() {
        HashMap hashMap = this.f65024m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        h();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final com.ss.android.ugc.aweme.account.login.v2.ui.b p() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final void s() {
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f65046a;

        static {
            Covode.recordClassIndex(39979);
        }

        h(w wVar) {
            this.f65046a = wVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f65046a.f65020e) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f65046a.getContext()).a(R.string.ar_).a();
                return;
            }
            if (this.f65046a.f65017b) {
                this.f65046a.getContext();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = a();
                }
                if (!j.f107229h) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.f65046a.getContext()).a(R.string.de8).a();
                    return;
                } else {
                    this.f65046a.f65019d = -1;
                    this.f65046a.e();
                }
            } else if (this.f65046a.V_() == k.TERMS_CONSENT_SIGN_UP) {
                w wVar = this.f65046a;
                Bundle arguments = wVar.getArguments();
                if (arguments == null) {
                    l.b();
                }
                arguments.putInt("next_page", k.PHONE_EMAIL_SIGN_UP.getValue());
                l.b(arguments, "");
                wVar.a(arguments);
            } else if (this.f65046a.V_() == k.TERMS_CONSENT_NEW_PHONE_USER) {
                a.C1412a b2 = com.ss.android.ugc.aweme.account.login.v2.base.e.b(this.f65046a);
                w wVar2 = this.f65046a;
                String a2 = com.ss.android.ugc.aweme.account.login.h.a.a(b2);
                l.b(a2, "");
                x.a(wVar2, a2, this.f65046a.f65021j, com.ss.android.ugc.aweme.account.login.v2.base.j.SIGN_UP, this.f65046a.V_()).c();
            }
            r.a("register_terms_click_next", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.f65046a.w()).a("enter_method", this.f65046a.x()).a("platform", this.f65046a.f65016a).f62575a);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.base.c, com.ss.android.ugc.aweme.account.login.v2.ui.a.a
    public final boolean q() {
        if (!this.f65017b || this.f65018c) {
            return super.q();
        }
        this.f65019d = 0;
        e();
        return true;
    }

    public final void e() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        l.b(arguments, "");
        arguments.putInt("next_page", k.FINISH.getValue());
        arguments.putInt("result_code", this.f65019d);
        arguments.putInt("current_page", k.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
        a(arguments);
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f65045a;

        static {
            Covode.recordClassIndex(39978);
        }

        g(w wVar) {
            this.f65045a = wVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f65045a.f65017b || this.f65045a.f65018c) {
                try {
                    androidx.fragment.app.e activity = this.f65045a.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                this.f65045a.f65019d = 0;
                this.f65045a.e();
            }
        }
    }

    public final void a(boolean z) {
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) c(R.id.zx);
            Context context = getContext();
            if (context == null) {
                l.b();
            }
            tuxTextView.setTextColor(androidx.core.content.b.c(context, R.color.f159928l));
            TuxTextView tuxTextView2 = (TuxTextView) c(R.id.zx);
            l.b(tuxTextView2, "");
            Context context2 = getContext();
            if (context2 == null) {
                l.b();
            }
            tuxTextView2.setBackground(androidx.core.content.b.a(context2, (int) R.drawable.ii));
            com.bytedance.ies.dmt.ui.f.c.a(c(R.id.zx), 0.5f);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) c(R.id.zx);
        Context context3 = getContext();
        if (context3 == null) {
            l.b();
        }
        tuxTextView3.setTextColor(androidx.core.content.b.c(context3, R.color.bz));
        TuxTextView tuxTextView4 = (TuxTextView) c(R.id.zx);
        l.b(tuxTextView4, "");
        Context context4 = getContext();
        if (context4 == null) {
            l.b();
        }
        tuxTextView4.setBackground(androidx.core.content.b.a(context4, (int) R.drawable.kv));
        com.bytedance.ies.dmt.ui.f.c.a(c(R.id.zx), 1.0f);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String string;
        AuthResult authResult;
        int value;
        String str2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z2 = true;
        if (V_() == k.TERMS_CONSENT_SIGN_UP_THIRD_PARTY) {
            z = true;
        } else {
            z = false;
        }
        this.f65017b = z;
        String str3 = "";
        if (z) {
            if (arguments != null) {
                authResult = (AuthResult) arguments.getParcelable("key_auth_result");
            } else {
                authResult = null;
            }
            this.f65023l = authResult;
            if (!(authResult == null || (str2 = authResult.f40150d) == null)) {
                str3 = str2;
            }
            this.f65016a = str3;
            int value2 = k.THIRD_PARTY_AGE_GATE.getValue();
            if (arguments != null) {
                value = arguments.getInt("previous_page", k.NONE.getValue());
            } else {
                value = k.NONE.getValue();
            }
            if (value2 != value) {
                z2 = false;
            }
            this.f65018c = z2;
        } else {
            this.f65022k = V_().getValue();
            if (!(arguments == null || (string = arguments.getString("sms_code_key", str3)) == null)) {
                str3 = string;
            }
            this.f65021j = str3;
            if (this.f65022k == k.TERMS_CONSENT_NEW_PHONE_USER.getValue()) {
                str = "sms_verification";
            } else {
                str = "phone";
            }
            this.f65016a = str;
        }
        r.a("register_terms_show", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", w()).a("enter_method", x()).a("platform", this.f65016a).f62575a);
    }

    static final class e implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f65043a = new e();

        static {
            Covode.recordClassIndex(39976);
        }

        e() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            ((WebView) view).requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    static final class f implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public static final f f65044a = new f();

        static {
            Covode.recordClassIndex(39977);
        }

        f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.webkit.WebView");
            ((WebView) view).requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    private static void a(WebView webView, String str) {
        MethodCollector.i(9989);
        String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(9989);
    }

    static final class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f65025a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65027c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65028d;

        static {
            Covode.recordClassIndex(39972);
        }

        a(w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f65025a = wVar;
            this.f65026b = appCompatCheckBox;
            this.f65027c = appCompatCheckBox2;
            this.f65028d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            this.f65026b.setChecked(z);
            this.f65027c.setChecked(z);
            this.f65028d.setChecked(z);
            w wVar = this.f65025a;
            if (!this.f65026b.isChecked() || !this.f65027c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            wVar.f65020e = z2;
            w wVar2 = this.f65025a;
            wVar2.a(wVar2.f65020e);
            this.f65025a.a("total", z);
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

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f65029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65030b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65031c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65032d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65033e;

        static {
            Covode.recordClassIndex(39973);
        }

        b(w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3, AppCompatCheckBox appCompatCheckBox4) {
            this.f65029a = wVar;
            this.f65030b = appCompatCheckBox;
            this.f65031c = appCompatCheckBox2;
            this.f65032d = appCompatCheckBox3;
            this.f65033e = appCompatCheckBox4;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f65030b.isChecked();
            boolean isChecked2 = this.f65031c.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f65032d;
            boolean z3 = true;
            if (!z || !this.f65030b.isChecked() || !this.f65031c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f65030b.setChecked(isChecked);
            this.f65031c.setChecked(isChecked2);
            w wVar = this.f65029a;
            if (!this.f65033e.isChecked() || !this.f65030b.isChecked()) {
                z3 = false;
            }
            wVar.f65020e = z3;
            w wVar2 = this.f65029a;
            wVar2.a(wVar2.f65020e);
            this.f65029a.a("single", z);
        }
    }

    static final class c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f65034a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65036c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65037d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65038e;

        static {
            Covode.recordClassIndex(39974);
        }

        c(w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3, AppCompatCheckBox appCompatCheckBox4) {
            this.f65034a = wVar;
            this.f65035b = appCompatCheckBox;
            this.f65036c = appCompatCheckBox2;
            this.f65037d = appCompatCheckBox3;
            this.f65038e = appCompatCheckBox4;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            boolean isChecked = this.f65035b.isChecked();
            boolean isChecked2 = this.f65036c.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f65037d;
            boolean z3 = true;
            if (!z || !this.f65035b.isChecked() || !this.f65036c.isChecked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            appCompatCheckBox.setChecked(z2);
            this.f65035b.setChecked(isChecked);
            this.f65036c.setChecked(isChecked2);
            w wVar = this.f65034a;
            if (!this.f65035b.isChecked() || !this.f65038e.isChecked()) {
                z3 = false;
            }
            wVar.f65020e = z3;
            w wVar2 = this.f65034a;
            wVar2.a(wVar2.f65020e);
            this.f65034a.a("single", z);
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f65039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65041c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AppCompatCheckBox f65042d;

        static {
            Covode.recordClassIndex(39975);
        }

        d(w wVar, AppCompatCheckBox appCompatCheckBox, AppCompatCheckBox appCompatCheckBox2, AppCompatCheckBox appCompatCheckBox3) {
            this.f65039a = wVar;
            this.f65040b = appCompatCheckBox;
            this.f65041c = appCompatCheckBox2;
            this.f65042d = appCompatCheckBox3;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i2;
            boolean z2 = true;
            if (this.f65039a.getActivity() instanceof SignUpOrLoginActivity) {
                androidx.fragment.app.e activity = this.f65039a.getActivity();
                Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
                SignUpOrLoginActivity signUpOrLoginActivity = (SignUpOrLoginActivity) activity;
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                signUpOrLoginActivity.f64776b = i2;
            }
            boolean isChecked = this.f65040b.isChecked();
            boolean isChecked2 = this.f65041c.isChecked();
            AppCompatCheckBox appCompatCheckBox = this.f65042d;
            if (!z || !this.f65040b.isChecked() || !this.f65041c.isChecked()) {
                z2 = false;
            }
            appCompatCheckBox.setChecked(z2);
            this.f65040b.setChecked(isChecked);
            this.f65041c.setChecked(isChecked2);
        }
    }

    public final void a(String str, boolean z) {
        int i2;
        com.ss.android.ugc.aweme.account.a.b.a a2 = new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", w()).a("enter_method", x()).a("platform", this.f65016a).a("content", str);
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        r.a("register_terms_click", a2.a("click_type", i2).f62575a);
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String b2;
        String c2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) c(R.id.epx);
        l.b(tuxTextView, "");
        if (TextUtils.isEmpty(com.ss.android.ugc.aweme.account.login.g.c.b())) {
            b2 = getString(R.string.fb6);
        } else {
            b2 = com.ss.android.ugc.aweme.account.login.g.c.b();
        }
        tuxTextView.setText(b2);
        TuxTextView tuxTextView2 = (TuxTextView) c(R.id.epw);
        l.b(tuxTextView2, "");
        if (TextUtils.isEmpty(com.ss.android.ugc.aweme.account.login.g.c.c())) {
            c2 = getString(R.string.fb5);
        } else {
            c2 = com.ss.android.ugc.aweme.account.login.g.c.c();
        }
        tuxTextView2.setText(c2);
        if (getActivity() instanceof SignUpOrLoginActivity) {
            androidx.fragment.app.e activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity");
            ((SignUpOrLoginActivity) activity).f64776b = 1;
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) c(R.id.a3e);
        l.b(appCompatCheckBox, "");
        AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) c(R.id.a3g);
        l.b(appCompatCheckBox2, "");
        AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) c(R.id.a3f);
        l.b(appCompatCheckBox3, "");
        AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) c(R.id.a3d);
        l.b(appCompatCheckBox4, "");
        appCompatCheckBox.setOnCheckedChangeListener(new a(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox4));
        appCompatCheckBox2.setOnCheckedChangeListener(new b(this, appCompatCheckBox3, appCompatCheckBox4, appCompatCheckBox, appCompatCheckBox2));
        appCompatCheckBox3.setOnCheckedChangeListener(new c(this, appCompatCheckBox2, appCompatCheckBox4, appCompatCheckBox, appCompatCheckBox3));
        appCompatCheckBox4.setOnCheckedChangeListener(new d(this, appCompatCheckBox2, appCompatCheckBox3, appCompatCheckBox));
        String b3 = com.ss.android.ugc.aweme.account.login.g.c.f63458a.b();
        l.b(b3, "");
        String c3 = com.ss.android.ugc.aweme.account.login.g.c.f63458a.c();
        l.b(c3, "");
        WebView webView = (WebView) c(R.id.fnh);
        l.b(webView, "");
        a(webView, new com.ss.android.ugc.aweme.account.login.g.d(getActivity()));
        WebView webView2 = (WebView) c(R.id.fnh);
        l.b(webView2, "");
        webView2.setWebChromeClient(new WebChromeClient());
        WebView webView3 = (WebView) c(R.id.fnh);
        l.b(webView3, "");
        WebSettings settings = webView3.getSettings();
        l.b(settings, "");
        settings.setJavaScriptEnabled(true);
        WebView webView4 = (WebView) c(R.id.fnh);
        l.b(webView4, "");
        WebSettings settings2 = webView4.getSettings();
        l.b(settings2, "");
        settings2.setDomStorageEnabled(true);
        a((WebView) c(R.id.fnh), b3);
        ((WebView) c(R.id.fnh)).setOnTouchListener(e.f65043a);
        WebView webView5 = (WebView) c(R.id.fng);
        l.b(webView5, "");
        a(webView5, new com.ss.android.ugc.aweme.account.login.g.d(getActivity()));
        WebView webView6 = (WebView) c(R.id.fng);
        l.b(webView6, "");
        webView6.setWebChromeClient(new WebChromeClient());
        WebView webView7 = (WebView) c(R.id.fng);
        l.b(webView7, "");
        WebSettings settings3 = webView7.getSettings();
        l.b(settings3, "");
        settings3.setJavaScriptEnabled(true);
        WebView webView8 = (WebView) c(R.id.fng);
        l.b(webView8, "");
        WebSettings settings4 = webView8.getSettings();
        l.b(settings4, "");
        settings4.setDomStorageEnabled(true);
        a((WebView) c(R.id.fng), c3);
        ((WebView) c(R.id.fng)).setOnTouchListener(f.f65044a);
        com.bytedance.ies.dmt.ui.f.c.a(c(R.id.c20), 0.5f);
        a(c(R.id.c20), new g(this));
        a(this.f65020e);
        a(c(R.id.zx), new h(this));
    }
}
