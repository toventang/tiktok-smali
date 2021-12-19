package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.e;
import androidx.constraintlayout.a.a.f;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(578);
    }

    public static boolean a(f fVar, h hVar, List<h> list, boolean z) {
        if (fVar == null) {
            return true;
        }
        fVar.am = false;
        g gVar = (g) fVar.H;
        if (fVar.t == null) {
            fVar.al = true;
            hVar.f1939a.add(fVar);
            fVar.t = hVar;
            if (fVar.w.f1912d == null && fVar.y.f1912d == null && fVar.x.f1912d == null && fVar.z.f1912d == null && fVar.A.f1912d == null && fVar.D.f1912d == null) {
                a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (!(fVar.x.f1912d == null || fVar.z.f1912d == null)) {
                gVar.x();
                if (z) {
                    a(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.x.f1912d.f1910b == fVar.H && fVar.z.f1912d.f1910b == fVar.H)) {
                    a(gVar, fVar, hVar);
                }
            }
            if (!(fVar.w.f1912d == null || fVar.y.f1912d == null)) {
                gVar.w();
                if (z) {
                    a(gVar, fVar, hVar);
                    return false;
                } else if (!(fVar.w.f1912d.f1910b == fVar.H && fVar.y.f1912d.f1910b == fVar.H)) {
                    a(gVar, fVar, hVar);
                }
            }
            if (((fVar.w() == f.a.MATCH_CONSTRAINT) ^ (fVar.x() == f.a.MATCH_CONSTRAINT)) && fVar.K != 0.0f) {
                a(fVar);
            } else if (fVar.w() == f.a.MATCH_CONSTRAINT || fVar.x() == f.a.MATCH_CONSTRAINT) {
                a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
            }
            if (((fVar.w.f1912d == null && fVar.y.f1912d == null) || ((fVar.w.f1912d != null && fVar.w.f1912d.f1910b == fVar.H && fVar.y.f1912d == null) || ((fVar.y.f1912d != null && fVar.y.f1912d.f1910b == fVar.H && fVar.w.f1912d == null) || (fVar.w.f1912d != null && fVar.w.f1912d.f1910b == fVar.H && fVar.y.f1912d != null && fVar.y.f1912d.f1910b == fVar.H)))) && fVar.D.f1912d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.f1944f.add(fVar);
            }
            if (((fVar.x.f1912d == null && fVar.z.f1912d == null) || ((fVar.x.f1912d != null && fVar.x.f1912d.f1910b == fVar.H && fVar.z.f1912d == null) || ((fVar.z.f1912d != null && fVar.z.f1912d.f1910b == fVar.H && fVar.x.f1912d == null) || (fVar.x.f1912d != null && fVar.x.f1912d.f1910b == fVar.H && fVar.z.f1912d != null && fVar.z.f1912d.f1910b == fVar.H)))) && fVar.D.f1912d == null && fVar.A.f1912d == null && !(fVar instanceof i) && !(fVar instanceof j)) {
                hVar.f1945g.add(fVar);
            }
            if (fVar instanceof j) {
                a(gVar, fVar, hVar);
                if (z) {
                    return false;
                }
                j jVar = (j) fVar;
                for (int i2 = 0; i2 < jVar.ay; i2++) {
                    if (!a(jVar.ax[i2], hVar, list, z)) {
                        return false;
                    }
                }
            }
            int length = fVar.E.length;
            for (int i3 = 0; i3 < length; i3++) {
                e eVar = fVar.E[i3];
                if (!(eVar.f1912d == null || eVar.f1912d.f1910b == fVar.H)) {
                    if (eVar.f1911c == e.c.CENTER) {
                        a(gVar, fVar, hVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        m mVar = eVar.f1909a;
                        if (!(eVar.f1912d == null || eVar.f1912d.f1912d == eVar)) {
                            eVar.f1912d.f1909a.a(mVar);
                        }
                    }
                    if (!a(eVar.f1912d.f1910b, hVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (fVar.t != hVar) {
            hVar.f1939a.addAll(fVar.t.f1939a);
            hVar.f1944f.addAll(fVar.t.f1944f);
            hVar.f1945g.addAll(fVar.t.f1945g);
            if (!fVar.t.f1942d) {
                hVar.f1942d = false;
            }
            list.remove(fVar.t);
            for (f fVar2 : fVar.t.f1939a) {
                fVar2.t = hVar;
            }
        }
        return true;
    }

    public static void a(g gVar) {
        gVar.aF.clear();
        gVar.aF.add(0, new h(gVar.aQ));
    }

    private static int a(f fVar) {
        float k2;
        float l2;
        if (fVar.w() == f.a.MATCH_CONSTRAINT) {
            if (fVar.L == 0) {
                l2 = ((float) fVar.l()) * fVar.K;
            } else {
                l2 = ((float) fVar.l()) / fVar.K;
            }
            int i2 = (int) l2;
            fVar.c(i2);
            return i2;
        } else if (fVar.x() != f.a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (fVar.L == 1) {
                k2 = ((float) fVar.k()) * fVar.K;
            } else {
                k2 = ((float) fVar.k()) / fVar.K;
            }
            int i3 = (int) k2;
            fVar.d(i3);
            return i3;
        }
    }

    private static int a(f fVar, int i2) {
        float f2;
        int i3 = i2 * 2;
        e eVar = fVar.E[i3];
        e eVar2 = fVar.E[i3 + 1];
        if (eVar.f1912d == null || eVar.f1912d.f1910b != fVar.H || eVar2.f1912d == null || eVar2.f1912d.f1910b != fVar.H) {
            return 0;
        }
        int b2 = fVar.H.b(i2);
        if (i2 == 0) {
            f2 = fVar.ac;
        } else {
            f2 = fVar.ad;
        }
        return (int) (((float) (((b2 - eVar.b()) - eVar2.b()) - fVar.b(i2))) * f2);
    }

    public static int a(h hVar, int i2) {
        List<f> list;
        boolean z;
        int i3 = i2 * 2;
        if (i2 == 0) {
            list = hVar.f1944f;
        } else if (i2 == 1) {
            list = hVar.f1945g;
        } else {
            list = null;
        }
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            f fVar = list.get(i5);
            int i6 = i3 + 1;
            if (fVar.E[i6].f1912d == null || !(fVar.E[i3].f1912d == null || fVar.E[i6].f1912d == null)) {
                z = true;
            } else {
                z = false;
            }
            i4 = Math.max(i4, a(fVar, i2, z, 0));
        }
        hVar.f1943e[i2] = i4;
        return i4;
    }

    private static void a(g gVar, f fVar, h hVar) {
        hVar.f1942d = false;
        gVar.aM = false;
        fVar.al = false;
    }

    public static void a(List<h> list, int i2, int i3) {
        HashSet<f> hashSet;
        int i4;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            h hVar = list.get(i5);
            if (i2 == 0) {
                hashSet = hVar.f1946h;
            } else if (i2 == 1) {
                hashSet = hVar.f1947i;
            } else {
                hashSet = null;
            }
            for (f fVar : hashSet) {
                if (fVar.al) {
                    int i6 = i2 * 2;
                    e eVar = fVar.E[i6];
                    e eVar2 = fVar.E[i6 + 1];
                    if (eVar.f1912d != null && eVar2.f1912d != null) {
                        k.a(fVar, i2, a(fVar, i2) + eVar.b());
                    } else if (fVar.K == 0.0f || fVar.g(i2) != f.a.MATCH_CONSTRAINT) {
                        if (i2 == 0) {
                            i4 = fVar.O;
                        } else if (i2 == 1) {
                            i4 = fVar.P;
                        } else {
                            i4 = 0;
                        }
                        int i7 = i3 - i4;
                        int b2 = i7 - fVar.b(i2);
                        fVar.a(b2, i7, i2);
                        k.a(fVar, i2, b2);
                    } else {
                        int a2 = a(fVar);
                        int i8 = (int) fVar.E[i6].f1909a.f1959f;
                        eVar2.f1909a.f1958e = eVar.f1909a;
                        eVar2.f1909a.f1959f = (float) a2;
                        eVar2.f1909a.f1967i = 1;
                        fVar.a(i8, i8 + a2, i2);
                    }
                }
            }
        }
    }

    private static int a(f fVar, int i2, boolean z, int i3) {
        boolean z2;
        int l2;
        int i4;
        int i5;
        int i6;
        int i7;
        int l3;
        int l4;
        int i8;
        int i9;
        f fVar2;
        int i10 = i3;
        int i11 = 0;
        if (!fVar.al) {
            return 0;
        }
        if (fVar.A.f1912d == null || i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z) {
            l2 = fVar.W;
            i4 = fVar.l() - fVar.W;
            i6 = i2 * 2;
            i5 = i6 + 1;
        } else {
            l2 = fVar.l() - fVar.W;
            i4 = fVar.W;
            i5 = i2 * 2;
            i6 = i5 + 1;
        }
        if (fVar.E[i5].f1912d == null || fVar.E[i6].f1912d != null) {
            i7 = 1;
        } else {
            i7 = -1;
            i5 = i6;
            i6 = i5;
        }
        if (z2) {
            i10 -= l2;
        }
        int b2 = (fVar.E[i6].b() * i7) + a(fVar, i2);
        int i12 = i10 + b2;
        if (i2 == 0) {
            l3 = fVar.k();
        } else {
            l3 = fVar.l();
        }
        int i13 = l3 * i7;
        Iterator it = fVar.E[i6].f1909a.f1966h.iterator();
        while (it.hasNext()) {
            i11 = Math.max(i11, a(((m) ((o) it.next())).f1954a.f1910b, i2, z, i12));
        }
        Iterator it2 = fVar.E[i5].f1909a.f1966h.iterator();
        int i14 = 0;
        while (it2.hasNext()) {
            i14 = Math.max(i14, a(((m) ((o) it2.next())).f1954a.f1910b, i2, z, i13 + i12));
        }
        if (z2) {
            i11 -= l2;
            i8 = i14 + i4;
        } else {
            if (i2 == 0) {
                l4 = fVar.k();
            } else {
                l4 = fVar.l();
            }
            i8 = i14 + (l4 * i7);
        }
        int i15 = 1;
        if (i2 == 1) {
            Iterator it3 = fVar.A.f1909a.f1966h.iterator();
            i9 = 0;
            while (it3.hasNext()) {
                m mVar = (m) ((o) it3.next());
                if (i7 == i15) {
                    i9 = Math.max(i9, a(mVar.f1954a.f1910b, i2, z, l2 + i12));
                } else {
                    i9 = Math.max(i9, a(mVar.f1954a.f1910b, i2, z, (i4 * i7) + i12));
                }
                i15 = 1;
            }
            if (fVar.A.f1909a.f1966h.size() > 0 && !z2) {
                if (i7 == 1) {
                    i9 += l2;
                } else {
                    i9 -= i4;
                }
            }
        } else {
            i9 = 0;
        }
        int max = b2 + Math.max(i11, Math.max(i8, i9));
        int i16 = i13 + i12;
        if (i7 == -1) {
            i16 = i12;
            i12 = i16;
        }
        if (z) {
            k.a(fVar, i2, i12);
            fVar.a(i12, i16, i2);
        } else {
            fVar.t.a(fVar, i2);
            fVar.d(i12, i2);
        }
        if (fVar.g(i2) == f.a.MATCH_CONSTRAINT && fVar.K != 0.0f) {
            fVar.t.a(fVar, i2);
        }
        if (fVar.E[i6].f1912d != null && fVar.E[i5].f1912d != null && fVar.E[i6].f1912d.f1910b == (fVar2 = fVar.H) && fVar.E[i5].f1912d.f1910b == fVar2) {
            fVar.t.a(fVar, i2);
        }
        return max;
    }
}
