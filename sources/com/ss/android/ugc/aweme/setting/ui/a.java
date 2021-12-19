package com.ss.android.ugc.aweme.setting.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tiktok.security.b.h;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public C3180a f122790a;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.a$a  reason: collision with other inner class name */
    public static class C3180a {

        /* renamed from: a  reason: collision with root package name */
        public String f122791a;

        static {
            Covode.recordClassIndex(80602);
        }
    }

    static {
        Covode.recordClassIndex(80601);
    }

    public a(Context context) {
        super(context, R.style.a0z);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(8030);
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        getWindow().addFlags(67108864);
        setContentView(R.layout.az6);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        ((TextView) findViewById(R.id.title)).setText(R.string.mk);
        findViewById(R.id.qb).setOnClickListener(new b(this));
        WebView webView = (WebView) findViewById(R.id.fm8);
        String str = this.f122790a.f122791a;
        String a2 = h.f149026a.a(webView, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        webView.loadUrl(str);
        MethodCollector.o(8030);
    }
}
