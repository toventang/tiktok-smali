package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;

public class w1 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f159562a = ((String) h.a(16777217, 0, 0, "93d4b2", new byte[]{38, 53}));

    static {
        MethodCollector.i(8663);
        Covode.recordClassIndex(105969);
        h.a(16777217, 0, 0, "3cc882", new byte[]{25, 61, 81, 18, 58});
        MethodCollector.o(8663);
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int read;
        MethodCollector.i(8631);
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
                h.a(16777217, 0, 0, "50f0b0", new byte[]{33, 59, 22});
            }
        } while (read >= 4096);
        String sb2 = sb.toString();
        MethodCollector.o(8631);
        return sb2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x00ed */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf A[SYNTHETIC, Splitter:B:38:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7 A[SYNTHETIC, Splitter:B:43:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100 A[SYNTHETIC, Splitter:B:57:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0118 A[SYNTHETIC, Splitter:B:62:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0130  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.w1.a(java.lang.String):java.lang.String");
    }

    public static synchronized String a(Context context) {
        String str;
        String a2;
        synchronized (w1.class) {
            MethodCollector.i(8659);
            try {
                StringBuilder sb = new StringBuilder();
                if (d.f107195c == null || !d.f107197e) {
                    d.f107195c = context.getFilesDir();
                }
                StringBuilder append = sb.append(d.f107195c.getAbsolutePath()).append((String) h.a(16777217, 0, 0, "9d7614", new byte[]{103}));
                String str2 = f159562a;
                String sb2 = append.append(str2).toString();
                if (!new File(sb2).exists() || (a2 = a(sb2)) == null || a2.length() <= 0) {
                    InputStream open = context.getResources().getAssets().open(str2);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = open.read(bArr, 0, 4096);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(sb2);
                    fileOutputStream.write(byteArrayOutputStream.toByteArray());
                    fileOutputStream.close();
                    a(((String) h.a(16777217, 0, 0, "6a9c34", new byte[]{36, 107, 71, 24, 8, 99, 98, 23, 63, 115})) + sb2);
                    str = a(sb2);
                    if (str == null || str.length() == 0) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(sb2, (String) h.a(16777217, 0, 0, "3cfe12", new byte[]{48, 118}));
                        randomAccessFile.seek(16);
                        randomAccessFile.write(new byte[]{2});
                        randomAccessFile.close();
                        str = a(sb2);
                    }
                    if (str == null || str.length() == 0) {
                        str = (String) h.a(16777217, 0, 0, "c274b7", new byte[]{34, 11, 24, 1, 3, 29, 69, 33, 84, 75, 64, 11, 24, 1, 3, 29});
                    }
                    MethodCollector.o(8659);
                    return str;
                }
                MethodCollector.o(8659);
                return a2;
            } catch (Throwable unused) {
                str = (String) h.a(16777217, 0, 0, "3055d6", new byte[]{114, 9, 26, 0, 5, 28, 21, 41, 71, 64, 18, 6, 111, 110, 117, 26, 108, 80, 58, 88});
            }
        }
    }
}
