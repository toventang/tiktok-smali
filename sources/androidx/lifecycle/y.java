package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private final c f3561a;

    public enum c {
        Activity,
        Fragment;

        static {
            Covode.recordClassIndex(1350);
        }
    }

    static {
        Covode.recordClassIndex(1347);
    }

    public static final class a extends y {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<e> f3562a;

        /* renamed from: b  reason: collision with root package name */
        private final c f3563b;

        static {
            Covode.recordClassIndex(1348);
        }

        public final int hashCode() {
            int i2;
            c cVar = this.f3563b;
            int i3 = 0;
            if (cVar != null) {
                i2 = cVar.hashCode();
            } else {
                i2 = 0;
            }
            int i4 = i2 * 31;
            WeakReference<e> weakReference = this.f3562a;
            if (weakReference != null) {
                i3 = weakReference.hashCode();
            }
            return i4 + i3;
        }

        public final String toString() {
            return "ActivityContent(category=" + this.f3563b + ", activity=" + this.f3562a + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!l.a(this.f3563b, aVar.f3563b) || !l.a(this.f3562a, aVar.f3562a)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, WeakReference<e> weakReference) {
            super(cVar, (byte) 0);
            l.c(cVar, "");
            l.c(weakReference, "");
            this.f3563b = cVar;
            this.f3562a = weakReference;
        }
    }

    public static final class b extends y {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Fragment> f3564a;

        /* renamed from: b  reason: collision with root package name */
        private final c f3565b;

        static {
            Covode.recordClassIndex(1349);
        }

        public final int hashCode() {
            int i2;
            c cVar = this.f3565b;
            int i3 = 0;
            if (cVar != null) {
                i2 = cVar.hashCode();
            } else {
                i2 = 0;
            }
            int i4 = i2 * 31;
            WeakReference<Fragment> weakReference = this.f3564a;
            if (weakReference != null) {
                i3 = weakReference.hashCode();
            }
            return i4 + i3;
        }

        public final String toString() {
            return "FragmentContent(category=" + this.f3565b + ", fragment=" + this.f3564a + ")";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!l.a(this.f3565b, bVar.f3565b) || !l.a(this.f3564a, bVar.f3564a)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, WeakReference<Fragment> weakReference) {
            super(cVar, (byte) 0);
            l.c(cVar, "");
            l.c(weakReference, "");
            this.f3565b = cVar;
            this.f3564a = weakReference;
        }
    }

    private y(c cVar) {
        this.f3561a = cVar;
    }

    public /* synthetic */ y(c cVar, byte b2) {
        this(cVar);
    }
}
