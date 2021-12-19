package com.zhihu.matisse.internal.entity;

import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.b;
import java.util.List;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public Set<b> f156432a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f156433b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f156434c;

    /* renamed from: d  reason: collision with root package name */
    public int f156435d;

    /* renamed from: e  reason: collision with root package name */
    public int f156436e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f156437f;

    /* renamed from: g  reason: collision with root package name */
    public int f156438g;

    /* renamed from: h  reason: collision with root package name */
    public int f156439h;

    /* renamed from: i  reason: collision with root package name */
    public int f156440i;

    /* renamed from: j  reason: collision with root package name */
    public List<com.zhihu.matisse.a.a> f156441j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f156442k;

    /* renamed from: l  reason: collision with root package name */
    public a f156443l;

    /* renamed from: m  reason: collision with root package name */
    public int f156444m;
    public int n;
    public float o;
    public boolean p;
    public com.zhihu.matisse.b.c q;
    public boolean r;
    public boolean s;
    public int t;
    public com.zhihu.matisse.b.a u;

    static {
        Covode.recordClassIndex(103889);
    }

    private c() {
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f156445a = new c((byte) 0);

        static {
            Covode.recordClassIndex(103890);
        }
    }

    public final boolean b() {
        if (this.f156436e != -1) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        if (this.f156437f) {
            return false;
        }
        if (this.f156438g == 1 || (this.f156439h == 1 && this.f156440i == 1)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (!this.f156434c || !b.ofImage().containsAll(this.f156432a)) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        if (!this.f156434c || !b.ofVideo().containsAll(this.f156432a)) {
            return false;
        }
        return true;
    }

    /* synthetic */ c(byte b2) {
        this();
    }
}
