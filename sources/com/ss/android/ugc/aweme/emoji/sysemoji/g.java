package com.ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static g f89389a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f89390b = new a((byte) 0);

    static {
        Covode.recordClassIndex(56163);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(56164);
        }

        private a() {
        }

        public static g a() {
            MethodCollector.i(2300);
            if (g.f89389a == null) {
                synchronized (g.class) {
                    try {
                        if (g.f89389a == null) {
                            g.f89389a = new g((byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2300);
                        throw th;
                    }
                }
            }
            g gVar = g.f89389a;
            if (gVar == null) {
                l.b();
            }
            MethodCollector.o(2300);
            return gVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private g() {
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public static List<i> a(int i2) {
        if (!h.b(i2)) {
            return null;
        }
        return h.f89395e.a(i2);
    }

    public static int b(int i2) {
        h.f89395e.a(i2);
        List<i> list = h.f89394d.get(Integer.valueOf(i2));
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static List<i> a(int i2, int i3) {
        if (!h.b(i2)) {
            return null;
        }
        List<i> a2 = h.f89395e.a(i2);
        ArrayList arrayList = new ArrayList();
        if (i3 < a2.size()) {
            int i4 = 0;
            int i5 = 0;
            for (i iVar : a2) {
                if (i5 >= i3 && i5 < i3 + 20) {
                    arrayList.add(iVar);
                }
                i5++;
                if (i5 >= i3 + 20) {
                    break;
                }
            }
            int size = 20 - arrayList.size();
            if (size > 0) {
                do {
                    arrayList.add(new i());
                    i4++;
                } while (i4 < size);
            }
        }
        return arrayList;
    }
}
