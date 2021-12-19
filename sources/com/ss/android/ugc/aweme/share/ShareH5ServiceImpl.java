package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareSearchMethod;
import com.ss.android.ugc.aweme.bullet.business.AbsShareBusiness;
import com.ss.android.ugc.aweme.bullet.business.ShareBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.business.i;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.PushOperationMethod;
import com.ss.android.ugc.aweme.fe.method.ShareLiveEventMethod;
import com.ss.android.ugc.aweme.fe.method.ShareMethod;
import com.ss.android.ugc.b;
import com.ss.android.ugc.tiktok.security.b.h;
import h.a.ag;
import h.f.b.l;
import h.p;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class ShareH5ServiceImpl implements ShareH5Service {
    static {
        Covode.recordClassIndex(80967);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final String a() {
        return "share";
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final String b() {
        return "shareLiveEvent";
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final String c() {
        return "pushOperation";
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final boolean a(WeakReference<Context> weakReference, JSONObject jSONObject) {
        l.d(weakReference, "");
        l.d(jSONObject, "");
        ShareMethod shareMethod = new ShareMethod();
        l.d(weakReference, "");
        l.d(jSONObject, "");
        return shareMethod.a(weakReference, jSONObject, null, null, null);
    }

    public static ShareH5Service d() {
        MethodCollector.i(5272);
        Object a2 = b.a(ShareH5Service.class, false);
        if (a2 != null) {
            ShareH5Service shareH5Service = (ShareH5Service) a2;
            MethodCollector.o(5272);
            return shareH5Service;
        }
        if (b.dW == null) {
            synchronized (ShareH5Service.class) {
                try {
                    if (b.dW == null) {
                        b.dW = new ShareH5ServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5272);
                    throw th;
                }
            }
        }
        ShareH5ServiceImpl shareH5ServiceImpl = (ShareH5ServiceImpl) b.dW;
        MethodCollector.o(5272);
        return shareH5ServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final BaseCommonJavaMethod a(a aVar) {
        return new PushOperationMethod(aVar);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final BaseCommonJavaMethod b(a aVar) {
        return new ShareMethod(aVar);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final BaseCommonJavaMethod c(a aVar) {
        return new ShareLiveEventMethod(aVar);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final BaseBridgeMethod a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod(bVar);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final BaseBridgeMethod b(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        return new ShareSearchMethod(bVar);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void b(com.ss.android.ugc.aweme.bullet.business.b bVar) {
        l.d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.a(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final Map<String, Object> a(com.ss.android.ugc.aweme.bullet.business.b bVar) {
        l.d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.a(ShareBusiness.class);
        if (absShareBusiness != null) {
            return ag.a(new p("local_obj", absShareBusiness.f69202h));
        }
        return ag.a();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void a(com.ss.android.ugc.aweme.bullet.business.b bVar, SSWebView sSWebView) {
        l.d(bVar, "");
        ShareBusiness shareBusiness = (ShareBusiness) bVar.a(ShareBusiness.class);
        if (shareBusiness != null) {
            shareBusiness.f69250l = sSWebView;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void b(com.ss.android.ugc.aweme.bullet.business.b bVar, SSWebView sSWebView) {
        MethodCollector.i(5268);
        l.d(bVar, "");
        if (bVar.a(ShareBusiness.class) == null) {
            MethodCollector.o(5268);
        } else if (sSWebView != null) {
            String str = "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }        window.local_obj.showSource(window.__title__, getAwemeMetaDatas());";
            String a2 = h.f149026a.a(sSWebView, str);
            if (!TextUtils.isEmpty(a2)) {
                str = a2;
            }
            sSWebView.loadUrl(str);
            MethodCollector.o(5268);
        } else {
            MethodCollector.o(5268);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void a(com.ss.android.ugc.aweme.bullet.business.b bVar, String str) {
        l.d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.a(ShareBusiness.class);
        if (absShareBusiness != null && !TextUtils.isEmpty(str)) {
            absShareBusiness.f69196b = null;
            absShareBusiness.f69198d = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void b(com.ss.android.ugc.aweme.bullet.business.b bVar, String str) {
        l.d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.a(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.f69198d = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void a(com.ss.android.ugc.aweme.bullet.business.b bVar, boolean z) {
        l.d(bVar, "");
        AbsShareBusiness absShareBusiness = (AbsShareBusiness) bVar.a(ShareBusiness.class);
        if (absShareBusiness != null) {
            absShareBusiness.f69199e = z;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void a(g gVar, int i2) {
        com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        if (gVar != null && (absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.a(i.a.a(i2))) != null) {
            absShareBusiness.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void b(g gVar, SingleWebView singleWebView, int i2) {
        com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        l.d(singleWebView, "");
        if (gVar != null && (absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.a(i.a.a(i2))) != null && singleWebView != null) {
            if (absShareBusiness.f78600g == null) {
                absShareBusiness.f78600g = new AbsShareBusiness.a(absShareBusiness, (byte) 0);
            }
            singleWebView.getSettings().setJavaScriptEnabled(true);
            int i3 = Build.VERSION.SDK_INT;
            singleWebView.addJavascriptInterface(absShareBusiness.f78600g, "local_obj");
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void a(g gVar, SingleWebView singleWebView, int i2) {
        com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        MethodCollector.i(5102);
        l.d(singleWebView, "");
        if (gVar == null || (absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.a(i.a.a(i2))) == null) {
            MethodCollector.o(5102);
            return;
        }
        if (singleWebView != null) {
            absShareBusiness.f78601h = singleWebView;
            WebView webView = absShareBusiness.f78601h;
            int i3 = Build.VERSION.SDK_INT;
            String concat = "javascript: function getMetaContent(name) {            var item = document.getElementsByTagName('meta')[name];            if (item != null) {            return item.getAttribute('content');}            else {return null}        }        function getAwemeMetaDatas() {        var aweme = new Object();        aweme.source = 'native';        aweme.title = getMetaContent('aweme:title');        aweme.desc = getMetaContent('aweme:description');        aweme.image = getMetaContent('aweme:image');        aweme.url = getMetaContent('aweme:url');        aweme.innerUrl = getMetaContent('aweme:innerUrl');        aweme.qrcode = getMetaContent('aweme:qrcode');        aweme.shareitems = getMetaContent('aweme:shareitems');        aweme.sharetips = getMetaContent('aweme:share:tips');        return JSON.stringify(aweme);        }".concat("window.local_obj.showSource(window.__title__, getAwemeMetaDatas());");
            String a2 = h.f149026a.a(webView, concat);
            if (!TextUtils.isEmpty(a2)) {
                concat = a2;
            }
            webView.loadUrl(concat);
        }
        MethodCollector.o(5102);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareH5Service
    public final void a(g gVar, String str, int i2) {
        com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness absShareBusiness;
        if (gVar != null && (absShareBusiness = (com.ss.android.ugc.aweme.crossplatform.business.AbsShareBusiness) gVar.a(i.a.a(i2))) != null && !TextUtils.isEmpty(str)) {
            absShareBusiness.f78594a = null;
            absShareBusiness.f78597d = str;
        }
    }
}
