package com.bytedance.tux.b;

import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f44676a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f44677b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final LinkedHashMap<Integer, a> f44678c = new LinkedHashMap<>(8);

    private f() {
    }

    static {
        Covode.recordClassIndex(27319);
    }

    public final f a(int i2, b<? super j, z> bVar) {
        l.c(bVar, "");
        f44678c.put(Integer.valueOf(i2), new a(bVar));
        return this;
    }

    public static b a(int i2, int i3) {
        Map<Integer, b> a2;
        if (f44676a) {
            a aVar = f44678c.get(Integer.valueOf(i2));
            if (aVar != null) {
                return aVar.a(i3);
            }
            return null;
        }
        a aVar2 = f44678c.get(Integer.valueOf(i2));
        if (aVar2 == null || (a2 = aVar2.a()) == null) {
            return null;
        }
        return a2.get(Integer.valueOf(i3));
    }
}
