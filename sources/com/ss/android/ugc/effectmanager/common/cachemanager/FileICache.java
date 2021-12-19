package com.ss.android.ugc.effectmanager.common.cachemanager;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import h.f.b.l;
import java.io.File;
import java.io.InputStream;
import java.util.regex.Pattern;

public class FileICache implements ICache {
    private String cacheDir;

    static {
        Covode.recordClassIndex(95271);
    }

    public final String getCacheDir() {
        return this.cacheDir;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void clear() {
        FileUtils.INSTANCE.removeDir(this.cacheDir);
    }

    public final void setCacheDir(String str) {
        l.c(str, "");
        this.cacheDir = str;
    }

    public FileICache(String str) {
        l.c(str, "");
        this.cacheDir = str;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean has(String str) {
        l.c(str, "");
        return FileUtils.INSTANCE.checkFileExists(generatePath(str));
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(String str) {
        l.c(str, "");
        removePattern(Pattern.compile(str));
    }

    private final String generatePath(String str) {
        return this.cacheDir + File.separator + str;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public InputStream queryToStream(String str) {
        InputStream fileStream;
        MethodCollector.i(805);
        l.c(str, "");
        String generatePath = generatePath(str);
        synchronized (FileICache.class) {
            try {
                fileStream = FileUtils.INSTANCE.getFileStream(generatePath);
            } finally {
                MethodCollector.o(805);
            }
        }
        return fileStream;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public String queryToValue(String str) {
        String fileContent;
        MethodCollector.i(803);
        l.c(str, "");
        String generatePath = generatePath(str);
        synchronized (FileICache.class) {
            try {
                fileContent = FileUtils.INSTANCE.getFileContent(generatePath);
                if (TextUtils.isEmpty(fileContent)) {
                    fileContent = "";
                }
            } finally {
                MethodCollector.o(803);
            }
        }
        return fileContent;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public boolean remove(String str) {
        boolean removeFile;
        MethodCollector.i(806);
        l.c(str, "");
        synchronized (FileICache.class) {
            try {
                removeFile = FileUtils.INSTANCE.removeFile(generatePath(str));
            } finally {
                MethodCollector.o(806);
            }
        }
        return removeFile;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public void removePattern(Pattern pattern) {
        MethodCollector.i(809);
        if (pattern != null) {
            synchronized (FileICache.class) {
                try {
                    File[] listFiles = new File(this.cacheDir).listFiles(new FileICache$removePattern$$inlined$apply$lambda$1(pattern, this));
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            com_ss_android_ugc_effectmanager_common_cachemanager_FileICache_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                        }
                        MethodCollector.o(809);
                    }
                } finally {
                    MethodCollector.o(809);
                }
            }
        } else {
            MethodCollector.o(809);
        }
    }

    public static boolean com_ss_android_ugc_effectmanager_common_cachemanager_FileICache_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(819);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(819);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(819);
        return delete;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String str, InputStream inputStream) {
        long writeToExternal;
        MethodCollector.i(802);
        l.c(str, "");
        l.c(inputStream, "");
        synchronized (FileICache.class) {
            try {
                writeToExternal = FileUtils.INSTANCE.writeToExternal(inputStream, generatePath(str));
            } finally {
                MethodCollector.o(802);
            }
        }
        return writeToExternal;
    }

    @Override // com.ss.android.ugc.effectmanager.common.cachemanager.ICache
    public long save(String str, String str2) {
        long writeToExternal;
        MethodCollector.i(796);
        l.c(str, "");
        l.c(str2, "");
        synchronized (FileICache.class) {
            try {
                writeToExternal = FileUtils.INSTANCE.writeToExternal(str2, generatePath(str));
            } finally {
                MethodCollector.o(796);
            }
        }
        return writeToExternal;
    }
}
