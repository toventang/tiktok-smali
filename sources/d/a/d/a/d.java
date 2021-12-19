package d.a.d.a;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import h.a.z;
import h.e.c;
import h.e.j;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f156619a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f156620b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final String f156621c = "";

    private d() {
    }

    public static boolean a(String str, String str2) {
        MethodCollector.i(9994);
        l.c(str, "");
        l.c(str2, "");
        boolean renameTo = new File(str).getAbsoluteFile().renameTo(new File(str2).getAbsoluteFile());
        MethodCollector.o(9994);
        return renameTo;
    }

    public static boolean a(h hVar, h hVar2) {
        MethodCollector.i(10150);
        if (hVar == null) {
            MethodCollector.o(10150);
            return false;
        } else if (hVar2 == null) {
            MethodCollector.o(10150);
            return false;
        } else {
            if (b(hVar2)) {
                c(hVar2);
            }
            File file = new File(hVar.f156633a);
            File file2 = new File(hVar2.f156633a);
            if (!file.exists()) {
                MethodCollector.o(10150);
                return false;
            }
            boolean renameTo = file.renameTo(file2);
            MethodCollector.o(10150);
            return renameTo;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.a<i> {
        final /* synthetic */ File $file;

        static {
            Covode.recordClassIndex(103990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(File file) {
            super(0);
            this.$file = file;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            if (this.$file.isDirectory()) {
                return i.Directory;
            }
            if (this.$file.isFile()) {
                return i.Regular;
            }
            return i.Unknown;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<Charset> {
        final /* synthetic */ b $contentEncoding;

        static {
            Covode.recordClassIndex(103991);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b bVar) {
            super(0);
            this.$contentEncoding = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Charset invoke() {
            if (e.f156624c[this.$contentEncoding.ordinal()] != 1) {
                return h.m.d.f158808a;
            }
            return h.m.d.f158812e;
        }
    }

    static {
        Covode.recordClassIndex(103989);
        String str = File.separator;
        l.a((Object) str, "");
        f156619a = str;
    }

    public static f a(h hVar) {
        String str;
        if (hVar == null || (str = hVar.f156633a) == null) {
            return null;
        }
        return c(str);
    }

    public static boolean b(h hVar) {
        String str;
        if (hVar == null || (str = hVar.f156633a) == null) {
            return false;
        }
        return f(str);
    }

    public static f c(String str) {
        l.c(str, "");
        return a(new File(str));
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        return new File(str).getName();
    }

    public static boolean c(h hVar) {
        String str;
        if (hVar == null || (str = hVar.f156633a) == null) {
            return false;
        }
        return g(str);
    }

    public static boolean e(String str) {
        l.c(str, "");
        return new File(str).getAbsoluteFile().mkdirs();
    }

    public static boolean f(String str) {
        if (str == null) {
            return false;
        }
        return new File(str).getAbsoluteFile().exists();
    }

    public static c d(h hVar) {
        MethodCollector.i(6169);
        if (hVar == null) {
            MethodCollector.o(6169);
            return null;
        }
        String str = hVar.f156633a;
        if (str == null) {
            MethodCollector.o(6169);
            return null;
        }
        l.c(str, "");
        FileInputStream fileInputStream = new FileInputStream(new File(str).getAbsoluteFile());
        c cVar = new c();
        cVar.a(fileInputStream);
        MethodCollector.o(6169);
        return cVar;
    }

    public static boolean g(String str) {
        l.c(str, "");
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        File absoluteFile = file.getAbsoluteFile();
        l.a((Object) absoluteFile, "");
        if (j.g(absoluteFile)) {
            return true;
        }
        return false;
    }

    private static f a(File file) {
        String name = file.getName();
        l.a((Object) name, "");
        return new f(name, new h(file.getAbsolutePath()), new h(file.getCanonicalPath()), Double.valueOf(0.0d), Double.valueOf((double) file.lastModified()), Long.valueOf(file.length()), (i) new a(file).invoke());
    }

    public static List<String> b(String str) {
        File absoluteFile;
        Object valueOf;
        if (str == null || (absoluteFile = new File(str).getAbsoluteFile()) == null || !absoluteFile.exists()) {
            return null;
        }
        if (!absoluteFile.isDirectory()) {
            return z.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        File[] listFiles = absoluteFile.listFiles();
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                l.a((Object) file, "");
                if (file.isDirectory()) {
                    String name = file.getName();
                    l.a((Object) name, "");
                    if (!p.e((CharSequence) name, (CharSequence) "__MACOSX")) {
                        List<String> b2 = b(file.getAbsolutePath());
                        valueOf = b2 != null ? Boolean.valueOf(arrayList.addAll(b2)) : null;
                    } else {
                        valueOf = h.z.f158842a;
                    }
                } else {
                    String absolutePath = file.getAbsolutePath();
                    l.a((Object) absolutePath, "");
                    valueOf = Boolean.valueOf(arrayList.add(absolutePath));
                }
                arrayList2.add(valueOf);
            }
        }
        return arrayList;
    }

    private static boolean b(File file) {
        MethodCollector.i(6429);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(6429);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(6429);
        return delete;
    }

    public static List<f> a(String str) {
        l.c(str, "");
        File[] listFiles = new File(str).getAbsoluteFile().listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            l.a((Object) file, "");
            arrayList.add(a(file));
        }
        return arrayList;
    }

    public static void a(k kVar) {
        l.c(kVar, "");
        try {
            kVar.a();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static g a(h hVar, boolean z) {
        String str;
        if (hVar == null || (str = hVar.f156633a) == null) {
            return null;
        }
        return a(str, z);
    }

    public static g a(String str, boolean z) {
        MethodCollector.i(6312);
        l.c(str, "");
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str).getAbsoluteFile(), z);
        g gVar = new g();
        gVar.a(fileOutputStream);
        MethodCollector.o(6312);
        return gVar;
    }

    /* access modifiers changed from: private */
    public static String a(c cVar, b bVar) {
        MethodCollector.i(6325);
        l.c(cVar, "");
        l.c(bVar, "");
        InputStream inputStream = cVar.f156618a;
        if (inputStream == null) {
            l.a("inputStream");
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, ((Charset) new b(bVar).invoke()).name());
        try {
            InputStreamReader inputStreamReader2 = inputStreamReader;
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            for (int read = inputStreamReader2.read(cArr); read != -1; read = inputStreamReader2.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            l.a((Object) stringWriter2, "");
            c.a(inputStreamReader, null);
            MethodCollector.o(6325);
            return stringWriter2;
        } catch (Throwable th) {
            c.a(inputStreamReader, th);
            MethodCollector.o(6325);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        if (r2 == null) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A[Catch:{ all -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: d.a.d.a.d.b(java.lang.String, java.lang.String):boolean");
    }

    public static long a(String str, String str2, b bVar) {
        long j2;
        MethodCollector.i(9827);
        File absoluteFile = new File(str).getAbsoluteFile();
        if (!absoluteFile.exists()) {
            absoluteFile.createNewFile();
        }
        if (bVar == b.Base64) {
            Charset charset = h.m.d.f158808a;
            if (str2 != null) {
                byte[] bytes = str2.getBytes(charset);
                l.a((Object) bytes, "");
                str2 = Base64.encodeToString(bytes, 0);
                l.a((Object) str2, "");
            } else {
                w wVar = new w("null cannot be cast to non-null type");
                MethodCollector.o(9827);
                throw wVar;
            }
        } else if (e.f156623b[bVar.ordinal()] == 1) {
            Charset charset2 = h.m.d.f158808a;
            if (str2 != null) {
                byte[] bytes2 = str2.getBytes(charset2);
                l.a((Object) bytes2, "");
                str2 = new String(bytes2, h.m.d.f158812e);
            } else {
                w wVar2 = new w("null cannot be cast to non-null type");
                MethodCollector.o(9827);
                throw wVar2;
            }
        }
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(absoluteFile, false));
            try {
                OutputStreamWriter outputStreamWriter2 = outputStreamWriter;
                outputStreamWriter2.write(str2);
                outputStreamWriter2.flush();
                c.a(outputStreamWriter, null);
                j2 = (long) str2.length();
                MethodCollector.o(9827);
                return j2;
            } catch (Throwable th) {
                c.a(outputStreamWriter, th);
                MethodCollector.o(9827);
                throw th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            j2 = 0;
        }
    }
}
