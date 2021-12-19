package com.bytedance.jedi.ext.adapter.internal;

import androidx.lifecycle.ac;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ad;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.c;
import com.ss.android.ugc.aweme.au;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import java.util.Collection;
import java.util.Iterator;

public final class JediViewHolderProxy implements ad, c, au {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f39713a = {new y(ab.a(JediViewHolderProxy.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;")};

    /* renamed from: b  reason: collision with root package name */
    public JediViewHolder<? extends g, ?> f39714b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f39715c;

    /* renamed from: d  reason: collision with root package name */
    public d f39716d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f39717e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39718f = true;

    /* renamed from: g  reason: collision with root package name */
    private final h<androidx.lifecycle.h> f39719g = h.i.a((h.f.a.a) b.f39722a);

    /* renamed from: h  reason: collision with root package name */
    private boolean f39720h;

    /* renamed from: i  reason: collision with root package name */
    private final h f39721i = h.i.a((h.f.a.a) new a(this));

    private final n d() {
        return (n) this.f39721i.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.jedi.arch.ad
    public final boolean a() {
        return this.f39718f;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return this;
    }

    static final class a extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ JediViewHolderProxy this$0;

        static {
            Covode.recordClassIndex(24471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(JediViewHolderProxy jediViewHolderProxy) {
            super(0);
            this.this$0 = jediViewHolderProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<androidx.lifecycle.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39722a = new b();

        static {
            Covode.recordClassIndex(24472);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.h invoke() {
            return new androidx.lifecycle.h();
        }
    }

    @Override // androidx.lifecycle.m
    public final androidx.lifecycle.i getLifecycle() {
        return d();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public JediViewHolder<? extends g, ?> getReceiver() {
        if (this.f39715c) {
            return null;
        }
        return this.f39714b;
    }

    @Override // com.bytedance.jedi.ext.adapter.c
    public final androidx.lifecycle.h b() {
        return this.f39719g.getValue();
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        this.f39717e = false;
        d().a(i.a.ON_CREATE);
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        if (getReceiver() != null) {
            a(true);
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        if (getReceiver() != null) {
            b(true);
        }
    }

    static {
        Covode.recordClassIndex(24470);
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        d().a(i.a.ON_DESTROY);
        if (this.f39719g.isInitialized()) {
            androidx.lifecycle.h b2 = b();
            Collection<ac> values = b2.a().values();
            l.a((Object) values, "");
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                it.next().onCleared();
            }
            b2.a().clear();
        }
        this.f39717e = true;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder("Proxy@").append(Integer.toHexString(hashCode())).append('(').append("holder@");
        JediViewHolder<? extends g, ?> jediViewHolder = this.f39714b;
        if (jediViewHolder != null) {
            str = Integer.toHexString(jediViewHolder.hashCode());
        } else {
            str = null;
        }
        return append.append(str).append(",detached:").append(this.f39715c).append(",state:").append(getLifecycle().a()).append(')').toString();
    }

    public final void b(boolean z) {
        this.f39718f = z;
        d().a(i.a.ON_STOP);
    }

    public final void a(boolean z) {
        this.f39718f = z;
        if (!z) {
            this.f39720h = true;
        }
        if (this.f39720h) {
            d().a(i.a.ON_START);
        }
    }

    public final void a(d dVar, JediViewHolder<? extends g, ?> jediViewHolder) {
        l.c(dVar, "");
        if (jediViewHolder != null) {
            this.f39714b = jediViewHolder;
            jediViewHolder.f39565d = this;
            this.f39715c = false;
            dVar.a(this);
            return;
        }
        this.f39714b = null;
    }
}
