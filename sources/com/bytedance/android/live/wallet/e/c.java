package com.bytedance.android.live.wallet.e;

import android.content.Context;
import com.bytedance.android.live.wallet.e;
import com.bytedance.android.live.wallet.f.a.d;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.recharge.LiveWebRechargeAuditing;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a.a;
import com.bytedance.ies.web.a.h;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: e  reason: collision with root package name */
    private d f13143e;

    /* renamed from: f  reason: collision with root package name */
    private final d f13144f;

    static {
        Covode.recordClassIndex(7292);
    }

    private void d() {
        d dVar = this.f13143e;
        if (dVar != null) {
            dVar.f();
        }
        this.f13143e = null;
    }

    @Override // com.bytedance.android.live.wallet.e.a, com.bytedance.android.live.wallet.f.b.b
    public final void a(DiamondPackageExtra diamondPackageExtra, List<com.bytedance.android.livesdk.wallet.c> list) {
        l.d(list, "");
        if (list.isEmpty()) {
            a(new Exception("chargeDeals is empty"), 0);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            JSONObject a2 = com.bytedance.android.livesdk.wallet.c.a(list.get(i2));
            l.b(a2, "");
            arrayList.add(a2);
        }
        try {
            b().put("code", 0);
            b().put("args", arrayList);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.f13133d.a(a().f35531b, b());
        d();
    }

    @Override // com.bytedance.android.live.wallet.e.a, com.bytedance.android.live.wallet.f.b.b
    public final void a(Exception exc, int i2) {
        int i3;
        String message;
        try {
            JSONObject b2 = b();
            if (LiveWebRechargeAuditing.INSTANCE.getValue()) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            b2.put("is_outside_channel", i3);
            b().put("charge_error_code", i2);
            b().put("source", 1);
            b().put("code", -1);
            JSONObject b3 = b();
            if (exc == null) {
                message = "";
            } else {
                message = exc.getMessage();
            }
            b3.put("msg", message);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.f13133d.a(a().f35531b, b());
        d();
    }

    @Override // com.bytedance.android.live.wallet.e.a, com.bytedance.ies.web.a.d
    public final void call(h hVar, JSONObject jSONObject) {
        l.d(hVar, "");
        l.d(jSONObject, "");
        super.call(hVar, jSONObject);
        if (this.f13143e == null) {
            this.f13143e = this.f13144f.a(this.f13132c);
        }
        d dVar = this.f13143e;
        if (dVar != null) {
            dVar.a((a) this);
            dVar.e();
        }
        a(hVar);
        a(jSONObject);
        hVar.f35538i = false;
        HashMap hashMap = new HashMap();
        hashMap.put("methodName", "GetPurchaseItemListMethod");
        com.bytedance.android.live.core.d.c.a("ttlive_wallet_H5_query", 0, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("request_page", "my_profile");
        hashMap2.put("pay_method", e.a.b());
        hashMap2.put("timestamp", String.valueOf(com.bytedance.android.livesdk.utils.a.a.a()));
        b.a.a("livesdk_recharge_show").a((Map<String, String>) hashMap2).b();
        List<com.bytedance.android.livesdk.wallet.c> a2 = e.f13122g.a();
        if (!com.bytedance.common.utility.collection.b.a((Collection) a2)) {
            d dVar2 = this.f13143e;
            if (dVar2 != null) {
                dVar2.f13153c = a2;
            }
            a((DiamondPackageExtra) null, a2);
            return;
        }
        d dVar3 = this.f13143e;
        if (dVar3 != null) {
            dVar3.c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, com.bytedance.ies.web.a.a aVar, d dVar) {
        super(context, aVar);
        l.d(context, "");
        l.d(aVar, "");
        l.d(dVar, "");
        this.f13144f = dVar;
    }
}
