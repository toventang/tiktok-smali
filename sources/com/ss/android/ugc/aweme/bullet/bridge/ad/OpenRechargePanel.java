package com.ss.android.ugc.aweme.bullet.bridge.ad;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdkapi.n.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.ad.b.b;
import com.ss.android.ugc.aweme.ad.b.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class OpenRechargePanel extends BaseBridgeMethod implements au {
    static {
        Covode.recordClassIndex(42472);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "openRechargePanel";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenRechargePanel(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public static final class a implements com.bytedance.android.livesdkapi.depend.d.b.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenRechargePanel f68918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f68919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map f68920c;

        static {
            Covode.recordClassIndex(42473);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(long j2) {
            if (this.f68919b == 5) {
                OpenRechargePanel openRechargePanel = this.f68918a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                openRechargePanel.a("coinsRechargeStatus", jSONObject);
                return;
            }
            this.f68920c.put("code", "1");
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("coinsRechargeStatus", SystemClock.currentThreadTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(this.f68920c)));
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(Exception exc, String str) {
            l.d(exc, "");
            l.d(str, "");
            if (this.f68919b == 5) {
                OpenRechargePanel openRechargePanel = this.f68918a;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error_code", 10001);
                jSONObject.put("args", jSONObject2);
                openRechargePanel.a("coinsRechargeStatus", jSONObject);
                return;
            }
            this.f68920c.put("code", "0");
            this.f68920c.put("error_code", 10001);
            com.bytedance.ies.xbridge.e.b.a(new com.bytedance.ies.xbridge.e.a("coinsRechargeStatus", SystemClock.currentThreadTimeMillis(), com.bytedance.ies.xbridge.platform.b.b.a(this.f68920c)));
        }

        a(OpenRechargePanel openRechargePanel, int i2, Map map) {
            this.f68918a = openRechargePanel;
            this.f68919b = i2;
            this.f68920c = map;
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(int i2, int i3, String str) {
            l.d(str, "");
            if (this.f68919b != 5) {
                return;
            }
            if (i2 == 1) {
                Integer num = null;
                com.bytedance.apm.b.a("promote_iap_charge_show", 0, (JSONObject) null);
                d dVar = new d();
                l.b(b.a.f65586a, "");
                c a2 = com.ss.android.ugc.aweme.ad.b.b.a();
                if (a2 != null) {
                    num = Integer.valueOf(a2.n());
                }
                r.a("promote_iap_recharge_panel_show", dVar.a("user_account_type", num).f66730a);
            } else if (i2 == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_status_code ", i3);
                jSONObject.put("error_message", str);
                com.bytedance.apm.b.a("promote_iap_charge_show", 1, jSONObject);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        Bundle bundle = new Bundle();
        int optInt = jSONObject.optInt("key_bundle_charge_source", 0);
        long optLong = jSONObject.optLong("diamond_count", 0);
        long optLong2 = jSONObject.optLong("total_diamond_acount_needed", 0);
        String optString = jSONObject.optString("charge_reason");
        JSONObject optJSONObject = jSONObject.optJSONObject("track_info");
        bundle.putInt("key_bundle_charge_source", optInt);
        bundle.putLong("key_bundle_need_coins", optLong);
        bundle.putLong("key_bundle_total_coins", optLong2);
        bundle.putString("KEY_CHARGE_REASON", optString);
        Context e2 = e();
        if (e2 instanceof e) {
            com.bytedance.android.livesdkapi.depend.d.b.d dVar = new com.bytedance.android.livesdkapi.depend.d.b.d();
            dVar.a(a.C0507a.a(optJSONObject));
            HashMap hashMap = new HashMap();
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            e eVar = (e) e2;
            s.d().a(eVar, new a(this, optInt, hashMap), bundle, dVar).showNow(eVar.getSupportFragmentManager(), getClass().getSimpleName());
            aVar.a((Object) null);
        }
    }
}
