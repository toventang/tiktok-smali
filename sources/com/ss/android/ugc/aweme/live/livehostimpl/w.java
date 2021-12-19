package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.b.a;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONObject;

public final class w implements a {
    static {
        Covode.recordClassIndex(69533);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    @Override // com.bytedance.android.live.base.b.a
    public final void a(String str, JSONObject jSONObject) {
        n.a(str, jSONObject);
    }

    @Override // com.bytedance.android.live.base.b.a
    public final void a(Throwable th, String str) {
        b.a(th, str);
    }

    @Override // com.bytedance.android.live.base.b.a
    public final void a(String str, int i2, JSONObject jSONObject) {
        com.bytedance.apm.b.a(str, i2, jSONObject);
    }

    @Override // com.bytedance.android.live.base.b.a
    public final void a(String str, String str2, float f2) {
        n.b(str, str2, f2);
    }

    @Override // com.bytedance.android.live.base.b.a
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        com.bytedance.apm.b.a(str, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.android.live.base.b.a
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        n.a(str, i2, jSONObject, jSONObject2);
    }

    @Override // com.bytedance.android.live.base.b.a
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        com.bytedance.apm.b.a(str, jSONObject, jSONObject2, jSONObject3);
    }
}
