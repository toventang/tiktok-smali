package com.ss.android.agilelogger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.android.alog.Alog;
import com.bytedance.android.alog.c;
import com.bytedance.android.alog.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.agilelogger.a;
import com.ss.android.agilelogger.c.b;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;

public class ALog {
    private static volatile Set<String> mBlockTagSet;
    private static Alog mainThreadRef = null;
    private static int prio = 3;
    private static Handler sAsyncHandler;
    private static HandlerThread sAsyncLogThread;
    public static a sConfig;
    public static volatile boolean sDebug;
    public static volatile b sILogCacheCallback;
    private static volatile List<c> sINativeFuncAddrCallbackList = new ArrayList();
    private static Object sInitLock = new Object();
    private static volatile boolean sInitSuccess;
    private static boolean sInitialized = false;
    private static long sMainThreadId = -1;
    private static ScheduledExecutorService sOuterExecutorService = null;
    private static ArrayList<WeakReference<Alog>> sStandaloneInstances = new ArrayList<>();

    public static void forceLogSharding() {
    }

    private static int level2AlogCoreLevel(int i2) {
        return i2 - 2;
    }

    public static void setPrintStackTrace(boolean z) {
    }

    public static void setsPackageClassName(String str) {
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        static final Object f59069a = new Object();

        /* renamed from: b  reason: collision with root package name */
        static a f59070b;

        /* renamed from: c  reason: collision with root package name */
        static int f59071c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f59072d;

        /* renamed from: e  reason: collision with root package name */
        public String f59073e;

        /* renamed from: f  reason: collision with root package name */
        public String f59074f;

        /* renamed from: g  reason: collision with root package name */
        public Throwable f59075g;

        /* renamed from: h  reason: collision with root package name */
        public b.a f59076h;

        /* renamed from: i  reason: collision with root package name */
        public Object f59077i;

        /* renamed from: j  reason: collision with root package name */
        public long f59078j;

        /* renamed from: k  reason: collision with root package name */
        public long f59079k;

        /* renamed from: l  reason: collision with root package name */
        public a f59080l;

        private a() {
        }

        static {
            Covode.recordClassIndex(36527);
        }

        public static a a() {
            MethodCollector.i(2437);
            synchronized (f59069a) {
                try {
                    a aVar = f59070b;
                    if (aVar != null) {
                        f59070b = aVar.f59080l;
                        aVar.f59080l = null;
                        f59071c--;
                        return aVar;
                    }
                    a aVar2 = new a();
                    MethodCollector.o(2437);
                    return aVar2;
                } finally {
                    MethodCollector.o(2437);
                }
            }
        }
    }

    public static Set<String> getBlockTagSet() {
        return mBlockTagSet;
    }

    public static List<c> getNativeFuncAddrCallbackList() {
        return sINativeFuncAddrCallbackList;
    }

    public static boolean isInitSuccess() {
        return sInitSuccess;
    }

    public static long getALogWriteFuncAddr() {
        return c.c();
    }

    private static void initMainThreadIdIfNeeded() {
        if (sMainThreadId == -1) {
            sMainThreadId = (long) Process.myTid();
        }
    }

    public static void destroy() {
        c.a();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.a();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
    }

