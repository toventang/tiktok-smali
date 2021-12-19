package com.bytedance.android.monitor.b;

import com.bytedance.android.monitor.l.d;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public String f23423a;

    static {
        Covode.recordClassIndex(13937);
    }

    @Override // com.bytedance.android.monitor.b.a, com.bytedance.android.monitor.b.f
    public final JSONObject a() {
        JSONObject a2 = super.a();
        d.a(a2, "event_type", this.f23423a);
        return a2;
    }

    public b(String str) {
        this.f23423a = str;
    }
}
