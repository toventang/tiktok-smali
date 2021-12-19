package com.bytedance.android.live;

import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ad;
import com.bytedance.android.live.slot.x;
import com.bytedance.android.live.slot.y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class g {

    /* renamed from: b  reason: collision with root package name */
    private static g f9899b;

    /* renamed from: a  reason: collision with root package name */
    final a f9900a = new a();

    static {
        Covode.recordClassIndex(5071);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        Map<IIconSlot.b, List<y>> f9901a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        Map<IFrameSlot.b, List<y>> f9902b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        Map<IIconSlot.b, x> f9903c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public Map<String, y> f9904d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        Map<String, x> f9905e = new HashMap();

        static {
            Covode.recordClassIndex(5072);
        }

        a() {
        }

        public final y a(String str) {
            return this.f9904d.get(str);
        }
    }

    public static g a() {
        MethodCollector.i(10435);
        if (f9899b == null) {
            synchronized (g.class) {
                try {
                    if (f9899b == null) {
                        f9899b = new g();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10435);
                    throw th;
                }
            }
        }
        g gVar = f9899b;
        MethodCollector.o(10435);
        return gVar;
    }

    public final List<ad> a(IFrameSlot.b bVar) {
        return a(this.f9900a.f9902b.get(bVar));
    }

    public final x b(IIconSlot.b bVar) {
        return this.f9900a.f9903c.get(bVar);
    }

    public final List<ad> a(IIconSlot.b bVar) {
        return a(this.f9900a.f9901a.get(bVar));
    }

    private static List<ad> a(List<y> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (y yVar : list) {
            ad adVar = new ad();
            adVar.f12751b = yVar;
            adVar.f12750a = 1;
            arrayList.add(adVar);
        }
        return arrayList;
    }
}
