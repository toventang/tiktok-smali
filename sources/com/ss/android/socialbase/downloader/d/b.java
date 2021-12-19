package com.ss.android.socialbase.downloader.d;

import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.k.g;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static SparseArray<a> f60369a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public Uri f60370a;

        /* renamed from: b  reason: collision with root package name */
        public String f60371b;

        /* renamed from: c  reason: collision with root package name */
        public String f60372c;

        static {
            Covode.recordClassIndex(37260);
        }

        a() {
        }

        static a a(Uri uri, String str) {
            a aVar = new a();
            aVar.f60370a = uri;
            aVar.f60371b = uri.toString();
            aVar.f60372c = str;
            return aVar;
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(37259);
        try {
            f60369a = new SparseArray<>();
            if (Build.VERSION.SDK_INT >= 29) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f60369a.put(2, a.a(MediaStore.Images.Media.getContentUri("external_primary"), "_id"));
                f60369a.put(3, a.a(MediaStore.Video.Media.getContentUri("external_primary"), "_id"));
                f60369a.put(4, a.a(MediaStore.Audio.Media.getContentUri("external_primary"), "_id"));
                return;
            }
            f60369a.put(2, a.a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id"));
            f60369a.put(3, a.a(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, "_id"));
            f60369a.put(4, a.a(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "_id"));
        } catch (Throwable unused) {
        }
    }

    public static long a(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            parcelFileDescriptor = b(uri, "r");
            try {
                long statSize = parcelFileDescriptor.getStatSize();
                g.a(parcelFileDescriptor);
                return statSize;
            } catch (Throwable unused) {
                g.a(parcelFileDescriptor);
                return -1;
            }
        } catch (Throwable unused2) {
            parcelFileDescriptor = null;
            g.a(parcelFileDescriptor);
            return -1;
        }
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 5;
        }
        if (!str.startsWith("content")) {
            return 1;
        }
        for (int i2 = 0; i2 < f60369a.size(); i2++) {
            int keyAt = f60369a.keyAt(i2);
            if (str.startsWith(f60369a.get(keyAt).f60371b)) {
                return keyAt;
            }
        }
        return 5;
    }

    public static boolean a(a aVar) {
        if (!aVar.b() || aVar.a() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean a(FileOutputStream fileOutputStream) {
        MethodCollector.i(13967);
        try {
            fileOutputStream.write(new byte[0]);
            fileOutputStream.close();
            MethodCollector.o(13967);
            return true;
        } catch (Throwable unused) {
            MethodCollector.o(13967);
            return false;
        }
    }

    private static ParcelFileDescriptor b(Uri uri, String str) {
        MethodCollector.i(13963);
        if (uri != null) {
            try {
                ParcelFileDescriptor openFileDescriptor = c.B().getContentResolver().openFileDescriptor(uri, str);
                if (openFileDescriptor != null) {
                    MethodCollector.o(13963);
                    return openFileDescriptor;
                }
                IOException iOException = new IOException("Fail to get ParcelFileDescriptor, fileDescriptor is null");
                MethodCollector.o(13963);
                throw iOException;
            } catch (Exception e2) {
                e2.printStackTrace();
                IOException iOException2 = new IOException("Fail to get ParcelFileDescriptor", e2);
                MethodCollector.o(13963);
                throw iOException2;
            }
        } else {
            IOException iOException3 = new IOException("Fail to get ParcelFileDescriptor, uri is null");
            MethodCollector.o(13963);
            throw iOException3;
        }
    }

    public static FileDescriptor a(Uri uri, String str) {
        ParcelFileDescriptor b2 = b(uri, str);
        if (b2 != null) {
            return b2.getFileDescriptor();
        }
        throw new IOException("Fail to get FileDescriptor, ParcelFileDescriptor is null");
    }
}
