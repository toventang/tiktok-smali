package com.ss.ttvideoengine.n.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.j.d;
import com.ss.ttvideoengine.j.e;
import com.ss.ttvideoengine.n.b;
import com.ss.ttvideoengine.n.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    protected final e f153117a;

    /* renamed from: b  reason: collision with root package name */
    protected List<? extends f> f153118b;

    /* renamed from: c  reason: collision with root package name */
    protected List<? extends d> f153119c;

    /* renamed from: d  reason: collision with root package name */
    protected c f153120d;

    /* renamed from: e  reason: collision with root package name */
    private g[] f153121e;

    static {
        Covode.recordClassIndex(101731);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f153122a;

        static {
            Covode.recordClassIndex(101732);
        }

        public final Map<Integer, Object> a() {
            HashMap hashMap = new HashMap();
            hashMap.put(1, Double.valueOf(this.f153122a));
            return hashMap;
        }
    }

    public i(h hVar) {
        if (hVar != null) {
            this.f153117a = hVar.a();
            this.f153118b = hVar.d();
            this.f153119c = hVar.c();
            this.f153120d = hVar.b();
        } else {
            this.f153117a = null;
        }
        b(this.f153118b);
    }

    private void b(List<? extends f> list) {
        if (!(list == null || list.isEmpty())) {
            this.f153121e = new g[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                f fVar = (f) list.get(i2);
                double c2 = (double) fVar.c();
                double b2 = (double) fVar.b();
                Double.isNaN(b2);
                double a2 = (double) fVar.a();
                Double.isNaN(a2);
                this.f153121e[i2] = new g(c2, b2 * 8000.0d, 8000.0d * a2);
            }
        }
    }

    private <T extends d> List<T> a(List<T> list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f153117a != null && !list.isEmpty()) {
            Pair<Double, Double> d2 = this.f153117a.d();
            Set<String> b2 = this.f153117a.b();
            if (d2 == null || this.f153117a.c() <= 0.0d) {
                z = false;
            } else {
                z = true;
            }
            for (T t : list) {
                if (z) {
                    double a2 = (double) t.a(3);
                    if (a2 >= ((Double) d2.first).doubleValue() && a2 <= ((Double) d2.second).doubleValue()) {
                        arrayList.add(t);
                    }
                } else if (b2 != null && b2.contains(t.b(7))) {
                    arrayList.add(t);
                }
            }
            if (arrayList.isEmpty()) {
                if (z) {
                    T t2 = null;
                    for (T t3 : list) {
                        if (t2 != null) {
                            double a3 = (double) t3.a(3);
                            double c2 = this.f153117a.c();
                            Double.isNaN(a3);
                            double abs = Math.abs(a3 - c2);
                            double a4 = (double) t2.a(3);
                            double c3 = this.f153117a.c();
                            Double.isNaN(a4);
                            if (abs >= Math.abs(a4 - c3)) {
                            }
                        }
                        t2 = t3;
                    }
                    arrayList.add(t2);
                } else {
                    arrayList.add(list.get(0));
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.ttvideoengine.n.c
    public final b a(e eVar, Map<Integer, Object> map) {
        if (eVar == null) {
            return new b(new com.ss.ttvideoengine.s.c("kTTVideoSelector", -7999, "null video model"));
        }
        return a(eVar.b(), map);
    }

    private static <T extends d> T a(double d2, List<T> list) {
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t != null) {
                    if (((double) t.a(3)) > d2) {
                        if (t2.a(3) >= t.a(3)) {
                        }
                    } else if (d2 >= ((double) t2.a(3))) {
                        if (t2.a(3) < t.a(3)) {
                        }
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    private static <T extends d> T b(double d2, List<T> list) {
        T t = null;
        if (list != null) {
            for (T t2 : list) {
                if (t != null) {
                    double a2 = (double) t2.a(3);
                    Double.isNaN(a2);
                    double abs = Math.abs(a2 - d2);
                    double a3 = (double) t.a(3);
                    Double.isNaN(a3);
                    if (abs >= Math.abs(a3 - d2)) {
                    }
                }
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        if (r0 == null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        if (r0 == null) goto L_0x01bb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.ttvideoengine.n.b a(java.util.List<? extends com.ss.ttvideoengine.j.d> r18, java.util.Map<java.lang.Integer, java.lang.Object> r19) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.n.b.i.a(java.util.List, java.util.Map):com.ss.ttvideoengine.n.b");
    }
}
