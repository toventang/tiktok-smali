package androidx.h;

import androidx.h.d;
import androidx.h.h;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class e<Key, Value> extends b<Key, Value> {

    public static abstract class a<Value> {
        static {
            Covode.recordClassIndex(1107);
        }

        public abstract void a(List<Value> list);
    }

    public static abstract class c<Value> extends a<Value> {
        static {
            Covode.recordClassIndex(1109);
        }

        public abstract void a(List<Value> list, int i2);
    }

    static {
        Covode.recordClassIndex(1106);
    }

    public abstract void a(C0046e<Key> eVar, c<Value> cVar);

    public abstract void a(f<Key> fVar, a<Value> aVar);

    public abstract Key b(Value value);

    public abstract void b(f<Key> fVar, a<Value> aVar);

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final Key a(Value value) {
        if (value == null) {
            return null;
        }
        return b((Object) value);
    }

    static class b<Value> extends a<Value> {

        /* renamed from: a  reason: collision with root package name */
        final d.c<Value> f3098a;

        static {
            Covode.recordClassIndex(1108);
        }

        @Override // androidx.h.e.a
        public final void a(List<Value> list) {
            if (!this.f3098a.a()) {
                this.f3098a.a(new h<>(list, 0, 0));
            }
        }

        b(e eVar, int i2, Executor executor, h.a<Value> aVar) {
            this.f3098a = new d.c<>(eVar, i2, executor, aVar);
        }
    }

    static class d<Value> extends c<Value> {

        /* renamed from: a  reason: collision with root package name */
        final d.c<Value> f3099a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3100b;

        static {
            Covode.recordClassIndex(1110);
        }

        @Override // androidx.h.e.a
        public final void a(List<Value> list) {
            if (!this.f3099a.a()) {
                this.f3099a.a(new h<>(list, 0, 0));
            }
        }

        @Override // androidx.h.e.c
        public final void a(List<Value> list, int i2) {
            if (this.f3099a.a()) {
                return;
            }
            if (list.size() + 0 > i2) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            } else if (list.size() != 0 || i2 <= 0) {
                int size = (i2 - 0) - list.size();
                if (this.f3100b) {
                    this.f3099a.a(new h<>(list, size, 0));
                } else {
                    this.f3099a.a(new h<>(list));
                }
            } else {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
        }

        d(e eVar, boolean z, h.a<Value> aVar) {
            this.f3099a = new d.c<>(eVar, 0, null, aVar);
            this.f3100b = z;
        }
    }

    public static class f<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f3104a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3105b;

        static {
            Covode.recordClassIndex(1112);
        }

        public f(Key key, int i2) {
            this.f3104a = key;
            this.f3105b = i2;
        }
    }

    /* renamed from: androidx.h.e$e  reason: collision with other inner class name */
    public static class C0046e<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f3101a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3102b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3103c;

        static {
            Covode.recordClassIndex(1111);
        }

        public C0046e(Key key, int i2, boolean z) {
            this.f3101a = key;
            this.f3102b = i2;
            this.f3103c = z;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final void a(Value value, int i2, Executor executor, h.a<Value> aVar) {
        a(new f<>(b((Object) value), i2), new b(this, 1, executor, aVar));
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final void b(Value value, int i2, Executor executor, h.a<Value> aVar) {
        b(new f<>(b((Object) value), i2), new b(this, 2, executor, aVar));
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.h.b
    public final void a(Key key, int i2, boolean z, Executor executor, h.a<Value> aVar) {
        d dVar = new d(this, z, aVar);
        a(new C0046e<>(key, i2, z), dVar);
        dVar.f3099a.a(executor);
    }
}
