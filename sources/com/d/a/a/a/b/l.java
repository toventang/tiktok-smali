package com.d.a.a.a.b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.d.a.a.a.c.c;
import com.d.a.a.a.c.e;
import com.d.a.a.a.c.f;
import com.d.a.a.a.e.d;
import com.d.a.a.a.g.a;
import com.d.a.a.a.g.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public final class l extends b {

    /* renamed from: i  reason: collision with root package name */
    private static final Pattern f46355i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a  reason: collision with root package name */
    public final c f46356a;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f46357b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public a f46358c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f46359d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f46360e = false;

    /* renamed from: f  reason: collision with root package name */
    public String f46361f;

    /* renamed from: g  reason: collision with root package name */
    boolean f46362g;

    /* renamed from: h  reason: collision with root package name */
    boolean f46363h;

    /* renamed from: j  reason: collision with root package name */
    private final d f46364j;

    /* renamed from: k  reason: collision with root package name */
    private com.d.a.a.a.f.a f46365k;

    static {
        Covode.recordClassIndex(28309);
    }

    private c d(View view) {
        for (c cVar : this.f46357b) {
            if (cVar.f46377a.get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private static void e(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void f(View view) {
        this.f46365k = new com.d.a.a.a.f.a(view);
    }

    public final View c() {
        return (View) this.f46365k.get();
    }

    @Override // com.d.a.a.a.b.b
    public final void c(View view) {
        if (!this.f46360e) {
            e(view);
            c d2 = d(view);
            if (d2 != null) {
                this.f46357b.remove(d2);
            }
        }
    }

    public final boolean d() {
        return this.f46359d && !this.f46360e;
    }

    l(c cVar, d dVar) {
        this.f46356a = cVar;
        this.f46364j = dVar;
        this.f46361f = UUID.randomUUID().toString();
        f(null);
        if (dVar.f46344h == e.HTML) {
            this.f46358c = new b(dVar.f46338b);
        } else {
            this.f46358c = new com.d.a.a.a.g.c(Collections.unmodifiableMap(dVar.f46340d), dVar.f46341e);
        }
        this.f46358c.a();
        com.d.a.a.a.c.a.f46367a.f46368b.add(this);
        a aVar = this.f46358c;
        e.f46383a.a(aVar.c(), "init", cVar.a());
    }

    @Override // com.d.a.a.a.b.b
    public final void a() {
        if (!this.f46359d) {
            this.f46359d = true;
            com.d.a.a.a.c.a.f46367a.a(this);
            this.f46358c.a(f.a().f46388a);
            this.f46358c.a(this, this.f46364j);
        }
    }

    @Override // com.d.a.a.a.b.b
    public final void a(View view) {
        if (!this.f46360e) {
            d.a(view, "AdView is null");
            if (c() != view) {
                f(view);
                this.f46358c.d();
                Collection<l> unmodifiableCollection = Collections.unmodifiableCollection(com.d.a.a.a.c.a.f46367a.f46368b);
                if (unmodifiableCollection != null && unmodifiableCollection.size() > 0) {
                    for (l lVar : unmodifiableCollection) {
                        if (lVar != this && lVar.c() == view) {
                            lVar.f46365k.clear();
                        }
                    }
                }
            }
        }
    }

    @Override // com.d.a.a.a.b.b
    public final void b() {
        if (!this.f46360e) {
            this.f46365k.clear();
            if (!this.f46360e) {
                this.f46357b.clear();
            }
            this.f46360e = true;
            e.f46383a.a(this.f46358c.c(), "finishSession", new Object[0]);
            com.d.a.a.a.c.a aVar = com.d.a.a.a.c.a.f46367a;
            boolean a2 = aVar.a();
            aVar.f46368b.remove(this);
            aVar.f46369c.remove(this);
            if (a2 && !aVar.a()) {
                f a3 = f.a();
                com.d.a.a.a.h.a aVar2 = com.d.a.a.a.h.a.f46417a;
                com.d.a.a.a.h.a.b();
                aVar2.f46422d.clear();
                com.d.a.a.a.h.a.f46418b.post(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: INVOKE  
                      (wrap: android.os.Handler : 0x004d: SGET  (r1v2 android.os.Handler) =  com.d.a.a.a.h.a.b android.os.Handler)
                      (wrap: com.d.a.a.a.h.a$1 : 0x0051: CONSTRUCTOR  (r0v11 com.d.a.a.a.h.a$1) = (r2v2 'aVar2' com.d.a.a.a.h.a) call: com.d.a.a.a.h.a.1.<init>(com.d.a.a.a.h.a):void type: CONSTRUCTOR)
                     type: VIRTUAL call: android.os.Handler.post(java.lang.Runnable):boolean in method: com.d.a.a.a.b.l.b():void, file: classes8.dex
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0051: CONSTRUCTOR  (r0v11 com.d.a.a.a.h.a$1) = (r2v2 'aVar2' com.d.a.a.a.h.a) call: com.d.a.a.a.h.a.1.<init>(com.d.a.a.a.h.a):void type: CONSTRUCTOR in method: com.d.a.a.a.b.l.b():void, file: classes8.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 26 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.d.a.a.a.h.a, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 32 more
                    */
                /*
                // Method dump skipped, instructions count: 131
                */
                throw new UnsupportedOperationException("Method not decompiled: com.d.a.a.a.b.l.b():void");
            }

            @Override // com.d.a.a.a.b.b
            public final void b(View view) {
                g gVar = g.OTHER;
                if (!this.f46360e) {
                    e(view);
                    if (d(view) == null) {
                        this.f46357b.add(new c(view, gVar));
                    }
                }
            }

            public final boolean e() {
                return i.NATIVE == this.f46356a.f46332a;
            }
        }
