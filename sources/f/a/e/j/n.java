package f.a.e.j;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.e.c.h;
import f.a.e.c.i;
import f.a.z;

public final class n {
    static {
        Covode.recordClassIndex(104877);
    }

    public static <T, U> void a(h<T> hVar, z<? super U> zVar, b bVar, k<T, U> kVar) {
        boolean z;
        int i2 = 1;
        while (!a(kVar.b(), hVar.isEmpty(), zVar, false, hVar, bVar, kVar)) {
            while (true) {
                boolean b2 = kVar.b();
                T poll = hVar.poll();
                if (poll == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!a(b2, z, zVar, false, hVar, bVar, kVar)) {
                    if (!z) {
                        kVar.a(zVar, poll);
                    } else {
                        i2 = kVar.a(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    private static <T, U> boolean a(boolean z, boolean z2, z<?> zVar, boolean z3, i<?> iVar, b bVar, k<T, U> kVar) {
        if (kVar.a()) {
            iVar.clear();
            bVar.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable d2 = kVar.d();
            if (d2 != null) {
                iVar.clear();
                if (bVar != null) {
                    bVar.dispose();
                }
                zVar.onError(d2);
                return true;
            } else if (!z2) {
                return false;
            } else {
                if (bVar != null) {
                    bVar.dispose();
                }
                zVar.onComplete();
                return true;
            }
        }
    }
}
