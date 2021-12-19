package com.bytedance.android.live.wallet.d;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.wallet.h;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f13119a;

    static {
        Covode.recordClassIndex(7281);
    }

    public final h a() {
        JSONObject jSONObject = this.f13119a;
        if (jSONObject == null) {
            return null;
        }
        try {
            long j2 = jSONObject.getLong("activities_id");
            long j3 = this.f13119a.getLong("item_id");
            if (j2 > 0 && j3 > 0) {
                return new a(j2, j3);
            }
        } catch (JSONException e2) {
            a.a(6, "PostChargeNetFactory", e2.getMessage());
        }
        try {
            long j4 = this.f13119a.getLong("ward_id");
            long j5 = this.f13119a.getLong("anchor_id");
            if (j4 > 0) {
                return new c(j4, j5);
            }
        } catch (JSONException e3) {
            a.a(6, "PostChargeNetFactory", e3.getMessage());
        }
        return null;
    }

    public b(JSONObject jSONObject) {
        this.f13119a = jSONObject;
    }
}
