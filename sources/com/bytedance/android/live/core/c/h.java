package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f8949a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8950b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8951c;

    static {
        Covode.recordClassIndex(4567);
    }

    public h(b bVar, String str, JSONObject jSONObject) {
        this.f8949a = bVar;
        this.f8950b = str;
        this.f8951c = jSONObject;
    }

    public final void run() {
        b bVar = this.f8949a;
        String str = this.f8950b;
        a.a(5, str, bVar.c(str, this.f8951c));
    }
}
