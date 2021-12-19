package com.bytedance.assem.arch.extensions;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.e;
import com.bytedance.assem.arch.service.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;

public final class AssembleExtKt$assemble$$inlined$let$lambda$4 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f25625a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.fragment.app.e f25626b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Assembler f25627c;

    static {
        Covode.recordClassIndex(14908);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (e.f25640d[aVar.ordinal()] == 1) {
            androidx.fragment.app.e eVar = this.f25626b;
            if (eVar instanceof c) {
                e eVar2 = this.f25625a;
                c cVar = (c) eVar;
                Class<?> cls = cVar.getClass();
                Class<?>[] interfaces = cls.getInterfaces();
                if (interfaces != null && interfaces.length != 0) {
                    while (cls != Object.class) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        l.a((Object) interfaces2, "");
                        ArrayList<Class<?>> arrayList = new ArrayList();
                        for (Class<?> cls2 : interfaces2) {
                            if (c.class.isAssignableFrom(cls2)) {
                                arrayList.add(cls2);
                            }
                        }
                        for (Class<?> cls3 : arrayList) {
                            l.a((Object) cls3, "");
                            eVar2.b(cls3, cVar);
                        }
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                    }
                }
            }
            this.f25627c.d(this.f25626b);
        }
    }

    public AssembleExtKt$assemble$$inlined$let$lambda$4(e eVar, androidx.fragment.app.e eVar2, Assembler assembler) {
        this.f25625a = eVar;
        this.f25626b = eVar2;
        this.f25627c = assembler;
    }
}
