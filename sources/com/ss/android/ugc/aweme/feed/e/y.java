package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.al;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f93001a;

    /* renamed from: b  reason: collision with root package name */
    private final int f93002b;

    /* renamed from: c  reason: collision with root package name */
    private final aj f93003c;

    /* renamed from: d  reason: collision with root package name */
    private final int f93004d;

    /* renamed from: e  reason: collision with root package name */
    private final int f93005e;

    /* renamed from: f  reason: collision with root package name */
    private final String f93006f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f93007g = null;

    /* renamed from: h  reason: collision with root package name */
    private final Aweme f93008h;

    /* renamed from: i  reason: collision with root package name */
    private final al f93009i;

    /* renamed from: j  reason: collision with root package name */
    private final String f93010j;

    static {
        Covode.recordClassIndex(58992);
    }

    y(o oVar, int i2, aj ajVar, int i3, int i4, String str, Aweme aweme, al alVar, String str2) {
        this.f93001a = oVar;
        this.f93002b = i2;
        this.f93003c = ajVar;
        this.f93004d = i3;
        this.f93005e = i4;
        this.f93006f = str;
        this.f93008h = aweme;
        this.f93009i = alVar;
        this.f93010j = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f93001a.a(this.f93002b, this.f93004d, this.f93005e, this.f93006f, this.f93007g, this.f93008h, this.f93009i, this.f93010j);
    }
}
