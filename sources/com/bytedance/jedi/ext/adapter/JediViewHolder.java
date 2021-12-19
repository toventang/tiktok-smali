package com.bytedance.jedi.ext.adapter;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.ext.adapter.b.e;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.internal.b;
import com.bytedance.jedi.ext.adapter.internal.f;
import com.ss.android.ugc.aweme.au;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.k.k;
import h.p;
import h.w;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class JediViewHolder<R extends g, ITEM> extends e<ITEM> implements m, k<R>, au {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39562a = {new y(ab.a(JediViewHolder.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;")};

    /* renamed from: b  reason: collision with root package name */
    public m f39563b;

    /* renamed from: c  reason: collision with root package name */
    public f f39564c;

    /* renamed from: d  reason: collision with root package name */
    public JediViewHolderProxy f39565d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39566e;

    /* renamed from: f  reason: collision with root package name */
    private final h f39567f = h.i.a((h.f.a.a) new a(this));

    private final n n() {
        return (n) this.f39567f.getValue();
    }

    public void a(List<Object> list) {
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e
    public final void b(ITEM item) {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return false;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            create$ext_adapter_release();
        } else if (aVar == i.a.ON_START) {
            start$ext_adapter_release();
        } else if (aVar == i.a.ON_RESUME) {
            resume$ext_adapter_release();
        } else if (aVar == i.a.ON_PAUSE) {
            pause$ext_adapter_release();
        } else if (aVar == i.a.ON_STOP) {
            stop$ext_adapter_release();
        } else if (aVar == i.a.ON_DESTROY) {
            destroy$ext_adapter_release();
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.k
    public final c ap_() {
        return this.f39565d;
    }

    static final class a extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ JediViewHolder this$0;

        static {
            Covode.recordClassIndex(24364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(JediViewHolder jediViewHolder) {
            super(0);
            this.this$0 = jediViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return n();
    }

    private final b m() {
        f fVar = this.f39564c;
        if (fVar == null) {
            l.a("provider");
        }
        return fVar.f39744b;
    }

    @v(a = i.a.ON_DESTROY)
    public final void destroy$ext_adapter_release() {
        j();
        o();
        n().a(i.a.ON_DESTROY);
    }

    @Override // com.bytedance.jedi.arch.h
    public com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        c ap_ = ap_();
        if (ap_ != null) {
            return ap_;
        }
        throw new w("null cannot be cast to non-null type");
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<R> getReceiverHolder() {
        c ap_ = ap_();
        if (ap_ != null) {
            return ap_;
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final m k() {
        m mVar = this.f39563b;
        if (mVar == null) {
            l.a("parent");
        }
        return mVar;
    }

    static {
        Covode.recordClassIndex(24363);
    }

    private final void o() {
        m mVar = this.f39563b;
        if (mVar == null) {
            l.a("parent");
        }
        mVar.getLifecycle().b(this);
        p();
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e
    public void bW_() {
        super.bW_();
        JediViewHolderProxy jediViewHolderProxy = this.f39565d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f39714b) {
            jediViewHolderProxy.f39715c = true;
        }
        p();
    }

    @v(a = i.a.ON_PAUSE)
    public final void pause$ext_adapter_release() {
        if (this.f39566e) {
            h();
            n().a(i.a.ON_PAUSE);
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void resume$ext_adapter_release() {
        if (this.f39566e) {
            g();
            n().a(i.a.ON_RESUME);
        }
    }

    @v(a = i.a.ON_START)
    public final void start$ext_adapter_release() {
        if (this.f39566e) {
            f();
            n().a(i.a.ON_START);
            JediViewHolderProxy jediViewHolderProxy = this.f39565d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f39714b) {
                jediViewHolderProxy.a(false);
            }
        }
    }

    @v(a = i.a.ON_STOP)
    public final void stop$ext_adapter_release() {
        if (this.f39566e) {
            i();
            n().a(i.a.ON_STOP);
            JediViewHolderProxy jediViewHolderProxy = this.f39565d;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.f39714b) {
                jediViewHolderProxy.b(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 != 3) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void p() {
        /*
            r2 = this;
            androidx.lifecycle.i r0 = r2.getLifecycle()
            androidx.lifecycle.i$b r0 = r0.a()
            int[] r1 = com.bytedance.jedi.ext.adapter.h.f39710b
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x001d
            r0 = 2
            if (r1 == r0) goto L_0x0020
            r0 = 3
            if (r1 == r0) goto L_0x0020
        L_0x0019:
            r0 = 0
            r2.f39566e = r0
            return
        L_0x001d:
            r2.pause$ext_adapter_release()
        L_0x0020:
            r2.stop$ext_adapter_release()
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.JediViewHolder.p():void");
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e
    public void aq_() {
        super.aq_();
        JediViewHolderProxy jediViewHolderProxy = this.f39565d;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.f39714b) {
            jediViewHolderProxy.f39715c = false;
        }
        this.f39566e = true;
        int i2 = h.f39709a[getLifecycle().a().ordinal()];
        if (i2 == 2) {
            start$ext_adapter_release();
            resume$ext_adapter_release();
        } else if (i2 == 3) {
            resume$ext_adapter_release();
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void create$ext_adapter_release() {
        b m2 = m();
        int i2 = this.f39676i;
        if (i2 < 0 || i2 >= m2.f39728a.size() || !m2.f39728a.get(i2).booleanValue()) {
            e();
            m().a(this.f39676i, true);
            n().a(i.a.ON_CREATE);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JediViewHolder(View view) {
        super(view);
        l.c(view, "");
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        l.c(vm1, "");
        l.c(bVar, "");
        l.c(vm1, "");
        l.c(bVar, "");
        return (R) h.a.a(vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super R, ? super S, z> mVar) {
        l.c(jediViewModel, "");
        l.c(ahVar, "");
        l.c(mVar, "");
        l.c(jediViewModel, "");
        l.c(ahVar, "");
        l.c(mVar, "");
        return h.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.b.e
    public final void b(ITEM item, int i2, List<Object> list) {
        JediViewHolderProxy jediViewHolderProxy;
        Object obj;
        super.b(item, i2, list);
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(next instanceof p)) {
                    next = null;
                }
                T t = next;
                if (t != null) {
                    obj = t.getSecond();
                } else {
                    obj = null;
                }
                if (obj == e.f39692a) {
                    break;
                }
            }
        }
        this.f39566e = true;
        o();
        f fVar = this.f39564c;
        if (fVar == null) {
            l.a("provider");
        }
        com.bytedance.jedi.ext.adapter.internal.g gVar = fVar.f39745c;
        if (i2 < 0 || i2 >= gVar.f39748a.size() || (jediViewHolderProxy = gVar.f39748a.get(i2)) == null) {
            jediViewHolderProxy = fVar.f39743a.invoke();
            fVar.f39745c.a(i2, jediViewHolderProxy);
        }
        JediViewHolderProxy jediViewHolderProxy2 = this.f39565d;
        if (!(jediViewHolderProxy == jediViewHolderProxy2 || jediViewHolderProxy2 == null || this != jediViewHolderProxy2.f39714b)) {
            f fVar2 = this.f39564c;
            if (fVar2 == null) {
                l.a("provider");
            }
            jediViewHolderProxy2.a(fVar2.f39746d, null);
        }
        f fVar3 = this.f39564c;
        if (fVar3 == null) {
            l.a("provider");
        }
        jediViewHolderProxy.a(fVar3.f39746d, this);
        this.f39566e = true;
        m mVar = this.f39563b;
        if (mVar == null) {
            l.a("parent");
        }
        mVar.getLifecycle().a(this);
        a(list);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super R, ? super A, z> mVar) {
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(ahVar, "");
        l.c(mVar, "");
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(ahVar, "");
        l.c(mVar, "");
        return h.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super R, ? super A, ? super B, z> qVar) {
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(ahVar, "");
        l.c(qVar, "");
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(ahVar, "");
        l.c(qVar, "");
        return h.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super R, ? super Throwable, z> mVar, h.f.a.b<? super R, z> bVar, h.f.a.m<? super R, ? super T, z> mVar2) {
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(ahVar, "");
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(ahVar, "");
        return h.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super R, ? super A, ? super B, ? super C, z> rVar) {
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(ahVar, "");
        l.c(rVar, "");
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(ahVar, "");
        l.c(rVar, "");
        return h.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super R, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(kVar4, "");
        l.c(ahVar, "");
        l.c(sVar, "");
        l.c(jediViewModel, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(kVar3, "");
        l.c(kVar4, "");
        l.c(ahVar, "");
        l.c(sVar, "");
        return h.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
