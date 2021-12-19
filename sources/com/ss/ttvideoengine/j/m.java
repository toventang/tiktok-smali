package com.ss.ttvideoengine.j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private String f152945a;

    /* renamed from: b  reason: collision with root package name */
    private String f152946b;

    /* renamed from: c  reason: collision with root package name */
    private String f152947c;

    static {
        Covode.recordClassIndex(101675);
    }

    public final String a(int i2) {
        if (i2 == 108) {
            return this.f152946b;
        }
        if (i2 == 109) {
            return this.f152947c;
        }
        if (i2 != 215) {
            return "";
        }
        return this.f152945a;
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f152945a = jSONObject.optString("AdaptiveType");
            this.f152946b = jSONObject.optString("MainPlayUrl");
            this.f152947c = jSONObject.optString("BackupPlayUrl");
        }
    }
}
