package com.bytedance.android.monitor.g;

import com.bytedance.android.monitor.a.b;
import com.bytedance.android.monitor.m.a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public abstract class b implements com.bytedance.android.monitor.a.b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f23509a = true;

    /* renamed from: b  reason: collision with root package name */
    private b.a f23510b;

    static {
        Covode.recordClassIndex(13961);
    }

    public final boolean a() {
        return this.f23509a;
    }

    @Override // com.bytedance.android.monitor.a.b
    public final void a(b.a aVar) {
        this.f23510b = aVar;
    }

    public final void b(String str, JSONObject jSONObject) {
        b.a aVar;
        if (this.f23509a && (aVar = this.f23510b) != null && aVar.f23418a != null) {
            if (this.f23510b.f23419b != null) {
                str = this.f23510b.f23419b.b(str);
                a.a(jSONObject, "service", str);
            }
            this.f23510b.f23418a.a(str, jSONObject);
        }
    }
}
