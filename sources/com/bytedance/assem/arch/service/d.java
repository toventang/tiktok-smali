package com.bytedance.assem.arch.service;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.e;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.k.k;
import h.z;

public final class d {
    static {
        Covode.recordClassIndex(14956);
    }

    static final class a extends m implements h.f.a.b<DATA, p<A>> {
        final /* synthetic */ k $prop1;

        static {
            Covode.recordClassIndex(14957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(1);
            this.$prop1 = kVar;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            return new p(this.$prop1.get(obj));
        }
    }

    static final class c extends m implements h.f.a.b<DATA, q<A, B>> {
        final /* synthetic */ k $prop1;
        final /* synthetic */ k $prop2;

        static {
            Covode.recordClassIndex(14959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(k kVar, k kVar2) {
            super(1);
            this.$prop1 = kVar;
            this.$prop2 = kVar2;
        }

        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Object obj) {
            l.c(obj, "");
            return new q(this.$prop1.get(obj), this.$prop2.get(obj));
        }
    }

    static final class b extends m implements h.f.a.b<p<A>, z> {
        final /* synthetic */ z.e $lastValue;
        final /* synthetic */ h.f.a.b $observer;

        static {
            Covode.recordClassIndex(14958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z.e eVar, h.f.a.b bVar) {
            super(1);
            this.$lastValue = eVar;
            this.$observer = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Object obj) {
            T t = (T) ((p) obj);
            l.c(t, "");
            if (!l.a((Object) t, (Object) this.$lastValue.element)) {
                h.f.a.b bVar = this.$observer;
                if (bVar != null) {
                    bVar.invoke(t.f25659a);
                }
                this.$lastValue.element = t;
            }
            return h.z.f158842a;
        }
    }

    /* renamed from: com.bytedance.assem.arch.service.d$d  reason: collision with other inner class name */
    static final class C0539d extends m implements h.f.a.b<q<A, B>, h.z> {
        final /* synthetic */ z.e $lastValue;
        final /* synthetic */ h.f.a.m $observer;

