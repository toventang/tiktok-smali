package com.bytedance.assem.arch.viewModel;

import com.bytedance.assem.arch.b.u;
import com.bytedance.assem.arch.b.v;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.bytedance.tiktok.proxy.h;
import h.f.a.b;
import h.f.a.m;
import h.k.k;
import h.z;

public interface f<RECEIVER extends d> {
    static {
        Covode.recordClassIndex(14974);
    }

    <S extends j> void a(AssemViewModel<S> assemViewModel, k<S> kVar, b<? super Throwable, z> bVar, m<? super RECEIVER, ? super S, z> mVar);

    <S extends j, A> void a(AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<p<A>> kVar2, b<? super Throwable, z> bVar, m<? super RECEIVER, ? super A, z> mVar);

    <S extends j, A, B> void a(AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<q<A, B>> kVar3, b<? super Throwable, z> bVar, h.f.a.q<? super RECEIVER, ? super A, ? super B, z> qVar);

    <S extends j, A, B, C> void a(AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, b<? super Throwable, z> bVar, h.f.a.r<? super RECEIVER, ? super A, ? super B, ? super C, z> rVar);

    <S extends j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<S, ? extends B> kVar2, k<S, ? extends C> kVar3, k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, b<? super Throwable, z> bVar, h.f.a.s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, z> sVar);

    <S extends j, A> void b(AssemViewModel<S> assemViewModel, k<S, ? extends A> kVar, k<p<A>> kVar2, b<? super Throwable, z> bVar, m<? super RECEIVER, ? super A, z> mVar);

    com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder();

    h<RECEIVER> getActualReceiverHolder();

    boolean getHasSubscribedForReused();

    androidx.lifecycle.m getHostLifecycleOwner();

    RECEIVER getReceiverForHostVM();

    boolean getUniqueOnlyDefault();

    public static final class a {
        static {
            Covode.recordClassIndex(14975);
        }

        public static /* synthetic */ void a(f fVar, AssemViewModel assemViewModel, h.k.k kVar, h.k.k kVar2, h.k.k kVar3, k kVar4, h.f.a.r rVar, int i2) {
            k kVar5 = kVar4;
            if ((i2 & 8) != 0) {
                kVar5 = l.a(assemViewModel.f25686c);
            }
            fVar.a(assemViewModel, kVar, kVar2, kVar3, kVar5, null, rVar);
        }

        public static <RECEIVER extends com.bytedance.tiktok.proxy.d, S extends j, A, B, C, D> void a(f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, z> sVar) {
            h.f.b.l.c(assemViewModel, "");
            h.f.b.l.c(kVar, "");
            h.f.b.l.c(kVar2, "");
            h.f.b.l.c(kVar3, "");
            h.f.b.l.c(kVar4, "");
            h.f.b.l.c(kVar5, "");
            h.f.b.l.c(sVar, "");
            if (assemViewModel.f25686c) {
                com.bytedance.tiktok.proxy.h<RECEIVER> actualReceiverHolder = fVar.getActualReceiverHolder();
                kVar5.f25730i = Integer.valueOf(fVar.getActualLifecycleOwnerHolder().hashCode());
                assemViewModel.d().a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), kVar, kVar2, kVar3, kVar4, l.a(fVar, kVar5, assemViewModel.f25686c, assemViewModel.bL_()), g.a.d.f25717a, new C0541f(actualReceiverHolder, fVar, assemViewModel, kVar5, kVar, kVar2, kVar3, kVar4, bVar, sVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                g<S> d2 = assemViewModel.d();
                androidx.lifecycle.m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                d2.a(hostLifecycleOwner, kVar, kVar2, kVar3, kVar4, l.a(fVar, kVar5, false, assemViewModel.bL_()), a(fVar), new j(fVar, sVar));
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b extends h.f.b.m implements h.f.a.a<Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f25713a = new b();

            static {
                Covode.recordClassIndex(14977);
            }

            b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$a  reason: collision with other inner class name */
        public static final class C0540a extends h.f.b.m implements h.f.a.a<Boolean> {
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14976);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0540a(f fVar) {
                super(0);
                this.this$0 = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Boolean invoke() {
                boolean z;
                com.bytedance.tiktok.proxy.d receiverForHostVM = this.this$0.getReceiverForHostVM();
                if (receiverForHostVM == null || !(receiverForHostVM instanceof v)) {
                    z = true;
                } else {
                    z = ((v) receiverForHostVM).f25474k;
                }
                return Boolean.valueOf(z);
            }
        }

        private static <RECEIVER extends com.bytedance.tiktok.proxy.d> h.f.a.a<Boolean> a(f<RECEIVER> fVar) {
            if (fVar.getReceiverForHostVM() != null) {
                return new C0540a(fVar);
            }
            return b.f25713a;
        }

        /* access modifiers changed from: package-private */
        public static final class c extends h.f.b.m implements h.f.a.b<A, z> {
            final /* synthetic */ k $config$inlined;
            final /* synthetic */ com.bytedance.tiktok.proxy.h $it;
            final /* synthetic */ h.f.a.b $onError$inlined;
            final /* synthetic */ h.k.k $prop1$inlined;
            final /* synthetic */ h.f.a.m $subscriber$inlined;
            final /* synthetic */ AssemViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14978);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(com.bytedance.tiktok.proxy.h hVar, f fVar, AssemViewModel assemViewModel, k kVar, h.k.k kVar2, h.f.a.b bVar, h.f.a.m mVar) {
                super(1);
                this.$it = hVar;
                this.this$0 = fVar;
                this.$this_selectSubscribe$inlined = assemViewModel;
                this.$config$inlined = kVar;
                this.$prop1$inlined = kVar2;
                this.$onError$inlined = bVar;
                this.$subscriber$inlined = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(final Object obj) {
                final com.bytedance.tiktok.proxy.d actualReceiver = this.$it.getActualReceiver();
                if (actualReceiver != null) {
                    u.a(actualReceiver, new h.f.a.a<z>() {
                        /* class com.bytedance.assem.arch.viewModel.f.a.c.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14979);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* bridge */ /* synthetic */ z invoke() {
                            this.$subscriber$inlined.invoke(actualReceiver, obj);
                            return z.f158842a;
                        }
                    });
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class g extends h.f.b.m implements h.f.a.b<A, z> {
            final /* synthetic */ h.f.a.m $subscriber;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14986);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            g(f fVar, h.f.a.m mVar) {
                super(1);
                this.this$0 = fVar;
                this.$subscriber = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                com.bytedance.tiktok.proxy.d receiverForHostVM = this.this$0.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.this$0.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.$subscriber.invoke(receiverForHostVM, obj);
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class k extends h.f.b.m implements h.f.a.b<A, z> {
            final /* synthetic */ k $config$inlined;
            final /* synthetic */ com.bytedance.tiktok.proxy.h $it;
            final /* synthetic */ h.f.a.b $onError$inlined;
            final /* synthetic */ h.k.k $prop1$inlined;
            final /* synthetic */ h.f.a.m $subscriber$inlined;
            final /* synthetic */ AssemViewModel $this_selectSubscribeOnAsync$inlined;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14990);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            k(com.bytedance.tiktok.proxy.h hVar, f fVar, AssemViewModel assemViewModel, k kVar, h.k.k kVar2, h.f.a.b bVar, h.f.a.m mVar) {
                super(1);
                this.$it = hVar;
                this.this$0 = fVar;
                this.$this_selectSubscribeOnAsync$inlined = assemViewModel;
                this.$config$inlined = kVar;
                this.$prop1$inlined = kVar2;
                this.$onError$inlined = bVar;
                this.$subscriber$inlined = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(final Object obj) {
                final com.bytedance.tiktok.proxy.d actualReceiver = this.$it.getActualReceiver();
                if (actualReceiver != null) {
                    u.a(actualReceiver, new h.f.a.a<z>() {
                        /* class com.bytedance.assem.arch.viewModel.f.a.k.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14991);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* bridge */ /* synthetic */ z invoke() {
                            this.$subscriber$inlined.invoke(actualReceiver, obj);
                            return z.f158842a;
                        }
                    });
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class l extends h.f.b.m implements h.f.a.b<A, z> {
            final /* synthetic */ h.f.a.m $subscriber;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14992);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            l(f fVar, h.f.a.m mVar) {
                super(1);
                this.this$0 = fVar;
                this.$subscriber = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                com.bytedance.tiktok.proxy.d receiverForHostVM = this.this$0.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.this$0.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.$subscriber.invoke(receiverForHostVM, obj);
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class m extends h.f.b.m implements h.f.a.b<S, z> {
            final /* synthetic */ k $config$inlined;
            final /* synthetic */ com.bytedance.tiktok.proxy.h $holder;
            final /* synthetic */ h.f.a.b $onError$inlined;
            final /* synthetic */ h.f.a.m $subscriber$inlined;
            final /* synthetic */ AssemViewModel $this_subscribe$inlined;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14993);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            m(com.bytedance.tiktok.proxy.h hVar, f fVar, AssemViewModel assemViewModel, k kVar, h.f.a.b bVar, h.f.a.m mVar) {
                super(1);
                this.$holder = hVar;
                this.this$0 = fVar;
                this.$this_subscribe$inlined = assemViewModel;
                this.$config$inlined = kVar;
                this.$onError$inlined = bVar;
                this.$subscriber$inlined = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                final j jVar = (j) obj;
                h.f.b.l.c(jVar, "");
                final com.bytedance.tiktok.proxy.d actualReceiver = this.$holder.getActualReceiver();
                if (actualReceiver != null) {
                    u.a(actualReceiver, new h.f.a.a<z>() {
                        /* class com.bytedance.assem.arch.viewModel.f.a.m.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14994);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* bridge */ /* synthetic */ z invoke() {
                            this.$subscriber$inlined.invoke(actualReceiver, jVar);
                            return z.f158842a;
                        }
                    });
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class n extends h.f.b.m implements h.f.a.b<S, z> {
            final /* synthetic */ h.f.a.m $subscriber;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14995);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            n(f fVar, h.f.a.m mVar) {
                super(1);
                this.this$0 = fVar;
                this.$subscriber = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(Object obj) {
                h.f.b.l.c(obj, "");
                com.bytedance.tiktok.proxy.d receiverForHostVM = this.this$0.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.this$0.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.$subscriber.invoke(receiverForHostVM, obj);
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class d extends h.f.b.m implements h.f.a.m<A, B, z> {
            final /* synthetic */ k $config$inlined;
            final /* synthetic */ com.bytedance.tiktok.proxy.h $it;
            final /* synthetic */ h.f.a.b $onError$inlined;
            final /* synthetic */ h.k.k $prop1$inlined;
            final /* synthetic */ h.k.k $prop2$inlined;
            final /* synthetic */ h.f.a.q $subscriber$inlined;
            final /* synthetic */ AssemViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14980);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(com.bytedance.tiktok.proxy.h hVar, f fVar, AssemViewModel assemViewModel, h.k.k kVar, h.k.k kVar2, k kVar3, h.f.a.b bVar, h.f.a.q qVar) {
                super(2);
                this.$it = hVar;
                this.this$0 = fVar;
                this.$this_selectSubscribe$inlined = assemViewModel;
                this.$prop1$inlined = kVar;
                this.$prop2$inlined = kVar2;
                this.$config$inlined = kVar3;
                this.$onError$inlined = bVar;
                this.$subscriber$inlined = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(final Object obj, final Object obj2) {
                final com.bytedance.tiktok.proxy.d actualReceiver = this.$it.getActualReceiver();
                if (actualReceiver != null) {
                    u.a(actualReceiver, new h.f.a.a<z>() {
                        /* class com.bytedance.assem.arch.viewModel.f.a.d.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14981);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* bridge */ /* synthetic */ z invoke() {
                            this.$subscriber$inlined.invoke(actualReceiver, obj, obj2);
                            return z.f158842a;
                        }
                    });
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class h extends h.f.b.m implements h.f.a.m<A, B, z> {
            final /* synthetic */ h.f.a.q $subscriber;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14987);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(f fVar, h.f.a.q qVar) {
                super(2);
                this.this$0 = fVar;
                this.$subscriber = qVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Object obj, Object obj2) {
                com.bytedance.tiktok.proxy.d receiverForHostVM = this.this$0.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.this$0.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.$subscriber.invoke(receiverForHostVM, obj, obj2);
                }
                return z.f158842a;
            }
        }

        public static <RECEIVER extends com.bytedance.tiktok.proxy.d, VM1 extends AssemViewModel<S1>, S1 extends j, R> R a(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
            h.f.b.l.c(vm1, "");
            h.f.b.l.c(bVar, "");
            return (R) bVar.invoke(vm1.d().a());
        }

        /* access modifiers changed from: package-private */
        public static final class e extends h.f.b.m implements h.f.a.q<A, B, C, z> {
            final /* synthetic */ k $config$inlined;
            final /* synthetic */ com.bytedance.tiktok.proxy.h $it;
            final /* synthetic */ h.f.a.b $onError$inlined;
            final /* synthetic */ h.k.k $prop1$inlined;
            final /* synthetic */ h.k.k $prop2$inlined;
            final /* synthetic */ h.k.k $prop3$inlined;
            final /* synthetic */ h.f.a.r $subscriber$inlined;
            final /* synthetic */ AssemViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14982);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(com.bytedance.tiktok.proxy.h hVar, f fVar, AssemViewModel assemViewModel, k kVar, h.k.k kVar2, h.k.k kVar3, h.k.k kVar4, h.f.a.b bVar, h.f.a.r rVar) {
                super(3);
                this.$it = hVar;
                this.this$0 = fVar;
                this.$this_selectSubscribe$inlined = assemViewModel;
                this.$config$inlined = kVar;
                this.$prop1$inlined = kVar2;
                this.$prop2$inlined = kVar3;
                this.$prop3$inlined = kVar4;
                this.$onError$inlined = bVar;
                this.$subscriber$inlined = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(final Object obj, final Object obj2, final Object obj3) {
                final com.bytedance.tiktok.proxy.d actualReceiver = this.$it.getActualReceiver();
                if (actualReceiver != null) {
                    u.a(actualReceiver, new h.f.a.a<z>() {
                        /* class com.bytedance.assem.arch.viewModel.f.a.e.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14983);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* synthetic */ z invoke() {
                            this.$subscriber$inlined.a(actualReceiver, obj, obj2, obj3);
                            return z.f158842a;
                        }
                    });
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class i extends h.f.b.m implements h.f.a.q<A, B, C, z> {
            final /* synthetic */ h.f.a.r $subscriber;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14988);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            i(f fVar, h.f.a.r rVar) {
                super(3);
                this.this$0 = fVar;
                this.$subscriber = rVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(Object obj, Object obj2, Object obj3) {
                com.bytedance.tiktok.proxy.d receiverForHostVM = this.this$0.getReceiverForHostVM();
                if (!(receiverForHostVM == null && (receiverForHostVM = this.this$0.getActualReceiverHolder().getActualReceiver()) == null)) {
                    this.$subscriber.a(receiverForHostVM, obj, obj2, obj3);
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.assem.arch.viewModel.f$a$f  reason: collision with other inner class name */
        public static final class C0541f extends h.f.b.m implements h.f.a.r<A, B, C, D, z> {
            final /* synthetic */ k $config$inlined;
            final /* synthetic */ com.bytedance.tiktok.proxy.h $it;
            final /* synthetic */ h.f.a.b $onError$inlined;
            final /* synthetic */ h.k.k $prop1$inlined;
            final /* synthetic */ h.k.k $prop2$inlined;
            final /* synthetic */ h.k.k $prop3$inlined;
            final /* synthetic */ h.k.k $prop4$inlined;
            final /* synthetic */ h.f.a.s $subscriber$inlined;
            final /* synthetic */ AssemViewModel $this_selectSubscribe$inlined;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14984);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0541f(com.bytedance.tiktok.proxy.h hVar, f fVar, AssemViewModel assemViewModel, k kVar, h.k.k kVar2, h.k.k kVar3, h.k.k kVar4, h.k.k kVar5, h.f.a.b bVar, h.f.a.s sVar) {
                super(4);
                this.$it = hVar;
                this.this$0 = fVar;
                this.$this_selectSubscribe$inlined = assemViewModel;
                this.$config$inlined = kVar;
                this.$prop1$inlined = kVar2;
                this.$prop2$inlined = kVar3;
                this.$prop3$inlined = kVar4;
                this.$prop4$inlined = kVar5;
                this.$onError$inlined = bVar;
                this.$subscriber$inlined = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.r
            public final /* synthetic */ z a(final Object obj, final Object obj2, final Object obj3, final Object obj4) {
                final com.bytedance.tiktok.proxy.d actualReceiver = this.$it.getActualReceiver();
                if (actualReceiver != null) {
                    u.a(actualReceiver, new h.f.a.a<z>() {
                        /* class com.bytedance.assem.arch.viewModel.f.a.C0541f.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(14985);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // h.f.a.a
                        public final /* bridge */ /* synthetic */ z invoke() {
                            this.$subscriber$inlined.invoke(actualReceiver, obj, obj2, obj3, obj4);
                            return z.f158842a;
                        }
                    });
                }
                return z.f158842a;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class j extends h.f.b.m implements h.f.a.r<A, B, C, D, z> {
            final /* synthetic */ h.f.a.s $subscriber;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(14989);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            j(f fVar, h.f.a.s sVar) {
                super(4);
                this.this$0 = fVar;
                this.$subscriber = sVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.r
            public final /* synthetic */ z a(Object obj, Object obj2, Object obj3, Object obj4) {
                com.bytedance.tiktok.proxy.d receiverForHostVM = this.this$0.getReceiverForHostVM();
                if (receiverForHostVM == null) {
                    receiverForHostVM = this.this$0.getActualReceiverHolder().getActualReceiver();
                }
                if (receiverForHostVM != null) {
                    this.$subscriber.invoke(receiverForHostVM, obj, obj2, obj3, obj4);
                }
                return z.f158842a;
            }
        }

        public static <RECEIVER extends com.bytedance.tiktok.proxy.d, S extends j> void a(f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super RECEIVER, ? super S, z> mVar) {
            h.f.b.l.c(assemViewModel, "");
            h.f.b.l.c(kVar, "");
            h.f.b.l.c(mVar, "");
            if (assemViewModel.f25686c) {
                com.bytedance.tiktok.proxy.h<RECEIVER> actualReceiverHolder = fVar.getActualReceiverHolder();
                kVar.f25730i = Integer.valueOf(fVar.getActualLifecycleOwnerHolder().hashCode());
                assemViewModel.d().a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), l.a(fVar, kVar, assemViewModel.f25686c, assemViewModel.bL_()), bVar, new m(actualReceiverHolder, fVar, assemViewModel, kVar, bVar, mVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                g<S> d2 = assemViewModel.d();
                androidx.lifecycle.m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                k<S> a2 = l.a(fVar, kVar, false, assemViewModel.bL_());
                a(fVar);
                d2.a(hostLifecycleOwner, a2, bVar, new n(fVar, mVar));
            }
        }

        public static /* synthetic */ void b(f fVar, AssemViewModel assemViewModel, h.k.k kVar, k kVar2, h.f.a.m mVar, int i2) {
            k kVar3 = kVar2;
            if ((i2 & 2) != 0) {
                h.c.f a2 = assemViewModel.aH_().a();
                h.f.b.l.c(a2, "");
                kVar3 = new k();
                kVar3.f25726e = a2;
                kVar3.f25728g = true;
            }
            fVar.b(assemViewModel, kVar, kVar3, null, mVar);
        }

        public static <RECEIVER extends com.bytedance.tiktok.proxy.d, S extends j, A> void b(f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super RECEIVER, ? super A, z> mVar) {
            h.f.b.l.c(assemViewModel, "");
            h.f.b.l.c(kVar, "");
            h.f.b.l.c(kVar2, "");
            h.f.b.l.c(mVar, "");
            if (assemViewModel.f25686c) {
                com.bytedance.tiktok.proxy.h<RECEIVER> actualReceiverHolder = fVar.getActualReceiverHolder();
                kVar2.f25730i = Integer.valueOf(fVar.getActualLifecycleOwnerHolder().hashCode());
                g<S> d2 = assemViewModel.d();
                androidx.lifecycle.m actualLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                kVar2.f25728g = true;
                d2.a(actualLifecycleOwner, kVar, l.a(fVar, kVar2, assemViewModel.f25686c, assemViewModel.bL_()), g.a.C0542a.f25714a, new k(actualReceiverHolder, fVar, assemViewModel, kVar2, kVar, bVar, mVar));
                return;
            }
            g<S> d3 = assemViewModel.d();
            androidx.lifecycle.m hostLifecycleOwner = fVar.getHostLifecycleOwner();
            if (hostLifecycleOwner == null) {
                hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            kVar2.f25728g = true;
            d3.a(hostLifecycleOwner, kVar, l.a(fVar, kVar2, false, assemViewModel.bL_()), a(fVar), new l(fVar, mVar));
        }

        public static <RECEIVER extends com.bytedance.tiktok.proxy.d, S extends j, A> void a(f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super RECEIVER, ? super A, z> mVar) {
            h.f.b.l.c(assemViewModel, "");
            h.f.b.l.c(kVar, "");
            h.f.b.l.c(kVar2, "");
            h.f.b.l.c(mVar, "");
            if (assemViewModel.f25686c) {
                com.bytedance.tiktok.proxy.h<RECEIVER> actualReceiverHolder = fVar.getActualReceiverHolder();
                kVar2.f25730i = Integer.valueOf(fVar.getActualLifecycleOwnerHolder().hashCode());
                assemViewModel.d().a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), kVar, l.a(fVar, kVar2, assemViewModel.f25686c, assemViewModel.bL_()), g.a.C0542a.f25714a, new c(actualReceiverHolder, fVar, assemViewModel, kVar2, kVar, bVar, mVar));
                return;
            }
            g<S> d2 = assemViewModel.d();
            androidx.lifecycle.m hostLifecycleOwner = fVar.getHostLifecycleOwner();
            if (hostLifecycleOwner == null) {
                hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
            }
            d2.a(hostLifecycleOwner, kVar, l.a(fVar, kVar2, false, assemViewModel.bL_()), a(fVar), new g(fVar, mVar));
        }

        public static /* synthetic */ void a(f fVar, AssemViewModel assemViewModel, h.k.k kVar, k kVar2, h.f.a.m mVar, int i2) {
            k kVar3 = kVar2;
            if ((i2 & 2) != 0) {
                kVar3 = l.a(assemViewModel.f25686c);
            }
            fVar.a(assemViewModel, kVar, kVar3, null, mVar);
        }

        public static <RECEIVER extends com.bytedance.tiktok.proxy.d, S extends j, A, B> void a(f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super RECEIVER, ? super A, ? super B, z> qVar) {
            h.f.b.l.c(assemViewModel, "");
            h.f.b.l.c(kVar, "");
            h.f.b.l.c(kVar2, "");
            h.f.b.l.c(kVar3, "");
            h.f.b.l.c(qVar, "");
            if (assemViewModel.f25686c) {
                kVar3.f25730i = Integer.valueOf(fVar.getActualLifecycleOwnerHolder().hashCode());
                assemViewModel.d().a((g) fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), (androidx.lifecycle.m) kVar, (h.k.k) kVar2, (h.k.k) l.a(fVar, kVar3, assemViewModel.f25686c, assemViewModel.bL_()), (k) g.a.b.f25715a, (h.f.a.m) new d(fVar.getActualReceiverHolder(), fVar, assemViewModel, kVar, kVar2, kVar3, bVar, qVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                g<S> d2 = assemViewModel.d();
                androidx.lifecycle.m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                d2.a(hostLifecycleOwner, kVar, kVar2, l.a(fVar, kVar3, false, assemViewModel.bL_()), a(fVar), new h(fVar, qVar));
            }
        }

        public static <RECEIVER extends com.bytedance.tiktok.proxy.d, S extends j, A, B, C> void a(f<RECEIVER> fVar, AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super RECEIVER, ? super A, ? super B, ? super C, z> rVar) {
            h.f.b.l.c(assemViewModel, "");
            h.f.b.l.c(kVar, "");
            h.f.b.l.c(kVar2, "");
            h.f.b.l.c(kVar3, "");
            h.f.b.l.c(kVar4, "");
            h.f.b.l.c(rVar, "");
            if (assemViewModel.f25686c) {
                com.bytedance.tiktok.proxy.h<RECEIVER> actualReceiverHolder = fVar.getActualReceiverHolder();
                kVar4.f25730i = Integer.valueOf(fVar.getActualLifecycleOwnerHolder().hashCode());
                assemViewModel.d().a(fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner(), kVar, kVar2, kVar3, l.a(fVar, kVar4, assemViewModel.f25686c, assemViewModel.bL_()), g.a.c.f25716a, new e(actualReceiverHolder, fVar, assemViewModel, kVar4, kVar, kVar2, kVar3, bVar, rVar));
            } else if (!fVar.getHasSubscribedForReused()) {
                g<S> d2 = assemViewModel.d();
                androidx.lifecycle.m hostLifecycleOwner = fVar.getHostLifecycleOwner();
                if (hostLifecycleOwner == null) {
                    hostLifecycleOwner = fVar.getActualLifecycleOwnerHolder().getActualLifecycleOwner();
                }
                d2.a(hostLifecycleOwner, kVar, kVar2, kVar3, l.a(fVar, kVar4, false, assemViewModel.bL_()), a(fVar), new i(fVar, rVar));
            }
        }
    }
}
