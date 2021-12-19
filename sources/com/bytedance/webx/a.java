package com.bytedance.webx;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.d.b;
import com.bytedance.webx.d.c;
import com.bytedance.webx.f.b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class a<T> implements c {

    /* renamed from: c  reason: collision with root package name */
    public static C1134a f45900c = new C1134a();

    /* renamed from: d  reason: collision with root package name */
    public h f45901d;

    /* renamed from: e  reason: collision with root package name */
    public b f45902e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f45903f = true;

    /* renamed from: g  reason: collision with root package name */
    public String f45904g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f45905h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f45906i;

    /* access modifiers changed from: protected */
    public abstract void a(C1134a aVar);

    public boolean a() {
        return this.f45905h;
    }

    public final T b() {
        return (T) this.f45902e.b();
    }

    public final boolean c() {
        if (this.f45904g != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(28065);
    }

    /* renamed from: com.bytedance.webx.a$a  reason: collision with other inner class name */
    public static class C1134a {
        static {
            Covode.recordClassIndex(28066);
        }

        public static void a(com.bytedance.webx.e.b bVar, a aVar) {
            com.bytedance.webx.d.a extendableContext = bVar.getExtendableContext();
            a[] aVarArr = {aVar};
            int i2 = 0;
            do {
                a aVar2 = aVarArr[0];
                Class<?> cls = aVar2.getClass();
                if (!extendableContext.a((Class<? extends a>) cls)) {
                    extendableContext.a((Class<? extends a>) cls, aVar2);
                    i.a(aVar2);
                    i2++;
                } else {
                    return;
                }
            } while (i2 <= 0);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, com.bytedance.webx.f.a aVar, int i2) {
        b bVar = this.f45902e;
        if (bVar != null) {
            Map<String, TreeMap<Integer, com.bytedance.webx.f.a>> a2 = bVar.a();
            if (a2 == null) {
                a2 = Collections.synchronizedMap(new HashMap());
                bVar.a(a2);
                com.bytedance.webx.f.b.f45992a.add(bVar);
            }
            b.a aVar2 = (b.a) a2.get(str);
            if (aVar2 == null) {
                aVar2 = new b.a((byte) 0);
                a2.put(str, aVar2);
            }
            if (!aVar2.containsValue(aVar)) {
                synchronized (com.bytedance.webx.f.b.class) {
                    aVar2.mId++;
                    if (aVar2.mId != 10000) {
                        aVar2.put(Integer.valueOf((i2 * 10000) + aVar2.mId), aVar);
                    } else {
                        throw new Error("listener id > 999");
                    }
                }
            }
        }
    }
}
