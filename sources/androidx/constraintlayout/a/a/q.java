package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public class q extends f {
    public ArrayList<f> aQ = new ArrayList<>();

    static {
        Covode.recordClassIndex(602);
    }

    @Override // androidx.constraintlayout.a.a.f
    public void f() {
        this.aQ.clear();
        super.f();
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void u() {
        super.u();
        ArrayList<f> arrayList = this.aQ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.aQ.get(i2);
                fVar.a(m(), n());
                if (!(fVar instanceof g)) {
                    fVar.u();
                }
            }
        }
    }

    public void z() {
        u();
        ArrayList<f> arrayList = this.aQ;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = this.aQ.get(i2);
                if (fVar instanceof q) {
                    ((q) fVar).z();
                }
            }
        }
    }

    public final void a(f fVar) {
        this.aQ.remove(fVar);
        fVar.H = null;
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void a(c cVar) {
        super.a(cVar);
        int size = this.aQ.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.aQ.get(i2).a(cVar);
        }
    }

    @Override // androidx.constraintlayout.a.a.f
    public final void a(int i2, int i3) {
        super.a(i2, i3);
        int size = this.aQ.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.aQ.get(i4).a(o(), p());
        }
    }
}
