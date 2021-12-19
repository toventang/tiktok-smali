package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f8952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8953b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8954c;

    static {
        Covode.recordClassIndex(4568);
    }

    i(b bVar, String str, JSONObject jSONObject) {
        this.f8952a = bVar;
        this.f8953b = str;
        this.f8954c = jSONObject;
    }

    public final void run() {
        b bVar = this.f8952a;
        String str = this.f8953b;
        a.a(4, str, bVar.c(str, this.f8954c));
    }
}
