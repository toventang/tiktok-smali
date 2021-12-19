package net.jpountz.util;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public enum Native {
    ;
    
    private static boolean loaded;

    private static String arch() {
        return System.getProperty("os.arch");
    }

    static {
        Covode.recordClassIndex(106020);
    }

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (Native.class) {
            MethodCollector.i(5401);
            z = loaded;
            MethodCollector.o(5401);
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public enum OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");
        
        public final String libExtension;
        public final String name;

        static {
            Covode.recordClassIndex(106021);
        }

        private OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    private static OS os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return OS.LINUX;
        }
        if (property.contains("Mac")) {
            return OS.MAC;
        }
        if (property.contains("Windows")) {
            return OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return OS.SOLARIS;
        }
        throw new UnsupportedOperationException("Unsupported operating system: ".concat(String.valueOf(property)));
    }

    private static String resourceName() {
        OS os = os();
        return "/" + Native.class.getPackage().getName().replace('.', '/') + "/" + os.name + "/" + arch() + "/liblz4-java." + os.libExtension;
    }

    public static synchronized void load() {
        File createTempFile;
        FileOutputStream fileOutputStream;
        synchronized (Native.class) {
            MethodCollector.i(5409);
            if (loaded) {
                MethodCollector.o(5409);
                return;
            }
            try {
                net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("lz4-java");
                loaded = true;
                MethodCollector.o(5409);
            } catch (UnsatisfiedLinkError unused) {
                String resourceName = resourceName();
                InputStream resourceAsStream = Native.class.getResourceAsStream(resourceName);
                if (resourceAsStream != null) {
                    try {
                        createTempFile = File.createTempFile("liblz4-java", "." + os().libExtension);
                        fileOutputStream = new FileOutputStream(createTempFile);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = resourceAsStream.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    break;
                                } catch (IOException unused2) {
                                }
                            }
                        }
                        fileOutputStream.close();
                        fileOutputStream = null;
                        net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(createTempFile.getAbsolutePath());
                        loaded = true;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (!createTempFile.exists()) {
                            MethodCollector.o(5409);
                        } else if (!loaded) {
                            net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_delete(createTempFile);
                            MethodCollector.o(5409);
                        } else {
                            net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_deleteOnExit(createTempFile);
                            MethodCollector.o(5409);
                        }
                    } catch (IOException unused4) {
                        ExceptionInInitializerError exceptionInInitializerError = new ExceptionInInitializerError("Cannot unpack liblz4-java");
                        MethodCollector.o(5409);
                        throw exceptionInInitializerError;
                    }
                } else {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Unsupported OS/arch, cannot find " + resourceName + ". Please try building from source.");
                    MethodCollector.o(5409);
                    throw unsupportedOperationException;
                }
            } catch (Throwable th) {
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                if (createTempFile != null && createTempFile.exists()) {
                    if (!loaded) {
                        net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_delete(createTempFile);
                    } else {
                        net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_deleteOnExit(createTempFile);
                    }
                }
                MethodCollector.o(5409);
                throw th;
            }
        }
    }

    public static void net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str);
        m.a(uptimeMillis, str);
    }

    public static void net_jpountz_util_Native_com_ss_android_ugc_aweme_lancet_LoadSoLancet_load(String str) {
        MethodCollector.i(5411);
        long uptimeMillis = SystemClock.uptimeMillis();
        System.load(str);
        m.a(uptimeMillis, str);
        MethodCollector.o(5411);
    }

    public static boolean net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(5414);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(5414);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5414);
        return delete;
    }

    public static void net_jpountz_util_Native_com_ss_android_ugc_aweme_storage_FileLancet_deleteOnExit(File file) {
        MethodCollector.i(5423);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(5423);
                return;
            }
        } catch (Throwable unused) {
        }
        file.deleteOnExit();
        MethodCollector.o(5423);
    }
}
