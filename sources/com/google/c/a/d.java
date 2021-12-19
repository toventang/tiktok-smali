package com.google.c.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public abstract class d<T> {
    static {
        Covode.recordClassIndex(33235);
    }

    /* access modifiers changed from: protected */
    public abstract int b(T t);

    /* access modifiers changed from: protected */
    public abstract boolean b(T t, T t2);

    public static final class a extends d<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f53684a = new a();
        private static final long serialVersionUID = 1;

        a() {
        }

        private Object readResolve() {
            return f53684a;
        }

        static {
            Covode.recordClassIndex(33236);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.a.d
        public final int b(Object obj) {
            return obj.hashCode();
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.a.d
        public final boolean b(Object obj, Object obj2) {
            return obj.equals(obj2);
        }
    }

    public static final class b extends d<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f53685a = new b();
        private static final long serialVersionUID = 1;

        /* access modifiers changed from: protected */
        @Override // com.google.c.a.d
        public final boolean b(Object obj, Object obj2) {
            return false;
        }

        b() {
        }

        private Object readResolve() {
            return f53685a;
        }

        static {
            Covode.recordClassIndex(33237);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.c.a.d
        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    protected d() {
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
