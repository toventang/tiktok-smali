package androidx.h;

import androidx.h.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import java.util.List;

public abstract class j<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.a<VH> {

    /* renamed from: a  reason: collision with root package name */
    private final a<T> f3171a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AbstractC0045a<T> f3172b;

    static {
        Covode.recordClassIndex(1133);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f3171a.a();
    }

    public final i<T> a() {
        a<T> aVar = this.f3171a;
        if (aVar.f3068g != null) {
            return aVar.f3068g;
        }
        return aVar.f3067f;
    }

    public j(j.e<T> eVar) {
        AnonymousClass1 r1 = new a.AbstractC0045a<T>() {
            /* class androidx.h.j.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1134);
            }
        };
        this.f3172b = r1;
        a<T> aVar = new a<>(this, eVar);
        this.f3171a = aVar;
        aVar.f3065d = r1;
    }

    public T a(int i2) {
        a<T> aVar = this.f3171a;
        if (aVar.f3067f != null) {
            i<T> iVar = aVar.f3067f;
            iVar.f3144h = iVar.f3143g.f3178e + i2;
            iVar.a(i2);
            iVar.f3148l = Math.min(iVar.f3148l, i2);
            iVar.f3149m = Math.max(iVar.f3149m, i2);
            iVar.a(true);
            return aVar.f3067f.get(i2);
        } else if (aVar.f3068g != null) {
            return aVar.f3068g.get(i2);
        } else {
            throw new IndexOutOfBoundsException("Item count is zero, getItem() call is invalid");
        }
    }

    public final void a(i<T> iVar) {
        a<T> aVar = this.f3171a;
        if (iVar != null) {
            if (aVar.f3067f == null && aVar.f3068g == null) {
                aVar.f3066e = iVar.a();
            } else if (iVar.a() != aVar.f3066e) {
                throw new IllegalArgumentException("AsyncPagedListDiffer cannot handle both contiguous and non-contiguous lists.");
            }
        }
        int i2 = aVar.f3069h + 1;
        aVar.f3069h = i2;
        if (iVar == aVar.f3067f) {
            return;
        }
        if (iVar == null) {
            int a2 = aVar.a();
            if (aVar.f3067f != null) {
                aVar.f3067f.a(aVar.f3070i);
                aVar.f3067f = null;
            } else if (aVar.f3068g != null) {
                aVar.f3068g = null;
            }
            aVar.f3062a.b(0, a2);
        } else if (aVar.f3067f == null && aVar.f3068g == null) {
            aVar.f3067f = iVar;
            iVar.a((List) null, aVar.f3070i);
            aVar.f3062a.a(0, iVar.size());
        } else {
            if (aVar.f3067f != null) {
                aVar.f3067f.a(aVar.f3070i);
                aVar.f3068g = (i) aVar.f3067f.e();
                aVar.f3067f = null;
            }
            if (aVar.f3068g == null || aVar.f3067f != null) {
                throw new IllegalStateException("must be in snapshot state to diff");
            }
            aVar.f3063b.f3991b.execute(new Runnable(aVar.f3068g, (i) iVar.e(), i2, iVar) {
                /* class androidx.h.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f3072a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ i f3073b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ int f3074c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ i f3075d;

                static {
                    Covode.recordClassIndex(1093);
                }

                public final void run() {
                    k<T> kVar = this.f3072a.f3143g;
                    k<T> kVar2 = this.f3073b.f3143g;
                    j.e<T> eVar = a.this.f3063b.f3992c;
                    int a2 = kVar.a();
                    final j.d a3 = j.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: INVOKE  (r2v1 'a3' androidx.recyclerview.widget.j$d A[DONT_INLINE]) = 
                          (wrap: androidx.h.l$1 : 0x002c: CONSTRUCTOR  (r1v1 androidx.h.l$1) = 
                          (r2v0 'kVar' androidx.h.k<T>)
                          (r3v0 'a2' int)
                          (r4v0 'kVar2' androidx.h.k<T>)
                          (r5v0 'eVar' androidx.recyclerview.widget.j$e<T>)
                          (wrap: int : 0x001f: ARITH  (r6v2 int) = (wrap: int : 0x001a: ARITH  (r6v1 int) = (wrap: int : 0x0016: INVOKE  (r6v0 int) = (r2v0 'kVar' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.size():int) - (r3v0 'a2' int)) - (wrap: int : 0x001b: INVOKE  (r0v4 int) = (r2v0 'kVar' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.b():int))
                          (wrap: int : 0x0029: ARITH  (r7v2 int) = (wrap: int : 0x0024: ARITH  (r7v1 int) = (wrap: int : 0x0020: INVOKE  (r7v0 int) = (r4v0 'kVar2' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.size():int) - (wrap: int : 0x0012: INVOKE  (r1v0 int) = (r4v0 'kVar2' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.a():int)) - (wrap: int : 0x0025: INVOKE  (r0v5 int) = (r4v0 'kVar2' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.b():int))
                         call: androidx.h.l.1.<init>(androidx.h.k, int, androidx.h.k, androidx.recyclerview.widget.j$e, int, int):void type: CONSTRUCTOR)
                          true
                         type: STATIC call: androidx.recyclerview.widget.j.a(androidx.recyclerview.widget.j$a, boolean):androidx.recyclerview.widget.j$d in method: androidx.h.a.2.run():void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: CONSTRUCTOR  (r1v1 androidx.h.l$1) = 
                          (r2v0 'kVar' androidx.h.k<T>)
                          (r3v0 'a2' int)
                          (r4v0 'kVar2' androidx.h.k<T>)
                          (r5v0 'eVar' androidx.recyclerview.widget.j$e<T>)
                          (wrap: int : 0x001f: ARITH  (r6v2 int) = (wrap: int : 0x001a: ARITH  (r6v1 int) = (wrap: int : 0x0016: INVOKE  (r6v0 int) = (r2v0 'kVar' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.size():int) - (r3v0 'a2' int)) - (wrap: int : 0x001b: INVOKE  (r0v4 int) = (r2v0 'kVar' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.b():int))
                          (wrap: int : 0x0029: ARITH  (r7v2 int) = (wrap: int : 0x0024: ARITH  (r7v1 int) = (wrap: int : 0x0020: INVOKE  (r7v0 int) = (r4v0 'kVar2' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.size():int) - (wrap: int : 0x0012: INVOKE  (r1v0 int) = (r4v0 'kVar2' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.a():int)) - (wrap: int : 0x0025: INVOKE  (r0v5 int) = (r4v0 'kVar2' androidx.h.k<T>) type: VIRTUAL call: androidx.h.k.b():int))
                         call: androidx.h.l.1.<init>(androidx.h.k, int, androidx.h.k, androidx.recyclerview.widget.j$e, int, int):void type: CONSTRUCTOR in method: androidx.h.a.2.run():void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 14 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.h.l, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 20 more
                        */
                    /*
                        this = this;
                        androidx.h.i r0 = r8.f3072a
                        androidx.h.k<T> r2 = r0.f3143g
                        androidx.h.i r0 = r8.f3073b
                        androidx.h.k<T> r4 = r0.f3143g
                        androidx.h.a r0 = androidx.h.a.this
                        androidx.recyclerview.widget.c<T> r0 = r0.f3063b
                        androidx.recyclerview.widget.j$e<T> r5 = r0.f3992c
                        int r3 = r2.a()
                        int r1 = r4.a()
                        int r6 = r2.size()
                        int r6 = r6 - r3
                        int r0 = r2.b()
                        int r6 = r6 - r0
                        int r7 = r4.size()
                        int r7 = r7 - r1
                        int r0 = r4.b()
                        int r7 = r7 - r0
                        androidx.h.l$1 r1 = new androidx.h.l$1
                        r1.<init>(r2, r3, r4, r5, r6, r7)
                        r0 = 1
                        androidx.recyclerview.widget.j$d r2 = androidx.recyclerview.widget.j.a(r1, r0)
                        androidx.h.a r0 = androidx.h.a.this
                        java.util.concurrent.Executor r1 = r0.f3064c
                        androidx.h.a$2$1 r0 = new androidx.h.a$2$1
                        r0.<init>(r2)
                        r1.execute(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.h.a.AnonymousClass2.run():void");
                }

                {
                    /*
                        r0 = this;
                        androidx.h.a.this = r1
                        r0.f3072a = r2
                        r0.f3073b = r3
                        r0.f3074c = r4
                        r0.f3075d = r5
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.h.a.AnonymousClass2.<init>(androidx.h.a, androidx.h.i, androidx.h.i, int, androidx.h.i):void");
                }
            });
        }
    }
}
