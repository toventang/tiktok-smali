package com.ttnet.org.chromium.base.task;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f155334a;

    /* renamed from: b  reason: collision with root package name */
    public static final p f155335b;

    /* renamed from: c  reason: collision with root package name */
    public static final p f155336c;

    /* renamed from: d  reason: collision with root package name */
    public static final p f155337d;

    /* renamed from: e  reason: collision with root package name */
    public static final p f155338e;

    /* renamed from: f  reason: collision with root package name */
    public static final p f155339f;

    /* renamed from: g  reason: collision with root package name */
    public static final p f155340g;

    /* renamed from: h  reason: collision with root package name */
    public static final p f155341h;

    /* renamed from: i  reason: collision with root package name */
    public static final p f155342i;

    /* renamed from: j  reason: collision with root package name */
    public static final p f155343j;

    /* renamed from: k  reason: collision with root package name */
    public static final p f155344k;
    static final /* synthetic */ boolean s = true;

    /* renamed from: l  reason: collision with root package name */
    boolean f155345l;

    /* renamed from: m  reason: collision with root package name */
    int f155346m;
    boolean n;
    boolean o;
    byte p;
    byte[] q;
    boolean r;

    private p() {
        this.f155346m = 1;
    }

    private p a() {
        p pVar = new p(this);
        pVar.n = true;
        return pVar;
    }

    public int hashCode() {
        return (((((((((((((!this.f155345l ? 1 : 0) + 1147) * 37) + this.f155346m) * 37) + (!this.n ? 1 : 0)) * 37) + (!this.o ? 1 : 0)) * 37) + this.p) * 37) + Arrays.hashCode(this.q)) * 37) + (!this.r ? 1 : 0);
    }

    static {
        Covode.recordClassIndex(103358);
        p a2 = new p().a(0);
        f155334a = a2;
        f155335b = a2.a();
        p a3 = new p().a(1);
        f155336c = a3;
        f155337d = a3.a();
        p a4 = new p().a(2);
        f155338e = a4;
        f155339f = a4.a();
        p pVar = new p();
        f155340g = pVar;
        pVar.r = true;
        p pVar2 = new p(new p());
        pVar2.o = true;
        f155341h = pVar2;
        f155342i = pVar2.a(2);
        f155343j = pVar2.a(1);
        f155344k = pVar2.a(0);
    }

    private p(p pVar) {
        this.f155345l = pVar.f155345l;
        this.f155346m = pVar.f155346m;
        this.n = pVar.n;
        this.o = pVar.o;
        this.p = pVar.p;
        this.q = pVar.q;
    }

    private p a(int i2) {
        p pVar = new p(this);
        pVar.f155345l = true;
        pVar.f155346m = i2;
        return pVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f155345l == pVar.f155345l && this.f155346m == pVar.f155346m && this.p == pVar.p && Arrays.equals(this.q, pVar.q)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
