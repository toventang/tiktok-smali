package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.b;

import android.os.Bundle;
import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.lang.Enum;
import org.json.JSONObject;

public abstract class b<W, VM extends ac, T extends Enum<T>> extends com.bytedance.android.live.slot.b<W, VM, T> {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e f104550c = new e();

    static {
        Covode.recordClassIndex(66981);
    }

    public final void i() {
        this.f104550c.a();
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public void d() {
        super.d();
        this.f104550c.a();
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.f104550c.f104554a = System.currentTimeMillis();
    }

    public final void a(d dVar) {
        l.d(dVar, "");
        e eVar = this.f104550c;
        l.d(dVar, "");
        if (eVar.f104555b) {
            eVar.f104555b = false;
            String str = dVar.f104551a;
            String str2 = dVar.f104552b;
            long currentTimeMillis = System.currentTimeMillis() - eVar.f104554a;
            String str3 = dVar.f104553c;
            l.d(str, "");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("anchor_id", str2);
                jSONObject.put("room_id", str3);
                jSONObject.put("first_show_cost", currentTimeMillis);
                r.a(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
