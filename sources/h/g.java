package h;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g implements Comparable<g> {

    /* renamed from: d  reason: collision with root package name */
    public static final g f158729d = new g();

    /* renamed from: e  reason: collision with root package name */
    public static final a f158730e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f158731a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f158732b = 5;

    /* renamed from: c  reason: collision with root package name */
    public final int f158733c = 32001;

    /* renamed from: f  reason: collision with root package name */
    private final int f158734f = 98817;

    public static final class a {
        static {
            Covode.recordClassIndex(105244);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int hashCode() {
        return this.f158734f;
    }

    static {
        Covode.recordClassIndex(105243);
    }

    public final String toString() {
        return new StringBuilder().append(this.f158731a).append('.').append(this.f158732b).append('.').append(this.f158733c).toString();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(g gVar) {
        g gVar2 = gVar;
        l.d(gVar2, "");
        return this.f158734f - gVar2.f158734f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            obj = null;
        }
        g gVar = (g) obj;
        if (gVar != null && this.f158734f == gVar.f158734f) {
            return true;
        }
        return false;
    }
}
