package com.bytedance.crash.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.d;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.entity.g;
import com.bytedance.crash.m;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {
    static {
        Covode.recordClassIndex(16385);
    }

    public static void a(File file, String str, boolean z) {
        Throwable th;
        MethodCollector.i(9084);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(9084);
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                m.a(fileOutputStream2);
                MethodCollector.o(9084);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                m.a(fileOutputStream);
                MethodCollector.o(9084);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m.a(fileOutputStream);
            MethodCollector.o(9084);
            throw th;
        }
    }

    public static void a(File file, JSONObject jSONObject) {
        if (jSONObject != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, false));
                try {
                    o.a(jSONObject, bufferedWriter2);
                    m.a(bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    m.a(bufferedWriter);
                }
            } catch (Throwable unused2) {
                m.a(bufferedWriter);
            }
        }
    }

    public static void a(File file, JSONArray jSONArray) {
        if (jSONArray != null) {
            file.getParentFile().mkdirs();
            BufferedWriter bufferedWriter = null;
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file, false));
                try {
                    o.a(jSONArray, bufferedWriter2);
                    m.a(bufferedWriter2);
                } catch (Throwable unused) {
                    bufferedWriter = bufferedWriter2;
                    m.a(bufferedWriter);
                }
            } catch (Throwable unused2) {
                m.a(bufferedWriter);
            }
        }
    }

    public static boolean a(File file) {
        boolean a2;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return g(file);
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int i2 = 0; i2 < listFiles.length; i2++) {
                if (!listFiles[i2].isFile()) {
                    a2 = a(listFiles[i2]);
                } else if (listFiles[i2].canWrite()) {
                    a2 = g(listFiles[i2]);
                } else {
                    z = false;
                }
                z &= a2;
            }
        }
        return z & g(file);
    }

    public static JSONArray a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), -1);
    }

    public static boolean a(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|18|20|21|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = 9956(0x26e4, float:1.3951E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            if (r7 == 0) goto L_0x000d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0011
        L_0x000d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x0011:
            r1 = 0
            java.util.Properties r4 = new java.util.Properties     // Catch:{ IOException -> 0x004d }
            r4.<init>()     // Catch:{ IOException -> 0x004d }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004d }
            r3.<init>(r6)     // Catch:{ IOException -> 0x004d }
            java.util.Set r0 = r7.entrySet()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
        L_0x0024:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            r4.setProperty(r1, r0)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            goto L_0x0024
        L_0x0040:
            java.lang.String r0 = "no"
            r4.store(r3, r0)     // Catch:{ IOException -> 0x004c, all -> 0x0049 }
            com.bytedance.crash.util.m.a(r3)
            goto L_0x0055
        L_0x0049:
            r0 = move-exception
            r1 = r3
            goto L_0x005a
        L_0x004c:
            r1 = r3
        L_0x004d:
            com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.m.f27730g     // Catch:{ all -> 0x0059 }
            r0.isDebugMode()     // Catch:{ all -> 0x0059 }
            com.bytedance.crash.util.m.a(r1)
        L_0x0055:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            com.bytedance.crash.util.m.a(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.j.a(java.io.File, java.util.Map):void");
    }

    public static void a(File file, File file2, int i2, boolean z) {
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.i(10117);
        if (file == null || file2 == null || !file.exists() || (file2.exists() && !z)) {
            MethodCollector.o(10117);
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, z);
                try {
                    byte[] bArr = new byte[8192];
                    int i3 = 0;
                    do {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        i3 += read;
                    } while (i3 < i2);
                    m.a(fileInputStream2);
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    m.a(fileInputStream);
                    m.a(fileOutputStream);
                    MethodCollector.o(10117);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    m.a(fileInputStream);
                    m.a(fileOutputStream);
                    MethodCollector.o(10117);
                    throw th;
                }
            } catch (Exception unused2) {
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                m.a(fileInputStream);
                m.a(fileOutputStream);
                MethodCollector.o(10117);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                m.a(fileInputStream);
                m.a(fileOutputStream);
                MethodCollector.o(10117);
                throw th;
            }
        } catch (Exception unused3) {
            fileOutputStream = null;
            m.a(fileInputStream);
            m.a(fileOutputStream);
            MethodCollector.o(10117);
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            m.a(fileInputStream);
            m.a(fileOutputStream);
            MethodCollector.o(10117);
            throw th;
        }
        m.a(fileOutputStream);
        MethodCollector.o(10117);
    }

    public static void a(OutputStream outputStream, b... bVarArr) {
        Throwable th;
        MethodCollector.i(10119);
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (b bVar : bVarArr) {
                    a(zipOutputStream2, bVar);
                }
                m.a(zipOutputStream2);
                MethodCollector.o(10119);
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                m.a(zipOutputStream);
                MethodCollector.o(10119);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m.a(zipOutputStream);
            MethodCollector.o(10119);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, b bVar) {
        if (bVar != null) {
            if (bVar.f27999a != null || bVar.f28000b == null) {
                a(zipOutputStream, bVar.f27999a, bVar.f28001c);
                return;
            }
            for (File file : bVar.f28000b) {
                a(zipOutputStream, file, bVar.f28001c);
            }
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, boolean z) {
        File[] fileArr;
        if (file != null && file.exists()) {
            if (z || !file.isDirectory()) {
                if (file.isDirectory()) {
                    fileArr = file.listFiles();
                    if (fileArr == null) {
                        return;
                    }
                } else {
                    fileArr = new File[]{file};
                }
                for (File file2 : fileArr) {
                    a(zipOutputStream, file2, file2.getName());
                }
                return;
            }
            a(zipOutputStream, file, file.getName());
        }
    }

    public static void a(ZipOutputStream zipOutputStream, File file, String str) {
        Throwable th;
        MethodCollector.i(10122);
        if (file == null || !file.exists()) {
            MethodCollector.o(10122);
            return;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                MethodCollector.o(10122);
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String str2 = str.length() == 0 ? "" : str + "/";
            for (File file2 : listFiles) {
                a(zipOutputStream, file2, str2 + file2.getName());
            }
            MethodCollector.o(10122);
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (-1 != read) {
                        zipOutputStream.write(bArr, 0, read);
                    } else {
                        m.a(fileInputStream2);
                        MethodCollector.o(10122);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                m.a(fileInputStream);
                MethodCollector.o(10122);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m.a(fileInputStream);
            MethodCollector.o(10122);
            throw th;
        }
    }

    public static void a(File file, File file2) {
        a(file, file2, Integer.MAX_VALUE, false);
    }

    public static class a implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        private String f27998a;

        static {
            Covode.recordClassIndex(16386);
        }

        public a(String str) {
            this.f27998a = str;
        }

        public final boolean accept(File file, String str) {
            if (!str.equals(this.f27998a)) {
                return true;
            }
            return false;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public File f27999a;

        /* renamed from: b  reason: collision with root package name */
        public File[] f28000b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f28001c;

        static {
            Covode.recordClassIndex(16387);
        }

        public b(File file) {
            this.f27999a = file;
            this.f28001c = true;
        }

        public b(File[] fileArr, boolean z) {
            this.f28000b = fileArr;
            this.f28001c = z;
        }
    }

    public static boolean b(File file) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            return true;
        }
        return false;
    }

    public static int d(File file) {
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            return NativeTools.a().d(file2.getAbsolutePath());
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
            return -1;
        }
    }

    public static g b(String str) {
        try {
            String a2 = a(str, "\n");
            if (a2 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a2);
            g gVar = new g();
            gVar.f27577a = jSONObject.optString("url");
            gVar.f27578b = jSONObject.optJSONObject("body");
            gVar.f27579c = jSONObject.optString("dump_file");
            gVar.f27580d = jSONObject.optBoolean("encrypt", false);
            return gVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean e(File file) {
        if (!file.isFile()) {
            file = new File(file, "lock");
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int d2 = NativeTools.a().d(file.getAbsolutePath());
            if (d2 <= 0) {
                return true;
            }
            NativeTools.a().b(d2);
            return false;
        } catch (Throwable th) {
            d.a("NPTH_CATCH", th);
            return false;
        }
    }

    public static void f(File file) {
        try {
            file.createNewFile();
        } catch (Throwable unused) {
            m.f27730g.isDebugMode();
            v.a("err create file " + file.getAbsolutePath());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:13|14|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        com.bytedance.crash.m.f27730g.isDebugMode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        com.bytedance.crash.util.m.a(r4);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(9954);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> c(java.io.File r8) {
        /*
            r7 = 9954(0x26e2, float:1.3949E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r7)
            r6 = 0
            java.util.Properties r5 = new java.util.Properties     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r5.<init>()     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r4.<init>(r8)     // Catch:{ IOException -> 0x003d, all -> 0x003b }
            r5.load(r4)     // Catch:{ IOException -> 0x003e }
            java.util.Set r0 = r5.stringPropertyNames()     // Catch:{ IOException -> 0x003e }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x003e }
            r3.<init>()     // Catch:{ IOException -> 0x003e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ IOException -> 0x003e }
        L_0x0020:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x003e }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r2.next()     // Catch:{ IOException -> 0x003e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x003e }
            java.lang.String r0 = r5.getProperty(r1)     // Catch:{ IOException -> 0x003e }
            r3.put(r1, r0)     // Catch:{ IOException -> 0x003e }
            goto L_0x0020
        L_0x0034:
            com.bytedance.crash.util.m.a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
            return r3
        L_0x003b:
            r0 = move-exception
            goto L_0x004c
        L_0x003d:
            r4 = r6
        L_0x003e:
            com.bytedance.crash.runtime.ConfigManager r0 = com.bytedance.crash.m.f27730g     // Catch:{ all -> 0x004a }
            r0.isDebugMode()     // Catch:{ all -> 0x004a }
            com.bytedance.crash.util.m.a(r4)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
            return r6
        L_0x004a:
            r0 = move-exception
            r6 = r4
        L_0x004c:
            com.bytedance.crash.util.m.a(r6)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.j.c(java.io.File):java.util.Map");
    }

    private static boolean g(File file) {
        MethodCollector.i(9276);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(9276);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9276);
        return delete;
    }

    public static String a(File file, String str) {
        return a(file, str, -1);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(new File(str), str2);
    }

    public static JSONArray b(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    public static int a(com.bytedance.crash.entity.b bVar, File file) {
        int i2 = -1;
        for (int i3 = 0; i3 < 6; i3++) {
            File file2 = new File(file, file.getName() + ".".concat(String.valueOf(i3)));
            if (file2.exists()) {
                try {
                    bVar.c(new JSONObject(a(file2.getAbsolutePath(), "\n")));
                    bVar.a("succ_step", Integer.valueOf(i3));
                    i2 = i3;
                } catch (Throwable unused) {
                }
            }
        }
        bVar.a("succ_step", String.valueOf(i2));
        return i2;
    }

    public static void b(File file, File file2) {
        if (file.exists()) {
            if (file.isFile()) {
                if (file2.exists()) {
                    if (!file2.isDirectory()) {
                        g(file2);
                    } else {
                        return;
                    }
                }
                a(file, file2, Integer.MAX_VALUE, false);
                return;
            }
            if (!file2.exists()) {
                file2.mkdirs();
            } else if (file2.isFile()) {
                g(file2);
            } else if (!file2.getName().equals(file.getName())) {
                return;
            }
            String[] list = file.list();
            for (String str : list) {
                b(new File(file, str), new File(file2, str));
            }
        }
    }

    public static g a(File file, CrashType crashType) {
        String javaCrashUploadUrl;
        com.bytedance.crash.entity.b a2 = a(new File(file, "logEventStack"), file.getName().contains("oom"));
        a(a2, file);
        JSONObject optJSONObject = a2.f27557a.optJSONObject("header");
        com.bytedance.crash.entity.b a3 = Header.a(a2.f27557a.optString("process_name"), m.f27724a, a2.f27557a.optLong("app_start_time", 0), a2.f27557a.optLong("crash_time", 0));
        if (optJSONObject == null) {
            a2.a(a3.a().f27553a);
        } else {
            n.a(optJSONObject, a3.a().f27553a);
        }
        n.a(a2.b(), a3.b());
        String name = file.getName();
        String substring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject optJSONObject2 = a2.f27557a.optJSONObject("header");
        if (optJSONObject2.optString("unique_key", null) == null) {
            try {
                optJSONObject2.put("unique_key", "android_" + m.b().a() + "_" + substring + "_" + CrashType.LAUNCH);
            } catch (Throwable unused) {
            }
        }
        g gVar = new g();
        if (crashType == CrashType.LAUNCH) {
            javaCrashUploadUrl = m.f27730g.getLaunchCrashUploadUrl();
        } else {
            javaCrashUploadUrl = m.f27730g.getJavaCrashUploadUrl();
        }
        gVar.f27577a = javaCrashUploadUrl;
        gVar.f27578b = a2.f27557a;
        gVar.f27580d = true;
        return gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0116, code lost:
        if (r16 != false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0133, code lost:
        r3 = "InvalidStack.NoStackAvailable: Not OOM.\n";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r16 != false) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.crash.entity.b a(java.io.File r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 309
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.util.j.a(java.io.File, boolean):com.bytedance.crash.entity.b");
    }

    public static JSONArray a(File file, long j2) {
        Throwable th;
        MethodCollector.i(9780);
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j2 > 0) {
                try {
                    bufferedReader2.skip(j2);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    m.a(bufferedReader);
                    MethodCollector.o(9780);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    jSONArray.put(readLine);
                } else {
                    m.a(bufferedReader2);
                    MethodCollector.o(9780);
                    return jSONArray;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            m.a(bufferedReader);
            MethodCollector.o(9780);
            throw th;
        }
    }

    public static String a(File file, String str, long j2) {
        Throwable th;
        MethodCollector.i(9609);
        if (file == null || !file.exists()) {
            MethodCollector.o(9609);
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j2 > 0) {
                try {
                    bufferedReader2.skip(j2);
                    bufferedReader2.readLine();
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    m.a(bufferedReader);
                    MethodCollector.o(9609);
                    throw th;
                }
            }
            while (true) {
                String readLine = bufferedReader2.readLine();
                if (readLine != null) {
                    if (!(sb.length() == 0 || str == null)) {
                        sb.append(str);
                    }
                    sb.append(readLine);
                } else {
                    m.a(bufferedReader2);
                    String sb2 = sb.toString();
                    MethodCollector.o(9609);
                    return sb2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            m.a(bufferedReader);
            MethodCollector.o(9609);
            throw th;
        }
    }

    public static String a(File file, String str, String str2, JSONObject jSONObject) {
        return a(file, str, str2, jSONObject, true);
    }

    private static String a(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            jSONObject2.put("dump_file", "");
            jSONObject2.put("encrypt", true);
            a(file2, jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return file2.getAbsolutePath();
    }
}
