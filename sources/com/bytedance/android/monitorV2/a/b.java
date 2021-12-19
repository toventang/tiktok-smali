package com.bytedance.android.monitorV2.a;

import com.bytedance.android.monitorV2.l.f;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f23824a;

    static {
        Covode.recordClassIndex(14099);
    }

    @Override // com.bytedance.android.monitorV2.a.f, com.bytedance.android.monitorV2.a.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        f.a(a2, "event_type", this.f23824a);
        return a2;
    }

    public String toString() {
        return "BaseNativeInfo{eventType='" + this.f23824a + '\'' + '}';
    }

    public b(String str) {
        this.f23824a = str;
    }
}
