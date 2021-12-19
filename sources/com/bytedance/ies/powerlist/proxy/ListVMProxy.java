package com.bytedance.ies.powerlist.proxy;

import androidx.lifecycle.ad;
import androidx.lifecycle.af;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.b.a;
import com.bytedance.tiktok.proxy.d;
import h.f.b.l;
import h.h;
import h.i;

public final class ListVMProxy<R extends com.bytedance.tiktok.proxy.d, ITEM extends com.bytedance.ies.powerlist.b.a> implements k, com.bytedance.tiktok.proxy.a<R, ITEM> {

    /* renamed from: d  reason: collision with root package name */
    public static final h f34419d = i.a((h.f.a.a) b.f34429a);

    /* renamed from: e  reason: collision with root package name */
    public static final a f34420e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f34421a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.tiktok.proxy.c<R, ITEM, com.bytedance.tiktok.proxy.a<R, ITEM>> f34422b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.tiktok.proxy.b<R, ITEM> f34423c;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34424f;

    /* renamed from: g  reason: collision with root package name */
    private final h f34425g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f34426h;

    /* renamed from: i  reason: collision with root package name */
    private final af f34427i;

    /* renamed from: j  reason: collision with root package name */
    private final h f34428j;

    private ListVMProxy(byte b2) {
        this();
    }

    public final androidx.lifecycle.i a() {
        return (androidx.lifecycle.i) this.f34425g.getValue();
    }

    /* renamed from: b */
    public final n getLifecycle() {
        return (n) this.f34428j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.f
    public final m getActualLifecycleOwner() {
        return this;
    }

    @Override // androidx.lifecycle.ag
    public final af getViewModelStore() {
        return this.f34427i;
    }

    @Override // com.bytedance.tiktok.proxy.g
    public final boolean h() {
        return this.f34424f;
    }

    static final class c extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ ListVMProxy this$0;

        static {
            Covode.recordClassIndex(20564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ListVMProxy listVMProxy) {
            super(0);
            this.this$0 = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    private /* synthetic */ ListVMProxy() {
        this((com.bytedance.tiktok.proxy.b) null);
    }

    static final class b extends h.f.b.m implements h.f.a.a<ad.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34429a = new b();

        static {
            Covode.recordClassIndex(20563);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.a invoke() {
            return ad.a.a(com.bytedance.ies.powerlist.c.f34261b.b());
        }
    }

    public final void d() {
        androidx.lifecycle.i a2 = a();
        if (a2 != null) {
            a2.b(this);
        }
    }

    @Override // com.bytedance.tiktok.proxy.h
    public final R getActualReceiver() {
        com.bytedance.tiktok.proxy.c<R, ITEM, com.bytedance.tiktok.proxy.a<R, ITEM>> cVar = this.f34422b;
        if (cVar != null) {
            return cVar.aG_();
        }
        return null;
    }

    static final class d extends h.f.b.m implements h.f.a.a<androidx.lifecycle.i> {
        final /* synthetic */ ListVMProxy this$0;

        static {
            Covode.recordClassIndex(20565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ListVMProxy listVMProxy) {
            super(0);
            this.this$0 = listVMProxy;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.lifecycle.i invoke() {
            m aC_;
            com.bytedance.tiktok.proxy.c<R, ITEM, com.bytedance.tiktok.proxy.a<R, ITEM>> cVar = this.this$0.f34422b;
            if (cVar == null || (aC_ = cVar.aC_()) == null) {
                return null;
            }
            return aC_.getLifecycle();
        }
    }

    static {
        Covode.recordClassIndex(20561);
    }

    private final void e() {
        com.bytedance.tiktok.proxy.b<R, ITEM> bVar;
        if (!(getLifecycle().a() == i.b.CREATED || (bVar = this.f34423c) == null)) {
            bVar.c();
        }
        getLifecycle().a(i.a.ON_STOP);
    }

    public final void c() {
        com.bytedance.tiktok.proxy.c<R, ITEM, com.bytedance.tiktok.proxy.a<R, ITEM>> cVar = this.f34422b;
        if (cVar != null) {
            cVar.a(null);
        }
        this.f34422b = null;
        com.bytedance.tiktok.proxy.b<R, ITEM> bVar = this.f34423c;
        if (bVar != null) {
            bVar.a();
        }
    }

    private final void a(boolean z) {
        if (getLifecycle().a() != i.b.RESUMED) {
            com.bytedance.tiktok.proxy.b<R, ITEM> bVar = this.f34423c;
            if (bVar != null) {
                bVar.a(z);
            }
            this.f34424f = z;
        }
        getLifecycle().a(i.a.ON_RESUME);
    }

    public ListVMProxy(com.bytedance.tiktok.proxy.b<R, ITEM> bVar) {
        this.f34423c = bVar;
        this.f34425g = h.i.a((h.f.a.a) new d(this));
        this.f34427i = new af();
        this.f34428j = h.i.a((h.f.a.a) new c(this));
    }

    public final void a(PowerCell<ITEM> powerCell) {
        if (powerCell.f34237g) {
            if (l.a(powerCell, this.f34422b)) {
                this.f34426h = false;
            }
            e();
        }
    }

    public final void a(PowerCell<ITEM> powerCell, boolean z) {
        if (!this.f34426h) {
            if (l.a(powerCell, this.f34422b) && powerCell != null) {
                this.f34426h = true;
            }
            a(z);
        }
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        int i2 = a.f34431b[aVar.ordinal()];
        if (i2 == 1) {
            getLifecycle().a(i.a.ON_CREATE);
            com.bytedance.tiktok.proxy.b<R, ITEM> bVar = this.f34423c;
            if (bVar != null) {
                bVar.b();
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                e();
            } else if (i2 == 4) {
                int i3 = a.f34430a[getLifecycle().a().ordinal()];
                if (i3 == 1 || i3 == 2) {
                    e();
                }
                getLifecycle().a(i.a.ON_DESTROY);
                com.bytedance.tiktok.proxy.b<R, ITEM> bVar2 = this.f34423c;
                if (bVar2 != null) {
                    bVar2.d();
                }
            }
        } else if (this.f34426h && this.f34422b != null) {
            a(true);
        }
    }
}
