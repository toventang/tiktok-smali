package com.bytedance.assem.arch.service;

import androidx.fragment.app.e;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;

public final class AssemServiceExtKt$setAssemServiceState$3 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f25672a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z.e f25673b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Assembler f25674c;

    static {
        Covode.recordClassIndex(14950);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (e.f25681a[aVar.ordinal()] == 1) {
            if (this.f25672a instanceof c) {
                T t = this.f25673b.element;
                c cVar = (c) this.f25672a;
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
                            t.b(cls3, cVar);
                        }
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                    }
                }
            }
            this.f25674c.d(this.f25672a);
        }
    }
}
