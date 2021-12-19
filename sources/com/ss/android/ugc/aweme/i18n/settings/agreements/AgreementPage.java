package com.ss.android.ugc.aweme.i18n.settings.agreements;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.web.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;

@com.bytedance.ies.powerpage.a.a
public final class AgreementPage extends com.ss.android.ugc.aweme.setting.page.a implements View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    public static final a f99936j = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    public WebView f99937e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f99938f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f99939g;

    /* renamed from: h  reason: collision with root package name */
    public View f99940h;

    /* renamed from: i  reason: collision with root package name */
    public View f99941i;

    /* renamed from: k  reason: collision with root package name */
    private SparseArray f99942k;

    static {
        Covode.recordClassIndex(63690);
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final View a(int i2) {
        if (this.f99942k == null) {
            this.f99942k = new SparseArray();
        }
        View view = (View) this.f99942k.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f99942k.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final void br_() {
        SparseArray sparseArray = this.f99942k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, com.ss.android.ugc.aweme.setting.page.a
    public final int c() {
        return R.layout.axw;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63691);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WebView webView = this.f99937e;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebView webView = this.f99937e;
        if (webView != null) {
            webView.onResume();
        }
    }

    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AgreementPage f99943a;

        static {
            Covode.recordClassIndex(63692);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AgreementPage agreementPage) {
            this.f99943a = agreementPage;
        }

        public final void onPageFinished(WebView webView, String str) {
            l.d(webView, "");
            l.d(str, "");
            super.onPageFinished(webView, str);
            View view = this.f99943a.f99940h;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            l.d(webView, "");
            l.d(str, "");
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            String scheme = parse.getScheme();
            if (scheme != null) {
                Locale locale = Locale.getDefault();
                l.b(locale, "");
                Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
                str2 = scheme.toLowerCase(locale);
                l.b(str2, "");
            } else {
                str2 = null;
            }
            if (!l.a((Object) "market", (Object) str2)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(268435456);
            Context context = webView.getContext();
            com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
            context.startActivity(intent);
            return true;
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        h();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.setting.page.a
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
