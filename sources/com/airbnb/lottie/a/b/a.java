package com.airbnb.lottie.a.b;

import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    final List<AbstractC0073a> f5257a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f5258b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f5259c = 0.0f;

    /* renamed from: d  reason: collision with root package name */
    protected com.airbnb.lottie.j.c<A> f5260d;

    /* renamed from: e  reason: collision with root package name */
    private c<K> f5261e;

    /* renamed from: f  reason: collision with root package name */
    private final List<? extends com.airbnb.lottie.j.a<K>> f5262f;

    /* renamed from: g  reason: collision with root package name */
    private com.airbnb.lottie.j.a<K> f5263g;

    /* renamed from: h  reason: collision with root package name */
    private A f5264h = null;

    /* renamed from: i  reason: collision with root package name */
    private float f5265i = -1.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f5266j = -1.0f;

    /* renamed from: com.airbnb.lottie.a.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0073a {
        static {
            Covode.recordClassIndex(2208);
        }

        void a();
    }

    /* access modifiers changed from: package-private */
    public interface c<T> {
        static {
            Covode.recordClassIndex(2210);
        }

        boolean a();

        boolean a(float f2);

        com.airbnb.lottie.j.a<T> b();

        boolean b(float f2);

        float c();

        float d();
    }

    static {
        Covode.recordClassIndex(2207);
    }

    /* access modifiers changed from: package-private */
    public abstract A a(com.airbnb.lottie.j.a<K> aVar, float f2);

    static final class b<T> implements c<T> {
        static {
            Covode.recordClassIndex(2209);
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean a() {
            return true;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean a(float f2) {
            return false;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final float c() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final float d() {
            return 1.0f;
        }

        private b() {
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final com.airbnb.lottie.j.a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean b(float f2) {
            throw new IllegalStateException("not implemented");
        }
    }

    static final class d<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<? extends com.airbnb.lottie.j.a<T>> f5267a;

        /* renamed from: b  reason: collision with root package name */
        private com.airbnb.lottie.j.a<T> f5268b;

        /* renamed from: c  reason: collision with root package name */
        private com.airbnb.lottie.j.a<T> f5269c;

        /* renamed from: d  reason: collision with root package name */
        private float f5270d = -1.0f;

        static {
            Covode.recordClassIndex(2211);
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean a() {
            return false;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final com.airbnb.lottie.j.a<T> b() {
            return this.f5268b;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final float c() {
            return ((com.airbnb.lottie.j.a) this.f5267a.get(0)).b();
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final float d() {
            List<? extends com.airbnb.lottie.j.a<T>> list = this.f5267a;
            return ((com.airbnb.lottie.j.a) list.get(list.size() - 1)).c();
        }

        d(List<? extends com.airbnb.lottie.j.a<T>> list) {
            this.f5267a = list;
            this.f5268b = c(0.0f);
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean a(float f2) {
            if (!this.f5268b.a(f2)) {
                this.f5268b = c(f2);
                return true;
            } else if (!this.f5268b.d()) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean b(float f2) {
            com.airbnb.lottie.j.a<T> aVar = this.f5269c;
            com.airbnb.lottie.j.a<T> aVar2 = this.f5268b;
            if (aVar == aVar2 && this.f5270d == f2) {
                return true;
            }
            this.f5269c = aVar2;
            this.f5270d = f2;
            return false;
        }

        private com.airbnb.lottie.j.a<T> c(float f2) {
            List<? extends com.airbnb.lottie.j.a<T>> list = this.f5267a;
            com.airbnb.lottie.j.a<T> aVar = (com.airbnb.lottie.j.a) list.get(list.size() - 1);
            if (f2 >= aVar.b()) {
                return aVar;
            }
            for (int size = this.f5267a.size() - 2; size > 0; size--) {
                com.airbnb.lottie.j.a<T> aVar2 = (com.airbnb.lottie.j.a) this.f5267a.get(size);
                if (this.f5268b != aVar2 && aVar2.a(f2)) {
                    return aVar2;
                }
            }
            return (com.airbnb.lottie.j.a) this.f5267a.get(0);
        }
    }

    static final class e<T> implements c<T> {

        /* renamed from: a  reason: collision with root package name */
        private final com.airbnb.lottie.j.a<T> f5271a;

        /* renamed from: b  reason: collision with root package name */
        private float f5272b = -1.0f;

        static {
            Covode.recordClassIndex(2212);
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean a() {
            return false;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final com.airbnb.lottie.j.a<T> b() {
            return this.f5271a;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final float c() {
            return this.f5271a.b();
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final float d() {
            return this.f5271a.c();
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean a(float f2) {
            if (!this.f5271a.d()) {
                return true;
            }
            return false;
        }

        @Override // com.airbnb.lottie.a.b.a.c
        public final boolean b(float f2) {
            if (this.f5272b == f2) {
                return true;
            }
            this.f5272b = f2;
            return false;
        }

        e(List<? extends com.airbnb.lottie.j.a<T>> list) {
            this.f5271a = (com.airbnb.lottie.j.a) list.get(0);
        }
    }

    public void a() {
        for (int i2 = 0; i2 < this.f5257a.size(); i2++) {
            this.f5257a.get(i2).a();
        }
    }

    /* access modifiers changed from: protected */
    public final float d() {
        com.airbnb.lottie.j.a<K> b2 = b();
        if (b2.d()) {
            return 0.0f;
        }
        return b2.f5712d.getInterpolation(c());
    }

    private float g() {
        c<K> cVar;
        if (d.a.f5625a && (cVar = this.f5261e) != null) {
            if (this.f5265i == -1.0f) {
                this.f5265i = cVar.c();
            }
            return this.f5265i;
        } else if (this.f5262f.isEmpty()) {
            return 0.0f;
        } else {
            return ((com.airbnb.lottie.j.a) this.f5262f.get(0)).b();
        }
    }

    /* access modifiers changed from: package-private */
    public final float c() {
        if (this.f5258b) {
            return 0.0f;
        }
        com.airbnb.lottie.j.a<K> b2 = b();
        if (b2.d()) {
            return 0.0f;
        }
        return (this.f5259c - b2.b()) / (b2.c() - b2.b());
    }

    /* access modifiers changed from: package-private */
    public float e() {
        c<K> cVar;
        if (d.a.f5625a && (cVar = this.f5261e) != null) {
            if (this.f5266j == -1.0f) {
                this.f5266j = cVar.d();
            }
            return this.f5266j;
        } else if (this.f5262f.isEmpty()) {
            return 1.0f;
        } else {
            List<? extends com.airbnb.lottie.j.a<K>> list = this.f5262f;
            return ((com.airbnb.lottie.j.a) list.get(list.size() - 1)).c();
        }
    }

    public A f() {
        if (!d.a.f5625a || this.f5261e == null) {
            return a(b(), d());
        }
        float d2 = d();
        if (this.f5260d == null && this.f5261e.b(d2)) {
            return this.f5264h;
        }
        A a2 = a(b(), d2);
        this.f5264h = a2;
        return a2;
    }

    /* access modifiers changed from: protected */
    public final com.airbnb.lottie.j.a<K> b() {
        c<K> cVar;
        if (d.a.f5625a && (cVar = this.f5261e) != null) {
            return cVar.b();
        }
        com.airbnb.lottie.j.a<K> aVar = this.f5263g;
        if (aVar != null && aVar.a(this.f5259c)) {
            return this.f5263g;
        }
        List<? extends com.airbnb.lottie.j.a<K>> list = this.f5262f;
        com.airbnb.lottie.j.a<K> aVar2 = (com.airbnb.lottie.j.a) list.get(list.size() - 1);
        if (this.f5259c < aVar2.b()) {
            for (int size = this.f5262f.size() - 1; size >= 0; size--) {
                aVar2 = (com.airbnb.lottie.j.a) this.f5262f.get(size);
                if (aVar2.a(this.f5259c)) {
                    break;
                }
            }
        }
        this.f5263g = aVar2;
        return aVar2;
    }

    public final void a(AbstractC0073a aVar) {
        this.f5257a.add(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.airbnb.lottie.a.b.a<K, A> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.airbnb.lottie.j.c<A> cVar) {
        com.airbnb.lottie.j.c<A> cVar2 = this.f5260d;
        if (cVar2 != null) {
            cVar2.f5730a = null;
        }
        this.f5260d = cVar;
        if (cVar != null) {
            cVar.f5730a = this;
        }
    }

    a(List<? extends com.airbnb.lottie.j.a<K>> list) {
        c<K> dVar;
        this.f5262f = list;
        if (d.a.f5625a) {
            if (list.isEmpty()) {
                dVar = new b<>((byte) 0);
            } else if (list.size() == 1) {
                dVar = new e<>(list);
            } else {
                dVar = new d<>(list);
            }
            this.f5261e = dVar;
        }
    }

    public void a(float f2) {
        c<K> cVar;
        c<K> cVar2;
        if (!d.a.f5625a || (cVar2 = this.f5261e) == null || !cVar2.a()) {
            if (f2 < g()) {
                f2 = g();
            } else if (f2 > e()) {
                f2 = e();
            }
            if (f2 != this.f5259c) {
                this.f5259c = f2;
                if (!d.a.f5625a || (cVar = this.f5261e) == null || cVar.a(f2)) {
                    a();
                }
            }
        }
    }
}
