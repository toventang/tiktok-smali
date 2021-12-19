package com.bytedance.android.alog;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static Alog f6773a;

    static {
        Covode.recordClassIndex(3253);
    }

    public static void b() {
        Alog alog = f6773a;
        if (alog != null) {
            alog.b();
        }
    }

    public static void a() {
        MethodCollector.i(2914);
        Alog.nativeSetDefaultInstance(0);
        f6773a.a();
        f6773a = null;
        MethodCollector.o(2914);
    }

    public static long c() {
        MethodCollector.i(2924);
        Alog alog = f6773a;
        if (alog == null) {
            MethodCollector.o(2924);
            return 0;
        } else if (alog.p != 0) {
            long nativeGetLegacyWriteFuncAddr = Alog.nativeGetLegacyWriteFuncAddr();
            MethodCollector.o(2924);
            return nativeGetLegacyWriteFuncAddr;
        } else {
            MethodCollector.o(2924);
            return 0;
        }
    }

    public static void a(int i2, String str, String str2) {
        Alog alog = f6773a;
        if (alog != null) {
            alog.a(i2, str, str2);
        }
    }

    public static File[] a(String str, String str2, long j2, long j3) {
        String quote;
        Alog alog = f6773a;
        if (alog == null) {
            return new File[0];
        }
        String str3 = alog.f6739j;
        a.f6765b = j2;
        a.f6766c = j3;
        a.f6768e = null;
        a.f6767d = null;
        if (j2 > j3) {
            a.f6768e = "time interval is invalid";
            return new File[0];
        }
        File file = new File(str3);
        if (!file.exists() || !file.isDirectory()) {
            a.f6768e = "log dir not exists";
            return new File[0];
        }
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(':', '-');
        }
        StringBuilder sb = new StringBuilder("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__");
        String str4 = "\\S+";
        if (TextUtils.isEmpty(str)) {
            quote = str4;
        } else {
            quote = Pattern.quote(str);
        }
        StringBuilder append = sb.append(quote).append("__");
        if (!TextUtils.isEmpty(str2)) {
            str4 = Pattern.quote(str2);
        }
        Pattern compile = Pattern.compile(append.append(str4).append("\\.alog\\.hot$").toString());
        ArrayList<String> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007f: INVOKE  (r1v5 'listFiles' java.io.File[]) = 
              (r3v0 'file' java.io.File)
              (wrap: com.bytedance.android.alog.a$1 : 0x007c: CONSTRUCTOR  (r4v3 com.bytedance.android.alog.a$1) = 
              (r5v0 'arrayList' java.util.ArrayList<java.lang.String>)
              (r6v0 'compile' java.util.regex.Pattern)
              (r15v0 'j3' long)
              (r13v0 'j2' long)
             call: com.bytedance.android.alog.a.1.<init>(java.util.ArrayList, java.util.regex.Pattern, long, long):void type: CONSTRUCTOR)
             type: VIRTUAL call: java.io.File.listFiles(java.io.FilenameFilter):java.io.File[] in method: com.bytedance.android.alog.c.a(java.lang.String, java.lang.String, long, long):java.io.File[], file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007c: CONSTRUCTOR  (r4v3 com.bytedance.android.alog.a$1) = 
              (r5v0 'arrayList' java.util.ArrayList<java.lang.String>)
              (r6v0 'compile' java.util.regex.Pattern)
              (r15v0 'j3' long)
              (r13v0 'j2' long)
             call: com.bytedance.android.alog.a.1.<init>(java.util.ArrayList, java.util.regex.Pattern, long, long):void type: CONSTRUCTOR in method: com.bytedance.android.alog.c.a(java.lang.String, java.lang.String, long, long):java.io.File[], file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 26 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.alog.a, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 32 more
            */
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.alog.c.a(java.lang.String, java.lang.String, long, long):java.io.File[]");
    }
}
