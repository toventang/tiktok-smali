package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONObject;

public final class ChooseLogAdExtraData implements b {
    private final JSONObject adExtraData;

    static {
        Covode.recordClassIndex(46142);
    }

    public static /* synthetic */ ChooseLogAdExtraData copy$default(ChooseLogAdExtraData chooseLogAdExtraData, JSONObject jSONObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jSONObject = chooseLogAdExtraData.adExtraData;
        }
        return chooseLogAdExtraData.copy(jSONObject);
    }

    public final JSONObject component1() {
        return this.adExtraData;
    }

    public final ChooseLogAdExtraData copy(JSONObject jSONObject) {
        l.d(jSONObject, "");
        return new ChooseLogAdExtraData(jSONObject);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ChooseLogAdExtraData) && l.a(this.adExtraData, ((ChooseLogAdExtraData) obj).adExtraData);
        }
        return true;
    }

    public final int hashCode() {
        JSONObject jSONObject = this.adExtraData;
        if (jSONObject != null) {
            return jSONObject.hashCode();
        }
        return 0;
    }

    public final b post() {
        return c.a(this);
    }

    public final b postSticky() {
        return c.b(this);
    }

    public final String toString() {
        return "ChooseLogAdExtraData(adExtraData=" + this.adExtraData + ")";
    }

    public final JSONObject getAdExtraData() {
        return this.adExtraData;
    }

    public ChooseLogAdExtraData(JSONObject jSONObject) {
        l.d(jSONObject, "");
        this.adExtraData = jSONObject;
    }
}
