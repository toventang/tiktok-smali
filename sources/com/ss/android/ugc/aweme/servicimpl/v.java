package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.port.in.ap;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class v implements ap {
    static {
        Covode.recordClassIndex(79944);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(str, "");
        l.d(jSONObject, "");
        l.d(str, "");
        l.d(jSONObject, "");
        b.a(str, jSONObject, jSONObject2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(Throwable th, String str) {
        com.bytedance.c.a.a.a.b.a(th, str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(Throwable th) {
        a.a(th);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void b(String str) {
        com.bytedance.c.a.a.a.b.a(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(Exception exc) {
        a.a("", exc);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void b(Exception exc) {
        a.a("", exc);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str) {
        a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void b(String str, JSONObject jSONObject) {
        r.a(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str, "");
        a.b(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, Map<String, String> map) {
        q.a(str, map);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, JSONObject jSONObject) {
        o.a(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(int i2, String str, String str2) {
        a.a(i2, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, int i2, JSONObject jSONObject) {
        b.a(str, i2, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, String str2, float f2) {
        o.b(str, str2, f2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, String str2, JSONObject jSONObject) {
        o.b(str, str2, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.port.in.ap
    public final void a(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        o.a(str, i2, jSONObject, jSONObject2);
    }
}