    public static void flush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        c.b();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.b();
        }
    }

    public static void release() {
        c.a();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.a();
        }
        if (sAsyncHandler != null) {
            sAsyncLogThread.quit();
            sAsyncLogThread = null;
            sAsyncHandler = null;
        }
    }

    static {
        Covode.recordClassIndex(36519);
    }

    public static void asyncFlush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        c.b();
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.b();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog2 = it.next().get();
            if (alog2 != null) {
                alog2.b();
            }
        }
    }

    public static long getALogSimpleWriteFuncAddr() {
        MethodCollector.i(4839);
        if (c.f6773a == null) {
            MethodCollector.o(4839);
            return 0;
        } else if (c.f6773a.p != 0) {
            long nativeGetNativeWriteFuncAddr = Alog.nativeGetNativeWriteFuncAddr();
            MethodCollector.o(4839);
            return nativeGetNativeWriteFuncAddr;
        } else {
            MethodCollector.o(4839);
            return 0;
        }
    }

    public static long getAlogNativeFlushV2FuncAddr() {
        MethodCollector.i(4740);
        if (c.f6773a == null) {
            MethodCollector.o(4740);
            return 0;
        } else if (c.f6773a.p != 0) {
            long nativeGetLegacyFlushFuncAddr = Alog.nativeGetLegacyFlushFuncAddr();
            MethodCollector.o(4740);
            return nativeGetLegacyFlushFuncAddr;
        } else {
            MethodCollector.o(4740);
            return 0;
        }
    }

    public static long getAlogNativeLogStoreDirFuncAddr() {
        MethodCollector.i(4836);
        if (c.f6773a == null) {
            MethodCollector.o(4836);
            return 0;
        } else if (c.f6773a.p != 0) {
            long nativeGetLegacyGetLogFileDirFuncAddr = Alog.nativeGetLegacyGetLogFileDirFuncAddr();
            MethodCollector.o(4836);
            return nativeGetLegacyGetLogFileDirFuncAddr;
        } else {
            MethodCollector.o(4836);
            return 0;
        }
    }

    public static void syncFlush() {
        Handler handler = sAsyncHandler;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        if (c.f6773a != null) {
            c.f6773a.c();
        }
        Alog alog = mainThreadRef;
        if (alog != null) {
            alog.c();
        }
        Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
        while (it.hasNext()) {
            Alog alog2 = it.next().get();
            if (alog2 != null) {
                alog2.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.agilelogger.ALog$7  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59068a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 115
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.ALog.AnonymousClass7.<clinit>():void");
        }
    }

    public static HashMap<String, String> getLastFetchErrorInfo() {
        if (c.f6773a == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("start", Long.toString(com.bytedance.android.alog.a.f6765b));
        hashMap.put("end", Long.toString(com.bytedance.android.alog.a.f6766c));
        hashMap.put("reason", com.bytedance.android.alog.a.f6768e);
        if (com.bytedance.android.alog.a.f6767d != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = com.bytedance.android.alog.a.f6767d.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next.endsWith(".alog.hot")) {
                    next = next.substring(0, next.length() - com.bytedance.android.alog.a.f6764a);
                }
                sb.append(next).append(";");
            }
            hashMap.put("file", sb.toString());
        }
        com.bytedance.android.alog.a.f6768e = null;
        com.bytedance.android.alog.a.f6767d = null;
        return hashMap;
    }

    public static String getStatus() {
        try {
            if (c.f6773a == null) {
                return "default log instance is null";
            }
            Alog alog = c.f6773a;
            if (!Alog.f6737h) {
                return "not inited";
            }
            if (alog.n == null) {
                alog.n = d.a();
            }
            if (alog.n == null) {
                return "get process name failed";
            }
            String replace = alog.n.replace(':', '-');
            File file = new File(alog.f6740k);
            if (!file.exists()) {
                return "cache dir not exists";
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return "cache dir is empty";
            }
            String str = replace + "__" + alog.o + ".alog.cache.guard";
            Pattern compile = Pattern.compile("^" + Pattern.quote(replace) + "__" + Pattern.quote(alog.o) + "__\\d{5}\\.alog\\.cache$");
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (File file2 : listFiles) {
                if (file2.getName().equals(str)) {
                    i2++;
                    if (file2.length() >= 24576) {
                        i3++;
                    }
                } else if (file2.getName().startsWith(replace + "__" + alog.o + "__") && compile.matcher(file2.getName()).find()) {
                    i4++;
                    if (file2.length() >= ((long) alog.f6741l)) {
                        i5++;
                    }
                }
            }
            if (i2 <= 0) {
                file.getAbsolutePath();
                return "cache guard not exists";
            } else if (i3 <= 0) {
                return "cache guard size insufficiently";
            } else {
                if (i4 < alog.f6742m) {
                    return "cache block count insufficiently";
                }
                if (i5 < alog.f6742m) {
                    return "cache block size insufficiently";
                }
                File file3 = new File(alog.f6739j);
                if (!file3.exists()) {
                    return "log dir not exists";
                }
                File[] listFiles2 = file3.listFiles(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0150: INVOKE  (r0v35 'listFiles2' java.io.File[]) = 
                      (r2v1 'file3' java.io.File)
                      (wrap: com.bytedance.android.alog.Alog$1 : 0x014d: CONSTRUCTOR  (r0v34 com.bytedance.android.alog.Alog$1) = 
                      (r3v0 'alog' com.bytedance.android.alog.Alog)
                      (wrap: java.util.regex.Pattern : 0x0147: INVOKE  (r1v9 java.util.regex.Pattern) = 
                      (wrap: java.lang.String : ?: STR_CONCAT  
                      ("^\d{4}_\d{2}_\d{2}_\d+__")
                      (wrap: java.lang.String : 0x0127: INVOKE  (r7v0 'replace' java.lang.String) type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("__")
                      (wrap: java.lang.String : 0x0135: INVOKE  
                      (wrap: java.lang.String : 0x0133: IGET  (r3v0 'alog' com.bytedance.android.alog.Alog) com.bytedance.android.alog.Alog.o java.lang.String)
                     type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("\.alog\.hot$")
                    )
                     type: STATIC call: java.util.regex.Pattern.compile(java.lang.String):java.util.regex.Pattern)
                     call: com.bytedance.android.alog.Alog.1.<init>(com.bytedance.android.alog.Alog, java.util.regex.Pattern):void type: CONSTRUCTOR)
                     type: VIRTUAL call: java.io.File.listFiles(java.io.FilenameFilter):java.io.File[] in method: com.ss.android.agilelogger.ALog.getStatus():java.lang.String, file: classes.dex
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
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
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
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
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
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014d: CONSTRUCTOR  (r0v34 com.bytedance.android.alog.Alog$1) = 
                      (r3v0 'alog' com.bytedance.android.alog.Alog)
                      (wrap: java.util.regex.Pattern : 0x0147: INVOKE  (r1v9 java.util.regex.Pattern) = 
                      (wrap: java.lang.String : ?: STR_CONCAT  
                      ("^\d{4}_\d{2}_\d{2}_\d+__")
                      (wrap: java.lang.String : 0x0127: INVOKE  (r7v0 'replace' java.lang.String) type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("__")
                      (wrap: java.lang.String : 0x0135: INVOKE  
                      (wrap: java.lang.String : 0x0133: IGET  (r3v0 'alog' com.bytedance.android.alog.Alog) com.bytedance.android.alog.Alog.o java.lang.String)
                     type: STATIC call: java.util.regex.Pattern.quote(java.lang.String):java.lang.String)
                      ("\.alog\.hot$")
                    )
                     type: STATIC call: java.util.regex.Pattern.compile(java.lang.String):java.util.regex.Pattern)
                     call: com.bytedance.android.alog.Alog.1.<init>(com.bytedance.android.alog.Alog, java.util.regex.Pattern):void type: CONSTRUCTOR in method: com.ss.android.agilelogger.ALog.getStatus():java.lang.String, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 58 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.alog.Alog, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 64 more
                    */
                /*
                // Method dump skipped, instructions count: 357
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.ALog.getStatus():java.lang.String");
            }

            public static void setILogCacheCallback(b bVar) {
                sILogCacheCallback = bVar;
            }

            public static void setOuterExecutorService(ScheduledExecutorService scheduledExecutorService) {
                sOuterExecutorService = scheduledExecutorService;
            }

            public static class b {

                /* renamed from: a  reason: collision with root package name */
                private final Alog f59081a;

                static {
                    Covode.recordClassIndex(36528);
                }

                b(Alog alog) {
                    this.f59081a = alog;
                }
            }

            public static void addNativeFuncAddrCallback(c cVar) {
                sINativeFuncAddrCallbackList.add(cVar);
            }

            public static void setBlockTagSet(Set<String> set) {
                mBlockTagSet = Collections.unmodifiableSet(set);
            }

            public static void changeLevel(int i2) {
                prio = i2;
                int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                if (c.f6773a != null) {
                    c.f6773a.b(level2AlogCoreLevel);
                }
                Alog alog = mainThreadRef;
                if (alog != null) {
                    alog.b(level2AlogCoreLevel(i2));
                }
            }

            public static void setDebug(boolean z) {
                sDebug = z;
                if (c.f6773a != null) {
                    c.f6773a.a(z);
                }
                Alog alog = mainThreadRef;
                if (alog != null) {
                    alog.a(sDebug);
                }
            }

            public static void timedSyncFlush(int i2) {
                Handler handler = sAsyncHandler;
                if (handler != null) {
                    handler.sendEmptyMessage(2);
                }
                if (c.f6773a != null) {
                    c.f6773a.a(i2);
                }
                Alog alog = mainThreadRef;
                if (alog != null) {
                    alog.a(i2);
                }
                Iterator<WeakReference<Alog>> it = sStandaloneInstances.iterator();
                while (it.hasNext()) {
                    Alog alog2 = it.next().get();
                    if (alog2 != null) {
                        alog2.a(i2);
                    }
                }
            }

            public static void writeCachedItems(Queue<e> queue) {
                for (e eVar : queue) {
                    if (checkPrioAndTag(eVar.f59111b, eVar.f59112c)) {
                        handleItemMsg(eVar);
                        c.a(level2AlogCoreLevel(eVar.f59111b), eVar.f59112c, eVar.f59113d);
                    }
                }
            }

            public static boolean com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
                MethodCollector.i(4222);
                try {
                    e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                    if (e.a(file.getAbsolutePath(), cVar)) {
                        e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                    }
                    if (e.c(file.getAbsolutePath(), cVar)) {
                        e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                        MethodCollector.o(4222);
                        return false;
                    }
                } catch (Throwable unused) {
                }
                boolean delete = file.delete();
                MethodCollector.o(4222);
                return delete;
            }

            private static void handleItemMsg(e eVar) {
                String str;
                switch (AnonymousClass7.f59068a[eVar.f59116g.ordinal()]) {
                    case 1:
                        str = (String) eVar.f59117h;
                        break;
                    case 2:
                        if (eVar.f59118i != null) {
                            str = eVar.f59118i + com.ss.android.agilelogger.c.d.a((Throwable) eVar.f59117h);
                            break;
                        } else {
                            str = com.ss.android.agilelogger.c.d.a((Throwable) eVar.f59117h);
                            break;
                        }
                    case 3:
                    case 4:
                        str = com.ss.android.agilelogger.c.b.a(eVar.f59116g, (String) eVar.f59117h);
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        str = com.ss.android.agilelogger.c.b.a(eVar.f59116g, (Bundle) eVar.f59117h);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        str = com.ss.android.agilelogger.c.b.a(eVar.f59116g, (Intent) eVar.f59117h);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        str = com.ss.android.agilelogger.c.b.a(eVar.f59116g, (Throwable) eVar.f59117h);
                        break;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        str = com.ss.android.agilelogger.c.b.a(eVar.f59116g, (Thread) eVar.f59117h);
                        break;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        str = com.ss.android.agilelogger.c.b.a(eVar.f59116g, (StackTraceElement[]) eVar.f59117h);
                        break;
                    default:
                        str = "";
                        break;
                }
                eVar.f59113d = str;
            }

            public static void handleAsyncLog(a aVar) {
                String str;
                MethodCollector.i(4931);
                int level2AlogCoreLevel = level2AlogCoreLevel(aVar.f59072d);
                String str2 = "";
                if (aVar.f59076h == null) {
                    if (aVar.f59075g == null) {
                        str2 = aVar.f59074f;
                    } else {
                        if (aVar.f59074f == null) {
                            str = "";
                        } else {
                            str = aVar.f59074f + "\n";
                        }
                        str2 = str + com.ss.android.agilelogger.c.d.a(aVar.f59075g);
                    }
                } else if (aVar.f59076h == b.a.BORDER) {
                    str2 = com.ss.android.agilelogger.c.b.a(b.a.BORDER, aVar.f59074f);
                } else if (aVar.f59076h == b.a.JSON) {
                    str2 = com.ss.android.agilelogger.c.b.a(b.a.JSON, aVar.f59074f);
                } else if (aVar.f59076h == b.a.BUNDLE) {
                    str2 = com.ss.android.agilelogger.c.b.a(b.a.BUNDLE, (Bundle) aVar.f59077i);
                } else if (aVar.f59076h == b.a.INTENT) {
                    str2 = com.ss.android.agilelogger.c.b.a(b.a.INTENT, (Intent) aVar.f59077i);
                } else if (aVar.f59076h == b.a.THROWABLE) {
                    str2 = com.ss.android.agilelogger.c.b.a(b.a.THROWABLE, (Throwable) aVar.f59077i);
                } else if (aVar.f59076h == b.a.THREAD) {
                    str2 = com.ss.android.agilelogger.c.b.a(b.a.THREAD, (Thread) aVar.f59077i);
                } else if (aVar.f59076h == b.a.STACKTRACE) {
                    str2 = com.ss.android.agilelogger.c.b.a(b.a.STACKTRACE, (StackTraceElement[]) aVar.f59077i);
                }
                String str3 = aVar.f59073e;
                long j2 = aVar.f59078j;
                long j3 = aVar.f59079k;
                if (c.f6773a != null) {
                    Alog alog = c.f6773a;
                    if (!(alog.p == 0 || level2AlogCoreLevel < alog.f6738i || str3 == null || str2 == null)) {
                        Alog.nativeWriteAsyncMsg(alog.p, level2AlogCoreLevel, str3, str2, j2, j3);
                    }
                }
                aVar.f59073e = null;
                aVar.f59074f = null;
                aVar.f59075g = null;
                aVar.f59076h = null;
                aVar.f59077i = null;
                aVar.f59078j = -1;
                aVar.f59079k = 0;
                aVar.f59080l = null;
                synchronized (a.f59069a) {
                    try {
                        if (a.f59071c < 50) {
                            aVar.f59080l = a.f59070b;
                            a.f59070b = aVar;
                            a.f59071c++;
                        }
                    } finally {
                        MethodCollector.o(4931);
                    }
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
                com.ss.android.agilelogger.ALog.prio = r9.f59090i;
                r2 = r9.f59082a;
                r1 = com.ss.android.agilelogger.f.b();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
                if (r1 == null) goto L_0x0200;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
                if (r1.contains(":") != false) goto L_0x0200;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
                if (r1.equals(r2.getPackageName()) == false) goto L_0x01f2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
                r6 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
                r3 = r9.f59093l;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
                if (r3 != false) goto L_0x01ef;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
                if (r9.f59092k == false) goto L_0x01ef;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
                if (r6 == false) goto L_0x01ef;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x004f, code lost:
                r5 = true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
                r4 = new com.bytedance.android.alog.Alog.b(r9.f59082a).a("default");
                r4.f6746a = level2AlogCoreLevel(r9.f59090i);
                r4.f6747b = com.ss.android.agilelogger.ALog.sDebug;
                r4.f6748c = r9.f59087f;
                r4.f6749d = r9.f59085d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
                if (r5 == false) goto L_0x01eb;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
                r0 = (r9.f59084c / 3) * 2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
                r4.f6750e = r0;
                r4.f6751f = r9.f59083b;
                r4.f6752g = r9.f59086e;
                r1 = 65536;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x0088, code lost:
                if (r6 == false) goto L_0x01e6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
                r0 = 65536;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
                r4.f6753h = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
                if (r6 == false) goto L_0x0092;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
                r1 = 196608;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
                r4.f6754i = r1;
                r1 = r4.a(com.bytedance.android.alog.Alog.d.SAFE).a(com.bytedance.android.alog.Alog.g.RAW).a(com.bytedance.android.alog.Alog.e.LEGACY);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
                if (r9.f59088g == false) goto L_0x01e2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00aa, code lost:
                r0 = com.bytedance.android.alog.Alog.c.ZSTD;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ac, code lost:
                r1 = r1.a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b2, code lost:
                if (r9.f59089h == false) goto L_0x01de;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
                r0 = com.bytedance.android.alog.Alog.f.TEA_16;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
                r1 = r1.a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
                if (r9.f59089h == false) goto L_0x01da;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x00be, code lost:
                r0 = com.bytedance.android.alog.Alog.a.EC_SECP256K1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c0, code lost:
                r1 = r1.a(r0);
                r1.f6755j = r9.f59091j;
                r0 = r1.a();
                com.bytedance.android.alog.c.f6773a = r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ce, code lost:
                if (r0 != null) goto L_0x01d6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d0, code lost:
                r0 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
                com.bytedance.android.alog.Alog.nativeSetDefaultInstance(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
                if (r3 == false) goto L_0x00f2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d7, code lost:
                if (r6 == false) goto L_0x00f2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d9, code lost:
                r1 = new android.os.HandlerThread("Alog_main_delegate");
                com.ss.android.agilelogger.ALog.sAsyncLogThread = r1;
                r1.start();
                com.ss.android.agilelogger.ALog.sAsyncHandler = new com.ss.android.agilelogger.ALog.AnonymousClass1(com.ss.android.agilelogger.ALog.sAsyncLogThread.getLooper());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
                if (r5 == false) goto L_0x0166;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
                r1 = new com.bytedance.android.alog.Alog.b(r9.f59082a).a("main");
                r1.f6746a = level2AlogCoreLevel(r9.f59090i);
                r1.f6747b = com.ss.android.agilelogger.ALog.sDebug;
                r1.f6748c = r9.f59087f;
                r1.f6749d = r9.f59085d / 2;
                r1.f6750e = r9.f59084c / 3;
                r1.f6751f = r9.f59083b;
                r1.f6752g = r9.f59086e;
                r1.f6753h = 32768;
                r1.f6754i = 98304;
                r1 = r1.a(com.bytedance.android.alog.Alog.d.SAFE).a(com.bytedance.android.alog.Alog.g.RAW).a(com.bytedance.android.alog.Alog.e.LEGACY);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x0140, code lost:
                if (r9.f59088g == false) goto L_0x01d2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
                r0 = com.bytedance.android.alog.Alog.c.ZSTD;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:59:0x0144, code lost:
                r1 = r1.a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
                if (r9.f59089h == false) goto L_0x01ce;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x014c, code lost:
                r0 = com.bytedance.android.alog.Alog.f.TEA_16;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x014e, code lost:
                r1 = r1.a(r0);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
                if (r9.f59089h == false) goto L_0x01cb;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:64:0x0156, code lost:
                r0 = com.bytedance.android.alog.Alog.a.EC_SECP256K1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:65:0x0158, code lost:
                r1 = r1.a(r0);
                r1.f6755j = r9.f59091j;
                com.ss.android.agilelogger.ALog.mainThreadRef = r1.a();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:66:0x0166, code lost:
                r6 = r9.f59086e;
                r5 = r9.f59087f;
                r3 = null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:67:0x016d, code lost:
                if (com.ss.android.agilelogger.ALog.sILogCacheCallback == null) goto L_0x017d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:68:0x016f, code lost:
                r1 = com.ss.android.agilelogger.ALog.sILogCacheCallback.a();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:0x0175, code lost:
                if (r1 == null) goto L_0x01c7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:71:0x017b, code lost:
                if (r1.size() != 0) goto L_0x01c7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:73:0x0185, code lost:
                if (getNativeFuncAddrCallbackList().size() <= 0) goto L_0x01a4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:74:0x0187, code lost:
                r2 = new com.ss.android.agilelogger.ALog.AnonymousClass2();
                r0 = com.ss.android.agilelogger.ALog.sOuterExecutorService;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:75:0x018e, code lost:
                if (r0 != null) goto L_0x01a0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
                new java.lang.Thread(r2, "_ALOG_OPT_").start();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:77:0x019a, code lost:
                com.ss.android.agilelogger.ALog.sInitSuccess = true;
                com.bytedance.frameworks.apm.trace.MethodCollector.o(4126);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:78:0x019f, code lost:
                return true;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a0, code lost:
                r0.execute(r2);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a4, code lost:
                r4 = com.ss.android.agilelogger.ALog.sOuterExecutorService;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a6, code lost:
                if (r4 != null) goto L_0x01ba;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a8, code lost:
                new java.util.Timer("_ALOG_OPT_").schedule(new com.ss.android.agilelogger.ALog.AnonymousClass3(), 15000);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ba, code lost:
                r4.schedule(new com.ss.android.agilelogger.ALog.AnonymousClass4(), 15, java.util.concurrent.TimeUnit.SECONDS);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:84:0x01c7, code lost:
                r3 = r1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c8, code lost:
                if (r3 != null) goto L_0x0187;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:86:0x01cb, code lost:
                r0 = com.bytedance.android.alog.Alog.a.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ce, code lost:
                r0 = com.bytedance.android.alog.Alog.f.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d2, code lost:
                r0 = com.bytedance.android.alog.Alog.c.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d6, code lost:
                r0 = r0.p;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:90:0x01da, code lost:
                r0 = com.bytedance.android.alog.Alog.a.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:91:0x01de, code lost:
                r0 = com.bytedance.android.alog.Alog.f.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e2, code lost:
                r0 = com.bytedance.android.alog.Alog.c.NONE;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e6, code lost:
                r0 = 32768;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:94:0x01eb, code lost:
                r0 = r9.f59084c;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:95:0x01ef, code lost:
                r5 = false;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:97:0x01fc, code lost:
                if (r1.equals(r2.getApplicationInfo().processName) == false) goto L_0x0200;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:98:0x0200, code lost:
                r6 = false;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static boolean init(com.ss.android.agilelogger.a r9) {
                /*
                // Method dump skipped, instructions count: 525
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.ALog.init(com.ss.android.agilelogger.a):boolean");
            }

            public static boolean checkPrioAndTag(int i2, String str) {
                if (i2 < prio) {
                    return false;
                }
                if (mBlockTagSet == null || TextUtils.isEmpty(str) || !mBlockTagSet.contains(str)) {
                    return true;
                }
                return false;
            }

            public static b createInstance(String str, Context context) {
                if (context == null) {
                    return null;
                }
                return createInstance(str, new a.C1289a(context).a());
            }

            public static List<String> getALogFiles(long j2, long j3) {
                ArrayList arrayList = new ArrayList();
                try {
                    for (File file : c.a(null, null, j2 * 1000, j3 * 1000)) {
                        arrayList.add(file.getAbsolutePath());
                    }
                } catch (Exception unused) {
                }
                return arrayList;
            }

            public static void d(String str, String str2) {
                if (checkPrioAndTag(3, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(1, str, str2);
                        } else {
                            alog.a(1, str, str2);
                        }
                    } else {
                        postAsyncLog(3, str, str2);
                    }
                }
            }

            public static void e(String str, String str2) {
                if (checkPrioAndTag(6, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(4, str, str2);
                        } else {
                            alog.a(4, str, str2);
                        }
                    } else {
                        postAsyncLog(6, str, str2);
                    }
                }
            }

            public static void i(String str, String str2) {
                if (checkPrioAndTag(4, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(2, str, str2);
                        } else {
                            alog.a(2, str, str2);
                        }
                    } else {
                        postAsyncLog(4, str, str2);
                    }
                }
            }

            public static void v(String str, String str2) {
                if (checkPrioAndTag(2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(0, str, str2);
                        } else {
                            alog.a(0, str, str2);
                        }
                    } else {
                        postAsyncLog(2, str, str2);
                    }
                }
            }

            public static void w(String str, String str2) {
                if (checkPrioAndTag(5, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(3, str, str2);
                        } else {
                            alog.a(3, str, str2);
                        }
                    } else {
                        postAsyncLog(5, str, str2);
                    }
                }
            }

            public static void removeLegacyFiles(String str, String str2) {
                File[] listFiles;
                File[] listFiles2;
                File file = new File(str);
                if (file.exists() && (listFiles2 = file.listFiles(new FilenameFilter() {
                    /* class com.ss.android.agilelogger.ALog.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(36524);
                    }

                    public final boolean accept(File file, String str) {
                        return str.startsWith(".logCache_");
                    }
                })) != null) {
                    for (File file2 : listFiles2) {
                        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2);
                    }
                }
                File file3 = new File(str2);
                if (file3.exists() && (listFiles = file3.listFiles(new FilenameFilter() {
                    /* class com.ss.android.agilelogger.ALog.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(36525);
                    }

                    public final boolean accept(File file, String str) {
                        if (str.endsWith(".hoting")) {
                            return true;
                        }
                        if (!str.endsWith(".hot") || str.endsWith(".alog.hot")) {
                            return false;
                        }
                        return true;
                    }
                })) != null) {
                    for (File file4 : listFiles) {
                        com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_storage_FileLancet_delete(file4);
                    }
                }
            }

            public static b createInstance(String str, a aVar) {
                String str2;
                String str3;
                Alog.c cVar;
                Alog.f fVar;
                Alog.a aVar2;
                if (aVar == null) {
                    return null;
                }
                if (!sInitSuccess) {
                    try {
                        Alog.a(new d());
                    } catch (Throwable unused) {
                        return null;
                    }
                }
                Alog.b a2 = new Alog.b(aVar.f59082a).a(str);
                a2.f6746a = level2AlogCoreLevel(aVar.f59090i);
                a2.f6747b = sDebug;
                a aVar3 = sConfig;
                if (aVar3 != null) {
                    str2 = aVar3.f59087f;
                } else {
                    str2 = aVar.f59087f;
                }
                a2.f6748c = str2;
                a2.f6749d = aVar.f59085d;
                a2.f6750e = aVar.f59084c;
                a2.f6751f = aVar.f59083b;
                a aVar4 = sConfig;
                if (aVar4 != null) {
                    str3 = aVar4.f59086e;
                } else {
                    str3 = aVar.f59086e;
                }
                a2.f6752g = str3;
                a2.f6753h = 65536;
                a2.f6754i = 196608;
                Alog.b a3 = a2.a(Alog.d.SAFE).a(Alog.g.RAW).a(Alog.e.LEGACY);
                if (aVar.f59088g) {
                    cVar = Alog.c.ZSTD;
                } else {
                    cVar = Alog.c.NONE;
                }
                Alog.b a4 = a3.a(cVar);
                if (aVar.f59089h) {
                    fVar = Alog.f.TEA_16;
                } else {
                    fVar = Alog.f.NONE;
                }
                Alog.b a5 = a4.a(fVar);
                if (aVar.f59089h) {
                    aVar2 = Alog.a.EC_SECP256K1;
                } else {
                    aVar2 = Alog.a.NONE;
                }
                Alog.b a6 = a5.a(aVar2);
                a6.f6755j = aVar.f59091j;
                Alog a7 = a6.a();
                if (a7 == null) {
                    return null;
                }
                sStandaloneInstances.add(new WeakReference<>(a7));
                return new b(a7);
            }

            public static void e(String str, Throwable th) {
                if (checkPrioAndTag(6, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        String a3 = com.ss.android.agilelogger.c.d.a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(4, str, a3);
                        } else {
                            alog.a(4, str, a3);
                        }
                    } else {
                        postAsyncLog(6, str, null, th, null, null);
                    }
                }
            }

            public static void w(String str, Throwable th) {
                if (checkPrioAndTag(5, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        String a3 = com.ss.android.agilelogger.c.d.a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(3, str, a3);
                        } else {
                            alog.a(3, str, a3);
                        }
                    } else {
                        postAsyncLog(5, str, null, th, null, null);
                    }
                }
            }

            public static void statcktrace(int i2, String str, StackTraceElement[] stackTraceElementArr) {
                stacktrace(i2, str, stackTraceElementArr);
            }

            private static void postAsyncLog(int i2, String str, String str2) {
                postAsyncLog(i2, str, str2, null, null, null);
            }

            public static void bundle(int i2, String str, Bundle bundle) {
                if (checkPrioAndTag(i2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                        String a3 = com.ss.android.agilelogger.c.b.a(b.a.BUNDLE, bundle);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, a3);
                        } else {
                            alog.a(level2AlogCoreLevel, str, a3);
                        }
                    } else {
                        postAsyncLog(i2, str, null, null, b.a.BUNDLE, bundle);
                    }
                }
            }

            public static void header(int i2, String str, String str2) {
                if (checkPrioAndTag(i2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                        String a3 = com.ss.android.agilelogger.c.b.a(b.a.BORDER, str2);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, a3);
                        } else {
                            alog.a(level2AlogCoreLevel, str, a3);
                        }
                    } else {
                        postAsyncLog(i2, str, str2, null, b.a.BORDER, null);
                    }
                }
            }

            public static void intent(int i2, String str, Intent intent) {
                if (checkPrioAndTag(i2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                        String a3 = com.ss.android.agilelogger.c.b.a(b.a.INTENT, intent);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, a3);
                        } else {
                            alog.a(level2AlogCoreLevel, str, a3);
                        }
                    } else {
                        postAsyncLog(i2, str, null, null, b.a.INTENT, intent);
                    }
                }
            }

            public static void json(int i2, String str, String str2) {
                if (checkPrioAndTag(i2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                        String a3 = com.ss.android.agilelogger.c.b.a(b.a.JSON, str2);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, a3);
                        } else {
                            alog.a(level2AlogCoreLevel, str, a3);
                        }
                    } else {
                        postAsyncLog(i2, str, str2, null, b.a.JSON, null);
                    }
                }
            }

            public static void stacktrace(int i2, String str, StackTraceElement[] stackTraceElementArr) {
                if (checkPrioAndTag(i2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                        String a3 = com.ss.android.agilelogger.c.b.a(b.a.STACKTRACE, stackTraceElementArr);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, a3);
                        } else {
                            alog.a(level2AlogCoreLevel, str, a3);
                        }
                    } else {
                        postAsyncLog(i2, str, null, null, b.a.STACKTRACE, stackTraceElementArr);
                    }
                }
            }

            public static void thread(int i2, String str, Thread thread) {
                if (checkPrioAndTag(i2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                        String a3 = com.ss.android.agilelogger.c.b.a(b.a.THREAD, thread);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, a3);
                        } else {
                            alog.a(level2AlogCoreLevel, str, a3);
                        }
                    } else {
                        postAsyncLog(i2, str, null, null, b.a.THREAD, thread);
                    }
                }
            }

            public static void throwable(int i2, String str, Throwable th) {
                if (checkPrioAndTag(i2, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                        String a3 = com.ss.android.agilelogger.c.b.a(b.a.THROWABLE, th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, a3);
                        } else {
                            alog.a(level2AlogCoreLevel, str, a3);
                        }
                    } else {
                        postAsyncLog(i2, str, null, null, b.a.THROWABLE, th);
                    }
                }
            }

            public static void e(String str, String str2, Throwable th) {
                if (checkPrioAndTag(6, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        String str3 = str2 + "\n" + com.ss.android.agilelogger.c.d.a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(4, str, str3);
                        } else {
                            alog.a(4, str, str3);
                        }
                    } else {
                        postAsyncLog(6, str, str2, th, null, null);
                    }
                }
            }

            public static void w(String str, String str2, Throwable th) {
                if (checkPrioAndTag(5, str)) {
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        String str3 = str2 + "\n" + com.ss.android.agilelogger.c.d.a(th);
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(3, str, str3);
                        } else {
                            alog.a(3, str, str3);
                        }
                    } else {
                        postAsyncLog(5, str, str2, th, null, null);
                    }
                }
            }

            public static void removeObsoleteInstance(String str, Context context, boolean z) {
                String absolutePath;
                String b2;
                String b3 = f.b();
                if (b3 != null && !b3.contains(":")) {
                    if (!z) {
                        b3 = b3 + '-';
                    }
                    a aVar = sConfig;
                    if (aVar != null) {
                        absolutePath = aVar.f59087f;
                        b2 = sConfig.f59086e;
                    } else {
                        absolutePath = com.ss.android.agilelogger.c.a.a(context).getAbsolutePath();
                        b2 = com.ss.android.agilelogger.c.a.b(context);
                    }
                    File file = new File(absolutePath);
                    if (file.exists() && file.isDirectory()) {
                        String str2 = "__" + str + ".alog.hot";
                        File[] listFiles = file.listFiles();
                        for (File file2 : listFiles) {
                            String name = file2.getName();
                            if (name != null && name.endsWith(str2) && name.contains(b3)) {
                                com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2);
                            }
                        }
                        File file3 = new File(b2);
                        if (file3.exists() && file3.isDirectory()) {
                            String concat = "__".concat(String.valueOf(str));
                            File[] listFiles2 = file3.listFiles();
                            for (File file4 : listFiles2) {
                                String name2 = file4.getName();
                                if (name2 != null && name2.contains(concat) && name2.contains(b3)) {
                                    com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_storage_FileLancet_delete(file4);
                                }
                            }
                        }
                    }
                }
            }

            public static List<String> getALogFiles(String str, String str2, long j2, long j3) {
                ArrayList arrayList = new ArrayList();
                try {
                    for (File file : c.a(str, str2, j2 * 1000, j3 * 1000)) {
                        arrayList.add(file.getAbsolutePath());
                    }
                } catch (Exception unused) {
                }
                return arrayList;
            }

            public static void println(int i2, String str, Object obj, b.a aVar) {
                String str2;
                if (checkPrioAndTag(i2, str)) {
                    int level2AlogCoreLevel = level2AlogCoreLevel(i2);
                    switch (AnonymousClass7.f59068a[aVar.ordinal()]) {
                        case 1:
                            str2 = (String) obj;
                            break;
                        case 2:
                            str2 = com.ss.android.agilelogger.c.d.a((Throwable) obj);
                            break;
                        case 3:
                            str2 = com.ss.android.agilelogger.c.b.a(b.a.BORDER, (String) obj);
                            break;
                        case 4:
                            str2 = com.ss.android.agilelogger.c.b.a(b.a.JSON, (String) obj);
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            str2 = com.ss.android.agilelogger.c.b.a(b.a.BUNDLE, (Bundle) obj);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            str2 = com.ss.android.agilelogger.c.b.a(b.a.INTENT, (Intent) obj);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            str2 = com.ss.android.agilelogger.c.b.a(b.a.THROWABLE, (Throwable) obj);
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            str2 = com.ss.android.agilelogger.c.b.a(b.a.THREAD, (Thread) obj);
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            str2 = com.ss.android.agilelogger.c.b.a(b.a.STACKTRACE, (StackTraceElement[]) obj);
                            break;
                        default:
                            str2 = "";
                            break;
                    }
                    boolean a2 = f.a();
                    if (!a2 || sAsyncHandler == null) {
                        Alog alog = mainThreadRef;
                        if (alog == null || !a2) {
                            c.a(level2AlogCoreLevel, str, str2);
                        } else {
                            alog.a(level2AlogCoreLevel, str, str2);
                        }
                    } else {
                        postAsyncLog(i2, str, str2);
                    }
                }
            }

            private static void postAsyncLog(int i2, String str, String str2, Throwable th, b.a aVar, Object obj) {
                initMainThreadIdIfNeeded();
                a a2 = a.a();
                a2.f59072d = i2;
                a2.f59073e = str;
                a2.f59074f = str2;
                a2.f59075g = th;
                a2.f59076h = aVar;
                a2.f59077i = obj;
                a2.f59078j = sMainThreadId;
                a2.f59079k = System.currentTimeMillis();
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = a2;
                sAsyncHandler.sendMessage(obtain);
            }
        }
