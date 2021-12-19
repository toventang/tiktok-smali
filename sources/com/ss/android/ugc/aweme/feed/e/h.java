package com.ss.android.ugc.aweme.feed.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.al;
import java.util.concurrent.Callable;
import org.json.JSONObject;

final /* synthetic */ class h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final f f92911a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f92912b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f92913c;

    /* renamed from: d  reason: collision with root package name */
    private final String f92914d;

    /* renamed from: e  reason: collision with root package name */
    private final int f92915e;

    /* renamed from: f  reason: collision with root package name */
    private final al f92916f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f92917g;

    /* renamed from: h  reason: collision with root package name */
    private final String f92918h;

    static {
        Covode.recordClassIndex(58936);
    }

    h(f fVar, Aweme aweme, Context context, String str, int i2, al alVar, JSONObject jSONObject, String str2) {
        this.f92911a = fVar;
        this.f92912b = aweme;
        this.f92913c = context;
        this.f92914d = str;
        this.f92915e = i2;
        this.f92916f = alVar;
        this.f92917g = jSONObject;
        this.f92918h = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f92911a.a(this.f92912b, this.f92913c, this.f92914d, this.f92915e, this.f92916f, this.f92917g, this.f92918h);
    }
}
