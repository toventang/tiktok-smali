package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import org.json.JSONObject;

public abstract class c implements d, Serializable {
    private final String certToken;
    private final int certType;

    static {
        Covode.recordClassIndex(15662);
    }

    @Override // com.bytedance.bpea.basics.d
    public String certToken() {
        return this.certToken;
    }

    public int certType() {
        return this.certType;
    }

    public String toString() {
        String jSONObject = toJSON().toString();
        l.a((Object) jSONObject, "");
        return jSONObject;
    }

    @Override // com.bytedance.bpea.basics.d
    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("certToken", this.certToken);
            jSONObject.put("certType", this.certType);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.bpea.basics.d
    public void validate(f fVar) {
        l.c(fVar, "");
        String str = this.certToken;
        if (str == null || str.length() == 0) {
            throw new a(-1, "certToken is empty");
        }
    }

    public c(String str, int i2) {
        this.certToken = str;
        this.certType = i2;
    }
}
