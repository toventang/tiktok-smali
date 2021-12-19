package com.bytedance.b.c.c;

import com.bytedance.b.c.a;
import com.bytedance.b.c.b.c;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static String f26082a;

    static {
        Covode.recordClassIndex(15180);
    }

    public static boolean a() {
        String b2 = a.a().b();
        boolean z = !b2.equals(f26082a);
        f26082a = b2;
        return z;
    }

    public static boolean a(c cVar, double d2, boolean z) {
        if (z) {
            if (!cVar.f26049g.isEmpty()) {
                Iterator<String> it = a.a().f25980a.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    if (cVar.f26049g.containsKey(next)) {
                        double doubleValue = cVar.f26049g.get(next).doubleValue();
                        if (doubleValue < 0.0d) {
                            continue;
                        } else if (d2 > doubleValue) {
                            return true;
                        }
                    }
                }
            }
            if (d2 > cVar.f26045c) {
                return true;
            }
            return false;
        }
        if (!cVar.f26050h.isEmpty()) {
            Iterator<String> it2 = a.a().f25980a.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (cVar.f26050h.containsKey(next2)) {
                    double doubleValue2 = cVar.f26050h.get(next2).doubleValue();
                    if (doubleValue2 < 0.0d) {
                        continue;
                    } else if (d2 > doubleValue2) {
                        return true;
                    }
                }
            }
        }
        if (d2 > cVar.f26046d) {
            return true;
        }
        return false;
    }
}
