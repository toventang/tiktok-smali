package com.bytedance.android.livesdk.livebuild;

import android.content.Context;
import com.airbnb.lottie.a;
import com.airbnb.lottie.e;
import com.airbnb.lottie.n;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class Lottie261DiffManager extends c {
    static {
        Covode.recordClassIndex(10473);
    }

    @Override // com.bytedance.android.livesdk.livebuild.c
    public a fromJson(Context context, String str, n nVar) {
        try {
            return e.a.a(str, nVar);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.livebuild.c
    public a fromJson(Context context, JSONObject jSONObject, n nVar) {
        try {
            return e.a.a(jSONObject.toString(), nVar);
        } catch (Exception unused) {
            return null;
        }
    }
}
