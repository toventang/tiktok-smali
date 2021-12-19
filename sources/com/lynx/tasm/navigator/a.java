package com.lynx.tasm.navigator;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.b.b;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.navigator.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public Stack<d> f56776a = new Stack<>();

    /* renamed from: b  reason: collision with root package name */
    WeakReference<LynxView> f56777b;

    /* renamed from: c  reason: collision with root package name */
    HashMap<String, Object> f56778c;

    /* renamed from: d  reason: collision with root package name */
    public e f56779d;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<b> f56780e;

    static {
        Covode.recordClassIndex(35361);
    }

    public final b a() {
        WeakReference<b> weakReference = this.f56780e;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final LynxView b() {
        WeakReference<LynxView> weakReference = this.f56777b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.lynx.tasm.navigator.e.a
    public final void c(LynxView lynxView) {
        b a2 = a();
        if (a2 != null) {
            a2.b(lynxView);
        }
        lynxView.destroy();
    }

    /* access modifiers changed from: package-private */
    public final String a(String str) {
        HashMap<String, Object> hashMap = this.f56778c;
        if (hashMap != null) {
            Object obj = hashMap.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return str;
    }

    public static void b(LynxView lynxView) {
        if (lynxView != null) {
            for (LynxUI lynxUI : b.a.f55815a.f55805d.keySet()) {
                if (lynxUI.mContext.f55901i.f56067a == lynxView) {
                    lynxUI.execPauseAnim();
                }
            }
            lynxView.onEnterBackground();
        }
    }

    public final void a(final LynxView lynxView) {
        if (lynxView != null) {
            b bVar = b.a.f55815a;
            AnonymousClass4 r4 = new b.c() {
                /* class com.lynx.tasm.navigator.a.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(35365);
                }

                @Override // com.lynx.tasm.behavior.b.b.c
                public final void a() {
                    b a2 = a.this.a();
                    if (a2 != null) {
                        a2.b(lynxView);
                    }
                    lynxView.destroy();
                }
            };
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (LynxUI lynxUI : bVar.f55802a.keySet()) {
                if (lynxUI.mContext.f55901i.f56067a == lynxView) {
                    atomicInteger.incrementAndGet();
                    lynxUI.execExitAnim(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0036: INVOKE  
                          (r1v5 'lynxUI' com.lynx.tasm.behavior.ui.LynxUI)
                          (wrap: com.lynx.tasm.behavior.b.b$2 : 0x0033: CONSTRUCTOR  (r0v17 com.lynx.tasm.behavior.b.b$2) = 
                          (r5v0 'bVar' com.lynx.tasm.behavior.b.b)
                          (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger)
                          (r4v0 'r4' com.lynx.tasm.navigator.a$4)
                         call: com.lynx.tasm.behavior.b.b.2.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.lynx.tasm.behavior.ui.LynxUI.execExitAnim(com.lynx.tasm.behavior.b.b$c):void in method: com.lynx.tasm.navigator.a.a(com.lynx.tasm.LynxView):void, file: classes9.dex
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
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:67)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: CONSTRUCTOR  (r0v17 com.lynx.tasm.behavior.b.b$2) = 
                          (r5v0 'bVar' com.lynx.tasm.behavior.b.b)
                          (r3v0 'atomicInteger' java.util.concurrent.atomic.AtomicInteger)
                          (r4v0 'r4' com.lynx.tasm.navigator.a$4)
                         call: com.lynx.tasm.behavior.b.b.2.<init>(com.lynx.tasm.behavior.b.b, java.util.concurrent.atomic.AtomicInteger, com.lynx.tasm.behavior.b.b$c):void type: CONSTRUCTOR in method: com.lynx.tasm.navigator.a.a(com.lynx.tasm.LynxView):void, file: classes9.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 31 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.lynx.tasm.behavior.b.b, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 37 more
                        */
                    /*
                    // Method dump skipped, instructions count: 139
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.navigator.a.a(com.lynx.tasm.LynxView):void");
                }

                a(b bVar, int i2) {
                    this.f56780e = new WeakReference<>(bVar);
                    this.f56779d = new e(i2, this);
                }

                /* access modifiers changed from: package-private */
                public final void a(final d dVar, final g gVar) {
                    b a2 = a();
                    if (a2 != null) {
                        a2.a(dVar, new g() {
                            /* class com.lynx.tasm.navigator.a.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(35364);
                            }

                            @Override // com.lynx.tasm.navigator.g
                            public final void a(LynxView lynxView) {
                                if (lynxView != null) {
                                    a.this.f56779d.put(dVar, lynxView);
                                    gVar.a(lynxView);
                                }
                            }
                        });
                    }
                }
            }
