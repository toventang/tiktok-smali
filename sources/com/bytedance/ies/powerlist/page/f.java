package com.bytedance.ies.powerlist.page;

import com.bytedance.covode.number.Covode;
import h.a.z;
import h.f.b.l;
import java.util.List;

public abstract class f<T> {

    /* renamed from: a */
    public static final a f34371a = new a((byte) 0);

    static {
        Covode.recordClassIndex(20537);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20538);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static <T> b<T> a(List<? extends com.bytedance.ies.powerlist.b.a> list) {
            l.c(list, "");
            return new b<>(list);
        }

        public static <T> c<T> a(Exception exc) {
            l.c(exc, "");
            return new c<>(exc);
        }

        public static <T> d<T> a(T t, T t2, List<? extends com.bytedance.ies.powerlist.b.a> list) {
            l.c(list, "");
            return new d<>(t, t2, list);
        }

        public static /* synthetic */ d a(Object obj, Object obj2, List list, int i2) {
            if ((i2 & 1) != 0) {
                obj = null;
            }
            if ((i2 & 2) != 0) {
                obj2 = null;
            }
            if ((i2 & 4) != 0) {
                list = z.INSTANCE;
            }
            return a(obj, obj2, list);
        }
    }

    private f() {
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public static final class b<T> extends f<T> {

        /* renamed from: b */
        public final List<com.bytedance.ies.powerlist.b.a> f34372b;

        static {
            Covode.recordClassIndex(20539);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ies.powerlist.b.a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<? extends com.bytedance.ies.powerlist.b.a> list) {
            super((byte) 0);
            l.c(list, "");
            this.f34372b = list;
        }
    }

    public static final class c<T> extends f<T> {

        /* renamed from: b */
        public final Exception f34373b;

        static {
            Covode.recordClassIndex(20540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super((byte) 0);
            l.c(exc, "");
            this.f34373b = exc;
        }
    }

    public static final class d<T> extends f<T> {

        /* renamed from: b */
        public final T f34374b;

        /* renamed from: c */
        public final T f34375c;

        /* renamed from: d */
        public final List<com.bytedance.ies.powerlist.b.a> f34376d;

        static {
            Covode.recordClassIndex(20541);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.bytedance.ies.powerlist.b.a> */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(T t, T t2, List<? extends com.bytedance.ies.powerlist.b.a> list) {
            super((byte) 0);
            l.c(list, "");
            this.f34374b = t;
            this.f34375c = t2;
            this.f34376d = list;
        }
    }
}
