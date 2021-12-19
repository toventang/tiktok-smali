package com.bytedance.geckox.g;

import android.os.Process;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.h.b;
import com.bytedance.geckox.h.c;
import com.bytedance.geckox.utils.FileLock;
import com.bytedance.geckox.utils.d;
import com.bytedance.geckox.utils.k;
import com.bytedance.geckox.utils.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f29886a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Long f29887b;

    /* renamed from: c  reason: collision with root package name */
    private String f29888c;

    /* renamed from: d  reason: collision with root package name */
    private String f29889d;

    /* renamed from: e  reason: collision with root package name */
    private volatile File f29890e;

    /* renamed from: f  reason: collision with root package name */
    private volatile b f29891f;

    /* renamed from: g  reason: collision with root package name */
    private AtomicBoolean f29892g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(17333);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        super.finalize();
        try {
            a();
        } catch (Exception e2) {
            d.a(e2);
        }
    }

    private void a() {
        MethodCollector.i(10268);
        if (this.f29892g.getAndSet(true)) {
            MethodCollector.o(10268);
            return;
        }
        b a2 = b.a(this.f29889d + File.separator + this.f29886a + File.separator + "select.lock");
        com.bytedance.geckox.i.a.a("channel version loader clean");
        try {
            if (this.f29890e != null) {
                String str = this.f29890e.getAbsolutePath() + File.separator + "using.lock";
                synchronized (c.f29905a) {
                    try {
                        Pair<FileLock, AtomicLong> pair = c.f29905a.get(str);
                        if (pair != null) {
                            long decrementAndGet = ((AtomicLong) pair.second).decrementAndGet();
                            if (decrementAndGet < 0) {
                                RuntimeException runtimeException = new RuntimeException("using.lock count illegal");
                                MethodCollector.o(10268);
                                throw runtimeException;
                            } else if (decrementAndGet == 0) {
                                ((FileLock) pair.first).a();
                                c.f29905a.remove(str);
                            }
                        } else {
                            RuntimeException runtimeException2 = new RuntimeException("using.lock illegal state");
                            MethodCollector.o(10268);
                            throw runtimeException2;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(10268);
                        throw th;
                    }
                }
                a2.a();
                k.a().execute(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c6: INVOKE  
                      (wrap: com.bytedance.geckox.utils.k : 0x00bd: INVOKE  (r1v15 com.bytedance.geckox.utils.k) =  type: STATIC call: com.bytedance.geckox.utils.k.a():com.bytedance.geckox.utils.k)
                      (wrap: com.bytedance.geckox.b.b$1 : 0x00c3: CONSTRUCTOR  (r0v29 com.bytedance.geckox.b.b$1) = 
                      (wrap: java.lang.Long : 0x00bb: IGET  (r2v2 java.lang.Long) = (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.b java.lang.Long)
                      (wrap: java.lang.String : ?: STR_CONCAT  (r3v1 java.lang.String) = 
                      (wrap: java.lang.String : 0x00a5: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.d java.lang.String)
                      (wrap: java.lang.String : 0x00ab: SGET   java.io.File.separator java.lang.String)
                      (wrap: java.lang.String : 0x00b1: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.a java.lang.String)
                    )
                     call: com.bytedance.geckox.b.b.1.<init>(java.lang.Long, java.lang.String):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.bytedance.geckox.utils.k.execute(java.lang.Runnable):void in method: com.bytedance.geckox.g.a.a():void, file: classes2.dex
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00c3: CONSTRUCTOR  (r0v29 com.bytedance.geckox.b.b$1) = 
                      (wrap: java.lang.Long : 0x00bb: IGET  (r2v2 java.lang.Long) = (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.b java.lang.Long)
                      (wrap: java.lang.String : ?: STR_CONCAT  (r3v1 java.lang.String) = 
                      (wrap: java.lang.String : 0x00a5: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.d java.lang.String)
                      (wrap: java.lang.String : 0x00ab: SGET   java.io.File.separator java.lang.String)
                      (wrap: java.lang.String : 0x00b1: IGET  (r10v0 'this' com.bytedance.geckox.g.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.geckox.g.a.a java.lang.String)
                    )
                     call: com.bytedance.geckox.b.b.1.<init>(java.lang.Long, java.lang.String):void type: CONSTRUCTOR in method: com.bytedance.geckox.g.a.a():void, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 30 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.geckox.b.b, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 36 more
                    */
                /*
                // Method dump skipped, instructions count: 241
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.g.a.a():void");
            }

            private synchronized File b(String str) {
                MethodCollector.i(10107);
                if (this.f29890e != null) {
                    File file = this.f29890e;
                    MethodCollector.o(10107);
                    return file;
                }
                b a2 = b.a(this.f29889d + File.separator + str + File.separator + "select.lock");
                try {
                    if (this.f29887b == null) {
                        this.f29887b = m.a(new File(this.f29889d, str));
                    }
                    if (this.f29887b == null) {
                        a2.a();
                        MethodCollector.o(10107);
                        return null;
                    }
                    File file2 = new File(this.f29889d, File.separator + str + File.separator + this.f29887b + File.separator + "using.lock");
                    this.f29890e = file2.getParentFile();
                    String absolutePath = file2.getAbsolutePath();
                    synchronized (c.f29905a) {
                        try {
                            Pair<FileLock, AtomicLong> pair = c.f29905a.get(absolutePath);
                            if (pair == null) {
                                pair = new Pair<>(FileLock.a(absolutePath, Process.myPid()), new AtomicLong(0));
                                c.f29905a.put(absolutePath, pair);
                            }
                            ((AtomicLong) pair.second).incrementAndGet();
                        } catch (Throwable th) {
                            MethodCollector.o(10107);
                            throw th;
                        }
                    }
                    return this.f29890e;
                } finally {
                    a2.a();
                    MethodCollector.o(10107);
                }
            }

            public final synchronized b a(String str) {
                MethodCollector.i(9951);
                if (this.f29891f != null) {
                    b bVar = this.f29891f;
                    MethodCollector.o(9951);
                    return bVar;
                }
                File b2 = b(str);
                if (b2 != null) {
                    com.bytedance.geckox.j.b.a(this.f29888c, str, b2.getName(), "1", "true", System.currentTimeMillis());
                    File file = new File(b2, "res");
                    if (!file.exists() || !file.isDirectory()) {
                        RuntimeException runtimeException = new RuntimeException("can not find res, dir:" + b2.getAbsolutePath());
                        MethodCollector.o(9951);
                        throw runtimeException;
                    }
                    this.f29891f = new b(b2);
                    b bVar2 = this.f29891f;
                    MethodCollector.o(9951);
                    return bVar2;
                }
                com.bytedance.geckox.j.b.a(this.f29888c, str, "null", "1", "false", System.currentTimeMillis());
                FileNotFoundException fileNotFoundException = new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
                MethodCollector.o(9951);
                throw fileNotFoundException;
            }

            a(String str, String str2, String str3) {
                this.f29888c = str;
                this.f29889d = str2;
                this.f29886a = str3;
            }
        }
