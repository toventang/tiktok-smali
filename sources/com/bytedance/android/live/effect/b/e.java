package com.bytedance.android.live.effect.b;

import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f9701a = new e();

    public static final int a(int i2, int i3, float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) ((f2 * 10000.0f) / ((float) (i2 - i3)));
    }

    private e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r0 = "";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(java.util.Map<java.lang.String, java.util.List<com.bytedance.android.livesdkapi.depend.model.a>> r11, java.lang.String[] r12) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.e.a(java.util.Map, java.lang.String[]):java.lang.String[]");
    }

    static {
        Covode.recordClassIndex(4934);
    }

    public static List<com.bytedance.android.live.effect.model.a.a> c(List<com.bytedance.android.live.effect.model.a.a> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            n.a((List) arrayList, (Comparator) new d());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((com.bytedance.android.live.effect.model.a.a) obj).f9882h) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static List<com.bytedance.android.live.effect.model.a.a> b(List<com.bytedance.android.live.effect.model.a.a> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            n.a((List) arrayList, (Comparator) new a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            com.bytedance.android.live.effect.model.a.a aVar = (com.bytedance.android.live.effect.model.a.a) obj;
            if (aVar.f9882h) {
                long j2 = aVar.f9879e;
                com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.cS;
                l.b(bVar, "");
                Long a2 = bVar.a();
                l.b(a2, "");
                if (j2 >= a2.longValue()) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    public static List<com.bytedance.android.live.effect.model.a.a> a(List<com.bytedance.android.live.effect.model.a.a> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        if (arrayList.size() > 1) {
            n.a((List) arrayList, (Comparator) new b());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            com.bytedance.android.live.effect.model.a.a aVar = (com.bytedance.android.live.effect.model.a.a) obj;
            if (aVar.f9882h) {
                long j2 = aVar.f9879e;
                com.bytedance.android.livesdk.ap.b<Long> bVar = com.bytedance.android.livesdk.ap.a.cS;
                l.b(bVar, "");
                Long a2 = bVar.a();
                l.b(a2, "");
                if (j2 < a2.longValue()) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    public static final float a(com.bytedance.android.livesdkapi.depend.model.a aVar, int i2) {
        l.d(aVar, "");
        return a(aVar.a(), i2);
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(4935);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.f9879e), Long.valueOf(t2.f9879e));
        }
    }

    public static final class b<T> implements Comparator {
        static {
            Covode.recordClassIndex(4936);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.f9879e), Long.valueOf(t2.f9879e));
        }
    }

    public static final class c<T> implements Comparator {
        static {
            Covode.recordClassIndex(4937);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.f9879e), Long.valueOf(t2.f9879e));
        }
    }

    public static final class d<T> implements Comparator {
        static {
            Covode.recordClassIndex(4938);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t.f9879e), Long.valueOf(t2.f9879e));
        }
    }

    public static final float a(a.b bVar, int i2) {
        int i3;
        double d2;
        double d3;
        double d4;
        if (i2 == 0) {
            return 0.0f;
        }
        int i4 = 100;
        boolean z = false;
        if (bVar != null) {
            i4 = bVar.f23011d;
            i3 = bVar.f23012e;
            if (i3 < 0) {
                z = true;
            }
        } else {
            i3 = 0;
        }
        if (z) {
            if (i2 > 0) {
                double d5 = (double) i4;
                Double.isNaN(d5);
                d3 = (d5 * 1.0d) / 5000.0d;
                d4 = (double) i2;
                Double.isNaN(d4);
            } else {
                double d6 = (double) i3;
                Double.isNaN(d6);
                d3 = (d6 * 1.0d) / -5000.0d;
                d4 = (double) i2;
                Double.isNaN(d4);
            }
            d2 = d3 * d4 * 2.0d;
        } else {
            double d7 = (double) (i4 - i3);
            Double.isNaN(d7);
            double d8 = (double) i2;
            Double.isNaN(d8);
            d2 = ((d7 * 1.0d) / 10000.0d) * d8;
        }
        return (float) d2;
    }

    public static final int a(a.b bVar, float f2) {
        int i2;
        float f3;
        float f4;
        if (f2 == 0.0f) {
            return 0;
        }
        int i3 = 100;
        if (bVar != null) {
            i3 = bVar.f23011d;
            i2 = bVar.f23012e;
            if (i2 < 0) {
                if (f2 > 0.0f) {
                    f4 = (float) (5000 / i3);
                } else {
                    f4 = (float) (-5000 / i2);
                }
                f3 = (f2 * f4) / 2.0f;
            }
            f3 = (f2 * 10000.0f) / ((float) (i3 - i2));
        } else {
            i2 = 0;
            f3 = (f2 * 10000.0f) / ((float) (i3 - i2));
        }
        return (int) f3;
    }

    public static final int a(com.bytedance.android.livesdkapi.depend.model.a aVar, float f2) {
        l.d(aVar, "");
        return a(aVar.a(), f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ef A[EDGE_INSN: B:48:0x00ef->B:35:0x00ef ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(java.util.List<com.bytedance.android.live.effect.model.a.a> r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.b.e.a(java.util.List, boolean):java.lang.String[]");
    }

    public static final float a(int i2, int i3, int i4) {
        if (i4 == 0) {
            return 0.0f;
        }
        double d2 = (double) (i2 - i3);
        Double.isNaN(d2);
        double d3 = (double) i4;
        Double.isNaN(d3);
        return (float) (((d2 * 1.0d) / 10000.0d) * d3);
    }
}