        static {
            Covode.recordClassIndex(14960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0539d(z.e eVar, h.f.a.m mVar) {
            super(1);
            this.$lastValue = eVar;
            this.$observer = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Object obj) {
            T t = (T) ((q) obj);
            l.c(t, "");
            if (!l.a((Object) t, (Object) this.$lastValue.element)) {
                h.f.a.m mVar = this.$observer;
                if (mVar != null) {
                    mVar.invoke(t.f25660a, t.f25661b);
                }
                this.$lastValue.element = t;
            }
            return h.z.f158842a;
        }
    }

    public static final <SERVICE extends b<DATA>, DATA extends a> SERVICE c(com.bytedance.assem.arch.core.a aVar, h.k.c<SERVICE> cVar) {
        l.c(aVar, "");
        l.c(cVar, "");
        return (SERVICE) aVar.bx_().f25534g.b(h.f.a.a(cVar), (String) null);
    }

    public static /* synthetic */ c e(com.bytedance.assem.arch.core.a aVar, h.k.c cVar) {
        l.c(aVar, "");
        l.c(cVar, "");
        return aVar.bx_().f25534g.a(h.f.a.a(cVar), (String) null);
    }

    public static /* synthetic */ a f(com.bytedance.assem.arch.core.a aVar, h.k.c cVar) {
        l.c(aVar, "");
        l.c(cVar, "");
        if (c(aVar, cVar) != null) {
            return aVar.bx_().f25534g.a(h.f.a.a(cVar));
        }
        return null;
    }

    public static /* synthetic */ a a(AssemViewModel assemViewModel, h.k.c cVar) {
        e eVar;
        l.c(assemViewModel, "");
        l.c(cVar, "");
        l.c(assemViewModel, "");
        l.c(cVar, "");
        e eVar2 = assemViewModel.f25688e;
        if (eVar2 == null || eVar2.b(h.f.a.a(cVar), (String) null) == null || (eVar = assemViewModel.f25688e) == null) {
            return null;
        }
        return eVar.a(h.f.a.a(cVar));
    }

    public static final <SERVICE extends c> SERVICE b(com.bytedance.assem.arch.core.a aVar, h.k.c<SERVICE> cVar) {
        l.c(aVar, "");
        l.c(cVar, "");
        SERVICE service = (SERVICE) aVar.bx_().f25534g.a(h.f.a.a(cVar), (String) null);
        if (service != null) {
            return service;
        }
        throw new IllegalArgumentException("No such service or has not been registered.".toString());
    }

    public static /* synthetic */ b a(Fragment fragment, h.k.c cVar) {
        b b2;
        l.c(fragment, "");
        l.c(cVar, "");
        ac a2 = ae.a(fragment.requireActivity(), (ad.b) null).a(Assembler.class);
        l.a((Object) a2, "");
        e c2 = ((Assembler) a2).c(fragment);
        if (c2 != null && (b2 = c2.b(h.f.a.a(cVar), (String) null)) != null) {
            return b2;
        }
        throw new IllegalArgumentException("No such service or has not been registered.".toString());
    }

    public static final <SERVICE extends b<DATA>, DATA extends a> SERVICE b(Fragment fragment, h.k.c<SERVICE> cVar) {
        androidx.fragment.app.e activity;
        l.c(fragment, "");
        l.c(cVar, "");
        if (fragment.isAdded() && fragment.getActivity() != null && ((activity = fragment.getActivity()) == null || !activity.isFinishing())) {
            androidx.fragment.app.e activity2 = fragment.getActivity();
            if (activity2 == null) {
                l.a();
            }
            ac a2 = ae.a(activity2, (ad.b) null).a(Assembler.class);
            l.a((Object) a2, "");
            e c2 = ((Assembler) a2).c(fragment);
            if (c2 != null) {
                return (SERVICE) c2.b(h.f.a.a(cVar), (String) null);
            }
        }
        return null;
    }

    public static /* synthetic */ c d(Fragment fragment, h.k.c cVar) {
        androidx.fragment.app.e activity;
        l.c(fragment, "");
        l.c(cVar, "");
        if (fragment.isAdded() && fragment.getActivity() != null && ((activity = fragment.getActivity()) == null || !activity.isFinishing())) {
            androidx.fragment.app.e activity2 = fragment.getActivity();
            if (activity2 == null) {
                l.a();
            }
            ac a2 = ae.a(activity2, (ad.b) null).a(Assembler.class);
            l.a((Object) a2, "");
            e c2 = ((Assembler) a2).c(fragment);
            if (c2 != null) {
                return c2.a(h.f.a.a(cVar), (String) null);
            }
        }
        return null;
    }

    public static final <SERVICE extends b<DATA>, DATA extends a> SERVICE a(com.bytedance.assem.arch.core.a aVar, h.k.c<SERVICE> cVar) {
        l.c(aVar, "");
        l.c(cVar, "");
        SERVICE service = (SERVICE) aVar.bx_().f25534g.b(h.f.a.a(cVar), (String) null);
        if (service != null) {
            return service;
        }
        throw new IllegalArgumentException("No such service or has not been registered.".toString());
    }

    public static /* synthetic */ c a(androidx.fragment.app.e eVar, h.k.c cVar) {
        l.c(eVar, "");
        l.c(cVar, "");
        if (eVar.isFinishing()) {
            return null;
        }
        ac a2 = ae.a(eVar, (ad.b) null).a(Assembler.class);
        l.a((Object) a2, "");
        e c2 = ((Assembler) a2).c(eVar);
        if (c2 != null) {
            return c2.a(h.f.a.a(cVar), (String) null);
        }
        return null;
    }

    public static final <DATA extends a, A> void a(com.bytedance.assem.arch.core.a aVar, h.k.c<? extends b<DATA>> cVar, k<DATA, ? extends A> kVar, h.f.a.b<? super A, h.z> bVar) {
        l.c(aVar, "");
        l.c(cVar, "");
        l.c(kVar, "");
        l.c(aVar, "");
        l.c(cVar, "");
        l.c(kVar, "");
        e eVar = aVar.bx_().f25534g;
        z.e eVar2 = new z.e();
        eVar2.element = null;
        eVar.a(aVar, h.f.a.a(cVar), new a(kVar), new b(eVar2, bVar));
    }

    public static final <DATA extends a, A, B> void a(com.bytedance.assem.arch.core.a aVar, h.k.c<? extends b<DATA>> cVar, k<DATA, ? extends A> kVar, k<DATA, ? extends B> kVar2, h.f.a.m<? super A, ? super B, h.z> mVar) {
        l.c(aVar, "");
        l.c(cVar, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        l.c(aVar, "");
        l.c(cVar, "");
        l.c(kVar, "");
        l.c(kVar2, "");
        e eVar = aVar.bx_().f25534g;
        z.e eVar2 = new z.e();
        eVar2.element = null;
        eVar.a(aVar, h.f.a.a(cVar), new c(kVar, kVar2), new C0539d(eVar2, mVar));
    }
}
