package com.vk.api.sdk.e;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class a extends b<Boolean> {
    static {
        Covode.recordClassIndex(103801);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        l.c(str, "");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.vk.api.sdk.e.b
    public final /* synthetic */ Boolean a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        return true;
    }
}
