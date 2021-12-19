package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public final class l {
    static {
        Covode.recordClassIndex(806);
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static ByteBuffer a(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                return map;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File a(Context context) {
        if (d.f107194b == null || !d.f107197e) {
            d.f107194b = context.getCacheDir();
        }
        File file = d.f107194b;
        if (file == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file2 = new File(file, str + i2);
            try {
                if (file2.createNewFile()) {
                    return file2;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    private static boolean b(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public static boolean a(File file, InputStream inputStream) {
        Throwable th;
        IOException e2;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        a(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e3) {
                e2 = e3;
                fileOutputStream = fileOutputStream2;
                try {
                    e2.getMessage();
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                a(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e4) {
            e2 = e4;
            e2.getMessage();
            a(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static ByteBuffer a(Context context, Resources resources, int i2) {
        File a2 = a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!a(a2, resources, i2)) {
                return null;
            }
            ByteBuffer a3 = a(a2);
            b(a2);
            return a3;
        } finally {
            b(a2);
        }
    }

    public static ByteBuffer a(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean a(File file, Resources resources, int i2) {
        InputStream inputStream;
        Throwable th;
        try {
            inputStream = resources.openRawResource(i2);
            try {
                boolean a2 = a(file, inputStream);
                a(inputStream);
                return a2;
            } catch (Throwable th2) {
                th = th2;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            a(inputStream);
            throw th;
        }
    }
}
