package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.livesdkapi.depend.d.b.d;
import com.bytedance.android.livesdkapi.n.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenRechargePanel extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(57339);
    }

    private OpenRechargePanel(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ OpenRechargePanel() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenRechargePanel f91128a;

        static {
            Covode.recordClassIndex(57340);
        }

        @Override // com.bytedance.android.livesdkapi.n.a.b
        public final void a() {
            OpenRechargePanel openRechargePanel = this.f91128a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }

        @Override // com.bytedance.android.livesdkapi.n.a.b
        public final void b() {
            OpenRechargePanel openRechargePanel = this.f91128a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", 10001);
            jSONObject.put("args", jSONObject2);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(OpenRechargePanel openRechargePanel) {
            this.f91128a = openRechargePanel;
        }
    }

    public static final class b implements com.bytedance.android.livesdkapi.depend.d.b.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OpenRechargePanel f91129a;

        static {
            Covode.recordClassIndex(57341);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(int i2, int i3, String str) {
            l.d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(OpenRechargePanel openRechargePanel) {
            this.f91129a = openRechargePanel;
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(long j2) {
            OpenRechargePanel openRechargePanel = this.f91129a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.b.b
        public final void a(Exception exc, String str) {
            l.d(exc, "");
            l.d(str, "");
            OpenRechargePanel openRechargePanel = this.f91129a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", 10001);
            jSONObject.put("args", jSONObject2);
            openRechargePanel.sendEvent("coinsRechargeStatus", jSONObject, 3);
        }
    }

    public OpenRechargePanel(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        long j2;
        String str;
        JSONObject jSONObject2;
        Bundle bundle = new Bundle();
        int i2 = 0;
        if (jSONObject != null) {
            i2 = jSONObject.optInt("key_bundle_charge_source", 0);
        }
        long j3 = 0;
        if (jSONObject != null) {
            j2 = jSONObject.optLong("diamond_count", 0);
            j3 = jSONObject.optLong("total_diamond_acount_needed", 0);
        } else {
            j2 = 0;
        }
        if (jSONObject != null) {
            str = jSONObject.optString("charge_reason");
            jSONObject2 = jSONObject.optJSONObject("track_info");
        } else {
            str = null;
            jSONObject2 = null;
        }
        bundle.putInt("key_bundle_charge_source", i2);
        bundle.putLong("key_bundle_need_coins", j2);
        bundle.putString("KEY_CHARGE_REASON", str);
        bundle.putLong("key_bundle_total_coins", j3);
        if (i2 == 5 || this.mContextRef == null) {
            c.a(new com.bytedance.android.livesdkapi.n.a(new a(this), bundle, a.C0507a.a(jSONObject2)));
        } else {
            Context context = (Context) this.mContextRef.get();
            if (context instanceof e) {
                d dVar = new d();
                dVar.a(a.C0507a.a(jSONObject2));
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                e eVar = (e) context;
                s.d().a(eVar, new b(this), bundle, dVar).showNow(eVar.getSupportFragmentManager(), getClass().getSimpleName());
            } else {
                return;
            }
        }
        if (aVar != null) {
            aVar.a((Object) null);
        }
    }
}
