package com.ss.android.ugc.aweme.metrics.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f109534a;

    /* renamed from: b  reason: collision with root package name */
    private final String f109535b;

    /* renamed from: c  reason: collision with root package name */
    private final String f109536c;

    /* renamed from: d  reason: collision with root package name */
    private final String f109537d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f109538e;

    static {
        Covode.recordClassIndex(70118);
    }

    public b(JSONObject jSONObject, String str, String str2, String str3, Context context) {
        this.f109534a = jSONObject;
        this.f109535b = str;
        this.f109536c = str2;
        this.f109537d = str3;
        this.f109538e = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a(this.f109534a, this.f109535b, this.f109536c, this.f109537d, this.f109538e);
    }
}
