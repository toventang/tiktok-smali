package com.google.gson;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i extends l implements Iterable<l> {

    /* renamed from: a  reason: collision with root package name */
    private final List<l> f54724a;

    static {
        Covode.recordClassIndex(33938);
    }

    public final int a() {
        return this.f54724a.size();
    }

    public final int hashCode() {
        return this.f54724a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<l> iterator() {
        return this.f54724a.iterator();
    }

    public i() {
        this.f54724a = new ArrayList();
    }

    @Override // com.google.gson.l
    public final Number b() {
        if (this.f54724a.size() == 1) {
            return this.f54724a.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public final String c() {
        if (this.f54724a.size() == 1) {
            return this.f54724a.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public final double d() {
        if (this.f54724a.size() == 1) {
            return this.f54724a.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public final float e() {
        if (this.f54724a.size() == 1) {
            return this.f54724a.get(0).e();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public final long f() {
        if (this.f54724a.size() == 1) {
            return this.f54724a.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public final int g() {
        if (this.f54724a.size() == 1) {
            return this.f54724a.get(0).g();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public final boolean h() {
        if (this.f54724a.size() == 1) {
            return this.f54724a.get(0).h();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.l
    public final /* synthetic */ l i() {
        if (this.f54724a.isEmpty()) {
            return new i();
        }
        i iVar = new i(this.f54724a.size());
        for (l lVar : this.f54724a) {
            iVar.a(lVar.i());
        }
        return iVar;
    }

    public final l a(int i2) {
        return this.f54724a.get(i2);
    }

    private i(int i2) {
        this.f54724a = new ArrayList(i2);
    }

    public final void a(l lVar) {
        if (lVar == null) {
            lVar = n.f54897a;
        }
        this.f54724a.add(lVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i) || !((i) obj).f54724a.equals(this.f54724a)) {
            return false;
        }
        return true;
    }

    public final void a(String str) {
        l rVar;
        List<l> list = this.f54724a;
        if (str == null) {
            rVar = n.f54897a;
        } else {
            rVar = new r(str);
        }
        list.add(rVar);
    }
}
