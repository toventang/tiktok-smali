package com.ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.f.a.g;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.bullet.module.base.h;
import h.f.b.l;
import h.m.p;
import java.lang.ref.WeakReference;

public final class d extends com.bytedance.ies.bullet.kit.web.a.d implements WeakHandler.IHandler {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69442c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final b f69443a;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<com.bytedance.ies.uikit.dialog.b> f69444d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakHandler f69445e = new WeakHandler(this);

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.bullet.business.b f69446f;

    static {
        Covode.recordClassIndex(42807);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42808);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onGeolocationPermissionsHidePrompt() {
        com.bytedance.ies.uikit.dialog.b bVar;
        WeakReference<com.bytedance.ies.uikit.dialog.b> weakReference = this.f69444d;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            l.b(bVar, "");
            if (bVar.isShowing()) {
                bVar.dismiss();
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final Bitmap getDefaultVideoPoster() {
        Boolean b2;
        MethodCollector.i(12647);
        com.bytedance.ies.bullet.service.f.a.b b3 = this.f69446f.b();
        if (!(b3 instanceof e)) {
            b3 = null;
        }
        g gVar = (g) b3;
        if (gVar == null || (b2 = gVar.V.b()) == null || !b2.booleanValue()) {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            MethodCollector.o(12647);
            return defaultVideoPoster;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        MethodCollector.o(12647);
        return createBitmap;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final View getVideoLoadingProgressView() {
        MethodCollector.i(12778);
        Activity a2 = this.f69446f.a();
        if (!(a2 instanceof androidx.appcompat.app.d)) {
            a2 = null;
        }
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) a2;
        if (dVar != null) {
            FrameLayout frameLayout = new FrameLayout(dVar);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ProgressBar progressBar = new ProgressBar(dVar);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(progressBar, layoutParams);
            MethodCollector.o(12778);
            return frameLayout;
        }
        MethodCollector.o(12778);
        return null;
    }

    private final h a() {
        i supportFragmentManager;
        i supportFragmentManager2;
        Activity a2 = this.f69446f.a();
        Fragment fragment = null;
        if (!(a2 instanceof androidx.appcompat.app.d)) {
            a2 = null;
        }
        e eVar = (e) a2;
        if (eVar == null) {
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "activity is null, file upload failed!");
            Logger.throwException(new IllegalArgumentException("activity is null, call zhangxiang.aaron"));
        }
        if (!(eVar == null || (supportFragmentManager2 = eVar.getSupportFragmentManager()) == null)) {
            fragment = supportFragmentManager2.a("web_view_upload_file");
        }
        if (!(fragment instanceof h)) {
            fragment = new h();
            if (!(eVar == null || (supportFragmentManager = eVar.getSupportFragmentManager()) == null)) {
                supportFragmentManager.a().a(fragment, "web_view_upload_file").c();
            }
        }
        return (h) fragment;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final void a(ValueCallback<Uri> valueCallback) {
        l.d(valueCallback, "");
        a().f69454a = valueCallback;
        a().a("", "");
    }

    private final boolean b(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            if (!l.a((Object) "log_event", (Object) parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.f69445e.obtainMessage(1);
                l.b(obtainMessage, "");
                obtainMessage.obj = parse;
                this.f69445e.sendMessage(obtainMessage);
                return true;
            } catch (Exception unused) {
                z = true;
            }
        } catch (Exception unused2) {
            return z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e A[Catch:{ Exception -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f A[SYNTHETIC, Splitter:B:29:0x005f] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r12) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.module.base.d.handleMsg(android.os.Message):void");
    }

    private final boolean a(String str) {
        Boolean valueOf;
        int i2;
        boolean z;
        String[] l2;
        Integer k2;
        if (str == null) {
            return false;
        }
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.e b2 = com.ss.android.ugc.aweme.ad.b.b.b();
        if (b2 == null || (valueOf = Boolean.valueOf(b2.j())) == null) {
            return this.f69446f.d();
        }
        valueOf.booleanValue();
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.e b3 = com.ss.android.ugc.aweme.ad.b.b.b();
        if (b3 == null || (k2 = b3.k()) == null) {
            i2 = 1;
        } else {
            i2 = k2.intValue();
        }
        l.b(b.a.f65586a, "");
        com.ss.android.ugc.aweme.ad.b.e b4 = com.ss.android.ugc.aweme.ad.b.b.b();
        if (b4 != null && (l2 = b4.l()) != null) {
            int length = l2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (p.a((CharSequence) str, (CharSequence) l2[i3], false)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (this.f69446f.d() || i2 == 0 || i2 != 1 || z) {
                return false;
            }
            return true;
        }
        z = false;
        if (this.f69446f.d()) {
        }
        return false;
    }

    public d(com.bytedance.ies.bullet.c.e.a.b bVar, com.ss.android.ugc.aweme.bullet.business.b bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f69443a = bVar;
        this.f69446f = bVar2;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final void a(ValueCallback<Uri> valueCallback, String str) {
        l.d(valueCallback, "");
        l.d(str, "");
        a().f69454a = valueCallback;
        a().a(str, "");
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (!((Boolean) com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "void", false, null).first).booleanValue()) {
            com.bytedance.helios.sdk.a.a(this, new Object[]{str, callback}, 100003, "onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V");
            super.onGeolocationPermissionsShowPrompt(str, callback);
        }
    }

    public final void onConsoleMessage(String str, int i2, String str2) {
        Logger.debug();
        if (str != null && p.b(str, "bytedance://", false)) {
            b(str);
            AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f69446f.a(AdWebStatBusiness.class);
            if (adWebStatBusiness != null) {
                adWebStatBusiness.a(str);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final void a(ValueCallback<Uri> valueCallback, String str, String str2) {
        l.d(valueCallback, "");
        l.d(str, "");
        l.d(str2, "");
        a().f69454a = valueCallback;
        a().a(str, str2);
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final boolean a(WebView webView, ValueCallback<Uri[]> valueCallback, com.bytedance.ies.bullet.service.base.web.a aVar) {
        String str;
        if (aVar == null) {
            return false;
        }
        Activity a2 = this.f69446f.a();
        if (!(a2 instanceof androidx.appcompat.app.d)) {
            a2 = null;
        }
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) a2;
        if (dVar == null) {
            return false;
        }
        h a3 = a();
        String[] a4 = aVar.a();
        if (com.ss.android.ugc.aweme.utils.permission.e.a(dVar) == 0 && com.ss.android.ugc.aweme.utils.permission.e.c(dVar) == 0) {
            a3.f69455b = valueCallback;
            if (a4 == null || a4.length == 0) {
                str = "";
            } else {
                str = a4[0];
            }
            a3.a(str, "");
        } else {
            com.ss.android.ugc.aweme.ce.b.a(dVar, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new h.b(a3, valueCallback, a4));
        }
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.confirm();
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (a(str)) {
            return false;
        }
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // com.bytedance.ies.bullet.service.base.web.k
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (a(str)) {
            return false;
        }
        if (jsPromptResult == null) {
            return true;
        }
        jsPromptResult.cancel();
        return true;
    }
}
