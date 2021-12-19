package com.ss.android.ugc.aweme.account.base.a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.example.a.c;
import com.ss.android.ugc.aweme.account.util.o;
import com.ss.android.ugc.tiktok.security.b.h;
import com.ss.android.ugc.tiktok.security.c.b;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public C1386a f62885a;

    static {
        Covode.recordClassIndex(38741);
    }

    private a(Context context) {
        super(context, R.style.ul);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.base.a.a$a  reason: collision with other inner class name */
    public static class C1386a {

        /* renamed from: a  reason: collision with root package name */
        public String f62886a;

        /* renamed from: b  reason: collision with root package name */
        public String f62887b;

        static {
            Covode.recordClassIndex(38742);
        }

        public final a a(Context context) {
            a aVar = new a(context, (byte) 0);
            aVar.f62885a = this;
            return aVar;
        }
    }

    public static Dialog a(Context context) {
        C1386a aVar = new C1386a();
        aVar.f62886a = o.a("terms-of-use");
        return aVar.a(context);
    }

    public static Dialog b(Context context) {
        C1386a aVar = new C1386a();
        aVar.f62886a = o.a("privacy-policy");
        return aVar.a(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(8411);
        super.onCreate(bundle);
        if (getWindow() != null) {
            Context context = getContext();
            if ((TextUtils.equals("oppo", Build.BRAND.toLowerCase()) && context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism")) || com.ss.android.ugc.aweme.account.a.a.a.a() || com.ss.android.ugc.aweme.account.a.a.a.a(context)) {
                getWindow().clearFlags(1024);
            }
            getWindow().requestFeature(1);
        }
        try {
            setContentView(R.layout.h4);
        } catch (Resources.NotFoundException e2) {
            e2.printStackTrace();
        }
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(-1, -1);
        }
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f62885a.f62887b)) {
            textView.setText(this.f62885a.f62887b);
        } else {
            textView.setText(R.string.a22);
        }
        findViewById(R.id.qb).setOnClickListener(new b(this));
        WebView webView = (WebView) findViewById(R.id.fm8);
        webView.getSettings().setJavaScriptEnabled(true);
        WebViewClient webViewClient = new WebViewClient();
        if (b.a()) {
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
        webView.setWebViewClient(c.a(webViewClient));
        String str = this.f62885a.f62886a;
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(8411);
    }

    /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
