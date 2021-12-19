package com.ss.android.ugc.aweme.net.f;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.g.i;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.q;
import com.bytedance.retrofit2.u;
import com.bytedance.ttnet.d.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.common.b.a.a;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.b;
import com.ss.android.common.util.c;
import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.apache.http.client.RedirectHandler;

public class e implements com.ss.android.common.b.a {

    /* renamed from: e  reason: collision with root package name */
    private static Map<String, q> f112314e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    d f112315a;

    /* renamed from: b  reason: collision with root package name */
    d f112316b;

    /* renamed from: c  reason: collision with root package name */
    private final String f112317c = " cronet/1.0.3.2";

    /* renamed from: d  reason: collision with root package name */
    private List<com.bytedance.retrofit2.c.a> f112318d = new ArrayList();

    @Override // com.ss.android.common.b.a
    public final byte[] a(int i2, String str) {
        T t;
        if (m.a(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a2 = i.a(str, linkedHashMap);
        String str2 = (String) a2.second;
        IIESNetworkApi a3 = a((String) a2.first);
        if (a3 != null) {
            u<TypedInput> execute = a3.downloadFile(true, i2, str2, linkedHashMap).execute();
            if (execute.f42629a.a() && (t = execute.f42630b) != null) {
                InputStream in = t.in();
                String a4 = a(execute.f42629a.f42476d, "Content-Length");
                long j2 = -1;
                if (a4 != null) {
                    j2 = Long.parseLong(a4);
                }
                return NetworkUtils.stream2ByteArray(i2, in, j2);
            }
        }
        return null;
    }

    @Override // com.ss.android.common.b.a
    public final boolean a(int i2, final String str, String str2, String str3, String str4, b<String> bVar, String str5, com.ss.android.common.util.e eVar, List<com.ss.android.http.a.b.d> list, String[] strArr, int[] iArr) {
        Throwable th;
        MethodCollector.i(6807);
        if (m.a(str)) {
            MethodCollector.o(6807);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str6 = null;
        try {
            String userAgent = NetworkUtils.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                userAgent = userAgent + " cronet/1.0.3.2";
            }
            arrayList.add(new com.bytedance.retrofit2.client.b("User-Agent", userAgent));
            if (list != null) {
                for (com.ss.android.http.a.b.d dVar : list) {
                    arrayList.add(new com.bytedance.retrofit2.client.b(dVar.f59532a, dVar.f59533b));
                }
            }
            if (eVar == null || !eVar.f59383a) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> a2 = i.a(str, linkedHashMap);
                String str7 = (String) a2.second;
                IIESNetworkApi a3 = a((String) a2.first);
                if (a3 != null) {
                    final com.bytedance.retrofit2.b<TypedInput> downloadFile = a3.downloadFile(true, i2, str7, linkedHashMap, arrayList, this.f112315a);
                    u<TypedInput> execute = downloadFile.execute();
                    if (execute.f42629a.a()) {
                        T t = execute.f42630b;
                        if (t != null) {
                            InputStream in = t.in();
                            List<com.bytedance.retrofit2.client.b> list2 = execute.f42629a.f42476d;
                            long j2 = -1;
                            if (list2 != null && !list2.isEmpty()) {
                                for (com.bytedance.retrofit2.client.b bVar2 : list2) {
                                    if ("Content-Length".equals(bVar2.f42471a)) {
                                        String str8 = bVar2.f42472b;
                                        if (!TextUtils.isEmpty(str8)) {
                                            j2 = Long.parseLong(str8);
                                        }
                                    } else if ("Content-Encoding".equals(bVar2.f42471a)) {
                                        String str9 = bVar2.f42472b;
                                        if (!TextUtils.isEmpty(str9) && "gzip".equalsIgnoreCase(str9)) {
                                            in = new GZIPInputStream(in);
                                        }
                                    } else if ("x-snssdk.remoteaddr".equals(bVar2.f42471a)) {
                                        str6 = bVar2.f42472b;
                                    }
                                }
                            }
                            if (iArr != null) {
                                try {
                                    if (iArr.length > 0) {
                                        iArr[0] = 0;
                                        if (j2 <= 2147483647L) {
                                            iArr[0] = (int) j2;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    a(strArr, str6);
                                    MethodCollector.o(6807);
                                    throw th;
                                }
                            }
                            boolean stream2File = NetworkUtils.stream2File(in, j2, new NetworkUtils.i() {
                                /* class com.ss.android.ugc.aweme.net.f.e.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(72173);
                                }

                                @Override // com.ss.android.common.util.NetworkUtils.i
                                public final void b() {
                                    com.bytedance.retrofit2.b bVar = downloadFile;
                                    if (bVar != null) {
                                        bVar.cancel();
                                    }
                                }

                                @Override // com.ss.android.common.util.NetworkUtils.i
                                public final URI a() {
                                    try {
                                        return new URI(str);
                                    } catch (Exception unused) {
                                        return null;
                                    }
                                }
                            }, i2, str2, str3, str4, bVar, str5, eVar);
                            a(strArr, str6);
                            MethodCollector.o(6807);
                            return stream2File;
                        }
                    } else {
                        com.ss.android.http.a.a.b bVar3 = new com.ss.android.http.a.a.b(execute.f42629a.f42474b, a(execute.f42629a.f42476d, "Reason-Phrase"));
                        MethodCollector.o(6807);
                        throw bVar3;
                    }
                }
                a(strArr, (String) null);
                MethodCollector.o(6807);
                return false;
            }
            a(strArr, (String) null);
            MethodCollector.o(6807);
            return false;
        } catch (Throwable th3) {
            th = th3;
            a(strArr, str6);
            MethodCollector.o(6807);
            throw th;
        }
    }

    @Override // com.ss.android.common.b.a
    public final boolean a(int i2, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, b<String> bVar, String str2, com.ss.android.common.util.e eVar, List<com.ss.android.http.a.b.d> list, String[] strArr, int[] iArr, RedirectHandler redirectHandler) {
        return a(i2, str, stringBuffer.toString(), stringBuffer2.toString(), stringBuffer3.toString(), bVar, str2, eVar, list, strArr, iArr);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, String str, com.ss.android.common.b.a.a aVar, c<Long> cVar, long j2, com.ss.android.common.b.c[] cVarArr) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (a.c cVar2 : aVar.f59348a) {
            if (cVar2 instanceof a.d) {
                multipartTypedOutput.addPart(cVar2.a(), new TypedString((String) cVar2.b()));
            } else if (cVar2 instanceof a.C1293a) {
                a.C1293a aVar2 = (a.C1293a) cVar2;
                multipartTypedOutput.addPart(aVar2.f59349a, new TypedByteArray(null, aVar2.f59350b, aVar2.f59351c));
            } else if (cVar2 instanceof a.b) {
                multipartTypedOutput.addPart(cVar2.a(), new TypedFile(null, (File) cVar2.b()));
            }
        }
        return a(i2, str, (Map<String, String>) null, multipartTypedOutput, (List<com.bytedance.retrofit2.client.b>) null, this.f112315a, cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, boolean z, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (com.ss.android.http.a.b.d dVar : list) {
            hashMap.put(dVar.f59532a, dVar.f59533b);
        }
        if (list2 != null) {
            for (com.ss.android.http.a.a aVar : list2) {
                arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
            }
        }
        return a(i3, str, hashMap, (TypedOutput) null, arrayList, this.f112315a, cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3) {
        return a(i2, i3, str, bArr, str2, str3, (List<com.ss.android.http.a.a>) null);
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Encoding", str2));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", str3));
        }
        if (list != null) {
            for (com.ss.android.http.a.a aVar : list) {
                arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
            }
        }
        return a(i3, str, (Map<String, String>) null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.f112315a, (com.ss.android.common.b.c[]) null);
    }

    static {
        Covode.recordClassIndex(72172);
    }

    public static class a implements com.ss.android.common.b.c {

        /* renamed from: a  reason: collision with root package name */
        com.bytedance.retrofit2.b f112322a;

        static {
            Covode.recordClassIndex(72174);
        }

        public a(com.bytedance.retrofit2.b bVar) {
            this.f112322a = bVar;
        }
    }

    public final e a(com.bytedance.retrofit2.c.a aVar) {
        if (aVar != null) {
            this.f112318d.add(aVar);
        }
        return this;
    }

    private IIESNetworkApi a(String str) {
        if (m.a(str)) {
            return null;
        }
        q qVar = f112314e.get(str);
        if (qVar == null) {
            qVar = RetrofitUtils.a(str, this.f112318d);
            f112314e.put(str, qVar);
        }
        return (IIESNetworkApi) RetrofitUtils.a(qVar, IIESNetworkApi.class);
    }

    private static void a(String[] strArr, String str) {
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable unused) {
            }
        }
    }

    private static String a(List<com.bytedance.retrofit2.client.b> list, String str) {
        if (list == null || TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.bytedance.retrofit2.client.b bVar : list) {
            if (str.equalsIgnoreCase(bVar.f42471a)) {
                return bVar.f42472b;
            }
        }
        return null;
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list) {
        if (m.a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (com.ss.android.http.a.a aVar : list) {
                    String a2 = aVar.a();
                    String b2 = aVar.b();
                    if (a2 != null && a2.length() > 0) {
                        arrayList.add(new com.bytedance.retrofit2.client.b(a2, b2));
                    }
                }
            } catch (Exception e2) {
                NetworkUtils.handleApiError(str, e2, System.currentTimeMillis() - currentTimeMillis, null);
                e2.printStackTrace();
                throw e2;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a3 = i.a(str, linkedHashMap);
        String str2 = (String) a3.second;
        IIESNetworkApi a4 = a((String) a3.first);
        if (a4 == null) {
            return null;
        }
        d dVar = this.f112316b;
        if (dVar != null) {
            dVar.a(str);
        }
        com.bytedance.retrofit2.b<String> doDetete = a4.doDetete(i3, str2, linkedHashMap, arrayList, this.f112315a);
        long currentTimeMillis2 = System.currentTimeMillis();
        u<String> execute = doDetete.execute();
        d dVar2 = this.f112316b;
        if (dVar2 != null) {
            dVar2.b(str);
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        if (NetworkUtils.getCommandListener() != null) {
            String a5 = NetworkUtils.getCommandListener().a();
            if (!m.a(a5)) {
                ArrayList arrayList2 = new ArrayList();
                for (com.bytedance.retrofit2.client.b bVar : execute.f42629a.f42476d) {
                    if (a5.equalsIgnoreCase(bVar.f42471a)) {
                        arrayList2.add(bVar.f42472b);
                    }
                }
                NetworkUtils.getCommandListener().a(arrayList2);
            }
        }
        if (execute.f42629a.a()) {
            T t = execute.f42630b;
            NetworkUtils.handleTimeStampFromResponse(t);
            NetworkUtils.handleApiOk(str, currentTimeMillis3, null);
            return t;
        }
        throw new com.ss.android.http.a.a.b(execute.f42629a.f42474b, a(execute.f42629a.f42476d, "Reason-Phrase"));
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, com.ss.android.common.b.a.a aVar, com.ss.android.common.b.c[] cVarArr) {
        List<com.bytedance.retrofit2.client.b> arrayList = new ArrayList<>();
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (com.ss.android.http.a.b.d dVar : list) {
            multipartTypedOutput.addPart(dVar.f59532a, new TypedString(dVar.f59533b));
        }
        for (a.c cVar : aVar.f59348a) {
            if (cVar instanceof a.d) {
                multipartTypedOutput.addPart(cVar.a(), new TypedString((String) cVar.b()));
            } else if (cVar instanceof a.C1293a) {
                a.C1293a aVar2 = (a.C1293a) cVar;
                multipartTypedOutput.addPart(aVar2.f59349a, new TypedByteArray(null, aVar2.f59350b, aVar2.f59351c));
            } else if (cVar instanceof a.b) {
                multipartTypedOutput.addPart(cVar.a(), new TypedFile(null, (File) cVar.b()));
            }
        }
        return a(i3, str, (Map<String, String>) null, multipartTypedOutput, arrayList, this.f112315a, cVarArr);
    }

    private String a(int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<com.bytedance.retrofit2.client.b> list, Object obj, com.ss.android.common.b.c[] cVarArr) {
        return a(UGCMonitor.TYPE_POST, i2, str, map, typedOutput, list, obj, cVarArr);
    }

    private String b(int i2, String str, Map<String, String> map, TypedOutput typedOutput, List<com.bytedance.retrofit2.client.b> list, Object obj, com.ss.android.common.b.c[] cVarArr) {
        return a("put", i2, str, map, typedOutput, list, obj, cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String b(int i2, int i3, String str, List<com.ss.android.http.a.b.d> list, boolean z, com.ss.android.common.b.c[] cVarArr, List<com.ss.android.http.a.a> list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (com.ss.android.http.a.b.d dVar : list) {
            hashMap.put(dVar.f59532a, dVar.f59533b);
        }
        if (list2 != null) {
            for (com.ss.android.http.a.a aVar : list2) {
                arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
            }
        }
        return b(i3, str, hashMap, (TypedOutput) null, arrayList, this.f112315a, cVarArr);
    }

    @Override // com.ss.android.common.b.a
    public final String b(int i2, int i3, String str, byte[] bArr, String str2, String str3, List<com.ss.android.http.a.a> list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Encoding", str2));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new com.bytedance.retrofit2.client.b("Content-Type", str3));
        }
        if (list != null) {
            for (com.ss.android.http.a.a aVar : list) {
                arrayList.add(new com.bytedance.retrofit2.client.b(aVar.a(), aVar.b()));
            }
        }
        return b(i3, str, (Map<String, String>) null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.f112315a, (com.ss.android.common.b.c[]) null);
    }

    private String a(String str, int i2, String str2, Map<String, String> map, TypedOutput typedOutput, List<com.bytedance.retrofit2.client.b> list, Object obj, com.ss.android.common.b.c[] cVarArr) {
        com.bytedance.retrofit2.b<String> bVar;
        Map<String, String> map2 = map;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if ("get".equals(str)) {
            throw new RuntimeException("doInternal does not support get");
        } else if (!"delete".equals(str)) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Pair<String, String> a2 = i.a(str2, linkedHashMap);
                String str3 = (String) a2.second;
                IIESNetworkApi a3 = a((String) a2.first);
                if (a3 == null) {
                    return null;
                }
                if (typedOutput == null) {
                    if (map2 == null) {
                        map2 = new HashMap<>();
                    }
                    if ("put".equals(str)) {
                        bVar = a3.doPut(i2, str3, linkedHashMap, map2, list, obj);
                    } else {
                        bVar = a3.doPost(i2, str3, linkedHashMap, map2, list, obj);
                    }
                } else if ("put".equals(str)) {
                    bVar = a3.putBody(i2, str3, linkedHashMap, typedOutput, list, obj);
                } else {
                    bVar = a3.postBody(i2, str3, linkedHashMap, typedOutput, list, obj);
                }
                if (cVarArr != null && cVarArr.length > 0) {
                    cVarArr[0] = new a(bVar);
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                d dVar = this.f112316b;
                if (dVar != null) {
                    dVar.a(str2);
                }
                u<String> execute = bVar.execute();
                d dVar2 = this.f112316b;
                if (dVar2 != null) {
                    dVar2.b(str2);
                }
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                a(execute.f42629a.f42476d, "X-TT-LOGID");
                if (NetworkUtils.getCommandListener() != null) {
                    String a4 = NetworkUtils.getCommandListener().a();
                    if (!m.a(a4)) {
                        ArrayList arrayList = new ArrayList();
                        for (com.bytedance.retrofit2.client.b bVar2 : execute.f42629a.f42476d) {
                            if (a4.equalsIgnoreCase(bVar2.f42471a)) {
                                arrayList.add(bVar2.f42472b);
                            }
                        }
                        NetworkUtils.getCommandListener().a(arrayList);
                    }
                }
                if (execute.f42629a.a()) {
                    T t = execute.f42630b;
                    NetworkUtils.handleTimeStampFromResponse(t);
                    NetworkUtils.handleApiOk(str2, currentTimeMillis3, null);
                    return t;
                }
                throw new com.ss.android.http.a.a.b(execute.f42629a.f42474b, a(execute.f42629a.f42476d, "Reason-Phrase"));
            } catch (Exception e2) {
                NetworkUtils.handleApiError(str2, e2, System.currentTimeMillis() - currentTimeMillis, null);
                e2.printStackTrace();
                throw e2;
            }
        } else {
            throw new RuntimeException("doInternal temporary does not support delete ");
        }
    }

    @Override // com.ss.android.common.b.a
    public final String a(int i2, int i3, String str, List<com.ss.android.http.a.a> list, boolean z, boolean z2, com.ss.android.http.a.b.e eVar, boolean z3) {
        if (m.a(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (com.ss.android.http.a.a aVar : list) {
                    String a2 = aVar.a();
                    String b2 = aVar.b();
                    if (a2 != null && a2.length() > 0) {
                        arrayList.add(new com.bytedance.retrofit2.client.b(a2, b2));
                    }
                }
            } catch (Exception e2) {
                NetworkUtils.handleApiError(str, e2, System.currentTimeMillis() - currentTimeMillis, null);
                e2.printStackTrace();
                throw e2;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> a3 = i.a(str, linkedHashMap);
        String str2 = (String) a3.second;
        IIESNetworkApi a4 = a((String) a3.first);
        if (a4 == null) {
            return null;
        }
        d dVar = this.f112316b;
        if (dVar != null) {
            dVar.a(str);
        }
        com.bytedance.retrofit2.b<String> doGet = a4.doGet(true, i3, str2, linkedHashMap, arrayList, this.f112315a);
        long currentTimeMillis2 = System.currentTimeMillis();
        u<String> execute = doGet.execute();
        d dVar2 = this.f112316b;
        if (dVar2 != null) {
            dVar2.b(str);
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        a(execute.f42629a.f42476d, "X-TT-LOGID");
        if (NetworkUtils.getCommandListener() != null) {
            String a5 = NetworkUtils.getCommandListener().a();
            if (!m.a(a5)) {
                ArrayList arrayList2 = new ArrayList();
                for (com.bytedance.retrofit2.client.b bVar : execute.f42629a.f42476d) {
                    if (a5.equalsIgnoreCase(bVar.f42471a)) {
                        arrayList2.add(bVar.f42472b);
                    }
                }
                NetworkUtils.getCommandListener().a(arrayList2);
            }
        }
        if (eVar != null) {
            for (com.bytedance.retrofit2.client.b bVar2 : execute.f42629a.f42476d) {
                String str3 = bVar2.f42471a;
                if ("ETag".equalsIgnoreCase(str3) || "Last-Modified".equalsIgnoreCase(str3) || "Cache-Control".equalsIgnoreCase(str3) || "X-SS-SIGN".equalsIgnoreCase(str3) || "X-TT-LOGID".equalsIgnoreCase(str3)) {
                    eVar.a(new com.ss.android.http.a.b.a(str3, bVar2.f42472b));
                }
            }
        }
        if (execute.f42629a.a()) {
            T t = execute.f42630b;
            NetworkUtils.handleTimeStampFromResponse(t);
            NetworkUtils.handleApiOk(str, currentTimeMillis3, null);
            return t;
        }
        throw new com.ss.android.http.a.a.b(execute.f42629a.f42474b, a(execute.f42629a.f42476d, "Reason-Phrase"));
    }
}
