package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.c.ai;
import java.io.Serializable;

final class ad<K, V> extends ai.b<K> {
    private final ab<K, V> map;

    static {
        Covode.recordClassIndex(33364);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return true;
    }

    static class a<K> implements Serializable {
        private static final long serialVersionUID = 0;
        final ab<K, ?> map;

        static {
            Covode.recordClassIndex(33365);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.map.keySet();
        }

        a(ab<K, ?> abVar) {
            this.map = abVar;
        }
    }

    public final int size() {
        return this.map.size();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai, com.google.c.c.x
    public final Object writeReplace() {
        return new a(this.map);
    }

    @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, com.google.c.c.ai.b, com.google.c.c.ai.b, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public final br<K> iterator() {
        ab<K, V> abVar = this.map;
        return 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: RETURN  
              (wrap: com.google.c.c.ab$1 : 0x000c: CONSTRUCTOR  (r0v1 com.google.c.c.ab$1) = 
              (r2v0 'abVar' com.google.c.c.ab<K, V>)
              (wrap: com.google.c.c.br<java.util.Map$Entry<K, V>> : 0x0006: INVOKE  (r1v0 com.google.c.c.br<java.util.Map$Entry<K, V>>) = 
              (wrap: com.google.c.c.ai<java.util.Map$Entry<K, V>> : 0x0002: INVOKE  (r0v0 com.google.c.c.ai<java.util.Map$Entry<K, V>>) = (r2v0 'abVar' com.google.c.c.ab<K, V>) type: VIRTUAL call: com.google.c.c.ab.entrySet():com.google.c.c.ai)
             type: VIRTUAL call: com.google.c.c.x.iterator():com.google.c.c.br)
             call: com.google.c.c.ab.1.<init>(com.google.c.c.ab, com.google.c.c.br):void type: CONSTRUCTOR)
             in method: com.google.c.c.ad.iterator():com.google.c.c.br<K>, file: classes9.dex
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: CONSTRUCTOR  (r0v1 com.google.c.c.ab$1) = 
              (r2v0 'abVar' com.google.c.c.ab<K, V>)
              (wrap: com.google.c.c.br<java.util.Map$Entry<K, V>> : 0x0006: INVOKE  (r1v0 com.google.c.c.br<java.util.Map$Entry<K, V>>) = 
              (wrap: com.google.c.c.ai<java.util.Map$Entry<K, V>> : 0x0002: INVOKE  (r0v0 com.google.c.c.ai<java.util.Map$Entry<K, V>>) = (r2v0 'abVar' com.google.c.c.ab<K, V>) type: VIRTUAL call: com.google.c.c.ab.entrySet():com.google.c.c.ai)
             type: VIRTUAL call: com.google.c.c.x.iterator():com.google.c.c.br)
             call: com.google.c.c.ab.1.<init>(com.google.c.c.ab, com.google.c.c.br):void type: CONSTRUCTOR in method: com.google.c.c.ad.iterator():com.google.c.c.br<K>, file: classes9.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:313)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.c.c.ab, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 18 more
            */
        /*
            this = this;
            com.google.c.c.ab<K, V> r2 = r3.map
            com.google.c.c.ai r0 = r2.entrySet()
            com.google.c.c.br r1 = r0.iterator()
            com.google.c.c.ab$1 r0 = new com.google.c.c.ab$1
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.c.ad.iterator():com.google.c.c.br");
    }

    ad(ab<K, V> abVar) {
        this.map = abVar;
    }

    @Override // com.google.c.c.x
    public final boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai.b
    public final K a(int i2) {
        return this.map.entrySet().asList().get(i2).getKey();
    }
}
