package com.ss.android.ugc.aweme.feed.x;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f95337a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f95338b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95339c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f95340d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95341e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95342f;

    /* renamed from: g  reason: collision with root package name */
    private final b f95343g;

    static {
        Covode.recordClassIndex(60383);
    }

    p(JSONObject jSONObject, Aweme aweme, String str, Context context, String str2, String str3, b bVar) {
        this.f95337a = jSONObject;
        this.f95338b = aweme;
        this.f95339c = str;
        this.f95340d = context;
        this.f95341e = str2;
        this.f95342f = str3;
        this.f95343g = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return n.a(this.f95337a, this.f95338b, this.f95339c, this.f95341e, this.f95342f, this.f95343g);
    }
}
