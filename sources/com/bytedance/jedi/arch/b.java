package com.bytedance.jedi.arch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.h;
import com.bytedance.jedi.arch.internal.i;
import com.bytedance.jedi.arch.q;
import f.a.x;
import h.f.a.m;
import h.f.a.r;
import h.f.a.s;
import h.f.a.t;
import h.f.b.l;
import h.f.b.z;
import h.k.k;
import h.z;

public interface b extends q {
    static {
        Covode.recordClassIndex(24175);
    }

    <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1);

    <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, m<? super b, ? super A, z> mVar);

    <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, k<S, ? extends d<? extends A>> kVar, ah<ak<d<A>>> ahVar, m<? super b, ? super A, z> mVar);

    <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, m<? super b, ? super A, z> mVar);

    public static final class a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.arch.b$a$b  reason: collision with other inner class name */
        public static final class C0958b extends h.f.b.m implements m<i, A, z> {
            final /* synthetic */ m $subscriber;

            static {
                Covode.recordClassIndex(24178);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0958b(m mVar) {
                super(2);
                this.$subscriber = mVar;
            }

            /* renamed from: com.bytedance.jedi.arch.b$a$b$a  reason: collision with other inner class name */
            static final class RunnableC0959a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ Throwable f39401a;

                static {
                    Covode.recordClassIndex(24179);
                }

                RunnableC0959a(Throwable th) {
                    this.f39401a = th;
                }

                public final void run() {
                    throw this.f39401a;
                }
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(i iVar, Object obj) {
                i iVar2 = iVar;
                l.d(iVar2, "");
                if (obj != null) {
                    try {
                        this.$subscriber.invoke((b) iVar2, obj);
                    } catch (Throwable th) {
                        c.f39402a.post(new RunnableC0959a(th));
                        throw th;
                    }
                }
                return z.f158842a;
            }
        }

        static {
            Covode.recordClassIndex(24176);
        }

        public static <S extends af> f.a.b.b a(b bVar, JediViewModel<S> jediViewModel, ah<S> ahVar, m<? super i, ? super S, z> mVar) {
            l.d(jediViewModel, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            return q.a.a(bVar, jediViewModel, ahVar, mVar);
        }

        public static <S extends af, T> f.a.b.b a(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends a<? extends T>> kVar, ah<ak<a<T>>> ahVar, m<? super i, ? super Throwable, z> mVar, h.f.a.b<? super i, z> bVar2, m<? super i, ? super T, z> mVar2) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            return q.a.a(bVar, jediViewModel, kVar, ahVar, mVar, bVar2, mVar2);
        }

        public static <S extends af, A, B> f.a.b.b a(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super i, ? super A, ? super B, z> qVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(kVar2, "");
            l.d(ahVar, "");
            l.d(qVar, "");
            return q.a.a(bVar, jediViewModel, kVar, kVar2, ahVar, qVar);
        }

        public static <S extends af, A, B, C> f.a.b.b a(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super i, ? super A, ? super B, ? super C, z> rVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(kVar2, "");
            l.d(kVar3, "");
            l.d(ahVar, "");
            l.d(rVar, "");
            return q.a.a(bVar, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
        }

        public static <S extends af, A, B, C, D> f.a.b.b a(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(kVar2, "");
            l.d(kVar3, "");
            l.d(kVar4, "");
            l.d(ahVar, "");
            l.d(sVar, "");
            return q.a.a(bVar, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends af, R> R a(b bVar, VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar2) {
            l.d(vm1, "");
            l.d(bVar2, "");
            return (R) q.a.a(vm1, bVar2);
        }

        public static <S extends af, A> f.a.b.b d(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, m<? super i, ? super A, z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            return q.a.a(bVar, jediViewModel, kVar, ahVar, mVar);
        }

        public static <S extends af, A> void a(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, ah<ak<A>> ahVar, m<? super b, ? super A, z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            bVar.selectSubscribe(jediViewModel, kVar, ahVar, new C0958b(mVar));
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, R> R a(VM1 vm1, VM2 vm2, m<? super S1, ? super S2, ? extends R> mVar) {
            l.d(vm1, "");
            l.d(vm2, "");
            l.d(mVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(mVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(mVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(mVar, "");
            return (R) mVar.invoke(vm1.at_(), vm2.at_());
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, R> R a(VM1 vm1, VM2 vm2, VM3 vm3, h.f.a.q<? super S1, ? super S2, ? super S3, ? extends R> qVar) {
            l.d(vm1, "");
            l.d(vm2, "");
            l.d(vm3, "");
            l.d(qVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(qVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(qVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(qVar, "");
            return (R) qVar.invoke(vm1.at_(), vm2.at_(), vm3.at_());
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, VM4 extends JediViewModel<S4>, S4 extends af, R> R a(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, r<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> rVar) {
            l.d(vm1, "");
            l.d(vm2, "");
            l.d(vm3, "");
            l.d(vm4, "");
            l.d(rVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(vm4, "");
            l.c(rVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(vm4, "");
            l.c(rVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(vm4, "");
            l.c(rVar, "");
            return (R) rVar.a(vm1.at_(), vm2.at_(), vm3.at_(), vm4.at_());
        }

        public static <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, R> R a(x<S1, PROP1> xVar, h.f.a.b<? super PROP1, ? extends R> bVar) {
            l.d(xVar, "");
            l.d(bVar, "");
            l.c(xVar, "");
            l.c(bVar, "");
            l.c(xVar, "");
            l.c(bVar, "");
            l.c(xVar, "");
            l.c(bVar, "");
            return (R) bVar.invoke((Object) xVar.b().invoke(xVar.a().at_()));
        }

        public static <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, R> R a(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, m<? super PROP1, ? super PROP2, ? extends R> mVar) {
            l.d(xVar, "");
            l.d(xVar2, "");
            l.d(mVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(mVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(mVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(mVar, "");
            return (R) mVar.invoke((Object) xVar.b().invoke(xVar.a().at_()), (Object) xVar2.b().invoke(xVar2.a().at_()));
        }

        public static <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends x<S3, PROP3>, PROP3 extends af, S3 extends af, R> R a(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, x<S3, PROP3> xVar3, h.f.a.q<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> qVar) {
            l.d(xVar, "");
            l.d(xVar2, "");
            l.d(xVar3, "");
            l.d(qVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(qVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(qVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(qVar, "");
            return (R) qVar.invoke((Object) xVar.b().invoke(xVar.a().at_()), (Object) xVar2.b().invoke(xVar2.a().at_()), (Object) xVar3.b().invoke(xVar3.a().at_()));
        }

        public static <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends x<S3, PROP3>, PROP3 extends af, S3 extends af, M4 extends x<S4, PROP4>, PROP4 extends af, S4 extends af, R> R a(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, x<S3, PROP3> xVar3, x<S4, PROP4> xVar4, r<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> rVar) {
            l.d(xVar, "");
            l.d(xVar2, "");
            l.d(xVar3, "");
            l.d(xVar4, "");
            l.d(rVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(xVar4, "");
            l.c(rVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(xVar4, "");
            l.c(rVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(xVar4, "");
            l.c(rVar, "");
            return (R) rVar.a((Object) xVar.b().invoke(xVar.a().at_()), (Object) xVar2.b().invoke(xVar2.a().at_()), (Object) xVar3.b().invoke(xVar3.a().at_()), (Object) xVar4.b().invoke(xVar4.a().at_()));
        }

        public static <M1 extends x<S1, PROP1>, PROP1 extends af, S1 extends af, M2 extends x<S2, PROP2>, PROP2 extends af, S2 extends af, M3 extends x<S3, PROP3>, PROP3 extends af, S3 extends af, M4 extends x<S4, PROP4>, PROP4 extends af, S4 extends af, M5 extends x<S5, PROP5>, PROP5 extends af, S5 extends af, R> R a(x<S1, PROP1> xVar, x<S2, PROP2> xVar2, x<S3, PROP3> xVar3, x<S4, PROP4> xVar4, x<S5, PROP5> xVar5, s<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> sVar) {
            l.d(xVar, "");
            l.d(xVar2, "");
            l.d(xVar3, "");
            l.d(xVar4, "");
            l.d(xVar5, "");
            l.d(sVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(xVar4, "");
            l.c(xVar5, "");
            l.c(sVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(xVar4, "");
            l.c(xVar5, "");
            l.c(sVar, "");
            l.c(xVar, "");
            l.c(xVar2, "");
            l.c(xVar3, "");
            l.c(xVar4, "");
            l.c(xVar5, "");
            l.c(sVar, "");
            return (R) sVar.invoke((Object) xVar.b().invoke(xVar.a().at_()), (Object) xVar2.b().invoke(xVar2.a().at_()), (Object) xVar3.b().invoke(xVar3.a().at_()), (Object) xVar4.b().invoke(xVar4.a().at_()), (Object) xVar5.b().invoke(xVar5.a().at_()));
        }

        public static androidx.lifecycle.m a(b bVar) {
            return bVar;
        }

        public static v b(b bVar) {
            return bVar;
        }

        public static ae<i> c(b bVar) {
            return bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.arch.b$a$a  reason: collision with other inner class name */
        public static final class C0957a extends h.f.b.m implements h.f.a.b<S1, z> {
            final /* synthetic */ z.e $state;

            static {
                Covode.recordClassIndex(24177);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0957a(z.e eVar) {
                super(1);
                this.$state = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(Object obj) {
                l.d(obj, "");
                this.$state.element = obj;
                return h.z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c extends h.f.b.m implements m<b, d<? extends A>, h.z> {
            final /* synthetic */ m $subscriber;

            static {
                Covode.recordClassIndex(24180);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(m mVar) {
                super(2);
                this.$subscriber = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ h.z invoke(b bVar, Object obj) {
                final b bVar2 = bVar;
                d dVar = (d) obj;
                l.d(bVar2, "");
                l.d(dVar, "");
                dVar.a(new h.f.a.b<A, h.z>(this) {
                    /* class com.bytedance.jedi.arch.b.a.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(24181);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.b
                    public final /* bridge */ /* synthetic */ h.z invoke(Object obj) {
                        this.this$0.$subscriber.invoke(bVar2, obj);
                        return h.z.f158842a;
                    }
                });
                return h.z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class d extends h.f.b.m implements m<b, ac<? extends A>, h.z> {
            final /* synthetic */ m $subscriber;

            static {
                Covode.recordClassIndex(24182);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(m mVar) {
                super(2);
                this.$subscriber = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ h.z invoke(b bVar, Object obj) {
                ac acVar = (ac) obj;
                l.d(bVar, "");
                l.d(acVar, "");
                this.$subscriber.invoke(bVar, acVar.f39376a);
                return h.z.f158842a;
            }
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [S1 extends com.bytedance.jedi.arch.af, com.bytedance.jedi.arch.af] */
        public static <VM1 extends JediViewModel<S1>, S1 extends af> S1 a(b bVar, VM1 vm1) {
            l.d(vm1, "");
            z.e eVar = new z.e();
            eVar.element = null;
            bVar.withState(vm1, new C0957a(eVar));
            T t = eVar.element;
            if (t == 0) {
                l.b();
            }
            return t;
        }

        public static /* synthetic */ void b(b bVar, JediViewModel jediViewModel, k kVar, m mVar) {
            bVar.subscribeEvent(jediViewModel, kVar, new ah(), mVar);
        }

        public static <S extends af, A> void b(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends d<? extends A>> kVar, ah<ak<d<A>>> ahVar, m<? super b, ? super A, h.z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            bVar.selectNonNullSubscribe(jediViewModel, kVar, ahVar, new c(mVar));
        }

        public static <S extends af, A> void c(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, m<? super b, ? super A, h.z> mVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(ahVar, "");
            l.d(mVar, "");
            bVar.selectNonNullSubscribe(jediViewModel, kVar, ahVar, new d(mVar));
        }

        public static <VM1 extends JediViewModel<S1>, S1 extends af, VM2 extends JediViewModel<S2>, S2 extends af, VM3 extends JediViewModel<S3>, S3 extends af, VM4 extends JediViewModel<S4>, S4 extends af, VM5 extends JediViewModel<S5>, S5 extends af, R> R a(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, s<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> sVar) {
            l.d(vm1, "");
            l.d(vm2, "");
            l.d(vm3, "");
            l.d(vm4, "");
            l.d(vm5, "");
            l.d(sVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(vm4, "");
            l.c(vm5, "");
            l.c(sVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(vm4, "");
            l.c(vm5, "");
            l.c(sVar, "");
            l.c(vm1, "");
            l.c(vm2, "");
            l.c(vm3, "");
            l.c(vm4, "");
            l.c(vm5, "");
            l.c(sVar, "");
            return (R) sVar.invoke(vm1.at_(), vm2.at_(), vm3.at_(), vm4.at_(), vm5.at_());
        }

        public static <S extends af, A, B, C, D, E> f.a.b.b a(b bVar, JediViewModel<S> jediViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, k<S, ? extends E> kVar5, ah<ao<A, B, C, D, E>> ahVar, t<? super i, ? super A, ? super B, ? super C, ? super D, ? super E, h.z> tVar) {
            l.d(jediViewModel, "");
            l.d(kVar, "");
            l.d(kVar2, "");
            l.d(kVar3, "");
            l.d(kVar4, "");
            l.d(kVar5, "");
            l.d(ahVar, "");
            l.d(tVar, "");
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(kVar5, "");
            l.c(ahVar, "");
            l.c(tVar, "");
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(kVar5, "");
            l.c(ahVar, "");
            l.c(tVar, "");
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(kVar5, "");
            l.c(ahVar, "");
            l.c(tVar, "");
            ae receiverHolder = bVar.getReceiverHolder();
            androidx.lifecycle.m lifecycleOwner = bVar.getLifecycleOwnerHolder().getLifecycleOwner();
            ah a2 = i.a(bVar, ahVar);
            h.a.f fVar = new h.a.f(receiverHolder, bVar, jediViewModel, kVar, kVar2, kVar3, kVar4, kVar5, ahVar, tVar);
            l.c(jediViewModel, "");
            l.c(kVar, "");
            l.c(kVar2, "");
            l.c(kVar3, "");
            l.c(kVar4, "");
            l.c(kVar5, "");
            l.c(a2, "");
            l.c(fVar, "");
            f.a.t<R> a3 = jediViewModel.bf_().b().d(new i.o(jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, kVar5, fVar)).a(a2.f39378b);
            x xVar = a3;
            if (a2.f39377a) {
                xVar = (f.a.t<T>) a3.f();
            }
            l.a((Object) xVar, "");
            return jediViewModel.a((f.a.t) xVar, lifecycleOwner, a2.f39381e, a2.f39379c, a2.f39382f, new i.g(a2, jediViewModel, lifecycleOwner, kVar, kVar2, kVar3, kVar4, kVar5, fVar));
        }
    }
}
