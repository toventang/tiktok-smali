package com.bytedance.disk.h;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class e {

    public interface b {
        static {
            Covode.recordClassIndex(16822);
        }

        void a(MigrationItem migrationItem);
    }

    static {
        Covode.recordClassIndex(16820);
    }

    public static class a extends IOException {
        static {
            Covode.recordClassIndex(16821);
        }

        public a(String str) {
            super(str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:3)|4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r1) {
        /*
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x0009 }
            if (r0 == 0) goto L_0x0009
            d(r1)     // Catch:{ Exception -> 0x0009 }
        L_0x0009:
            boolean r0 = b(r1)     // Catch:{ Exception -> 0x000e }
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.h.e.a(java.io.File):boolean");
    }

    private static boolean b(File file) {
        MethodCollector.i(2018);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(2018);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2018);
        return delete;
    }

    private static void c(File file) {
        if (!file.isDirectory()) {
            boolean exists = file.exists();
            if (b(file)) {
                return;
            }
            if (!exists) {
                throw new FileNotFoundException("file does not exist: ".concat(String.valueOf(file)));
            }
            throw new IOException("unable to delete file: ".concat(String.valueOf(file)));
        } else if (file.exists()) {
            d(file);
            if (!b(file)) {
                throw new IOException("unable to delete directory " + file + ".");
            }
        }
    }

    private static void d(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e2 = null;
                for (File file2 : listFiles) {
                    try {
                        c(file2);
                    } catch (IOException e3) {
                        e2 = e3;
                    }
                }
                if (e2 != null) {
                    throw e2;
                }
                return;
            }
            throw new IOException("Failed to list contents of ".concat(String.valueOf(file)));
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    private static boolean a(MigrationItem migrationItem) {
        String b2;
        Iterator<String> it = com.bytedance.v.a.b.b(null).iterator();
        while (true) {
            if (!it.hasNext()) {
                b2 = com.bytedance.v.a.b.b();
                break;
            }
            if (migrationItem.f28630c.f28640d.startsWith(it.next())) {
                b2 = com.bytedance.v.a.b.c();
                break;
            }
        }
        long d2 = c.d(b2) - 104857600;
        if (d2 > 0 && d2 > c.b(migrationItem.f28630c.f28639c)) {
            return true;
        }
        return false;
    }

    public static boolean a(String str) {
        Objects.requireNonNull(str, "Source must not be null");
        File file = new File(str);
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + str + "' does not exist");
        } else if (file.canRead()) {
            return true;
        } else {
            throw new IOException("Source `" + str + "' can't read");
        }
    }

    private static int a(MigrationItem migrationItem, File file, File file2) {
        int i2;
        MethodCollector.i(1999);
        if (file == null) {
            NullPointerException nullPointerException = new NullPointerException("Source must not be null");
            MethodCollector.o(1999);
            throw nullPointerException;
        } else if (file2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("Destination must not be null");
            MethodCollector.o(1999);
            throw nullPointerException2;
        } else if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Source '" + file + "' does not exist");
            MethodCollector.o(1999);
            throw fileNotFoundException;
        } else if (!file.isDirectory()) {
            IOException iOException = new IOException("Source '" + file + "' is not a directory");
            MethodCollector.o(1999);
            throw iOException;
        } else if (migrationItem.d()) {
            MethodCollector.o(1999);
            return 4;
        } else if (migrationItem.c()) {
            MethodCollector.o(1999);
            return 3;
        } else {
            try {
                migrationItem.f28635h.close();
                if (file.renameTo(file2)) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
                migrationItem.f28635h.open();
                MethodCollector.o(1999);
                return i2;
            } catch (Exception e2) {
                MethodCollector.o(1999);
                throw e2;
            } catch (Throwable th) {
                migrationItem.f28635h.open();
                MethodCollector.o(1999);
                throw th;
            }
        }
    }

    private static int b(MigrationItem migrationItem, File file, File file2) {
        int i2;
        MethodCollector.i(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        if (file == null) {
            NullPointerException nullPointerException = new NullPointerException("Source must not be null");
            MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            throw nullPointerException;
        } else if (file2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("Destination must not be null");
            MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            throw nullPointerException2;
        } else if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Source '" + file + "' does not exist");
            MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            throw fileNotFoundException;
        } else if (file.isDirectory()) {
            IOException iOException = new IOException("Source '" + file + "' is a directory");
            MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            throw iOException;
        } else if (migrationItem.d()) {
            MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            return 4;
        } else if (migrationItem.c()) {
            MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
            return 3;
        } else {
            try {
                migrationItem.f28635h.close();
                if (file.renameTo(file2)) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
                migrationItem.f28635h.open();
                MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                return i2;
            } catch (Exception e2) {
                MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                throw e2;
            } catch (Throwable th) {
                migrationItem.f28635h.open();
                MethodCollector.o(LiveNetAdaptiveHurryTimeSetting.DEFAULT);
                throw th;
            }
        }
    }

    public static int a(MigrationItem migrationItem, File file, File file2, b bVar) {
        int b2 = b(migrationItem, file, file2);
        if (b2 == 5) {
            if (bVar != null && migrationItem.f28630c.f28642f == 1) {
                MigrationItem a2 = MigrationItem.a(migrationItem, true);
                a2.f28630c.f28639c = file.getPath();
                a2.f28630c.f28640d = file2.getPath();
                a2.f28630c.f28642f = 1;
                a2.f28633f = 5;
                a2.f28632e = System.currentTimeMillis() - a2.f28631d;
                bVar.a(a2);
                MigrationItem.a.a(a2);
            }
            return 5;
        } else if (b2 != 6) {
            return b2;
        } else {
            if (a(migrationItem)) {
                return b(migrationItem, file, file2, bVar);
            }
            return 6;
        }
    }

    private static int b(MigrationItem migrationItem, File file, File file2, b bVar) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.i(2007);
        int i2 = 4;
        if (migrationItem.d()) {
            MethodCollector.o(2007);
            return 4;
        }
        int i3 = 3;
        if (migrationItem.c()) {
            MethodCollector.o(2007);
            return 3;
        } else if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Failed to copy from->" + file + " to->" + file2 + " because of srcFile not exist");
            MethodCollector.o(2007);
            throw fileNotFoundException;
        } else if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            IOException iOException = new IOException("Failed to copy same path from->" + file + " to->" + file2);
            MethodCollector.o(2007);
            throw iOException;
        } else if (file2.getParentFile() != null && !file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            IOException iOException2 = new IOException("Failed to copy from->" + file + " to->" + file2 + " because of dest parent mkdir failed");
            MethodCollector.o(2007);
            throw iOException2;
        } else if (!file2.exists() || file2.canWrite()) {
            long length = file.length();
            if (length != -1) {
                if (migrationItem.f28630c.f28642f == 1) {
                    migrationItem.f28630c.f28643g = length;
                }
                long lastModified = file.lastModified();
                try {
                    byte[] bArr = new byte[4096];
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        while (!migrationItem.d()) {
                            try {
                                if (migrationItem.c()) {
                                    c.a(fileInputStream);
                                    c.a(fileOutputStream);
                                    MethodCollector.o(2007);
                                    return i3;
                                }
                                int read = fileInputStream.read(bArr);
                                if (read >= 0) {
                                    fileOutputStream.write(bArr, 0, read);
                                    i2 = 4;
                                    i3 = 3;
                                } else {
                                    fileOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    c.a(fileInputStream);
                                    c.a(fileOutputStream);
                                    long lastModified2 = file.lastModified();
                                    if (file.length() == file2.length() && lastModified == lastModified2) {
                                        file2.setLastModified(file.lastModified());
                                        if (bVar != null) {
                                            MigrationItem a2 = MigrationItem.a.a();
                                            a2.f28630c = MigrationOpt.a(migrationItem.f28630c);
                                            a2.f28629b = -1;
                                            a2.f28633f = -1;
                                            a2.f28631d = System.currentTimeMillis();
                                            a2.f28632e = -1;
                                            a2.f28628a = migrationItem.f28628a;
                                            a2.f28635h = migrationItem.f28635h;
                                            a2.f28634g = migrationItem.f28634g;
                                            a2.f28630c.f28639c = file.getPath();
                                            a2.f28630c.f28640d = file2.getPath();
                                            a2.f28630c.f28642f = 1;
                                            a2.f28633f = 5;
                                            a2.f28632e = System.currentTimeMillis() - a2.f28631d;
                                            bVar.a(a2);
                                            MigrationItem.a.a(a2);
                                        }
                                        MethodCollector.o(2007);
                                        return 5;
                                    }
                                    a aVar = new a("Failed to copy full contents from->" + file + " to->" + file2);
                                    MethodCollector.o(2007);
                                    throw aVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c.a(fileInputStream);
                                c.a(fileOutputStream);
                                MethodCollector.o(2007);
                                throw th;
                            }
                        }
                        c.a(fileInputStream);
                        c.a(fileOutputStream);
                        MethodCollector.o(2007);
                        return i2;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        c.a(fileInputStream);
                        c.a(fileOutputStream);
                        MethodCollector.o(2007);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = null;
                    fileOutputStream = null;
                    c.a(fileInputStream);
                    c.a(fileOutputStream);
                    MethodCollector.o(2007);
                    throw th;
                }
            } else {
                IOException iOException3 = new IOException("Failed to copy from->" + file + " to->" + file2 + " fileLen=-1");
                MethodCollector.o(2007);
                throw iOException3;
            }
        } else {
            IOException iOException4 = new IOException("Failed to copy from->" + file + " to->" + file2 + " because of destFile cant write!");
            MethodCollector.o(2007);
            throw iOException4;
        }
    }

    private static int c(MigrationItem migrationItem, File file, File file2, FileFilter fileFilter, List<String> list, b bVar) {
        File[] listFiles;
        int a2;
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " destDir is not dir");
            }
        } else if (file2.mkdirs()) {
            file2.setLastModified(file.lastModified());
        } else {
            throw new IOException("Failed to copyDir from->" + file + " to->" + file2 + " destDir mkdirs failed");
        }
        if (file2.canWrite()) {
            if (fileFilter == null) {
                listFiles = file.listFiles();
            } else {
                listFiles = file.listFiles(fileFilter);
            }
            if (listFiles != null) {
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    File file3 = new File(file2, listFiles[i2].getName());
                    if (list == null || !list.contains(listFiles[i2].getPath())) {
                        if (listFiles[i2].isDirectory()) {
                            a2 = a(migrationItem, listFiles[i2], file3, fileFilter, list, bVar);
                        } else {
                            a2 = a(migrationItem, listFiles[i2], file3, bVar);
                        }
                        if (a2 != 5) {
                            return a2;
                        }
                    }
                }
                return 5;
            }
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " srcDir listFiles failed");
        }
        throw new IOException("Failed to copyDir from->" + file + " to->" + file2 + " dest cant write");
    }

    public static int a(MigrationItem migrationItem, File file, File file2, FileFilter fileFilter, List<String> list, b bVar) {
        int a2 = a(migrationItem, file, file2);
        if (a2 == 5) {
            if (bVar != null && !TextUtils.equals(file.getPath(), migrationItem.f28630c.f28637a)) {
                MigrationItem a3 = MigrationItem.a(migrationItem, true);
                a3.f28630c.f28639c = file.getPath();
                a3.f28630c.f28640d = file2.getPath();
                a3.f28630c.f28642f = 2;
                a3.f28633f = 5;
                a3.f28632e = System.currentTimeMillis() - a3.f28631d;
                bVar.a(a3);
                MigrationItem.a.a(a3);
            }
            return 5;
        } else if (a2 != 6) {
            return a2;
        } else {
            if (a(migrationItem)) {
                return b(migrationItem, file, file2, fileFilter, list, bVar);
            }
            return 6;
        }
    }

    private static int b(MigrationItem migrationItem, File file, File file2, FileFilter fileFilter, List<String> list, b bVar) {
        File[] listFiles;
        if (file == null) {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " srcDir not exist");
        } else if (file.exists() && !file.isDirectory()) {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " srcDir is not dir");
        } else if (file2 == null) {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " destDir is null");
        } else if (!file2.exists() || file2.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                if (fileFilter == null) {
                    listFiles = file.listFiles();
                } else {
                    listFiles = file.listFiles(fileFilter);
                }
                if (listFiles != null && listFiles.length > 0) {
                    arrayList = new ArrayList(listFiles.length);
                    for (File file3 : listFiles) {
                        arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                    }
                }
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            if (arrayList.size() <= 0) {
                arrayList = null;
            }
            return c(migrationItem, file, file2, fileFilter, arrayList, bVar);
        } else {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " destDir is not dir");
        }
    }
}
