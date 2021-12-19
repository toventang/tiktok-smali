package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.c;
import com.bytedance.android.livesdk.browser.a;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f14854a;

    static {
        Covode.recordClassIndex(8227);
    }

    c(b bVar) {
        this.f14854a = bVar;
    }

    public final boolean onLongClick(View view) {
        WebView webView;
        WebView.HitTestResult hitTestResult;
        b bVar = this.f14854a;
        if ((view instanceof WebView) && (hitTestResult = (webView = (WebView) view).getHitTestResult()) != null && webView.getSettings() != null && (hitTestResult.getType() == 5 || hitTestResult.getType() == 8)) {
            String extra = hitTestResult.getExtra();
            Context context = webView.getContext();
            if (!(extra == null || context == null || !a.b(extra))) {
                new c.a(context).a(extra).a(new String[]{context.getResources().getString(R.string.gtw)}, new d(bVar, context, extra)).b();
                return true;
            }
        }
        return false;
    }
}
