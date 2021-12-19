package com.ss.android.ugc.aweme.net.monitor;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final String f112464a;

    /* renamed from: b  reason: collision with root package name */
    private final String f112465b;

    /* renamed from: c  reason: collision with root package name */
    private final String f112466c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f112467d;

    /* renamed from: e  reason: collision with root package name */
    private final String f112468e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f112469f;

    static {
        Covode.recordClassIndex(72275);
    }

    c(String str, String str2, String str3, boolean z, String str4, boolean z2) {
        this.f112464a = str;
        this.f112465b = str2;
        this.f112466c = str3;
        this.f112467d = z;
        this.f112468e = str4;
        this.f112469f = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return b.a(this.f112464a, this.f112465b, this.f112466c, this.f112467d, this.f112468e, this.f112469f);
    }
}
