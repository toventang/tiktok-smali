package com.ss.android.ttve.nativePort;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.vesdk.an;
import java.lang.reflect.Field;

public class TEContentProviderUtils {
    private static Application _initApplication;

    static {
        Covode.recordClassIndex(37715);
    }

    public static ContentResolver getContentResolver() {
        Application applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext.getContentResolver();
        }
        return null;
    }

    private static Application getApplicationContext() {
        if (_initApplication == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, null);
                declaredField.setAccessible(true);
                _initApplication = (Application) declaredField.get(invoke);
            } catch (Throwable th) {
                an.a(TEContentProviderUtils.class, "[getApplicationContext] err", th);
            }
        }
        return _initApplication;
    }

    public static String getExtensionFromUri(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(getFileTypeFromUri(str));
    }

    private static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static String convertUriPathFromNative(String str) {
        Application applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            ContentResolver contentResolver = applicationContext.getContentResolver();
            Uri parse = Uri.parse(str);
            if (parse == null || contentResolver == null) {
                return null;
            }
            String convertUriPath = convertUriPath(applicationContext, parse);
            an.a("TEContentProviderUtils-Q", "[convertUriPathFromNative] uriPath = " + str + ", convertPath = " + convertUriPath);
            return convertUriPath;
        } catch (Throwable th) {
            an.a(TEContentProviderUtils.class, "[getFd] err", th);
            return null;
        }
    }

    public static String getFileTypeFromUri(String str) {
        Application applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            ContentResolver contentResolver = applicationContext.getContentResolver();
            if (parse == null || contentResolver == null) {
                return null;
            }
            return contentResolver.getType(parse);
        } catch (Throwable th) {
            an.a(TEContentProviderUtils.class, "[getFileTypeFromUri] err", th);
            return null;
        }
    }

    public static int getFd(String str, String str2) {
        MethodCollector.i(159);
        Application applicationContext = getApplicationContext();
        int i2 = -1;
        if (applicationContext != null) {
            try {
                ContentResolver contentResolver = applicationContext.getContentResolver();
                Uri parse = Uri.parse(str);
                if (!(parse == null || contentResolver == null)) {
                    i2 = contentResolver.openFileDescriptor(parse, str2).detachFd();
                }
            } catch (Throwable th) {
                an.a(TEContentProviderUtils.class, "[getFd] err", th);
            }
        }
        MethodCollector.o(159);
        return i2;
    }

    private static String convertUriPath(Context context, Uri uri) {
        int i2 = Build.VERSION.SDK_INT;
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (isDownloadsDocument(uri)) {
                return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri))), null, null);
            } else if (isMediaDocument(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (DataType.AUDIO.equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            if (isGooglePhotosUri(uri)) {
                return uri.getLastPathSegment();
            }
            return getDataColumn(context, uri, null, null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getDataColumn(android.content.Context r10, android.net.Uri r11, java.lang.String r12, java.lang.String[] r13) {
        /*
            r4 = 1588(0x634, float:2.225E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.lang.String r3 = "_data"
            java.lang.String[] r7 = new java.lang.String[]{r3}
            r2 = 0
            android.content.ContentResolver r5 = r10.getContentResolver()     // Catch:{ all -> 0x003b }
            r10 = 0
            r6 = r11
            r8 = r12
            r9 = r13
            android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0032
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0032
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x002f }
            r1.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x002f:
            r0 = move-exception
            r2 = r1
            goto L_0x003c
        L_0x0032:
            if (r1 == 0) goto L_0x0037
            r1.close()
        L_0x0037:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r2
        L_0x003b:
            r0 = move-exception
        L_0x003c:
            if (r2 == 0) goto L_0x0041
            r2.close()
        L_0x0041:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEContentProviderUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }
}
