package com.bytedance.lighten.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.a.a;
import com.bytedance.lighten.a.b.b;
import com.bytedance.lighten.a.b.c;
import com.bytedance.lighten.a.b.d;
import java.io.File;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final p f39861a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile j f39862b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f39863c;

    /* renamed from: d  reason: collision with root package name */
    public static String f39864d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile s f39865e;

    public static c b() {
        if (!f39863c) {
            return null;
        }
        return f39861a.getCache();
    }

    public static s a() {
        if (f39865e == null) {
            if (f39862b != null) {
                f39865e = f39862b.a();
            } else {
                throw new IllegalStateException("Lighten:lighten is not initialized, call Lighten.init");
            }
        }
        return f39865e;
    }

    static {
        Covode.recordClassIndex(24615);
        p a2 = b.a();
        if (a2 == null && (a2 = c.a()) == null && (a2 = d.a()) == null) {
            a2 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: CONSTRUCTOR  (r0v4 'a2' com.bytedance.lighten.a.p) =  call: com.bytedance.lighten.a.b.a.1.<init>():void type: CONSTRUCTOR in method: com.bytedance.lighten.a.r.<clinit>():void, file: classes6.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.lighten.a.b.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 19 more
                */
            /*
                r0 = 24615(0x6027, float:3.4493E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.lighten.a.p r0 = com.bytedance.lighten.a.b.b.a()
                if (r0 == 0) goto L_0x000e
            L_0x000b:
                com.bytedance.lighten.a.r.f39861a = r0
                return
            L_0x000e:
                com.bytedance.lighten.a.p r0 = com.bytedance.lighten.a.b.c.a()
                if (r0 == 0) goto L_0x0015
                goto L_0x000b
            L_0x0015:
                com.bytedance.lighten.a.p r0 = com.bytedance.lighten.a.b.d.a()
                if (r0 == 0) goto L_0x001c
                goto L_0x000b
            L_0x001c:
                com.bytedance.lighten.a.b.a$1 r0 = new com.bytedance.lighten.a.b.a$1
                r0.<init>()
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.a.r.<clinit>():void");
        }

        public static v a(int i2) {
            return f39861a.load(i2);
        }

        public static v a(Uri uri) {
            return f39861a.load(uri);
        }

        public static void c(u uVar) {
            if (f39863c && uVar != null) {
                f39861a.download(uVar);
            }
        }

        public static void b(int i2) {
            if (f39863c) {
                f39861a.trimMemory(i2);
            }
        }

        public static v a(a aVar) {
            return f39861a.load(aVar);
        }

        public static void b(u uVar) {
            if (f39863c && uVar != null) {
                f39861a.loadBitmap(uVar);
            }
        }

        public static v a(File file) {
            if (!file.exists()) {
                return v.P;
            }
            return f39861a.load(file);
        }

        public static v a(Object obj) {
            return f39861a.load(obj);
        }

        public static v a(String str) {
            if (TextUtils.isEmpty(str)) {
                return v.P;
            }
            return f39861a.load(str);
        }

        static void a(u uVar) {
            if (f39863c && uVar != null) {
                f39861a.display(uVar);
            }
        }
    }
