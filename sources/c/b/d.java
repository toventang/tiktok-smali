package c.b;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import c.a.a;
import c.d.b;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final a f4884a = a.C0068a.f4876a;

    static {
        Covode.recordClassIndex(1926);
    }

    public static a a(String str) {
        return new a(str);
    }

    public static long b(Context context) {
        if (Environment.getDataDirectory() != null) {
            return b(d(context).getParent());
        }
        return -1;
    }

    public static long c(Context context) {
        if (Environment.getDataDirectory() != null) {
            return c(d(context).getParent());
        }
        return -1;
    }

    private static File d(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    public static String a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107193a == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
            com.ss.android.ugc.aweme.lancet.d.f107193a = context.getExternalCacheDir();
        }
        return com.ss.android.ugc.aweme.lancet.d.f107193a.getParent();
    }

    private static long b(String str) {
        long j2;
        long j3;
        try {
            StatFs statFs = new StatFs(str);
            if (b.a()) {
                j2 = statFs.getBlockSizeLong();
                j3 = statFs.getAvailableBlocksLong();
            } else {
                j2 = (long) statFs.getBlockSize();
                j3 = (long) statFs.getAvailableBlocks();
            }
            return j2 * j3;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    private static long c(String str) {
        long j2;
        long j3;
        try {
            StatFs statFs = new StatFs(str);
            if (b.a()) {
                j2 = statFs.getBlockSizeLong();
                j3 = statFs.getBlockCountLong();
            } else {
                j2 = (long) statFs.getBlockSize();
                j3 = (long) statFs.getBlockCount();
            }
            return j2 * j3;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    public static Uri a(Context context, String str) {
        return e.a(context, str, "image/jpeg");
    }

    public static void a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(5881);
        try {
            byte[] bArr = new byte[4096];
            if (outputStream != null) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return;
                    }
                }
            } else {
                IOException iOException = new IOException("Failed to copy input:" + inputStream + "output:" + outputStream);
                MethodCollector.o(5881);
                throw iOException;
            }
        } finally {
            b.a(inputStream);
            b.a(outputStream);
            MethodCollector.o(5881);
        }
    }

    public static InputStream a(Context context, Uri uri) {
        Uri uri2;
        MethodCollector.i(5922);
        if (uri == null) {
            MethodCollector.o(5922);
            return null;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            FileInputStream fileInputStream = new FileInputStream(uri.getPath());
            MethodCollector.o(5922);
            return fileInputStream;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (DocumentsContract.isDocumentUri(context, uri) && TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            String str = split[0];
            if (TextUtils.equals("image", str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                if (b.b()) {
                    uri2 = MediaStore.Images.Media.getContentUri("external_primary");
                }
            } else if (TextUtils.equals("video", str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                if (b.b()) {
                    uri2 = MediaStore.Video.Media.getContentUri("external_primary");
                }
            } else if (TextUtils.equals(DataType.AUDIO, str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                if (b.b()) {
                    uri2 = MediaStore.Audio.Media.getContentUri("external_primary");
                }
            } else {
                uri2 = null;
            }
            if (TextUtils.isEmpty(split[1])) {
                MethodCollector.o(5922);
                return null;
            }
            InputStream openInputStream = context.getContentResolver().openInputStream(ContentUris.withAppendedId(uri2, Long.parseLong(split[1])));
            MethodCollector.o(5922);
            return openInputStream;
        } else if (!"content".equals(scheme) || !"media".equals(uri.getAuthority())) {
            String a2 = c.d.a.a(context, uri);
            if (TextUtils.isEmpty(a2) || !new File(a2).exists()) {
                MethodCollector.o(5922);
                return null;
            }
            FileInputStream fileInputStream2 = new FileInputStream(new File(a2));
            MethodCollector.o(5922);
            return fileInputStream2;
        } else {
            InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
            MethodCollector.o(5922);
            return openInputStream2;
        }
    }

    public static void a(File file, FileOutputStream fileOutputStream) {
        Throwable th;
        MethodCollector.i(5832);
        a a2 = a.a(file);
        if (!a2.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Failed to copy from->" + a2 + "to->" + fileOutputStream.getFD() + "because of srcFile not exist");
            MethodCollector.o(5832);
            throw fileNotFoundException;
        } else if (a2.length() != -1) {
            fileOutputStream.getFD();
            FileInputStream fileInputStream = null;
            try {
                byte[] bArr = new byte[4096];
                FileInputStream fileInputStream2 = new FileInputStream(a2);
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read >= 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            b.a(fileInputStream2);
                            b.a(fileOutputStream);
                            MethodCollector.o(5832);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        b.a(fileInputStream);
                        b.a(fileOutputStream);
                        MethodCollector.o(5832);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                b.a(fileInputStream);
                b.a(fileOutputStream);
                MethodCollector.o(5832);
                throw th;
            }
        } else {
            IOException iOException = new IOException("Failed to copy from->" + a2 + " to->" + fileOutputStream.getFD() + " fileLen=-1");
            MethodCollector.o(5832);
            throw iOException;
        }
    }

    public static ParcelFileDescriptor a(Context context, Uri uri, String str) {
        MethodCollector.i(5883);
        ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, str);
        MethodCollector.o(5883);
        return openFileDescriptor;
    }
}
