package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.sdk.webview.k;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.commercialize.utils.ak;
import com.ss.android.ugc.aweme.crossplatform.activity.m;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.o;
import com.ss.android.ugc.aweme.utils.permission.e;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SingleWebChromeClient extends b {

    /* renamed from: a  reason: collision with root package name */
    private o f78856a;

    /* renamed from: e  reason: collision with root package name */
    public k f78857e;

    /* renamed from: f  reason: collision with root package name */
    public m f78858f;

    /* renamed from: g  reason: collision with root package name */
    public final List<f> f78859g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.ax.a.k f78860h;

    /* renamed from: i  reason: collision with root package name */
    public f f78861i = new a(this);

    static {
        Covode.recordClassIndex(48923);
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            l.d(str, "");
            l.d(callback, "");
        }
    }

    public void onGeolocationPermissionsHidePrompt() {
        k kVar = this.f78857e;
        if (kVar != null) {
            kVar.c();
        }
    }

    public void onHideCustomView() {
        super.onHideCustomView();
        this.f78861i.a();
    }

    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SingleWebChromeClient f78862a;

        static {
            Covode.recordClassIndex(48924);
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a() {
            Iterator<T> it = this.f78862a.f78859g.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(SingleWebChromeClient singleWebChromeClient) {
            this.f78862a = singleWebChromeClient;
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Iterator<T> it = this.f78862a.f78859g.iterator();
            while (it.hasNext()) {
                it.next().a(view, customViewCallback);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a(WebView webView, int i2) {
            Iterator<T> it = this.f78862a.f78859g.iterator();
            while (it.hasNext()) {
                it.next().a(webView, i2);
            }
        }

        @Override // com.ss.android.ugc.aweme.crossplatform.platform.webview.f
        public final void a(WebView webView, String str) {
            Iterator<T> it = this.f78862a.f78859g.iterator();
            while (it.hasNext()) {
                it.next().a(webView, str);
            }
        }
    }

    public Bitmap getDefaultVideoPoster() {
        com.ss.android.ugc.aweme.crossplatform.d.a.a crossPlatformParams;
        com.ss.android.ugc.aweme.crossplatform.d.a aVar;
        MethodCollector.i(12989);
        m mVar = this.f78858f;
        if (mVar == null || (crossPlatformParams = mVar.getCrossPlatformParams()) == null || (aVar = crossPlatformParams.f78741a) == null || !aVar.n) {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            MethodCollector.o(12989);
            return defaultVideoPoster;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        MethodCollector.o(12989);
        return createBitmap;
    }

    public View getVideoLoadingProgressView() {
        MethodCollector.i(12890);
        m mVar = this.f78858f;
        Context context = null;
        if (mVar == null || mVar.getContext() == null) {
            MethodCollector.o(12890);
            return null;
        }
        m mVar2 = this.f78858f;
        if (mVar2 == null || (context = mVar2.getContext()) == null) {
            l.b();
        }
        l.b(context, "");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        MethodCollector.o(12890);
        return frameLayout;
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback) {
        l.d(valueCallback, "");
        this.f78856a.f78909a = valueCallback;
        this.f78856a.a("", "");
    }

    private static d a(Context context) {
        if (context == null) {
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof d) {
                return (d) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public SingleWebChromeClient(WebView webView) {
        Fragment fragment;
        i supportFragmentManager;
        i supportFragmentManager2;
        l.d(webView, "");
        d a2 = a(webView.getContext());
        if (a2 == null || (supportFragmentManager2 = a2.getSupportFragmentManager()) == null) {
            fragment = null;
        } else {
            fragment = supportFragmentManager2.a("web_view_upload_file");
        }
        if (!(fragment instanceof o)) {
            this.f78856a = new o();
            if (a2 != null && (supportFragmentManager = a2.getSupportFragmentManager()) != null) {
                supportFragmentManager.a().a(this.f78856a, "web_view_upload_file").c();
                return;
            }
            return;
        }
        this.f78856a = (o) fragment;
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        this.f78861i.a(view, customViewCallback);
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        l.d(valueCallback, "");
        l.d(str, "");
        this.f78856a.f78909a = valueCallback;
        this.f78856a.a(str, "");
    }

    public void onProgressChanged(WebView webView, int i2) {
        g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onProgressChanged(webView, i2);
        com.ss.android.ugc.aweme.ax.a.k kVar = this.f78860h;
        if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            mVar.a(webView, i2);
        }
        this.f78861i.a(webView, i2);
        com.ss.android.ugc.aweme.crossplatform.c.a.a().a(webView, i2);
        m mVar2 = this.f78858f;
        if (mVar2 != null && (crossPlatformBusiness = mVar2.getCrossPlatformBusiness()) != null && (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.a(webView, i2);
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        com.ss.android.ugc.aweme.ax.a.m mVar;
        super.onReceivedTitle(webView, str);
        m mVar2 = this.f78858f;
        if (mVar2 != null) {
            mVar2.a(str, false);
        }
        com.ss.android.ugc.aweme.ax.a.k kVar = this.f78860h;
        if (!(kVar == null || (mVar = (com.ss.android.ugc.aweme.ax.a.m) kVar.a(com.ss.android.ugc.aweme.ax.a.m.class)) == null)) {
            mVar.e();
        }
        this.f78861i.a(webView, str);
    }

    public void onConsoleMessage(String str, int i2, String str2) {
        g crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        Logger.debug();
        try {
            k kVar = this.f78857e;
            if (kVar != null) {
                kVar.b(str);
            }
            m mVar = this.f78858f;
            if (!(mVar == null || (crossPlatformBusiness = mVar.getCrossPlatformBusiness()) == null || (adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class)) == null)) {
                adWebStatBusiness.a(str);
            }
            ak.f75577a.a(str);
        } catch (Exception unused) {
        }
    }

    public final void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        l.d(valueCallback, "");
        l.d(str, "");
        l.d(str2, "");
        this.f78856a.f78909a = valueCallback;
        this.f78856a.a(str, str2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Context context;
        Context context2;
        String str;
        if (fileChooserParams == null) {
            return false;
        }
        Context context3 = null;
        if (webView != null) {
            context = webView.getContext();
        } else {
            context = null;
        }
        if (a(context) == null) {
            return false;
        }
        o oVar = this.f78856a;
        if (webView != null) {
            context2 = webView.getContext();
        } else {
            context2 = null;
        }
        if (e.a(context2) == 0) {
            if (webView != null) {
                context3 = webView.getContext();
            }
            if (e.c(context3) == 0) {
                oVar.f78910b = valueCallback;
                String[] acceptTypes = fileChooserParams.getAcceptTypes();
                l.b(acceptTypes, "");
                if (acceptTypes.length == 0) {
                    str = "";
                } else {
                    str = fileChooserParams.getAcceptTypes()[0];
                }
                oVar.a(str, "");
                return true;
            }
        }
        b.a(oVar.getActivity(), new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new o.b(oVar, valueCallback, fileChooserParams));
        return true;
    }
}
