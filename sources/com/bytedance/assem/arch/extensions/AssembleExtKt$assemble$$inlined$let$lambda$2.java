package com.bytedance.assem.arch.extensions;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.e;
import com.bytedance.assem.arch.service.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;

public final class AssembleExtKt$assemble$$inlined$let$lambda$2 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f25622a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Fragment f25623b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Assembler f25624c;

    static {
        Covode.recordClassIndex(14907);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (e.f25639c[aVar.ordinal()] == 1) {
            Fragment fragment = this.f25623b;
            if (fragment instanceof c) {
                e eVar = this.f25622a;
                c cVar = (c) fragment;
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
                            eVar.b(cls3, cVar);
                        }
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                    }
                }
            }
            this.f25624c.d(this.f25623b);
        }
    }

    AssembleExtKt$assemble$$inlined$let$lambda$2(e eVar, Fragment fragment, Assembler assembler) {
        this.f25622a = eVar;
        this.f25623b = fragment;
        this.f25624c = assembler;
    }
}
