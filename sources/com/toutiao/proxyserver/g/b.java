package com.toutiao.proxyserver.g;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.toutiao.proxyserver.c.a;
import com.toutiao.proxyserver.c.c;
import com.toutiao.proxyserver.net.d;
import com.toutiao.proxyserver.net.e;
import com.toutiao.proxyserver.u;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f154859a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f154860b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private static final ExecutorService f154861c = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.RandomAccessFile r1) {
        /*
            if (r1 == 0) goto L_0x000c
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ all -> 0x0009 }
            r0.sync()     // Catch:{ all -> 0x0009 }
        L_0x0009:
            r1.close()     // Catch:{ all -> 0x000c }
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.g.b.a(java.io.RandomAccessFile):void");
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.startsWith("http://") || str.startsWith("https://");
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        r1 = com.toutiao.proxyserver.u.f154992g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.toutiao.proxyserver.net.e r8, boolean r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.g.b.a(com.toutiao.proxyserver.net.e, boolean, boolean):void");
    }

    private static JSONObject a(e eVar, d dVar) {
        a a2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Range", dVar.a("Range"));
            jSONObject.put("Vpwp-Type", dVar.a("Vpwp-Type"));
            jSONObject.put("Vpwp-Mp-Range", dVar.a("Vpwp-Mp-Range"));
            jSONObject.put("Content-Range", eVar.a("Content-Range"));
            jSONObject.put("Content-Type", eVar.a("Content-Type"));
            jSONObject.put("Content-Length", eVar.a("Content-Length"));
            jSONObject.put("url", eVar.f154944a.f154932a);
            String a3 = dVar.a("Vpwp-Key");
            jSONObject.put("Vpwp-Key", a3);
            int i2 = 0;
            if (a(dVar.a("Vpwp-Flag"), 0) == 1) {
                i2 = 1;
            }
            c cVar = u.f154989d;
            if (!(cVar == null || (a2 = cVar.a(a3, i2)) == null)) {
                jSONObject.put("DB-Content-Type", a2.f154803b);
                jSONObject.put("DB-Content-Length", a2.f154804c);
                jSONObject.put("DB-extra", a2.f154806e);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static void a(Runnable runnable) {
        if (b()) {
            f154861c.execute(runnable);
            com.toutiao.proxyserver.e.c.c("TAG_PROXY_UTIL", "invoke in pool thread", null);
            return;
        }
        runnable.run();
        com.toutiao.proxyserver.e.c.c("TAG_PROXY_UTIL", "invoke calling thread", null);
    }

    public static void a(List<com.toutiao.proxyserver.net.c> list) {
        if (list != null) {
            com.toutiao.proxyserver.e.c.b("TAG_PROXY_PRE_FILTER", list.toString(), null);
            a(list, "Host");
            a(list, "Keep-Alive");
            List<com.toutiao.proxyserver.net.c> b2 = b(list, "Connection");
            if (b2 != null && !b2.isEmpty()) {
                for (com.toutiao.proxyserver.net.c cVar : b2) {
                    List<String> f2 = f(cVar.f154931b);
                    if (f2 != null) {
                        for (String str : f2) {
                            a(list, str);
                        }
                    }
                }
            }
            a(list, "Connection");
            List<com.toutiao.proxyserver.net.c> b3 = b(list, "Proxy-Connection");
            if (b3 != null && !b3.isEmpty()) {
                for (com.toutiao.proxyserver.net.c cVar2 : b3) {
                    List<String> f3 = f(cVar2.f154931b);
                    if (f3 != null) {
                        for (String str2 : f3) {
                            a(list, str2);
                        }
                    }
                }
            }
            a(list, "Proxy-Connection");
            com.toutiao.proxyserver.e.c.b("TAG_PROXY_PRE_FILTER", list.toString(), null);
        }
    }

    private static void a(List<com.toutiao.proxyserver.net.c> list, String str) {
        Iterator<com.toutiao.proxyserver.net.c> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().f154930a.equalsIgnoreCase(str)) {
                it.remove();
            }
        }
    }

    public static int a() {
        int i2 = Build.VERSION.SDK_INT;
        return Math.max(Runtime.getRuntime().availableProcessors(), 1);
    }

    private static boolean b() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103140);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void b(Runnable runnable) {
        if (b()) {
            runnable.run();
        } else {
            f154860b.post(runnable);
        }
    }

    private static boolean d(String str) {
        if (str == null || !str.startsWith("text/")) {
            return false;
        }
        return true;
    }

    private static boolean e(String str) {
        if (str == null || !str.startsWith("audio/")) {
            return false;
        }
        return true;
    }

    private static boolean c(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/") || "application/octet-stream".equals(str) || "binary/octet-stream".equals(str)) {
            return true;
        }
        return false;
    }

    public static List<String> a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (a(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static String b(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = null;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt > 31 ? charAt < 127 : charAt == '\t') {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else if (sb == null) {
                sb = new StringBuilder(str.substring(0, i2));
            }
        }
        if (sb == null) {
            return str;
        }
        return sb.toString();
    }

    private static List<String> f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                String trim = str2.trim();
                if (!TextUtils.isEmpty(trim)) {
                    arrayList.add(trim);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static int a(e eVar) {
        int lastIndexOf;
        if (eVar == null) {
            return -1;
        }
        if (eVar.f154945b == 200) {
            return a(eVar.a("Content-Length", null), -1);
        }
        if (eVar.f154945b == 206) {
            String a2 = eVar.a("Content-Range", null);
            if (!TextUtils.isEmpty(a2) && (lastIndexOf = a2.lastIndexOf("/")) >= 0 && lastIndexOf < a2.length() - 1) {
                return a(a2.substring(lastIndexOf + 1), -1);
            }
        }
        return -1;
    }

    private static String b(List<com.toutiao.proxyserver.net.c> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (com.toutiao.proxyserver.net.c cVar : list) {
            sb.append(cVar.f154930a).append(": ").append(cVar.f154931b).append("\r\n");
        }
        return sb.toString();
    }

    private static String a(InputStream inputStream) {
        MethodCollector.i(9902);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                } else {
                    try {
                        break;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                inputStream.close();
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                MethodCollector.o(9902);
                throw th;
            }
        }
        inputStream.close();
        String sb2 = sb.toString();
        MethodCollector.o(9902);
        return sb2;
    }

    public static int a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    private static List<com.toutiao.proxyserver.net.c> b(List<com.toutiao.proxyserver.net.c> list, String str) {
        ArrayList arrayList = null;
        for (com.toutiao.proxyserver.net.c cVar : list) {
            if (cVar.f154930a.equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public static String a(a aVar, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\n");
        sb.append("Content-Type: ").append(aVar.f154803b).append("\r\n");
        if (i2 <= 0) {
            sb.append("Content-Length: ").append(aVar.f154804c).append("\r\n");
        } else {
            sb.append("Content-Range: bytes ").append(i2).append("-").append(aVar.f154804c - 1).append("/").append(aVar.f154804c).append("\r\n");
            sb.append("Content-Length: ").append(aVar.f154804c - i2).append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        com.toutiao.proxyserver.e.c.b("TAG_PROXY_WRITE_TO_MP", sb2, null);
        return sb2;
    }

    public static String a(e eVar, int i2) {
        int a2;
        if (eVar == null || !eVar.a()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(eVar.b().toUpperCase()).append(' ').append(eVar.f154945b).append(' ').append(eVar.c()).append("\r\n");
        com.toutiao.proxyserver.e.c.b("TAG_PROXY_headers", eVar.b().toUpperCase() + " " + eVar.f154945b + " " + eVar.c(), null);
        List<com.toutiao.proxyserver.net.c> list = eVar.f154946c;
        a(list);
        boolean z = true;
        for (com.toutiao.proxyserver.net.c cVar : list) {
            String str = cVar.f154930a;
            String str2 = cVar.f154931b;
            sb.append(str).append(": ").append(str2).append("\r\n");
            if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                z = false;
            }
        }
        if (z && (a2 = a(eVar)) > 0) {
            sb.append("Content-Range: bytes ").append(Math.max(i2, 0)).append("-").append(a2 - 1).append("/").append(a2).append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        com.toutiao.proxyserver.e.c.b("TAG_PROXY_WRITE_TO_MP", sb2, null);
        return sb2;
    }

    public static a a(e eVar, c cVar, String str, int i2) {
        String str2;
        a a2 = cVar.a(str, i2);
        if (a2 == null) {
            int a3 = a(eVar);
            String a4 = eVar.a("Content-Type", null);
            if (a3 > 0 && !TextUtils.isEmpty(a4)) {
                String str3 = eVar.f154944a.f154932a;
                String b2 = b(eVar.f154944a.f154934c);
                String b3 = b(eVar.f154946c);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str3);
                    jSONObject.put("requestHeaders", b2);
                    jSONObject.put("responseHeaders", b3);
                    str2 = jSONObject.toString();
                } catch (Throwable unused) {
                    str2 = "";
                }
                a2 = new a(str, a4, a3, i2, str2);
                Map<String, a> map = cVar.f154808a.get(a2.f154805d);
                if (map != null) {
                    map.put(a2.f154802a, a2);
                }
                cVar.f154810c.execute(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0065: INVOKE  
                      (wrap: java.util.concurrent.Executor : 0x005e: IGET  (r1v4 java.util.concurrent.Executor) = (r10v0 'cVar' com.toutiao.proxyserver.c.c) com.toutiao.proxyserver.c.c.c java.util.concurrent.Executor)
                      (wrap: com.toutiao.proxyserver.c.c$1 : 0x0062: CONSTRUCTOR  (r0v7 com.toutiao.proxyserver.c.c$1) = (r10v0 'cVar' com.toutiao.proxyserver.c.c), (r4v3 'a2' com.toutiao.proxyserver.c.a) call: com.toutiao.proxyserver.c.c.1.<init>(com.toutiao.proxyserver.c.c, com.toutiao.proxyserver.c.a):void type: CONSTRUCTOR)
                     type: INTERFACE call: java.util.concurrent.Executor.execute(java.lang.Runnable):void in method: com.toutiao.proxyserver.g.b.a(com.toutiao.proxyserver.net.e, com.toutiao.proxyserver.c.c, java.lang.String, int):com.toutiao.proxyserver.c.a, file: classes4.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r0v7 com.toutiao.proxyserver.c.c$1) = (r10v0 'cVar' com.toutiao.proxyserver.c.c), (r4v3 'a2' com.toutiao.proxyserver.c.a) call: com.toutiao.proxyserver.c.c.1.<init>(com.toutiao.proxyserver.c.c, com.toutiao.proxyserver.c.a):void type: CONSTRUCTOR in method: com.toutiao.proxyserver.g.b.a(com.toutiao.proxyserver.net.e, com.toutiao.proxyserver.c.c, java.lang.String, int):com.toutiao.proxyserver.c.a, file: classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                    	... 24 more
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.toutiao.proxyserver.c.c, state: GENERATED_AND_UNLOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                    	... 30 more
                    */
                /*
                // Method dump skipped, instructions count: 105
                */
                throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.g.b.a(com.toutiao.proxyserver.net.e, com.toutiao.proxyserver.c.c, java.lang.String, int):com.toutiao.proxyserver.c.a");
            }
        }
