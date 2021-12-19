package com.ss.android.ugc.aweme.ecommercelive.business.common.b;

import android.os.Bundle;
import androidx.lifecycle.ac;
import com.bytedance.android.live.slot.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import java.lang.Enum;
import org.json.JSONObject;

public abstract class c<W, VM extends ac, T extends Enum<T>> extends b<W, VM, T> {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ f f87982c = new f();

    /* renamed from: j  reason: collision with root package name */
    public String f87983j = "-1";

    static {
        Covode.recordClassIndex(55311);
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public void d() {
        super.d();
        f fVar = this.f87982c;
        fVar.f87987a = 0;
        fVar.f87988b = true;
    }

    @Override // com.bytedance.android.live.slot.ab, com.bytedance.android.live.slot.b
    public void a(Bundle bundle) {
        super.a(bundle);
        this.f87982c.f87987a = System.currentTimeMillis();
    }

    public final void a(e eVar) {
        l.d(eVar, "");
        f fVar = this.f87982c;
        l.d(eVar, "");
        if (fVar.f87988b) {
            fVar.f87988b = false;
            String str = eVar.f87984a;
            String str2 = eVar.f87985b;
            long currentTimeMillis = System.currentTimeMillis() - fVar.f87987a;
            String str3 = eVar.f87986c;
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
