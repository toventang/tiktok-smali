package com.bytedance.boost_multidex;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class Utility {
    static {
        Covode.recordClassIndex(15656);
    }

    static void clearDirFiles(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Monitor.get().logWarning("Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Monitor.get().logInfo("Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!com_bytedance_boost_multidex_Utility_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2)) {
                    Monitor.get().logWarning("Failed to delete old file " + file2.getPath());
                } else {
                    Monitor.get().logInfo("Deleted old file " + file2.getPath());
                }
            }
        }
    }

    static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                Monitor.get().logWarning("Failed to close resource", e2);
            }
        }
    }

    static long doFileCheckSum(File file) {
        long j2;
        Throwable th;
        MethodCollector.i(7028);
        if (!file.exists()) {
            Monitor.get().logInfo("File is not exist: " + file.getPath());
            MethodCollector.o(7028);
            return 0;
        }
        if (Monitor.get().isEnableNativeCheckSum()) {
            try {
                j2 = BoostNative.obtainCheckSum(file.getPath());
                if (j2 == 0) {
                }
            } catch (Throwable th2) {
                Monitor.get().logWarning("Failed to native obtainCheckSum in " + file.getPath(), th2);
            }
            MethodCollector.o(7028);
            return j2;
        }
        Monitor.get().logWarning("Fall back to java impl");
        CheckedInputStream checkedInputStream = null;
        byte[] bArr = new byte[8192];
        try {
            CheckedInputStream checkedInputStream2 = new CheckedInputStream(new FileInputStream(file), new Adler32());
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    checkedInputStream = checkedInputStream2;
                    closeQuietly(checkedInputStream);
                    MethodCollector.o(7028);
                    throw th;
                }
            } while (checkedInputStream2.read(bArr) >= 0);
            j2 = checkedInputStream2.getChecksum().getValue();
            closeQuietly(checkedInputStream2);
            MethodCollector.o(7028);
            return j2;
        } catch (Throwable th4) {
            th = th4;
            closeQuietly(checkedInputStream);
            MethodCollector.o(7028);
            throw th;
        }
    }

    static long doZipCheckSum(File file) {
        Throwable th;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length() - 22;
                if (length >= 0) {
                    long j2 = length - 65536;
                    if (j2 < 0) {
                        j2 = 0;
                    }
                    int reverseBytes = Integer.reverseBytes(101010256);
                    while (true) {
                        randomAccessFile2.seek(length);
                        if (randomAccessFile2.readInt() != reverseBytes) {
                            length--;
                            if (length < j2) {
                                throw new ZipException("End Of Central Directory signature not found");
                            }
                        } else {
                            randomAccessFile2.skipBytes(2);
                            randomAccessFile2.skipBytes(2);
                            randomAccessFile2.skipBytes(2);
                            randomAccessFile2.skipBytes(2);
                            long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile2.readInt())) & 4294967295L;
                            CRC32 crc32 = new CRC32();
                            randomAccessFile2.seek(4294967295L & ((long) Integer.reverseBytes(randomAccessFile2.readInt())));
                            byte[] bArr = new byte[8192];
                            int read = randomAccessFile2.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                            while (read != -1) {
                                crc32.update(bArr, 0, read);
                                reverseBytes2 -= (long) read;
                                if (reverseBytes2 == 0) {
                                    break;
                                }
                                read = randomAccessFile2.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                            }
                            long value = crc32.getValue();
                            closeQuietly(randomAccessFile2);
                            return value;
                        }
                    }
                } else {
                    throw new ZipException("File too short to be a zip file: " + randomAccessFile2.length());
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                closeQuietly(randomAccessFile);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeQuietly(randomAccessFile);
            throw th;
        }
    }

    static File ensureDirCreated(File file, String str) {
        File file2 = new File(file, str);
        mkdirChecked(file2);
        return file2;
    }

    static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj.getClass(), str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    static Constructor findConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    static Field findField(Class<?> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:2:0x0003 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v10 */
    static Field findFieldRecursively(Class<?> cls, String str) {
        Class cls2 = cls;
        while (cls2 != 0) {
            try {
                cls2 = findField(cls2, str);
                return cls2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:2:0x0003 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v12 */
    static Method findMethodRecursively(Class<?> cls, String str, Class<?>... clsArr) {
        Class cls2 = cls;
        while (cls2 != 0) {
            try {
                cls2 = findMethod(cls2, str, clsArr);
                return cls2;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    static String getCurProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) com_bytedance_boost_multidex_Utility_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    static boolean isBetterUseApkBuf() {
        Runtime runtime = Runtime.getRuntime();
        long freeSpace = Environment.getDataDirectory().getFreeSpace();
        long maxMemory = runtime.maxMemory() - runtime.totalMemory();
        Monitor.get().logInfo("Memory remains " + maxMemory + ", free space " + freeSpace);
        return maxMemory > 128000000 || freeSpace < 20000000;
    }

    static boolean isOptimizeProcess(String str) {
        return str != null && str.endsWith(":boost_multidex");
    }

    static void mkdirChecked(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Monitor.get().logError("Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Monitor.get().logError("Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    static byte[] obtainBytesFromInputStream(InputStream inputStream) {
        MethodCollector.i(7179);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            closeQuietly(byteArrayOutputStream);
            MethodCollector.o(7179);
        }
    }

    static byte[] obtainBytesInFile(File file) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IOException e2;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file.getPath(), "r");
            try {
                byte[] bArr = new byte[((int) randomAccessFile.length())];
                randomAccessFile.readFully(bArr);
                closeQuietly(randomAccessFile);
                return bArr;
            } catch (IOException e3) {
                e2 = e3;
                try {
                    Monitor.get().logWarning("Fail to get bytes of file", e2);
                    closeQuietly(randomAccessFile);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                    closeQuietly(randomAccessFile2);
                    throw th;
                }
            }
        } catch (IOException e4) {
            e2 = e4;
            randomAccessFile = null;
            Monitor.get().logWarning("Fail to get bytes of file", e2);
            closeQuietly(randomAccessFile);
            return null;
        } catch (Throwable th3) {
            th = th3;
            closeQuietly(randomAccessFile2);
            throw th;
        }
    }

    static byte[] obtainEntryBytesInZip(ZipFile zipFile, ZipEntry zipEntry) {
        Throwable th;
        InputStream inputStream;
        MethodCollector.i(7176);
        InputStream inputStream2 = null;
        IOException e2 = null;
        for (int i2 = 3; i2 > 0; i2--) {
            try {
                inputStream = zipFile.getInputStream(zipEntry);
                try {
                    byte[] obtainBytesFromInputStream = obtainBytesFromInputStream(inputStream);
                    closeQuietly(inputStream);
                    MethodCollector.o(7176);
                    return obtainBytesFromInputStream;
                } catch (IOException e3) {
                    e2 = e3;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    closeQuietly(inputStream2);
                    MethodCollector.o(7176);
                    throw th;
                }
            } catch (IOException e4) {
                e2 = e4;
                inputStream = null;
                closeQuietly(inputStream);
            } catch (Throwable th3) {
                th = th3;
                closeQuietly(inputStream2);
                MethodCollector.o(7176);
                throw th;
            }
        }
        MethodCollector.o(7176);
        throw e2;
    }

    static File obtainEntryFileFromInputStream(InputStream inputStream, File file) {
        MethodCollector.i(7172);
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        Monitor.get().logInfo("Extracting " + createTempFile.getPath());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            if (createTempFile.setReadOnly()) {
                Monitor.get().logInfo("Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                IOException iOException = new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                MethodCollector.o(7172);
                throw iOException;
            }
            IOException iOException2 = new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            MethodCollector.o(7172);
            throw iOException2;
        } finally {
            closeQuietly(fileOutputStream);
            com_bytedance_boost_multidex_Utility_com_ss_android_ugc_aweme_storage_FileLancet_delete(createTempFile);
            MethodCollector.o(7172);
        }
    }

    static File obtainEntryFileInZip(ZipFile zipFile, ZipEntry zipEntry, File file) {
        MethodCollector.i(7142);
        IOException e2 = null;
        for (int i2 = 3; i2 > 0; i2--) {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                File obtainEntryFileFromInputStream = obtainEntryFileFromInputStream(inputStream, file);
                closeQuietly(inputStream);
                MethodCollector.o(7142);
                return obtainEntryFileFromInputStream;
            } catch (IOException e3) {
                e2 = e3;
                closeQuietly(inputStream);
            } catch (Throwable th) {
                closeQuietly(inputStream);
                MethodCollector.o(7142);
                throw th;
            }
        }
        MethodCollector.o(7142);
        throw e2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void obtainZipForEntryFileInZip(java.util.zip.ZipFile r8, java.util.zip.ZipEntry r9, java.io.File r10) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.Utility.obtainZipForEntryFileInZip(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):void");
    }

    static boolean storeBytesToFile(byte[] bArr, File file) {
        Throwable th;
        boolean z;
        IOException e2;
        MethodCollector.i(7370);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                closeQuietly(fileOutputStream2);
                z = true;
            } catch (IOException e3) {
                e2 = e3;
                fileOutputStream = fileOutputStream2;
                try {
                    Monitor.get().logError("fail to store bytes to file", e2);
                    closeQuietly(fileOutputStream);
                    z = false;
                    MethodCollector.o(7370);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(fileOutputStream);
                    MethodCollector.o(7370);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                closeQuietly(fileOutputStream);
                MethodCollector.o(7370);
                throw th;
            }
        } catch (IOException e4) {
            e2 = e4;
            Monitor.get().logError("fail to store bytes to file", e2);
            closeQuietly(fileOutputStream);
            z = false;
            MethodCollector.o(7370);
            return z;
        }
        MethodCollector.o(7370);
        return z;
    }

    public static boolean com_bytedance_boost_multidex_Utility_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(7002);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(7002);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7002);
        return delete;
    }

    public static Object com_bytedance_boost_multidex_Utility_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(7386);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(7386);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
