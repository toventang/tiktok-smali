package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.m;

public class c<T extends b, K extends m> implements o {

    /* renamed from: h  reason: collision with root package name */
    public T f76396h;

    /* renamed from: i  reason: collision with root package name */
    public K f76397i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f76398j = true;

    static {
        Covode.recordClassIndex(47151);
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public void a_(Exception exc) {
    }

    public void b() {
    }

    @Override // com.ss.android.ugc.aweme.common.o
    public void c() {
    }

    public void cd_() {
        this.f76397i = null;
        h();
    }

    public final boolean i() {
        if (this.f76397i != null) {
            return true;
        }
        return false;
    }

    public void h() {
        T t = this.f76396h;
        if (t != null) {
            t.clearNotifyListener(this);
            this.f76396h = null;
        }
    }

    public final boolean j() {
        T t = this.f76396h;
        if (t == null || !t.mIsLoading) {
            return false;
        }
        return true;
    }

    public void a_(K k2) {
        this.f76397i = k2;
    }

    public void a(T t) {
        this.f76396h = t;
        t.addNotifyListener(this);
    }

    public boolean a(Object... objArr) {
        if (this.f76396h == null || ((j() && this.f76398j) || !this.f76396h.sendRequest(objArr))) {
            return false;
        }
        b();
        return true;
    }
}
