package com.bytedance.jedi.arch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.aj;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.ao;
import com.bytedance.jedi.arch.w;
import f.a.t;
import f.a.x;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.z;

public final class i {
    static {
        Covode.recordClassIndex(24304);
    }

    public static final class c<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f39503a;

        static {
            Covode.recordClassIndex(24307);
        }

        public c(h.k.k kVar) {
            this.f39503a = kVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return this.f39503a.invoke(obj);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<ak<A>, z> {
        final /* synthetic */ boolean $force$inlined;
        final /* synthetic */ androidx.lifecycle.m $owner$inlined;
        final /* synthetic */ h.f.a.b $subscriber$inlined$1;
        final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
        final /* synthetic */ boolean $uniqueOnly$inlined;

        static {
            Covode.recordClassIndex(24309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(JediViewModel jediViewModel, androidx.lifecycle.m mVar, boolean z, boolean z2, h.f.a.b bVar) {
            super(1);
            this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
            this.$owner$inlined = mVar;
            this.$uniqueOnly$inlined = z;
            this.$force$inlined = z2;
            this.$subscriber$inlined$1 = bVar;
        }

        @Override // h.f.a.b
        public final void invoke(ak<A> akVar) {
            this.$subscriber$inlined$1.invoke(akVar.f39384a);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<ak<A>, z> {
        final /* synthetic */ androidx.lifecycle.m $owner$inlined;
        final /* synthetic */ h.k.k $prop1$inlined;
        final /* synthetic */ h.f.a.b $subscriber$inlined$1;
        final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
        final /* synthetic */ ah $this_with$inlined;

        static {
            Covode.recordClassIndex(24312);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(ah ahVar, JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.f.a.b bVar) {
            super(1);
            this.$this_with$inlined = ahVar;
            this.$this_selectSubscribeMapped$inlined = jediViewModel;
            this.$owner$inlined = mVar;
            this.$prop1$inlined = kVar;
            this.$subscriber$inlined$1 = bVar;
        }

        @Override // h.f.a.b
        public final void invoke(ak<A> akVar) {
            this.$subscriber$inlined$1.invoke(akVar.f39384a);
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.b<al<A, B>, z> {
        final /* synthetic */ androidx.lifecycle.m $owner$inlined;
        final /* synthetic */ h.k.k $prop1$inlined;
        final /* synthetic */ h.k.k $prop2$inlined;
        final /* synthetic */ h.f.a.m $subscriber$inlined$1;
        final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
        final /* synthetic */ ah $this_with$inlined;

        static {
            Covode.recordClassIndex(24314);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(ah ahVar, JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.f.a.m mVar2) {
            super(1);
            this.$this_with$inlined = ahVar;
            this.$this_selectSubscribeMapped$inlined = jediViewModel;
            this.$owner$inlined = mVar;
            this.$prop1$inlined = kVar;
            this.$prop2$inlined = kVar2;
            this.$subscriber$inlined$1 = mVar2;
        }

        @Override // h.f.a.b
        public final void invoke(al<A, B> alVar) {
            al<A, B> alVar2 = alVar;
            this.$subscriber$inlined$1.invoke(alVar2.f39385a, alVar2.f39386b);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<am<A, B, C>, z> {
        final /* synthetic */ androidx.lifecycle.m $owner$inlined;
        final /* synthetic */ h.k.k $prop1$inlined;
        final /* synthetic */ h.k.k $prop2$inlined;
        final /* synthetic */ h.k.k $prop3$inlined;
        final /* synthetic */ q $subscriber$inlined$1;
        final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
        final /* synthetic */ ah $this_with$inlined;

        static {
            Covode.recordClassIndex(24316);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(ah ahVar, JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.k.k kVar3, q qVar) {
            super(1);
            this.$this_with$inlined = ahVar;
            this.$this_selectSubscribeMapped$inlined = jediViewModel;
            this.$owner$inlined = mVar;
            this.$prop1$inlined = kVar;
            this.$prop2$inlined = kVar2;
            this.$prop3$inlined = kVar3;
            this.$subscriber$inlined$1 = qVar;
        }

        @Override // h.f.a.b
        public final void invoke(am<A, B, C> amVar) {
            am<A, B, C> amVar2 = amVar;
            this.$subscriber$inlined$1.invoke(amVar2.f39387a, amVar2.f39388b, amVar2.f39389c);
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.b<an<A, B, C, D>, z> {
        final /* synthetic */ androidx.lifecycle.m $owner$inlined;
        final /* synthetic */ h.k.k $prop1$inlined;
        final /* synthetic */ h.k.k $prop2$inlined;
        final /* synthetic */ h.k.k $prop3$inlined;
        final /* synthetic */ h.k.k $prop4$inlined;
        final /* synthetic */ r $subscriber$inlined$1;
        final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
        final /* synthetic */ ah $this_with$inlined;

        static {
            Covode.recordClassIndex(24318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(ah ahVar, JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.k.k kVar3, h.k.k kVar4, r rVar) {
            super(1);
            this.$this_with$inlined = ahVar;
            this.$this_selectSubscribeMapped$inlined = jediViewModel;
            this.$owner$inlined = mVar;
            this.$prop1$inlined = kVar;
            this.$prop2$inlined = kVar2;
            this.$prop3$inlined = kVar3;
            this.$prop4$inlined = kVar4;
            this.$subscriber$inlined$1 = rVar;
        }

        @Override // h.f.a.b
        public final void invoke(an<A, B, C, D> anVar) {
            an<A, B, C, D> anVar2 = anVar;
            this.$subscriber$inlined$1.a(anVar2.f39390a, anVar2.f39391b, anVar2.f39392c, anVar2.f39393d);
        }
    }

    public static final class a<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f39502a;

        static {
            Covode.recordClassIndex(24305);
        }

        public a(h.k.k kVar) {
            this.f39502a = kVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new ak(this.f39502a.invoke(obj));
        }
    }

    public static final class d<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.k.k f39504a;

        static {
            Covode.recordClassIndex(24308);
        }

        public d(h.k.k kVar) {
            this.f39504a = kVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new ak(this.f39504a.invoke(obj));
        }
    }

    public static final class f<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JediViewModel f39505a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f39506b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.k f39507c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f39508d;

        static {
            Covode.recordClassIndex(24310);
        }

        public f(JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.f.a.b bVar) {
            this.f39505a = jediViewModel;
            this.f39506b = mVar;
            this.f39507c = kVar;
            this.f39508d = bVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new ak(this.f39507c.get(obj));
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<ao<A, B, C, D, E>, z> {
        final /* synthetic */ androidx.lifecycle.m $owner$inlined;
        final /* synthetic */ h.k.k $prop1$inlined;
        final /* synthetic */ h.k.k $prop2$inlined;
        final /* synthetic */ h.k.k $prop3$inlined;
        final /* synthetic */ h.k.k $prop4$inlined;
        final /* synthetic */ h.k.k $prop5$inlined;
        final /* synthetic */ s $subscriber$inlined$1;
        final /* synthetic */ JediViewModel $this_selectSubscribeMapped$inlined;
        final /* synthetic */ ah $this_with$inlined;

        static {
            Covode.recordClassIndex(24311);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(ah ahVar, JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.k.k kVar3, h.k.k kVar4, h.k.k kVar5, s sVar) {
            super(1);
            this.$this_with$inlined = ahVar;
            this.$this_selectSubscribeMapped$inlined = jediViewModel;
            this.$owner$inlined = mVar;
            this.$prop1$inlined = kVar;
            this.$prop2$inlined = kVar2;
            this.$prop3$inlined = kVar3;
            this.$prop4$inlined = kVar4;
            this.$prop5$inlined = kVar5;
            this.$subscriber$inlined$1 = sVar;
        }

        @Override // h.f.a.b
        public final void invoke(ao<A, B, C, D, E> aoVar) {
            ao<A, B, C, D, E> aoVar2 = aoVar;
            this.$subscriber$inlined$1.invoke(aoVar2.f39394a, aoVar2.f39395b, aoVar2.f39396c, aoVar2.f39397d, aoVar2.f39398e);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.i$i  reason: collision with other inner class name */
    public static final class C0965i<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JediViewModel f39509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f39510b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.k f39511c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.k.k f39512d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f39513e;

        static {
            Covode.recordClassIndex(24313);
        }

        public C0965i(JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.f.a.m mVar2) {
            this.f39509a = jediViewModel;
            this.f39510b = mVar;
            this.f39511c = kVar;
            this.f39512d = kVar2;
            this.f39513e = mVar2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new al(this.f39511c.get(obj), this.f39512d.get(obj));
        }
    }

    public static final class k<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JediViewModel f39514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f39515b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.k f39516c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.k.k f39517d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.k.k f39518e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ q f39519f;

        static {
            Covode.recordClassIndex(24315);
        }

        public k(JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.k.k kVar3, q qVar) {
            this.f39514a = jediViewModel;
            this.f39515b = mVar;
            this.f39516c = kVar;
            this.f39517d = kVar2;
            this.f39518e = kVar3;
            this.f39519f = qVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new am(this.f39516c.get(obj), this.f39517d.get(obj), this.f39518e.get(obj));
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.b<ak<com.bytedance.jedi.arch.a<? extends T>>, z> {
        final /* synthetic */ boolean $force$inlined;
        final /* synthetic */ h.f.a.b $onError$inlined;
        final /* synthetic */ h.f.a.a $onLoading$inlined;
        final /* synthetic */ h.f.a.b $onSuccess$inlined;
        final /* synthetic */ androidx.lifecycle.m $owner$inlined;
        final /* synthetic */ JediViewModel $this_middlewareSelectSubscribeMapped$inlined;
        final /* synthetic */ boolean $uniqueOnly$inlined;

        static {
            Covode.recordClassIndex(24306);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(JediViewModel jediViewModel, androidx.lifecycle.m mVar, boolean z, boolean z2, h.f.a.b bVar, h.f.a.b bVar2, h.f.a.a aVar) {
            super(1);
            this.$this_middlewareSelectSubscribeMapped$inlined = jediViewModel;
            this.$owner$inlined = mVar;
            this.$uniqueOnly$inlined = z;
            this.$force$inlined = z2;
            this.$onSuccess$inlined = bVar;
            this.$onError$inlined = bVar2;
            this.$onLoading$inlined = aVar;
        }

        @Override // h.f.a.b
        public final void invoke(ak<com.bytedance.jedi.arch.a<? extends T>> akVar) {
            h.f.a.a aVar;
            A a2 = akVar.f39384a;
            if (a2 instanceof aj) {
                h.f.a.b bVar = this.$onSuccess$inlined;
                if (bVar != null) {
                    bVar.invoke(a2.f39383a);
                }
            } else if (a2 instanceof com.bytedance.jedi.arch.f) {
                h.f.a.b bVar2 = this.$onError$inlined;
                if (bVar2 != null) {
                    bVar2.invoke(a2.f39461a);
                }
            } else if ((a2 instanceof w) && (aVar = this.$onLoading$inlined) != null) {
                aVar.invoke();
            }
        }
    }

    public static final class m<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JediViewModel f39520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f39521b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.k f39522c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.k.k f39523d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.k.k f39524e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.k.k f39525f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ r f39526g;

        static {
            Covode.recordClassIndex(24317);
        }

        public m(JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.k.k kVar3, h.k.k kVar4, r rVar) {
            this.f39520a = jediViewModel;
            this.f39521b = mVar;
            this.f39522c = kVar;
            this.f39523d = kVar2;
            this.f39524e = kVar3;
            this.f39525f = kVar4;
            this.f39526g = rVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new an(this.f39522c.get(obj), this.f39523d.get(obj), this.f39524e.get(obj), this.f39525f.get(obj));
        }
    }

    public static final class o<T, R> implements f.a.d.g<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JediViewModel f39527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f39528b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.k.k f39529c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.k.k f39530d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h.k.k f39531e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h.k.k f39532f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.k.k f39533g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ s f39534h;

        static {
            Covode.recordClassIndex(24319);
        }

        public o(JediViewModel jediViewModel, androidx.lifecycle.m mVar, h.k.k kVar, h.k.k kVar2, h.k.k kVar3, h.k.k kVar4, h.k.k kVar5, s sVar) {
            this.f39527a = jediViewModel;
            this.f39528b = mVar;
            this.f39529c = kVar;
            this.f39530d = kVar2;
            this.f39531e = kVar3;
            this.f39532f = kVar4;
            this.f39533g = kVar5;
            this.f39534h = sVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.c(obj, "");
            return new ao(this.f39529c.get(obj), this.f39530d.get(obj), this.f39531e.get(obj), this.f39532f.get(obj), this.f39533g.get(obj));
        }
    }

    public static final <R> ah<R> a(com.bytedance.jedi.arch.h<?> hVar, ah<R> ahVar) {
        h.f.b.l.c(hVar, "");
        h.f.b.l.c(ahVar, "");
        if (!ahVar.f39380d) {
            ahVar.f39381e = hVar.getUniqueOnlyGlobal();
        }
        return ahVar;
    }

    public static final <A, S extends af> f.a.b.b a(JediViewModel<S> jediViewModel, androidx.lifecycle.m mVar, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.b<? super A, z> bVar) {
        h.f.b.l.c(jediViewModel, "");
        h.f.b.l.c(kVar, "");
        h.f.b.l.c(ahVar, "");
        h.f.b.l.c(bVar, "");
        t<R> a2 = jediViewModel.bf_().b().d(new f(jediViewModel, mVar, kVar, bVar)).a(ahVar.f39378b);
        x xVar = a2;
        if (ahVar.f39377a) {
            xVar = (t<T>) a2.f();
        }
        h.f.b.l.a((Object) xVar, "");
        return jediViewModel.a((t) xVar, mVar, ahVar.f39381e, ahVar.f39379c, ahVar.f39382f, new h(ahVar, jediViewModel, mVar, kVar, bVar));
    }
}
