package com.ss.android.ugc.aweme.share;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.crossplatform.business.g;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public interface ShareH5Service {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123256a = a.f123257a;

    static {
        Covode.recordClassIndex(80965);
    }

    BaseBridgeMethod a(b bVar);

    BaseCommonJavaMethod a(com.bytedance.ies.web.a.a aVar);

    String a();

    Map<String, Object> a(com.ss.android.ugc.aweme.bullet.business.b bVar);

    void a(com.ss.android.ugc.aweme.bullet.business.b bVar, SSWebView sSWebView);

    void a(com.ss.android.ugc.aweme.bullet.business.b bVar, String str);

    void a(com.ss.android.ugc.aweme.bullet.business.b bVar, boolean z);

    void a(g gVar, int i2);

    void a(g gVar, SingleWebView singleWebView, int i2);

    void a(g gVar, String str, int i2);

    boolean a(WeakReference<Context> weakReference, JSONObject jSONObject);

    BaseBridgeMethod b(b bVar);

    BaseCommonJavaMethod b(com.bytedance.ies.web.a.a aVar);

    String b();

    void b(com.ss.android.ugc.aweme.bullet.business.b bVar);

    void b(com.ss.android.ugc.aweme.bullet.business.b bVar, SSWebView sSWebView);

    void b(com.ss.android.ugc.aweme.bullet.business.b bVar, String str);

    void b(g gVar, SingleWebView singleWebView, int i2);

    BaseCommonJavaMethod c(com.bytedance.ies.web.a.a aVar);

    String c();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f123257a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(80966);
        }

        public static ShareH5Service a() {
            ShareH5Service d2 = ShareH5ServiceImpl.d();
            l.b(d2, "");
            return d2;
        }
    }
}
