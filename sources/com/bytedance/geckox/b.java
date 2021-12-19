package com.bytedance.geckox;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.utils.BsPatch;
import com.bytedance.geckox.utils.c;
import com.bytedance.geckox.utils.e;
import com.bytedance.geckox.utils.i;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {

    /* renamed from: j  reason: collision with root package name */
    private static final Map<Integer, String> f29710j;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Long> f29711a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, Long> f29712b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public RandomAccessFile f29713c;

    /* renamed from: d  reason: collision with root package name */
    public File f29714d;

    /* renamed from: e  reason: collision with root package name */
    public File f29715e;

    /* renamed from: f  reason: collision with root package name */
    public File f29716f;

    /* renamed from: g  reason: collision with root package name */
    public int f29717g;

    /* renamed from: h  reason: collision with root package name */
    public String f29718h = "";

    /* renamed from: i  reason: collision with root package name */
    private List<String> f29719i = new ArrayList();

    private String c() {
        byte[] bArr = new byte[32];
        this.f29713c.readFully(bArr);
        return new String(bArr);
    }

    static {
        Covode.recordClassIndex(17255);
        HashMap hashMap = new HashMap();
        f29710j = hashMap;
        hashMap.put(1, "modify");
        hashMap.put(2, "delete");
        hashMap.put(3, "add");
        hashMap.put(4, "rename");
        hashMap.put(5, "rewrite");
        hashMap.put(6, "same");
    }

    public final void a() {
        while (this.f29713c.getFilePointer() != this.f29713c.length()) {
            String readUTF = this.f29713c.readUTF();
            if (!readUTF.isEmpty()) {
                this.f29719i.add(readUTF);
                File file = new File(this.f29714d, readUTF);
                if (!readUTF.startsWith("__MACOSX/") && !readUTF.equals(".DS_Store")) {
                    byte readByte = this.f29713c.readByte();
                    Map<Integer, String> map = f29710j;
                    this.f29718h = a.a("patch failed, type:%s, path:%s, detail:", new Object[]{map.get(Integer.valueOf(readByte)), readUTF});
                    switch (readByte) {
                        case 1:
                            a(readUTF, file);
                            continue;
                        case 2:
                            break;
                        case 3:
                            File file2 = new File(this.f29715e, readUTF);
                            e(file2.getParentFile());
                            d(file2);
                            if (this.f29717g == 0) {
                                f(file2);
                            }
                            this.f29711a.put(readUTF, Long.valueOf(file2.lastModified()));
                            continue;
                        case 4:
                            String readUTF2 = this.f29713c.readUTF();
                            if (!readUTF2.isEmpty()) {
                                b(readUTF2, file);
                                continue;
                            } else {
                                throw new com.bytedance.geckox.c.b(1006, this.f29718h + "read path is nil");
                            }
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                            String readUTF3 = this.f29713c.readUTF();
                            if (!readUTF3.isEmpty()) {
                                this.f29718h = a.a("patch failed, type:%s, path:%s, newPath: %s, detail:", new Object[]{map.get(Integer.valueOf(readByte)), readUTF, readUTF3});
                                a(readUTF3, file);
                                continue;
                            } else {
                                throw new com.bytedance.geckox.c.b(1006, this.f29718h + "read path is nil");
                            }
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                            b(readUTF, file);
                            continue;
                        default:
                            throw new com.bytedance.geckox.c.b(1006, this.f29718h + "not support change type");
                    }
                }
            } else {
                throw new com.bytedance.geckox.c.b(1006, "read path is empty");
            }
        }
    }

    public final void b() {
        for (String str : this.f29712b.keySet()) {
            if (!this.f29719i.contains(str)) {
                Long l2 = this.f29712b.get(str);
                File file = new File(this.f29714d, str);
                Long valueOf = Long.valueOf(file.lastModified());
                if (l2.equals(valueOf)) {
                    File file2 = new File(this.f29715e, str);
                    b(file, file2);
                    this.f29711a.put(str, Long.valueOf(file2.lastModified()));
                } else {
                    throw new com.bytedance.geckox.c.b(1003, a.a("checkDirModifyTime failed: %d-%d-%s", new Object[]{l2, valueOf, str}));
                }
            }
        }
    }

    private void c(File file) {
        if (this.f29717g != 0) {
            String a2 = a(file, this.f29714d);
            Long l2 = this.f29712b.get(a2);
            Long valueOf = Long.valueOf(file.lastModified());
            if (!l2.equals(valueOf)) {
                throw new com.bytedance.geckox.c.b(1003, a.a("checkDirModifyTime failed: %d-%d-%s", new Object[]{l2, valueOf, a2}));
            }
        }
    }

    private void e(File file) {
        try {
            e.e(file);
        } catch (Exception e2) {
            throw new com.bytedance.geckox.c.b(1012, this.f29718h + e2.getMessage());
        }
    }

    private void f(File file) {
        String c2 = c();
        String a2 = i.a(file, "MD5");
        if (!a2.equals(c2)) {
            throw new com.bytedance.geckox.c.b(1011, this.f29718h + "md5 check failed, local md5:" + a2 + ", expect md5:" + c2);
        }
    }

    public final void b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    String a2 = a(file2, this.f29714d);
                    if (!this.f29719i.contains(a2)) {
                        File file3 = new File(this.f29715e, a2);
                        b(file2, file3);
                        this.f29711a.put(a2, Long.valueOf(file3.lastModified()));
                    }
                } else {
                    b(file2);
                }
            }
        }
    }

    public static boolean a(File file) {
        MethodCollector.i(12035);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(12035);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12035);
        return delete;
    }

    private void d(File file) {
        Throwable th;
        Exception e2;
        MethodCollector.i(6769);
        if (!file.exists() || a(file)) {
            FileOutputStream fileOutputStream = null;
            try {
                long readLong = this.f29713c.readLong();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1048576];
                    long j2 = 0;
                    while (true) {
                        if (j2 >= readLong) {
                            break;
                        }
                        long j3 = readLong - j2;
                        if (j3 < 1048576) {
                            int i2 = (int) j3;
                            this.f29713c.readFully(bArr, 0, i2);
                            fileOutputStream2.write(bArr, 0, i2);
                            break;
                        }
                        j2 += 1048576;
                        this.f29713c.readFully(bArr);
                        fileOutputStream2.write(bArr);
                    }
                    c.a(fileOutputStream2);
                    MethodCollector.o(6769);
                } catch (Exception e3) {
                    e2 = e3;
                    fileOutputStream = fileOutputStream2;
                    try {
                        com.bytedance.geckox.c.b bVar = new com.bytedance.geckox.c.b(1007, this.f29718h + e2.getMessage());
                        MethodCollector.o(6769);
                        throw bVar;
                    } catch (Throwable th2) {
                        th = th2;
                        c.a(fileOutputStream);
                        MethodCollector.o(6769);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    c.a(fileOutputStream);
                    MethodCollector.o(6769);
                    throw th;
                }
            } catch (Exception e4) {
                e2 = e4;
                com.bytedance.geckox.c.b bVar2 = new com.bytedance.geckox.c.b(1007, this.f29718h + e2.getMessage());
                MethodCollector.o(6769);
                throw bVar2;
            }
        } else {
            com.bytedance.geckox.c.b bVar3 = new com.bytedance.geckox.c.b(1007, this.f29718h + "remove old file error: " + file.getPath());
            MethodCollector.o(6769);
            throw bVar3;
        }
    }

    private static String a(File file, File file2) {
        return file.getAbsolutePath().substring(file2.getAbsolutePath().length() + 1);
    }

    private void b(File file, File file2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        Exception e2;
        MethodCollector.i(6775);
        e(file2.getParentFile());
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
            } catch (Exception e3) {
                e2 = e3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                try {
                    com.bytedance.geckox.c.b bVar = new com.bytedance.geckox.c.b(1012, this.f29718h + e2.getMessage());
                    MethodCollector.o(6775);
                    throw bVar;
                } catch (Throwable th2) {
                    th = th2;
                    c.a(fileInputStream);
                    c.a(fileOutputStream);
                    MethodCollector.o(6775);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                fileInputStream = fileInputStream2;
                c.a(fileInputStream);
                c.a(fileOutputStream);
                MethodCollector.o(6775);
                throw th;
            }
            try {
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        c.a(fileInputStream2);
                        c.a(fileOutputStream);
                        MethodCollector.o(6775);
                        return;
                    }
                }
            } catch (Exception e4) {
                e2 = e4;
                fileInputStream = fileInputStream2;
                com.bytedance.geckox.c.b bVar2 = new com.bytedance.geckox.c.b(1012, this.f29718h + e2.getMessage());
                MethodCollector.o(6775);
                throw bVar2;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = fileInputStream2;
                c.a(fileInputStream);
                c.a(fileOutputStream);
                MethodCollector.o(6775);
                throw th;
            }
        } catch (Exception e5) {
            e2 = e5;
            fileOutputStream = null;
            com.bytedance.geckox.c.b bVar22 = new com.bytedance.geckox.c.b(1012, this.f29718h + e2.getMessage());
            MethodCollector.o(6775);
            throw bVar22;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            c.a(fileInputStream);
            c.a(fileOutputStream);
            MethodCollector.o(6775);
            throw th;
        }
    }

    private void a(String str, File file) {
        if (file.exists()) {
            File file2 = new File(this.f29715e, str);
            e(file2.getParentFile());
            File file3 = new File(this.f29716f.getParentFile(), "bytepatch_patch_temp_file");
            d(file3);
            try {
                BsPatch.a(file, file3, this.f29715e, str);
                a(file3);
                String c2 = c();
                String a2 = i.a(file2, "MD5");
                if (!a2.equals(c2)) {
                    c(file);
                    if (i.a(file, "MD5").equals(c2)) {
                        throw new com.bytedance.geckox.c.b(1024, this.f29718h + "old file is same");
                    }
                    throw new com.bytedance.geckox.c.b(1011, this.f29718h + "md5 check failed, local md5:" + a2 + ", expect md5:" + c2);
                }
                this.f29711a.put(str, Long.valueOf(file2.lastModified()));
            } catch (Exception e2) {
                throw new com.bytedance.geckox.c.b(1010, this.f29718h + "bspatch error:" + e2.getMessage());
            }
        } else {
            throw new com.bytedance.geckox.c.b(1006, this.f29718h + "path not exists: ");
        }
    }

    private void b(String str, File file) {
        if (file.exists()) {
            File file2 = new File(this.f29715e, str);
            b(file, file2);
            if (this.f29717g == 0) {
                f(file2);
            } else {
                c(file);
            }
            this.f29711a.put(str, Long.valueOf(file2.lastModified()));
            return;
        }
        throw new com.bytedance.geckox.c.b(1006, this.f29718h + "path not exists: ");
    }

    public static void a(File file, File file2, Map<String, Long> map) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                if (file3.isFile()) {
                    map.put(a(file3, file2), Long.valueOf(file3.lastModified()));
                } else {
                    a(file3, file2, map);
                }
            }
        }
    }
}
