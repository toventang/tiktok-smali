package com.bytedance.crash.j;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.d;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.nativecrash.c;
import com.bytedance.crash.nativecrash.e;
import com.bytedance.crash.runtime.g;
import com.bytedance.crash.runtime.m;
import com.bytedance.crash.runtime.n;
import com.bytedance.crash.runtime.o;
import com.bytedance.crash.util.NativeTools;
import com.bytedance.crash.util.ac;
import com.bytedance.crash.util.j;
import com.bytedance.crash.util.r;
import com.bytedance.crash.util.u;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f27618d;

    /* renamed from: j  reason: collision with root package name */
    private static File f27619j;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27620a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, C0590b> f27621b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f27622c;

    /* renamed from: e  reason: collision with root package name */
    private final List<File> f27623e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private int f27624f = -1;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f27625g = new Runnable() {
        /* class com.bytedance.crash.j.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16215);
        }

        public final void run() {
            b.this.e();
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f27626h = new Runnable() {
        /* class com.bytedance.crash.j.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(16216);
        }

        public final void run() {
            b.this.c();
        }
    };

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f27627i = new Runnable() {
        /* class com.bytedance.crash.j.b.AnonymousClass3 */

        /* renamed from: b  reason: collision with root package name */
        private int f27631b = 100;

        static {
            Covode.recordClassIndex(16217);
        }

        public final void run() {
            String valueOf;
            if (!com.bytedance.crash.a.a.a().b() || !u.b(b.this.f27620a)) {
                int i2 = this.f27631b - 1;
                this.f27631b = i2;
                if (i2 > 0) {
                    n.b().a(this, 1000);
                    return;
                }
                return;
            }
            for (C0590b bVar : b.this.f27621b.values()) {
                bVar.n = true;
                if (bVar.f27657k == null && bVar.f27655i != -1 && ((!bVar.f27648b.isEmpty() || !bVar.f27649c.isEmpty()) && !bVar.o)) {
                    bVar.f27657k = new ArrayList<>();
                    String str = "null";
                    for (a aVar : bVar.f27648b) {
                        List<String> a2 = com.bytedance.crash.a.a.a().a(aVar.f27643b, bVar.f27658l);
                        if (a2 != null) {
                            bVar.f27657k.addAll(a2);
                        }
                        if (!CrashType.LAUNCH.getName().equals(str)) {
                            str = aVar.f27645d.getName();
                        }
                    }
                    for (a aVar2 : bVar.f27649c) {
                        List<String> a3 = com.bytedance.crash.a.a.a().a(aVar2.f27643b, bVar.f27658l);
                        if (a3 != null) {
                            bVar.f27657k.addAll(a3);
                        }
                        if (!CrashType.LAUNCH.getName().equals(str)) {
                            str = aVar2.f27645d.getName();
                        }
                    }
                    if (!bVar.o && bVar.n) {
                        String a4 = com.bytedance.crash.a.a.a(bVar.f27657k, bVar.f27658l);
                        String[] strArr = new String[6];
                        boolean z = false;
                        strArr[0] = "check_result";
                        strArr[1] = a4;
                        strArr[2] = "crash_type";
                        strArr[3] = str;
                        strArr[4] = "alog_inited";
                        if (bVar.f27654h == 0) {
                            valueOf = "uncertain";
                        } else {
                            if (bVar.f27654h == 1) {
                                z = true;
                            }
                            valueOf = String.valueOf(z);
                        }
                        strArr[5] = valueOf;
                        m.a("alog_check", strArr);
                    }
                }
                b.this.a(bVar);
            }
            b.this.f27621b = null;
        }
    };

    static {
        Covode.recordClassIndex(16214);
    }

    /* access modifiers changed from: package-private */
    public final void a(HashMap<String, C0590b> hashMap) {
        File[] listFiles = new File(r.h(this.f27620a), "asdawd").listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i2 = 0;
            while (i2 < listFiles.length && i2 < 5) {
                File file = listFiles[i2];
                try {
                    if (!file.isDirectory()) {
                        j.a(file);
                    } else if (file.getName().endsWith("G")) {
                        String name = file.getName();
                        if (hashMap.get(name) == null) {
                            hashMap.put(name, new C0590b(name));
                        }
                    } else {
                        j.a(file);
                    }
                } catch (Throwable th) {
                    d.a("NPTH_CATCH", th);
                    j.a(file);
                }
                i2++;
            }
        }
    }

    private static boolean a(HashMap<String, C0590b> hashMap, File file, String str) {
        if (str.endsWith("G")) {
            String[] split = str.split("_");
            if (split.length < 5) {
                j.a(file);
                return false;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                long parseLong2 = Long.parseLong(split[4]);
                CrashType crashType = null;
                String str2 = split[2];
                String str3 = split[1];
                str3.hashCode();
                switch (str3.hashCode()) {
                    case -1109843021:
                        if (str3.equals("launch")) {
                            crashType = CrashType.LAUNCH;
                            break;
                        }
                        break;
                    case 96741:
                        if (str3.equals("anr")) {
                            crashType = CrashType.ANR;
                            break;
                        }
                        break;
                    case 3254818:
                        if (str3.equals("java")) {
                            crashType = CrashType.JAVA;
                            break;
                        }
                        break;
                }
                C0590b bVar = hashMap.get(str2);
                if (bVar == null) {
                    bVar = new C0590b(str2);
                    hashMap.put(str2, bVar);
                }
                a aVar = new a(file, parseLong, crashType);
                aVar.f27644c = parseLong2;
                if ((bVar.f27650d == null || bVar.f27650d.f27643b > aVar.f27643b) && crashType != null && crashType != CrashType.ANR && !str.contains("ignore")) {
                    bVar.f27650d = aVar;
                }
                bVar.f27648b.add(aVar);
                return true;
            } catch (Throwable unused) {
                j.a(file);
                d.a("NPTH_CATCH", new RuntimeException("err format crashTime:".concat(String.valueOf(str))));
                return false;
            }
        } else {
            j.a(file);
            return false;
        }
    }

    private static boolean a(File file, String str) {
        File[] listFiles = file.listFiles();
        for (File file2 : listFiles) {
            try {
                if (!file2.isDirectory() && file2.getName().startsWith(str) && file2.length() > 0) {
                    f27619j = file2.getAbsoluteFile();
                    return true;
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        }
        return false;
    }

    private boolean a(c cVar, File file, File file2, boolean z) {
        if (!file.exists()) {
            return false;
        }
        if (!file2.exists()) {
            return true;
        }
        File file3 = new File(file2, com.bytedance.crash.m.d());
        if (!file3.exists()) {
            file3.mkdir();
        }
        String path = file.getPath();
        cVar.f27778c = new com.bytedance.crash.nativecrash.a(path);
        cVar.f27777b = path;
        cVar.a(file3);
        if (r.f(this.f27620a).listFiles() == null) {
            throw new NullPointerException("array-length");
        }
        j.a(file, new File(file3, file.getName()));
        JSONObject d2 = cVar.d();
        if (d2 == null || d2.length() == 0) {
            cVar.f();
            return true;
        } else if (!z || d2.length() == 0) {
            return true;
        } else {
            File file4 = new File(file3, "dump.zip");
            e.a();
            if (!e.a(d2, file4, file3)) {
                return true;
            }
            j.a(file);
            if (cVar.f()) {
                return true;
            }
            g.b(file3);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        File[] listFiles = r.e(this.f27620a).listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            c cVar = new c(this.f27620a);
            ArrayList arrayList = new ArrayList();
            a(cVar, r.e(this.f27620a), arrayList);
            File[] listFiles2 = r.f(this.f27620a).listFiles();
            if (listFiles2.length != 0) {
                int i2 = 0;
                while (i2 < listFiles2.length && i2 < 5) {
                    this.f27623e.addAll(arrayList);
                    if (!this.f27623e.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        b(cVar, r.f(this.f27620a), arrayList2);
                        if (arrayList2.size() == 0) {
                            for (int i3 = 0; i3 < this.f27623e.size(); i3++) {
                                a(cVar, this.f27623e.get(i3), r.f(this.f27620a), z);
                            }
                        } else if (arrayList2.size() > 0) {
                            for (int i4 = 0; i4 < this.f27623e.size(); i4++) {
                                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                    if (arrayList2.get(i5).equals(this.f27623e.get(i4).getName())) {
                                        this.f27623e.remove(i4);
                                    }
                                }
                            }
                            if (this.f27623e.size() > 0) {
                                for (int i6 = 0; i6 < this.f27623e.size(); i6++) {
                                    a(cVar, this.f27623e.get(i6), r.f(this.f27620a), z);
                                }
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                a(cVar, arrayList.get(i7), r.f(this.f27620a), z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f27622c = true;
        NativeImpl.c();
        d.b();
    }

    /* renamed from: com.bytedance.crash.j.b$b  reason: collision with other inner class name */
    public static class C0590b {

        /* renamed from: a  reason: collision with root package name */
        String f27647a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f27648b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public List<a> f27649c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        a f27650d;

        /* renamed from: e  reason: collision with root package name */
        a f27651e;

        /* renamed from: f  reason: collision with root package name */
        boolean f27652f;

        /* renamed from: g  reason: collision with root package name */
        int f27653g;

        /* renamed from: h  reason: collision with root package name */
        int f27654h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f27655i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f27656j = -1;

        /* renamed from: k  reason: collision with root package name */
        ArrayList<String> f27657k;

        /* renamed from: l  reason: collision with root package name */
        String f27658l;

        /* renamed from: m  reason: collision with root package name */
        boolean f27659m;
        boolean n = false;
        boolean o = false;
        e.c p;
        String q;
        String r;
        String s;
        Long t = 0L;
        int u = -1;

        static {
            Covode.recordClassIndex(16221);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (!r.a(com.bytedance.crash.m.f27724a, this.f27647a).exists()) {
                this.o = true;
            }
        }

        public final void a(JSONObject jSONObject) {
            e.c cVar = this.p;
            if (cVar != null) {
                cVar.a(jSONObject);
            }
        }

        C0590b(String str) {
            this.f27647a = str;
            String[] split = str.substring(0, str.length() - 1).split("-");
            if (split.length >= 2) {
                try {
                    this.f27655i = Long.decode(split[1]).longValue();
                } catch (Throwable unused) {
                }
            }
            if (split.length >= 3) {
                try {
                    this.f27656j = Integer.decode(split[2]).intValue();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b() {
        try {
            if (this.f27622c) {
                return;
            }
            if (com.bytedance.crash.util.b.b(com.bytedance.crash.m.f27724a)) {
                n.b().a(this.f27626h);
            }
        } catch (Throwable unused) {
        }
    }

    public static b a() {
        MethodCollector.i(12289);
        if (f27618d == null) {
            synchronized (b.class) {
                try {
                    if (f27618d == null) {
                        f27618d = new b(com.bytedance.crash.m.f27724a);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12289);
                    throw th;
                }
            }
        }
        b bVar = f27618d;
        MethodCollector.o(12289);
        return bVar;
    }

    public final void e() {
        if (this.f27622c || com.bytedance.crash.n.f27744h) {
            return;
        }
        if (u.b(this.f27620a)) {
            c();
        } else {
            n.b().a(this.f27625g, 5000);
        }
    }

    private static boolean f() {
        if (com.bytedance.crash.entity.e.a()) {
            return true;
        }
        File d2 = r.d(com.bytedance.crash.m.f27724a);
        if (!d2.exists() || !d2.isDirectory()) {
            d2.mkdirs();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (a(d2, "record")) {
            try {
                long parseLong = Long.parseLong(j.a(f27619j, "\n"));
                if (currentTimeMillis > parseLong && currentTimeMillis - parseLong < 604800) {
                    return false;
                }
                if (currentTimeMillis > parseLong && currentTimeMillis - parseLong >= 604800) {
                    j.a(f27619j);
                    return true;
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
            }
        } else if (!com.bytedance.crash.m.c()) {
            File file = new File(d2, "record");
            f27619j = file;
            try {
                j.a(file, Long.toString(currentTimeMillis), false);
            } catch (Throwable th2) {
                d.a("NPTH_CATCH", th2);
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v90, resolved type: org.json.JSONObject */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:140|141|142|(7:149|150|(1:152)|153|154|155|(2:157|(2:159|(2:161|(2:163|(2:165|(3:167|168|169))(1:170))(4:171|(1:173)(1:176)|177|178))(1:179))(1:180))(1:181))(3:146|147|148)|182|183|184|(1:186)(1:187)|188|(1:192)|193|(1:195)(2:196|(1:198)(2:199|(1:201)(2:202|(2:207|(1:209)(2:210|(1:215)(1:214)))(1:206))))|216|(2:217|218)|221) */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04a6, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:182:0x033e */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x043f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0474  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 1301
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.j.b.c():void");
    }

    public final void a(C0590b bVar) {
        if (!bVar.f27659m) {
            j.a(r.a(this.f27620a, bVar.f27647a));
            j.a(r.a(bVar.f27647a));
        }
    }

    private b(Context context) {
        this.f27620a = context;
    }

    static void a(File file) {
        String[] list = file.list();
        if (list != null && list.length > 10) {
            try {
                Arrays.sort(list);
                int i2 = 0;
                for (String str : list) {
                    i2++;
                    if (i2 > 10) {
                        j.a(new File(file, str));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(HashMap<String, C0590b> hashMap) {
        File[] listFiles = r.h(this.f27620a).listFiles();
        if (listFiles != null && listFiles.length != 0) {
            int i2 = 0;
            while (i2 < listFiles.length && i2 < 5) {
                File file = listFiles[i2];
                try {
                    if (!file.getName().equals("asdawd")) {
                        if (!file.isDirectory()) {
                            j.a(file);
                        } else if (file.getName().endsWith("G")) {
                            String name = file.getName();
                            if (hashMap.get(name) == null) {
                                hashMap.put(name, new C0590b(name));
                            }
                        } else {
                            j.a(file);
                        }
                    }
                } catch (Throwable th) {
                    d.a("NPTH_CATCH", th);
                    j.a(file);
                }
                i2++;
            }
        }
    }

    private static boolean b(C0590b bVar) {
        ZipOutputStream zipOutputStream;
        Throwable th;
        MethodCollector.i(12307);
        if (bVar.r == null) {
            MethodCollector.o(12307);
            return false;
        }
        File a2 = r.a(bVar.f27647a);
        if (com.bytedance.crash.runtime.b.a("custom_event_settings", "npth_simple_setting", "upload_core_dump") == 1) {
            File[] listFiles = a2.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                bVar.u = 0;
                MethodCollector.o(12307);
                return false;
            }
            boolean z = false;
            for (File file : listFiles) {
                try {
                    if (file.getName().startsWith("core-") && file.length() > 0) {
                        if (Long.valueOf(Long.parseLong(bVar.s.trim())).longValue() == file.length()) {
                            z = true;
                        } else {
                            bVar.t = Long.valueOf(file.length());
                        }
                    }
                } catch (Throwable th2) {
                    d.a("NPTH_CATCH", th2);
                    j.a(file);
                }
            }
            if (!z) {
                bVar.u = 3;
                j.a(a2);
                MethodCollector.o(12307);
                return false;
            } else if (!f()) {
                bVar.u = 2;
                j.a(a2);
                MethodCollector.o(12307);
                return false;
            } else if (a.c()) {
                File file2 = new File(r.h(com.bytedance.crash.m.f27724a).getAbsolutePath() + "/coredump.zip");
                try {
                    String absolutePath = a2.getAbsolutePath();
                    String absolutePath2 = file2.getAbsolutePath();
                    File file3 = new File(absolutePath);
                    try {
                        new File(absolutePath2).getParentFile().mkdirs();
                        zipOutputStream = new ZipOutputStream(new FileOutputStream(absolutePath2));
                        try {
                            j.a(zipOutputStream, file3, "");
                            com.bytedance.crash.util.m.a(zipOutputStream);
                            if ("wifi".equals(bVar.q) || file2.length() <= 36700160) {
                                boolean a3 = f.a(file2, bVar.r);
                                MethodCollector.o(12307);
                                return a3;
                            }
                            bVar.u = 4;
                            MethodCollector.o(12307);
                            return false;
                        } catch (Throwable th3) {
                            th = th3;
                            com.bytedance.crash.util.m.a(zipOutputStream);
                            MethodCollector.o(12307);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        zipOutputStream = null;
                        com.bytedance.crash.util.m.a(zipOutputStream);
                        MethodCollector.o(12307);
                        throw th;
                    }
                } catch (Throwable th5) {
                    d.a("NPTH_CATCH", th5);
                }
            } else {
                bVar.u = 5;
                j.a(a2);
                MethodCollector.o(12307);
                return false;
            }
        } else {
            bVar.u = 1;
            j.a(a2);
            MethodCollector.o(12307);
            return false;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public File f27642a;

        /* renamed from: b  reason: collision with root package name */
        long f27643b = -1;

        /* renamed from: c  reason: collision with root package name */
        long f27644c = -1;

        /* renamed from: d  reason: collision with root package name */
        CrashType f27645d;

        /* renamed from: e  reason: collision with root package name */
        String f27646e;

        static {
            Covode.recordClassIndex(16220);
        }

        a(File file, CrashType crashType) {
            this.f27642a = file;
            this.f27645d = crashType;
            this.f27646e = file.getName();
        }

        a(File file, long j2, CrashType crashType) {
            this.f27642a = file;
            this.f27643b = j2;
            this.f27645d = crashType;
            this.f27646e = file.getName();
        }
    }

    public static void b(HashMap<String, C0590b> hashMap, FilenameFilter filenameFilter) {
        File[] listFiles;
        if (filenameFilter == null) {
            listFiles = r.a(com.bytedance.crash.m.f27724a).listFiles();
        } else {
            listFiles = r.a(com.bytedance.crash.m.f27724a).listFiles(filenameFilter);
        }
        if (listFiles != null) {
            Arrays.sort(listFiles, Collections.reverseOrder());
            int i2 = 0;
            for (int i3 = 0; i3 < listFiles.length && i2 < 5; i3++) {
                File file = listFiles[i3];
                try {
                    if (g.a(file)) {
                        j.a(file);
                    } else if (!j.e(file)) {
                        com.bytedance.crash.e.a a2 = com.bytedance.crash.e.a.a();
                        if (!a2.f27528c.containsKey(file.getName())) {
                            if (file.isFile()) {
                                j.a(file);
                            } else if (a(hashMap, file, file.getName())) {
                                i2++;
                            }
                        }
                    }
                } catch (Throwable th) {
                    d.a("NPTH_CATCH", th);
                }
            }
        }
    }

    public static void a(HashMap<String, C0590b> hashMap, FilenameFilter filenameFilter) {
        File[] listFiles;
        if (filenameFilter == null) {
            listFiles = r.f(com.bytedance.crash.m.f27724a).listFiles();
        } else {
            listFiles = r.f(com.bytedance.crash.m.f27724a).listFiles(filenameFilter);
        }
        if (listFiles != null && listFiles.length != 0) {
            int i2 = 0;
            while (i2 < listFiles.length && i2 < 5) {
                File file = listFiles[i2];
                try {
                    if (!file.isDirectory() || g.a(file)) {
                        j.a(file);
                        i2++;
                    } else {
                        if (file.getName().endsWith("G")) {
                            String name = file.getName();
                            C0590b bVar = hashMap.get(name);
                            if (bVar == null) {
                                bVar = new C0590b(name);
                                hashMap.put(name, bVar);
                            }
                            bVar.f27649c.add(new a(file, CrashType.NATIVE));
                        } else {
                            j.a(file);
                        }
                        i2++;
                    }
                } catch (Throwable th) {
                    d.a("NPTH_CATCH", th);
                    j.a(file);
                }
            }
        }
    }

    private void b(c cVar, File file, List<String> list) {
        File[] listFiles = file.listFiles();
        int i2 = 0;
        while (i2 < listFiles.length && i2 < 5) {
            File file2 = listFiles[i2];
            try {
                if (file2.isDirectory()) {
                    b(cVar, file2, list);
                } else if (file2.getName().contains("asan_report.")) {
                    list.add(file2.getName());
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
                j.a(file2);
            }
            i2++;
        }
    }

    private void a(c cVar, File file, List<File> list) {
        File[] listFiles = file.listFiles();
        int i2 = 0;
        while (i2 < listFiles.length && i2 < 5) {
            File file2 = listFiles[i2];
            try {
                if (file2.isDirectory()) {
                    a(cVar, file2, list);
                } else {
                    list.add(file2);
                }
            } catch (Throwable th) {
                d.a("NPTH_CATCH", th);
                j.a(file2);
            }
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x016d, code lost:
        if (r31.f27651e.f27643b >= r10.f27643b) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0175, code lost:
        if (r10.f27646e.contains("ignore") != false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        com.bytedance.crash.entity.b.a(r4, "filters", "aid", java.lang.String.valueOf(r5.opt("aid")));
        com.bytedance.crash.entity.b.a(r4, "filters", "has_ignore", java.lang.String.valueOf(r10.f27646e.contains("ignore")));
        r5.put("aid", 2010);
        r0 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0199, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        com.bytedance.crash.d.a("NPTH_CATCH", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d2, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(final com.bytedance.crash.j.b.C0590b r31, boolean r32, com.bytedance.crash.runtime.g r33) {
        /*
        // Method dump skipped, instructions count: 498
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.j.b.a(com.bytedance.crash.j.b$b, boolean, com.bytedance.crash.runtime.g):void");
    }

    private com.bytedance.crash.entity.g a(File file, CrashType crashType, String str, long j2, long j3) {
        Throwable th;
        boolean z;
        com.bytedance.crash.entity.g gVar = null;
        try {
            if (file.isFile()) {
                j.a(file);
                return null;
            }
            if (crashType == CrashType.LAUNCH) {
                z = true;
            } else {
                z = false;
            }
            if (crashType != null && !new File(file, file.getName()).exists()) {
                if (crashType != CrashType.ANR) {
                    com.bytedance.crash.entity.g a2 = j.a(file, crashType);
                    try {
                        JSONObject jSONObject = a2.f27578b;
                        if (a2.f27578b != null) {
                            jSONObject.put("crash_time", j2);
                            jSONObject.put("app_start_time", j3);
                            JSONObject optJSONObject = jSONObject.optJSONObject("header");
                            if (optJSONObject != null && z) {
                                try {
                                    jSONObject.remove("header");
                                } catch (Throwable th2) {
                                    th = th2;
                                    gVar = a2;
                                    j.a(file);
                                    d.a("NPTH_CATCH", th);
                                    return gVar;
                                }
                            }
                            String optString = optJSONObject.optString("sdk_version_name", null);
                            if (optString == null) {
                                optString = "3.1.6-rc.13-ttp";
                            }
                            com.bytedance.crash.entity.b.a(jSONObject, "filters", "sdk_version", optString);
                            if (j.a(jSONObject.optJSONArray("logcat"))) {
                                jSONObject.put("logcat", com.bytedance.crash.runtime.j.a(str));
                            }
                            com.bytedance.crash.entity.b.a(jSONObject, "filters", "has_dump", "true");
                            com.bytedance.crash.entity.b.a(jSONObject, "filters", "is_64_devices", String.valueOf(Header.a()));
                            com.bytedance.crash.entity.b.a(jSONObject, "filters", "is_64_runtime", String.valueOf(NativeTools.a().c()));
                            com.bytedance.crash.entity.b.a(jSONObject, "filters", "is_x86_devices", String.valueOf(Header.b()));
                            com.bytedance.crash.entity.b.a(jSONObject, "filters", "is_root", String.valueOf(c.g()));
                            try {
                                jSONObject.put("launch_did", com.bytedance.crash.g.a.a(this.f27620a));
                                jSONObject.put("crash_uuid", file.getName());
                                try {
                                    jSONObject.put("jiffy", o.a.a());
                                    jSONObject.put("has_dump", "true");
                                    if (jSONObject.opt("storage") == null) {
                                        try {
                                            com.bytedance.crash.entity.b.a(jSONObject, ac.a());
                                        } catch (Throwable th3) {
                                            th = th3;
                                            gVar = a2;
                                            j.a(file);
                                            d.a("NPTH_CATCH", th);
                                            return gVar;
                                        }
                                    }
                                    if (optJSONObject.has("params_err")) {
                                        com.bytedance.crash.entity.b.a(jSONObject, "filters", "params_err", optJSONObject.optString("params_err"));
                                    }
                                    com.bytedance.crash.entity.e.a(jSONObject);
                                    if (z) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject.put("event_type", "start_crash");
                                        jSONObject.put("stack", jSONObject.remove("data"));
                                        jSONObject2.put("data", new JSONArray().put(jSONObject));
                                        jSONObject2.put("header", optJSONObject);
                                        try {
                                            a2.f27578b = jSONObject2;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            gVar = a2;
                                            j.a(file);
                                            d.a("NPTH_CATCH", th);
                                            return gVar;
                                        }
                                    } else {
                                        jSONObject.put("isJava", 1);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    gVar = a2;
                                    j.a(file);
                                    d.a("NPTH_CATCH", th);
                                    return gVar;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                gVar = a2;
                                j.a(file);
                                d.a("NPTH_CATCH", th);
                                return gVar;
                            }
                        } else {
                            j.a(file);
                        }
                        return a2;
                    } catch (Throwable th7) {
                        th = th7;
                        gVar = a2;
                        j.a(file);
                        d.a("NPTH_CATCH", th);
                        return gVar;
                    }
                }
            }
            try {
                return j.b(new File(file, file.getName()).getAbsolutePath());
            } catch (Throwable th8) {
                th = th8;
                j.a(file);
                d.a("NPTH_CATCH", th);
                return gVar;
            }
        } catch (Throwable th9) {
            th = th9;
            j.a(file);
            d.a("NPTH_CATCH", th);
            return gVar;
        }
    }
}
