package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.u;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService;
import com.ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.fe.method.CloseMethod;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class CloseMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69076b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69077c = "close";

    /* renamed from: d  reason: collision with root package name */
    private k.a f69078d = k.a.PUBLIC;

    static {
        Covode.recordClassIndex(42594);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42595);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69078d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69077c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69078d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CloseMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        String str;
        boolean z;
        boolean z2;
        WebView webView;
        u uVar;
        z a2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (g2 == null || (a2 = g2.a()) == null) {
            str = null;
        } else {
            str = a2.f32074a;
        }
        int i2 = 0;
        if (str == null || str.length() == 0 || (uVar = (u) e.a.a().a(u.class)) == null || !uVar.a(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            aVar.a(jSONObject2);
            return;
        }
        IShoppingAdsService d2 = ShoppingAdsServiceImpl.d();
        if (d2 != null && d2.a(e())) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            aVar.a(jSONObject3);
        } else if (h() == com.bytedance.ies.bullet.service.f.a.b.b.WEB || h() == com.bytedance.ies.bullet.service.f.a.b.b.LYNX) {
            String optString = jSONObject.optString("reactId");
            if (optString == null || optString.length() == 0 || optString == null) {
                z2 = false;
            } else {
                Activity a3 = a(optString);
                if (a3 != null) {
                    a3.finish();
                }
                z2 = true;
            }
            Context e2 = e();
            if (e2 instanceof Activity) {
                Activity activity = (Activity) e2;
                if (!activity.isFinishing()) {
                    if (e2 instanceof f.c) {
                        if (h() == com.bytedance.ies.bullet.service.f.a.b.b.LYNX) {
                            com.bytedance.ies.bullet.c.c.i g3 = g();
                            if (g3 != null) {
                                i2 = g3.hashCode();
                            }
                        } else {
                            com.bytedance.ies.web.a.a i3 = i();
                            if (!(i3 == null || (webView = i3.f35513d) == null)) {
                                i2 = webView.hashCode();
                            }
                        }
                        c.a(new CloseMethod.b(i2));
                        c.a(new com.ss.android.ugc.aweme.ad.c.b(i2));
                    } else if (!z2) {
                        activity.finish();
                    }
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("code", 1);
            aVar.a(jSONObject4);
        } else {
            Activity a4 = a(jSONObject.optString("reactId"));
            if (a4 != null) {
                a4.finish();
                aVar.a((Object) null);
                return;
            }
            aVar.a(-1, "the target activity doesn't exist");
        }
    }
}
