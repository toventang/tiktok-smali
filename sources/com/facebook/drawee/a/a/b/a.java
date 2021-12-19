package com.facebook.drawee.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f47214a;

    static {
        Covode.recordClassIndex(28722);
    }

    public a(b... bVarArr) {
        ArrayList arrayList = new ArrayList(2);
        this.f47214a = arrayList;
        Collections.addAll(arrayList, bVarArr);
    }

    public final synchronized void a(b bVar) {
        MethodCollector.i(3531);
        this.f47214a.add(bVar);
        MethodCollector.o(3531);
    }

    public final synchronized void b(b bVar) {
        MethodCollector.i(3532);
        this.f47214a.remove(bVar);
        MethodCollector.o(3532);
    }

    @Override // com.facebook.drawee.a.a.b.b
    public final synchronized void a(String str, int i2, boolean z) {
        MethodCollector.i(3533);
        int size = this.f47214a.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = this.f47214a.get(i3);
            if (bVar != null) {
                try {
                    bVar.a(str, i2, z);
                } catch (Exception e2) {
                    com.facebook.common.e.a.c("ForwardingImageOriginListener", "InternalListener exception in onImageLoaded", e2);
                }
            }
        }
        MethodCollector.o(3533);
    }
}
