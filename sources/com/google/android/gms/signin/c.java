package com.google.android.gms.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a.AbstractC1206a<com.google.android.gms.signin.internal.a, a> f52109a;

    /* renamed from: b  reason: collision with root package name */
    public static final a<a> f52110b;

    /* renamed from: c  reason: collision with root package name */
    private static final a.g<com.google.android.gms.signin.internal.a> f52111c;

    /* renamed from: d  reason: collision with root package name */
    private static final a.g<com.google.android.gms.signin.internal.a> f52112d;

    /* renamed from: e  reason: collision with root package name */
    private static final a.AbstractC1206a<com.google.android.gms.signin.internal.a, Object> f52113e;

    /* renamed from: f  reason: collision with root package name */
    private static final Scope f52114f = new Scope("profile");

    /* renamed from: g  reason: collision with root package name */
    private static final Scope f52115g = new Scope("email");

    /* renamed from: h  reason: collision with root package name */
    private static final a<Object> f52116h;

    static {
        Covode.recordClassIndex(32395);
        a.g<com.google.android.gms.signin.internal.a> gVar = new a.g<>();
        f52111c = gVar;
        a.g<com.google.android.gms.signin.internal.a> gVar2 = new a.g<>();
        f52112d = gVar2;
        b bVar = new b();
        f52109a = bVar;
        e eVar = new e();
        f52113e = eVar;
        f52110b = new a<>("SignIn.API", bVar, gVar);
        f52116h = new a<>("SignIn.INTERNAL_API", eVar, gVar2);
    }
}
