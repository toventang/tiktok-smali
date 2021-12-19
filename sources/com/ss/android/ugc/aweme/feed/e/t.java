package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.video.i;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final o f92974a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f92975b;

    /* renamed from: c  reason: collision with root package name */
    private final String f92976c;

    /* renamed from: d  reason: collision with root package name */
    private final String f92977d;

    /* renamed from: e  reason: collision with root package name */
    private final al f92978e;

    /* renamed from: f  reason: collision with root package name */
    private final aj f92979f;

    /* renamed from: g  reason: collision with root package name */
    private final long f92980g;

    /* renamed from: h  reason: collision with root package name */
    private final String f92981h;

    /* renamed from: i  reason: collision with root package name */
    private final String f92982i;

    /* renamed from: j  reason: collision with root package name */
    private final String f92983j;

    /* renamed from: k  reason: collision with root package name */
    private final double f92984k;

    /* renamed from: l  reason: collision with root package name */
    private final String f92985l;

    /* renamed from: m  reason: collision with root package name */
    private final i f92986m;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;

    static {
        Covode.recordClassIndex(58987);
    }

    t(o oVar, Aweme aweme, String str, String str2, al alVar, aj ajVar, long j2, String str3, String str4, String str5, double d2, String str6, i iVar, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.f92974a = oVar;
        this.f92975b = aweme;
        this.f92976c = str;
        this.f92977d = str2;
        this.f92978e = alVar;
        this.f92979f = ajVar;
        this.f92980g = j2;
        this.f92981h = str3;
        this.f92982i = str4;
        this.f92983j = str5;
        this.f92984k = d2;
        this.f92985l = str6;
        this.f92986m = iVar;
        this.n = str7;
        this.o = str8;
        this.p = str9;
        this.q = str10;
        this.r = str11;
        this.s = str12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f92974a.a(this.f92975b, this.f92976c, this.f92977d, this.f92978e, this.f92979f, this.f92980g, this.f92981h, this.f92982i, this.f92983j, this.f92984k, this.f92985l, this.f92986m, this.n, this.o, this.p, this.q, this.r, this.s);
    }
}
