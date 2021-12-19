package com.ss.android.ugc.aweme.metrics.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f109543a;

    /* renamed from: b  reason: collision with root package name */
    private final String f109544b;

    /* renamed from: c  reason: collision with root package name */
    private final String f109545c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f109546d;

    static {
        Covode.recordClassIndex(70120);
    }

    d(JSONObject jSONObject, String str, String str2, Context context) {
        this.f109543a = jSONObject;
        this.f109544b = str;
        this.f109545c = str2;
        this.f109546d = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a(this.f109543a, this.f109544b, this.f109545c, this.f109546d);
    }
}
