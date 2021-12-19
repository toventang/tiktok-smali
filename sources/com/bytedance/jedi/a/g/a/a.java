package com.bytedance.jedi.a.g.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public abstract class a<T> {
    static {
        Covode.recordClassIndex(23981);
    }

    /* access modifiers changed from: protected */
    public abstract int b(T t);

    /* access modifiers changed from: protected */
    public abstract boolean b(T t, T t2);

    /* renamed from: com.bytedance.jedi.a.g.a.a$a  reason: collision with other inner class name */
    public static final class C0947a extends a<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final C0947a f39130a = new C0947a();
        private static final long serialVersionUID = 1;

        C0947a() {
        }

        private Object readResolve() {
            return f39130a;
        }

        static {
            Covode.recordClassIndex(23982);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.a.g.a.a
        public final int b(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.a.g.a.a
        public final boolean b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    public static final class b extends a<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f39131a = new b();
        private static final long serialVersionUID = 1;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.a.g.a.a
        public final boolean b(Object obj, Object obj2) {
            return false;
        }

        b() {
        }

        private Object readResolve() {
            return f39131a;
        }

        static {
            Covode.recordClassIndex(23983);
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.jedi.a.g.a.a
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected a() {
    }

    public final int a(T t) {
        if (t == null) {
            return 0;
        }
        return b(t);
    }

    public final boolean a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return b(t, t2);
    }
}
