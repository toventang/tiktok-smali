package com.ss.ugc.live.sdk.msg.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(102819);
    }

    public static byte[] a(Map<String, String> map) {
        MethodCollector.i(1547);
        if (map == null || map.isEmpty()) {
            byte[] bArr = new byte[0];
            MethodCollector.o(1547);
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!(str == null || str2 == null)) {
                if (byteArrayOutputStream.size() > 0) {
                    byteArrayOutputStream.write(38);
                }
                try {
                    String encode = URLEncoder.encode(str, "UTF-8");
                    String encode2 = URLEncoder.encode(str2, "UTF-8");
                    byteArrayOutputStream.write(encode.getBytes("UTF-8"));
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(encode2.getBytes("UTF-8"));
                } catch (IOException e2) {
                    RuntimeException runtimeException = new RuntimeException(e2);
                    MethodCollector.o(1547);
                    throw runtimeException;
                }
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.o(1547);
        return byteArray;
    }
}
