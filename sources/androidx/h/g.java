package androidx.h;

import androidx.h.d;
import androidx.h.h;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class g<Key, Value> extends b<Key, Value> {

    /* renamed from: b  reason: collision with root package name */
    final Object f3119b = new Object();

    /* renamed from: c  reason: collision with root package name */
    Key f3120c = null;

    /* renamed from: d  reason: collision with root package name */
    Key f3121d = null;

    public static abstract class a<Key, Value> {
        static {
            Covode.recordClassIndex(1117);
        }

        public abstract void a(List<Value> list, Key key);
    }

    public static abstract class c<Key, Value> {
        static {
            Covode.recordClassIndex(1119);
        }

        public abstract void a(List<Value> list, Key key);
    }

    static {
        Covode.recordClassIndex(1116);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final Key a(Value value) {
        return null;
    }

    public abstract void a(e<Key> eVar, c<Key, Value> cVar);

    public abstract void a(f<Key> fVar, a<Key, Value> aVar);

    private Key b() {
        Key key;
        synchronized (this.f3119b) {
            key = this.f3121d;
        }
        return key;
    }

    private Key c() {
        Key key;
        synchronized (this.f3119b) {
            key = this.f3120c;
        }
        return key;
    }

    public static class e<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final int f3127a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3128b;

        static {
            Covode.recordClassIndex(1121);
        }

        public e(int i2, boolean z) {
            this.f3127a = i2;
            this.f3128b = z;
        }
    }

    public static class f<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f3129a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3130b;

        static {
            Covode.recordClassIndex(1122);
        }

        public f(Key key, int i2) {
            this.f3129a = key;
            this.f3130b = i2;
        }
    }

    static class b<Key, Value> extends a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        final d.c<Value> f3122a;

        /* renamed from: b  reason: collision with root package name */
        private final g<Key, Value> f3123b;

        static {
            Covode.recordClassIndex(1118);
        }

        @Override // androidx.h.g.a
        public final void a(List<Value> list, Key key) {
            if (!this.f3122a.a()) {
                if (this.f3122a.f3090a == 1) {
                    g<Key, Value> gVar = this.f3123b;
                    synchronized (gVar.f3119b) {
                        gVar.f3120c = key;
                    }
                } else {
                    g<Key, Value> gVar2 = this.f3123b;
                    synchronized (gVar2.f3119b) {
                        gVar2.f3121d = key;
                    }
                }
                this.f3122a.a(new h<>(list, 0, 0));
            }
        }

        b(g<Key, Value> gVar, int i2, Executor executor, h.a<Value> aVar) {
            this.f3122a = new d.c<>(gVar, i2, executor, aVar);
            this.f3123b = gVar;
        }
    }

    static class d<Key, Value> extends c<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        final d.c<Value> f3124a;

        /* renamed from: b  reason: collision with root package name */
        private final g<Key, Value> f3125b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3126c;

        static {
            Covode.recordClassIndex(1120);
        }

        @Override // androidx.h.g.c
        public final void a(List<Value> list, Key key) {
            if (!this.f3124a.a()) {
                g<Key, Value> gVar = this.f3125b;
                synchronized (gVar.f3119b) {
                    gVar.f3121d = null;
                    gVar.f3120c = key;
                }
                this.f3124a.a(new h<>(list, 0, 0));
            }
        }

        d(g<Key, Value> gVar, boolean z, h.a<Value> aVar) {
            this.f3124a = new d.c<>(gVar, 0, null, aVar);
            this.f3125b = gVar;
            this.f3126c = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final void a(Value value, int i2, Executor executor, h.a<Value> aVar) {
        Key c2 = c();
        if (c2 != null) {
            a(new f<>(c2, i2), new b(this, 1, executor, aVar));
        } else {
            aVar.a(1, h.f3131a);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final void b(Value value, int i2, Executor executor, h.a<Value> aVar) {
        Key b2 = b();
        if (b2 != null) {
            new f(b2, i2);
            new b(this, 2, executor, aVar);
            return;
        }
        aVar.a(2, h.f3131a);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final void a(Key key, int i2, boolean z, Executor executor, h.a<Value> aVar) {
        d dVar = new d(this, z, aVar);
        a(new e<>(i2, z), dVar);
        dVar.f3124a.a(executor);
    }
}
