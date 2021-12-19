package com.bytedance.assem.arch.a;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;

public final class c {
    static {
        Covode.recordClassIndex(14769);
    }

    public static final class a implements h<a<OPT>> {

        /* renamed from: a  reason: collision with root package name */
        public a<OPT> f25414a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AssemViewModel f25415b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.c f25416c;

        static {
            Covode.recordClassIndex(14770);
        }

        @Override // h.h
        public final boolean isInitialized() {
            return true;
        }

        @Override // h.h
        public final /* synthetic */ Object getValue() {
            a<OPT> aVar = this.f25414a;
            if (aVar != null) {
                return aVar;
            }
            a<OPT> a2 = b.a(this.f25416c);
            this.f25414a = a2;
            this.f25415b.a(a2);
            return a2;
        }

        a(AssemViewModel<S> assemViewModel, h.k.c cVar) {
            this.f25415b = assemViewModel;
            this.f25416c = cVar;
        }
    }

    public static final class b implements h<a<OPT>> {

        /* renamed from: a  reason: collision with root package name */
        public a<OPT> f25417a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AssemViewModel f25418b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f25419c;

        static {
            Covode.recordClassIndex(14771);
        }

        @Override // h.h
        public final boolean isInitialized() {
            return true;
        }

        @Override // h.h
        public final /* synthetic */ Object getValue() {
            a<OPT> aVar = this.f25417a;
            if (aVar != null) {
                return aVar;
            }
            a<OPT> aVar2 = (a) this.f25419c.invoke();
            this.f25417a = aVar2;
            this.f25418b.a(aVar2);
            return aVar2;
        }

        b(AssemViewModel<S> assemViewModel, h.f.a.a aVar) {
            this.f25418b = assemViewModel;
            this.f25419c = aVar;
        }
    }

    public static final <S extends j, OPT extends d> h<a<OPT>> a(AssemViewModel<S> assemViewModel, h.f.a.a<? extends a<OPT>> aVar) {
        l.c(assemViewModel, "");
        l.c(aVar, "");
        return new b(assemViewModel, aVar);
    }

    public static final <S extends j, OPT extends d> h<a<OPT>> a(AssemViewModel<S> assemViewModel, h.k.c<? extends a<OPT>> cVar) {
        l.c(assemViewModel, "");
        l.c(cVar, "");
        return new a(assemViewModel, cVar);
    }
}
