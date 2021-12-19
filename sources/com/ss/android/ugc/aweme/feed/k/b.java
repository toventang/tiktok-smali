package com.ss.android.ugc.aweme.feed.k;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f93545a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f93546b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93547c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93548d;

    /* renamed from: e  reason: collision with root package name */
    private final String f93549e;

    /* renamed from: f  reason: collision with root package name */
    private final String f93550f;

    /* renamed from: g  reason: collision with root package name */
    private final String f93551g;

    static {
        Covode.recordClassIndex(59261);
    }

    b(JSONObject jSONObject, Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        this.f93545a = jSONObject;
        this.f93546b = aweme;
        this.f93547c = str;
        this.f93548d = str2;
        this.f93549e = str3;
        this.f93550f = str4;
        this.f93551g = str5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return a.a(this.f93545a, this.f93546b, this.f93547c, this.f93548d, this.f93549e, this.f93550f, this.f93551g);
    }
}
