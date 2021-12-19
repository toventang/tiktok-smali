package com.bytedance.android.live.core.paging.viewmodel;

import androidx.h.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.android.live.core.e.b;
import com.bytedance.android.livesdk.util.rxutils.RxViewModel;
import com.bytedance.covode.number.Covode;

public class PagingViewModel<T> extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final u<b> f9210a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    public t<b> f9211b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public t<b> f9212c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public t<Boolean> f9213d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public t<Boolean> f9214e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public t<Integer> f9215f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public t<i<T>> f9216g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    public com.bytedance.android.live.core.paging.b<T> f9217h;

    /* renamed from: i  reason: collision with root package name */
    private final u<b> f9218i = new b(this);

    /* renamed from: j  reason: collision with root package name */
    private final u<i<T>> f9219j = new c(this);

    /* renamed from: k  reason: collision with root package name */
    private final u<Boolean> f9220k = new d(this);

    /* renamed from: l  reason: collision with root package name */
    private final u<Boolean> f9221l = new e(this);

    /* renamed from: m  reason: collision with root package name */
    private final u<Integer> f9222m = new f(this);

    static {
        Covode.recordClassIndex(4715);
    }

    public void b() {
        com.bytedance.android.live.core.paging.b<T> bVar = this.f9217h;
        if (bVar != null) {
            bVar.g();
        }
    }

    public boolean a() {
        com.bytedance.android.live.core.paging.b<T> bVar;
        if ((this.f9212c.getValue() != null && this.f9212c.getValue().a()) || (bVar = this.f9217h) == null) {
            return false;
        }
        bVar.f();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(com.bytedance.android.live.core.paging.b<T> bVar) {
        com.bytedance.android.live.core.paging.b<T> bVar2 = this.f9217h;
        if (bVar2 != null) {
            bVar2.b().removeObserver(this.f9210a);
            this.f9217h.c().removeObserver(this.f9218i);
            this.f9217h.a().removeObserver(this.f9219j);
            this.f9217h.e().removeObserver(this.f9220k);
            this.f9217h.d().removeObserver(this.f9221l);
            this.f9217h.i().removeObserver(this.f9222m);
        }
        this.f9217h = bVar;
        if (bVar != null) {
            bVar.b().observeForever(this.f9210a);
            this.f9217h.c().observeForever(this.f9218i);
            this.f9217h.a().observeForever(this.f9219j);
            this.f9217h.e().observeForever(this.f9220k);
            this.f9217h.d().observeForever(this.f9221l);
            this.f9217h.i().observeForever(this.f9222m);
        }
    }
}
