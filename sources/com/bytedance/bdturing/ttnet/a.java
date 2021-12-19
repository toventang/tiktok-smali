package com.bytedance.bdturing.ttnet;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(15594);
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("x-vc-bdturing-sdk-version", "2.2.1.i18n");
        RetrofitUtils.a(new TTNetUtil$2(hashMap));
    }

    private static INetworkApi a(String str) {
        return (INetworkApi) RetrofitUtils.b(str).a(INetworkApi.class);
    }

    private static List<b> a(Map<String, String> map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (String str : map.keySet()) {
                linkedList.add(new b(str, map.get(str)));
            }
        }
        return linkedList;
    }

    private static byte[] a(InputStream inputStream) {
        MethodCollector.i(12672);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                MethodCollector.o(12672);
                return byteArray;
            }
        }
    }

    public static byte[] a(String str, Map<String, String> map) {
        try {
            u<TypedInput> execute = a(str).doGet(true, str, null, a(map)).execute();
            if (execute.f42629a.f42474b == 200) {
                return a(execute.f42630b.in());
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }

    public static byte[] a(String str, final byte[] bArr, Map<String, String> map) {
        try {
            u<TypedInput> execute = a(str).doPost(str, null, new TypedOutput() {
                /* class com.bytedance.bdturing.ttnet.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(15595);
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String fileName() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String md5Stub() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final String mimeType() {
                    return null;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final long length() {
                    return (long) bArr.length;
                }

                @Override // com.bytedance.retrofit2.mime.TypedOutput
                public final void writeTo(OutputStream outputStream) {
                    MethodCollector.i(10382);
                    outputStream.write(bArr);
                    MethodCollector.o(10382);
                }
            }, a(map)).execute();
            if (execute.f42629a.f42474b == 200) {
                return a(execute.f42630b.in());
            }
        } catch (Exception unused) {
        }
        return new byte[0];
    }
}
