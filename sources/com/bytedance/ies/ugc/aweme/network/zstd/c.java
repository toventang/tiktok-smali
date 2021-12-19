package com.bytedance.ies.ugc.aweme.network.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import h.a;
import h.f.b.l;
import h.m.p;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f35049a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final Keva f35050b = Keva.getRepo("zstd_dict_file_repo");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, byte[]> f35051c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static Map<String, String> f35052d;

    private c() {
    }

    static {
        Covode.recordClassIndex(21031);
    }

    public final synchronized void a(Map<String, String> map) {
        MethodCollector.i(9127);
        f35052d = map;
        MethodCollector.o(9127);
    }

    public final synchronized byte[] a(String str) {
        byte[] bArr;
        MethodCollector.i(8928);
        l.d(str, "");
        Map<String, byte[]> map = f35051c;
        bArr = map.get(str);
        if (bArr == null) {
            File file = new File(f35050b.getString(str, ""));
            if (file.exists()) {
                bArr = a(new FileInputStream(file));
                map.put(str, bArr);
            }
        }
        MethodCollector.o(8928);
        return bArr;
    }

    private static byte[] a(InputStream inputStream) {
        MethodCollector.i(9499);
        l.d(inputStream, "");
        byte[] bArr = new byte[4096];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        l.b(byteArray, "");
                        h.e.c.a(byteArrayOutputStream, null);
                        inputStream.close();
                        MethodCollector.o(9499);
                        return byteArray;
                    }
                }
            } catch (Throwable th) {
                h.e.c.a(byteArrayOutputStream, th);
                MethodCollector.o(9499);
                throw th;
            }
        } catch (IOException e2) {
            MethodCollector.o(9499);
            throw e2;
        } catch (Throwable th2) {
            if (e2 == null) {
                inputStream.close();
            } else {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    a.a(e2, e3);
                }
            }
            MethodCollector.o(9499);
            throw th2;
        }
    }

    public final synchronized String b(String str) {
        String str2;
        MethodCollector.i(8930);
        l.d(str, "");
        Map<String, String> map = f35052d;
        if (map != null) {
            str2 = map.get(str);
        } else {
            str2 = null;
        }
        if (str2 instanceof String) {
            Integer e2 = p.e(str2);
            if (e2 != null) {
                e2.intValue();
                String string = f35050b.getString(str2, null);
                if (string == null || !new File(string).exists()) {
                    MethodCollector.o(8930);
                    return "";
                }
                MethodCollector.o(8930);
                return str2;
            }
            MethodCollector.o(8930);
            return "";
        }
        MethodCollector.o(8930);
        return str2;
    }

    public final synchronized void a(String str, String str2) {
        MethodCollector.i(9315);
        l.d(str, "");
        l.d(str2, "");
        f35050b.storeString(str, str2);
        MethodCollector.o(9315);
    }
}
