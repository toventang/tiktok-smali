package com.vk.api.sdk.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.example.a.c;
import com.ss.android.ugc.tiktok.security.b.i;
import com.vk.api.sdk.R$id;
import com.vk.api.sdk.VK;
import com.vk.api.sdk.a.d;
import com.vk.api.sdk.f;
import com.vk.api.sdk.f.g;
import com.vk.api.sdk.f.h;
import com.zhiliaoapp.musically.R;
import h.a.ab;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.Map;

public class VKWebViewAuthActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public static f.b f156382c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f156383d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    WebView f156384a;

    /* renamed from: b  reason: collision with root package name */
    ProgressBar f156385b;

    /* renamed from: e  reason: collision with root package name */
    private d f156386e;

    static {
        Covode.recordClassIndex(103857);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103858);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean b() {
        if (a(getIntent(), "vk_validation_url") != null) {
            return true;
        }
        return false;
    }

    public final String c() {
        if (b()) {
            return a(getIntent(), "vk_validation_url");
        }
        d dVar = this.f156386e;
        if (dVar == null) {
            l.a("params");
        }
        return dVar.f156224c;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        WebView webView = this.f156384a;
        if (webView == null) {
            l.a("webView");
        }
        webView.destroy();
        h.b();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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

    public final void a() {
        String uri;
        MethodCollector.i(679);
        try {
            if (b()) {
                uri = a(getIntent(), "vk_validation_url");
            } else {
                Uri.Builder buildUpon = Uri.parse("https://oauth.vk.com/authorize").buildUpon();
                p[] pVarArr = new p[7];
                d dVar = this.f156386e;
                if (dVar == null) {
                    l.a("params");
                }
                pVarArr[0] = v.a("client_id", String.valueOf(dVar.f156223b));
                d dVar2 = this.f156386e;
                if (dVar2 == null) {
                    l.a("params");
                }
                pVarArr[1] = v.a("scope", n.a(dVar2.f156222a, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
                d dVar3 = this.f156386e;
                if (dVar3 == null) {
                    l.a("params");
                }
                pVarArr[2] = v.a("redirect_uri", dVar3.f156224c);
                pVarArr[3] = v.a("response_type", "token");
                pVarArr[4] = v.a("display", "mobile");
                com.vk.api.sdk.b bVar = VK.f156195a;
                if (bVar == null) {
                    l.a("config");
                }
                pVarArr[5] = v.a("v", bVar.f156232e);
                pVarArr[6] = v.a("revoke", "1");
                for (Map.Entry entry : ag.a(pVarArr).entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                uri = buildUpon.build().toString();
            }
            WebView webView = this.f156384a;
            if (webView == null) {
                l.a("webView");
            }
            String a2 = com.ss.android.ugc.tiktok.security.b.h.f149026a.a(webView, uri);
            if (!TextUtils.isEmpty(a2)) {
                uri = a2;
            }
            webView.loadUrl(uri);
            MethodCollector.o(679);
        } catch (Exception unused) {
            setResult(0);
            finish();
            MethodCollector.o(679);
        }
    }

    public final class b extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public boolean f156387a;

        static {
            Covode.recordClassIndex(103859);
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return c.a(webView, renderProcessGoneDetail);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        private final boolean a(String str) {
            Integer num;
            int i2 = 0;
            if (str != null) {
                String c2 = VKWebViewAuthActivity.this.c();
                l.a((Object) c2, "");
                if (h.m.p.b(str, c2, false)) {
                    Intent intent = new Intent("com.vk.auth-token");
                    String substring = str.substring(h.m.p.a((CharSequence) str, "#", 0, false, 6) + 1);
                    l.a((Object) substring, "");
                    intent.putExtra("extra-token-data", substring);
                    Map<String, String> a2 = g.a(substring);
                    if (a2 == null || (!a2.containsKey("error") && !a2.containsKey("cancel"))) {
                        i2 = -1;
                    }
                    VKWebViewAuthActivity.this.setResult(i2, intent);
                    if (VKWebViewAuthActivity.this.b()) {
                        Uri parse = Uri.parse(h.m.p.a(str, "#", "?"));
                        if (parse.getQueryParameter("success") != null) {
                            String queryParameter = parse.getQueryParameter("access_token");
                            String queryParameter2 = parse.getQueryParameter("secret");
                            String queryParameter3 = parse.getQueryParameter("user_id");
                            if (queryParameter3 != null) {
                                num = Integer.valueOf(Integer.parseInt(queryParameter3));
                            } else {
                                num = null;
                            }
                            VKWebViewAuthActivity.f156382c = new f.b(queryParameter2, queryParameter, num);
                        }
                    }
                    h.b();
                    VKWebViewAuthActivity.this.finish();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public static final class a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f156389a;

            static {
                Covode.recordClassIndex(103860);
            }

            a(b bVar) {
                this.f156389a = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f156389a.f156387a = false;
                VKWebViewAuthActivity.this.a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.vk.api.sdk.ui.VKWebViewAuthActivity$b$b  reason: collision with other inner class name */
        public static final class DialogInterface$OnClickListenerC4127b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f156390a;

            static {
                Covode.recordClassIndex(103861);
            }

            DialogInterface$OnClickListenerC4127b(b bVar) {
                this.f156390a = bVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                VKWebViewAuthActivity.this.setResult(0);
                VKWebViewAuthActivity.this.finish();
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (i.b(webView, str)) {
                return true;
            }
            return a(str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri uri;
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            return a(String.valueOf(uri));
        }

        private final void a(WebView webView, String str) {
            Context context;
            this.f156387a = true;
            if (webView != null) {
                context = webView.getContext();
            } else {
                context = null;
            }
            try {
                new AlertDialog.Builder(context).setMessage(str).setPositiveButton(R.string.hd4, new a(this)).setNegativeButton(17039360, new DialogInterface$OnClickListenerC4127b(this)).show();
            } catch (Exception unused) {
                VKWebViewAuthActivity.this.setResult(0);
                VKWebViewAuthActivity.this.finish();
            }
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f156387a) {
                VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
                ProgressBar progressBar = vKWebViewAuthActivity.f156385b;
                if (progressBar == null) {
                    l.a("progress");
                }
                progressBar.setVisibility(8);
                WebView webView2 = vKWebViewAuthActivity.f156384a;
                if (webView2 == null) {
                    l.a("webView");
                }
                webView2.setVisibility(0);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            a(str);
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str;
            CharSequence description;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (Build.VERSION.SDK_INT < 23 || webResourceError == null || (description = webResourceError.getDescription()) == null) {
                str = null;
            } else {
                str = description.toString();
            }
            a(webView, str);
        }

        public final void onReceivedError(WebView webView, int i2, String str, String str2) {
            super.onReceivedError(webView, i2, str, str2);
            a(webView, str);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.bkf);
        View findViewById = findViewById(R$id.webView);
        l.a((Object) findViewById, "");
        this.f156384a = (WebView) findViewById;
        View findViewById2 = findViewById(R.id.dby);
        l.a((Object) findViewById2, "");
        this.f156385b = (ProgressBar) findViewById2;
        Bundle bundleExtra = getIntent().getBundleExtra("vk_auth_params");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null) {
            if (context != null) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            int i2 = bundleExtra.getInt("vk_app_id");
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("vk_app_scope");
            if (stringArrayList != null) {
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) stringArrayList, 10));
                for (T t : stringArrayList) {
                    l.a((Object) t, "");
                    arrayList2.add(com.vk.api.sdk.a.f.valueOf(t));
                }
                arrayList = arrayList2;
            } else {
                arrayList = ab.INSTANCE;
            }
            String string = bundleExtra.getString("vk_app_redirect_url", "https://oauth.vk.com/blank.html");
            l.a((Object) string, "");
            this.f156386e = new d(i2, string, arrayList);
        } else if (!b()) {
            finish();
        }
        WebView webView = this.f156384a;
        if (webView == null) {
            l.a("webView");
        }
        b bVar = new b();
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
        webView.setWebViewClient(c.a(bVar));
        webView.setVerticalScrollBarEnabled(false);
        webView.setVisibility(4);
        webView.setOverScrollMode(2);
        WebView webView2 = this.f156384a;
        if (webView2 == null) {
            l.a("webView");
        }
        webView2.getSettings().setJavaScriptEnabled(true);
        a();
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
