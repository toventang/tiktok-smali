package com.bytedance.assem.arch.b;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.assem.arch.extensions.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import h.f.b.l;
import h.f.b.m;
import h.k.c;
import h.w;
import h.z;

public final class u {
    static {
        Covode.recordClassIndex(14813);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f25469a;

        static {
            Covode.recordClassIndex(14814);
        }

        a(h.f.a.a aVar) {
            this.f25469a = aVar;
        }

        public final void run() {
            this.f25469a.invoke();
        }
    }

    static final class b extends m implements h.f.a.a<Assembler> {
        final /* synthetic */ c $clazz;
        final /* synthetic */ v $this_safeTriggerAssemLazyLoad;

        static {
            Covode.recordClassIndex(14815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(v vVar, c cVar) {
            super(0);
            this.$this_safeTriggerAssemLazyLoad = vVar;
            this.$clazz = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Assembler invoke() {
            e b2;
            v vVar = this.$this_safeTriggerAssemLazyLoad;
            if (vVar.ar_() instanceof e) {
                Context ar_ = this.$this_safeTriggerAssemLazyLoad.ar_();
                if (ar_ != null) {
                    b2 = (e) ar_;
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                b2 = com.bytedance.assem.arch.extensions.b.b(vVar);
                if (b2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            ac a2 = ae.a(b2, (ad.b) null).a(Assembler.class);
            l.a((Object) a2, "");
            Assembler assembler = (Assembler) a2;
            assembler.a(this.$this_safeTriggerAssemLazyLoad, this.$clazz);
            return assembler;
        }
    }

    public static final <REUSED extends v<? extends d>> void a(REUSED reused, c<? extends v<?>> cVar) {
        l.c(reused, "");
        l.c(cVar, "");
        j.a(true).execute(new a(new b(reused, cVar)));
    }

    public static final void a(d dVar, h.f.a.a<z> aVar) {
        l.c(aVar, "");
        if (!(dVar instanceof v)) {
            dVar = null;
        }
        v vVar = (v) dVar;
        if (vVar == null) {
            aVar.invoke();
        } else if (vVar.f25473j) {
            aVar.invoke();
        } else {
            k kVar = j.f25647b;
            if (kVar != null) {
                kVar.a("reused assem: " + vVar + " is not viewcreated!", new RuntimeException("reused assem: " + vVar + " is not viewcreated!"));
            }
        }
    }

    public static final <ASSEM extends v<? extends d>> void a(ASSEM assem, h.f.a.b<? super Assembler, z> bVar) {
        e b2;
        l.c(assem, "");
        l.c(bVar, "");
        if (assem.ar_() instanceof e) {
            Context ar_ = assem.ar_();
            if (ar_ != null) {
                b2 = (e) ar_;
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        } else {
            b2 = com.bytedance.assem.arch.extensions.b.b(assem);
            if (b2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        ac a2 = ae.a(b2, (ad.b) null).a(Assembler.class);
        l.a((Object) a2, "");
        Assembler assembler = (Assembler) a2;
        com.bytedance.assem.arch.core.d b3 = assembler.b(assem);
        if (b3 == null) {
            b3 = new com.bytedance.assem.arch.core.d(assembler.b(assem.by_()));
            assembler.a(assem, b3);
        }
        com.bytedance.assem.arch.core.e c2 = assembler.c(assem);
        if (c2 == null) {
            c2 = new com.bytedance.assem.arch.core.e(assembler.c(assem.by_()));
            assembler.a(assem, c2);
        }
        AssemSupervisor a3 = assembler.a(assem);
        if (a3 == null) {
            a3 = AssemSupervisor.a.a(assem, b2, b3, c2);
            a3.a(assem.s());
            assembler.a(assem, a3);
        }
        bVar.invoke(assembler);
        a3.a(false, (com.bytedance.assem.arch.core.a) null);
    }
}
