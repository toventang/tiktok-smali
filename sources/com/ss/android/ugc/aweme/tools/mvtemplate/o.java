package com.ss.android.ugc.aweme.tools.mvtemplate;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.fragment.app.e;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.bytedance.o.f;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.scene.j;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.b.k;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.a.r;
import h.f.a.s;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.h.d;
import h.k.i;
import h.z;
import java.util.Objects;

public final class o extends k implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f140901a = {new y(o.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final b f140902c = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.bv.a f140903b;

    /* renamed from: d  reason: collision with root package name */
    private final h f140904d;

    /* renamed from: e  reason: collision with root package name */
    private final d f140905e = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.h.a.class);

    /* renamed from: f  reason: collision with root package name */
    private final f f140906f;

    static {
        Covode.recordClassIndex(92009);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final boolean C() {
        return true;
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final String a() {
        return "RecordMVScene";
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(92012);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f140906f;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public final m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final void b() {
        com.ss.android.ugc.aweme.bv.a aVar = this.f140903b;
        if (aVar == null) {
            l.a("mvTemplateModule");
        }
        aVar.e();
    }

    @Override // com.ss.android.ugc.gamora.recorder.b.k
    public final void d() {
        com.ss.android.ugc.aweme.bv.a aVar = this.f140903b;
        if (aVar == null) {
            l.a("mvTemplateModule");
        }
        aVar.f();
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.ss.android.ugc.aweme.bv.a aVar = this.f140903b;
        if (aVar == null) {
            l.a("mvTemplateModule");
        }
        aVar.d();
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.aweme.bv.a aVar = this.f140903b;
        if (aVar == null) {
            l.a("mvTemplateModule");
        }
        aVar.a();
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        com.ss.android.ugc.aweme.bv.a aVar = this.f140903b;
        if (aVar == null) {
            l.a("mvTemplateModule");
        }
        aVar.b();
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        com.ss.android.ugc.aweme.bv.a aVar = this.f140903b;
        if (aVar == null) {
            l.a("mvTemplateModule");
        }
        aVar.c();
    }

    public static final class a extends h.f.b.m implements h.f.a.a<RecordMVViewModel> {
        final /* synthetic */ j $this_activityViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(92010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_activityViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.scene.j r0 = r3.$this_activityViewModel
                android.app.Activity r1 = r0.t()
                java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
                java.util.Objects.requireNonNull(r1, r0)
                androidx.fragment.app.e r1 = (androidx.fragment.app.e) r1
                com.ss.android.ugc.aweme.tools.mvtemplate.o$a$1 r0 = new com.ss.android.ugc.aweme.tools.mvtemplate.o$a$1
                r0.<init>()
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_tools_mvtemplate_RecordMVScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.o.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_tools_mvtemplate_RecordMVScene$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f140907a;

        static {
            Covode.recordClassIndex(92013);
        }

        c(o oVar) {
            this.f140907a = oVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            com.ss.android.ugc.aweme.bv.a aVar = this.f140907a.f140903b;
            if (aVar == null) {
                l.a("mvTemplateModule");
            }
            l.b(bool, "");
            aVar.a(bool.booleanValue());
        }
    }

    public o(f fVar) {
        l.d(fVar, "");
        this.f140906f = fVar;
        h.k.c a2 = h.f.b.ab.a(RecordMVViewModel.class);
        this.f140904d = h.i.a((h.f.a.a) new a(this, a2, a2));
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        RecordMVViewModel recordMVViewModel = (RecordMVViewModel) this.f140904d.getValue();
        f diContainer = getDiContainer();
        l.d(this, "");
        l.d(recordMVViewModel, "");
        l.d(diContainer, "");
        Activity t = t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        b bVar = new b((e) t, (ViewStubCompat) b(R.id.cs1), diContainer);
        Effect effect = recordMVViewModel.f140632a;
        bVar.f140784d = effect;
        if (effect == null) {
            if (bVar.o) {
                if (bVar.f140781a != null && !bVar.f140781a.isFinishing() && b.h()) {
                    bVar.i();
                    bVar.f140783c.a("mv", "all", false, 20, bVar.f140791k, bVar.f140792l, bVar.f140793m, (IFetchCategoryEffectListener) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00a6: INVOKE  
                          (wrap: com.ss.android.ugc.aweme.effectplatform.f : 0x0092: IGET  (r3v2 com.ss.android.ugc.aweme.effectplatform.f) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.c com.ss.android.ugc.aweme.effectplatform.f)
                          ("mv")
                          ("all")
                          false
                          (20 int)
                          (wrap: int : 0x0097: IGET  (r8v0 int) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.k int)
                          (wrap: int : 0x0099: IGET  (r9v0 int) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.l int)
                          (wrap: java.lang.String : 0x009b: IGET  (r10v0 java.lang.String) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) com.ss.android.ugc.aweme.tools.mvtemplate.b.m java.lang.String)
                          (wrap: com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener : ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener) (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.b$2 : 0x009f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$2) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.2.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR))
                         type: INTERFACE call: com.ss.android.ugc.aweme.effectplatform.f.a(java.lang.String, java.lang.String, boolean, int, int, int, java.lang.String, com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener):void in method: com.ss.android.ugc.aweme.tools.mvtemplate.o.a(android.os.Bundle):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener) (wrap: com.ss.android.ugc.aweme.tools.mvtemplate.b$2 : 0x009f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$2) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.2.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.tools.mvtemplate.o.a(android.os.Bundle):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009f: CONSTRUCTOR  (r11v0 com.ss.android.ugc.aweme.tools.mvtemplate.b$2) = (r1v0 'bVar' com.ss.android.ugc.aweme.tools.mvtemplate.b) call: com.ss.android.ugc.aweme.tools.mvtemplate.b.2.<init>(com.ss.android.ugc.aweme.tools.mvtemplate.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.tools.mvtemplate.o.a(android.os.Bundle):void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.tools.mvtemplate.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 39 more
                        */
                    /*
                    // Method dump skipped, instructions count: 201
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.o.a(android.os.Bundle):void");
                }

                @Override // com.bytedance.jedi.arch.h
                public final <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
                    l.d(vm1, "");
                    l.d(bVar, "");
                    return (R) b.a.a(this, vm1, bVar);
                }

                @Override // com.bytedance.scene.j
                public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                    l.d(layoutInflater, "");
                    l.d(viewGroup, "");
                    View a2 = com.a.a(layoutInflater, R.layout.bj0, viewGroup, false);
                    l.b(a2, "");
                    return a2;
                }

                @Override // com.bytedance.jedi.arch.h
                public final <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
                    l.d(jediViewModel, "");
                    l.d(ahVar, "");
                    l.d(mVar, "");
                    return b.a.a(this, jediViewModel, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.b
                public final <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(ahVar, "");
                    l.d(mVar, "");
                    b.a.a(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.h
                public final <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(ahVar, "");
                    l.d(mVar, "");
                    return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.b
                public final <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(ahVar, "");
                    l.d(mVar, "");
                    b.a.b(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.b
                public final <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(ahVar, "");
                    l.d(mVar, "");
                    b.a.c(this, jediViewModel, kVar, ahVar, mVar);
                }

                @Override // com.bytedance.jedi.arch.h
                public final <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(kVar2, "");
                    l.d(ahVar, "");
                    l.d(qVar, "");
                    return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
                }

                @Override // com.bytedance.jedi.arch.h
                public final <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(ahVar, "");
                    return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
                }

                @Override // com.bytedance.jedi.arch.h
                public final <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(kVar2, "");
                    l.d(kVar3, "");
                    l.d(ahVar, "");
                    l.d(rVar, "");
                    return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
                }

                @Override // com.bytedance.jedi.arch.h
                public final <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
                    l.d(jediViewModel, "");
                    l.d(kVar, "");
                    l.d(kVar2, "");
                    l.d(kVar3, "");
                    l.d(kVar4, "");
                    l.d(ahVar, "");
                    l.d(sVar, "");
                    return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
                }
            }
