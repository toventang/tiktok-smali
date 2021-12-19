package com.bytedance.android.live.core.paging;

import androidx.h.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.android.live.core.e.b;
import com.bytedance.covode.number.Covode;
import f.a.l.c;

public class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private LiveData<i<T>> f9123a;

    /* renamed from: b  reason: collision with root package name */
    private t<b> f9124b;

    /* renamed from: c  reason: collision with root package name */
    private t<b> f9125c;

    /* renamed from: d  reason: collision with root package name */
    private t<Boolean> f9126d;

    /* renamed from: e  reason: collision with root package name */
    private c<Object> f9127e;

    /* renamed from: f  reason: collision with root package name */
    private c<Object> f9128f;

    /* renamed from: g  reason: collision with root package name */
    private c<Object> f9129g;

    /* renamed from: h  reason: collision with root package name */
    private t<Integer> f9130h;

    /* renamed from: i  reason: collision with root package name */
    private t<Boolean> f9131i;

    static {
        Covode.recordClassIndex(4677);
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final LiveData<i<T>> a() {
        return this.f9123a;
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final LiveData<b> b() {
        return this.f9124b;
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final LiveData<b> c() {
        return this.f9125c;
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final LiveData<Boolean> d() {
        return this.f9131i;
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final LiveData<Boolean> e() {
        return this.f9126d;
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final LiveData<Integer> i() {
        return this.f9130h;
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final void f() {
        this.f9127e.onNext(com.bytedance.android.livesdk.util.rxutils.i.f22198c);
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final void g() {
        this.f9128f.onNext(com.bytedance.android.livesdk.util.rxutils.i.f22198c);
    }

    @Override // com.bytedance.android.live.core.paging.b
    public final void h() {
        this.f9129g.onNext(com.bytedance.android.livesdk.util.rxutils.i.f22198c);
    }

    @Override // com.bytedance.android.live.core.paging.b
    public void j() {
        throw new RuntimeException("unsupported operation");
    }

    @Override // com.bytedance.android.live.core.paging.b
    public int k() {
        throw new RuntimeException("unsupported operation");
    }

    public a(com.bytedance.android.live.core.paging.b.a<T> aVar, LiveData<i<T>> liveData) {
        this.f9124b = aVar.a();
        this.f9125c = aVar.b();
        this.f9131i = aVar.c();
        this.f9127e = aVar.e();
        this.f9128f = aVar.f();
        this.f9129g = aVar.g();
        this.f9123a = liveData;
        this.f9126d = aVar.d();
        this.f9130h = aVar.h();
    }
}
