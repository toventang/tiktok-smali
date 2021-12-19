package androidx.constraintlayout.a.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public List<f> f1939a;

    /* renamed from: b  reason: collision with root package name */
    int f1940b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f1941c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1942d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1943e = {-1, -1};

    /* renamed from: f  reason: collision with root package name */
    List<f> f1944f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    List<f> f1945g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    HashSet<f> f1946h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    HashSet<f> f1947i = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    List<f> f1948j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    List<f> f1949k = new ArrayList();

    static {
        Covode.recordClassIndex(591);
    }

    h(List<f> list) {
        this.f1939a = list;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.constraintlayout.a.a.f r8) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.h.a(androidx.constraintlayout.a.a.f):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(f fVar, int i2) {
        if (i2 == 0) {
            this.f1946h.add(fVar);
        } else if (i2 == 1) {
            this.f1947i.add(fVar);
        }
    }

    public h(List<f> list, byte b2) {
        this.f1939a = list;
        this.f1942d = true;
    }

    /* access modifiers changed from: package-private */
    public final void a(ArrayList<f> arrayList, f fVar) {
        f fVar2;
        if (!fVar.an) {
            arrayList.add(fVar);
            fVar.an = true;
            if (!fVar.h()) {
                if (fVar instanceof j) {
                    j jVar = (j) fVar;
                    int i2 = jVar.ay;
                    for (int i3 = 0; i3 < i2; i3++) {
                        a(arrayList, jVar.ax[i3]);
                    }
                }
                int length = fVar.E.length;
                for (int i4 = 0; i4 < length; i4++) {
                    e eVar = fVar.E[i4].f1912d;
                    if (!(eVar == null || (fVar2 = eVar.f1910b) == fVar.H)) {
                        a(arrayList, fVar2);
                    }
                }
            }
        }
    }
}
