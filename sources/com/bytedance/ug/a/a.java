package com.bytedance.ug.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

final class a {

    /* renamed from: a  reason: collision with root package name */
    String f45718a;

    /* renamed from: b  reason: collision with root package name */
    String f45719b;

    /* renamed from: c  reason: collision with root package name */
    int f45720c;

    /* renamed from: d  reason: collision with root package name */
    String f45721d;

    /* renamed from: e  reason: collision with root package name */
    String f45722e;

    /* renamed from: f  reason: collision with root package name */
    int f45723f;

    /* renamed from: g  reason: collision with root package name */
    String f45724g;

    /* renamed from: h  reason: collision with root package name */
    JSONObject f45725h;

    static {
        Covode.recordClassIndex(27820);
    }

    /* access modifiers changed from: package-private */
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("launch_sequence", this.f45720c);
            jSONObject.put("sdk_name", this.f45718a);
            jSONObject.put("sdk_version", this.f45719b);
            jSONObject.put("action_id", this.f45721d);
            jSONObject.put("message", this.f45722e);
            jSONObject.put("result", this.f45723f);
            jSONObject.put("timestamp", this.f45724g);
            jSONObject.put("extra", this.f45725h);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public final String toString() {
        return "Action{sdkName='" + this.f45718a + '\'' + ", sdkVersion='" + this.f45719b + '\'' + ", launchSequence=" + this.f45720c + ", actionId='" + this.f45721d + '\'' + ", message='" + this.f45722e + '\'' + ", result=" + this.f45723f + ", timeStamp='" + this.f45724g + '\'' + ", extra=" + this.f45725h + '}';
    }

    a(int i2) {
        this.f45720c = i2;
    }
}
