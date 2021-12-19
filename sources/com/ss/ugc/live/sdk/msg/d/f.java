package com.ss.ugc.live.sdk.msg.d;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.Exception;

public abstract class f<V, E extends Exception> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f154186a = new a((byte) 0);

    static {
        Covode.recordClassIndex(102824);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(102825);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static <V> c<V> a(V v) {
            return new c<>(v);
        }

        public static <E extends Exception> b<E> a(E e2) {
            l.c(e2, "");
            return new b<>(e2);
        }
    }

    private f() {
    }

    public static final class b<E extends Exception> extends f {

        /* renamed from: b  reason: collision with root package name */
        public final E f154187b;

        static {
            Covode.recordClassIndex(102826);
        }

        public final int hashCode() {
            return this.f154187b.hashCode();
        }

        public final String toString() {
            return "[Failure: " + this.f154187b + ']';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(E e2) {
            super((byte) 0);
            l.c(e2, "");
            this.f154187b = e2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b) || !l.a(this.f154187b, ((b) obj).f154187b)) {
                return false;
            }
            return true;
        }
    }

    public static final class c<V> extends f {

        /* renamed from: b  reason: collision with root package name */
        public final V f154188b;

        static {
            Covode.recordClassIndex(102827);
        }

        public final int hashCode() {
            V v = this.f154188b;
            if (v != null) {
                return v.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "[Success: " + ((Object) this.f154188b) + ']';
        }

        public c(V v) {
            super((byte) 0);
            this.f154188b = v;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c) || !l.a((Object) this.f154188b, (Object) ((c) obj).f154188b)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ f(byte b2) {
        this();
    }
}
