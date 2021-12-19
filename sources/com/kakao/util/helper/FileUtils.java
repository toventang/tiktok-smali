package com.kakao.util.helper;

import android.os.Environment;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.kakao.util.helper.log.Logger;
import java.io.File;
import java.util.Locale;

public class FileUtils {
    static {
        Covode.recordClassIndex(34482);
    }

    public static File getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory();
    }

    public static File getExternalStorageTempFile() {
        return getExternalStorageTempFile(null);
    }

    public static File getExternalStorageCacheDir() {
        File file = new File(a.a(Locale.US, "%s/%s", new Object[]{getExternalStorageDataDir(), "cache"}));
        if (!file.exists() && !file.mkdirs()) {
            Logger.e("failed to create dir: " + file.getPath());
        }
        return file;
    }

    public static File getExternalStorageDataDir() {
        File file = new File(a.a(Locale.US, "%s/Android/data/%s", new Object[]{getExternalStorageDirectory(), "com.kakao.sdk"}));
        if (file.exists() || file.mkdirs()) {
            return null;
        }
        Logger.e("failed to create dir: " + file.getPath());
        return null;
    }

    public static File getExternalStorageTempDir() {
        File file = new File(getExternalStorageDataDir(), "tmp");
        if (!file.exists() && !file.mkdirs()) {
            Logger.e("failed to create dir: " + file.getPath());
        }
        return file;
    }

    public static File getExternalStorageTempFile(String str) {
        String fileName;
        if (TextUtils.isEmpty(str)) {
            fileName = "tmp";
        } else {
            fileName = toFileName(str, "_");
        }
        return new File(getExternalStorageTempDir(), a.a(Locale.US, "temp_%s.%s", new Object[]{Long.valueOf(System.currentTimeMillis()), fileName}));
    }

    public static String toFileName(String str, String str2) {
        return str.replaceAll("[\"*/:<>?\\\\|]", str2);
    }
}
