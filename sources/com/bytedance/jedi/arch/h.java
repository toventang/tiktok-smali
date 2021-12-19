package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.arch.internal.i;
import f.a.b.b;
import f.a.t;
import f.a.x;
import h.f.a.m;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.k.k;
import h.z;

public interface h<RECEIVER extends g> {
    static {
        Covode.recordClassIndex(24270);
    }

    <S extends af, T> b asyncSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends a<? extends T>> kVar, ah<ak<a<T>>> ahVar, m<? super RECEIVER, ? super Throwable, z> mVar, h.f.a.b<? super RECEIVER, z> bVar, m<? super RECEIVER, ? super T, z> mVar2);

    v getLifecycleOwnerHolder();

    ae<RECEIVER> getReceiverHolder();

    boolean getUniqueOnlyGlobal();

    <S extends af, A> b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, m<? super RECEIVER, ? super A, z> mVar);

    <S extends af, A, B> b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super RECEIVER, ? super A, ? super B, z> qVar);

    <S extends af, A, B, C> b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super RECEIVER, ? super A, ? super B, ? super C, z> rVar);

    <S extends af, A, B, C, D> b selectSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, z> sVar);

    <S extends af> b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, m<? super RECEIVER, ? super S, z> mVar);

    <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar);

    public static final class a {
        static {
            Covode.recordClassIndex(24271);
        }

        public static <RECEIVER extends g, S extends af, A, B, C, D> f.a.b.b a(h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, z> sVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(ahVar, "");
            l.c(sVar, "");
            ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            androidx.lifecycle.m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            ah a2 = i.a(hVar, ahVar);
            e eVar = new e(receiverHolder, hVar, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(a2, "");
            l.c(eVar, "");
            t<R> a3 = jediViewModel.bf_().b().d(new i.m(jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, eVar)).a(a2.f39378b);
            x xVar = a3;
            if (a2.f39377a) {
                xVar = (t<T>) a3.f();
            }
            l.a((Object) xVar, "");
            return jediViewModel.a((t) xVar, lifecycleOwner, a2.f39381e, a2.f39379c, a2.f39382f, new i.n(a2, jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, eVar));
        }

        public static <RECEIVER extends g, VM1 extends JediViewModel<S1>, S1 extends af, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
            l.c(vm1, "");
            l.c(bVar, "");
            return (R) bVar.invoke(vm1.at_());
        }

        public static final class b extends h.f.b.m implements h.f.a.b<A, z> {
            final /* synthetic */ ah $config$inlined;
            final /* synthetic */ ae $holder;
            final /* synthetic */ k $prop1$inlined;
            final /* synthetic */ m $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(24273);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(ae aeVar, h hVar, JediViewModel jediViewModel, k kVar, ah ahVar, m mVar) {
                super(1);
                this.$holder = aeVar;
                this.this$0 = hVar;
                this.$this_selectSubscribe$inlined = jediViewModel;
                this.$prop1$inlined = kVar;
                this.$config$inlined = ahVar;
                this.$subscriber$inlined = mVar;
            }

            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                g receiver = this.$holder.getReceiver();
                if (receiver != null) {
                    this.$subscriber$inlined.invoke(receiver, obj);
                }
                return z.f158842a;
            }
        }

        public static final class g extends h.f.b.m implements h.f.a.b<S, z> {
            final /* synthetic */ ah $config$inlined;
            final /* synthetic */ ae $holder;
            final /* synthetic */ m $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_subscribe$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(24278);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(ae aeVar, h hVar, JediViewModel jediViewModel, ah ahVar, m mVar) {
                super(1);
                this.$holder = aeVar;
                this.this$0 = hVar;
                this.$this_subscribe$inlined = jediViewModel;
                this.$config$inlined = ahVar;
                this.$subscriber$inlined = mVar;
            }

            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                l.c(obj, "");
                g receiver = this.$holder.getReceiver();
                if (receiver != null) {
                    this.$subscriber$inlined.invoke(receiver, obj);
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.bytedance.jedi.arch.h$a$a */
        public static final class C0963a extends h.f.b.m implements h.f.a.b<a<? extends T>, z> {
            final /* synthetic */ ah $config$inlined;
            final /* synthetic */ ae $holder;
            final /* synthetic */ m $onError$inlined;
            final /* synthetic */ h.f.a.b $onLoading$inlined;
            final /* synthetic */ m $onSuccess$inlined;
            final /* synthetic */ k $prop$inlined;
            final /* synthetic */ JediViewModel $this_asyncSubscribe$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(24272);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0963a(ae aeVar, h hVar, JediViewModel jediViewModel, k kVar, ah ahVar, h.f.a.b bVar, m mVar, m mVar2) {
                super(1);
                this.$holder = aeVar;
                this.this$0 = hVar;
                this.$this_asyncSubscribe$inlined = jediViewModel;
                this.$prop$inlined = kVar;
                this.$config$inlined = ahVar;
                this.$onLoading$inlined = bVar;
                this.$onError$inlined = mVar;
                this.$onSuccess$inlined = mVar2;
            }

            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                m mVar;
                g receiver;
                g receiver2;
                g receiver3;
                a aVar = (a) obj;
                l.c(aVar, "");
                if (aVar instanceof w) {
                    h.f.a.b bVar = this.$onLoading$inlined;
                    if (!(bVar == null || (receiver3 = this.$holder.getReceiver()) == null)) {
                        bVar.invoke(receiver3);
                    }
                } else if (aVar instanceof f) {
                    m mVar2 = this.$onError$inlined;
                    if (!(mVar2 == null || (receiver2 = this.$holder.getReceiver()) == null)) {
                        mVar2.invoke(receiver2, ((f) aVar).f39461a);
                    }
                } else if (!(!(aVar instanceof aj) || (mVar = this.$onSuccess$inlined) == null || (receiver = this.$holder.getReceiver()) == null)) {
                    mVar.invoke(receiver, ((aj) aVar).f39383a);
                }
                return z.f158842a;
            }
        }

        public static final class c extends h.f.b.m implements m<A, B, z> {
            final /* synthetic */ ah $config$inlined;
            final /* synthetic */ ae $holder;
            final /* synthetic */ k $prop1$inlined;
            final /* synthetic */ k $prop2$inlined;
            final /* synthetic */ q $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(24274);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(ae aeVar, h hVar, JediViewModel jediViewModel, k kVar, k kVar2, ah ahVar, q qVar) {
                super(2);
                this.$holder = aeVar;
                this.this$0 = hVar;
                this.$this_selectSubscribe$inlined = jediViewModel;
                this.$prop1$inlined = kVar;
                this.$prop2$inlined = kVar2;
                this.$config$inlined = ahVar;
                this.$subscriber$inlined = qVar;
            }

            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Object obj, Object obj2) {
                g receiver = this.$holder.getReceiver();
                if (receiver != null) {
                    this.$subscriber$inlined.invoke(receiver, obj, obj2);
                }
                return z.f158842a;
            }
        }

        public static final class d extends h.f.b.m implements q<A, B, C, z> {
            final /* synthetic */ ah $config$inlined;
            final /* synthetic */ ae $holder;
            final /* synthetic */ k $prop1$inlined;
            final /* synthetic */ k $prop2$inlined;
            final /* synthetic */ k $prop3$inlined;
            final /* synthetic */ r $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(24275);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(ae aeVar, h hVar, JediViewModel jediViewModel, k kVar, k kVar2, k kVar3, ah ahVar, r rVar) {
                super(3);
                this.$holder = aeVar;
                this.this$0 = hVar;
                this.$this_selectSubscribe$inlined = jediViewModel;
                this.$prop1$inlined = kVar;
                this.$prop2$inlined = kVar2;
                this.$prop3$inlined = kVar3;
                this.$config$inlined = ahVar;
                this.$subscriber$inlined = rVar;
            }

            @Override // h.f.a.q
            public final /* synthetic */ z invoke(Object obj, Object obj2, Object obj3) {
                g receiver = this.$holder.getReceiver();
                if (receiver != null) {
                    this.$subscriber$inlined.a(receiver, obj, obj2, obj3);
                }
                return z.f158842a;
            }
        }

        public static final class e extends h.f.b.m implements r<A, B, C, D, z> {
            final /* synthetic */ ah $config$inlined;
            final /* synthetic */ ae $holder;
            final /* synthetic */ k $prop1$inlined;
            final /* synthetic */ k $prop2$inlined;
            final /* synthetic */ k $prop3$inlined;
            final /* synthetic */ k $prop4$inlined;
            final /* synthetic */ s $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(24276);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(ae aeVar, h hVar, JediViewModel jediViewModel, k kVar, k kVar2, k kVar3, k kVar4, ah ahVar, s sVar) {
                super(4);
                this.$holder = aeVar;
                this.this$0 = hVar;
                this.$this_selectSubscribe$inlined = jediViewModel;
                this.$prop1$inlined = kVar;
                this.$prop2$inlined = kVar2;
                this.$prop3$inlined = kVar3;
                this.$prop4$inlined = kVar4;
                this.$config$inlined = ahVar;
                this.$subscriber$inlined = sVar;
            }

            @Override // h.f.a.r
            public final /* synthetic */ z a(Object obj, Object obj2, Object obj3, Object obj4) {
                g receiver = this.$holder.getReceiver();
                if (receiver != null) {
                    this.$subscriber$inlined.invoke(receiver, obj, obj2, obj3, obj4);
                }
                return z.f158842a;
            }
        }

        public static <RECEIVER extends g, S extends af> f.a.b.b a(h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, ah<S> ahVar, m<? super RECEIVER, ? super S, z> mVar) {
            l.c(jediViewModel, "");
            l.c(ahVar, "");
            l.c(mVar, "");
            ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            androidx.lifecycle.m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            ah a2 = i.a(hVar, ahVar);
            g gVar = new g(receiverHolder, hVar, jediViewModel, ahVar, mVar);
            l.c(jediViewModel, "");
            l.c(a2, "");
            l.c(gVar, "");
            t<S> a3 = jediViewModel.bf_().b().a(a2.f39378b);
            if (a2.f39377a) {
                a3 = a3.f();
            }
            l.a((Object) a3, "");
            return jediViewModel.a(a3, lifecycleOwner, a2.f39381e, a2.f39379c, a2.f39382f, gVar);
        }

        public static final class f extends h.f.b.m implements s<A, B, C, D, E, z> {
            final /* synthetic */ ah $config$inlined;
            final /* synthetic */ ae $holder;
            final /* synthetic */ k $prop1$inlined;
            final /* synthetic */ k $prop2$inlined;
            final /* synthetic */ k $prop3$inlined;
            final /* synthetic */ k $prop4$inlined;
            final /* synthetic */ k $prop5$inlined;
            final /* synthetic */ h.f.a.t $subscriber$inlined;
            final /* synthetic */ JediViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ h this$0;

            static {
                Covode.recordClassIndex(24277);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            f(ae aeVar, h hVar, JediViewModel jediViewModel, k kVar, k kVar2, k kVar3, k kVar4, k kVar5, ah ahVar, h.f.a.t tVar) {
                super(5);
                this.$holder = aeVar;
                this.this$0 = hVar;
                this.$this_selectSubscribe$inlined = jediViewModel;
                this.$prop1$inlined = kVar;
                this.$prop2$inlined = kVar2;
                this.$prop3$inlined = kVar3;
                this.$prop4$inlined = kVar4;
                this.$prop5$inlined = kVar5;
                this.$config$inlined = ahVar;
                this.$subscriber$inlined = tVar;
            }

            @Override // h.f.a.s
            public final /* synthetic */ z invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.$holder.getReceiver();
                return z.f158842a;
            }
        }

        public static <RECEIVER extends g, S extends af, A> f.a.b.b a(h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, m<? super RECEIVER, ? super A, z> mVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(ahVar, "");
            l.c(mVar, "");
            return i.a(jediViewModel, hVar.getLifecycleOwnerHolder().getLifecycleOwner(), kVar, i.a(hVar, ahVar), new b(hVar.getReceiverHolder(), hVar, jediViewModel, kVar, ahVar, mVar));
        }

        public static <RECEIVER extends g, S extends af, A, B> f.a.b.b a(h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super RECEIVER, ? super A, ? super B, z> qVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(ahVar, "");
            l.c(qVar, "");
            ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            androidx.lifecycle.m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            ah a2 = i.a(hVar, ahVar);
            c cVar = new c(receiverHolder, hVar, jediViewModel, kVar, kVar2, ahVar, qVar);
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(a2, "");
            l.c(cVar, "");
            t<R> a3 = jediViewModel.bf_().b().d(new i.C0965i(jediViewModel, lifecycleOwner, kVar, kVar2, cVar)).a(a2.f39378b);
            x xVar = a3;
            if (a2.f39377a) {
                xVar = (t<T>) a3.f();
            }
            l.a((Object) xVar, "");
            return jediViewModel.a((t) xVar, lifecycleOwner, a2.f39381e, a2.f39379c, a2.f39382f, new i.j(a2, jediViewModel, lifecycleOwner, kVar, kVar2, cVar));
        }

        public static <RECEIVER extends g, S extends af, T> f.a.b.b a(h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, k<S, ? extends a<? extends T>> kVar, ah<ak<a<T>>> ahVar, m<? super RECEIVER, ? super Throwable, z> mVar, h.f.a.b<? super RECEIVER, z> bVar, m<? super RECEIVER, ? super T, z> mVar2) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(ahVar, "");
            return i.a(jediViewModel, hVar.getLifecycleOwnerHolder().getLifecycleOwner(), kVar, i.a(hVar, ahVar), new C0963a(hVar.getReceiverHolder(), hVar, jediViewModel, kVar, ahVar, bVar, mVar, mVar2));
        }

        public static <RECEIVER extends g, S extends af, A, B, C> f.a.b.b a(h<? extends RECEIVER> hVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super RECEIVER, ? super A, ? super B, ? super C, z> rVar) {
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(ahVar, "");
            l.c(rVar, "");
            ae<? extends RECEIVER> receiverHolder = hVar.getReceiverHolder();
            androidx.lifecycle.m lifecycleOwner = hVar.getLifecycleOwnerHolder().getLifecycleOwner();
            ah a2 = i.a(hVar, ahVar);
            d dVar = new d(receiverHolder, hVar, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(a2, "");
            l.c(dVar, "");
            t<R> a3 = jediViewModel.bf_().b().d(new i.k(jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, dVar)).a(a2.f39378b);
            x xVar = a3;
            if (a2.f39377a) {
                xVar = (t<T>) a3.f();
            }
            l.a((Object) xVar, "");
            return jediViewModel.a((t) xVar, lifecycleOwner, a2.f39381e, a2.f39379c, a2.f39382f, new i.l(a2, jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, dVar));
        }

        public static /* synthetic */ f.a.b.b a(h hVar, JediViewModel jediViewModel, k kVar, ah ahVar, m mVar, h.f.a.b bVar, m mVar2, int i2) {
            ah ahVar2 = ahVar;
            m mVar3 = mVar;
            h.f.a.b bVar2 = bVar;
            if ((i2 & 2) != 0) {
                ahVar2 = new ah();
            }
            m mVar4 = null;
            if ((i2 & 4) != 0) {
                mVar3 = null;
            }
            if ((i2 & 8) != 0) {
                bVar2 = null;
            }
            if ((i2 & 16) == 0) {
                mVar4 = mVar2;
            }
            return hVar.asyncSubscribe(jediViewModel, kVar, ahVar2, mVar3, bVar2, mVar4);
        }
    }
}
