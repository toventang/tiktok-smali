package com.ss.android.ugc.aweme.profile.ui.v2;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.f;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.service.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.z;
import java.util.ArrayList;

public final class I18nMyProfileFragmentV2$refreshUI$$inlined$setAssemServiceState$1 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Fragment f117196a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z.e f117197b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Assembler f117198c;

    static {
        Covode.recordClassIndex(75689);
    }

    public I18nMyProfileFragmentV2$refreshUI$$inlined$setAssemServiceState$1(Fragment fragment, z.e eVar, Assembler assembler) {
        this.f117196a = fragment;
        this.f117197b = eVar;
        this.f117198c = assembler;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (g.f117273a[aVar.ordinal()] == 1) {
            T t = this.f117197b.element;
            c cVar = (c) this.f117196a;
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
            this.f117198c.d(this.f117196a);
        }
    }
}
