package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;

/* access modifiers changed from: package-private */
public final class bl<E> extends ai<E> {

    /* renamed from: a  reason: collision with root package name */
    final transient E f54006a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f54007b;

    static {
        Covode.recordClassIndex(33477);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return false;
    }

    public final int size() {
        return 1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai
    public final boolean c() {
        if (this.f54007b != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai
    public final z<E> d() {
        return z.of(this.f54006a);
    }

    @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public final br<E> iterator() {
        return 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: RETURN  
              (wrap: com.google.c.c.an$3 : 0x0004: CONSTRUCTOR  (r0v0 com.google.c.c.an$3) = 
              (wrap: E : 0x0000: IGET  (r1v0 E) = (r2v0 'this' com.google.c.c.bl<E> A[IMMUTABLE_TYPE, THIS]) com.google.c.c.bl.a java.lang.Object)
             call: com.google.c.c.an.3.<init>(java.lang.Object):void type: CONSTRUCTOR)
             in method: com.google.c.c.bl.iterator():com.google.c.c.br<E>, file: classes9.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: CONSTRUCTOR  (r0v0 com.google.c.c.an$3) = 
              (wrap: E : 0x0000: IGET  (r1v0 E) = (r2v0 'this' com.google.c.c.bl<E> A[IMMUTABLE_TYPE, THIS]) com.google.c.c.bl.a java.lang.Object)
             call: com.google.c.c.an.3.<init>(java.lang.Object):void type: CONSTRUCTOR in method: com.google.c.c.bl.iterator():com.google.c.c.br<E>, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.c.c.an, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            E r1 = r2.f54006a
            com.google.c.c.an$3 r0 = new com.google.c.c.an$3
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.c.bl.iterator():com.google.c.c.br");
    }

    @Override // com.google.c.c.ai
    public final int hashCode() {
        int i2 = this.f54007b;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f54006a.hashCode();
        this.f54007b = hashCode;
        return hashCode;
    }

    public final String toString() {
        return "[" + this.f54006a.toString() + ']';
    }

    @Override // com.google.c.c.x
    public final boolean contains(Object obj) {
        return this.f54006a.equals(obj);
    }

    bl(E e2) {
        this.f54006a = (E) k.a(e2);
    }

    bl(E e2, int i2) {
        this.f54006a = e2;
        this.f54007b = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final int a(Object[] objArr, int i2) {
        objArr[i2] = this.f54006a;
        return i2 + 1;
    }
}
