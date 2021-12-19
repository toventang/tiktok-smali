package com.ss.android.ugc.aweme.bullet.bridge.ad;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.module.ad.c;
import com.ss.android.ugc.aweme.bullet.module.ad.j;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class AdInfoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68856b = new a((byte) 0);

    static {
        Covode.recordClassIndex(42422);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "adInfo";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42423);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdInfoMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        q qVar;
        c cVar;
        int i2;
        int i3;
        l.d(jSONObject, "");
        l.d(aVar, "");
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        com.bytedance.ies.bullet.c.c.i g2 = g();
        if (g2 != null) {
            qVar = g2.o_();
        } else {
            qVar = null;
        }
        if (!(qVar instanceof j)) {
            qVar = null;
        }
        j jVar = (j) qVar;
        com.bytedance.ies.bullet.c.c.i g3 = g();
        if (g3 != null) {
            cVar = (c) g3.a(c.class);
        } else {
            cVar = null;
        }
        if (jVar != null) {
            jSONObject2.put("cid", jVar.Y.b());
            jSONObject2.put("group_id", jVar.h());
            jSONObject2.put("ad_type", jVar.Z.b());
            jSONObject2.put("log_extra", jVar.c());
            jSONObject2.put("download_url", jVar.ah.b());
            jSONObject2.put("package_name", jVar.aj.b());
            jSONObject2.put("app_name", jVar.ai.b());
            Long l2 = (Long) jVar.Y.b();
            if (l2 != null && l2.longValue() == 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            jSONObject2.put("code", i3);
            jSONObject2.put("land_page_data", jVar.aB);
            jSONObject2.put("extra_param", jVar.aC);
            Long l3 = (Long) jVar.Y.b();
            if (l3 != null) {
                l3.longValue();
            }
            jVar.c();
        } else if (cVar != null) {
            jSONObject2.put("cid", cVar.b());
            jSONObject2.put("group_id", cVar.c());
            jSONObject2.put("ad_type", cVar.R.b());
            jSONObject2.put("log_extra", cVar.d());
            jSONObject2.put("download_url", cVar.e());
            jSONObject2.put("package_name", cVar.f());
            jSONObject2.put("app_name", cVar.g());
            if (cVar.b() == 0) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            jSONObject2.put("code", i2);
            jSONObject2.put("land_page_data", cVar.ak);
            jSONObject2.put("extra_param", cVar.ap);
            try {
                String b2 = cVar.ae.b();
                if (b2 == null) {
                    b2 = "";
                }
                jSONObject2.put("track_url_list", new JSONArray(b2));
            } catch (Exception unused) {
            }
            cVar.b();
            cVar.d();
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(3, null, "It is illegal to call adInfo in non-commercialized scenarios, please chat with zhangxiang.aaron privately");
        }
        aVar.a(jSONObject2);
    }
}
