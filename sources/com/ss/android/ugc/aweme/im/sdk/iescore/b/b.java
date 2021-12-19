package com.ss.android.ugc.aweme.im.sdk.iescore.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c;
import com.ss.android.ugc.aweme.im.service.e;
import com.ss.android.ugc.aweme.im.service.m.a;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class b implements com.bytedance.ies.im.core.api.d.b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f102810a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(65915);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(JSONObject jSONObject) {
        com.bytedance.apm.b.a("im_event", jSONObject);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(Throwable th) {
        l.d(th, "");
        a.a("iesimcore", th);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void b(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(str, "");
        a(str, jSONObject);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void c(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(str, "");
        a(str, jSONObject);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(String str, Throwable th) {
        l.d(str, "");
        l.d(th, "");
        if (l.a((Object) str, (Object) "imsdk2")) {
            a.a(str, th);
        } else {
            a.a("iesimcore", str, th);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        e b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
        if (b2 != null) {
            b2.feedbackIm(str, str2);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (l.a((Object) str, (Object) "imsdk2")) {
            a.b(str, str2);
        } else {
            a.b("iesimcore", str + ": " + str2);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (l.a((Object) str, (Object) "imsdk2")) {
            a.c(str, str2);
        } else {
            a.c("iesimcore", str + ": " + str2);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void c(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (l.a((Object) str, (Object) "imsdk2")) {
            a.e(str, str2);
        } else {
            a.e("iesimcore", str + ": " + str2);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(String str, Map<String, String> map) {
        l.d(str, "");
        r.a(str, map);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        r.a(str, jSONObject);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(String str, String str2, Map<String, ? extends Object> map) {
        l.d(str, "");
        l.d(str2, "");
        c.a(str, str2, map);
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(String str, String str2, Throwable th) {
        l.d(str, "");
        l.d(str2, "");
        l.d(th, "");
        if (l.a((Object) str, (Object) "imsdk2")) {
            a.a(str, str2, th);
        } else {
            a.a("iesimcore", str + ": " + str2, th);
        }
    }

    @Override // com.bytedance.ies.im.core.api.d.b
    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        l.d(str, "");
        com.bytedance.apm.b.a(str, jSONObject, (JSONObject) null);
    }
}
