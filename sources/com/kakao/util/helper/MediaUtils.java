package com.kakao.util.helper;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MediaUtils {
    private static final String[] IMAGE_FILE_COLUMNS = {"_data", "orientation"};

    static {
        Covode.recordClassIndex(34483);
    }

    public static void closeQuietly(InputStream inputStream) {
        closeQuietly((Closeable) inputStream);
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Context com_kakao_util_helper_MediaUtils_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            return a.f107166a;
        }
        return applicationContext;
    }

    private static int copy(InputStream inputStream, OutputStream outputStream) {
        long copyLarge = copyLarge(inputStream, outputStream);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    private static long copyLarge(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.i(12856);
        byte[] bArr = new byte[4096];
        long j2 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
            } else {
                MethodCollector.o(12856);
                return j2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getImageFilePathFromUri(android.net.Uri r12, android.content.Context r13) {
        /*
        // Method dump skipped, instructions count: 252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kakao.util.helper.MediaUtils.getImageFilePathFromUri(android.net.Uri, android.content.Context):java.lang.String");
    }
}
