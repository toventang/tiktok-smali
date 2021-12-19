package com.airbnb.epoxy;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.j;
import com.airbnb.epoxy.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class o extends d implements c.AbstractC0071c {

    /* renamed from: j  reason: collision with root package name */
    private static final j.e<s<?>> f5059j = new j.e<s<?>>() {
        /* class com.airbnb.epoxy.o.AnonymousClass1 */

        static {
            Covode.recordClassIndex(2143);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* synthetic */ boolean b(s<?> sVar, s<?> sVar2) {
            return sVar.equals(sVar2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* synthetic */ Object c(s<?> sVar, s<?> sVar2) {
            return new j(sVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.j.e
        public final /* bridge */ /* synthetic */ boolean a(s<?> sVar, s<?> sVar2) {
            if (sVar.f5077a == sVar2.f5077a) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: e  reason: collision with root package name */
    final ae f5060e;

    /* renamed from: f  reason: collision with root package name */
    public final c f5061f;

    /* renamed from: g  reason: collision with root package name */
    final n f5062g;

    /* renamed from: h  reason: collision with root package name */
    final List<ag> f5063h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private int f5064i;

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.epoxy.d
    public final boolean b() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.airbnb.epoxy.d
    public final int getItemCount() {
        return this.f5064i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.airbnb.epoxy.d
    public final List<? extends s<?>> a() {
        return this.f5061f.f5017f;
    }

    @Override // com.airbnb.epoxy.d
    public final e c() {
        return super.c();
    }

    static {
        Covode.recordClassIndex(2142);
    }

    @Override // com.airbnb.epoxy.d
    public final void b(View view) {
        this.f5062g.teardownStickyHeaderView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f5062g.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f5062g.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.airbnb.epoxy.d
    public final /* synthetic */ void onViewAttachedToWindow(u uVar) {
        onViewAttachedToWindow(uVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.airbnb.epoxy.d
    public final /* synthetic */ void onViewDetachedFromWindow(u uVar) {
        onViewDetachedFromWindow(uVar);
    }

    @Override // com.airbnb.epoxy.d
    public final void a(View view) {
        this.f5062g.setupStickyHeaderView(view);
    }

    @Override // com.airbnb.epoxy.d
    public final void b(u uVar) {
        super.onViewDetachedFromWindow(uVar);
        this.f5062g.onViewDetachedFromWindow(uVar, uVar.b());
    }

    @Override // com.airbnb.epoxy.d
    public final void a(u uVar) {
        super.onViewAttachedToWindow(uVar);
        this.f5062g.onViewAttachedToWindow(uVar, uVar.b());
    }

    @Override // com.airbnb.epoxy.d
    public final boolean b(int i2) {
        return this.f5062g.isStickyHeader(i2);
    }

    @Override // com.airbnb.epoxy.d
    public final int a(s<?> sVar) {
        int size = this.f5061f.f5017f.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((s) this.f5061f.f5017f.get(i2)).f5077a == sVar.f5077a) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.airbnb.epoxy.c.AbstractC0071c
    public final void a(k kVar) {
        this.f5064i = kVar.f5050b.size();
        this.f5060e.f5008a = true;
        b bVar = new b(this);
        if (kVar.f5051c != null) {
            kVar.f5051c.a(bVar);
        } else if (kVar.f5050b.isEmpty() && !kVar.f5049a.isEmpty()) {
            bVar.b(0, kVar.f5049a.size());
        } else if (!kVar.f5050b.isEmpty() && kVar.f5049a.isEmpty()) {
            bVar.a(0, kVar.f5050b.size());
        }
        this.f5060e.f5008a = false;
        for (int size = this.f5063h.size() - 1; size >= 0; size--) {
            this.f5063h.get(size);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(h hVar) {
        int a2;
        List<? extends s<?>> list;
        MethodCollector.i(5765);
        List<? extends s<?>> list2 = this.f5061f.f5017f;
        if (!list2.isEmpty()) {
            if (((s) list2.get(0)).d()) {
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    ((s) list2.get(i2)).a("The model was changed between being bound and when models were rebuilt", i2);
                }
            }
        }
        c cVar = this.f5061f;
        synchronized (cVar) {
            try {
                a2 = cVar.f5015d.a();
                list = cVar.f5016e;
            } catch (Throwable th) {
                MethodCollector.o(5765);
                throw th;
            }
        }
        if (hVar == list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            cVar.a(a2, hVar, new k(list, list, null));
            MethodCollector.o(5765);
        } else if (hVar == null || hVar.isEmpty()) {
            cVar.a(a2, null, (list == null || list.isEmpty()) ? null : new k(list, Collections.EMPTY_LIST, null));
            MethodCollector.o(5765);
        } else if (list == null || list.isEmpty()) {
            cVar.a(a2, hVar, new k(Collections.EMPTY_LIST, hVar, null));
            MethodCollector.o(5765);
        } else {
            cVar.f5012a.execute(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0096: INVOKE  
                  (wrap: java.util.concurrent.Executor : 0x008f: IGET  (r0v10 java.util.concurrent.Executor) = (r6v0 'cVar' com.airbnb.epoxy.c) com.airbnb.epoxy.c.a java.util.concurrent.Executor)
                  (wrap: com.airbnb.epoxy.c$1 : 0x0093: CONSTRUCTOR  (r5v0 com.airbnb.epoxy.c$1) = 
                  (r6v0 'cVar' com.airbnb.epoxy.c)
                  (wrap: com.airbnb.epoxy.c$a : 0x008c: CONSTRUCTOR  (r7v0 com.airbnb.epoxy.c$a) = 
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (wrap: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> : 0x008a: IGET  (r0v9 androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>>) = (r6v0 'cVar' com.airbnb.epoxy.c) com.airbnb.epoxy.c.c androidx.recyclerview.widget.j$e)
                 call: com.airbnb.epoxy.c.a.<init>(java.util.List, java.util.List, androidx.recyclerview.widget.j$e):void type: CONSTRUCTOR)
                  (r8v0 'a2' int)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                 call: com.airbnb.epoxy.c.1.<init>(com.airbnb.epoxy.c, com.airbnb.epoxy.c$a, int, java.util.List, java.util.List):void type: CONSTRUCTOR)
                 type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.airbnb.epoxy.o.a(com.airbnb.epoxy.h):void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0093: CONSTRUCTOR  (r5v0 com.airbnb.epoxy.c$1) = 
                  (r6v0 'cVar' com.airbnb.epoxy.c)
                  (wrap: com.airbnb.epoxy.c$a : 0x008c: CONSTRUCTOR  (r7v0 com.airbnb.epoxy.c$a) = 
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (wrap: androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>> : 0x008a: IGET  (r0v9 androidx.recyclerview.widget.j$e<com.airbnb.epoxy.s<?>>) = (r6v0 'cVar' com.airbnb.epoxy.c) com.airbnb.epoxy.c.c androidx.recyclerview.widget.j$e)
                 call: com.airbnb.epoxy.c.a.<init>(java.util.List, java.util.List, androidx.recyclerview.widget.j$e):void type: CONSTRUCTOR)
                  (r8v0 'a2' int)
                  (r12v0 'hVar' com.airbnb.epoxy.h)
                  (r10v0 'list' java.util.List<? extends com.airbnb.epoxy.s<?>>)
                 call: com.airbnb.epoxy.c.1.<init>(com.airbnb.epoxy.c, com.airbnb.epoxy.c$a, int, java.util.List, java.util.List):void type: CONSTRUCTOR in method: com.airbnb.epoxy.o.a(com.airbnb.epoxy.h):void, file: classes9.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 23 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.airbnb.epoxy.c, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 29 more
                */
            /*
            // Method dump skipped, instructions count: 163
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.o.a(com.airbnb.epoxy.h):void");
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.d
        public final void a(RuntimeException runtimeException) {
            this.f5062g.onExceptionSwallowed(runtimeException);
        }

        o(n nVar, Handler handler) {
            ae aeVar = new ae();
            this.f5060e = aeVar;
            this.f5062g = nVar;
            this.f5061f = new c(handler, this, f5059j);
            registerAdapterDataObserver(aeVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.d
        public final void a(u uVar, s<?> sVar) {
            this.f5062g.onModelUnbound(uVar, sVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.airbnb.epoxy.d
        public final void a(u uVar, s<?> sVar, int i2, s<?> sVar2) {
            this.f5062g.onModelBound(uVar, sVar, i2, sVar2);
        }
    }
