package com.bytedance.assem.arch.core;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.b.j;
import com.bytedance.assem.arch.b.v;
import com.bytedance.assem.arch.b.w;
import com.bytedance.assem.arch.b.x;
import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.kakao.usermgmt.StringSet;
import h.f.a.b;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class Assembler extends ac {

    /* renamed from: c  reason: collision with root package name */
    public static final a f25539c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<m, AssemSupervisor> f25540a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public final WeakHashMap<m, d> f25541b = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<m, e> f25542d = new WeakHashMap<>();

    static {
        Covode.recordClassIndex(14876);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14877);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static Assembler a(e eVar) {
            l.c(eVar, "");
            ac a2 = ae.a(eVar, (ad.b) null).a(Assembler.class);
            l.a((Object) a2, "");
            return (Assembler) a2;
        }
    }

    public final void a(a aVar, b<? super i<c>, z> bVar) {
        l.c(aVar, "");
        l.c(bVar, "");
        i iVar = new i();
        bVar.invoke(iVar);
        p a2 = iVar.a();
        String str = (String) a2.component1();
        c cVar = (c) a2.component2();
        d dVar = this.f25541b.get(aVar);
        if (dVar != null) {
            dVar.a(cVar, str);
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f25541b.clear();
        this.f25540a.clear();
        this.f25542d.clear();
    }

    public final AssemSupervisor a(m mVar) {
        return this.f25540a.get(mVar);
    }

    public final d b(m mVar) {
        return this.f25541b.get(mVar);
    }

    public final e c(m mVar) {
        return this.f25542d.get(mVar);
    }

    public final void d(m mVar) {
        if (mVar != null) {
            this.f25541b.remove(mVar);
            this.f25542d.remove(mVar);
            this.f25540a.remove(mVar);
        }
    }

    public final void a(m mVar, AssemSupervisor assemSupervisor) {
        if (mVar != null && assemSupervisor != null) {
            this.f25540a.put(mVar, assemSupervisor);
        }
    }

    public final AssemSupervisor a(m mVar, b<? super c, z> bVar) {
        l.c(mVar, "");
        l.c(bVar, "");
        AssemSupervisor assemSupervisor = this.f25540a.get(mVar);
        if (assemSupervisor == null) {
            return null;
        }
        c cVar = new c();
        bVar.invoke(cVar);
        a a2 = cVar.a();
        a(cVar.f25557c, a2, assemSupervisor.f25534g);
        assemSupervisor.a(a2);
        assemSupervisor.a(false, (a) null);
        return assemSupervisor;
    }

    public final AssemSupervisor b(m mVar, b<? super q, z> bVar) {
        l.c(mVar, "");
        l.c(bVar, "");
        AssemSupervisor assemSupervisor = this.f25540a.get(mVar);
        if (assemSupervisor == null) {
            return null;
        }
        q qVar = new q();
        bVar.invoke(qVar);
        com.bytedance.assem.arch.d.a b2 = qVar.a();
        a(qVar.f25597c, b2, assemSupervisor.f25534g);
        assemSupervisor.a(b2);
        assemSupervisor.a(false, (a) null);
        return assemSupervisor;
    }

    public final <REUSED extends v<? extends d>> AssemSupervisor a(REUSED reused, b<? super n, z> bVar) {
        l.c(reused, "");
        l.c(bVar, "");
        AssemSupervisor assemSupervisor = this.f25540a.get(reused);
        if (assemSupervisor != null) {
            AssemSupervisor assemSupervisor2 = assemSupervisor;
            n nVar = new n();
            bVar.invoke(nVar);
            if (nVar.f25587c == h.LAZY) {
                Map<h.k.c<? extends a>, k> map = assemSupervisor2.f25529b;
                h.k.c<? extends x<? extends d>> cVar = nVar.f25585a;
                if (cVar == null) {
                    l.a(StringSet.type);
                }
                map.put(cVar, nVar);
                return reused.bx_();
            }
            x<? extends d> b2 = nVar.a();
            assemSupervisor2.a(b2);
            j jVar = reused.n;
            if (jVar != null) {
                jVar.a(b2);
            }
            return reused.bx_();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final <REUSED extends v<? extends d>> AssemSupervisor b(REUSED reused, b<? super m, z> bVar) {
        l.c(reused, "");
        l.c(bVar, "");
        AssemSupervisor assemSupervisor = this.f25540a.get(reused);
        if (assemSupervisor != null) {
            AssemSupervisor assemSupervisor2 = assemSupervisor;
            m mVar = new m();
            bVar.invoke(mVar);
            if (mVar.f25579c == h.LAZY) {
                Map<h.k.c<? extends a>, k> map = assemSupervisor2.f25529b;
                h.k.c<? extends w<? extends d>> cVar = mVar.f25577a;
                if (cVar == null) {
                    l.a(StringSet.type);
                }
                map.put(cVar, mVar);
                return reused.bx_();
            }
            w<? extends d> b2 = mVar.a();
            assemSupervisor2.a(b2);
            j jVar = reused.n;
            if (jVar != null) {
                jVar.a(b2);
            }
            return reused.bx_();
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void a(Fragment fragment, b<? super i<c>, z> bVar) {
        l.c(fragment, "");
        l.c(bVar, "");
        i iVar = new i();
        bVar.invoke(iVar);
        p a2 = iVar.a();
        String str = (String) a2.component1();
        c cVar = (c) a2.component2();
        d dVar = this.f25541b.get(fragment);
        if (dVar != null) {
            dVar.a(cVar, str);
        }
    }

    public final void a(m mVar, d dVar) {
        if (mVar != null && dVar != null) {
            this.f25541b.put(mVar, dVar);
        }
    }

    public final void a(m mVar, e eVar) {
        if (mVar != null && eVar != null) {
            this.f25542d.put(mVar, eVar);
        }
    }

    public final <REUSED extends v<? extends d>> void a(REUSED reused, h.k.c<? extends v<?>> cVar) {
        a aVar;
        f.a.l.b<com.bytedance.assem.arch.b.b> b2;
        l.c(reused, "");
        l.c(cVar, "");
        AssemSupervisor assemSupervisor = this.f25540a.get(reused);
        if (assemSupervisor != null) {
            l.a((Object) assemSupervisor, "");
            if (assemSupervisor.f25529b.containsKey(cVar)) {
                k remove = assemSupervisor.f25529b.remove(cVar);
                v<? extends d> vVar = null;
                if (remove != null) {
                    aVar = remove.a();
                } else {
                    aVar = null;
                }
                if (aVar instanceof v) {
                    vVar = aVar;
                }
                v<? extends d> vVar2 = vVar;
                if (vVar2 != null) {
                    assemSupervisor.a(vVar2);
                    vVar2.y();
                    j jVar = reused.n;
                    if (jVar != null) {
                        jVar.a(vVar2);
                    }
                    j jVar2 = vVar2.n;
                    if (!(jVar2 == null || (b2 = jVar2.b()) == null)) {
                        b2.onNext(new com.bytedance.assem.arch.b.b(com.bytedance.assem.arch.b.a.HostAttach, vVar2));
                    }
                    assemSupervisor.a(true, (a) vVar2);
                }
            }
        }
    }

    public static void a(List<o> list, a aVar, e eVar) {
        if (list != null && !list.isEmpty()) {
            for (o oVar : list) {
                if (oVar.f25591a.isAssignableFrom(aVar.getClass())) {
                    eVar.a(oVar, (com.bytedance.assem.arch.service.c) aVar);
                } else {
                    throw new IllegalStateException("The serviceClazz must be super interface of this Assem".toString());
                }
            }
        } else if (aVar instanceof com.bytedance.assem.arch.service.c) {
            com.bytedance.assem.arch.service.c cVar = (com.bytedance.assem.arch.service.c) aVar;
            Class<?> cls = cVar.getClass();
            while (cls != Object.class) {
                Class<?>[] interfaces = cls.getInterfaces();
                l.a((Object) interfaces, "");
                ArrayList<Class<?>> arrayList = new ArrayList();
                for (Class<?> cls2 : interfaces) {
                    if (com.bytedance.assem.arch.service.c.class.isAssignableFrom(cls2)) {
                        arrayList.add(cls2);
                    }
                }
                for (Class<?> cls3 : arrayList) {
                    l.a((Object) cls3, "");
                    eVar.a(cls3, cVar);
                }
                cls = cls.getSuperclass();
                if (cls == null) {
                    return;
                }
            }
        }
    }
}
