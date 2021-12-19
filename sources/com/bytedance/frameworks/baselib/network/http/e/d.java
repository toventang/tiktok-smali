package com.bytedance.frameworks.baselib.network.http.e;

import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.g.b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.s;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f29343a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static volatile int f29344b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final String f29345c = d.class.getSimpleName();

    private static boolean a(int i2) {
        return i2 >= 4096 && i2 <= 5242880;
    }

    public static byte[] a(boolean z, Map<String, List<String>> map, InputStream inputStream, int[] iArr, f fVar) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] a2 = a(z, map, -1, inputStream, iArr, null);
            if (a2 == null || iArr[0] <= 0) {
                return null;
            }
            return a2;
        } catch (Exception e2) {
            fVar.a();
        } catch (Throwable unused) {
        }
        throw e2;
    }

    static {
        Covode.recordClassIndex(17114);
    }

    public static void a(Closeable closeable) {
        b(closeable);
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
                Logger.debug();
            }
        }
    }

    public static void a(SharedPreferences sharedPreferences) {
        f29343a = sharedPreferences.getInt("read_response_buff_init_size", 0);
        f29344b = sharedPreferences.getInt("read_response_buff_increase_size", 0);
    }

    private static boolean a(File file) {
        MethodCollector.i(2298);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(2298);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2298);
        return delete;
    }

    public static boolean a(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf("application/octet-stream")) >= 0 && str.indexOf("ssmix=", indexOf + 24) > 0) {
            return true;
        }
        return false;
    }

    public static void a(byte[] bArr, int i2) {
        if (bArr != null && i2 > 0) {
            byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
            int i3 = 0;
            do {
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i3 % 4]);
                i3++;
            } while (i3 < i2);
        }
    }

    public static InputStream a(InputStream inputStream, Map<String, List<String>> map, boolean z, s sVar) {
        MethodCollector.i(2304);
        if (z) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
            MethodCollector.o(2304);
            return gZIPInputStream;
        }
        e.j jVar = com.bytedance.frameworks.baselib.network.http.e.f29331c;
        if (jVar == null) {
            MethodCollector.o(2304);
            return inputStream;
        }
        InputStream a2 = jVar.a(inputStream, map, sVar);
        MethodCollector.o(2304);
        return a2;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00eb A[SYNTHETIC, Splitter:B:74:0x00eb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.InputStream r15, long r16, com.bytedance.frameworks.baselib.network.http.f r18, java.lang.String r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.e.d.a(java.io.InputStream, long, com.bytedance.frameworks.baselib.network.http.f, java.lang.String, java.lang.String):boolean");
    }

    public static byte[] a(boolean z, Map<String, List<String>> map, int i2, InputStream inputStream, int[] iArr, s sVar) {
        int length;
        MethodCollector.i(2302);
        if (i2 <= 0) {
            i2 = 5242880;
        }
        if (i2 < 1048576) {
            i2 = 1048576;
        }
        if (inputStream == null) {
            MethodCollector.o(2302);
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            inputStream = a(inputStream, map, z, sVar);
            int i3 = 32768;
            if (a(f29343a)) {
                i3 = f29343a;
            }
            int i4 = 102400;
            if (a(f29344b)) {
                i4 = f29344b;
            }
            byte[] bArr = new byte[i3];
            int i5 = 0;
            while (true) {
                try {
                    if (i5 + 4096 > bArr.length) {
                        if (bArr.length < i4) {
                            length = bArr.length + i4;
                        } else {
                            length = bArr.length * 2;
                        }
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, 0, bArr2, 0, i5);
                        bArr = bArr2;
                    }
                    int read = inputStream.read(bArr, i5, bArr.length - i5);
                    if (read <= 0) {
                        break;
                    }
                    i5 += read;
                    if (i5 > i2) {
                        b bVar = new b(i2, (long) i5);
                        MethodCollector.o(2302);
                        throw bVar;
                    }
                } catch (EOFException e2) {
                    if (!z || i5 <= 0) {
                        MethodCollector.o(2302);
                        throw e2;
                    }
                } catch (IOException e3) {
                    String message = e3.getMessage();
                    if (!z || i5 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                        MethodCollector.o(2302);
                        throw e3;
                    }
                } catch (OutOfMemoryError unused) {
                    b(inputStream);
                    MethodCollector.o(2302);
                    return null;
                }
            }
            if (i5 > 0) {
                if (sVar != null) {
                    sVar.M.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    sVar.M.put("streamReadByteCount", Long.valueOf((long) i5));
                }
                iArr[0] = i5;
                return bArr;
            }
            b(inputStream);
            MethodCollector.o(2302);
            return null;
        } finally {
            b(inputStream);
            MethodCollector.o(2302);
        }
    }
}
