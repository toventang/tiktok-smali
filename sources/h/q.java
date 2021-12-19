package h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class q<T> implements Serializable {
    public static final a Companion = new a((byte) 0);
    private final Object value;

    static {
        Covode.recordClassIndex(105383);
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ q m222boximpl(Object obj) {
        return new q(obj);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static Object m223constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m224equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof q) && l.a(obj, ((q) obj2).m231unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m225equalsimpl0(Object obj, Object obj2) {
        return l.a(obj, obj2);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m227hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ Object m231unboximpl() {
        return this.value;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(105384);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Serializable {
        public final Throwable exception;

        static {
            Covode.recordClassIndex(105385);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.exception + ')';
        }

        public b(Throwable th) {
            l.d(th, "");
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b) || !l.a(this.exception, ((b) obj).exception)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        return m227hashCodeimpl(this.value);
    }

    public final String toString() {
        return m230toStringimpl(this.value);
    }

    /* renamed from: isFailure-impl  reason: not valid java name */
    public static final boolean m228isFailureimpl(Object obj) {
        return obj instanceof b;
    }

    private /* synthetic */ q(Object obj) {
        this.value = obj;
    }

    /* renamed from: isSuccess-impl  reason: not valid java name */
    public static final boolean m229isSuccessimpl(Object obj) {
        if (!(obj instanceof b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return m224equalsimpl(this.value, obj);
    }

    /* renamed from: exceptionOrNull-impl  reason: not valid java name */
    public static final Throwable m226exceptionOrNullimpl(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).exception;
        }
        return null;
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m230toStringimpl(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
