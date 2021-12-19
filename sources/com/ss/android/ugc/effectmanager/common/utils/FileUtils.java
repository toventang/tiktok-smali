package com.ss.android.ugc.effectmanager.common.utils;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import h.e.c;
import h.e.j;
import h.f.b.l;
import h.m.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

public final class FileUtils {
    private static final int BUFFER_SIZE = BUFFER_SIZE;
    public static final FileUtils INSTANCE = new FileUtils();
    private static final Charset US_ASCII = Charset.forName("US-ASCII");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private FileUtils() {
    }

    public final int getBUFFER_SIZE() {
        return BUFFER_SIZE;
    }

    public final Charset getUS_ASCII() {
        return US_ASCII;
    }

    public final Charset getUTF_8() {
        return UTF_8;
    }

    public final boolean isSdcardWritable() {
        try {
            return l.a((Object) "mounted", (Object) Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isSdcardAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        if (l.a((Object) "mounted", (Object) externalStorageState) || l.a((Object) "mounted_ro", (Object) externalStorageState)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(95338);
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public final boolean deleteDir(File file) {
        try {
            deleteContents(file);
            if (file != null) {
                return com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public final boolean checkFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public final boolean ensureDirExists(File file) {
        l.c(file, "");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    public final synchronized void removeDir(String str) {
        MethodCollector.i(977);
        if (str == null) {
            MethodCollector.o(977);
            return;
        }
        removeDir(new File(str));
        MethodCollector.o(977);
    }

    public final boolean removeFile(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canWrite() || !com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file)) {
            return false;
        }
        return true;
    }

    public final OutputStream getFileOutputStream(String str) {
        MethodCollector.i(993);
        FileOutputStream fileOutputStream = null;
        if (str == null) {
            MethodCollector.o(993);
            return null;
        }
        File parentFile = new File(str).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        MethodCollector.o(993);
        return fileOutputStream;
    }

    public final InputStream getFileStream(String str) {
        MethodCollector.i(971);
        FileInputStream fileInputStream = null;
        if (str == null) {
            MethodCollector.o(971);
            return null;
        }
        File file = new File(str);
        if (checkFileExists(file.getPath())) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            MethodCollector.o(971);
            return fileInputStream;
        }
        MethodCollector.o(971);
        return null;
    }

    public final long getFolderSize(File file) {
        File[] listFiles;
        long folderSize;
        long j2 = 0;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int length = listFiles.length;
        for (int i2 = 0; i2 < length; i2++) {
            File file2 = listFiles[i2];
            l.a((Object) file2, "");
            if (file2.isFile()) {
                folderSize = listFiles[i2].length();
            } else {
                folderSize = getFolderSize(listFiles[i2]);
            }
            j2 += folderSize;
        }
        return j2;
    }

    public final String joinSeparator(String str) {
        l.c(str, "");
        String str2 = File.separator;
        l.a((Object) str2, "");
        if (p.c(str, str2, false)) {
            return str;
        }
        return str + File.separator;
    }

    public final void removeDir(File file) {
        File[] listFiles;
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 0) {
                com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                return;
            }
            for (File file2 : listFiles) {
                l.a((Object) file2, "");
                if (file2.isDirectory()) {
                    removeDir(file2);
                } else {
                    com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2);
                }
            }
            com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
        }
    }

    public static boolean com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(935);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(935);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(935);
        return delete;
    }

    public final void deleteContents(File file) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    l.a((Object) file2, "");
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2)) {
                        throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
    }

    public final String readFully(Reader reader) {
        MethodCollector.i(983);
        l.c(reader, "");
        try {
            Reader reader2 = reader;
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            for (int read = reader2.read(cArr); read != -1; read = reader2.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            l.a((Object) stringWriter2, "");
            c.a(reader, null);
            MethodCollector.o(983);
            return stringWriter2;
        } catch (Throwable th) {
            c.a(reader, th);
            MethodCollector.o(983);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062 A[SYNTHETIC, Splitter:B:30:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A[SYNTHETIC, Splitter:B:35:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A[SYNTHETIC, Splitter:B:42:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFileContent(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.FileUtils.getFileContent(java.lang.String):java.lang.String");
    }

    public final long copyStream(InputStream inputStream, OutputStream outputStream) {
        l.c(inputStream, "");
        l.c(outputStream, "");
        return copyStream(inputStream, outputStream, 0, null);
    }

    public final String combineFilePath(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder append = sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return append.append(str2).toString();
    }

    public final File createFile(String str, boolean z) {
        File file = null;
        if (str == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            file = new File(str);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                } else {
                    try {
                        File parentFile = file.getParentFile();
                        if (parentFile == null) {
                            l.a();
                        }
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return file;
    }

    public final String addPathSuffix(String str, String str2) {
        l.c(str2, "");
        if (str == null) {
            return null;
        }
        String str3 = File.separator;
        l.a((Object) str3, "");
        if (p.c(str, str3, false)) {
            return p.b(str, 1) + str2 + File.separator;
        }
        return str + str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r3 == null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066 A[SYNTHETIC, Splitter:B:34:0x0066] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long writeToExternal(java.io.InputStream r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.FileUtils.writeToExternal(java.io.InputStream, java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r4 == null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC, Splitter:B:43:0x0077] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long writeToExternal(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.FileUtils.writeToExternal(java.lang.String, java.lang.String):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x014a A[Catch:{ all -> 0x014c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void unZip(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.FileUtils.unZip(java.lang.String, java.lang.String):void");
    }

    public final synchronized void rename(String str, String str2, boolean z) {
        MethodCollector.i(1000);
        if (str == null) {
            MethodCollector.o(1000);
        } else if (str2 == null) {
            MethodCollector.o(1000);
        } else {
            rename$default(this, new File(str), new File(str2), false, 4, (Object) null);
            MethodCollector.o(1000);
        }
    }

    public final synchronized void rename(File file, File file2, boolean z) {
        MethodCollector.i(1013);
        if (file == null) {
            MethodCollector.o(1013);
        } else if (file2 == null) {
            MethodCollector.o(1013);
        } else {
            if (z && file2.exists()) {
                j.g(file2);
            }
            if (file.renameTo(file2)) {
                MethodCollector.o(1013);
                return;
            }
            EPLog.e("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
            IOException iOException = new IOException();
            MethodCollector.o(1013);
            throw iOException;
        }
    }

    public final long copyStream(InputStream inputStream, OutputStream outputStream, long j2, DownloadListener downloadListener) {
        MethodCollector.i(995);
        l.c(inputStream, "");
        l.c(outputStream, "");
        byte[] bArr = new byte[BUFFER_SIZE];
        int read = inputStream.read(bArr);
        long j3 = 0;
        while (read > 0) {
            if (outputStream != null) {
                outputStream.write(bArr, 0, read);
            }
            j3 += (long) read;
            if (j3 < j2 && j2 > 0 && downloadListener != null) {
                downloadListener.onProgress((int) ((((float) j3) / ((float) j2)) * 100.0f), j2);
            }
            read = inputStream.read(bArr);
        }
        if (downloadListener != null) {
            downloadListener.onProgress(100, j2);
        }
        MethodCollector.o(995);
        return j3;
    }

    public final synchronized void rename(File file, File file2, boolean z, boolean z2) {
        MethodCollector.i(1021);
        if (file == null) {
            MethodCollector.o(1021);
        } else if (file2 == null) {
            MethodCollector.o(1021);
        } else {
            if (z && !z2 && file2.exists()) {
                j.g(file2);
            }
            if (!file.renameTo(file2)) {
                if (!z2 || !z) {
                    EPLog.e("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
                    IOException iOException = new IOException();
                    MethodCollector.o(1021);
                    throw iOException;
                }
                j.g(file2);
                if (!file.renameTo(file2)) {
                    EPLog.e("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
                    IOException iOException2 = new IOException();
                    MethodCollector.o(1021);
                    throw iOException2;
                }
            }
            MethodCollector.o(1021);
        }
    }

    public final synchronized void rename(String str, String str2, boolean z, boolean z2) {
        MethodCollector.i(1005);
        if (str == null) {
            MethodCollector.o(1005);
        } else if (str2 == null) {
            MethodCollector.o(1005);
        } else {
            rename(new File(str), new File(str2), z, z2);
            MethodCollector.o(1005);
        }
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, File file, File file2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        fileUtils.rename(file, file2, z);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        fileUtils.rename(str, str2, z);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, File file, File file2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        fileUtils.rename(file, file2, z, z2);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, String str, String str2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        fileUtils.rename(str, str2, z, z2);
    }
}
