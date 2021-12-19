package com.squareup.a;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f57811a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f57812b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f57813c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f57814d;

    /* renamed from: e  reason: collision with root package name */
    public final int f57815e;

    /* renamed from: f  reason: collision with root package name */
    public final int f57816f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f57817g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f57818h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f57819i;

    /* renamed from: j  reason: collision with root package name */
    public final int f57820j;

    /* renamed from: k  reason: collision with root package name */
    public final int f57821k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f57822l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f57823m;
    String n;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f57824a;

        /* renamed from: b  reason: collision with root package name */
        boolean f57825b;

        /* renamed from: c  reason: collision with root package name */
        int f57826c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f57827d = -1;

        /* renamed from: e  reason: collision with root package name */
        int f57828e = -1;

        /* renamed from: f  reason: collision with root package name */
        boolean f57829f;

        /* renamed from: g  reason: collision with root package name */
        boolean f57830g;

        static {
            Covode.recordClassIndex(35995);
        }

        public final a a() {
            this.f57824a = true;
            return this;
        }

        public final a b() {
            this.f57825b = true;
            return this;
        }

        public final d c() {
            return new d(this, (byte) 0);
        }
    }

    static {
        int i2;
        Covode.recordClassIndex(35994);
        a aVar = new a();
        aVar.f57824a = true;
        f57811a = aVar.c();
        a aVar2 = new a();
        aVar2.f57829f = true;
        long seconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        if (seconds > 2147483647L) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = (int) seconds;
        }
        aVar2.f57827d = i2;
        f57812b = aVar2.c();
    }

    public final String toString() {
        String sb;
        String str = this.n;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f57813c) {
            sb2.append("no-cache, ");
        }
        if (this.f57814d) {
            sb2.append("no-store, ");
        }
        if (this.f57815e != -1) {
            sb2.append("max-age=").append(this.f57815e).append(", ");
        }
        if (this.f57816f != -1) {
            sb2.append("s-maxage=").append(this.f57816f).append(", ");
        }
        if (this.f57817g) {
            sb2.append("private, ");
        }
        if (this.f57818h) {
            sb2.append("public, ");
        }
        if (this.f57819i) {
            sb2.append("must-revalidate, ");
        }
        if (this.f57820j != -1) {
            sb2.append("max-stale=").append(this.f57820j).append(", ");
        }
        if (this.f57821k != -1) {
            sb2.append("min-fresh=").append(this.f57821k).append(", ");
        }
        if (this.f57822l) {
            sb2.append("only-if-cached, ");
        }
        if (this.f57823m) {
            sb2.append("no-transform, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.n = sb;
        return sb;
    }

    private d(a aVar) {
        this.f57813c = aVar.f57824a;
        this.f57814d = aVar.f57825b;
        this.f57815e = aVar.f57826c;
        this.f57816f = -1;
        this.f57820j = aVar.f57827d;
        this.f57821k = aVar.f57828e;
        this.f57822l = aVar.f57829f;
        this.f57823m = aVar.f57830g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.squareup.a.d a(com.squareup.a.p r20) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.a.d.a(com.squareup.a.p):com.squareup.a.d");
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }

    private d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, String str) {
        this.f57813c = z;
        this.f57814d = z2;
        this.f57815e = i2;
        this.f57816f = i3;
        this.f57817g = z3;
        this.f57818h = z4;
        this.f57819i = z5;
        this.f57820j = i4;
        this.f57821k = i5;
        this.f57822l = z6;
        this.f57823m = z7;
        this.n = str;
    }
}
