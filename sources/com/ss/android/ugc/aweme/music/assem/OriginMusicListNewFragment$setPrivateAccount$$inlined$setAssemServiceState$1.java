package com.ss.android.ugc.aweme.music.assem;

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

public final class OriginMusicListNewFragment$setPrivateAccount$$inlined$setAssemServiceState$1 implements f {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Fragment f111111a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z.e f111112b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Assembler f111113c;

    static {
        Covode.recordClassIndex(71308);
    }

    public OriginMusicListNewFragment$setPrivateAccount$$inlined$setAssemServiceState$1(Fragment fragment, z.e eVar, Assembler assembler) {
        this.f111111a = fragment;
        this.f111112b = eVar;
        this.f111113c = assembler;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.c(mVar, "");
        l.c(aVar, "");
        if (e.f111151a[aVar.ordinal()] == 1) {
            T t = this.f111112b.element;
            c cVar = (c) this.f111111a;
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
            this.f111113c.d(this.f111111a);
        }
    }
}
