package com.ss.android.ugc.aweme.bullet.business;

import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetWebViewInfo;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.bullet.module.ad.j;
import com.ss.android.ugc.aweme.bullet.module.base.e;
import h.f.b.l;
import org.json.JSONObject;

public final class PreRenderWebViewBusiness extends BulletBusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69247a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f69248b;

    /* renamed from: c  reason: collision with root package name */
    private String f69249c;

    static {
        Covode.recordClassIndex(42692);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42693);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static PreRenderWebViewBusiness a(b bVar) {
            b bVar2;
            if (bVar != null) {
                bVar2 = bVar.b();
            } else {
                bVar2 = null;
            }
            if (!(bVar2 instanceof j)) {
                bVar2 = null;
            }
            e eVar = (e) bVar2;
            if (eVar == null || eVar.k() != 7) {
                return null;
            }
            return (PreRenderWebViewBusiness) bVar.a(PreRenderWebViewBusiness.class);
        }
    }

    public final void a() {
        this.f69248b = 0;
        com.bytedance.ies.bullet.kit.web.b.a aVar = this.f69222k.f69254c;
        if (aVar != null) {
            aVar.a("webViewDidHide", null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreRenderWebViewBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public final void a(String str) {
        this.f69248b = 2;
        com.bytedance.ies.bullet.kit.web.b.a aVar = this.f69222k.f69254c;
        if (aVar != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("clickFrom", str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            aVar.a("webViewDidShow", jSONObject);
        }
        this.f69249c = str;
    }

    public final void a(GetWebViewInfo.a aVar) {
        if (aVar != null && aVar.f68880b != null) {
            int i2 = aVar.f68879a;
            WebView webView = this.f69222k.f69255d;
            if (webView != null && i2 == webView.hashCode()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("appearanceState", this.f69248b);
                jSONObject.put("code", 1);
                jSONObject.put("preloadType", 1);
                jSONObject.put("clickFrom", this.f69249c);
                aVar.f68880b.a(jSONObject);
            }
        }
    }
}
