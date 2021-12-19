package net.openid.appauth;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* access modifiers changed from: package-private */
public final class t {
    static {
        Covode.recordClassIndex(106108);
    }

    public static void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String a(InputStream inputStream) {
        MethodCollector.i(10718);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                String sb2 = sb.toString();
                MethodCollector.o(10718);
                return sb2;
            }
        }
    }
}
