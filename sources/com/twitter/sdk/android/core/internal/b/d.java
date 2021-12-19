package com.twitter.sdk.android.core.internal.b;

import com.bytedance.covode.number.Covode;

public final class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b f155957a;

    /* renamed from: b  reason: collision with root package name */
    public final e<T> f155958b;

    /* renamed from: c  reason: collision with root package name */
    public final String f155959c;

    static {
        Covode.recordClassIndex(103627);
    }

    public final void a() {
        this.f155957a.b().remove(this.f155959c).commit();
    }

    public final void a(T t) {
        b bVar = this.f155957a;
        bVar.a(bVar.b().putString(this.f155959c, this.f155958b.a((Object) t)));
    }

    public d(b bVar, e<T> eVar, String str) {
        this.f155957a = bVar;
        this.f155958b = eVar;
        this.f155959c = str;
    }
}
