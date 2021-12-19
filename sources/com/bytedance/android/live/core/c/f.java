package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f8943a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8944b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8945c;

    static {
        Covode.recordClassIndex(4565);
    }

    public f(b bVar, String str, JSONObject jSONObject) {
        this.f8943a = bVar;
        this.f8944b = str;
        this.f8945c = jSONObject;
    }

    public final void run() {
        b bVar = this.f8943a;
        String str = this.f8944b;
        a.a(6, str, bVar.c(str, this.f8945c));
    }
}
