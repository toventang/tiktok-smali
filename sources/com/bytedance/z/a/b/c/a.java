package com.bytedance.z.a.b.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.a.c;
import com.bytedance.z.a.b.b;
import com.bytedance.z.a.c.c;
import com.bytedance.z.a.c.d;
import com.bytedance.z.a.c.e;
import com.bytedance.z.a.c.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a extends b {

    /* renamed from: c  reason: collision with root package name */
    private boolean f46270c;

    /* renamed from: d  reason: collision with root package name */
    private e f46271d = new e();

    /* renamed from: e  reason: collision with root package name */
    private d f46272e = new d();

    /* renamed from: f  reason: collision with root package name */
    private Map<Long, e> f46273f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private Map<Long, d> f46274g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private f f46275h = new f();

    /* renamed from: i  reason: collision with root package name */
    private b f46276i = new b();

    /* renamed from: j  reason: collision with root package name */
    private c f46277j = new c();

    /* renamed from: k  reason: collision with root package name */
    private c f46278k = new c();

    /* renamed from: l  reason: collision with root package name */
    private Map<Long, d> f46279l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private Map<Long, e> f46280m = new HashMap();

    static {
        Covode.recordClassIndex(28256);
    }

    @Override // com.bytedance.z.a.b.b
    public final void a() {
        if (!this.f46270c) {
            this.f46270c = true;
            b();
        }
    }

    public final void b() {
        if (this.f46270c) {
            if (this.f46262b.a().f46221c) {
                e();
            }
            if (this.f46262b.a().f46220b) {
                f();
            }
        }
    }

    private void e() {
        b bVar = (b) this.f46275h.a();
        b bVar2 = this.f46276i;
        if (bVar2 != null) {
            bVar.f46282b = bVar.a() - bVar2.a();
            if (bVar.f46283c == 0) {
                bVar.f46283c = bVar.f46282b;
            }
        }
        long j2 = bVar.f46282b;
        c cVar = (c) this.f46277j.a();
        cVar.a(this.f46278k);
        cVar.a(j2);
        ArrayList<Long> a2 = com.bytedance.z.a.d.c.a("/proc/self/task/");
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = a2.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            d dVar = this.f46279l.get(Long.valueOf(longValue));
            if (dVar == null) {
                dVar = new d(longValue);
                this.f46279l.put(Long.valueOf(longValue), dVar);
            }
            e eVar = (e) dVar.a();
            if (eVar == null) {
                arrayList.add(Long.valueOf(longValue));
            } else {
                eVar.a(this.f46280m.get(Long.valueOf(longValue)));
                eVar.a(j2);
                this.f46280m.put(Long.valueOf(longValue), eVar);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Long) it2.next()).longValue();
            this.f46279l.remove(Long.valueOf(longValue2));
            this.f46280m.remove(Long.valueOf(longValue2));
        }
        this.f46276i = bVar;
        this.f46278k = cVar;
    }

    private void f() {
        d dVar = (d) this.f46271d.a();
        dVar.a(this.f46272e);
        this.f46272e = dVar;
        ArrayList<Long> a2 = com.bytedance.z.a.d.c.a("/proc/self/task/");
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = a2.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            e eVar = this.f46273f.get(Long.valueOf(longValue));
            if (eVar == null) {
                eVar = new e((int) longValue);
                this.f46273f.put(Long.valueOf(longValue), eVar);
            }
            d dVar2 = (d) eVar.a();
            if (dVar2 == null) {
                arrayList.add(Long.valueOf(longValue));
            } else {
                dVar2.a(this.f46274g.get(Long.valueOf(longValue)));
                this.f46274g.put(Long.valueOf(longValue), dVar2);
                if (this.f46262b.a().f46220b) {
                    this.f46272e.b(dVar2);
                }
                dVar2.a();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            long longValue2 = ((Long) it2.next()).longValue();
            this.f46273f.remove(Long.valueOf(longValue2));
            this.f46274g.remove(Long.valueOf(longValue2));
        }
    }

    public final List<List<Integer>> c() {
        ArrayList arrayList = null;
        if (this.f46262b.a().f46220b) {
            List<LinkedHashMap<Long, Long>> list = this.f46272e.f46293c;
            long b2 = this.f46272e.b();
            if (list != null && b2 > 0) {
                arrayList = new ArrayList();
                for (LinkedHashMap<Long, Long> linkedHashMap : list) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = linkedHashMap.size() / 4;
                    int i2 = 0;
                    long j2 = 0;
                    long j3 = 0;
                    int i3 = 0;
                    for (Map.Entry<Long, Long> entry : linkedHashMap.entrySet()) {
                        Long key = entry.getKey();
                        Long value = entry.getValue();
                        if (!(key == null || value == null)) {
                            j3 += value.longValue();
                            if (i2 < 3) {
                                if (i3 < size) {
                                    j2 += value.longValue();
                                    i3++;
                                } else {
                                    double d2 = (double) j2;
                                    double d3 = (double) b2;
                                    Double.isNaN(d2);
                                    Double.isNaN(d3);
                                    arrayList2.add(Integer.valueOf((int) ((d2 / d3) * 100.0d)));
                                    j2 = value.longValue();
                                    i2++;
                                    i3 = 1;
                                }
                            } else if (i2 == 3) {
                                j2 += value.longValue();
                            }
                        }
                    }
                    double d4 = (double) j2;
                    double d5 = (double) b2;
                    Double.isNaN(d4);
                    Double.isNaN(d5);
                    arrayList2.add(Integer.valueOf((int) ((d4 / d5) * 100.0d)));
                    double d6 = (double) j3;
                    Double.isNaN(d6);
                    Double.isNaN(d5);
                    arrayList2.add(Integer.valueOf((int) ((d6 / d5) * 100.0d)));
                    arrayList.add(arrayList2);
                }
            }
        }
        return arrayList;
    }

    public final c.b d() {
        boolean z;
        boolean z2;
        if (!this.f46262b.a().f46220b) {
            return null;
        }
        List<List<Integer>> c2 = c();
        if (c2.size() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (c2.size() == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        c.b bVar = new c.b();
        int i2 = 0;
        for (List<Integer> list : c2) {
            if (list != null && list.size() >= 5) {
                if (i2 == 0) {
                    bVar.f46238a = (float) list.get(0).intValue();
                    bVar.f46239b = (float) list.get(1).intValue();
                    bVar.f46240c = (float) list.get(2).intValue();
                    bVar.f46241d = (float) list.get(3).intValue();
                    float intValue = (float) list.get(4).intValue();
                    bVar.f46238a = intValue;
                    bVar.f46242e = intValue;
                } else {
                    if (i2 == 1) {
                        if (z2) {
                            bVar.f46243f = (float) list.get(0).intValue();
                            bVar.f46244g = (float) list.get(1).intValue();
                            bVar.f46245h = (float) list.get(2).intValue();
                            bVar.f46246i = (float) list.get(3).intValue();
                            bVar.f46247j = (float) list.get(4).intValue();
                        }
                    } else if (i2 != 1) {
                        if (i2 == 2 && z2) {
                            bVar.f46248k = (float) list.get(0).intValue();
                            bVar.f46249l = (float) list.get(1).intValue();
                            bVar.f46250m = (float) list.get(2).intValue();
                            bVar.n = (float) list.get(3).intValue();
                            bVar.o = (float) list.get(4).intValue();
                        }
                    }
                    if (z) {
                        bVar.f46243f = 0.0f;
                        bVar.f46244g = 0.0f;
                        bVar.f46245h = 0.0f;
                        bVar.f46246i = 0.0f;
                        bVar.f46247j = 0.0f;
                        bVar.f46248k = (float) list.get(0).intValue();
                        bVar.f46249l = (float) list.get(1).intValue();
                        bVar.f46250m = (float) list.get(2).intValue();
                        bVar.n = (float) list.get(3).intValue();
                        bVar.o = (float) list.get(4).intValue();
                    }
                }
                i2++;
            }
        }
        return bVar;
    }

    public a(Context context, com.bytedance.z.a.a.c cVar) {
        super(context, cVar);
    }
}
