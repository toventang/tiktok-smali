package com.bytedance.android.live.core.c;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f8957a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8958b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f8959c;

    static {
        Covode.recordClassIndex(4570);
    }

    k(b bVar, String str, JSONObject jSONObject) {
        this.f8957a = bVar;
        this.f8958b = str;
        this.f8959c = jSONObject;
    }

    public final void run() {
        b bVar = this.f8957a;
        String str = this.f8958b;
        a.a(3, str, bVar.c(str, this.f8959c));
    }
}
