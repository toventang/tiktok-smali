package com.bytedance.b.c.a;

import com.bytedance.apm.q.l;
import com.bytedance.b.c.a.a;
import com.bytedance.b.c.a.b;
import com.bytedance.b.c.c.i;
import com.bytedance.b.c.d.a;
import com.bytedance.b.j.d.b;
import com.bytedance.b.j.e.a;
import com.bytedance.b.k.d.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.z.a.a.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    c f26007a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f26008b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public a f26009c;

    /* renamed from: d  reason: collision with root package name */
    public long f26010d;

    /* renamed from: e  reason: collision with root package name */
    public long f26011e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.b.c.b.a f26012f;

    /* renamed from: g  reason: collision with root package name */
    public c f26013g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f26014h = true;

    static {
        Covode.recordClassIndex(15154);
    }

    d(c cVar, c cVar2) {
        this.f26007a = cVar;
        this.f26013g = cVar2;
    }

    /* access modifiers changed from: package-private */
    public final void a(float f2, Map<Integer, i> map, Map<Integer, i> map2, c.a aVar) {
        a.EnumC0556a aVar2;
        i iVar;
        if (!(map.isEmpty() || map2.isEmpty() || f2 <= 0.0f)) {
            LinkedList linkedList = new LinkedList();
            LinkedList<a.C0560a> linkedList2 = new LinkedList<>();
            for (Map.Entry<Integer, i> entry : map.entrySet()) {
                i value = entry.getValue();
                if (!(value == null || (iVar = map2.get(entry.getKey())) == null || !iVar.f26104b.equals(value.f26104b))) {
                    double d2 = (double) iVar.f26105c;
                    double d3 = (double) value.f26105c;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = d2 - d3;
                    double d5 = (double) f2;
                    Double.isNaN(d5);
                    double d6 = d4 / d5;
                    linkedList.add(new l(iVar.f26104b, Double.valueOf(com.a.a("%.2f", new Object[]{Double.valueOf(d6)}))));
                    linkedList2.add(new a.C0560a(iVar.f26104b, Double.valueOf(com.a.a("%.2f", new Object[]{Double.valueOf(d6)})).doubleValue(), iVar.f26103a));
                }
            }
            if (!linkedList.isEmpty()) {
                Collections.sort(linkedList2, new Comparator<a.C0560a>() {
                    /* class com.bytedance.b.c.a.d.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(15156);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    @Override // java.util.Comparator
                    public final /* bridge */ /* synthetic */ int compare(a.C0560a aVar, a.C0560a aVar2) {
                        return (int) ((aVar2.f26309b * 100.0d) - (aVar.f26309b * 100.0d));
                    }
                });
                a.C0557a.f26115a.a(linkedList2);
                if (this.f26012f.f26042d) {
                    if (b.a.f25999a.a()) {
                        aVar2 = a.EnumC0556a.FRONT;
                    } else {
                        aVar2 = a.EnumC0556a.BACK;
                    }
                    e eVar = new e(aVar2, com.bytedance.b.i.a.c.a().b(), linkedList, aVar);
                    try {
                        eVar.f26018b = this.f26013g.i();
                    } catch (Throwable unused) {
                    }
                    com.bytedance.b.h.a.a(eVar);
                }
            }
        }
    }
}
