package com.ss.android.ugc.aweme.bullet.bridge.commerce;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import java.util.Iterator;
import org.json.JSONObject;

public final class AdInfoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68927b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f68928c = "adInfo";

    /* renamed from: d  reason: collision with root package name */
    private long f68929d;

    /* renamed from: e  reason: collision with root package name */
    private String f68930e;

    /* renamed from: f  reason: collision with root package name */
    private String f68931f;

    static {
        Covode.recordClassIndex(42483);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42484);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68928c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdInfoMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Uri p_;
        l.d(jSONObject, "");
        l.d(aVar, "");
        com.bytedance.ies.bullet.c.c.i g2 = g();
        int i2 = 1;
        if (!(g2 == null || g2.b() != com.bytedance.ies.bullet.service.f.a.b.b.WEB || (p_ = g2.p_()) == null)) {
            this.f68931f = p_.getQueryParameter("adinfojson");
            this.f68930e = p_.getQueryParameter("has_adinfojson");
        }
        l.d(aVar, "");
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.equals(this.f68930e, "1") || TextUtils.isEmpty(this.f68931f)) {
            if (this.f68929d == 0) {
                i2 = 0;
            }
            jSONObject2.put("code", i2);
        } else {
            JSONObject jSONObject3 = new JSONObject(this.f68931f);
            Iterator<String> keys = jSONObject3.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject3.opt(next));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        aVar.a(jSONObject2);
    }
}
