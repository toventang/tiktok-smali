package com.bef.effectsdk;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EffectSDKUtils {
    private static List<String> assetFiles = ModelsList.list;
    private static Set<File> localFiles = new HashSet();
    private static Set<File> needRemoveFiles = new HashSet();

    private static native String nativeGetSdkVersion();

    public static String getSdkVersion() {
        MethodCollector.i(885);
        String nativeGetSdkVersion = nativeGetSdkVersion();
        MethodCollector.o(885);
        return nativeGetSdkVersion;
    }

    static {
        Covode.recordClassIndex(2831);
    }

    private static void deleteNoUseModel() {
        for (File file : localFiles) {
            if (needRemoveFiles.contains(file) && file.exists()) {
                com_bef_effectsdk_EffectSDKUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    private static String getAssetRelativePath(String str) {
        int indexOf = str.indexOf("model/");
        if (indexOf >= 0) {
            return str.substring(indexOf + 6, str.length());
        }
        return str;
    }

    private static String getFileName(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1, str.length());
        }
        return "";
    }

    public static boolean com_bef_effectsdk_EffectSDKUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(758);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(758);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(758);
        return delete;
    }

    public static void flushAlgorithmModelFiles(Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, null, false);
        deleteNoUseModel();
        localFiles.clear();
    }

    private static File takeFirstMatchingOrNull(Set<File> set, FileFilter fileFilter) {
        for (File file : set) {
            if (fileFilter.accept(file)) {
                return file;
            }
        }
        return null;
    }

    private static void scanRecursive(String str, Set<File> set) {
        File[] listFiles;
        File file = new File(str);
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    scanRecursive(file2.getAbsolutePath(), set);
                } else {
                    set.add(file2);
                }
            }
        }
    }

    public static boolean needUpdate(final Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        try {
            if (assetFiles.size() > localFiles.size()) {
                return true;
            }
            for (final String str2 : assetFiles) {
                if (takeFirstMatchingOrNull(localFiles, new FileFilter() {
                    /* class com.bef.effectsdk.EffectSDKUtils.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(2832);
                    }

                    public final boolean accept(File file) {
                        MethodCollector.i(663);
                        boolean z = false;
                        if (str2.contains(file.getName())) {
                            InputStream inputStream = null;
                            try {
                                inputStream = context.getAssets().open(str2);
                                if (file.length() == ((long) inputStream.available())) {
                                    z = true;
                                }
                                return z;
                            } catch (IOException unused) {
                                return false;
                            } finally {
                                EffectSDKUtils.closeQuietly(inputStream);
                                MethodCollector.o(663);
                            }
                        } else {
                            MethodCollector.o(663);
                            return false;
                        }
                    }
                }) == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    private static void copyFile(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.i(750);
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(str);
            try {
                String str3 = str2 + str.substring(str.indexOf("model") + 6, str.lastIndexOf("/"));
                File file = new File(str3);
                if (file.exists() || file.mkdirs()) {
                    fileOutputStream = new FileOutputStream(new File(str3 + "/" + getFileName(str)));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    closeQuietly(open);
                                    return;
                                } finally {
                                    closeQuietly(fileOutputStream);
                                    MethodCollector.o(750);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = open;
                        try {
                            closeQuietly(inputStream);
                            throw th;
                        } finally {
                            closeQuietly(fileOutputStream);
                            MethodCollector.o(750);
                        }
                    }
                } else {
                    IOException iOException = new IOException("Can not mkdirs " + file.getPath());
                    MethodCollector.o(750);
                    throw iOException;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                inputStream = open;
                closeQuietly(inputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            closeQuietly(inputStream);
            throw th;
        }
    }

    public static void flushAlgorithmModelFiles(Context context, String str, String[] strArr, boolean z) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, strArr, z);
        deleteNoUseModel();
        localFiles.clear();
    }

    private static void copyAssets(Context context, String str, String[] strArr, boolean z) {
        if (!needRemoveFiles.isEmpty()) {
            needRemoveFiles.clear();
        }
        needRemoveFiles.addAll(localFiles);
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        for (String str2 : assetFiles) {
            final String fileName = getFileName(str2);
            File takeFirstMatchingOrNull = takeFirstMatchingOrNull(needRemoveFiles, new FileFilter() {
                /* class com.bef.effectsdk.EffectSDKUtils.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(2833);
                }

                public final boolean accept(File file) {
                    return file.getName().contains(fileName);
                }
            });
            if (takeFirstMatchingOrNull == null || !new File(str, getAssetRelativePath(str2)).exists()) {
                if (strArr != null && !TextUtils.isEmpty(fileName)) {
                    int length = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (!fileName.equals(strArr[i2])) {
                            i2++;
                        } else if (z) {
                            copyFile(context, str2, str);
                        }
                    }
                }
                if (!z) {
                    copyFile(context, str2, str);
                }
            } else {
                needRemoveFiles.remove(takeFirstMatchingOrNull);
            }
        }
    }
}
