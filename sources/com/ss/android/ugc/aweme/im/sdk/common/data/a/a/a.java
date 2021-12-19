package com.ss.android.ugc.aweme.im.sdk.common.data.a.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public abstract class a<T> {
    static {
        Covode.recordClassIndex(65601);
    }

    private a() {
    }

    public static abstract class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f102460a;

        static {
            Covode.recordClassIndex(65603);
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a$b$a  reason: collision with other inner class name */
        public static final class C2573a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final Object f102461a;

            static {
                Covode.recordClassIndex(65604);
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C2573a) && l.a(this.f102461a, ((C2573a) obj).f102461a);
                }
                return true;
            }

            public final int hashCode() {
                Object obj = this.f102461a;
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }

            public final String toString() {
                return "GenericException(exception=" + this.f102461a + ")";
            }

            private /* synthetic */ C2573a() {
                this(null);
            }

            public C2573a(Object obj) {
                super((byte) 0);
                this.f102461a = obj;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.a.a.a$a  reason: collision with other inner class name */
    public static final class C2572a<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f102459a;

        static {
            Covode.recordClassIndex(65602);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C2572a) && l.a(this.f102459a, ((C2572a) obj).f102459a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.f102459a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Error(data=" + ((Object) this.f102459a) + ")";
        }

        public C2572a(T t) {
            super((byte) 0);
            this.f102459a = t;
        }
    }

    public static final class c<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f102462a;

        static {
            Covode.recordClassIndex(65605);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && l.a(this.f102462a, ((c) obj).f102462a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.f102462a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Loading(data=" + ((Object) this.f102462a) + ")";
        }

        public c(T t) {
            super((byte) 0);
            this.f102462a = t;
        }
    }

    public static final class d<T> extends a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f102463a;

        static {
            Covode.recordClassIndex(65606);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof d) && l.a(this.f102463a, ((d) obj).f102463a);
            }
            return true;
        }

        public final int hashCode() {
            T t = this.f102463a;
            if (t != null) {
                return t.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Success(data=" + ((Object) this.f102463a) + ")";
        }

        public d(T t) {
            super((byte) 0);
            this.f102463a = t;
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
