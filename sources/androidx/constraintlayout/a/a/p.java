package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.e;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    int f1968a;

    /* renamed from: b  reason: collision with root package name */
    int f1969b;

    /* renamed from: c  reason: collision with root package name */
    int f1970c;

    /* renamed from: d  reason: collision with root package name */
    int f1971d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList<a> f1972e = new ArrayList<>();

    static {
        Covode.recordClassIndex(600);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        e f1973a;

        /* renamed from: b  reason: collision with root package name */
        e f1974b;

        /* renamed from: c  reason: collision with root package name */
        int f1975c;

        /* renamed from: d  reason: collision with root package name */
        e.b f1976d;

        /* renamed from: e  reason: collision with root package name */
        int f1977e;

        static {
            Covode.recordClassIndex(601);
        }

        public a(e eVar) {
            this.f1973a = eVar;
            this.f1974b = eVar.f1912d;
            this.f1975c = eVar.b();
            this.f1976d = eVar.f1915g;
            this.f1977e = eVar.f1917i;
        }
    }

    public p(f fVar) {
        this.f1968a = fVar.M;
        this.f1969b = fVar.N;
        this.f1970c = fVar.k();
        this.f1971d = fVar.l();
        ArrayList<e> t = fVar.t();
        int size = t.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1972e.add(new a(t.get(i2)));
        }
    }
}
