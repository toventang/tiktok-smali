package kotlinx.coroutines.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class aa<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f158952b = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Object f158953a;

    static {
        Covode.recordClassIndex(105474);
    }

    public static final /* synthetic */ aa a(Object obj) {
        return new aa(obj);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(105476);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f158954a;

        static {
            Covode.recordClassIndex(105475);
        }

        public final int hashCode() {
            Throwable th = this.f158954a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Closed(" + this.f158954a + ')';
        }

        public a(Throwable th) {
            this.f158954a = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a) || !l.a(this.f158954a, ((a) obj).f158954a)) {
                return false;
            }
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f158953a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f158953a;
        if (obj instanceof a) {
            return obj.toString();
        }
        return "Value(" + obj + ')';
    }

    private /* synthetic */ aa(Object obj) {
        this.f158953a = obj;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f158953a;
        if (!(obj instanceof aa) || !l.a(obj2, ((aa) obj).f158953a)) {
            return false;
        }
        return true;
    }
}
