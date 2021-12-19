package com.ss.ttvideoengine.j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public float f152989a = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f152990b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public int f152991c = 1;

    /* renamed from: d  reason: collision with root package name */
    private float f152992d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    private float f152993e = -1.0f;

    static {
        Covode.recordClassIndex(101681);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("opening") || jSONObject.has("ending")) {
                this.f152991c = 1;
                try {
                    this.f152989a = (float) jSONObject.optDouble("opening");
                    this.f152990b = (float) jSONObject.optDouble("ending");
                } catch (Exception unused) {
                }
            } else if (jSONObject.has("Ending") || jSONObject.has("Opening")) {
                this.f152991c = 2;
                try {
                    this.f152992d = (float) jSONObject.optDouble("Opening");
                    this.f152993e = (float) jSONObject.optDouble("Ending");
                } catch (Exception unused2) {
                }
            }
        }
    }
}
