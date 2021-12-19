package c.b;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import c.d.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f4885a = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "relative_path", "datetaken", "orientation"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f4886b = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "_data", "datetaken", "orientation"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f4887c = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "relative_path", "datetaken", "resolution"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f4888d = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "_data", "datetaken", "resolution"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f4889e = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "is_music", "album", "album_id", "artist", "title", "relative_path", "datetaken"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f4890f = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "album", "album_id", "artist", "title", "is_music", "_data"};

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f4891g = {"1", "3"};

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f4892h = {"image/jpeg", "image/png", "image/gif", "image/webp", "image/bmp"};

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f4893i = {"video/webm", "video/mp4", "video/ogg", "video/flv", "video/avi", "video/wmv", "video/rmvb"};

    /* renamed from: j  reason: collision with root package name */
    private static final String[] f4894j = {"audio/mp3", "audio/midi", "audio/wav", "audio/m3u", "audio/m4a", "audio/ogg", "audio/ra"};

    static {
        Covode.recordClassIndex(1927);
    }

    public static Uri a(Context context, String str) {
        return b(context, str, "video/mp4");
    }

    public static String b(Context context, Uri uri) {
        return context.getContentResolver().getType(uri);
    }

    public static Uri b(Context context, String str) {
        return d(context, str, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    public static void c(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
        MediaScannerConnection.scanFile(context, new String[]{str}, null, null);
    }

    public static long a(Context context, Uri uri) {
        MethodCollector.i(2441);
        if ("file".equals(uri.getScheme())) {
            long length = new File(uri.getPath()).length();
            MethodCollector.o(2441);
            return length;
        } else if ("content".equals(uri.getScheme())) {
            try {
                long statSize = context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
                MethodCollector.o(2441);
                return statSize;
            } catch (Exception unused) {
                MethodCollector.o(2441);
                return 0;
            }
        } else {
            MethodCollector.o(2441);
            return 0;
        }
    }

    public static boolean c(Context context, Uri uri) {
        MethodCollector.i(2759);
        if (context == null || uri == null) {
            MethodCollector.o(2759);
            return false;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                MethodCollector.o(2759);
                return false;
            }
            try {
                openAssetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.o(2759);
            return true;
        } catch (FileNotFoundException unused2) {
            MethodCollector.o(2759);
            return false;
        }
    }

    public static Uri c(Context context, String str, String str2) {
        return c(context, str, str2, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    public static Uri b(Context context, String str, String str2) {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/" + Environment.DIRECTORY_DCIM + "/Camera");
        if (!file.exists()) {
            file.mkdirs();
        }
        return b(context, str, str2, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    public static Uri a(Context context, String str, String str2) {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/" + Environment.DIRECTORY_DCIM + "/Camera");
        if (!file.exists()) {
            file.mkdirs();
        }
        return a(context, str, str2, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri d(android.content.Context r14, java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.d(android.content.Context, java.lang.String, java.lang.String):android.net.Uri");
    }

    public static Uri b(Context context, String str, String str2, String str3) {
        Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (b.b()) {
            uri = MediaStore.Video.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", b.a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
        }
        return context.getContentResolver().insert(uri, contentValues);
    }

    public static Uri a(Context context, String str, String str2, String str3) {
        Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (b.b()) {
            uri = MediaStore.Images.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", b.a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
        }
        return context.getContentResolver().insert(uri, contentValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0188 A[EDGE_INSN: B:69:0x0188->B:50:0x0188 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri c(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.e.c(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public static List<f> b(Context context, String str, String[] strArr, String str2, int i2, int i3) {
        Cursor cursor;
        int columnIndexOrThrow;
        String str3 = str2;
        MethodCollector.i(2746);
        ArrayList arrayList = new ArrayList();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor2 = null;
        try {
            if (b.c()) {
                cursor = context.getContentResolver().query(uri, f4885a, b.a(str, strArr, i2, i3), null);
            } else if (b.b()) {
                if (i2 > 0) {
                    str3 = str3 + (" LIMIT " + i2 + " OFFSET " + i3);
                }
                cursor = context.getContentResolver().query(uri, f4885a, str, strArr, str3);
            } else {
                if (i2 > 0) {
                    str3 = str3 + (" LIMIT " + i2 + " OFFSET " + i3);
                }
                cursor = context.getContentResolver().query(uri, f4886b, str, strArr, str3);
            }
            if (cursor == null) {
                MethodCollector.o(2746);
                return arrayList;
            }
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("date_modified");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("date_added");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("mime_type");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("_size");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("width");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("height");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("datetaken");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("orientation");
            int i4 = -1;
            if (b.b()) {
                i4 = cursor.getColumnIndexOrThrow("relative_path");
                columnIndexOrThrow = -1;
            } else {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            }
            int length = (Environment.getExternalStorageDirectory().getPath() + "/").length();
            while (cursor.moveToNext()) {
                f fVar = new f();
                long j2 = cursor.getLong(columnIndexOrThrow2);
                fVar.f4895a = j2;
                fVar.f4896b = cursor.getString(columnIndexOrThrow3);
                fVar.f4897c = cursor.getLong(columnIndexOrThrow4);
                fVar.f4898d = cursor.getLong(columnIndexOrThrow5);
                fVar.f4899e = cursor.getString(columnIndexOrThrow6);
                fVar.f4901g = cursor.getLong(columnIndexOrThrow7);
                fVar.f4902h = cursor.getInt(columnIndexOrThrow8);
                fVar.f4903i = cursor.getInt(columnIndexOrThrow9);
                fVar.f4907m = cursor.getLong(columnIndexOrThrow10);
                fVar.n = cursor.getInt(columnIndexOrThrow11);
                if (b.b()) {
                    fVar.f4906l = cursor.getString(i4);
                } else {
                    String string = cursor.getString(columnIndexOrThrow);
                    try {
                        fVar.f4906l = string.substring(length, string.lastIndexOf(File.separator)) + File.separator;
                    } catch (IndexOutOfBoundsException unused) {
                        fVar.f4906l = "";
                    }
                }
                fVar.f4905k = ContentUris.withAppendedId(uri, j2);
                arrayList.add(fVar);
            }
            cursor.close();
            MethodCollector.o(2746);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor2.close();
            }
            MethodCollector.o(2746);
            throw th;
        }
    }

    public static List<f> a(Context context, String str, String[] strArr, String str2, int i2, int i3) {
        Cursor cursor;
        int columnIndexOrThrow;
        int i4;
        String str3 = str2;
        MethodCollector.i(2731);
        ArrayList arrayList = new ArrayList();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor2 = null;
        try {
            if (b.c()) {
                cursor = context.getContentResolver().query(uri, f4887c, b.a(str, strArr, i2, i3), null);
            } else if (b.b()) {
                if (i2 > 0) {
                    str3 = str3 + (" LIMIT " + i2 + " OFFSET " + i3);
                }
                cursor = context.getContentResolver().query(uri, f4887c, str, strArr, str3);
            } else {
                if (i2 > 0) {
                    str3 = str3 + (" LIMIT " + i2 + " OFFSET " + i3);
                }
                cursor = context.getContentResolver().query(uri, f4888d, str, strArr, str3);
            }
            if (cursor == null) {
                MethodCollector.o(2731);
                return arrayList;
            }
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("date_modified");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("date_added");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("mime_type");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("_size");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("width");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("height");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("duration");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("datetaken");
            int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("resolution");
            if (b.b()) {
                i4 = cursor.getColumnIndexOrThrow("relative_path");
                columnIndexOrThrow = -1;
            } else {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                i4 = -1;
            }
            int length = (Environment.getExternalStorageDirectory().getPath() + "/").length();
            while (cursor.moveToNext()) {
                f fVar = new f();
                long j2 = cursor.getLong(columnIndexOrThrow2);
                fVar.f4895a = j2;
                fVar.f4896b = cursor.getString(columnIndexOrThrow3);
                fVar.f4897c = cursor.getLong(columnIndexOrThrow4);
                fVar.f4898d = cursor.getLong(columnIndexOrThrow5);
                fVar.f4899e = cursor.getString(columnIndexOrThrow6);
                fVar.f4901g = cursor.getLong(columnIndexOrThrow7);
                fVar.f4902h = cursor.getInt(columnIndexOrThrow8);
                fVar.f4903i = cursor.getInt(columnIndexOrThrow9);
                fVar.f4900f = cursor.getLong(columnIndexOrThrow10);
                fVar.f4907m = cursor.getLong(columnIndexOrThrow11);
                fVar.o = cursor.getString(columnIndexOrThrow12);
                if (b.b()) {
                    fVar.f4906l = cursor.getString(i4);
                } else {
                    String string = cursor.getString(columnIndexOrThrow);
                    try {
                        fVar.f4906l = string.substring(length, string.lastIndexOf(File.separator)) + File.separator;
                    } catch (IndexOutOfBoundsException unused) {
                        fVar.f4906l = "";
                    }
                }
                fVar.f4905k = ContentUris.withAppendedId(uri, j2);
                arrayList.add(fVar);
            }
            cursor.close();
            MethodCollector.o(2731);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor2.close();
            }
            MethodCollector.o(2731);
            throw th;
        }
    }
}
