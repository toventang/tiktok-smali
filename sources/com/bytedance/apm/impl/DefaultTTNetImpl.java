package com.bytedance.apm.impl;

import com.bytedance.apm.q.d;
import com.bytedance.apm.q.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.u;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.c;
import com.bytedance.ttnet.utils.RetrofitUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultTTNetImpl implements IHttpService {
    static {
        Covode.recordClassIndex(14607);
    }

    public static byte[] toByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private List<b> convertHeaderMap(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null) {
                    arrayList.add(new b(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c doGet(String str, Map<String, String> map) {
        u<TypedInput> execute = ((RetrofitMonitorService) RetrofitUtils.a(str, RetrofitMonitorService.class)).fetch(str, map, false).execute();
        return new c(execute.f42629a.f42474b, toByteArray(execute.f42630b.in()));
    }

    private c doUploadFiles(String str, List<File> list, Map<String, String> map) {
        return d.a(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c uploadFiles(String str, List<File> list, Map<String, String> map) {
        return doUploadFiles(str, list, map);
    }

    @Override // com.bytedance.services.apm.api.IHttpService
    public c doPost(String str, byte[] bArr, Map<String, String> map) {
        int i2 = 0;
        com.bytedance.retrofit2.b<TypedInput> report = ((RetrofitMonitorService) RetrofitUtils.a(str, RetrofitMonitorService.class)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), convertHeaderMap(map), false);
        HashMap hashMap = new HashMap();
        byte[] bArr2 = null;
        try {
            u<TypedInput> execute = report.execute();
            bArr2 = toByteArray(execute.f42630b.in());
            List<b> list = execute.f42629a.f42476d;
            if (!h.a(list)) {
                for (b bVar : list) {
                    hashMap.put(bVar.f42471a, bVar.f42472b);
                }
            }
            i2 = execute.f42629a.f42474b;
        } catch (Throwable th) {
            try {
                if (th instanceof com.bytedance.frameworks.baselib.network.http.b.c) {
                    i2 = th.getStatusCode();
                }
                if (th instanceof com.bytedance.frameworks.baselib.network.http.cronet.b.c) {
                    i2 = ((com.bytedance.frameworks.baselib.network.http.cronet.b.c) th).getStatusCode();
                }
            } catch (Exception unused) {
            }
        }
        return new c(i2, hashMap, bArr2);
    }
}
