package com.bytedance.globalpayment.payment.common.lib.j;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

public final class a {
    static {
        Covode.recordClassIndex(17750);
    }

    public static String a(Context context, String str) {
        MethodCollector.i(4022);
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(str);
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder("");
            while (true) {
                int read = open.read(bArr);
                if (read <= 0) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            String sb2 = sb.toString();
            try {
                open.close();
            } catch (Throwable unused) {
            }
            MethodCollector.o(4022);
            return sb2;
        } catch (IOException e2) {
            e2.printStackTrace();
            if (0 != 0) {
                inputStream.close();
            }
        } catch (Throwable unused2) {
        }
        MethodCollector.o(4022);
        return "";
    }
}
