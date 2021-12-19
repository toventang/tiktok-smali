package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;

public final class al extends h.c.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f159007b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f159008a;

    static {
        Covode.recordClassIndex(105525);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof al) && l.a(this.f159008a, ((al) obj).f159008a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f159008a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public static final class a implements f.c<al> {
        static {
            Covode.recordClassIndex(105526);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "CoroutineName(" + this.f159008a + ')';
    }
}
